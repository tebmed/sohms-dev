/**
 */
package workshop;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assembly</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link workshop.Assembly#getAssemblymachine <em>Assemblymachine</em>}</li>
 * </ul>
 *
 * @see workshop.WorkshopPackage#getAssembly()
 * @model
 * @generated
 */
public interface Assembly extends Workstation {
	/**
	 * Returns the value of the '<em><b>Assemblymachine</b></em>' containment reference list.
	 * The list contents are of type {@link workshop.AssemblyMachine}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assemblymachine</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assemblymachine</em>' containment reference list.
	 * @see workshop.WorkshopPackage#getAssembly_Assemblymachine()
	 * @model containment="true"
	 * @generated
	 */
	EList<AssemblyMachine> getAssemblymachine();

} // Assembly
