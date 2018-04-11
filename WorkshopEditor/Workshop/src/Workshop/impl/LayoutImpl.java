/**
 */
package Workshop.impl;

import Workshop.Arc;
import Workshop.Layout;
import Workshop.Station;
import Workshop.WorkshopPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Layout</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Workshop.impl.LayoutImpl#getNode <em>Node</em>}</li>
 *   <li>{@link Workshop.impl.LayoutImpl#getArc <em>Arc</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LayoutImpl extends MinimalEObjectImpl.Container implements Layout {
	/**
	 * The cached value of the '{@link #getNode() <em>Node</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode()
	 * @generated
	 * @ordered
	 */
	protected EList<Station> node;

	/**
	 * The cached value of the '{@link #getArc() <em>Arc</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArc()
	 * @generated
	 * @ordered
	 */
	protected EList<Arc> arc;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LayoutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkshopPackage.Literals.LAYOUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Station> getNode() {
		if (node == null) {
			node = new EObjectContainmentEList<Station>(Station.class, this, WorkshopPackage.LAYOUT__NODE);
		}
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arc> getArc() {
		if (arc == null) {
			arc = new EObjectContainmentEList<Arc>(Arc.class, this, WorkshopPackage.LAYOUT__ARC);
		}
		return arc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WorkshopPackage.LAYOUT__NODE:
				return ((InternalEList<?>)getNode()).basicRemove(otherEnd, msgs);
			case WorkshopPackage.LAYOUT__ARC:
				return ((InternalEList<?>)getArc()).basicRemove(otherEnd, msgs);
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
			case WorkshopPackage.LAYOUT__NODE:
				return getNode();
			case WorkshopPackage.LAYOUT__ARC:
				return getArc();
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
			case WorkshopPackage.LAYOUT__NODE:
				getNode().clear();
				getNode().addAll((Collection<? extends Station>)newValue);
				return;
			case WorkshopPackage.LAYOUT__ARC:
				getArc().clear();
				getArc().addAll((Collection<? extends Arc>)newValue);
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
			case WorkshopPackage.LAYOUT__NODE:
				getNode().clear();
				return;
			case WorkshopPackage.LAYOUT__ARC:
				getArc().clear();
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
			case WorkshopPackage.LAYOUT__NODE:
				return node != null && !node.isEmpty();
			case WorkshopPackage.LAYOUT__ARC:
				return arc != null && !arc.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LayoutImpl
