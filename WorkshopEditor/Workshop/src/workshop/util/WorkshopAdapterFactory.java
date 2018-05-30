/**
 */
package workshop.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import workshop.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see workshop.WorkshopPackage
 * @generated
 */
public class WorkshopAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WorkshopPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkshopAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = WorkshopPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkshopSwitch<Adapter> modelSwitch =
		new WorkshopSwitch<Adapter>() {
			@Override
			public Adapter caseLayout(Layout object) {
				return createLayoutAdapter();
			}
			@Override
			public Adapter caseNode(Node object) {
				return createNodeAdapter();
			}
			@Override
			public Adapter caseWorkstation(Workstation object) {
				return createWorkstationAdapter();
			}
			@Override
			public Adapter caseMachines(Machines object) {
				return createMachinesAdapter();
			}
			@Override
			public Adapter caseStorage(Storage object) {
				return createStorageAdapter();
			}
			@Override
			public Adapter caseAssembly(Assembly object) {
				return createAssemblyAdapter();
			}
			@Override
			public Adapter caseEmptyNode(EmptyNode object) {
				return createEmptyNodeAdapter();
			}
			@Override
			public Adapter caseAssemblyMachine(AssemblyMachine object) {
				return createAssemblyMachineAdapter();
			}
			@Override
			public Adapter caseStorageMachine(StorageMachine object) {
				return createStorageMachineAdapter();
			}
			@Override
			public Adapter caseAGV(AGV object) {
				return createAGVAdapter();
			}
			@Override
			public Adapter caseConveyor(Conveyor object) {
				return createConveyorAdapter();
			}
			@Override
			public Adapter caseLinkerMachine(LinkerMachine object) {
				return createLinkerMachineAdapter();
			}
			@Override
			public Adapter caseExchanger(Exchanger object) {
				return createExchangerAdapter();
			}
			@Override
			public Adapter caseFeeder(Feeder object) {
				return createFeederAdapter();
			}
			@Override
			public Adapter casePorts(Ports object) {
				return createPortsAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link workshop.Layout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workshop.Layout
	 * @generated
	 */
	public Adapter createLayoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link workshop.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workshop.Node
	 * @generated
	 */
	public Adapter createNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link workshop.Workstation <em>Workstation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workshop.Workstation
	 * @generated
	 */
	public Adapter createWorkstationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link workshop.Machines <em>Machines</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workshop.Machines
	 * @generated
	 */
	public Adapter createMachinesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link workshop.Storage <em>Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workshop.Storage
	 * @generated
	 */
	public Adapter createStorageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link workshop.Assembly <em>Assembly</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workshop.Assembly
	 * @generated
	 */
	public Adapter createAssemblyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link workshop.EmptyNode <em>Empty Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workshop.EmptyNode
	 * @generated
	 */
	public Adapter createEmptyNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link workshop.AssemblyMachine <em>Assembly Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workshop.AssemblyMachine
	 * @generated
	 */
	public Adapter createAssemblyMachineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link workshop.StorageMachine <em>Storage Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workshop.StorageMachine
	 * @generated
	 */
	public Adapter createStorageMachineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link workshop.AGV <em>AGV</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workshop.AGV
	 * @generated
	 */
	public Adapter createAGVAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link workshop.Conveyor <em>Conveyor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workshop.Conveyor
	 * @generated
	 */
	public Adapter createConveyorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link workshop.LinkerMachine <em>Linker Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workshop.LinkerMachine
	 * @generated
	 */
	public Adapter createLinkerMachineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link workshop.Exchanger <em>Exchanger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workshop.Exchanger
	 * @generated
	 */
	public Adapter createExchangerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link workshop.Feeder <em>Feeder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workshop.Feeder
	 * @generated
	 */
	public Adapter createFeederAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link workshop.Ports <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workshop.Ports
	 * @generated
	 */
	public Adapter createPortsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //WorkshopAdapterFactory
