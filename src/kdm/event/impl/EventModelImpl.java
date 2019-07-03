/**
 */
package kdm.event.impl;

import java.util.Collection;

import kdm.event.AbstractEventElement;
import kdm.event.EventModel;
import kdm.event.EventPackage;

import kdm.kdm.impl.KDMModelImpl;

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
 *   <li>{@link kdm.event.impl.EventModelImpl#getEventElement <em>Event Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventModelImpl extends KDMModelImpl implements EventModel {
	/**
	 * The cached value of the '{@link #getEventElement() <em>Event Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventElement()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractEventElement> eventElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EventPackage.Literals.EVENT_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractEventElement> getEventElement() {
		if (eventElement == null) {
			eventElement = new EObjectContainmentEList<AbstractEventElement>(AbstractEventElement.class, this, EventPackage.EVENT_MODEL__EVENT_ELEMENT);
		}
		return eventElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EventPackage.EVENT_MODEL__EVENT_ELEMENT:
				return ((InternalEList<?>)getEventElement()).basicRemove(otherEnd, msgs);
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
			case EventPackage.EVENT_MODEL__EVENT_ELEMENT:
				return getEventElement();
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
			case EventPackage.EVENT_MODEL__EVENT_ELEMENT:
				getEventElement().clear();
				getEventElement().addAll((Collection<? extends AbstractEventElement>)newValue);
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
			case EventPackage.EVENT_MODEL__EVENT_ELEMENT:
				getEventElement().clear();
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
			case EventPackage.EVENT_MODEL__EVENT_ELEMENT:
				return eventElement != null && !eventElement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EventModelImpl
