/**
 */
package kdm.source.impl;

import java.util.Collection;

import kdm.kdm.impl.KDMModelImpl;

import kdm.source.AbstractInventoryElement;
import kdm.source.InventoryModel;
import kdm.source.SourcePackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inventory Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kdm.source.impl.InventoryModelImpl#getInventoryElement <em>Inventory Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InventoryModelImpl extends KDMModelImpl implements InventoryModel {
	/**
	 * The cached value of the '{@link #getInventoryElement() <em>Inventory Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInventoryElement()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractInventoryElement> inventoryElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InventoryModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SourcePackage.Literals.INVENTORY_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractInventoryElement> getInventoryElement() {
		if (inventoryElement == null) {
			inventoryElement = new EObjectContainmentEList<AbstractInventoryElement>(AbstractInventoryElement.class, this, SourcePackage.INVENTORY_MODEL__INVENTORY_ELEMENT);
		}
		return inventoryElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SourcePackage.INVENTORY_MODEL__INVENTORY_ELEMENT:
				return ((InternalEList<?>)getInventoryElement()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SourcePackage.INVENTORY_MODEL__INVENTORY_ELEMENT:
				return getInventoryElement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SourcePackage.INVENTORY_MODEL__INVENTORY_ELEMENT:
				getInventoryElement().clear();
				getInventoryElement().addAll((Collection<? extends AbstractInventoryElement>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SourcePackage.INVENTORY_MODEL__INVENTORY_ELEMENT:
				getInventoryElement().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SourcePackage.INVENTORY_MODEL__INVENTORY_ELEMENT:
				return inventoryElement != null && !inventoryElement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InventoryModelImpl
