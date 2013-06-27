package fr.unice.i3s.sigma.examples.uml.support

import fr.unice.i3s.sigma.support.EMFProxyBuilder;
import fr.unice.i3s.sigma.support.EMFScalaSupport;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;

import org.eclipse.uml2.uml.ActivityEdge;
import org.eclipse.uml2.uml.ActivityNode;
import org.eclipse.uml2.uml.ActivityPartition;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.InterruptibleActivityRegion;
import org.eclipse.uml2.uml.JoinNode;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.ValueSpecification;
import org.eclipse.uml2.uml.VisibilityKind;

trait JoinNodeScalaSupport extends EMFScalaSupport {
  type JoinNode = org.eclipse.uml2.uml.JoinNode
  
  protected implicit val _joinnodeProxyBuilder = new EMFProxyBuilder[JoinNode](UMLPackageScalaSupport._umlBuilder)
  
  object JoinNode {
    def apply(eAnnotations: EList[EAnnotation] = null, ownedComment: EList[Comment] = null, clientDependency: EList[Dependency] = null, name: String = null, nameExpression: StringExpression = null, visibility: VisibilityKind = VisibilityKind.PUBLIC_LITERAL, isLeaf: Boolean = false, inPartition: EList[ActivityPartition] = null, inInterruptibleRegion: EList[InterruptibleActivityRegion] = null, outgoing: EList[ActivityEdge] = null, incoming: EList[ActivityEdge] = null, redefinedNode: EList[ActivityNode] = null, isCombineDuplicate: Boolean = true, joinSpec: ValueSpecification = null): JoinNode = {
      val _instance = UMLPackageScalaSupport._umlBuilder.create[JoinNode]
      
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
      if (isCombineDuplicate != true) _instance.setIsCombineDuplicate(isCombineDuplicate)
      if (joinSpec != null) _instance.setJoinSpec(joinSpec)
      
      _instance
    }
  }
  
  implicit class JoinNodeScalaSupport(that: JoinNode) {
    def isCombineDuplicate: Boolean = that.isCombineDuplicate
    def isCombineDuplicate_=(value: Boolean): Unit = that.setIsCombineDuplicate(value)
    def joinSpec: ValueSpecification = that.getJoinSpec
    def joinSpec_=(value: ValueSpecification): Unit = that.setJoinSpec(value)
  }
}

object JoinNodeScalaSupport extends JoinNodeScalaSupport
