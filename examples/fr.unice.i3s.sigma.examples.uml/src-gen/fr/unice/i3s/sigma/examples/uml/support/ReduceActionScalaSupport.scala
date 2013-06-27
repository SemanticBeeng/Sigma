package fr.unice.i3s.sigma.examples.uml.support

import fr.unice.i3s.sigma.support.EMFProxyBuilder;
import fr.unice.i3s.sigma.support.EMFScalaSupport;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;

import org.eclipse.uml2.uml.ActivityEdge;
import org.eclipse.uml2.uml.ActivityNode;
import org.eclipse.uml2.uml.ActivityPartition;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.ExceptionHandler;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.InterruptibleActivityRegion;
import org.eclipse.uml2.uml.OutputPin;
import org.eclipse.uml2.uml.ReduceAction;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.VisibilityKind;

import scala.Option;

trait ReduceActionScalaSupport extends EMFScalaSupport {
  type ReduceAction = org.eclipse.uml2.uml.ReduceAction
  
  protected implicit val _reduceactionProxyBuilder = new EMFProxyBuilder[ReduceAction](UMLPackageScalaSupport._umlBuilder)
  
  object ReduceAction {
    def apply(eAnnotations: EList[EAnnotation] = null, ownedComment: EList[Comment] = null, clientDependency: EList[Dependency] = null, name: String = null, nameExpression: StringExpression = null, visibility: VisibilityKind = VisibilityKind.PUBLIC_LITERAL, isLeaf: Boolean = false, inPartition: EList[ActivityPartition] = null, inInterruptibleRegion: EList[InterruptibleActivityRegion] = null, outgoing: EList[ActivityEdge] = null, incoming: EList[ActivityEdge] = null, redefinedNode: EList[ActivityNode] = null, handler: EList[ExceptionHandler] = null, isLocallyReentrant: Boolean = false, localPostcondition: EList[Constraint] = null, localPrecondition: EList[Constraint] = null, collection: InputPin = null, isOrdered: Boolean = false, reducer: Behavior = null, result: OutputPin = null): ReduceAction = {
      val _instance = UMLPackageScalaSupport._umlBuilder.create[ReduceAction]
      
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
      if (collection != null) _instance.setCollection(collection)
      if (isOrdered != false) _instance.setIsOrdered(isOrdered)
      if (reducer != null) _instance.setReducer(reducer)
      if (result != null) _instance.setResult(result)
      
      _instance
    }
  }
  
  implicit class ReduceActionScalaSupport(that: ReduceAction) {
    def collection: InputPin = that.getCollection
    def collection_=(value: InputPin): Unit = that.setCollection(value)
    def isOrdered: Boolean = that.isOrdered
    def isOrdered_=(value: Boolean): Unit = that.setIsOrdered(value)
    def reducer: Behavior = that.getReducer
    def reducer_=(value: Behavior): Unit = that.setReducer(value)
    def reducer_=(value: ⇒ Option[Behavior]): Unit =
      that.setReducer(UMLPackageScalaSupport._umlBuilder.ref(value))
    def result: OutputPin = that.getResult
    def result_=(value: OutputPin): Unit = that.setResult(value)
  }
}

object ReduceActionScalaSupport extends ReduceActionScalaSupport
