package oo.support

import fr.unice.i3s.sigma.support.EMFProxyBuilder;
import fr.unice.i3s.sigma.support.EMFScalaSupport;

import oo.Classifier;
import oo.Stereotype;

import org.eclipse.emf.common.util.EList;

trait PackageScalaSupport extends EMFScalaSupport {
  type Package = oo.Package
  
  protected implicit val _packageProxyBuilder = new EMFProxyBuilder[Package](OOPackageScalaSupport._ooBuilder)
  
  object Package {
    def apply(stereotypes: EList[Stereotype] = null, name: String = null, ownedElements: EList[Classifier] = null, ownedStereotypes: EList[Stereotype] = null): Package = {
      val instance = OOPackageScalaSupport._ooBuilder.create[Package]
      
      if (stereotypes != null) instance.getStereotypes.addAll(stereotypes)
      if (name != null) instance.setName(name)
      if (ownedElements != null) instance.getOwnedElements.addAll(ownedElements)
      if (ownedStereotypes != null) instance.getOwnedStereotypes.addAll(ownedStereotypes)
      
      instance
    }
    
    def unapply(that: Package): Option[(EList[Stereotype],String,EList[Classifier],EList[Stereotype])] =
      Some((that.getStereotypes,that.getName,that.getOwnedElements,that.getOwnedStereotypes))
  }
  
  implicit class PackageScalaSupport(that: oo.Package) {
    def ownedElements: EList[Classifier] = that.getOwnedElements
    def ownedStereotypes: EList[Stereotype] = that.getOwnedStereotypes
  }
}

object PackageScalaSupport extends PackageScalaSupport