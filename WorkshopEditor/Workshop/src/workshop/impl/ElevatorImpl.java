/**
 */
package workshop.impl;

import org.eclipse.emf.ecore.EClass;

import workshop.Elevator;
import workshop.WorkshopPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Elevator</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ElevatorImpl extends TransporterImpl implements Elevator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElevatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkshopPackage.Literals.ELEVATOR;
	}

} //ElevatorImpl
