/**
 */
package kdm.platform.impl;

import java.util.Collection;

import kdm.platform.DeployedComponent;
import kdm.platform.PlatformPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployed Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kdm.platform.impl.DeployedComponentImpl#getGroupedCode <em>Grouped Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeployedComponentImpl extends AbstractPlatformElementImpl implements DeployedComponent {
	/**
	 * The cached value of the '{@link #getGroupedCode() <em>Grouped Code</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupedCode()
	 * @generated
	 * @ordered
	 */
	protected EList<kdm.code.Module> groupedCode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeployedComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlatformPackage.Literals.DEPLOYED_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<kdm.code.Module> getGroupedCode() {
		if (groupedCode == null) {
			groupedCode = new EObjectResolvingEList<kdm.code.Module>(kdm.code.Module.class, this, PlatformPackage.DEPLOYED_COMPONENT__GROUPED_CODE);
		}
		return groupedCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PlatformPackage.DEPLOYED_COMPONENT__GROUPED_CODE:
				return getGroupedCode();
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
			case PlatformPackage.DEPLOYED_COMPONENT__GROUPED_CODE:
				getGroupedCode().clear();
				getGroupedCode().addAll((Collection<? extends kdm.code.Module>)newValue);
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
			case PlatformPackage.DEPLOYED_COMPONENT__GROUPED_CODE:
				getGroupedCode().clear();
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
			case PlatformPackage.DEPLOYED_COMPONENT__GROUPED_CODE:
				return groupedCode != null && !groupedCode.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DeployedComponentImpl
