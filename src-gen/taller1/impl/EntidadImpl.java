/**
 */
package taller1.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import taller1.Atributo;
import taller1.Entidad;
import taller1.Relacion;
import taller1.Taller1Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entidad</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link taller1.impl.EntidadImpl#getName <em>Name</em>}</li>
 *   <li>{@link taller1.impl.EntidadImpl#getDetalles <em>Detalles</em>}</li>
 *   <li>{@link taller1.impl.EntidadImpl#getRelacion <em>Relacion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntidadImpl extends MinimalEObjectImpl.Container implements Entidad {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDetalles() <em>Detalles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetalles()
	 * @generated
	 * @ordered
	 */
	protected EList<Atributo> detalles;

	/**
	 * The cached value of the '{@link #getRelacion() <em>Relacion</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelacion()
	 * @generated
	 * @ordered
	 */
	protected EList<Relacion> relacion;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntidadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Taller1Package.Literals.ENTIDAD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Taller1Package.ENTIDAD__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Atributo> getDetalles() {
		if (detalles == null) {
			detalles = new EObjectContainmentEList<Atributo>(Atributo.class, this, Taller1Package.ENTIDAD__DETALLES);
		}
		return detalles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relacion> getRelacion() {
		if (relacion == null) {
			relacion = new EObjectContainmentEList<Relacion>(Relacion.class, this, Taller1Package.ENTIDAD__RELACION);
		}
		return relacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Taller1Package.ENTIDAD__DETALLES:
			return ((InternalEList<?>) getDetalles()).basicRemove(otherEnd, msgs);
		case Taller1Package.ENTIDAD__RELACION:
			return ((InternalEList<?>) getRelacion()).basicRemove(otherEnd, msgs);
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
		case Taller1Package.ENTIDAD__NAME:
			return getName();
		case Taller1Package.ENTIDAD__DETALLES:
			return getDetalles();
		case Taller1Package.ENTIDAD__RELACION:
			return getRelacion();
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
		case Taller1Package.ENTIDAD__NAME:
			setName((String) newValue);
			return;
		case Taller1Package.ENTIDAD__DETALLES:
			getDetalles().clear();
			getDetalles().addAll((Collection<? extends Atributo>) newValue);
			return;
		case Taller1Package.ENTIDAD__RELACION:
			getRelacion().clear();
			getRelacion().addAll((Collection<? extends Relacion>) newValue);
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
		case Taller1Package.ENTIDAD__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Taller1Package.ENTIDAD__DETALLES:
			getDetalles().clear();
			return;
		case Taller1Package.ENTIDAD__RELACION:
			getRelacion().clear();
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
		case Taller1Package.ENTIDAD__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Taller1Package.ENTIDAD__DETALLES:
			return detalles != null && !detalles.isEmpty();
		case Taller1Package.ENTIDAD__RELACION:
			return relacion != null && !relacion.isEmpty();
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
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //EntidadImpl
