/**
 */
package workshop.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import workshop.FlowItem;
import workshop.Transporter;
import workshop.WorkshopPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transporter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link workshop.impl.TransporterImpl#getFlowitem <em>Flowitem</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransporterImpl extends MachinesImpl implements Transporter {
	/**
	 * The cached value of the '{@link #getFlowitem() <em>Flowitem</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowitem()
	 * @generated
	 * @ordered
	 */
	protected EList<FlowItem> flowitem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransporterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkshopPackage.Literals.TRANSPORTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FlowItem> getFlowitem() {
		if (flowitem == null) {
			flowitem = new EObjectContainmentEList<FlowItem>(FlowItem.class, this, WorkshopPackage.TRANSPORTER__FLOWITEM);
		}
		return flowitem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WorkshopPackage.TRANSPORTER__FLOWITEM:
				return ((InternalEList<?>)getFlowitem()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WorkshopPackage.TRANSPORTER__FLOWITEM:
				return getFlowitem();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WorkshopPackage.TRANSPORTER__FLOWITEM:
				getFlowitem().clear();
				getFlowitem().addAll((Collection<? extends FlowItem>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case WorkshopPackage.TRANSPORTER__FLOWITEM:
				getFlowitem().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case WorkshopPackage.TRANSPORTER__FLOWITEM:
				return flowitem != null && !flowitem.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TransporterImpl
