/**
 */
package workshop;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transporter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link workshop.Transporter#getFlowitem <em>Flowitem</em>}</li>
 * </ul>
 *
 * @see workshop.WorkshopPackage#getTransporter()
 * @model
 * @generated
 */
public interface Transporter extends Machines {

	/**
	 * Returns the value of the '<em><b>Flowitem</b></em>' containment reference list.
	 * The list contents are of type {@link workshop.FlowItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flowitem</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flowitem</em>' containment reference list.
	 * @see workshop.WorkshopPackage#getTransporter_Flowitem()
	 * @model containment="true"
	 * @generated
	 */
	EList<FlowItem> getFlowitem();
} // Transporter
