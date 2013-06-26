package fr.unice.i3s.sigma.examples.sle13.support

import scala.collection.JavaConversions._
import fr.unice.i3s.sigma.workflow.lib.StandaloneSetup
import fr.unice.i3s.sigma.workflow.WorkflowApp
import fr.unice.i3s.sigma.workflow.lib.GenerateEMFScalaSupport
import fr.unice.i3s.sigma.workflow.lib.CleanDirectory
import fr.unice.i3s.sigma.workflow.lib.GenerateEcore

object GenerateSLE13ScalaSupport extends WorkflowApp {

  val projectName = "fr.unice.i3s.sigma.examples.sle13"
  val runtimeProject = s"../$projectName"
  val srcGen = s"$runtimeProject/src-gen"

  val packageSuffix = ".support"
  val genModels = List(
    s"platform:/resource/$projectName/model/OO.genmodel",
    s"platform:/resource/$projectName/model/DB.genmodel"
  )

  !new StandaloneSetup {
    platformPath = s"$runtimeProject/.."
    logResourceURIMap = true
  }

  !new CleanDirectory {
    path = srcGen
  }

  genModels foreach { genModel ⇒
    !new GenerateEcore {
      genModelURI = genModel
      srcPath(s"platform:/resource/${projectName}/src")
    }

    !new GenerateEMFScalaSupport {
      baseDir = srcGen
      genModelURI = genModel
      generateExtractors = true
      useEMFBuilder = true
      packageNameMapping = { _ + packageSuffix }
    }
  }

}