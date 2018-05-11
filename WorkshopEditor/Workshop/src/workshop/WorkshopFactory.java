/**
 */
package workshop;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see workshop.WorkshopPackage
 * @generated
 */
public interface WorkshopFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WorkshopFactory eINSTANCE = workshop.impl.WorkshopFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Layout</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Layout</em>'.
	 * @generated
	 */
	Layout createLayout();

	/**
	 * Returns a new object of class '<em>Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Edge</em>'.
	 * @generated
	 */
	Edge createEdge();

	/**
	 * Returns a new object of class '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node</em>'.
	 * @generated
	 */
	Node createNode();

	/**
	 * Returns a new object of class '<em>Ports</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ports</em>'.
	 * @generated
	 */
	Ports createPorts();

	/**
	 * Returns a new object of class '<em>Input Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Port</em>'.
	 * @generated
	 */
	InputPort createInputPort();

	/**
	 * Returns a new object of class '<em>Output Ports</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output Ports</em>'.
	 * @generated
	 */
	OutputPorts createOutputPorts();

	/**
	 * Returns a new object of class '<em>Workstation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Workstation</em>'.
	 * @generated
	 */
	Workstation createWorkstation();

	/**
	 * Returns a new object of class '<em>Machines</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Machines</em>'.
	 * @generated
	 */
	Machines createMachines();

	/**
	 * Returns a new object of class '<em>Storage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Storage</em>'.
	 * @generated
	 */
	Storage createStorage();

	/**
	 * Returns a new object of class '<em>Assembly</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assembly</em>'.
	 * @generated
	 */
	Assembly createAssembly();

	/**
	 * Returns a new object of class '<em>Empty Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Empty Node</em>'.
	 * @generated
	 */
	EmptyNode createEmptyNode();

	/**
	 * Returns a new object of class '<em>Assembly Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assembly Machine</em>'.
	 * @generated
	 */
	AssemblyMachine createAssemblyMachine();

	/**
	 * Returns a new object of class '<em>Storage Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Storage Machine</em>'.
	 * @generated
	 */
	StorageMachine createStorageMachine();

	/**
	 * Returns a new object of class '<em>AGV</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AGV</em>'.
	 * @generated
	 */
	AGV createAGV();

	/**
	 * Returns a new object of class '<em>Conveyor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conveyor</em>'.
	 * @generated
	 */
	Conveyor createConveyor();

	/**
	 * Returns a new object of class '<em>Linker Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Linker Machine</em>'.
	 * @generated
	 */
	LinkerMachine createLinkerMachine();

	/**
	 * Returns a new object of class '<em>Exchanger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exchanger</em>'.
	 * @generated
	 */
	Exchanger createExchanger();

	/**
	 * Returns a new object of class '<em>Feeder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feeder</em>'.
	 * @generated
	 */
	Feeder createFeeder();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	WorkshopPackage getWorkshopPackage();

} //WorkshopFactory
