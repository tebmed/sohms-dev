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
			case WorkshopPackage.MACHINES: {
				Machines machines = (Machines)theEObject;
				T result = caseMachines(machines);
				if (result == null) result = caseNode(machines);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkshopPackage.ROBOT: {
				Robot robot = (Robot)theEObject;
				T result = caseRobot(robot);
				if (result == null) result = caseAssembler(robot);
				if (result == null) result = caseMachines(robot);
				if (result == null) result = caseNode(robot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkshopPackage.STORAGE_MACHINE: {
				StorageMachine storageMachine = (StorageMachine)theEObject;
				T result = caseStorageMachine(storageMachine);
				if (result == null) result = caseAssembler(storageMachine);
				if (result == null) result = caseMachines(storageMachine);
				if (result == null) result = caseNode(storageMachine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkshopPackage.AGV: {
				AGV agv = (AGV)theEObject;
				T result = caseAGV(agv);
				if (result == null) result = caseTransporter(agv);
				if (result == null) result = caseMachines(agv);
				if (result == null) result = caseNode(agv);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkshopPackage.CONVEYOR: {
				Conveyor conveyor = (Conveyor)theEObject;
				T result = caseConveyor(conveyor);
				if (result == null) result = caseTransporter(conveyor);
				if (result == null) result = caseMachines(conveyor);
				if (result == null) result = caseNode(conveyor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkshopPackage.COMBINER: {
				Combiner combiner = (Combiner)theEObject;
				T result = caseCombiner(combiner);
				if (result == null) result = caseMachines(combiner);
				if (result == null) result = caseNode(combiner);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkshopPackage.EXCHANGER: {
				Exchanger exchanger = (Exchanger)theEObject;
				T result = caseExchanger(exchanger);
				if (result == null) result = caseCombiner(exchanger);
				if (result == null) result = caseMachines(exchanger);
				if (result == null) result = caseNode(exchanger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkshopPackage.FEEDER: {
				Feeder feeder = (Feeder)theEObject;
				T result = caseFeeder(feeder);
				if (result == null) result = caseCombiner(feeder);
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
			case WorkshopPackage.ASSEMBLER: {
				Assembler assembler = (Assembler)theEObject;
				T result = caseAssembler(assembler);
				if (result == null) result = caseMachines(assembler);
				if (result == null) result = caseNode(assembler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkshopPackage.TRANSPORTER: {
				Transporter transporter = (Transporter)theEObject;
				T result = caseTransporter(transporter);
				if (result == null) result = caseMachines(transporter);
				if (result == null) result = caseNode(transporter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkshopPackage.FLOW_ITEM: {
				FlowItem flowItem = (FlowItem)theEObject;
				T result = caseFlowItem(flowItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkshopPackage.OPERATOR: {
				Operator operator = (Operator)theEObject;
				T result = caseOperator(operator);
				if (result == null) result = caseTransporter(operator);
				if (result == null) result = caseMachines(operator);
				if (result == null) result = caseNode(operator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkshopPackage.PALLET: {
				Pallet pallet = (Pallet)theEObject;
				T result = casePallet(pallet);
				if (result == null) result = caseFlowItem(pallet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkshopPackage.BOX: {
				Box box = (Box)theEObject;
				T result = caseBox(box);
				if (result == null) result = caseFlowItem(box);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkshopPackage.TOTE: {
				Tote tote = (Tote)theEObject;
				T result = caseTote(tote);
				if (result == null) result = caseFlowItem(tote);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkshopPackage.PROCESSOR: {
				Processor processor = (Processor)theEObject;
				T result = caseProcessor(processor);
				if (result == null) result = caseAssembler(processor);
				if (result == null) result = caseMachines(processor);
				if (result == null) result = caseNode(processor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkshopPackage.ELEVATOR: {
				Elevator elevator = (Elevator)theEObject;
				T result = caseElevator(elevator);
				if (result == null) result = caseTransporter(elevator);
				if (result == null) result = caseMachines(elevator);
				if (result == null) result = caseNode(elevator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkshopPackage.PRODUCT: {
				Product product = (Product)theEObject;
				T result = caseProduct(product);
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
	 * Returns the result of interpreting the object as an instance of '<em>Robot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Robot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRobot(Robot object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Combiner</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Combiner</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCombiner(Combiner object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Assembler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assembler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssembler(Assembler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transporter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transporter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransporter(Transporter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlowItem(FlowItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperator(Operator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pallet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pallet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePallet(Pallet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Box</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Box</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBox(Box object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tote</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tote</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTote(Tote object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Processor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Processor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessor(Processor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elevator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elevator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElevator(Elevator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProduct(Product object) {
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
