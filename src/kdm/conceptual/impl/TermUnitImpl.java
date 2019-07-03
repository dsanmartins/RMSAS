/**
 */
package kdm.conceptual.impl;

import java.util.Collection;

import kdm.action.ActionElement;

import kdm.conceptual.AbstractConceptualRelationship;
import kdm.conceptual.ConceptualPackage;
import kdm.conceptual.TermUnit;

import kdm.core.KDMEntity;

import kdm.core.impl.KDMEntityImpl;

import kdm.source.SourceRef;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Term Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kdm.conceptual.impl.TermUnitImpl#getSource <em>Source</em>}</li>
 *   <li>{@link kdm.conceptual.impl.TermUnitImpl#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link kdm.conceptual.impl.TermUnitImpl#getConceptualRelation <em>Conceptual Relation</em>}</li>
 *   <li>{@link kdm.conceptual.impl.TermUnitImpl#getAbstraction <em>Abstraction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TermUnitImpl extends KDMEntityImpl implements TermUnit {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected EList<SourceRef> source;

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
	 * The cached value of the '{@link #getConceptualRelation() <em>Conceptual Relation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConceptualRelation()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractConceptualRelationship> conceptualRelation;

	/**
	 * The cached value of the '{@link #getAbstraction() <em>Abstraction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstraction()
	 * @generated
	 * @ordered
	 */
	protected EList<ActionElement> abstraction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TermUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConceptualPackage.Literals.TERM_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SourceRef> getSource() {
		if (source == null) {
			source = new EObjectContainmentEList<SourceRef>(SourceRef.class, this, ConceptualPackage.TERM_UNIT__SOURCE);
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<KDMEntity> getImplementation() {
		if (implementation == null) {
			implementation = new EObjectResolvingEList<KDMEntity>(KDMEntity.class, this, ConceptualPackage.TERM_UNIT__IMPLEMENTATION);
		}
		return implementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractConceptualRelationship> getConceptualRelation() {
		if (conceptualRelation == null) {
			conceptualRelation = new EObjectContainmentEList<AbstractConceptualRelationship>(AbstractConceptualRelationship.class, this, ConceptualPackage.TERM_UNIT__CONCEPTUAL_RELATION);
		}
		return conceptualRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ActionElement> getAbstraction() {
		if (abstraction == null) {
			abstraction = new EObjectContainmentEList<ActionElement>(ActionElement.class, this, ConceptualPackage.TERM_UNIT__ABSTRACTION);
		}
		return abstraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConceptualPackage.TERM_UNIT__SOURCE:
				return ((InternalEList<?>)getSource()).basicRemove(otherEnd, msgs);
			case ConceptualPackage.TERM_UNIT__CONCEPTUAL_RELATION:
				return ((InternalEList<?>)getConceptualRelation()).basicRemove(otherEnd, msgs);
			case ConceptualPackage.TERM_UNIT__ABSTRACTION:
				return ((InternalEList<?>)getAbstraction()).basicRemove(otherEnd, msgs);
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
			case ConceptualPackage.TERM_UNIT__SOURCE:
				return getSource();
			case ConceptualPackage.TERM_UNIT__IMPLEMENTATION:
				return getImplementation();
			case ConceptualPackage.TERM_UNIT__CONCEPTUAL_RELATION:
				return getConceptualRelation();
			case ConceptualPackage.TERM_UNIT__ABSTRACTION:
				return getAbstraction();
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
			case ConceptualPackage.TERM_UNIT__SOURCE:
				getSource().clear();
				getSource().addAll((Collection<? extends SourceRef>)newValue);
				return;
			case ConceptualPackage.TERM_UNIT__IMPLEMENTATION:
				getImplementation().clear();
				getImplementation().addAll((Collection<? extends KDMEntity>)newValue);
				return;
			case ConceptualPackage.TERM_UNIT__CONCEPTUAL_RELATION:
				getConceptualRelation().clear();
				getConceptualRelation().addAll((Collection<? extends AbstractConceptualRelationship>)newValue);
				return;
			case ConceptualPackage.TERM_UNIT__ABSTRACTION:
				getAbstraction().clear();
				getAbstraction().addAll((Collection<? extends ActionElement>)newValue);
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
			case ConceptualPackage.TERM_UNIT__SOURCE:
				getSource().clear();
				return;
			case ConceptualPackage.TERM_UNIT__IMPLEMENTATION:
				getImplementation().clear();
				return;
			case ConceptualPackage.TERM_UNIT__CONCEPTUAL_RELATION:
				getConceptualRelation().clear();
				return;
			case ConceptualPackage.TERM_UNIT__ABSTRACTION:
				getAbstraction().clear();
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
			case ConceptualPackage.TERM_UNIT__SOURCE:
				return source != null && !source.isEmpty();
			case ConceptualPackage.TERM_UNIT__IMPLEMENTATION:
				return implementation != null && !implementation.isEmpty();
			case ConceptualPackage.TERM_UNIT__CONCEPTUAL_RELATION:
				return conceptualRelation != null && !conceptualRelation.isEmpty();
			case ConceptualPackage.TERM_UNIT__ABSTRACTION:
				return abstraction != null && !abstraction.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TermUnitImpl