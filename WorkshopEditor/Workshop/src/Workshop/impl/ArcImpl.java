/**
 */
package Workshop.impl;

import Workshop.Arc;
import Workshop.Station;
import Workshop.WorkshopPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Workshop.impl.ArcImpl#getFromN <em>From N</em>}</li>
 *   <li>{@link Workshop.impl.ArcImpl#getToN <em>To N</em>}</li>
 *   <li>{@link Workshop.impl.ArcImpl#getId <em>Id</em>}</li>
 *   <li>{@link Workshop.impl.ArcImpl#getCost <em>Cost</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArcImpl extends MinimalEObjectImpl.Container implements Arc {
	/**
	 * The cached value of the '{@link #getFromN() <em>From N</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromN()
	 * @generated
	 * @ordered
	 */
	protected Station fromN;

	/**
	 * The cached value of the '{@link #getToN() <em>To N</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToN()
	 * @generated
	 * @ordered
	 */
	protected Station toN;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected static final int COST_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected int cost = COST_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArcImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkshopPackage.Literals.ARC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Station getFromN() {
		if (fromN != null && fromN.eIsProxy()) {
			InternalEObject oldFromN = (InternalEObject)fromN;
			fromN = (Station)eResolveProxy(oldFromN);
			if (fromN != oldFromN) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkshopPackage.ARC__FROM_N, oldFromN, fromN));
			}
		}
		return fromN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Station basicGetFromN() {
		return fromN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromN(Station newFromN) {
		Station oldFromN = fromN;
		fromN = newFromN;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkshopPackage.ARC__FROM_N, oldFromN, fromN));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Station getToN() {
		if (toN != null && toN.eIsProxy()) {
			InternalEObject oldToN = (InternalEObject)toN;
			toN = (Station)eResolveProxy(oldToN);
			if (toN != oldToN) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkshopPackage.ARC__TO_N, oldToN, toN));
			}
		}
		return toN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Station basicGetToN() {
		return toN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToN(Station newToN) {
		Station oldToN = toN;
		toN = newToN;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkshopPackage.ARC__TO_N, oldToN, toN));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkshopPackage.ARC__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCost() {
		return cost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCost(int newCost) {
		int oldCost = cost;
		cost = newCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkshopPackage.ARC__COST, oldCost, cost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WorkshopPackage.ARC__FROM_N:
				if (resolve) return getFromN();
				return basicGetFromN();
			case WorkshopPackage.ARC__TO_N:
				if (resolve) return getToN();
				return basicGetToN();
			case WorkshopPackage.ARC__ID:
				return getId();
			case WorkshopPackage.ARC__COST:
				return getCost();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WorkshopPackage.ARC__FROM_N:
				setFromN((Station)newValue);
				return;
			case WorkshopPackage.ARC__TO_N:
				setToN((Station)newValue);
				return;
			case WorkshopPackage.ARC__ID:
				setId((Integer)newValue);
				return;
			case WorkshopPackage.ARC__COST:
				setCost((Integer)newValue);
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
			case WorkshopPackage.ARC__FROM_N:
				setFromN((Station)null);
				return;
			case WorkshopPackage.ARC__TO_N:
				setToN((Station)null);
				return;
			case WorkshopPackage.ARC__ID:
				setId(ID_EDEFAULT);
				return;
			case WorkshopPackage.ARC__COST:
				setCost(COST_EDEFAULT);
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
			case WorkshopPackage.ARC__FROM_N:
				return fromN != null;
			case WorkshopPackage.ARC__TO_N:
				return toN != null;
			case WorkshopPackage.ARC__ID:
				return id != ID_EDEFAULT;
			case WorkshopPackage.ARC__COST:
				return cost != COST_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", cost: ");
		result.append(cost);
		result.append(')');
		return result.toString();
	}

} //ArcImpl
