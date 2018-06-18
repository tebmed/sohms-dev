/**
 */
package workshop.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import workshop.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WorkshopFactoryImpl extends EFactoryImpl implements WorkshopFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WorkshopFactory init() {
		try {
			WorkshopFactory theWorkshopFactory = (WorkshopFactory)EPackage.Registry.INSTANCE.getEFactory(WorkshopPackage.eNS_URI);
			if (theWorkshopFactory != null) {
				return theWorkshopFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WorkshopFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkshopFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case WorkshopPackage.LAYOUT: return createLayout();
			case WorkshopPackage.NODE: return createNode();
			case WorkshopPackage.MACHINES: return createMachines();
			case WorkshopPackage.ROBOT: return createRobot();
			case WorkshopPackage.STORAGE_MACHINE: return createStorageMachine();
			case WorkshopPackage.AGV: return createAGV();
			case WorkshopPackage.CONVEYOR: return createConveyor();
			case WorkshopPackage.COMBINER: return createCombiner();
			case WorkshopPackage.EXCHANGER: return createExchanger();
			case WorkshopPackage.FEEDER: return createFeeder();
			case WorkshopPackage.PORTS: return createPorts();
			case WorkshopPackage.ASSEMBLER: return createAssembler();
			case WorkshopPackage.TRANSPORTER: return createTransporter();
			case WorkshopPackage.FLOW_ITEM: return createFlowItem();
			case WorkshopPackage.OPERATOR: return createOperator();
			case WorkshopPackage.PALLET: return createPallet();
			case WorkshopPackage.BOX: return createBox();
			case WorkshopPackage.TOTE: return createTote();
			case WorkshopPackage.PROCESSOR: return createProcessor();
			case WorkshopPackage.ELEVATOR: return createElevator();
			case WorkshopPackage.PRODUCT: return createProduct();
			case WorkshopPackage.EMPTY_NODE: return createEmptyNode();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Layout createLayout() {
		LayoutImpl layout = new LayoutImpl();
		return layout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node createNode() {
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Machines createMachines() {
		MachinesImpl machines = new MachinesImpl();
		return machines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Robot createRobot() {
		RobotImpl robot = new RobotImpl();
		return robot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StorageMachine createStorageMachine() {
		StorageMachineImpl storageMachine = new StorageMachineImpl();
		return storageMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AGV createAGV() {
		AGVImpl agv = new AGVImpl();
		return agv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Conveyor createConveyor() {
		ConveyorImpl conveyor = new ConveyorImpl();
		return conveyor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Combiner createCombiner() {
		CombinerImpl combiner = new CombinerImpl();
		return combiner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exchanger createExchanger() {
		ExchangerImpl exchanger = new ExchangerImpl();
		return exchanger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feeder createFeeder() {
		FeederImpl feeder = new FeederImpl();
		return feeder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ports createPorts() {
		PortsImpl ports = new PortsImpl();
		return ports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assembler createAssembler() {
		AssemblerImpl assembler = new AssemblerImpl();
		return assembler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transporter createTransporter() {
		TransporterImpl transporter = new TransporterImpl();
		return transporter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowItem createFlowItem() {
		FlowItemImpl flowItem = new FlowItemImpl();
		return flowItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operator createOperator() {
		OperatorImpl operator = new OperatorImpl();
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pallet createPallet() {
		PalletImpl pallet = new PalletImpl();
		return pallet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Box createBox() {
		BoxImpl box = new BoxImpl();
		return box;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tote createTote() {
		ToteImpl tote = new ToteImpl();
		return tote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Processor createProcessor() {
		ProcessorImpl processor = new ProcessorImpl();
		return processor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Elevator createElevator() {
		ElevatorImpl elevator = new ElevatorImpl();
		return elevator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Product createProduct() {
		ProductImpl product = new ProductImpl();
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmptyNode createEmptyNode() {
		EmptyNodeImpl emptyNode = new EmptyNodeImpl();
		return emptyNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkshopPackage getWorkshopPackage() {
		return (WorkshopPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WorkshopPackage getPackage() {
		return WorkshopPackage.eINSTANCE;
	}

} //WorkshopFactoryImpl
