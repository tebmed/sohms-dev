/**
 */
package Workshop;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Workshop.Arc#getFromN <em>From N</em>}</li>
 *   <li>{@link Workshop.Arc#getToN <em>To N</em>}</li>
 *   <li>{@link Workshop.Arc#getId <em>Id</em>}</li>
 *   <li>{@link Workshop.Arc#getCost <em>Cost</em>}</li>
 * </ul>
 *
 * @see Workshop.WorkshopPackage#getArc()
 * @model
 * @generated
 */
public interface Arc extends EObject {
	/**
	 * Returns the value of the '<em><b>From N</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From N</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From N</em>' reference.
	 * @see #setFromN(Station)
	 * @see Workshop.WorkshopPackage#getArc_FromN()
	 * @model required="true"
	 * @generated
	 */
	Station getFromN();

	/**
	 * Sets the value of the '{@link Workshop.Arc#getFromN <em>From N</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From N</em>' reference.
	 * @see #getFromN()
	 * @generated
	 */
	void setFromN(Station value);

	/**
	 * Returns the value of the '<em><b>To N</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To N</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To N</em>' reference.
	 * @see #setToN(Station)
	 * @see Workshop.WorkshopPackage#getArc_ToN()
	 * @model required="true"
	 * @generated
	 */
	Station getToN();

	/**
	 * Sets the value of the '{@link Workshop.Arc#getToN <em>To N</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To N</em>' reference.
	 * @see #getToN()
	 * @generated
	 */
	void setToN(Station value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see Workshop.WorkshopPackage#getArc_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link Workshop.Arc#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost</em>' attribute.
	 * @see #setCost(int)
	 * @see Workshop.WorkshopPackage#getArc_Cost()
	 * @model
	 * @generated
	 */
	int getCost();

	/**
	 * Sets the value of the '{@link Workshop.Arc#getCost <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost</em>' attribute.
	 * @see #getCost()
	 * @generated
	 */
	void setCost(int value);

} // Arc
