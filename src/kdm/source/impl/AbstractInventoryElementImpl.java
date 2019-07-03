/**
 */
package kdm.source.impl;

import java.util.Collection;

import kdm.core.impl.KDMEntityImpl;

import kdm.source.AbstractInventoryElement;
import kdm.source.AbstractInventoryRelationship;
import kdm.source.SourcePackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Inventory Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kdm.source.impl.AbstractInventoryElementImpl#getInventoryRelationship <em>Inventory Relationship</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractInventoryElementImpl extends KDMEntityImpl implements AbstractInventoryElement {
	/**
	 * The cached value of the '{@link #getInventoryRelationship() <em>Inventory Relationship</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInventoryRelationship()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractInventoryRelationship> inventoryRelationship;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractInventoryElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SourcePackage.Literals.ABSTRACT_INVENTORY_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractInventoryRelationship> getInventoryRelationship() {
		if (inventoryRelationship == null) {
			inventoryRelationship = new EObjectContainmentEList<AbstractInventoryRelationship>(AbstractInventoryRelationship.class, this, SourcePackage.ABSTRACT_INVENTORY_ELEMENT__INVENTORY_RELATIONSHIP);
		}
		return inventoryRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SourcePackage.ABSTRACT_INVENTORY_ELEMENT__INVENTORY_RELATIONSHIP:
				return ((InternalEList<?>)getInventoryRelationship()).basicRemove(otherEnd, msgs);
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
			case SourcePackage.ABSTRACT_INVENTORY_ELEMENT__INVENTORY_RELATIONSHIP:
				return getInventoryRelationship();
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
			case SourcePackage.ABSTRACT_INVENTORY_ELEMENT__INVENTORY_RELATIONSHIP:
				getInventoryRelationship().clear();
				getInventoryRelationship().addAll((Collection<? extends AbstractInventoryRelationship>)newValue);
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
			case SourcePackage.ABSTRACT_INVENTORY_ELEMENT__INVENTORY_RELATIONSHIP:
				getInventoryRelationship().clear();
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
			case SourcePackage.ABSTRACT_INVENTORY_ELEMENT__INVENTORY_RELATIONSHIP:
				return inventoryRelationship != null && !inventoryRelationship.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AbstractInventoryElementImpl
