package fr.unice.i3s.sigma.workflow.lib

import java.io.File
import org.junit.runner.RunWith
import org.scalatest.FlatSpec
import org.scalatest.matchers.MustMatchers
import fr.unice.i3s.sigma.util.IOUtils
import org.scalatest.junit.JUnitRunner
import fr.unice.i3s.sigma.workflow.BasicWorkflowRunner

@RunWith(classOf[JUnitRunner])
class CleanDirectorySpec extends FlatSpec with MustMatchers {

  implicit val runner = new BasicWorkflowRunner

  "DirectoryCleaner" must "remove all files within a direcoty including parent" in {
    val tmp = IOUtils.mkdtemp
    new File(tmp, "1/2").mkdirs must be === true
    new File(tmp, "1/2/a").createNewFile must be === true
    new File(tmp, "1/2/b").createNewFile must be === true
    new File(tmp, "3").mkdirs must be === true
    new File(tmp, "3/c").createNewFile must be === true

    !new CleanDirectory {
      path = tmp
      deleteParentDir = true
    }

    tmp.exists must be === false
  }

}