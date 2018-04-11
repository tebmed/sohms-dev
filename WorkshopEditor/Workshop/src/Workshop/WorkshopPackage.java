/**
 */
package Workshop;

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
 * @see Workshop.WorkshopFactory
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
	String eNAME = "Workshop";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "Workshop";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Workshop";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WorkshopPackage eINSTANCE = Workshop.impl.WorkshopPackageImpl.init();

	/**
	 * The meta object id for the '{@link Workshop.impl.LayoutImpl <em>Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Workshop.impl.LayoutImpl
	 * @see Workshop.impl.WorkshopPackageImpl#getLayout()
	 * @generated
	 */
	int LAYOUT = 0;

	/**
	 * The feature id for the '<em><b>Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__NODE = 0;

	/**
	 * The feature id for the '<em><b>Arc</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__ARC = 1;

	/**
	 * The number of structural features of the '<em>Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Workshop.impl.StationImpl <em>Station</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Workshop.impl.StationImpl
	 * @see Workshop.impl.WorkshopPackageImpl#getStation()
	 * @generated
	 */
	int STATION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__NAME = 1;

	/**
	 * The feature id for the '<em><b>Ressource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__RESSOURCE = 2;

	/**
	 * The number of structural features of the '<em>Station</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Station</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Workshop.impl.ArcImpl <em>Arc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Workshop.impl.ArcImpl
	 * @see Workshop.impl.WorkshopPackageImpl#getArc()
	 * @generated
	 */
	int ARC = 2;

	/**
	 * The feature id for the '<em><b>From N</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__FROM_N = 0;

	/**
	 * The feature id for the '<em><b>To N</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__TO_N = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__ID = 2;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__COST = 3;

	/**
	 * The number of structural features of the '<em>Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Workshop.impl.RessourceImpl <em>Ressource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Workshop.impl.RessourceImpl
	 * @see Workshop.impl.WorkshopPackageImpl#getRessource()
	 * @generated
	 */
	int RESSOURCE = 3;

	/**
	 * The number of structural features of the '<em>Ressource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Ressource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Workshop.impl.AGVImpl <em>AGV</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Workshop.impl.AGVImpl
	 * @see Workshop.impl.WorkshopPackageImpl#getAGV()
	 * @generated
	 */
	int AGV = 4;

	/**
	 * The number of structural features of the '<em>AGV</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV_FEATURE_COUNT = RESSOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>AGV</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV_OPERATION_COUNT = RESSOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Workshop.impl.MachineImpl <em>Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Workshop.impl.MachineImpl
	 * @see Workshop.impl.WorkshopPackageImpl#getMachine()
	 * @generated
	 */
	int MACHINE = 5;

	/**
	 * The number of structural features of the '<em>Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_FEATURE_COUNT = RESSOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPERATION_COUNT = RESSOURCE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link Workshop.Layout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layout</em>'.
	 * @see Workshop.Layout
	 * @generated
	 */
	EClass getLayout();

	/**
	 * Returns the meta object for the containment reference list '{@link Workshop.Layout#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Node</em>'.
	 * @see Workshop.Layout#getNode()
	 * @see #getLayout()
	 * @generated
	 */
	EReference getLayout_Node();

	/**
	 * Returns the meta object for the containment reference list '{@link Workshop.Layout#getArc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arc</em>'.
	 * @see Workshop.Layout#getArc()
	 * @see #getLayout()
	 * @generated
	 */
	EReference getLayout_Arc();

	/**
	 * Returns the meta object for class '{@link Workshop.Station <em>Station</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Station</em>'.
	 * @see Workshop.Station
	 * @generated
	 */
	EClass getStation();

	/**
	 * Returns the meta object for the attribute '{@link Workshop.Station#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Workshop.Station#getId()
	 * @see #getStation()
	 * @generated
	 */
	EAttribute getStation_Id();

	/**
	 * Returns the meta object for the attribute '{@link Workshop.Station#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Workshop.Station#getName()
	 * @see #getStation()
	 * @generated
	 */
	EAttribute getStation_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link Workshop.Station#getRessource <em>Ressource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ressource</em>'.
	 * @see Workshop.Station#getRessource()
	 * @see #getStation()
	 * @generated
	 */
	EReference getStation_Ressource();

	/**
	 * Returns the meta object for class '{@link Workshop.Arc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc</em>'.
	 * @see Workshop.Arc
	 * @generated
	 */
	EClass getArc();

	/**
	 * Returns the meta object for the reference '{@link Workshop.Arc#getFromN <em>From N</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From N</em>'.
	 * @see Workshop.Arc#getFromN()
	 * @see #getArc()
	 * @generated
	 */
	EReference getArc_FromN();

	/**
	 * Returns the meta object for the reference '{@link Workshop.Arc#getToN <em>To N</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To N</em>'.
	 * @see Workshop.Arc#getToN()
	 * @see #getArc()
	 * @generated
	 */
	EReference getArc_ToN();

	/**
	 * Returns the meta object for the attribute '{@link Workshop.Arc#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Workshop.Arc#getId()
	 * @see #getArc()
	 * @generated
	 */
	EAttribute getArc_Id();

	/**
	 * Returns the meta object for the attribute '{@link Workshop.Arc#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see Workshop.Arc#getCost()
	 * @see #getArc()
	 * @generated
	 */
	EAttribute getArc_Cost();

	/**
	 * Returns the meta object for class '{@link Workshop.Ressource <em>Ressource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ressource</em>'.
	 * @see Workshop.Ressource
	 * @generated
	 */
	EClass getRessource();

	/**
	 * Returns the meta object for class '{@link Workshop.AGV <em>AGV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AGV</em>'.
	 * @see Workshop.AGV
	 * @generated
	 */
	EClass getAGV();

	/**
	 * Returns the meta object for class '{@link Workshop.Machine <em>Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Machine</em>'.
	 * @see Workshop.Machine
	 * @generated
	 */
	EClass getMachine();

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
		 * The meta object literal for the '{@link Workshop.impl.LayoutImpl <em>Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Workshop.impl.LayoutImpl
		 * @see Workshop.impl.WorkshopPackageImpl#getLayout()
		 * @generated
		 */
		EClass LAYOUT = eINSTANCE.getLayout();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT__NODE = eINSTANCE.getLayout_Node();

		/**
		 * The meta object literal for the '<em><b>Arc</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT__ARC = eINSTANCE.getLayout_Arc();

		/**
		 * The meta object literal for the '{@link Workshop.impl.StationImpl <em>Station</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Workshop.impl.StationImpl
		 * @see Workshop.impl.WorkshopPackageImpl#getStation()
		 * @generated
		 */
		EClass STATION = eINSTANCE.getStation();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATION__ID = eINSTANCE.getStation_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATION__NAME = eINSTANCE.getStation_Name();

		/**
		 * The meta object literal for the '<em><b>Ressource</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATION__RESSOURCE = eINSTANCE.getStation_Ressource();

		/**
		 * The meta object literal for the '{@link Workshop.impl.ArcImpl <em>Arc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Workshop.impl.ArcImpl
		 * @see Workshop.impl.WorkshopPackageImpl#getArc()
		 * @generated
		 */
		EClass ARC = eINSTANCE.getArc();

		/**
		 * The meta object literal for the '<em><b>From N</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARC__FROM_N = eINSTANCE.getArc_FromN();

		/**
		 * The meta object literal for the '<em><b>To N</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARC__TO_N = eINSTANCE.getArc_ToN();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARC__ID = eINSTANCE.getArc_Id();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARC__COST = eINSTANCE.getArc_Cost();

		/**
		 * The meta object literal for the '{@link Workshop.impl.RessourceImpl <em>Ressource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Workshop.impl.RessourceImpl
		 * @see Workshop.impl.WorkshopPackageImpl#getRessource()
		 * @generated
		 */
		EClass RESSOURCE = eINSTANCE.getRessource();

		/**
		 * The meta object literal for the '{@link Workshop.impl.AGVImpl <em>AGV</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Workshop.impl.AGVImpl
		 * @see Workshop.impl.WorkshopPackageImpl#getAGV()
		 * @generated
		 */
		EClass AGV = eINSTANCE.getAGV();

		/**
		 * The meta object literal for the '{@link Workshop.impl.MachineImpl <em>Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Workshop.impl.MachineImpl
		 * @see Workshop.impl.WorkshopPackageImpl#getMachine()
		 * @generated
		 */
		EClass MACHINE = eINSTANCE.getMachine();

	}

} //WorkshopPackage
