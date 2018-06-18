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
	 * The feature id for the '<em><b>Product</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__PRODUCT = 5;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link workshop.impl.MachinesImpl <em>Machines</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workshop.impl.MachinesImpl
	 * @see workshop.impl.WorkshopPackageImpl#getMachines()
	 * @generated
	 */
	int MACHINES = 2;

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
	 * The feature id for the '<em><b>Product</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINES__PRODUCT = NODE__PRODUCT;

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
	 * The meta object id for the '{@link workshop.impl.AssemblerImpl <em>Assembler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workshop.impl.AssemblerImpl
	 * @see workshop.impl.WorkshopPackageImpl#getAssembler()
	 * @generated
	 */
	int ASSEMBLER = 11;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLER__DESCRIPTION = MACHINES__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLER__TECHNOLOGY = MACHINES__TECHNOLOGY;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLER__CATEGORY = MACHINES__CATEGORY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLER__NAME = MACHINES__NAME;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLER__PORTS = MACHINES__PORTS;

	/**
	 * The feature id for the '<em><b>Product</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLER__PRODUCT = MACHINES__PRODUCT;

	/**
	 * The number of structural features of the '<em>Assembler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLER_FEATURE_COUNT = MACHINES_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Assembler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLER_OPERATION_COUNT = MACHINES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link workshop.impl.RobotImpl <em>Robot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workshop.impl.RobotImpl
	 * @see workshop.impl.WorkshopPackageImpl#getRobot()
	 * @generated
	 */
	int ROBOT = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__DESCRIPTION = ASSEMBLER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__TECHNOLOGY = ASSEMBLER__TECHNOLOGY;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__CATEGORY = ASSEMBLER__CATEGORY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__NAME = ASSEMBLER__NAME;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__PORTS = ASSEMBLER__PORTS;

	/**
	 * The feature id for the '<em><b>Product</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__PRODUCT = ASSEMBLER__PRODUCT;

	/**
	 * The number of structural features of the '<em>Robot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_FEATURE_COUNT = ASSEMBLER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Robot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_OPERATION_COUNT = ASSEMBLER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link workshop.impl.StorageMachineImpl <em>Storage Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workshop.impl.StorageMachineImpl
	 * @see workshop.impl.WorkshopPackageImpl#getStorageMachine()
	 * @generated
	 */
	int STORAGE_MACHINE = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_MACHINE__DESCRIPTION = ASSEMBLER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_MACHINE__TECHNOLOGY = ASSEMBLER__TECHNOLOGY;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_MACHINE__CATEGORY = ASSEMBLER__CATEGORY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_MACHINE__NAME = ASSEMBLER__NAME;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_MACHINE__PORTS = ASSEMBLER__PORTS;

	/**
	 * The feature id for the '<em><b>Product</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_MACHINE__PRODUCT = ASSEMBLER__PRODUCT;

	/**
	 * The number of structural features of the '<em>Storage Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_MACHINE_FEATURE_COUNT = ASSEMBLER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Storage Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_MACHINE_OPERATION_COUNT = ASSEMBLER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link workshop.impl.TransporterImpl <em>Transporter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workshop.impl.TransporterImpl
	 * @see workshop.impl.WorkshopPackageImpl#getTransporter()
	 * @generated
	 */
	int TRANSPORTER = 12;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTER__DESCRIPTION = MACHINES__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTER__TECHNOLOGY = MACHINES__TECHNOLOGY;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTER__CATEGORY = MACHINES__CATEGORY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTER__NAME = MACHINES__NAME;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTER__PORTS = MACHINES__PORTS;

	/**
	 * The feature id for the '<em><b>Product</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTER__PRODUCT = MACHINES__PRODUCT;

	/**
	 * The feature id for the '<em><b>Flowitem</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTER__FLOWITEM = MACHINES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Transporter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTER_FEATURE_COUNT = MACHINES_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Transporter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTER_OPERATION_COUNT = MACHINES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link workshop.impl.AGVImpl <em>AGV</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workshop.impl.AGVImpl
	 * @see workshop.impl.WorkshopPackageImpl#getAGV()
	 * @generated
	 */
	int AGV = 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV__DESCRIPTION = TRANSPORTER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV__TECHNOLOGY = TRANSPORTER__TECHNOLOGY;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV__CATEGORY = TRANSPORTER__CATEGORY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV__NAME = TRANSPORTER__NAME;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV__PORTS = TRANSPORTER__PORTS;

	/**
	 * The feature id for the '<em><b>Product</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV__PRODUCT = TRANSPORTER__PRODUCT;

	/**
	 * The feature id for the '<em><b>Flowitem</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV__FLOWITEM = TRANSPORTER__FLOWITEM;

	/**
	 * The number of structural features of the '<em>AGV</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV_FEATURE_COUNT = TRANSPORTER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>AGV</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV_OPERATION_COUNT = TRANSPORTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link workshop.impl.ConveyorImpl <em>Conveyor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workshop.impl.ConveyorImpl
	 * @see workshop.impl.WorkshopPackageImpl#getConveyor()
	 * @generated
	 */
	int CONVEYOR = 6;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR__DESCRIPTION = TRANSPORTER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR__TECHNOLOGY = TRANSPORTER__TECHNOLOGY;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR__CATEGORY = TRANSPORTER__CATEGORY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR__NAME = TRANSPORTER__NAME;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR__PORTS = TRANSPORTER__PORTS;

	/**
	 * The feature id for the '<em><b>Product</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR__PRODUCT = TRANSPORTER__PRODUCT;

	/**
	 * The feature id for the '<em><b>Flowitem</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR__FLOWITEM = TRANSPORTER__FLOWITEM;

	/**
	 * The number of structural features of the '<em>Conveyor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_FEATURE_COUNT = TRANSPORTER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Conveyor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_OPERATION_COUNT = TRANSPORTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link workshop.impl.CombinerImpl <em>Combiner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workshop.impl.CombinerImpl
	 * @see workshop.impl.WorkshopPackageImpl#getCombiner()
	 * @generated
	 */
	int COMBINER = 7;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINER__DESCRIPTION = MACHINES__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINER__TECHNOLOGY = MACHINES__TECHNOLOGY;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINER__CATEGORY = MACHINES__CATEGORY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINER__NAME = MACHINES__NAME;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINER__PORTS = MACHINES__PORTS;

	/**
	 * The feature id for the '<em><b>Product</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINER__PRODUCT = MACHINES__PRODUCT;

	/**
	 * The number of structural features of the '<em>Combiner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINER_FEATURE_COUNT = MACHINES_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Combiner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINER_OPERATION_COUNT = MACHINES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link workshop.impl.ExchangerImpl <em>Exchanger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workshop.impl.ExchangerImpl
	 * @see workshop.impl.WorkshopPackageImpl#getExchanger()
	 * @generated
	 */
	int EXCHANGER = 8;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGER__DESCRIPTION = COMBINER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGER__TECHNOLOGY = COMBINER__TECHNOLOGY;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGER__CATEGORY = COMBINER__CATEGORY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGER__NAME = COMBINER__NAME;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGER__PORTS = COMBINER__PORTS;

	/**
	 * The feature id for the '<em><b>Product</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGER__PRODUCT = COMBINER__PRODUCT;

	/**
	 * The number of structural features of the '<em>Exchanger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGER_FEATURE_COUNT = COMBINER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Exchanger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGER_OPERATION_COUNT = COMBINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link workshop.impl.FeederImpl <em>Feeder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workshop.impl.FeederImpl
	 * @see workshop.impl.WorkshopPackageImpl#getFeeder()
	 * @generated
	 */
	int FEEDER = 9;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDER__DESCRIPTION = COMBINER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDER__TECHNOLOGY = COMBINER__TECHNOLOGY;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDER__CATEGORY = COMBINER__CATEGORY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDER__NAME = COMBINER__NAME;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDER__PORTS = COMBINER__PORTS;

	/**
	 * The feature id for the '<em><b>Product</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDER__PRODUCT = COMBINER__PRODUCT;

	/**
	 * The number of structural features of the '<em>Feeder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDER_FEATURE_COUNT = COMBINER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Feeder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDER_OPERATION_COUNT = COMBINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link workshop.impl.PortsImpl <em>Ports</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workshop.impl.PortsImpl
	 * @see workshop.impl.WorkshopPackageImpl#getPorts()
	 * @generated
	 */
	int PORTS = 10;

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
	 * The meta object id for the '{@link workshop.impl.FlowItemImpl <em>Flow Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workshop.impl.FlowItemImpl
	 * @see workshop.impl.WorkshopPackageImpl#getFlowItem()
	 * @generated
	 */
	int FLOW_ITEM = 13;

	/**
	 * The number of structural features of the '<em>Flow Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ITEM_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Flow Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link workshop.impl.OperatorImpl <em>Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workshop.impl.OperatorImpl
	 * @see workshop.impl.WorkshopPackageImpl#getOperator()
	 * @generated
	 */
	int OPERATOR = 14;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__DESCRIPTION = TRANSPORTER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__TECHNOLOGY = TRANSPORTER__TECHNOLOGY;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__CATEGORY = TRANSPORTER__CATEGORY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__NAME = TRANSPORTER__NAME;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__PORTS = TRANSPORTER__PORTS;

	/**
	 * The feature id for the '<em><b>Product</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__PRODUCT = TRANSPORTER__PRODUCT;

	/**
	 * The feature id for the '<em><b>Flowitem</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__FLOWITEM = TRANSPORTER__FLOWITEM;

	/**
	 * The number of structural features of the '<em>Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_FEATURE_COUNT = TRANSPORTER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_OPERATION_COUNT = TRANSPORTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link workshop.impl.PalletImpl <em>Pallet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workshop.impl.PalletImpl
	 * @see workshop.impl.WorkshopPackageImpl#getPallet()
	 * @generated
	 */
	int PALLET = 15;

	/**
	 * The number of structural features of the '<em>Pallet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALLET_FEATURE_COUNT = FLOW_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pallet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALLET_OPERATION_COUNT = FLOW_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link workshop.impl.BoxImpl <em>Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workshop.impl.BoxImpl
	 * @see workshop.impl.WorkshopPackageImpl#getBox()
	 * @generated
	 */
	int BOX = 16;

	/**
	 * The number of structural features of the '<em>Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX_FEATURE_COUNT = FLOW_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX_OPERATION_COUNT = FLOW_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link workshop.impl.ToteImpl <em>Tote</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workshop.impl.ToteImpl
	 * @see workshop.impl.WorkshopPackageImpl#getTote()
	 * @generated
	 */
	int TOTE = 17;

	/**
	 * The number of structural features of the '<em>Tote</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOTE_FEATURE_COUNT = FLOW_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tote</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOTE_OPERATION_COUNT = FLOW_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link workshop.impl.ProcessorImpl <em>Processor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workshop.impl.ProcessorImpl
	 * @see workshop.impl.WorkshopPackageImpl#getProcessor()
	 * @generated
	 */
	int PROCESSOR = 18;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__DESCRIPTION = ASSEMBLER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__TECHNOLOGY = ASSEMBLER__TECHNOLOGY;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__CATEGORY = ASSEMBLER__CATEGORY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__NAME = ASSEMBLER__NAME;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__PORTS = ASSEMBLER__PORTS;

	/**
	 * The feature id for the '<em><b>Product</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__PRODUCT = ASSEMBLER__PRODUCT;

	/**
	 * The number of structural features of the '<em>Processor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_FEATURE_COUNT = ASSEMBLER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Processor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_OPERATION_COUNT = ASSEMBLER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link workshop.impl.ElevatorImpl <em>Elevator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workshop.impl.ElevatorImpl
	 * @see workshop.impl.WorkshopPackageImpl#getElevator()
	 * @generated
	 */
	int ELEVATOR = 19;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR__DESCRIPTION = TRANSPORTER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR__TECHNOLOGY = TRANSPORTER__TECHNOLOGY;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR__CATEGORY = TRANSPORTER__CATEGORY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR__NAME = TRANSPORTER__NAME;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR__PORTS = TRANSPORTER__PORTS;

	/**
	 * The feature id for the '<em><b>Product</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR__PRODUCT = TRANSPORTER__PRODUCT;

	/**
	 * The feature id for the '<em><b>Flowitem</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR__FLOWITEM = TRANSPORTER__FLOWITEM;

	/**
	 * The number of structural features of the '<em>Elevator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR_FEATURE_COUNT = TRANSPORTER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Elevator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR_OPERATION_COUNT = TRANSPORTER_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link workshop.impl.ProductImpl <em>Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workshop.impl.ProductImpl
	 * @see workshop.impl.WorkshopPackageImpl#getProduct()
	 * @generated
	 */
	int PRODUCT = 20;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__ID = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link workshop.impl.EmptyNodeImpl <em>Empty Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workshop.impl.EmptyNodeImpl
	 * @see workshop.impl.WorkshopPackageImpl#getEmptyNode()
	 * @generated
	 */
	int EMPTY_NODE = 21;

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
	 * The feature id for the '<em><b>Product</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_NODE__PRODUCT = NODE__PRODUCT;

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
	 * Returns the meta object for the containment reference list '{@link workshop.Node#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Product</em>'.
	 * @see workshop.Node#getProduct()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Product();

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
	 * Returns the meta object for class '{@link workshop.Robot <em>Robot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Robot</em>'.
	 * @see workshop.Robot
	 * @generated
	 */
	EClass getRobot();

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
	 * Returns the meta object for class '{@link workshop.Combiner <em>Combiner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Combiner</em>'.
	 * @see workshop.Combiner
	 * @generated
	 */
	EClass getCombiner();

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
	 * Returns the meta object for class '{@link workshop.Assembler <em>Assembler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assembler</em>'.
	 * @see workshop.Assembler
	 * @generated
	 */
	EClass getAssembler();

	/**
	 * Returns the meta object for class '{@link workshop.Transporter <em>Transporter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transporter</em>'.
	 * @see workshop.Transporter
	 * @generated
	 */
	EClass getTransporter();

	/**
	 * Returns the meta object for the containment reference list '{@link workshop.Transporter#getFlowitem <em>Flowitem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Flowitem</em>'.
	 * @see workshop.Transporter#getFlowitem()
	 * @see #getTransporter()
	 * @generated
	 */
	EReference getTransporter_Flowitem();

	/**
	 * Returns the meta object for class '{@link workshop.FlowItem <em>Flow Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Item</em>'.
	 * @see workshop.FlowItem
	 * @generated
	 */
	EClass getFlowItem();

	/**
	 * Returns the meta object for class '{@link workshop.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operator</em>'.
	 * @see workshop.Operator
	 * @generated
	 */
	EClass getOperator();

	/**
	 * Returns the meta object for class '{@link workshop.Pallet <em>Pallet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pallet</em>'.
	 * @see workshop.Pallet
	 * @generated
	 */
	EClass getPallet();

	/**
	 * Returns the meta object for class '{@link workshop.Box <em>Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Box</em>'.
	 * @see workshop.Box
	 * @generated
	 */
	EClass getBox();

	/**
	 * Returns the meta object for class '{@link workshop.Tote <em>Tote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tote</em>'.
	 * @see workshop.Tote
	 * @generated
	 */
	EClass getTote();

	/**
	 * Returns the meta object for class '{@link workshop.Processor <em>Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processor</em>'.
	 * @see workshop.Processor
	 * @generated
	 */
	EClass getProcessor();

	/**
	 * Returns the meta object for class '{@link workshop.Elevator <em>Elevator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elevator</em>'.
	 * @see workshop.Elevator
	 * @generated
	 */
	EClass getElevator();

	/**
	 * Returns the meta object for class '{@link workshop.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product</em>'.
	 * @see workshop.Product
	 * @generated
	 */
	EClass getProduct();

	/**
	 * Returns the meta object for the attribute '{@link workshop.Product#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see workshop.Product#getId()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_Id();

	/**
	 * Returns the meta object for the attribute '{@link workshop.Product#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see workshop.Product#getDescription()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_Description();

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
		 * The meta object literal for the '<em><b>Product</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__PRODUCT = eINSTANCE.getNode_Product();

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
		 * The meta object literal for the '{@link workshop.impl.RobotImpl <em>Robot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workshop.impl.RobotImpl
		 * @see workshop.impl.WorkshopPackageImpl#getRobot()
		 * @generated
		 */
		EClass ROBOT = eINSTANCE.getRobot();

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
		 * The meta object literal for the '{@link workshop.impl.CombinerImpl <em>Combiner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workshop.impl.CombinerImpl
		 * @see workshop.impl.WorkshopPackageImpl#getCombiner()
		 * @generated
		 */
		EClass COMBINER = eINSTANCE.getCombiner();

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

		/**
		 * The meta object literal for the '{@link workshop.impl.AssemblerImpl <em>Assembler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workshop.impl.AssemblerImpl
		 * @see workshop.impl.WorkshopPackageImpl#getAssembler()
		 * @generated
		 */
		EClass ASSEMBLER = eINSTANCE.getAssembler();

		/**
		 * The meta object literal for the '{@link workshop.impl.TransporterImpl <em>Transporter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workshop.impl.TransporterImpl
		 * @see workshop.impl.WorkshopPackageImpl#getTransporter()
		 * @generated
		 */
		EClass TRANSPORTER = eINSTANCE.getTransporter();

		/**
		 * The meta object literal for the '<em><b>Flowitem</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSPORTER__FLOWITEM = eINSTANCE.getTransporter_Flowitem();

		/**
		 * The meta object literal for the '{@link workshop.impl.FlowItemImpl <em>Flow Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workshop.impl.FlowItemImpl
		 * @see workshop.impl.WorkshopPackageImpl#getFlowItem()
		 * @generated
		 */
		EClass FLOW_ITEM = eINSTANCE.getFlowItem();

		/**
		 * The meta object literal for the '{@link workshop.impl.OperatorImpl <em>Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workshop.impl.OperatorImpl
		 * @see workshop.impl.WorkshopPackageImpl#getOperator()
		 * @generated
		 */
		EClass OPERATOR = eINSTANCE.getOperator();

		/**
		 * The meta object literal for the '{@link workshop.impl.PalletImpl <em>Pallet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workshop.impl.PalletImpl
		 * @see workshop.impl.WorkshopPackageImpl#getPallet()
		 * @generated
		 */
		EClass PALLET = eINSTANCE.getPallet();

		/**
		 * The meta object literal for the '{@link workshop.impl.BoxImpl <em>Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workshop.impl.BoxImpl
		 * @see workshop.impl.WorkshopPackageImpl#getBox()
		 * @generated
		 */
		EClass BOX = eINSTANCE.getBox();

		/**
		 * The meta object literal for the '{@link workshop.impl.ToteImpl <em>Tote</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workshop.impl.ToteImpl
		 * @see workshop.impl.WorkshopPackageImpl#getTote()
		 * @generated
		 */
		EClass TOTE = eINSTANCE.getTote();

		/**
		 * The meta object literal for the '{@link workshop.impl.ProcessorImpl <em>Processor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workshop.impl.ProcessorImpl
		 * @see workshop.impl.WorkshopPackageImpl#getProcessor()
		 * @generated
		 */
		EClass PROCESSOR = eINSTANCE.getProcessor();

		/**
		 * The meta object literal for the '{@link workshop.impl.ElevatorImpl <em>Elevator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workshop.impl.ElevatorImpl
		 * @see workshop.impl.WorkshopPackageImpl#getElevator()
		 * @generated
		 */
		EClass ELEVATOR = eINSTANCE.getElevator();

		/**
		 * The meta object literal for the '{@link workshop.impl.ProductImpl <em>Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workshop.impl.ProductImpl
		 * @see workshop.impl.WorkshopPackageImpl#getProduct()
		 * @generated
		 */
		EClass PRODUCT = eINSTANCE.getProduct();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__ID = eINSTANCE.getProduct_Id();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__DESCRIPTION = eINSTANCE.getProduct_Description();

		/**
		 * The meta object literal for the '{@link workshop.impl.EmptyNodeImpl <em>Empty Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workshop.impl.EmptyNodeImpl
		 * @see workshop.impl.WorkshopPackageImpl#getEmptyNode()
		 * @generated
		 */
		EClass EMPTY_NODE = eINSTANCE.getEmptyNode();

	}

} //WorkshopPackage
