/**
 */
package workshop.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import workshop.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see workshop.WorkshopPackage
 * @generated
 */
public class WorkshopSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WorkshopPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkshopSwitch() {
		if (modelPackage == null) {
			modelPackage = WorkshopPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case WorkshopPackage.LAYOUT: {
				Layout layout = (Layout)theEObject;
				T result = caseLayout(layout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkshopPackage.NODE: {
				Node node = (Node)theEObject;
				T result = caseNode(node);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkshopPackage.WORKSTATION: {
				Workstation workstation = (Workstation)theEObject;
				T result = caseWorkstation(workstation);
				if (result == null) result = caseNode(workstation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkshopPackage.MACHINES: {
				Machines machines = (Machines)theEObject;
				T result = caseMachines(machines);
				if (result == null) result = caseNode(machines);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkshopPackage.STORAGE: {
				Storage storage = (Storage)theEObject;
				T result = caseStorage(storage);
				if (result == null) result = caseWorkstation(storage);
				if (result == null) result = caseNode(storage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkshopPackage.ASSEMBLY: {
				Assembly assembly = (Assembly)theEObject;
				T result = caseAssembly(assembly);
				if (result == null) result = caseWorkstation(assembly);
				if (result == null) result = caseNode(assembly);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkshopPackage.EMPTY_NODE: {
				EmptyNode emptyNode = (EmptyNode)theEObject;
				T result = caseEmptyNode(emptyNode);
				if (result == null) result = caseNode(emptyNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkshopPackage.ASSEMBLY_MACHINE: {
				AssemblyMachine assemblyMachine = (AssemblyMachine)theEObject;
				T result = caseAssemblyMachine(assemblyMachine);
				if (result == null) result = caseMachines(assemblyMachine);
				if (result == null) result = caseNode(assemblyMachine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkshopPackage.STORAGE_MACHINE: {
				StorageMachine storageMachine = (StorageMachine)theEObject;
				T result = caseStorageMachine(storageMachine);
				if (result == null) result = caseMachines(storageMachine);
				if (result == null) result = caseNode(storageMachine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkshopPackage.AGV: {
				AGV agv = (AGV)theEObject;
				T result = caseAGV(agv);
				if (result == null) result = caseMachines(agv);
				if (result == null) result = caseNode(agv);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkshopPackage.CONVEYOR: {
				Conveyor conveyor = (Conveyor)theEObject;
				T result = caseConveyor(conveyor);
				if (result == null) result = caseMachines(conveyor);
				if (result == null) result = caseNode(conveyor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkshopPackage.LINKER_MACHINE: {
				LinkerMachine linkerMachine = (LinkerMachine)theEObject;
				T result = caseLinkerMachine(linkerMachine);
				if (result == null) result = caseMachines(linkerMachine);
				if (result == null) result = caseNode(linkerMachine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkshopPackage.EXCHANGER: {
				Exchanger exchanger = (Exchanger)theEObject;
				T result = caseExchanger(exchanger);
				if (result == null) result = caseLinkerMachine(exchanger);
				if (result == null) result = caseMachines(exchanger);
				if (result == null) result = caseNode(exchanger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkshopPackage.FEEDER: {
				Feeder feeder = (Feeder)theEObject;
				T result = caseFeeder(feeder);
				if (result == null) result = caseLinkerMachine(feeder);
				if (result == null) result = caseMachines(feeder);
				if (result == null) result = caseNode(feeder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkshopPackage.PORTS: {
				Ports ports = (Ports)theEObject;
				T result = casePorts(ports);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Layout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLayout(Layout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workstation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workstation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkstation(Workstation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Machines</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Machines</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMachines(Machines object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Storage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Storage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStorage(Storage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assembly</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assembly</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssembly(Assembly object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Empty Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Empty Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmptyNode(EmptyNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assembly Machine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assembly Machine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssemblyMachine(AssemblyMachine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Storage Machine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Storage Machine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStorageMachine(StorageMachine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AGV</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AGV</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAGV(AGV object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conveyor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conveyor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConveyor(Conveyor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Linker Machine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Linker Machine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkerMachine(LinkerMachine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exchanger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exchanger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExchanger(Exchanger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feeder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feeder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeeder(Feeder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ports</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ports</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePorts(Ports object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //WorkshopSwitch
