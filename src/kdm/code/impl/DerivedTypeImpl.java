/**
 */
package kdm.code.impl;

import kdm.code.CodePackage;
import kdm.code.DerivedType;
import kdm.code.ItemUnit;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Derived Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kdm.code.impl.DerivedTypeImpl#getItemUnit <em>Item Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DerivedTypeImpl extends DatatypeImpl implements DerivedType {
	/**
	 * The cached value of the '{@link #getItemUnit() <em>Item Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemUnit()
	 * @generated
	 * @ordered
	 */
	protected ItemUnit itemUnit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DerivedTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodePackage.Literals.DERIVED_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ItemUnit getItemUnit() {
		return itemUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItemUnit(ItemUnit newItemUnit, NotificationChain msgs) {
		ItemUnit oldItemUnit = itemUnit;
		itemUnit = newItemUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CodePackage.DERIVED_TYPE__ITEM_UNIT, oldItemUnit, newItemUnit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setItemUnit(ItemUnit newItemUnit) {
		if (newItemUnit != itemUnit) {
			NotificationChain msgs = null;
			if (itemUnit != null)
				msgs = ((InternalEObject)itemUnit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CodePackage.DERIVED_TYPE__ITEM_UNIT, null, msgs);
			if (newItemUnit != null)
				msgs = ((InternalEObject)newItemUnit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CodePackage.DERIVED_TYPE__ITEM_UNIT, null, msgs);
			msgs = basicSetItemUnit(newItemUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.DERIVED_TYPE__ITEM_UNIT, newItemUnit, newItemUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CodePackage.DERIVED_TYPE__ITEM_UNIT:
				return basicSetItemUnit(null, msgs);
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
			case CodePackage.DERIVED_TYPE__ITEM_UNIT:
				return getItemUnit();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CodePackage.DERIVED_TYPE__ITEM_UNIT:
				setItemUnit((ItemUnit)newValue);
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
			case CodePackage.DERIVED_TYPE__ITEM_UNIT:
				setItemUnit((ItemUnit)null);
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
			case CodePackage.DERIVED_TYPE__ITEM_UNIT:
				return itemUnit != null;
		}
		return super.eIsSet(featureID);
	}

} //DerivedTypeImpl
