package EER.support

import EER.AbstractParticipant;
import EER.AbstractRelationship;
import EER.Aggregation;
import EER.AggregationParticipant;
import EER.Attribute;
import EER.AttributedNode;
import EER.CandidateKey;
import EER.CompositeAttribute;
import EER.Constraint;
import EER.DependencyRelationship;
import EER.DependencyType;
import EER.Domain;
import EER.EERPackage;
import EER.Entity;
import EER.EnumeratedLiteral;
import EER.EnumerationType;
import EER.Exclusion;
import EER.Exclusive;
import EER.Generalization;
import EER.GeneralizationRelationship;
import EER.GeneralizationType;
import EER.Inclusion;
import EER.Inclusiveness;
import EER.Node;
import EER.Participant;
import EER.Project;
import EER.Relationship;
import EER.SingleAttribute;
import EER.SpecializationRelationship;

import fr.unice.i3s.sigma.m2m.Transformable;

import fr.unice.i3s.sigma.support.EMFBuilder;
import fr.unice.i3s.sigma.support.EMFScalaSupport;
import fr.unice.i3s.sigma.support.SigmaEcorePackage;

import org.eclipse.emf.common.util.EList;

import scala.Option;


trait EERPackageScalaSupport
  extends EMFScalaSupport {
    
    implicit class Project2Sigma(that: Project) {
      def name: String = that.getName
      def name_=(value: String): Unit = that.setName(value)
      def domains: EList[Domain] = that.getDomains
      def nodes: EList[AttributedNode] = that.getNodes
    }
    
    implicit class AttributedNode2Sigma(that: AttributedNode) {
      def name: String = that.getName
      def name_=(value: String): Unit = that.setName(value)
    }
    
    implicit class Entity2Sigma(that: Entity) {
      def primaryKey: Option[CandidateKey] = Option(that.getPrimaryKey)
      def primaryKey_=(value: CandidateKey): Unit = that.setPrimaryKey(value)
      def primaryKey_=(value: Transformable): Unit = value.transform[CandidateKey].foreach(that.setPrimaryKey(_))
      def primaryKey_=(value: ⇒ Option[CandidateKey]): Unit =
        that.setPrimaryKey(EERPackageScalaSupport._eerBuilder.ref(value))
      def candidateKey: EList[CandidateKey] = that.getCandidateKey
      def dependencyRelationships: EList[DependencyRelationship] = that.getDependencyRelationships
      def isSpecializedBy: EList[SpecializationRelationship] = that.getIsSpecializedBy
      def specializes: EList[GeneralizationRelationship] = that.getSpecializes
    }
    
    
    implicit class Constraint2Sigma(that: Constraint) {
      def name: Option[String] = Option(that.getName)
      def name_=(value: String): Unit = that.setName(value)
    }
    
    implicit class Exclusive2Sigma(that: Exclusive) {
      def source: Participant = that.getSource
      def source_=(value: Participant): Unit = that.setSource(value)
      def source_=(value: Transformable): Unit = value.transform[Participant].foreach(that.setSource(_))
      def source_=(value: ⇒ Option[Participant]): Unit =
        that.setSource(EERPackageScalaSupport._eerBuilder.ref(value))
      def target: Participant = that.getTarget
      def target_=(value: Participant): Unit = that.setTarget(value)
      def target_=(value: Transformable): Unit = value.transform[Participant].foreach(that.setTarget(_))
      def target_=(value: ⇒ Option[Participant]): Unit =
        that.setTarget(EERPackageScalaSupport._eerBuilder.ref(value))
    }
    
    implicit class Inclusiveness2Sigma(that: Inclusiveness) {
      def source: Participant = that.getSource
      def source_=(value: Participant): Unit = that.setSource(value)
      def source_=(value: Transformable): Unit = value.transform[Participant].foreach(that.setSource(_))
      def source_=(value: ⇒ Option[Participant]): Unit =
        that.setSource(EERPackageScalaSupport._eerBuilder.ref(value))
      def target: Participant = that.getTarget
      def target_=(value: Participant): Unit = that.setTarget(value)
      def target_=(value: Transformable): Unit = value.transform[Participant].foreach(that.setTarget(_))
      def target_=(value: ⇒ Option[Participant]): Unit =
        that.setTarget(EERPackageScalaSupport._eerBuilder.ref(value))
      def lowerBound: Int = that.getLowerBound
      def lowerBound_=(value: Int): Unit = that.setLowerBound(value)
      def upperBound: Option[Int] = Option(that.getUpperBound)
      def upperBound_=(value: Int): Unit = that.setUpperBound(value)
    }
    
    implicit class Exclusion2Sigma(that: Exclusion) {
      def source: Relationship = that.getSource
      def source_=(value: Relationship): Unit = that.setSource(value)
      def source_=(value: Transformable): Unit = value.transform[Relationship].foreach(that.setSource(_))
      def source_=(value: ⇒ Option[Relationship]): Unit =
        that.setSource(EERPackageScalaSupport._eerBuilder.ref(value))
      def target: Relationship = that.getTarget
      def target_=(value: Relationship): Unit = that.setTarget(value)
      def target_=(value: Transformable): Unit = value.transform[Relationship].foreach(that.setTarget(_))
      def target_=(value: ⇒ Option[Relationship]): Unit =
        that.setTarget(EERPackageScalaSupport._eerBuilder.ref(value))
    }
    
    implicit class Inclusion2Sigma(that: Inclusion) {
      def source: Relationship = that.getSource
      def source_=(value: Relationship): Unit = that.setSource(value)
      def source_=(value: Transformable): Unit = value.transform[Relationship].foreach(that.setSource(_))
      def source_=(value: ⇒ Option[Relationship]): Unit =
        that.setSource(EERPackageScalaSupport._eerBuilder.ref(value))
      def target: Relationship = that.getTarget
      def target_=(value: Relationship): Unit = that.setTarget(value)
      def target_=(value: Transformable): Unit = value.transform[Relationship].foreach(that.setTarget(_))
      def target_=(value: ⇒ Option[Relationship]): Unit =
        that.setTarget(EERPackageScalaSupport._eerBuilder.ref(value))
    }
    
    implicit class CandidateKey2Sigma(that: CandidateKey) {
      def attributes: EList[Attribute] = that.getAttributes
      def name: String = that.getName
      def name_=(value: String): Unit = that.setName(value)
    }
    
    implicit class Attribute2Sigma(that: Attribute) {
      def name: String = that.getName
      def name_=(value: String): Unit = that.setName(value)
      def nullable: Boolean = that.isNullable
      def nullable_=(value: Boolean): Unit = that.setNullable(value)
    }
    
    implicit class CompositeAttribute2Sigma(that: CompositeAttribute) {
      def singlesAttributes: EList[Attribute] = that.getSinglesAttributes
    }
    
    implicit class SingleAttribute2Sigma(that: SingleAttribute) {
      def derivate: Boolean = that.isDerivate
      def derivate_=(value: Boolean): Unit = that.setDerivate(value)
      def domain: Domain = that.getDomain
      def domain_=(value: Domain): Unit = that.setDomain(value)
      def domain_=(value: Transformable): Unit = value.transform[Domain].foreach(that.setDomain(_))
      def domain_=(value: ⇒ Option[Domain]): Unit =
        that.setDomain(EERPackageScalaSupport._eerBuilder.ref(value))
      def multiplicity: Int = that.getMultiplicity
      def multiplicity_=(value: Int): Unit = that.setMultiplicity(value)
    }
    
    implicit class Domain2Sigma(that: Domain) {
      def name: String = that.getName
      def name_=(value: String): Unit = that.setName(value)
    }
    
    implicit class EnumerationType2Sigma(that: EnumerationType) {
      def literals: EList[EnumeratedLiteral] = that.getLiterals
    }
    
    
    implicit class EnumeratedLiteral2Sigma(that: EnumeratedLiteral) {
      def name: String = that.getName
      def name_=(value: String): Unit = that.setName(value)
    }
    
    implicit class AbstractRelationship2Sigma(that: AbstractRelationship) {
      def participants: EList[Participant] = that.getParticipants
    }
    
    implicit class Relationship2Sigma(that: Relationship) {
      def exclusionConstraints: EList[Exclusion] = that.getExclusionConstraints
      def inclusionConstraints: EList[Inclusion] = that.getInclusionConstraints
    }
    
    implicit class DependencyRelationship2Sigma(that: DependencyRelationship) {
      def type_ : DependencyType = that.getType
      def type__=(value: DependencyType): Unit = that.setType(value)
    }
    
    implicit class Participant2Sigma(that: Participant) {
      def target: Entity = that.getTarget
      def target_=(value: Entity): Unit = that.setTarget(value)
      def target_=(value: Transformable): Unit = value.transform[Entity].foreach(that.setTarget(_))
      def target_=(value: ⇒ Option[Entity]): Unit =
        that.setTarget(EERPackageScalaSupport._eerBuilder.ref(value))
      def source: AbstractRelationship = that.getSource
      def source_=(value: AbstractRelationship): Unit = that.setSource(value)
      def source_=(value: Transformable): Unit = value.transform[AbstractRelationship].foreach(that.setSource(_))
      def source_=(value: ⇒ Option[AbstractRelationship]): Unit =
        that.setSource(EERPackageScalaSupport._eerBuilder.ref(value))
      def exclusiveConstraint: EList[Exclusive] = that.getExclusiveConstraint
      def inclusivenessConstraint: EList[Inclusiveness] = that.getInclusivenessConstraint
    }
    
    implicit class Generalization2Sigma(that: Generalization) {
      def parent: SpecializationRelationship = that.getParent
      def parent_=(value: SpecializationRelationship): Unit = that.setParent(value)
      def parent_=(value: Transformable): Unit = value.transform[SpecializationRelationship].foreach(that.setParent(_))
      def parent_=(value: ⇒ Option[SpecializationRelationship]): Unit =
        that.setParent(EERPackageScalaSupport._eerBuilder.ref(value))
      def childs: EList[GeneralizationRelationship] = that.getChilds
      def attribute: Option[Attribute] = Option(that.getAttribute)
      def attribute_=(value: Attribute): Unit = that.setAttribute(value)
      def attribute_=(value: Transformable): Unit = value.transform[Attribute].foreach(that.setAttribute(_))
      def type_ : GeneralizationType = that.getType
      def type__=(value: GeneralizationType): Unit = that.setType(value)
    }
    
    implicit class SpecializationRelationship2Sigma(that: SpecializationRelationship) {
      def source: Entity = that.getSource
      def source_=(value: Entity): Unit = that.setSource(value)
      def source_=(value: Transformable): Unit = value.transform[Entity].foreach(that.setSource(_))
      def source_=(value: ⇒ Option[Entity]): Unit =
        that.setSource(EERPackageScalaSupport._eerBuilder.ref(value))
      def relationship: Generalization = that.getRelationship
      def relationship_=(value: Generalization): Unit = that.setRelationship(value)
      def relationship_=(value: Transformable): Unit = value.transform[Generalization].foreach(that.setRelationship(_))
      def relationship_=(value: ⇒ Option[Generalization]): Unit =
        that.setRelationship(EERPackageScalaSupport._eerBuilder.ref(value))
    }
    
    implicit class GeneralizationRelationship2Sigma(that: GeneralizationRelationship) {
      def relationship: Generalization = that.getRelationship
      def relationship_=(value: Generalization): Unit = that.setRelationship(value)
      def relationship_=(value: Transformable): Unit = value.transform[Generalization].foreach(that.setRelationship(_))
      def relationship_=(value: ⇒ Option[Generalization]): Unit =
        that.setRelationship(EERPackageScalaSupport._eerBuilder.ref(value))
      def child: Entity = that.getChild
      def child_=(value: Entity): Unit = that.setChild(value)
      def child_=(value: Transformable): Unit = value.transform[Entity].foreach(that.setChild(_))
      def child_=(value: ⇒ Option[Entity]): Unit =
        that.setChild(EERPackageScalaSupport._eerBuilder.ref(value))
    }
    
    implicit class AbstractParticipant2Sigma(that: AbstractParticipant) {
      def role: Option[String] = Option(that.getRole)
      def role_=(value: String): Unit = that.setRole(value)
      def lowerBound: Int = that.getLowerBound
      def lowerBound_=(value: Int): Unit = that.setLowerBound(value)
      def upperBound: Option[Int] = Option(that.getUpperBound)
      def upperBound_=(value: Int): Unit = that.setUpperBound(value)
    }
    
    implicit class AggregationParticipant2Sigma(that: AggregationParticipant) {
      def target: Option[Node] = Option(that.getTarget)
      def target_=(value: Node): Unit = that.setTarget(value)
      def target_=(value: Transformable): Unit = value.transform[Node].foreach(that.setTarget(_))
      def target_=(value: ⇒ Option[Node]): Unit =
        that.setTarget(EERPackageScalaSupport._eerBuilder.ref(value))
      def source: Aggregation = that.getSource
      def source_=(value: Aggregation): Unit = that.setSource(value)
      def source_=(value: Transformable): Unit = value.transform[Aggregation].foreach(that.setSource(_))
      def source_=(value: ⇒ Option[Aggregation]): Unit =
        that.setSource(EERPackageScalaSupport._eerBuilder.ref(value))
    }
    
    implicit class Node2Sigma(that: Node) {
      def attributes: EList[Attribute] = that.getAttributes
    }
    
    implicit class Aggregation2Sigma(that: Aggregation) {
      def source: Entity = that.getSource
      def source_=(value: Entity): Unit = that.setSource(value)
      def source_=(value: Transformable): Unit = value.transform[Entity].foreach(that.setSource(_))
      def source_=(value: ⇒ Option[Entity]): Unit =
        that.setSource(EERPackageScalaSupport._eerBuilder.ref(value))
      def participants: EList[AggregationParticipant] = that.getParticipants
    }
    
    
    object _EER extends SigmaEcorePackage[EERPackage] with
      ProjectScalaSupport with
      AttributedNodeScalaSupport with
      EntityScalaSupport with
      WeakEntityScalaSupport with
      ConstraintScalaSupport with
      ExclusiveScalaSupport with
      InclusivenessScalaSupport with
      ExclusionScalaSupport with
      InclusionScalaSupport with
      CandidateKeyScalaSupport with
      AttributeScalaSupport with
      CompositeAttributeScalaSupport with
      SingleAttributeScalaSupport with
      DomainScalaSupport with
      EnumerationTypeScalaSupport with
      PrimitiveTypeScalaSupport with
      EnumeratedLiteralScalaSupport with
      AbstractRelationshipScalaSupport with
      RelationshipScalaSupport with
      DependencyRelationshipScalaSupport with
      ParticipantScalaSupport with
      GeneralizationScalaSupport with
      SpecializationRelationshipScalaSupport with
      GeneralizationRelationshipScalaSupport with
      AbstractParticipantScalaSupport with
      AggregationParticipantScalaSupport with
      NodeScalaSupport with
      AggregationScalaSupport {
      
      val ePackage = EERPackage.eINSTANCE
    }
  }

object EERPackageScalaSupport extends EERPackageScalaSupport {
  private[this] val ePackage = EERPackage.eINSTANCE
  
  protected[support] val _eerBuilder = new EMFBuilder(ePackage)
}