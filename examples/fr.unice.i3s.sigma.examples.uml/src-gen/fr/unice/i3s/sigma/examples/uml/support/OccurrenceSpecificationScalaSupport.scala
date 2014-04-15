package fr.unice.i3s.sigma.examples.uml.support

import fr.unice.i3s.sigma.support.EMFProxyBuilder;
import fr.unice.i3s.sigma.support.EMFScalaSupport;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;

import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.GeneralOrdering;
import org.eclipse.uml2.uml.Lifeline;
import org.eclipse.uml2.uml.OccurrenceSpecification;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.VisibilityKind;

trait OccurrenceSpecificationScalaSupport extends EMFScalaSupport {
  type OccurrenceSpecification = org.eclipse.uml2.uml.OccurrenceSpecification
  
  protected implicit val _occurrencespecificationProxyBuilder = new EMFProxyBuilder[OccurrenceSpecification](UMLPackageScalaSupport._umlBuilder)
  
  object OccurrenceSpecification {
    def apply(eAnnotations: EList[EAnnotation] = null, ownedComment: EList[Comment] = null, clientDependency: EList[Dependency] = null, name: String = null, nameExpression: StringExpression = null, visibility: VisibilityKind = VisibilityKind.PUBLIC_LITERAL, covered: EList[Lifeline] = null, generalOrdering: EList[GeneralOrdering] = null, toAfter: EList[GeneralOrdering] = null, toBefore: EList[GeneralOrdering] = null): OccurrenceSpecification = {
      val _instance = UMLPackageScalaSupport._umlBuilder.create[OccurrenceSpecification]
      
      if (eAnnotations != null) _instance.getEAnnotations.addAll(eAnnotations)
      if (ownedComment != null) _instance.getOwnedComments.addAll(ownedComment)
      if (clientDependency != null) _instance.getClientDependencies.addAll(clientDependency)
      if (name != null) _instance.setName(name)
      if (nameExpression != null) _instance.setNameExpression(nameExpression)
      if (visibility != VisibilityKind.PUBLIC_LITERAL) _instance.setVisibility(visibility)
      if (covered != null) _instance.getCovereds.addAll(covered)
      if (generalOrdering != null) _instance.getGeneralOrderings.addAll(generalOrdering)
      if (toAfter != null) _instance.getToAfters.addAll(toAfter)
      if (toBefore != null) _instance.getToBefores.addAll(toBefore)
      
      _instance
    }
  }
  
  implicit class OccurrenceSpecificationScalaSupport(that: OccurrenceSpecification) {
    def toAfter: EList[GeneralOrdering] = that.getToAfters
    def toBefore: EList[GeneralOrdering] = that.getToBefores
  }
}

object OccurrenceSpecificationScalaSupport extends OccurrenceSpecificationScalaSupport