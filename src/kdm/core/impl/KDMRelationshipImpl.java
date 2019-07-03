/**
 */
package kdm.core.impl;

import java.lang.reflect.InvocationTargetException;

import kdm.core.CorePackage;
import kdm.core.KDMEntity;
import kdm.core.KDMRelationship;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>KDM Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class KDMRelationshipImpl extends ModelElementImpl implements KDMRelationship {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KDMRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.KDM_RELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KDMEntity getFrom() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KDMEntity getTo() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CorePackage.KDM_RELATIONSHIP___GET_FROM:
				return getFrom();
			case CorePackage.KDM_RELATIONSHIP___GET_TO:
				return getTo();
		}
		return super.eInvoke(operationID, arguments);
	}

} //KDMRelationshipImpl
