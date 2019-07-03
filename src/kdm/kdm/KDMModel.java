/**
 */
package kdm.kdm;

import kdm.core.KDMEntity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>KDM Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A KDM model corresponds to one of the well-known architecture views of software systems. KDM defines several
 * concrete subclasses of the KDMModel class.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kdm.kdm.KDMModel#getOwnedElement <em>Owned Element</em>}</li>
 * </ul>
 *
 * @see kdm.kdm.KdmPackage#getKDMModel()
 * @model abstract="true"
 * @generated
 */
public interface KDMModel extends KDMFramework {
	/**
	 * Returns the value of the '<em><b>Owned Element</b></em>' reference list.
	 * The list contents are of type {@link kdm.core.KDMEntity}.
	 * It is bidirectional and its opposite is '{@link kdm.core.KDMEntity#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Instances of KDM entities owned by the model. Each KDM
	 * model defines specific subclasses of KDMEntity class.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Element</em>' reference list.
	 * @see kdm.kdm.KdmPackage#getKDMModel_OwnedElement()
	 * @see kdm.core.KDMEntity#getModel
	 * @model opposite="model" changeable="false" derived="true"
	 *        annotation="union"
	 * @generated
	 */
	EList<KDMEntity> getOwnedElement();

} // KDMModel
