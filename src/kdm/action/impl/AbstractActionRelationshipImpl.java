/**
 */
package kdm.action.impl;

import kdm.action.AbstractActionRelationship;
import kdm.action.ActionPackage;

import kdm.core.impl.KDMRelationshipImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Action Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class AbstractActionRelationshipImpl extends KDMRelationshipImpl implements AbstractActionRelationship {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractActionRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActionPackage.Literals.ABSTRACT_ACTION_RELATIONSHIP;
	}

} //AbstractActionRelationshipImpl
