/**
 */
package kdm.code;

import kdm.kdm.KDMModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kdm.code.CodeModel#getCodeElement <em>Code Element</em>}</li>
 * </ul>
 *
 * @see kdm.code.CodePackage#getCodeModel()
 * @model
 * @generated
 */
public interface CodeModel extends KDMModel {
	/**
	 * Returns the value of the '<em><b>Code Element</b></em>' containment reference list.
	 * The list contents are of type {@link kdm.code.AbstractCodeElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Element</em>' containment reference list.
	 * @see kdm.code.CodePackage#getCodeModel_CodeElement()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractCodeElement> getCodeElement();

} // CodeModel
