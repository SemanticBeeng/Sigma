package fr.unice.i3s.sigma.examples.uml.support

import fr.unice.i3s.sigma.support.EMFProxyBuilder;
import fr.unice.i3s.sigma.support.EMFScalaSupport;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;

import org.eclipse.uml2.uml.ActivityEdge;
import org.eclipse.uml2.uml.ActivityNode;
import org.eclipse.uml2.uml.ActivityPartition;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.ExceptionHandler;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.InterruptibleActivityRegion;
import org.eclipse.uml2.uml.RemoveVariableValueAction;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.Variable;
import org.eclipse.uml2.uml.VisibilityKind;

trait RemoveVariableValueActionScalaSupport extends EMFScalaSupport {
  type RemoveVariableValueAction = org.eclipse.uml2.uml.RemoveVariableValueAction
  
  protected implicit val _removevariablevalueactionProxyBuilder = new EMFProxyBuilder[RemoveVariableValueAction](UMLPackageScalaSupport._umlBuilder)
  
  object RemoveVariableValueAction {
    def apply(eAnnotations: EList[EAnnotation] = null, ownedComment: EList[Comment] = null, clientDependency: EList[Dependency] = null, name: String = null, nameExpression: StringExpression = null, visibility: VisibilityKind = VisibilityKind.PUBLIC_LITERAL, isLeaf: Boolean = false, inPartition: EList[ActivityPartition] = null, inInterruptibleRegion: EList[InterruptibleActivityRegion] = null, outgoing: EList[ActivityEdge] = null, incoming: EList[ActivityEdge] = null, redefinedNode: EList[ActivityNode] = null, handler: EList[ExceptionHandler] = null, isLocallyReentrant: Boolean = false, localPostcondition: EList[Constraint] = null, localPrecondition: EList[Constraint] = null, variable: Variable = null, value: InputPin = null, isRemoveDuplicates: Boolean = false, removeAt: InputPin = null): RemoveVariableValueAction = {
      val _instance = UMLPackageScalaSupport._umlBuilder.create[RemoveVariableValueAction]
      
      if (eAnnotations != null) _instance.getEAnnotations.addAll(eAnnotations)
      if (ownedComment != null) _instance.getOwnedComments.addAll(ownedComment)
      if (clientDependency != null) _instance.getClientDependencies.addAll(clientDependency)
      if (name != null) _instance.setName(name)
      if (nameExpression != null) _instance.setNameExpression(nameExpression)
      if (visibility != VisibilityKind.PUBLIC_LITERAL) _instance.setVisibility(visibility)
      if (isLeaf != false) _instance.setIsLeaf(isLeaf)
      if (inPartition != null) _instance.getInPartitions.addAll(inPartition)
      if (inInterruptibleRegion != null) _instance.getInInterruptibleRegions.addAll(inInterruptibleRegion)
      if (outgoing != null) _instance.getOutgoings.addAll(outgoing)
      if (incoming != null) _instance.getIncomings.addAll(incoming)
      if (redefinedNode != null) _instance.getRedefinedNodes.addAll(redefinedNode)
      if (handler != null) _instance.getHandlers.addAll(handler)
      if (isLocallyReentrant != false) _instance.setIsLocallyReentrant(isLocallyReentrant)
      if (localPostcondition != null) _instance.getLocalPostconditions.addAll(localPostcondition)
      if (localPrecondition != null) _instance.getLocalPreconditions.addAll(localPrecondition)
      if (variable != null) _instance.setVariable(variable)
      if (value != null) _instance.setValue(value)
      if (isRemoveDuplicates != false) _instance.setIsRemoveDuplicates(isRemoveDuplicates)
      if (removeAt != null) _instance.setRemoveAt(removeAt)
      
      _instance
    }
  }
  
  implicit class RemoveVariableValueActionScalaSupport(that: RemoveVariableValueAction) {
    def isRemoveDuplicates: Boolean = that.isRemoveDuplicates
    def isRemoveDuplicates_=(value: Boolean): Unit = that.setIsRemoveDuplicates(value)
    def removeAt: InputPin = that.getRemoveAt
    def removeAt_=(value: InputPin): Unit = that.setRemoveAt(value)
  }
}

object RemoveVariableValueActionScalaSupport extends RemoveVariableValueActionScalaSupport