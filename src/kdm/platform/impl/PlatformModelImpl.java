/**
 */
package kdm.platform.impl;

import java.util.Collection;

import kdm.kdm.impl.KDMModelImpl;

import kdm.platform.AbstractPlatformElement;
import kdm.platform.PlatformModel;
import kdm.platform.PlatformPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kdm.platform.impl.PlatformModelImpl#getPlatformElement <em>Platform Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlatformModelImpl extends KDMModelImpl implements PlatformModel {
	/**
	 * The cached value of the '{@link #getPlatformElement() <em>Platform Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatformElement()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractPlatformElement> platformElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlatformModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlatformPackage.Literals.PLATFORM_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractPlatformElement> getPlatformElement() {
		if (platformElement == null) {
			platformElement = new EObjectContainmentEList<AbstractPlatformElement>(AbstractPlatformElement.class, this, PlatformPackage.PLATFORM_MODEL__PLATFORM_ELEMENT);
		}
		return platformElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlatformPackage.PLATFORM_MODEL__PLATFORM_ELEMENT:
				return ((InternalEList<?>)getPlatformElement()).basicRemove(otherEnd, msgs);
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
			case PlatformPackage.PLATFORM_MODEL__PLATFORM_ELEMENT:
				return getPlatformElement();
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
			case PlatformPackage.PLATFORM_MODEL__PLATFORM_ELEMENT:
				getPlatformElement().clear();
				getPlatformElement().addAll((Collection<? extends AbstractPlatformElement>)newValue);
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
			case PlatformPackage.PLATFORM_MODEL__PLATFORM_ELEMENT:
				getPlatformElement().clear();
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
			case PlatformPackage.PLATFORM_MODEL__PLATFORM_ELEMENT:
				return platformElement != null && !platformElement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PlatformModelImpl
