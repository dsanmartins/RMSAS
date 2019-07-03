/**
 */
package kdm.build.impl;

import java.util.Collection;

import kdm.build.AbstractBuildElement;
import kdm.build.AbstractBuildRelationship;
import kdm.build.BuildPackage;
import kdm.build.BuildResource;

import kdm.core.KDMEntity;

import kdm.core.impl.KDMEntityImpl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kdm.build.impl.BuildResourceImpl#getBuildRelation <em>Build Relation</em>}</li>
 *   <li>{@link kdm.build.impl.BuildResourceImpl#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link kdm.build.impl.BuildResourceImpl#getGroupedBuild <em>Grouped Build</em>}</li>
 *   <li>{@link kdm.build.impl.BuildResourceImpl#getBuildElement <em>Build Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BuildResourceImpl extends KDMEntityImpl implements BuildResource {
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
	 * The cached value of the '{@link #getImplementation() <em>Implementation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementation()
	 * @generated
	 * @ordered
	 */
	protected EList<KDMEntity> implementation;

	/**
	 * The cached value of the '{@link #getGroupedBuild() <em>Grouped Build</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupedBuild()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractBuildElement> groupedBuild;

	/**
	 * The cached value of the '{@link #getBuildElement() <em>Build Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildElement()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractBuildElement> buildElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BuildResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BuildPackage.Literals.BUILD_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractBuildRelationship> getBuildRelation() {
		if (buildRelation == null) {
			buildRelation = new EObjectContainmentEList<AbstractBuildRelationship>(AbstractBuildRelationship.class, this, BuildPackage.BUILD_RESOURCE__BUILD_RELATION);
		}
		return buildRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<KDMEntity> getImplementation() {
		if (implementation == null) {
			implementation = new EObjectResolvingEList<KDMEntity>(KDMEntity.class, this, BuildPackage.BUILD_RESOURCE__IMPLEMENTATION);
		}
		return implementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractBuildElement> getGroupedBuild() {
		if (groupedBuild == null) {
			groupedBuild = new EObjectResolvingEList<AbstractBuildElement>(AbstractBuildElement.class, this, BuildPackage.BUILD_RESOURCE__GROUPED_BUILD);
		}
		return groupedBuild;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractBuildElement> getBuildElement() {
		if (buildElement == null) {
			buildElement = new EObjectContainmentEList<AbstractBuildElement>(AbstractBuildElement.class, this, BuildPackage.BUILD_RESOURCE__BUILD_ELEMENT);
		}
		return buildElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BuildPackage.BUILD_RESOURCE__BUILD_RELATION:
				return ((InternalEList<?>)getBuildRelation()).basicRemove(otherEnd, msgs);
			case BuildPackage.BUILD_RESOURCE__BUILD_ELEMENT:
				return ((InternalEList<?>)getBuildElement()).basicRemove(otherEnd, msgs);
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
			case BuildPackage.BUILD_RESOURCE__BUILD_RELATION:
				return getBuildRelation();
			case BuildPackage.BUILD_RESOURCE__IMPLEMENTATION:
				return getImplementation();
			case BuildPackage.BUILD_RESOURCE__GROUPED_BUILD:
				return getGroupedBuild();
			case BuildPackage.BUILD_RESOURCE__BUILD_ELEMENT:
				return getBuildElement();
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
			case BuildPackage.BUILD_RESOURCE__BUILD_RELATION:
				getBuildRelation().clear();
				getBuildRelation().addAll((Collection<? extends AbstractBuildRelationship>)newValue);
				return;
			case BuildPackage.BUILD_RESOURCE__IMPLEMENTATION:
				getImplementation().clear();
				getImplementation().addAll((Collection<? extends KDMEntity>)newValue);
				return;
			case BuildPackage.BUILD_RESOURCE__GROUPED_BUILD:
				getGroupedBuild().clear();
				getGroupedBuild().addAll((Collection<? extends AbstractBuildElement>)newValue);
				return;
			case BuildPackage.BUILD_RESOURCE__BUILD_ELEMENT:
				getBuildElement().clear();
				getBuildElement().addAll((Collection<? extends AbstractBuildElement>)newValue);
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
			case BuildPackage.BUILD_RESOURCE__BUILD_RELATION:
				getBuildRelation().clear();
				return;
			case BuildPackage.BUILD_RESOURCE__IMPLEMENTATION:
				getImplementation().clear();
				return;
			case BuildPackage.BUILD_RESOURCE__GROUPED_BUILD:
				getGroupedBuild().clear();
				return;
			case BuildPackage.BUILD_RESOURCE__BUILD_ELEMENT:
				getBuildElement().clear();
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
			case BuildPackage.BUILD_RESOURCE__BUILD_RELATION:
				return buildRelation != null && !buildRelation.isEmpty();
			case BuildPackage.BUILD_RESOURCE__IMPLEMENTATION:
				return implementation != null && !implementation.isEmpty();
			case BuildPackage.BUILD_RESOURCE__GROUPED_BUILD:
				return groupedBuild != null && !groupedBuild.isEmpty();
			case BuildPackage.BUILD_RESOURCE__BUILD_ELEMENT:
				return buildElement != null && !buildElement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BuildResourceImpl
