package fr.unice.i3s.sigma.delegate.codegen

import fr.unice.i3s.sigma.scala.utils._
import org.scalatest.WordSpec
import org.scalatest.matchers.MustMatchers
import org.scalatest.mock.MockitoSugar
import org.eclipse.emf.codegen.ecore.genmodel.GenClass
import org.mockito.Mockito._
import org.mockito.Matchers.{ eq ⇒ eeq }
import fr.unice.i3s.sigma.delegate.SigmaDelegateDomain.{ instance ⇒ domain }
import org.mockito.Matchers
import org.eclipse.emf.codegen.ecore.genmodel.GenModel
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage
import org.eclipse.emf.codegen.ecore.genmodel.GenModelFactory
import fr.unice.i3s.sigma.support.EMFScalaSupport

@RunWith(classOf[JUnitRunner])
class SigmaStaticDelegatesGenClassGeneratorAdapterTest extends WordSpec with MustMatchers with MockitoSugar with EMFScalaSupport {

  "isScalaExtensionEnabled" must {
    "returns false when annotation is missing" in {
      val genModelMock = mock[GenModel]
      when(genModelMock getGenAnnotation eeq(domain.getURI)) thenReturn null

      val genPackageMock = mock[GenPackage]
      when(genPackageMock getGenAnnotation eeq(domain.getURI)) thenReturn null
      when(genPackageMock getSuperGenPackage) thenReturn null
      when(genPackageMock getGenModel) thenReturn genModelMock

      val genClazzMock = mock[GenClass]
      when(genClazzMock getGenAnnotation eeq(domain.getURI)) thenReturn null
      when(genClazzMock getGenPackage) thenReturn genPackageMock

      val adapter = new ScalaEcoreExtensionsGenClassGeneratorAdapter(domain, null)
      adapter.isScalaExtensionEnabled(genClazzMock) must be === false
    }

    "returns false when annotation is present and set to false" in {
      val genClazzMock = mock[GenClass]
      when(genClazzMock getGenAnnotation eeq(domain.getURI)) thenReturn {
        val annot = GenModelFactory.eINSTANCE.createGenAnnotation
        annot.setSource(domain.getURI)
        annot.getDetails() += ScalaEcoreExtensionsGenClassGeneratorAdapter.ENABLE_SCALA_ECORE_EXTENSION -> "false"
        annot
      }

      val adapter = new ScalaEcoreExtensionsGenClassGeneratorAdapter(domain, null)
      adapter.isScalaExtensionEnabled(genClazzMock) must be === false
    }

  }

}