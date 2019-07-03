/**
 */
package kdm.structure.impl;

import java.util.Collection;

import kdm.core.AggregatedRelationship;
import kdm.core.KDMEntity;

import kdm.core.impl.KDMEntityImpl;

import kdm.structure.AbstractStructureElement;
import kdm.structure.AbstractStructureRelationship;
import kdm.structure.StructureElement;
import kdm.structure.StructurePackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kdm.structure.impl.StructureElementImpl#getAggregated <em>Aggregated</em>}</li>
 *   <li>{@link kdm.structure.impl.StructureElementImpl#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link kdm.structure.impl.StructureElementImpl#getStructureElement <em>Structure Element</em>}</li>
 *   <li>{@link kdm.structure.impl.StructureElementImpl#getStructureRelationship <em>Structure Relationship</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StructureElementImpl extends KDMEntityImpl implements StructureElement {
	/**
	 * The cached value of the '{@link #getAggregated() <em>Aggregated</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregated()
	 * @generated
	 * @ordered
	 */
	protected EList<AggregatedRelationship> aggregated;

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
	 * The cached value of the '{@link #getStructureElement() <em>Structure Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructureElement()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractStructureElement> structureElement;

	/**
	 * The cached value of the '{@link #getStructureRelationship() <em>Structure Relationship</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructureRelationship()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractStructureRelationship> structureRelationship;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructureElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.Literals.STRUCTURE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AggregatedRelationship> getAggregated() {
		if (aggregated == null) {
			aggregated = new EObjectContainmentEList<AggregatedRelationship>(AggregatedRelationship.class, this, StructurePackage.STRUCTURE_ELEMENT__AGGREGATED);
		}
		return aggregated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<KDMEntity> getImplementation() {
		if (implementation == null) {
			implementation = new EObjectResolvingEList<KDMEntity>(KDMEntity.class, this, StructurePackage.STRUCTURE_ELEMENT__IMPLEMENTATION);
		}
		return implementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractStructureElement> getStructureElement() {
		if (structureElement == null) {
			structureElement = new EObjectContainmentEList<AbstractStructureElement>(AbstractStructureElement.class, this, StructurePackage.STRUCTURE_ELEMENT__STRUCTURE_ELEMENT);
		}
		return structureElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractStructureRelationship> getStructureRelationship() {
		if (structureRelationship == null) {
			structureRelationship = new EObjectContainmentEList<AbstractStructureRelationship>(AbstractStructureRelationship.class, this, StructurePackage.STRUCTURE_ELEMENT__STRUCTURE_RELATIONSHIP);
		}
		return structureRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StructurePackage.STRUCTURE_ELEMENT__AGGREGATED:
				return ((InternalEList<?>)getAggregated()).basicRemove(otherEnd, msgs);
			case StructurePackage.STRUCTURE_ELEMENT__STRUCTURE_ELEMENT:
				return ((InternalEList<?>)getStructureElement()).basicRemove(otherEnd, msgs);
			case StructurePackage.STRUCTURE_ELEMENT__STRUCTURE_RELATIONSHIP:
				return ((InternalEList<?>)getStructureRelationship()).basicRemove(otherEnd, msgs);
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
			case StructurePackage.STRUCTURE_ELEMENT__AGGREGATED:
				return getAggregated();
			case StructurePackage.STRUCTURE_ELEMENT__IMPLEMENTATION:
				return getImplementation();
			case StructurePackage.STRUCTURE_ELEMENT__STRUCTURE_ELEMENT:
				return getStructureElement();
			case StructurePackage.STRUCTURE_ELEMENT__STRUCTURE_RELATIONSHIP:
				return getStructureRelationship();
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
			case StructurePackage.STRUCTURE_ELEMENT__AGGREGATED:
				getAggregated().clear();
				getAggregated().addAll((Collection<? extends AggregatedRelationship>)newValue);
				return;
			case StructurePackage.STRUCTURE_ELEMENT__IMPLEMENTATION:
				getImplementation().clear();
				getImplementation().addAll((Collection<? extends KDMEntity>)newValue);
				return;
			case StructurePackage.STRUCTURE_ELEMENT__STRUCTURE_ELEMENT:
				getStructureElement().clear();
				getStructureElement().addAll((Collection<? extends AbstractStructureElement>)newValue);
				return;
			case StructurePackage.STRUCTURE_ELEMENT__STRUCTURE_RELATIONSHIP:
				getStructureRelationship().clear();
				getStructureRelationship().addAll((Collection<? extends AbstractStructureRelationship>)newValue);
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
			case StructurePackage.STRUCTURE_ELEMENT__AGGREGATED:
				getAggregated().clear();
				return;
			case StructurePackage.STRUCTURE_ELEMENT__IMPLEMENTATION:
				getImplementation().clear();
				return;
			case StructurePackage.STRUCTURE_ELEMENT__STRUCTURE_ELEMENT:
				getStructureElement().clear();
				return;
			case StructurePackage.STRUCTURE_ELEMENT__STRUCTURE_RELATIONSHIP:
				getStructureRelationship().clear();
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
			case StructurePackage.STRUCTURE_ELEMENT__AGGREGATED:
				return aggregated != null && !aggregated.isEmpty();
			case StructurePackage.STRUCTURE_ELEMENT__IMPLEMENTATION:
				return implementation != null && !implementation.isEmpty();
			case StructurePackage.STRUCTURE_ELEMENT__STRUCTURE_ELEMENT:
				return structureElement != null && !structureElement.isEmpty();
			case StructurePackage.STRUCTURE_ELEMENT__STRUCTURE_RELATIONSHIP:
				return structureRelationship != null && !structureRelationship.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StructureElementImpl
