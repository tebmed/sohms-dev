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

import workshop.Storage;
import workshop.StorageMachine;
import workshop.WorkshopPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Storage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link workshop.impl.StorageImpl#getStoragemachine <em>Storagemachine</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StorageImpl extends WorkstationImpl implements Storage {
	/**
	 * The cached value of the '{@link #getStoragemachine() <em>Storagemachine</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoragemachine()
	 * @generated
	 * @ordered
	 */
	protected EList<StorageMachine> storagemachine;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StorageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkshopPackage.Literals.STORAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StorageMachine> getStoragemachine() {
		if (storagemachine == null) {
			storagemachine = new EObjectContainmentEList<StorageMachine>(StorageMachine.class, this, WorkshopPackage.STORAGE__STORAGEMACHINE);
		}
		return storagemachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WorkshopPackage.STORAGE__STORAGEMACHINE:
				return ((InternalEList<?>)getStoragemachine()).basicRemove(otherEnd, msgs);
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
			case WorkshopPackage.STORAGE__STORAGEMACHINE:
				return getStoragemachine();
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
			case WorkshopPackage.STORAGE__STORAGEMACHINE:
				getStoragemachine().clear();
				getStoragemachine().addAll((Collection<? extends StorageMachine>)newValue);
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
			case WorkshopPackage.STORAGE__STORAGEMACHINE:
				getStoragemachine().clear();
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
			case WorkshopPackage.STORAGE__STORAGEMACHINE:
				return storagemachine != null && !storagemachine.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StorageImpl
