/**
 */
package workshop.tests;

import junit.textui.TestRunner;

import workshop.OutputPorts;
import workshop.WorkshopFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Output Ports</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OutputPortsTest extends PortsTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OutputPortsTest.class);
	}

	/**
	 * Constructs a new Output Ports test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPortsTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Output Ports test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected OutputPorts getFixture() {
		return (OutputPorts)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(WorkshopFactory.eINSTANCE.createOutputPorts());
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

} //OutputPortsTest
