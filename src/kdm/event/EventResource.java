/**
 */
package kdm.event;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kdm.event.EventResource#getEventElement <em>Event Element</em>}</li>
 * </ul>
 *
 * @see kdm.event.EventPackage#getEventResource()
 * @model
 * @generated
 */
public interface EventResource extends AbstractEventElement {
	/**
	 * Returns the value of the '<em><b>Event Element</b></em>' containment reference list.
	 * The list contents are of type {@link kdm.event.AbstractEventElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Element</em>' containment reference list.
	 * @see kdm.event.EventPackage#getEventResource_EventElement()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<AbstractEventElement> getEventElement();

} // EventResource
