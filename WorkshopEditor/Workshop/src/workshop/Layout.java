/**
 */
package workshop;

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
 *   <li>{@link workshop.Layout#getEdges <em>Edges</em>}</li>
 *   <li>{@link workshop.Layout#getNodes <em>Nodes</em>}</li>
 * </ul>
 *
 * @see workshop.WorkshopPackage#getLayout()
 * @model
 * @generated
 */
public interface Layout extends EObject {
	/**
	 * Returns the value of the '<em><b>Edges</b></em>' containment reference list.
	 * The list contents are of type {@link workshop.Edge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edges</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edges</em>' containment reference list.
	 * @see workshop.WorkshopPackage#getLayout_Edges()
	 * @model containment="true"
	 * @generated
	 */
	EList<Edge> getEdges();

	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link workshop.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see workshop.WorkshopPackage#getLayout_Nodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getNodes();

} // Layout
