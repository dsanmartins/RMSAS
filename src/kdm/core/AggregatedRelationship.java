/**
 */
package kdm.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aggregated Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The set of aggregated relationships for a given entity represents all primitive relationships between the entities that are
 * transitively owned by the given entity as well as the entity itself. This is a concrete class, because an
 * AggregatedRelationship can be instantiated, and exchanged. AggregatedRelations are meant to be built on demand (and
 * exchanged too, if necessary). The lifecycle of the Aggregated Relationships can be explicitly managed by the operations
 * of the KDMEntity class.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kdm.core.AggregatedRelationship#getFrom <em>From</em>}</li>
 *   <li>{@link kdm.core.AggregatedRelationship#getTo <em>To</em>}</li>
 *   <li>{@link kdm.core.AggregatedRelationship#getRelation <em>Relation</em>}</li>
 *   <li>{@link kdm.core.AggregatedRelationship#getDensity <em>Density</em>}</li>
 * </ul>
 *
 * @see kdm.core.CorePackage#getAggregatedRelationship()
 * @model
 * @generated
 */
public interface AggregatedRelationship extends ModelElement {
	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link kdm.core.KDMEntity#getOutAggregated <em>Out Aggregated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The source container of the relationships in the aggregated set. All relationships in
	 * the aggregated set should originate from the source container or from some entity
	 * that is contained directly or indirectly in the source container.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(KDMEntity)
	 * @see kdm.core.CorePackage#getAggregatedRelationship_From()
	 * @see kdm.core.KDMEntity#getOutAggregated
	 * @model opposite="outAggregated" required="true" ordered="false"
	 * @generated
	 */
	KDMEntity getFrom();

	/**
	 * Sets the value of the '{@link kdm.core.AggregatedRelationship#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(KDMEntity value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link kdm.core.KDMEntity#getInAggregated <em>In Aggregated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The target container of the relationships in the aggregated set. All relations in the
	 * aggregated set should terminate at the target container or at some entity that is
	 * contained directly or indirectly in the target container.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(KDMEntity)
	 * @see kdm.core.CorePackage#getAggregatedRelationship_To()
	 * @see kdm.core.KDMEntity#getInAggregated
	 * @model opposite="inAggregated" required="true" ordered="false"
	 * @generated
	 */
	KDMEntity getTo();

	/**
	 * Sets the value of the '{@link kdm.core.AggregatedRelationship#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(KDMEntity value);

	/**
	 * Returns the value of the '<em><b>Relation</b></em>' reference list.
	 * The list contents are of type {@link kdm.core.KDMRelationship}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of primitive KDM relationships represented by the aggregated relationship.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relation</em>' reference list.
	 * @see kdm.core.CorePackage#getAggregatedRelationship_Relation()
	 * @model ordered="false"
	 * @generated
	 */
	EList<KDMRelationship> getRelation();

	/**
	 * Returns the value of the '<em><b>Density</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of primitive relationships in the aggregated set.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Density</em>' attribute.
	 * @see #setDensity(Integer)
	 * @see kdm.core.CorePackage#getAggregatedRelationship_Density()
	 * @model dataType="kdm.core.Integer"
	 * @generated
	 */
	Integer getDensity();

	/**
	 * Sets the value of the '{@link kdm.core.AggregatedRelationship#getDensity <em>Density</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Density</em>' attribute.
	 * @see #getDensity()
	 * @generated
	 */
	void setDensity(Integer value);

} // AggregatedRelationship
