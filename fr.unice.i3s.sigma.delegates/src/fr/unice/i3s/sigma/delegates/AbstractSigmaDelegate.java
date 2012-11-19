package fr.unice.i3s.sigma.delegates;

import static com.google.common.base.Joiner.on;
import static com.google.common.base.Strings.isNullOrEmpty;
import static com.google.common.collect.Iterables.find;
import static com.google.common.collect.Iterables.transform;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;

import com.google.common.base.Function;
import com.google.common.base.Predicate;

public abstract class AbstractSigmaDelegate<T extends ENamedElement> {

	/**
	 * Maps an {@code EClass} to a {@code Method} delegate.
	 */
	private final Map<EClass, Method> delegates = new HashMap<EClass, Method>();

	protected final SigmaDelegateDomain domain;
	protected final T target;
	protected final String annotationDetailKey;

	public AbstractSigmaDelegate(T target, SigmaDelegateDomain domain,
			String annotationDetailKey) {
		this.target = target;
		this.domain = domain;
		this.annotationDetailKey = annotationDetailKey;
	}

	protected synchronized Method getDelegateChecked(Object targetObject) {
		Method candidate = null;

		EObject targetEObject = null;
		EClass targetEClass = null;

		if (targetObject instanceof EObject) {
			targetEObject = (EObject) targetObject;
			targetEClass = targetEObject.eClass();
		} else {
			// targetObject is an instance of a regular java object
			// because it comes from EDataType
			targetEClass = (EClass) target.eContainer();
		}

		// 1. consult the cache
		candidate = delegates.get(targetEClass);
		if (candidate != null) {
			return candidate;
		}

		// 2. try to find the delegate

		// consult the class hierarchy in case the target object is different
		// from the target class
		if (targetEObject != null && target.eContainer() != targetEClass) {
			Iterable<EClass> hierarchy = getClassHierarchy(targetEClass);

			for (EClass e : hierarchy) {
				String className = getDelegateClassName(e);
				if (className != null) {
					candidate = findDelegateMethod(className);
				}

				if (candidate != null) {
					break;
				}
			}

			if (candidate == null) {
				throw new SigmaDelegateNotFoundException(
						"Unable to find a delegate method for "
								+ target.getName()
								+ " expected: "
								+ getExpectedMethodSignature()
								+ ". Consulted following class hierarchy: "
								+ on(",").join(
										transform(hierarchy,
												new Function<EClass, String>() {
													@Override
													public String apply(
															EClass input) {
														return input.getName();
													}
												})));
			}
		} else {

			String className = getDelegateClassName(targetEClass);
			if (className != null) {
				candidate = findDelegateMethod(className);
			}

			if (candidate == null) {
				throw new SigmaDelegateNotFoundException(
						"Unable to find a delegate method for "
								+ target.getName() + " expected: "
								+ getExpectedMethodSignature());
			}
		}

		delegates.put(targetEClass, candidate);
		return candidate;
	}

	private Collection<EClass> getClassHierarchy(EClass clazz) {
		LinkedHashSet<EClass> hierarchy = new LinkedHashSet<EClass>();
		hierarchy.add(clazz);

		for (EClass c : clazz.getESuperTypes()) {
			hierarchy.addAll(getClassHierarchy(c));
		}

		return hierarchy;
	}

	protected String getDelegateClassName(EClass superType) {
		EAnnotation annotation = superType.getEAnnotation(domain.getURI());
		if (annotation == null) {
			return null;
		}

		// 1. try the associated key that overrides the defaults
		String delegate = annotation.getDetails().get(annotationDetailKey);
		if (!isNullOrEmpty(delegate)) {
			return delegate;
		}

		// 2. try the "delegate" key
		delegate = annotation.getDetails().get(
				SigmaDelegateDomain.DELEGATE_CONSTRAINT_KEY);
		if (!isNullOrEmpty(delegate)) {
			return delegate;
		}

		return null;
	}

	protected Method findDelegateMethod(String delegateClassName) {
		Class<?> clazz = domain.loadDelegateClass(delegateClassName);
		if (clazz == null) {
			return null;
		}

		List<Method> methods = Arrays.asList(clazz.getMethods());
		Method candidate = find(methods, new Predicate<Method>() {
			@Override
			public boolean apply(Method input) {
				// must have a correct name
				if (!input.getName().equals(getDelegateMethodName())) {
					return false;
				}
				// must be static
				if (!Modifier.isStatic(input.getModifiers())) {
					return false;
				}

				// must be public
				if (!Modifier.isPublic(input.getModifiers())) {
					return false;
				}

				return checkDelegateMethod(input);
			}
		}, null);

		return candidate;
	}

	public T getTarget() {
		return target;
	}

	protected abstract String getDelegateMethodName();

	protected abstract boolean checkDelegateMethod(Method input);

	protected abstract String getExpectedMethodSignature();
}