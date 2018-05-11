/**
 */
package workshop.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import workshop.Ports;
import workshop.WorkshopFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Ports</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PortsTest extends TestCase {

	/**
	 * The fixture for this Ports test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Ports fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PortsTest.class);
	}

	/**
	 * Constructs a new Ports test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortsTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Ports test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Ports fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Ports test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Ports getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(WorkshopFactory.eINSTANCE.createPorts());
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

} //PortsTest
