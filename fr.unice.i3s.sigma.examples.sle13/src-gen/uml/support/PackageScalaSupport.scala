package uml.support

import org.eclipse.emf.common.util.EList;

import uml.Classifier;
import uml.Stereotype;

trait PackageScalaSupport {
  type UmlPackage = uml.Package
  
  object UmlPackage {
    def apply(name: String = null, stereotypes: EList[Stereotype] = null, ownedElements: EList[Classifier] = null): UmlPackage = {
      val instance = UmlPackageScalaSupport.builder.create[UmlPackage]
      
      if (name != null) instance.setName(name)
      if (stereotypes != null) instance.getStereotypes.addAll(stereotypes)
      if (ownedElements != null) instance.getOwnedElements.addAll(ownedElements)
      
      instance
    }
    
    def unapply(that: UmlPackage): Option[(String,EList[Stereotype],EList[Classifier])] =
      Some((that.getName,that.getStereotypes,that.getOwnedElements))
  }
  
  implicit class PackageScalaSupport(that: uml.Package) {
    def ownedElements: EList[Classifier] = that.getOwnedElements
  }
}

object PackageScalaSupport extends PackageScalaSupport