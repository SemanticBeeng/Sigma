package fr.unice.i3s.sigma.scala.utils

import scala.reflect.runtime.universe
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.emf.ecore.scala.EcorePackageScalaSupport
import org.eclipse.emf.ecore.scala.EcorePackageScalaSupport.EBoolean
import org.eclipse.emf.ecore.scala.EcorePackageScalaSupport.EDate
import org.eclipse.emf.ecore.scala.EcorePackageScalaSupport.EInt
import org.eclipse.emf.ecore.scala.EcorePackageScalaSupport.EString
import org.junit.runner.RunWith
import org.scalatest.FlatSpec
import org.scalatest.matchers.MustMatchers
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class EMFBuilderSpec extends FlatSpec with MustMatchers with EcorePackageScalaSupport {

  import EcorePackageScalaSupport._

  def derived[T <: EStructuralFeature](feature: T): T = {
    feature.derived = true
    feature.transient = true
    feature.volatile = true
    feature
  }

  "EcoreBuilder" must "conveniently create the library example" in {
    val builder = new EcoreBuilder
    import builder._

    val pkg = ePackage(name = "library", nsPrefix = "library", nsURI = "http://library.me")
    pkg eClassifiers {
      val Library = eClass("Library")
      val Book = eClass("Book")
      val Loan = eClass("Loan")
      val Member = eClass("Member")

      Library {
        eStructuralFeatures {
          eAttribute(name = "name", eType = EString, lowerBound = 1)

          eReference(name = "books", eType = Book, lowerBound = 0, upperBound = -1, containment = true,
            eOpposite = ref(Book.eReferences find (_.name == "library")))
          eReference(name = "loans", eType = Loan, lowerBound = 0, upperBound = -1, containment = true)
          eReference(name = "members", eType = Member, lowerBound = 0, upperBound = -1, containment = true,
            eOpposite = ref(Member.eReferences find (_.name == "library")))
        }
        eOperations {
          eOperation(name = "toString", eType = EBoolean)
          eOperation(name = "getBookByName", eType = EBoolean,
            eParameters = List(eParameter(name = "name", eType = EString)))
        }
      }

      Book {
        eStructuralFeatures {
          eAttribute(name = "name", eType = EString, lowerBound = 1)
          eAttribute(name = "copies", eType = EInt, lowerBound = 1)

          eReference(name = "library", eType = Library, lowerBound = 1,
            eOpposite = ref(Library.eReferences find (_.name == "books")))
          derived(eReference(name = "loans", eType = Loan, lowerBound = 1, upperBound = -1))
        }
        eOperations {
          eOperation(name = "isAvailable", eType = EBoolean)
        }
      }

      Member {
        eStructuralFeatures {
          eAttribute(name = "name", eType = EString, lowerBound = 1)
          eAttribute(name = "copies", eType = EInt, lowerBound = 1)

          eReference(name = "library", eType = Library, lowerBound = 1,
            eOpposite = ref(Library.eReferences find (_.name == "members")))
          derived(eReference(name = "loans", eType = Loan, lowerBound = 1, upperBound = -1))
          derived(eReference(name = "books", eType = Book, lowerBound = 1, upperBound = -1))
        }
      }

      Loan {
        eStructuralFeatures {
          eAttribute(name = "date", eType = EDate)

          eReference(name = "book", eType = Loan, lowerBound = 1)
          eReference(name = "member", eType = Member, lowerBound = 1)
        }
      }
    }

    pkg.isValid must be === true
    //    println(pkg.validate prettyPrint)
  }

}