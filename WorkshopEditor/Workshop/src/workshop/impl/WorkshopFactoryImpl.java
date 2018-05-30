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
			case WorkshopPackage.WORKSTATION: return createWorkstation();
			case WorkshopPackage.MACHINES: return createMachines();
			case WorkshopPackage.STORAGE: return createStorage();
			case WorkshopPackage.ASSEMBLY: return createAssembly();
			case WorkshopPackage.EMPTY_NODE: return createEmptyNode();
			case WorkshopPackage.ASSEMBLY_MACHINE: return createAssemblyMachine();
			case WorkshopPackage.STORAGE_MACHINE: return createStorageMachine();
			case WorkshopPackage.AGV: return createAGV();
			case WorkshopPackage.CONVEYOR: return createConveyor();
			case WorkshopPackage.LINKER_MACHINE: return createLinkerMachine();
			case WorkshopPackage.EXCHANGER: return createExchanger();
			case WorkshopPackage.FEEDER: return createFeeder();
			case WorkshopPackage.PORTS: return createPorts();
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
	public Workstation createWorkstation() {
		WorkstationImpl workstation = new WorkstationImpl();
		return workstation;
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
	public Storage createStorage() {
		StorageImpl storage = new StorageImpl();
		return storage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assembly createAssembly() {
		AssemblyImpl assembly = new AssemblyImpl();
		return assembly;
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
	public AssemblyMachine createAssemblyMachine() {
		AssemblyMachineImpl assemblyMachine = new AssemblyMachineImpl();
		return assemblyMachine;
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
	public LinkerMachine createLinkerMachine() {
		LinkerMachineImpl linkerMachine = new LinkerMachineImpl();
		return linkerMachine;
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
