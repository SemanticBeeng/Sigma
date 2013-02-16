package fr.unice.i3s.sigma.scala.utils

import scala.collection.JavaConversions._
import scala.util.DynamicVariable
import fr.unice.i3s.sigma.scala.utils._
import org.eclipse.emf.ecore._

trait EcoreAssignments extends EMFDynamicContext {
  type HasSetName = EObject { def setName(name: String) }

  def name(implicit ev: Nothing) = ???
  def name_=(name: String) =
    self[HasSetName].setName(name)
}

//trait EcoreScalaSetters {
//  implicit class EClassSetters(val obj: EClass) {
//    // generate a getter and a setter for each structural feature that is not many
//    def name = obj.getName
//    def name_=(name: String) = obj.setName(name)
//
//    // generate a getter for each isMany feature
//    def eSuperTypes = obj.getESuperTypes()
//  }
//}

class EcoreBuilder extends EMFBuilder(EcorePackage.eINSTANCE) {

  def ePackage(
    name: String = null,
    nsURI: String = null,
    nsPrefix: String = null): EPackage = {
    val obj = create[EPackage]

    obj.setName(name)
    obj.setNsURI(nsURI)
    obj.setNsPrefix(nsPrefix)

    obj
  }

  def eClass(name: String): EClass = {
    val ctx = self[EPackage]
    val obj = create[EClass]

    ctx.getEClassifiers += obj

    obj.setName(name)

    obj
  }

  def eStructuralFeatures(fun: ⇒ Unit) {
    // make sure the current container is an EClass
    val ctx = self[EClass]

    // make sure that the current container reference is empty
    require(!isContainerListSet)

    // execute with the current container reference to EStructuralFeatures
    referenceContext.withValue(ctx.getEStructuralFeatures) { fun }
  }

  // FIXME: fix the problem with eGenericType
  def eAttribute(
    name: String = null,
    iD: Boolean = false,
    transient: Boolean = false,
    volatile: Boolean = false,
    changeable: Boolean = false,
    defaultValueLiteral: String = null,
    unsettable: Boolean = false,
    derived: Boolean = false,
    ordered: Boolean = true,
    unique: Boolean = true,
    lowerBound: Int = 0,
    upperBound: Int = 1,
    eType: EClassifier = null): EAttribute = {
    //    eGenericType: EGenericType = null): EAttribute = {

    val obj = create[EAttribute]

    // set containment    
    referenceList[EStructuralFeature] += obj

    // set values
    obj.setName(name)
    obj.setID(iD)
    obj.setTransient(transient)
    obj.setVolatile(volatile)
    obj.setChangeable(changeable)
    obj.setDefaultValueLiteral(defaultValueLiteral)
    obj.setUnsettable(unsettable)
    obj.setDerived(derived)
    obj.setOrdered(ordered)
    obj.setUnique(unique)
    obj.setLowerBound(lowerBound)
    obj.setUpperBound(upperBound)
    obj.setEType(eType)
    //    obj.setEGenericType(eGenericType)

    obj
  }

  def eReference(name: String): EReference = {
    val obj = create[EReference]

    // set containment
    referenceList[EStructuralFeature] += obj

    // set attributes
    obj.setName(name)

    obj
  }

}

//object Test extends App {
//
//  val builder = new EcoreBuilder with EcoreAssignments
//  import builder._
//
//  val myPkg = epackage("pkg") {
//    eclass("clazz") {
//      ereference("a")
//      ereference("b")
//    }
//    eclass("clazz2") init { c ⇒
//      c.setName("clazz2Ex")
//    }
//    eclass("clazz3") {
//      name = "clazz3Ex"
//    }
//    eclass("clazz4") {
//      container[EClass].setName("clazz4Ex")
//    }
//  }
//
//  print(myPkg)
//
//  def print(obj: EObject, indent: Int = 0) {
//    println(" " * indent + obj)
//    obj.eContents foreach (print(_, indent + 2))
//  }
//
//}
//
////object TestDynamic extends App {
////
////  val b = new EMFBuilder(EcorePackage.eINSTANCE)
////  import b._
////
////  //  val myPkg = b.epackage[EPackage]("pkg").apply()
////  val myPkg = b.create[EPackage]
////  myPkg {
////    myPkg.getNsPrefix()
////  }
////  //  {
////  //    eclass("clazz") {
////  //      ereference("a")
////  //      ereference("b")
////  //    }
////  //    eclass("clazz2") init { c =>
////  //      c.setName("clazz2Ex")
////  //    }
////  //    eclass("clazz3") {
////  //      name = "clazz3Ex"
////  //    }
////  //    eclass("clazz4") {
////  //      container[EClass].setName("clazz4Ex")
////  //    }
////  //  }
////
////  print(myPkg)
////
////  def print(obj: EObject, indent: Int = 0) {
////    println(" " * indent + obj)
////    obj.eContents foreach (print(_, indent + 2))
////  }
////
////}
