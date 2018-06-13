/**
 */
package workshop;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conveyor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link workshop.Conveyor#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @see workshop.WorkshopPackage#getConveyor()
 * @model
 * @generated
 */
public interface Conveyor extends Transporter {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link workshop.FlowItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Items</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see workshop.WorkshopPackage#getConveyor_Items()
	 * @model containment="true"
	 * @generated
	 */
	EList<FlowItem> getItems();

} // Conveyor
