/**
 */
package kdm.code.impl;

import java.util.Collection;

import kdm.code.CodePackage;
import kdm.code.ParameterUnit;
import kdm.code.Signature;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kdm.code.impl.SignatureImpl#getParameterUnit <em>Parameter Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SignatureImpl extends DatatypeImpl implements Signature {
	/**
	 * The cached value of the '{@link #getParameterUnit() <em>Parameter Unit</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterUnit()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterUnit> parameterUnit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodePackage.Literals.SIGNATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ParameterUnit> getParameterUnit() {
		if (parameterUnit == null) {
			parameterUnit = new EObjectContainmentEList<ParameterUnit>(ParameterUnit.class, this, CodePackage.SIGNATURE__PARAMETER_UNIT);
		}
		return parameterUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CodePackage.SIGNATURE__PARAMETER_UNIT:
				return ((InternalEList<?>)getParameterUnit()).basicRemove(otherEnd, msgs);
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
			case CodePackage.SIGNATURE__PARAMETER_UNIT:
				return getParameterUnit();
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
			case CodePackage.SIGNATURE__PARAMETER_UNIT:
				getParameterUnit().clear();
				getParameterUnit().addAll((Collection<? extends ParameterUnit>)newValue);
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
			case CodePackage.SIGNATURE__PARAMETER_UNIT:
				getParameterUnit().clear();
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
			case CodePackage.SIGNATURE__PARAMETER_UNIT:
				return parameterUnit != null && !parameterUnit.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SignatureImpl
