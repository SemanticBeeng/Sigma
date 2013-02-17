package fr.unice.i3s.sigma.scala.utils.ecore

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EModelElement;

trait EModelElementScalaSupport {
  implicit class EModelElementScalaSupport(obj: EModelElement) {
    def eAnnotations: EList[EAnnotation] = obj.getEAnnotations
  }
}

object EModelElementScalaSupport extends EModelElementScalaSupport
