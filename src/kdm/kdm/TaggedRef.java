/**
 */
package kdm.kdm;

import kdm.core.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tagged Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kdm.kdm.TaggedRef#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @see kdm.kdm.KdmPackage#getTaggedRef()
 * @model
 * @generated
 */
public interface TaggedRef extends ExtendedValue {
	/**
	 * Returns the value of the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' reference.
	 * @see #setRef(ModelElement)
	 * @see kdm.kdm.KdmPackage#getTaggedRef_Ref()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ModelElement getRef();

	/**
	 * Sets the value of the '{@link kdm.kdm.TaggedRef#getRef <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' reference.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(ModelElement value);

} // TaggedRef
