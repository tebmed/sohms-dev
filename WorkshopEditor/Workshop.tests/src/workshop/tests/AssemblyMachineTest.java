/**
 */
package workshop.tests;

import junit.textui.TestRunner;

import workshop.AssemblyMachine;
import workshop.WorkshopFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Assembly Machine</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AssemblyMachineTest extends MachinesTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AssemblyMachineTest.class);
	}

	/**
	 * Constructs a new Assembly Machine test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyMachineTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Assembly Machine test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AssemblyMachine getFixture() {
		return (AssemblyMachine)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(WorkshopFactory.eINSTANCE.createAssemblyMachine());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //AssemblyMachineTest
