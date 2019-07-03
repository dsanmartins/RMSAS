/**
 */
package kdm.build.impl;

import java.util.Collection;

import kdm.build.AbstractBuildRelationship;
import kdm.build.BuildElement;
import kdm.build.BuildPackage;

import kdm.core.impl.KDMEntityImpl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kdm.build.impl.BuildElementImpl#getBuildRelation <em>Build Relation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BuildElementImpl extends KDMEntityImpl implements BuildElement {
	/**
	 * The cached value of the '{@link #getBuildRelation() <em>Build Relation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildRelation()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractBuildRelationship> buildRelation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BuildElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BuildPackage.Literals.BUILD_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractBuildRelationship> getBuildRelation() {
		if (buildRelation == null) {
			buildRelation = new EObjectContainmentEList<AbstractBuildRelationship>(AbstractBuildRelationship.class, this, BuildPackage.BUILD_ELEMENT__BUILD_RELATION);
		}
		return buildRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BuildPackage.BUILD_ELEMENT__BUILD_RELATION:
				return ((InternalEList<?>)getBuildRelation()).basicRemove(otherEnd, msgs);
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
			case BuildPackage.BUILD_ELEMENT__BUILD_RELATION:
				return getBuildRelation();
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
			case BuildPackage.BUILD_ELEMENT__BUILD_RELATION:
				getBuildRelation().clear();
				getBuildRelation().addAll((Collection<? extends AbstractBuildRelationship>)newValue);
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
			case BuildPackage.BUILD_ELEMENT__BUILD_RELATION:
				getBuildRelation().clear();
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
			case BuildPackage.BUILD_ELEMENT__BUILD_RELATION:
				return buildRelation != null && !buildRelation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BuildElementImpl
