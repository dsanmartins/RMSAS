/**
 */
package kdm.core;

import kdm.kdm.Annotation;
import kdm.kdm.Attribute;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An element is an atomic constituent of a model. In the meta-model, an Element is the top meta-element in the KDM class
 * hierarchy. Element is an abstract meta-model element.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kdm.core.Element#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link kdm.core.Element#getAnnotation <em>Annotation</em>}</li>
 * </ul>
 *
 * @see kdm.core.CorePackage#getElement()
 * @model abstract="true"
 * @generated
 */
public interface Element extends EObject {
	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link kdm.kdm.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of attributes owned by the given element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attribute</em>' containment reference list.
	 * @see kdm.core.CorePackage#getElement_Attribute()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Attribute> getAttribute();

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference list.
	 * The list contents are of type {@link kdm.kdm.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of annotations owned by the given element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference list.
	 * @see kdm.core.CorePackage#getElement_Annotation()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Annotation> getAnnotation();

} // Element
