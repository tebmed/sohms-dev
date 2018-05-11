/**
 */
package workshop;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Storage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link workshop.Storage#getStoragemachine <em>Storagemachine</em>}</li>
 * </ul>
 *
 * @see workshop.WorkshopPackage#getStorage()
 * @model
 * @generated
 */
public interface Storage extends Workstation {
	/**
	 * Returns the value of the '<em><b>Storagemachine</b></em>' containment reference list.
	 * The list contents are of type {@link workshop.StorageMachine}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Storagemachine</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Storagemachine</em>' containment reference list.
	 * @see workshop.WorkshopPackage#getStorage_Storagemachine()
	 * @model containment="true"
	 * @generated
	 */
	EList<StorageMachine> getStoragemachine();

} // Storage
