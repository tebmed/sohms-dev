/**
 */
package workshop.tests;

import junit.textui.TestRunner;

import workshop.WorkshopFactory;
import workshop.Workstation;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Workstation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WorkstationTest extends NodeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(WorkstationTest.class);
	}

	/**
	 * Constructs a new Workstation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkstationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Workstation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Workstation getFixture() {
		return (Workstation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(WorkshopFactory.eINSTANCE.createWorkstation());
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

} //WorkstationTest
