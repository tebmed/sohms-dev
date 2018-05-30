/**
 */
package workshop;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see workshop.WorkshopFactory
 * @model kind="package"
 * @generated
 */
public interface WorkshopPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "workshop";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "workshop";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "workshop";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WorkshopPackage eINSTANCE = workshop.impl.WorkshopPackageImpl.init();

	/**
	 * The meta object id for the '{@link workshop.impl.LayoutImpl <em>Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workshop.impl.LayoutImpl
	 * @see workshop.impl.WorkshopPackageImpl#getLayout()
	 * @generated
	 */
	int LAYOUT = 0;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__NODES = 0;

	/**
	 * The number of structural features of the '<em>Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link workshop.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workshop.impl.NodeImpl
	 * @see workshop.impl.WorkshopPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__TECHNOLOGY = 1;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__CATEGORY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = 3;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__PORTS = 4;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link workshop.impl.WorkstationImpl <em>Workstation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workshop.impl.WorkstationImpl
	 * @see workshop.impl.WorkshopPackageImpl#getWorkstation()
	 * @generated
	 */
	int WORKSTATION = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTATION__DESCRIPTION = NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTATION__TECHNOLOGY = NODE__TECHNOLOGY;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTATION__CATEGORY = NODE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTATION__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTATION__PORTS = NODE__PORTS;

	/**
	 * The number of structural features of the '<em>Workstation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTATION_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Workstation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTATION_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link workshop.impl.MachinesImpl <em>Machines</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workshop.impl.MachinesImpl
	 * @see workshop.impl.WorkshopPackageImpl#getMachines()
	 * @generated
	 */
	int MACHINES = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINES__DESCRIPTION = NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINES__TECHNOLOGY = NODE__TECHNOLOGY;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINES__CATEGORY = NODE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINES__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINES__PORTS = NODE__PORTS;

	/**
	 * The number of structural features of the '<em>Machines</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINES_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Machines</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINES_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link workshop.impl.StorageImpl <em>Storage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workshop.impl.StorageImpl
	 * @see workshop.impl.WorkshopPackageImpl#getStorage()
	 * @generated
	 */
	int STORAGE = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__DESCRIPTION = WORKSTATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__TECHNOLOGY = WORKSTATION__TECHNOLOGY;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__CATEGORY = WORKSTATION__CATEGORY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__NAME = WORKSTATION__NAME;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__PORTS = WORKSTATION__PORTS;

	/**
	 * The feature id for the '<em><b>Storagemachine</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__STORAGEMACHINE = WORKSTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Storage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_FEATURE_COUNT = WORKSTATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Storage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_OPERATION_COUNT = WORKSTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link workshop.impl.AssemblyImpl <em>Assembly</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workshop.impl.AssemblyImpl
	 * @see workshop.impl.WorkshopPackageImpl#getAssembly()
	 * @generated
	 */
	int ASSEMBLY = 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY__DESCRIPTION = WORKSTATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY__TECHNOLOGY = WORKSTATION__TECHNOLOGY;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY__CATEGORY = WORKSTATION__CATEGORY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY__NAME = WORKSTATION__NAME;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY__PORTS = WORKSTATION__PORTS;

	/**
	 * The feature id for the '<em><b>Assemblymachine</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY__ASSEMBLYMACHINE = WORKSTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Assembly</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_FEATURE_COUNT = WORKSTATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Assembly</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_OPERATION_COUNT = WORKSTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link workshop.impl.EmptyNodeImpl <em>Empty Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workshop.impl.EmptyNodeImpl
	 * @see workshop.impl.WorkshopPackageImpl#getEmptyNode()
	 * @generated
	 */
	int EMPTY_NODE = 6;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_NODE__DESCRIPTION = NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_NODE__TECHNOLOGY = NODE__TECHNOLOGY;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_NODE__CATEGORY = NODE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_NODE__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_NODE__PORTS = NODE__PORTS;

	/**
	 * The number of structural features of the '<em>Empty Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Empty Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_NODE_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link workshop.impl.AssemblyMachineImpl <em>Assembly Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workshop.impl.AssemblyMachineImpl
	 * @see workshop.impl.WorkshopPackageImpl#getAssemblyMachine()
	 * @generated
	 */
	int ASSEMBLY_MACHINE = 7;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_MACHINE__DESCRIPTION = MACHINES__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_MACHINE__TECHNOLOGY = MACHINES__TECHNOLOGY;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_MACHINE__CATEGORY = MACHINES__CATEGORY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_MACHINE__NAME = MACHINES__NAME;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_MACHINE__PORTS = MACHINES__PORTS;

	/**
	 * The number of structural features of the '<em>Assembly Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_MACHINE_FEATURE_COUNT = MACHINES_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Assembly Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_MACHINE_OPERATION_COUNT = MACHINES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link workshop.impl.StorageMachineImpl <em>Storage Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workshop.impl.StorageMachineImpl
	 * @see workshop.impl.WorkshopPackageImpl#getStorageMachine()
	 * @generated
	 */
	int STORAGE_MACHINE = 8;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_MACHINE__DESCRIPTION = MACHINES__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_MACHINE__TECHNOLOGY = MACHINES__TECHNOLOGY;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_MACHINE__CATEGORY = MACHINES__CATEGORY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_MACHINE__NAME = MACHINES__NAME;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_MACHINE__PORTS = MACHINES__PORTS;

	/**
	 * The number of structural features of the '<em>Storage Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_MACHINE_FEATURE_COUNT = MACHINES_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Storage Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_MACHINE_OPERATION_COUNT = MACHINES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link workshop.impl.AGVImpl <em>AGV</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workshop.impl.AGVImpl
	 * @see workshop.impl.WorkshopPackageImpl#getAGV()
	 * @generated
	 */
	int AGV = 9;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV__DESCRIPTION = MACHINES__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV__TECHNOLOGY = MACHINES__TECHNOLOGY;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV__CATEGORY = MACHINES__CATEGORY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV__NAME = MACHINES__NAME;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV__PORTS = MACHINES__PORTS;

	/**
	 * The number of structural features of the '<em>AGV</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV_FEATURE_COUNT = MACHINES_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>AGV</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV_OPERATION_COUNT = MACHINES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link workshop.impl.ConveyorImpl <em>Conveyor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workshop.impl.ConveyorImpl
	 * @see workshop.impl.WorkshopPackageImpl#getConveyor()
	 * @generated
	 */
	int CONVEYOR = 10;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR__DESCRIPTION = MACHINES__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR__TECHNOLOGY = MACHINES__TECHNOLOGY;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR__CATEGORY = MACHINES__CATEGORY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR__NAME = MACHINES__NAME;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR__PORTS = MACHINES__PORTS;

	/**
	 * The number of structural features of the '<em>Conveyor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_FEATURE_COUNT = MACHINES_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Conveyor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_OPERATION_COUNT = MACHINES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link workshop.impl.LinkerMachineImpl <em>Linker Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workshop.impl.LinkerMachineImpl
	 * @see workshop.impl.WorkshopPackageImpl#getLinkerMachine()
	 * @generated
	 */
	int LINKER_MACHINE = 11;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKER_MACHINE__DESCRIPTION = MACHINES__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKER_MACHINE__TECHNOLOGY = MACHINES__TECHNOLOGY;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKER_MACHINE__CATEGORY = MACHINES__CATEGORY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKER_MACHINE__NAME = MACHINES__NAME;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKER_MACHINE__PORTS = MACHINES__PORTS;

	/**
	 * The number of structural features of the '<em>Linker Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKER_MACHINE_FEATURE_COUNT = MACHINES_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Linker Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKER_MACHINE_OPERATION_COUNT = MACHINES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link workshop.impl.ExchangerImpl <em>Exchanger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workshop.impl.ExchangerImpl
	 * @see workshop.impl.WorkshopPackageImpl#getExchanger()
	 * @generated
	 */
	int EXCHANGER = 12;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGER__DESCRIPTION = LINKER_MACHINE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGER__TECHNOLOGY = LINKER_MACHINE__TECHNOLOGY;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGER__CATEGORY = LINKER_MACHINE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGER__NAME = LINKER_MACHINE__NAME;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGER__PORTS = LINKER_MACHINE__PORTS;

	/**
	 * The number of structural features of the '<em>Exchanger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGER_FEATURE_COUNT = LINKER_MACHINE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Exchanger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGER_OPERATION_COUNT = LINKER_MACHINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link workshop.impl.FeederImpl <em>Feeder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workshop.impl.FeederImpl
	 * @see workshop.impl.WorkshopPackageImpl#getFeeder()
	 * @generated
	 */
	int FEEDER = 13;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDER__DESCRIPTION = LINKER_MACHINE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDER__TECHNOLOGY = LINKER_MACHINE__TECHNOLOGY;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDER__CATEGORY = LINKER_MACHINE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDER__NAME = LINKER_MACHINE__NAME;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDER__PORTS = LINKER_MACHINE__PORTS;

	/**
	 * The number of structural features of the '<em>Feeder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDER_FEATURE_COUNT = LINKER_MACHINE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Feeder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDER_OPERATION_COUNT = LINKER_MACHINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link workshop.impl.PortsImpl <em>Ports</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workshop.impl.PortsImpl
	 * @see workshop.impl.WorkshopPackageImpl#getPorts()
	 * @generated
	 */
	int PORTS = 14;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTS__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTS__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTS__SOURCE = 2;

	/**
	 * The number of structural features of the '<em>Ports</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Ports</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTS_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link workshop.Layout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layout</em>'.
	 * @see workshop.Layout
	 * @generated
	 */
	EClass getLayout();

	/**
	 * Returns the meta object for the containment reference list '{@link workshop.Layout#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see workshop.Layout#getNodes()
	 * @see #getLayout()
	 * @generated
	 */
	EReference getLayout_Nodes();

	/**
	 * Returns the meta object for class '{@link workshop.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see workshop.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the attribute '{@link workshop.Node#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see workshop.Node#getDescription()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Description();

	/**
	 * Returns the meta object for the attribute '{@link workshop.Node#getTechnology <em>Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Technology</em>'.
	 * @see workshop.Node#getTechnology()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Technology();

	/**
	 * Returns the meta object for the attribute '{@link workshop.Node#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see workshop.Node#getCategory()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Category();

	/**
	 * Returns the meta object for the attribute '{@link workshop.Node#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see workshop.Node#getName()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link workshop.Node#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ports</em>'.
	 * @see workshop.Node#getPorts()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Ports();

	/**
	 * Returns the meta object for class '{@link workshop.Workstation <em>Workstation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workstation</em>'.
	 * @see workshop.Workstation
	 * @generated
	 */
	EClass getWorkstation();

	/**
	 * Returns the meta object for class '{@link workshop.Machines <em>Machines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Machines</em>'.
	 * @see workshop.Machines
	 * @generated
	 */
	EClass getMachines();

	/**
	 * Returns the meta object for class '{@link workshop.Storage <em>Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Storage</em>'.
	 * @see workshop.Storage
	 * @generated
	 */
	EClass getStorage();

	/**
	 * Returns the meta object for the containment reference list '{@link workshop.Storage#getStoragemachine <em>Storagemachine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Storagemachine</em>'.
	 * @see workshop.Storage#getStoragemachine()
	 * @see #getStorage()
	 * @generated
	 */
	EReference getStorage_Storagemachine();

	/**
	 * Returns the meta object for class '{@link workshop.Assembly <em>Assembly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assembly</em>'.
	 * @see workshop.Assembly
	 * @generated
	 */
	EClass getAssembly();

	/**
	 * Returns the meta object for the containment reference list '{@link workshop.Assembly#getAssemblymachine <em>Assemblymachine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assemblymachine</em>'.
	 * @see workshop.Assembly#getAssemblymachine()
	 * @see #getAssembly()
	 * @generated
	 */
	EReference getAssembly_Assemblymachine();

	/**
	 * Returns the meta object for class '{@link workshop.EmptyNode <em>Empty Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Empty Node</em>'.
	 * @see workshop.EmptyNode
	 * @generated
	 */
	EClass getEmptyNode();

	/**
	 * Returns the meta object for class '{@link workshop.AssemblyMachine <em>Assembly Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assembly Machine</em>'.
	 * @see workshop.AssemblyMachine
	 * @generated
	 */
	EClass getAssemblyMachine();

	/**
	 * Returns the meta object for class '{@link workshop.StorageMachine <em>Storage Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Storage Machine</em>'.
	 * @see workshop.StorageMachine
	 * @generated
	 */
	EClass getStorageMachine();

	/**
	 * Returns the meta object for class '{@link workshop.AGV <em>AGV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AGV</em>'.
	 * @see workshop.AGV
	 * @generated
	 */
	EClass getAGV();

	/**
	 * Returns the meta object for class '{@link workshop.Conveyor <em>Conveyor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conveyor</em>'.
	 * @see workshop.Conveyor
	 * @generated
	 */
	EClass getConveyor();

	/**
	 * Returns the meta object for class '{@link workshop.LinkerMachine <em>Linker Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Linker Machine</em>'.
	 * @see workshop.LinkerMachine
	 * @generated
	 */
	EClass getLinkerMachine();

	/**
	 * Returns the meta object for class '{@link workshop.Exchanger <em>Exchanger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exchanger</em>'.
	 * @see workshop.Exchanger
	 * @generated
	 */
	EClass getExchanger();

	/**
	 * Returns the meta object for class '{@link workshop.Feeder <em>Feeder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feeder</em>'.
	 * @see workshop.Feeder
	 * @generated
	 */
	EClass getFeeder();

	/**
	 * Returns the meta object for class '{@link workshop.Ports <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ports</em>'.
	 * @see workshop.Ports
	 * @generated
	 */
	EClass getPorts();

	/**
	 * Returns the meta object for the attribute '{@link workshop.Ports#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see workshop.Ports#getValue()
	 * @see #getPorts()
	 * @generated
	 */
	EAttribute getPorts_Value();

	/**
	 * Returns the meta object for the reference '{@link workshop.Ports#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see workshop.Ports#getTarget()
	 * @see #getPorts()
	 * @generated
	 */
	EReference getPorts_Target();

	/**
	 * Returns the meta object for the reference '{@link workshop.Ports#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see workshop.Ports#getSource()
	 * @see #getPorts()
	 * @generated
	 */
	EReference getPorts_Source();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WorkshopFactory getWorkshopFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link workshop.impl.LayoutImpl <em>Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workshop.impl.LayoutImpl
		 * @see workshop.impl.WorkshopPackageImpl#getLayout()
		 * @generated
		 */
		EClass LAYOUT = eINSTANCE.getLayout();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT__NODES = eINSTANCE.getLayout_Nodes();

		/**
		 * The meta object literal for the '{@link workshop.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workshop.impl.NodeImpl
		 * @see workshop.impl.WorkshopPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__DESCRIPTION = eINSTANCE.getNode_Description();

		/**
		 * The meta object literal for the '<em><b>Technology</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__TECHNOLOGY = eINSTANCE.getNode_Technology();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__CATEGORY = eINSTANCE.getNode_Category();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__NAME = eINSTANCE.getNode_Name();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__PORTS = eINSTANCE.getNode_Ports();

		/**
		 * The meta object literal for the '{@link workshop.impl.WorkstationImpl <em>Workstation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workshop.impl.WorkstationImpl
		 * @see workshop.impl.WorkshopPackageImpl#getWorkstation()
		 * @generated
		 */
		EClass WORKSTATION = eINSTANCE.getWorkstation();

		/**
		 * The meta object literal for the '{@link workshop.impl.MachinesImpl <em>Machines</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workshop.impl.MachinesImpl
		 * @see workshop.impl.WorkshopPackageImpl#getMachines()
		 * @generated
		 */
		EClass MACHINES = eINSTANCE.getMachines();

		/**
		 * The meta object literal for the '{@link workshop.impl.StorageImpl <em>Storage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workshop.impl.StorageImpl
		 * @see workshop.impl.WorkshopPackageImpl#getStorage()
		 * @generated
		 */
		EClass STORAGE = eINSTANCE.getStorage();

		/**
		 * The meta object literal for the '<em><b>Storagemachine</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORAGE__STORAGEMACHINE = eINSTANCE.getStorage_Storagemachine();

		/**
		 * The meta object literal for the '{@link workshop.impl.AssemblyImpl <em>Assembly</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workshop.impl.AssemblyImpl
		 * @see workshop.impl.WorkshopPackageImpl#getAssembly()
		 * @generated
		 */
		EClass ASSEMBLY = eINSTANCE.getAssembly();

		/**
		 * The meta object literal for the '<em><b>Assemblymachine</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY__ASSEMBLYMACHINE = eINSTANCE.getAssembly_Assemblymachine();

		/**
		 * The meta object literal for the '{@link workshop.impl.EmptyNodeImpl <em>Empty Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workshop.impl.EmptyNodeImpl
		 * @see workshop.impl.WorkshopPackageImpl#getEmptyNode()
		 * @generated
		 */
		EClass EMPTY_NODE = eINSTANCE.getEmptyNode();

		/**
		 * The meta object literal for the '{@link workshop.impl.AssemblyMachineImpl <em>Assembly Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workshop.impl.AssemblyMachineImpl
		 * @see workshop.impl.WorkshopPackageImpl#getAssemblyMachine()
		 * @generated
		 */
		EClass ASSEMBLY_MACHINE = eINSTANCE.getAssemblyMachine();

		/**
		 * The meta object literal for the '{@link workshop.impl.StorageMachineImpl <em>Storage Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workshop.impl.StorageMachineImpl
		 * @see workshop.impl.WorkshopPackageImpl#getStorageMachine()
		 * @generated
		 */
		EClass STORAGE_MACHINE = eINSTANCE.getStorageMachine();

		/**
		 * The meta object literal for the '{@link workshop.impl.AGVImpl <em>AGV</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workshop.impl.AGVImpl
		 * @see workshop.impl.WorkshopPackageImpl#getAGV()
		 * @generated
		 */
		EClass AGV = eINSTANCE.getAGV();

		/**
		 * The meta object literal for the '{@link workshop.impl.ConveyorImpl <em>Conveyor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workshop.impl.ConveyorImpl
		 * @see workshop.impl.WorkshopPackageImpl#getConveyor()
		 * @generated
		 */
		EClass CONVEYOR = eINSTANCE.getConveyor();

		/**
		 * The meta object literal for the '{@link workshop.impl.LinkerMachineImpl <em>Linker Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workshop.impl.LinkerMachineImpl
		 * @see workshop.impl.WorkshopPackageImpl#getLinkerMachine()
		 * @generated
		 */
		EClass LINKER_MACHINE = eINSTANCE.getLinkerMachine();

		/**
		 * The meta object literal for the '{@link workshop.impl.ExchangerImpl <em>Exchanger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workshop.impl.ExchangerImpl
		 * @see workshop.impl.WorkshopPackageImpl#getExchanger()
		 * @generated
		 */
		EClass EXCHANGER = eINSTANCE.getExchanger();

		/**
		 * The meta object literal for the '{@link workshop.impl.FeederImpl <em>Feeder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workshop.impl.FeederImpl
		 * @see workshop.impl.WorkshopPackageImpl#getFeeder()
		 * @generated
		 */
		EClass FEEDER = eINSTANCE.getFeeder();

		/**
		 * The meta object literal for the '{@link workshop.impl.PortsImpl <em>Ports</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workshop.impl.PortsImpl
		 * @see workshop.impl.WorkshopPackageImpl#getPorts()
		 * @generated
		 */
		EClass PORTS = eINSTANCE.getPorts();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORTS__VALUE = eINSTANCE.getPorts_Value();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORTS__TARGET = eINSTANCE.getPorts_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORTS__SOURCE = eINSTANCE.getPorts_Source();

	}

} //WorkshopPackage
