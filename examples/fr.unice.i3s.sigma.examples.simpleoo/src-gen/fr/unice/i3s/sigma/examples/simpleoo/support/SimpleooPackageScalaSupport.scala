package fr.unice.i3s.sigma.examples.simpleoo.support

import fr.unice.i3s.sigma.examples.simpleoo.Classifier;
import fr.unice.i3s.sigma.examples.simpleoo.Feature;
import fr.unice.i3s.sigma.examples.simpleoo.ModelElement;
import fr.unice.i3s.sigma.examples.simpleoo.Operation;
import fr.unice.i3s.sigma.examples.simpleoo.Property;
import fr.unice.i3s.sigma.examples.simpleoo.ScopeKind;
import fr.unice.i3s.sigma.examples.simpleoo.SimpleooPackage;
import fr.unice.i3s.sigma.examples.simpleoo.Stereotype;

import fr.unice.i3s.sigma.m2m.Transformable;

import fr.unice.i3s.sigma.support.EMFBuilder;
import fr.unice.i3s.sigma.support.EMFScalaSupport;
import fr.unice.i3s.sigma.support.SigmaEcorePackage;

import org.eclipse.emf.common.util.EList;

import scala.Option;


trait SimpleooPackageScalaSupport
  extends EMFScalaSupport {
    
    implicit class ModelElement2Sigma(that: ModelElement) {
      def stereotypes: EList[Stereotype] = that.getStereotypes
      def name: String = that.getName
      def name_=(value: String): Unit = that.setName(value)
    }
    
    implicit class Stereotype2Sigma(that: Stereotype) {
      def name: String = that.getName
      def name_=(value: String): Unit = that.setName(value)
    }
    
    implicit class Package2Sigma(that: fr.unice.i3s.sigma.examples.simpleoo.Package) {
      def ownedElements: EList[Classifier] = that.getOwnedElements
      def ownedStereotypes: EList[Stereotype] = that.getOwnedStereotypes
    }
    
    implicit class Classifier2Sigma(that: Classifier) {
      def pkg: fr.unice.i3s.sigma.examples.simpleoo.Package = that.getPkg
      def pkg_=(value: fr.unice.i3s.sigma.examples.simpleoo.Package): Unit = that.setPkg(value)
      def pkg_=(value: Transformable): Unit = value.transform[fr.unice.i3s.sigma.examples.simpleoo.Package].foreach(that.setPkg(_))
      def pkg_=(value: ⇒ Option[fr.unice.i3s.sigma.examples.simpleoo.Package]): Unit =
        that.setPkg(SimpleooPackageScalaSupport._simpleooBuilder.ref(value))
    }
    
    implicit class Class2Sigma(that: fr.unice.i3s.sigma.examples.simpleoo.Class) {
      def abstract_ : Boolean = that.isAbstract
      def abstract__=(value: Boolean): Unit = that.setAbstract(value)
      def properties: EList[Property] = that.getProperties
      def operations: EList[Operation] = that.getOperations
      def features: EList[Feature] = that.getFeatures
      def superClass: Option[fr.unice.i3s.sigma.examples.simpleoo.Class] = Option(that.getSuperClass)
      def superClass_=(value: fr.unice.i3s.sigma.examples.simpleoo.Class): Unit = that.setSuperClass(value)
      def superClass_=(value: Transformable): Unit = value.transform[fr.unice.i3s.sigma.examples.simpleoo.Class].foreach(that.setSuperClass(_))
      def superClass_=(value: ⇒ Option[fr.unice.i3s.sigma.examples.simpleoo.Class]): Unit =
        that.setSuperClass(SimpleooPackageScalaSupport._simpleooBuilder.ref(value))
    }
    
    
    implicit class Feature2Sigma(that: Feature) {
      def ownerScope: ScopeKind = that.getOwnerScope
      def ownerScope_=(value: ScopeKind): Unit = that.setOwnerScope(value)
    }
    
    implicit class Property2Sigma(that: Property) {
      def type_ : Classifier = that.getType
      def type__=(value: Classifier): Unit = that.setType(value)
      def type__=(value: Transformable): Unit = value.transform[Classifier].foreach(that.setType(_))
      def type__=(value: ⇒ Option[Classifier]): Unit =
        that.setType(SimpleooPackageScalaSupport._simpleooBuilder.ref(value))
      def multi: Boolean = that.isMulti
      def multi_=(value: Boolean): Unit = that.setMulti(value)
    }
    
    implicit class Operation2Sigma(that: Operation) {
      def returnType: Classifier = that.getReturnType
      def returnType_=(value: Classifier): Unit = that.setReturnType(value)
      def returnType_=(value: Transformable): Unit = value.transform[Classifier].foreach(that.setReturnType(_))
      def returnType_=(value: ⇒ Option[Classifier]): Unit =
        that.setReturnType(SimpleooPackageScalaSupport._simpleooBuilder.ref(value))
    }
    
    
    
    object _simpleoo extends SigmaEcorePackage[SimpleooPackage] with
      ModelElementScalaSupport with
      StereotypeScalaSupport with
      PackageScalaSupport with
      ClassifierScalaSupport with
      ClassScalaSupport with
      PrimitiveTypeScalaSupport with
      FeatureScalaSupport with
      PropertyScalaSupport with
      OperationScalaSupport with
      ConstructorScalaSupport {
      
      val ePackage = SimpleooPackage.eINSTANCE
    }
  }

object SimpleooPackageScalaSupport extends SimpleooPackageScalaSupport {
  private[this] val ePackage = SimpleooPackage.eINSTANCE
  
  protected[support] val _simpleooBuilder = new EMFBuilder(ePackage)
}
