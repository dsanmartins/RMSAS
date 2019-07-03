/**
 */
package kdm.platform.impl;

import java.util.Collection;

import kdm.platform.DeployedComponent;
import kdm.platform.DeployedSoftwareSystem;
import kdm.platform.PlatformPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployed Software System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kdm.platform.impl.DeployedSoftwareSystemImpl#getGroupedComponent <em>Grouped Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeployedSoftwareSystemImpl extends AbstractPlatformElementImpl implements DeployedSoftwareSystem {
	/**
	 * The cached value of the '{@link #getGroupedComponent() <em>Grouped Component</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupedComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<DeployedComponent> groupedComponent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeployedSoftwareSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlatformPackage.Literals.DEPLOYED_SOFTWARE_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DeployedComponent> getGroupedComponent() {
		if (groupedComponent == null) {
			groupedComponent = new EObjectResolvingEList<DeployedComponent>(DeployedComponent.class, this, PlatformPackage.DEPLOYED_SOFTWARE_SYSTEM__GROUPED_COMPONENT);
		}
		return groupedComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PlatformPackage.DEPLOYED_SOFTWARE_SYSTEM__GROUPED_COMPONENT:
				return getGroupedComponent();
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
			case PlatformPackage.DEPLOYED_SOFTWARE_SYSTEM__GROUPED_COMPONENT:
				getGroupedComponent().clear();
				getGroupedComponent().addAll((Collection<? extends DeployedComponent>)newValue);
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
			case PlatformPackage.DEPLOYED_SOFTWARE_SYSTEM__GROUPED_COMPONENT:
				getGroupedComponent().clear();
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
			case PlatformPackage.DEPLOYED_SOFTWARE_SYSTEM__GROUPED_COMPONENT:
				return groupedComponent != null && !groupedComponent.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DeployedSoftwareSystemImpl
