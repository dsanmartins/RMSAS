/**
 */
package kdm.conceptual;

import kdm.core.KDMEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kdm.conceptual.ConceptualRelationship#getTo <em>To</em>}</li>
 *   <li>{@link kdm.conceptual.ConceptualRelationship#getFrom <em>From</em>}</li>
 * </ul>
 *
 * @see kdm.conceptual.ConceptualPackage#getConceptualRelationship()
 * @model
 * @generated
 */
public interface ConceptualRelationship extends AbstractConceptualRelationship {
	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(KDMEntity)
	 * @see kdm.conceptual.ConceptualPackage#getConceptualRelationship_To()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	KDMEntity getTo();

	/**
	 * Sets the value of the '{@link kdm.conceptual.ConceptualRelationship#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(KDMEntity value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(AbstractConceptualElement)
	 * @see kdm.conceptual.ConceptualPackage#getConceptualRelationship_From()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	AbstractConceptualElement getFrom();

	/**
	 * Sets the value of the '{@link kdm.conceptual.ConceptualRelationship#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(AbstractConceptualElement value);

} // ConceptualRelationship