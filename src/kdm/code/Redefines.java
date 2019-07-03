/**
 */
package kdm.code;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Redefines</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kdm.code.Redefines#getTo <em>To</em>}</li>
 *   <li>{@link kdm.code.Redefines#getFrom <em>From</em>}</li>
 * </ul>
 *
 * @see kdm.code.CodePackage#getRedefines()
 * @model
 * @generated
 */
public interface Redefines extends AbstractCodeRelationship {
	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(MacroUnit)
	 * @see kdm.code.CodePackage#getRedefines_To()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	MacroUnit getTo();

	/**
	 * Sets the value of the '{@link kdm.code.Redefines#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(MacroUnit value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(PreprocessorDirective)
	 * @see kdm.code.CodePackage#getRedefines_From()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	PreprocessorDirective getFrom();

	/**
	 * Sets the value of the '{@link kdm.code.Redefines#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(PreprocessorDirective value);

} // Redefines