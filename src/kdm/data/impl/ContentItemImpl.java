/**
 */
package kdm.data.impl;

import java.util.Collection;

import kdm.action.ActionElement;

import kdm.core.impl.KDMEntityImpl;

import kdm.data.AbstractContentElement;
import kdm.data.AbstractDataRelationship;
import kdm.data.ComplexContentType;
import kdm.data.ContentItem;
import kdm.data.DataPackage;

import kdm.source.SourceRef;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Content Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kdm.data.impl.ContentItemImpl#getSource <em>Source</em>}</li>
 *   <li>{@link kdm.data.impl.ContentItemImpl#getDataRelation <em>Data Relation</em>}</li>
 *   <li>{@link kdm.data.impl.ContentItemImpl#getAbstraction <em>Abstraction</em>}</li>
 *   <li>{@link kdm.data.impl.ContentItemImpl#getType <em>Type</em>}</li>
 *   <li>{@link kdm.data.impl.ContentItemImpl#getContentElement <em>Content Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContentItemImpl extends KDMEntityImpl implements ContentItem {
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
	 * The cached value of the '{@link #getDataRelation() <em>Data Relation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataRelation()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractDataRelationship> dataRelation;

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
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ComplexContentType type;

	/**
	 * The cached value of the '{@link #getContentElement() <em>Content Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentElement()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractContentElement> contentElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContentItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataPackage.Literals.CONTENT_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SourceRef> getSource() {
		if (source == null) {
			source = new EObjectContainmentEList<SourceRef>(SourceRef.class, this, DataPackage.CONTENT_ITEM__SOURCE);
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractDataRelationship> getDataRelation() {
		if (dataRelation == null) {
			dataRelation = new EObjectContainmentEList<AbstractDataRelationship>(AbstractDataRelationship.class, this, DataPackage.CONTENT_ITEM__DATA_RELATION);
		}
		return dataRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ActionElement> getAbstraction() {
		if (abstraction == null) {
			abstraction = new EObjectContainmentEList<ActionElement>(ActionElement.class, this, DataPackage.CONTENT_ITEM__ABSTRACTION);
		}
		return abstraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComplexContentType getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (ComplexContentType)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataPackage.CONTENT_ITEM__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexContentType basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(ComplexContentType newType) {
		ComplexContentType oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.CONTENT_ITEM__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractContentElement> getContentElement() {
		if (contentElement == null) {
			contentElement = new EObjectContainmentEList<AbstractContentElement>(AbstractContentElement.class, this, DataPackage.CONTENT_ITEM__CONTENT_ELEMENT);
		}
		return contentElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataPackage.CONTENT_ITEM__SOURCE:
				return ((InternalEList<?>)getSource()).basicRemove(otherEnd, msgs);
			case DataPackage.CONTENT_ITEM__DATA_RELATION:
				return ((InternalEList<?>)getDataRelation()).basicRemove(otherEnd, msgs);
			case DataPackage.CONTENT_ITEM__ABSTRACTION:
				return ((InternalEList<?>)getAbstraction()).basicRemove(otherEnd, msgs);
			case DataPackage.CONTENT_ITEM__CONTENT_ELEMENT:
				return ((InternalEList<?>)getContentElement()).basicRemove(otherEnd, msgs);
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
			case DataPackage.CONTENT_ITEM__SOURCE:
				return getSource();
			case DataPackage.CONTENT_ITEM__DATA_RELATION:
				return getDataRelation();
			case DataPackage.CONTENT_ITEM__ABSTRACTION:
				return getAbstraction();
			case DataPackage.CONTENT_ITEM__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case DataPackage.CONTENT_ITEM__CONTENT_ELEMENT:
				return getContentElement();
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
			case DataPackage.CONTENT_ITEM__SOURCE:
				getSource().clear();
				getSource().addAll((Collection<? extends SourceRef>)newValue);
				return;
			case DataPackage.CONTENT_ITEM__DATA_RELATION:
				getDataRelation().clear();
				getDataRelation().addAll((Collection<? extends AbstractDataRelationship>)newValue);
				return;
			case DataPackage.CONTENT_ITEM__ABSTRACTION:
				getAbstraction().clear();
				getAbstraction().addAll((Collection<? extends ActionElement>)newValue);
				return;
			case DataPackage.CONTENT_ITEM__TYPE:
				setType((ComplexContentType)newValue);
				return;
			case DataPackage.CONTENT_ITEM__CONTENT_ELEMENT:
				getContentElement().clear();
				getContentElement().addAll((Collection<? extends AbstractContentElement>)newValue);
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
			case DataPackage.CONTENT_ITEM__SOURCE:
				getSource().clear();
				return;
			case DataPackage.CONTENT_ITEM__DATA_RELATION:
				getDataRelation().clear();
				return;
			case DataPackage.CONTENT_ITEM__ABSTRACTION:
				getAbstraction().clear();
				return;
			case DataPackage.CONTENT_ITEM__TYPE:
				setType((ComplexContentType)null);
				return;
			case DataPackage.CONTENT_ITEM__CONTENT_ELEMENT:
				getContentElement().clear();
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
			case DataPackage.CONTENT_ITEM__SOURCE:
				return source != null && !source.isEmpty();
			case DataPackage.CONTENT_ITEM__DATA_RELATION:
				return dataRelation != null && !dataRelation.isEmpty();
			case DataPackage.CONTENT_ITEM__ABSTRACTION:
				return abstraction != null && !abstraction.isEmpty();
			case DataPackage.CONTENT_ITEM__TYPE:
				return type != null;
			case DataPackage.CONTENT_ITEM__CONTENT_ELEMENT:
				return contentElement != null && !contentElement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContentItemImpl