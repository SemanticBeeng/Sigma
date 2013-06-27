package fr.unice.i3s.sigma.examples.uml.support

import fr.unice.i3s.sigma.support.EMFProxyBuilder;
import fr.unice.i3s.sigma.support.EMFScalaSupport;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;

import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.BehavioralFeature;
import org.eclipse.uml2.uml.BehavioredClassifier;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.CollaborationUse;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Connector;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.GeneralizationSet;
import org.eclipse.uml2.uml.InterfaceRealization;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.ParameterSet;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Reception;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.Substitution;
import org.eclipse.uml2.uml.TemplateBinding;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.UseCase;
import org.eclipse.uml2.uml.VisibilityKind;

import scala.Option;

trait BehaviorScalaSupport extends EMFScalaSupport {
  type Behavior = org.eclipse.uml2.uml.Behavior
  
  protected implicit val _behaviorProxyBuilder = new EMFProxyBuilder[Behavior](UMLPackageScalaSupport._umlBuilder)
  
  object Behavior {
    def apply(): Behavior = {
      UMLPackageScalaSupport._umlBuilder.create[Behavior]
    }
  }
  
  implicit class BehaviorScalaSupport(that: Behavior) {
    def context: BehavioredClassifier = that.getContext
    def isReentrant: Boolean = that.isReentrant
    def isReentrant_=(value: Boolean): Unit = that.setIsReentrant(value)
    def ownedParameter: EList[Parameter] = that.getOwnedParameters
    def ownedParameterSet: EList[ParameterSet] = that.getOwnedParameterSets
    def postcondition: EList[Constraint] = that.getPostconditions
    def precondition: EList[Constraint] = that.getPreconditions
    def redefinedBehavior: EList[Behavior] = that.getRedefinedBehaviors
    def specification: BehavioralFeature = that.getSpecification
    def specification_=(value: BehavioralFeature): Unit = that.setSpecification(value)
    def specification_=(value: ⇒ Option[BehavioralFeature]): Unit =
      that.setSpecification(UMLPackageScalaSupport._umlBuilder.ref(value))
  }
}

object BehaviorScalaSupport extends BehaviorScalaSupport
