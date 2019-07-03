/**
 */
package kdm.code.impl;

import java.util.Collection;

import kdm.code.CodeItem;
import kdm.code.CodePackage;
import kdm.code.Namespace;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Namespace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kdm.code.impl.NamespaceImpl#getGroupedCode <em>Grouped Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NamespaceImpl extends CodeItemImpl implements Namespace {
	/**
	 * The cached value of the '{@link #getGroupedCode() <em>Grouped Code</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupedCode()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeItem> groupedCode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamespaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodePackage.Literals.NAMESPACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeItem> getGroupedCode() {
		if (groupedCode == null) {
			groupedCode = new EObjectResolvingEList<CodeItem>(CodeItem.class, this, CodePackage.NAMESPACE__GROUPED_CODE);
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
			case CodePackage.NAMESPACE__GROUPED_CODE:
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
			case CodePackage.NAMESPACE__GROUPED_CODE:
				getGroupedCode().clear();
				getGroupedCode().addAll((Collection<? extends CodeItem>)newValue);
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
			case CodePackage.NAMESPACE__GROUPED_CODE:
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
			case CodePackage.NAMESPACE__GROUPED_CODE:
				return groupedCode != null && !groupedCode.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NamespaceImpl
