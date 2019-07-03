/**
 */
package kdm.core;

import kdm.kdm.KDMModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>KDM Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A KDM entity is a named model element that represents an artifact of existing software systems.
 * In the meta-model, KDMEntity is a subclass of ModelElement. Each KDM package defines specific KDM entities that
 * are direct or indirect subclasses of KDMEntity. A KDMEntity can be either an atomic element, a container for some
 * KDMEntities, or a group of some KDMEntities. Container and group introduce implicit relationships between entities and
 * are used to represent hierarchies of entities. A container is a KDMEntity that owns other entities. A group is a KDMEntity
 * with which other entities are associated. A KDMEntity can be owned by at most one container, and can be associated with
 * zero or many groups.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kdm.core.KDMEntity#getName <em>Name</em>}</li>
 *   <li>{@link kdm.core.KDMEntity#getModel <em>Model</em>}</li>
 *   <li>{@link kdm.core.KDMEntity#getOwner <em>Owner</em>}</li>
 *   <li>{@link kdm.core.KDMEntity#getOwnedElement <em>Owned Element</em>}</li>
 *   <li>{@link kdm.core.KDMEntity#getOutbound <em>Outbound</em>}</li>
 *   <li>{@link kdm.core.KDMEntity#getInbound <em>Inbound</em>}</li>
 *   <li>{@link kdm.core.KDMEntity#getOwnedRelation <em>Owned Relation</em>}</li>
 *   <li>{@link kdm.core.KDMEntity#getGroup <em>Group</em>}</li>
 *   <li>{@link kdm.core.KDMEntity#getGroupedElement <em>Grouped Element</em>}</li>
 *   <li>{@link kdm.core.KDMEntity#getInAggregated <em>In Aggregated</em>}</li>
 *   <li>{@link kdm.core.KDMEntity#getOutAggregated <em>Out Aggregated</em>}</li>
 * </ul>
 *
 * @see kdm.core.CorePackage#getKDMEntity()
 * @model abstract="true"
 * @generated
 */
public interface KDMEntity extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identifier for the KDM entity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see kdm.core.CorePackage#getKDMEntity_Name()
	 * @model dataType="kdm.core.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link kdm.core.KDMEntity#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Model</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link kdm.kdm.KDMModel#getOwnedElement <em>Owned Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the KDM model that owns the current KDM
	 * Entity
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Model</em>' reference.
	 * @see kdm.core.CorePackage#getKDMEntity_Model()
	 * @see kdm.kdm.KDMModel#getOwnedElement
	 * @model opposite="ownedElement" changeable="false" derived="true"
	 *        annotation="union"
	 * @generated
	 */
	KDMModel getModel();

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link kdm.core.KDMEntity#getOwnedElement <em>Owned Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * KDM entity that owns the current element. This property determines a meta-level interface
	 * to KDM entities. This property is a derived union. Some KDM entities define a concrete set
	 * of owned elements that are subtypes of KDMEntity. In KDM this is represented by the
	 * CMOF “derived union” mechanism. Concrete properties subset the “union” properties of the
	 * parent classes, defined in the Core package. The owner of a KDM entity is defined as the
	 * container for which the given entity is an owned entity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owner</em>' container reference.
	 * @see kdm.core.CorePackage#getKDMEntity_Owner()
	 * @see kdm.core.KDMEntity#getOwnedElement
	 * @model opposite="ownedElement" transient="false" changeable="false" derived="true"
	 *        annotation="union"
	 * @generated
	 */
	KDMEntity getOwner();

	/**
	 * Returns the value of the '<em><b>Owned Element</b></em>' containment reference list.
	 * The list contents are of type {@link kdm.core.KDMEntity}.
	 * It is bidirectional and its opposite is '{@link kdm.core.KDMEntity#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the set of KDM entities that are owned by the current
	 * KDM Entity. Only KDM containers can own other entities.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Element</em>' containment reference list.
	 * @see kdm.core.CorePackage#getKDMEntity_OwnedElement()
	 * @see kdm.core.KDMEntity#getOwner
	 * @model opposite="owner" containment="true" changeable="false" derived="true"
	 *        annotation="union"
	 * @generated
	 */
	EList<KDMEntity> getOwnedElement();

	/**
	 * Returns the value of the '<em><b>Outbound</b></em>' reference list.
	 * The list contents are of type {@link kdm.core.KDMRelationship}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the set of relationships such that the current
	 * KDMEntity is the from-endpoint of these relationships.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outbound</em>' reference list.
	 * @see kdm.core.CorePackage#getKDMEntity_Outbound()
	 * @model changeable="false" derived="true"
	 *        annotation="union"
	 * @generated
	 */
	EList<KDMRelationship> getOutbound();

	/**
	 * Returns the value of the '<em><b>Inbound</b></em>' reference list.
	 * The list contents are of type {@link kdm.core.KDMRelationship}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the set of relationships such that the current
	 * KDMEntity is the to-endpoint of these relations.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inbound</em>' reference list.
	 * @see kdm.core.CorePackage#getKDMEntity_Inbound()
	 * @model changeable="false" derived="true"
	 *        annotation="union"
	 * @generated
	 */
	EList<KDMRelationship> getInbound();

	/**
	 * Returns the value of the '<em><b>Owned Relation</b></em>' containment reference list.
	 * The list contents are of type {@link kdm.core.KDMRelationship}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the set of relationships such that the current
	 * KDMEntity owns these relationships.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Relation</em>' containment reference list.
	 * @see kdm.core.CorePackage#getKDMEntity_OwnedRelation()
	 * @model containment="true" changeable="false" derived="true"
	 *        annotation="union"
	 * @generated
	 */
	EList<KDMRelationship> getOwnedRelation();

	/**
	 * Returns the value of the '<em><b>Group</b></em>' reference list.
	 * The list contents are of type {@link kdm.core.KDMEntity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Set of KDM entities with which the current element is associated. This property determines
	 * a meta-level interface to KDM entities. This property is a derived union. Some KDM entities
	 * define a concrete set of grouped elements that are the subtypes of KDMEntity. In KDM this
	 * is represented by the CMOF “derived union” mechanism. Concrete properties subset the
	 * “union” properties of the parent classes, defined in the Core package. The group of a KDM
	 * entity is defined as the group for which the given entity is a grouped entity. Each KDM
	 * entity can be associated with multiple groups.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Group</em>' reference list.
	 * @see kdm.core.CorePackage#getKDMEntity_Group()
	 * @model changeable="false" derived="true"
	 *        annotation="union"
	 * @generated
	 */
	EList<KDMEntity> getGroup();

	/**
	 * Returns the value of the '<em><b>Grouped Element</b></em>' reference list.
	 * The list contents are of type {@link kdm.core.KDMEntity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the set of KDM entities that are “grouped” by the
	 * current KDM entity. Only KDM groups can have group associations to other
	 * entities.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Grouped Element</em>' reference list.
	 * @see kdm.core.CorePackage#getKDMEntity_GroupedElement()
	 * @model changeable="false" derived="true"
	 *        annotation="union"
	 * @generated
	 */
	EList<KDMEntity> getGroupedElement();

	/**
	 * Returns the value of the '<em><b>In Aggregated</b></em>' reference list.
	 * The list contents are of type {@link kdm.core.AggregatedRelationship}.
	 * It is bidirectional and its opposite is '{@link kdm.core.AggregatedRelationship#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the set of AggregatedRelationship for which
	 * the target is the current KDM Entity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>In Aggregated</em>' reference list.
	 * @see kdm.core.CorePackage#getKDMEntity_InAggregated()
	 * @see kdm.core.AggregatedRelationship#getTo
	 * @model opposite="to" changeable="false" derived="true"
	 * @generated
	 */
	EList<AggregatedRelationship> getInAggregated();

	/**
	 * Returns the value of the '<em><b>Out Aggregated</b></em>' reference list.
	 * The list contents are of type {@link kdm.core.AggregatedRelationship}.
	 * It is bidirectional and its opposite is '{@link kdm.core.AggregatedRelationship#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the set of AggregatedRelationship for which
	 * the origin is the current KDM Entity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Out Aggregated</em>' reference list.
	 * @see kdm.core.CorePackage#getKDMEntity_OutAggregated()
	 * @see kdm.core.AggregatedRelationship#getFrom
	 * @model opposite="from" changeable="false" derived="true"
	 * @generated
	 */
	EList<AggregatedRelationship> getOutAggregated();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This operation creates an aggregated relationship such that the
	 * current entity is the from-endpoint of the aggregated relation and the
	 * “otherEntity” is the to-endpoint. The new aggregated relationship is
	 * owned by the model to which owns the current entity (either directly
	 * or indirectly through container ownership).
	 * <!-- end-model-doc -->
	 * @model otherEntityRequired="true"
	 * @generated
	 */
	AggregatedRelationship createAggregation(KDMEntity otherEntity);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This operation deletes the given aggregated relationship.
	 * <!-- end-model-doc -->
	 * @model aggregationRequired="true"
	 * @generated
	 */
	void deleteAggregation(AggregatedRelationship aggregation);

} // KDMEntity
