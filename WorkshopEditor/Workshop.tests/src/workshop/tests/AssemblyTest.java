/**
 */
package workshop.tests;

import junit.textui.TestRunner;

import workshop.Assembly;
import workshop.WorkshopFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Assembly</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AssemblyTest extends WorkstationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AssemblyTest.class);
	}

	/**
	 * Constructs a new Assembly test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Assembly test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Assembly getFixture() {
		return (Assembly)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(WorkshopFactory.eINSTANCE.createAssembly());
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

} //AssemblyTest
