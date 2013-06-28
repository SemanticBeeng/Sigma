package fr.unice.i3s.sigma.examples.uml.support

import fr.unice.i3s.sigma.support.EMFProxyBuilder;
import fr.unice.i3s.sigma.support.EMFScalaSupport;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;

import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.BehavioralFeature;
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
import org.eclipse.uml2.uml.Pseudostate;
import org.eclipse.uml2.uml.Reception;
import org.eclipse.uml2.uml.Region;
import org.eclipse.uml2.uml.State;
import org.eclipse.uml2.uml.StateMachine;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.Substitution;
import org.eclipse.uml2.uml.TemplateBinding;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.UseCase;
import org.eclipse.uml2.uml.VisibilityKind;

trait StateMachineScalaSupport extends EMFScalaSupport {
  type StateMachine = org.eclipse.uml2.uml.StateMachine
  
  protected implicit val _statemachineProxyBuilder = new EMFProxyBuilder[StateMachine](UMLPackageScalaSupport._umlBuilder)
  
  object StateMachine {
    def apply(): StateMachine = {
      UMLPackageScalaSupport._umlBuilder.create[StateMachine]
    }
  }
  
  implicit class StateMachineScalaSupport(that: StateMachine) {
    def connectionPoint: EList[Pseudostate] = that.getConnectionPoints
    def submachineState: EList[State] = that.getSubmachineStates
    def region: EList[Region] = that.getRegions
    def extendedStateMachine: EList[StateMachine] = that.getExtendedStateMachines
  }
}

object StateMachineScalaSupport extends StateMachineScalaSupport