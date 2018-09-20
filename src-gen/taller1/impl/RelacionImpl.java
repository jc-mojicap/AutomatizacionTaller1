/**
 */
package taller1.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import taller1.Entidad;
import taller1.Relacion;
import taller1.Taller1Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relacion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link taller1.impl.RelacionImpl#getEntidad <em>Entidad</em>}</li>
 *   <li>{@link taller1.impl.RelacionImpl#isIsWeak <em>Is Weak</em>}</li>
 *   <li>{@link taller1.impl.RelacionImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelacionImpl extends MinimalEObjectImpl.Container implements Relacion {
	/**
	 * The cached value of the '{@link #getEntidad() <em>Entidad</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntidad()
	 * @generated
	 * @ordered
	 */
	protected Entidad entidad;

	/**
	 * The default value of the '{@link #isIsWeak() <em>Is Weak</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsWeak()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_WEAK_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsWeak() <em>Is Weak</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsWeak()
	 * @generated
	 * @ordered
	 */
	protected boolean isWeak = IS_WEAK_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelacionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Taller1Package.Literals.RELACION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entidad getEntidad() {
		if (entidad != null && entidad.eIsProxy()) {
			InternalEObject oldEntidad = (InternalEObject) entidad;
			entidad = (Entidad) eResolveProxy(oldEntidad);
			if (entidad != oldEntidad) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Taller1Package.RELACION__ENTIDAD,
							oldEntidad, entidad));
			}
		}
		return entidad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entidad basicGetEntidad() {
		return entidad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntidad(Entidad newEntidad) {
		Entidad oldEntidad = entidad;
		entidad = newEntidad;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Taller1Package.RELACION__ENTIDAD, oldEntidad,
					entidad));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsWeak() {
		return isWeak;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsWeak(boolean newIsWeak) {
		boolean oldIsWeak = isWeak;
		isWeak = newIsWeak;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Taller1Package.RELACION__IS_WEAK, oldIsWeak, isWeak));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Taller1Package.RELACION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Taller1Package.RELACION__ENTIDAD:
			if (resolve)
				return getEntidad();
			return basicGetEntidad();
		case Taller1Package.RELACION__IS_WEAK:
			return isIsWeak();
		case Taller1Package.RELACION__NAME:
			return getName();
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
		case Taller1Package.RELACION__ENTIDAD:
			setEntidad((Entidad) newValue);
			return;
		case Taller1Package.RELACION__IS_WEAK:
			setIsWeak((Boolean) newValue);
			return;
		case Taller1Package.RELACION__NAME:
			setName((String) newValue);
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
		case Taller1Package.RELACION__ENTIDAD:
			setEntidad((Entidad) null);
			return;
		case Taller1Package.RELACION__IS_WEAK:
			setIsWeak(IS_WEAK_EDEFAULT);
			return;
		case Taller1Package.RELACION__NAME:
			setName(NAME_EDEFAULT);
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
		case Taller1Package.RELACION__ENTIDAD:
			return entidad != null;
		case Taller1Package.RELACION__IS_WEAK:
			return isWeak != IS_WEAK_EDEFAULT;
		case Taller1Package.RELACION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (isWeak: ");
		result.append(isWeak);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //RelacionImpl
