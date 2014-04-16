package Relational.support

import Relational.Attribute;
import Relational.CandidateKey;

import fr.unice.i3s.sigma.support.EMFProxyBuilder;
import fr.unice.i3s.sigma.support.EMFScalaSupport;

import org.eclipse.emf.common.util.EList;

trait CandidateKeyScalaSupport extends EMFScalaSupport {
  type CandidateKey = Relational.CandidateKey
  
  protected implicit val _candidatekeyProxyBuilder = new EMFProxyBuilder[CandidateKey](RelationalPackageScalaSupport._relationalBuilder)
  
  object CandidateKey {
    def apply(attributes: EList[Attribute] = null, name: String = null): CandidateKey = {
      val _instance = RelationalPackageScalaSupport._relationalBuilder.create[CandidateKey]
      
      if (attributes != null) _instance.getAttributes.addAll(attributes)
      if (name != null) _instance.setName(name)
      
      _instance
    }
  }
}

object CandidateKeyScalaSupport extends CandidateKeyScalaSupport