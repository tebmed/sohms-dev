/**
 */
package Workshop;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Layout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Workshop.Layout#getNode <em>Node</em>}</li>
 *   <li>{@link Workshop.Layout#getArc <em>Arc</em>}</li>
 * </ul>
 *
 * @see Workshop.WorkshopPackage#getLayout()
 * @model
 * @generated
 */
public interface Layout extends EObject {
	/**
	 * Returns the value of the '<em><b>Node</b></em>' containment reference list.
	 * The list contents are of type {@link Workshop.Station}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' containment reference list.
	 * @see Workshop.WorkshopPackage#getLayout_Node()
	 * @model containment="true"
	 * @generated
	 */
	EList<Station> getNode();

	/**
	 * Returns the value of the '<em><b>Arc</b></em>' containment reference list.
	 * The list contents are of type {@link Workshop.Arc}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arc</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arc</em>' containment reference list.
	 * @see Workshop.WorkshopPackage#getLayout_Arc()
	 * @model containment="true"
	 * @generated
	 */
	EList<Arc> getArc();

} // Layout
