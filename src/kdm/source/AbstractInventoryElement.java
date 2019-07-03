/**
 */
package kdm.source;

import kdm.core.KDMEntity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Inventory Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kdm.source.AbstractInventoryElement#getInventoryRelationship <em>Inventory Relationship</em>}</li>
 * </ul>
 *
 * @see kdm.source.SourcePackage#getAbstractInventoryElement()
 * @model abstract="true"
 * @generated
 */
public interface AbstractInventoryElement extends KDMEntity {
	/**
	 * Returns the value of the '<em><b>Inventory Relationship</b></em>' containment reference list.
	 * The list contents are of type {@link kdm.source.AbstractInventoryRelationship}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inventory Relationship</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inventory Relationship</em>' containment reference list.
	 * @see kdm.source.SourcePackage#getAbstractInventoryElement_InventoryRelationship()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<AbstractInventoryRelationship> getInventoryRelationship();

} // AbstractInventoryElement
