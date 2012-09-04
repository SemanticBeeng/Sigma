/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package library;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link library.Member#getName <em>Name</em>}</li>
 *   <li>{@link library.Member#getLibrary <em>Library</em>}</li>
 *   <li>{@link library.Member#getLoans <em>Loans</em>}</li>
 *   <li>{@link library.Member#getBooks <em>Books</em>}</li>
 * </ul>
 * </p>
 *
 * @see library.LibraryPackage#getMember()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='AtMostTwoLoans UniqueLoans'"
 *        annotation="http://www.i3s.unice.fr/Sigma AtMostTwoLoans='' UniqueLoans='' delegate='library.delegate.MemberDelegate'"
 * @generated
 */
public interface Member extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see library.LibraryPackage#getMember_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link library.Member#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Library</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Library</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Library</em>' reference.
	 * @see #setLibrary(Library)
	 * @see library.LibraryPackage#getMember_Library()
	 * @model required="true" transient="true" derived="true" ordered="false"
	 * @generated
	 */
	Library getLibrary();

	/**
	 * Sets the value of the '{@link library.Member#getLibrary <em>Library</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Library</em>' reference.
	 * @see #getLibrary()
	 * @generated
	 */
	void setLibrary(Library value);

	/**
	 * Returns the value of the '<em><b>Loans</b></em>' reference list.
	 * The list contents are of type {@link library.Loan}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loans</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loans</em>' reference list.
	 * @see library.LibraryPackage#getMember_Loans()
	 * @model volatile="true" ordered="false"
	 * @generated
	 */
	EList<Loan> getLoans();

	/**
	 * Returns the value of the '<em><b>Books</b></em>' reference list.
	 * The list contents are of type {@link library.Book}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Books</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Books</em>' reference list.
	 * @see library.LibraryPackage#getMember_Books()
	 * @model volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<Book> getBooks();

} // Member