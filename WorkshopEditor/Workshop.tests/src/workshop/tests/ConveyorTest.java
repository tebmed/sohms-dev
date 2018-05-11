/**
 */
package workshop.tests;

import junit.textui.TestRunner;

import workshop.Conveyor;
import workshop.WorkshopFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Conveyor</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConveyorTest extends MachinesTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ConveyorTest.class);
	}

	/**
	 * Constructs a new Conveyor test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConveyorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Conveyor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Conveyor getFixture() {
		return (Conveyor)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(WorkshopFactory.eINSTANCE.createConveyor());
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

} //ConveyorTest
