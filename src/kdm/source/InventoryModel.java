/**
 */
package kdm.source;

import kdm.kdm.KDMModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inventory Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The InventoryModel is a specific KDM model which corresponds to the physical (engineering) view of the existing
 * software system. InventoryModel is a container for the instances of InventoryItems. InventoryModel corresponds to the
 * inventory of the physical artifacts of the existing software system.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kdm.source.InventoryModel#getInventoryElement <em>Inventory Element</em>}</li>
 * </ul>
 *
 * @see kdm.source.SourcePackage#getInventoryModel()
 * @model
 * @generated
 */
public interface InventoryModel extends KDMModel {
	/**
	 * Returns the value of the '<em><b>Inventory Element</b></em>' containment reference list.
	 * The list contents are of type {@link kdm.source.AbstractInventoryElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of inventory elements owned by the inventory model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inventory Element</em>' containment reference list.
	 * @see kdm.source.SourcePackage#getInventoryModel_InventoryElement()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<AbstractInventoryElement> getInventoryElement();

} // InventoryModel
