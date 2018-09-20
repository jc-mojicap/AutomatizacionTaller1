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

import taller1.Entidad;
import taller1.NoorApp;
import taller1.Taller1Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Noor App</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link taller1.impl.NoorAppImpl#getEntidades <em>Entidades</em>}</li>
 *   <li>{@link taller1.impl.NoorAppImpl#getNameApp <em>Name App</em>}</li>
 *   <li>{@link taller1.impl.NoorAppImpl#getTextColor <em>Text Color</em>}</li>
 *   <li>{@link taller1.impl.NoorAppImpl#getButtonColor <em>Button Color</em>}</li>
 *   <li>{@link taller1.impl.NoorAppImpl#getBarColor <em>Bar Color</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NoorAppImpl extends MinimalEObjectImpl.Container implements NoorApp {
	/**
	 * The cached value of the '{@link #getEntidades() <em>Entidades</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntidades()
	 * @generated
	 * @ordered
	 */
	protected EList<Entidad> entidades;

	/**
	 * The default value of the '{@link #getNameApp() <em>Name App</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameApp()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_APP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameApp() <em>Name App</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameApp()
	 * @generated
	 * @ordered
	 */
	protected String nameApp = NAME_APP_EDEFAULT;

	/**
	 * The default value of the '{@link #getTextColor() <em>Text Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextColor()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTextColor() <em>Text Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextColor()
	 * @generated
	 * @ordered
	 */
	protected String textColor = TEXT_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getButtonColor() <em>Button Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getButtonColor()
	 * @generated
	 * @ordered
	 */
	protected static final String BUTTON_COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getButtonColor() <em>Button Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getButtonColor()
	 * @generated
	 * @ordered
	 */
	protected String buttonColor = BUTTON_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getBarColor() <em>Bar Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBarColor()
	 * @generated
	 * @ordered
	 */
	protected static final String BAR_COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBarColor() <em>Bar Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBarColor()
	 * @generated
	 * @ordered
	 */
	protected String barColor = BAR_COLOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NoorAppImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Taller1Package.Literals.NOOR_APP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entidad> getEntidades() {
		if (entidades == null) {
			entidades = new EObjectContainmentEList<Entidad>(Entidad.class, this, Taller1Package.NOOR_APP__ENTIDADES);
		}
		return entidades;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameApp() {
		return nameApp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameApp(String newNameApp) {
		String oldNameApp = nameApp;
		nameApp = newNameApp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Taller1Package.NOOR_APP__NAME_APP, oldNameApp,
					nameApp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTextColor() {
		return textColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextColor(String newTextColor) {
		String oldTextColor = textColor;
		textColor = newTextColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Taller1Package.NOOR_APP__TEXT_COLOR, oldTextColor,
					textColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getButtonColor() {
		return buttonColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setButtonColor(String newButtonColor) {
		String oldButtonColor = buttonColor;
		buttonColor = newButtonColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Taller1Package.NOOR_APP__BUTTON_COLOR, oldButtonColor,
					buttonColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBarColor() {
		return barColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBarColor(String newBarColor) {
		String oldBarColor = barColor;
		barColor = newBarColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Taller1Package.NOOR_APP__BAR_COLOR, oldBarColor,
					barColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Taller1Package.NOOR_APP__ENTIDADES:
			return ((InternalEList<?>) getEntidades()).basicRemove(otherEnd, msgs);
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
		case Taller1Package.NOOR_APP__ENTIDADES:
			return getEntidades();
		case Taller1Package.NOOR_APP__NAME_APP:
			return getNameApp();
		case Taller1Package.NOOR_APP__TEXT_COLOR:
			return getTextColor();
		case Taller1Package.NOOR_APP__BUTTON_COLOR:
			return getButtonColor();
		case Taller1Package.NOOR_APP__BAR_COLOR:
			return getBarColor();
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
		case Taller1Package.NOOR_APP__ENTIDADES:
			getEntidades().clear();
			getEntidades().addAll((Collection<? extends Entidad>) newValue);
			return;
		case Taller1Package.NOOR_APP__NAME_APP:
			setNameApp((String) newValue);
			return;
		case Taller1Package.NOOR_APP__TEXT_COLOR:
			setTextColor((String) newValue);
			return;
		case Taller1Package.NOOR_APP__BUTTON_COLOR:
			setButtonColor((String) newValue);
			return;
		case Taller1Package.NOOR_APP__BAR_COLOR:
			setBarColor((String) newValue);
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
		case Taller1Package.NOOR_APP__ENTIDADES:
			getEntidades().clear();
			return;
		case Taller1Package.NOOR_APP__NAME_APP:
			setNameApp(NAME_APP_EDEFAULT);
			return;
		case Taller1Package.NOOR_APP__TEXT_COLOR:
			setTextColor(TEXT_COLOR_EDEFAULT);
			return;
		case Taller1Package.NOOR_APP__BUTTON_COLOR:
			setButtonColor(BUTTON_COLOR_EDEFAULT);
			return;
		case Taller1Package.NOOR_APP__BAR_COLOR:
			setBarColor(BAR_COLOR_EDEFAULT);
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
		case Taller1Package.NOOR_APP__ENTIDADES:
			return entidades != null && !entidades.isEmpty();
		case Taller1Package.NOOR_APP__NAME_APP:
			return NAME_APP_EDEFAULT == null ? nameApp != null : !NAME_APP_EDEFAULT.equals(nameApp);
		case Taller1Package.NOOR_APP__TEXT_COLOR:
			return TEXT_COLOR_EDEFAULT == null ? textColor != null : !TEXT_COLOR_EDEFAULT.equals(textColor);
		case Taller1Package.NOOR_APP__BUTTON_COLOR:
			return BUTTON_COLOR_EDEFAULT == null ? buttonColor != null : !BUTTON_COLOR_EDEFAULT.equals(buttonColor);
		case Taller1Package.NOOR_APP__BAR_COLOR:
			return BAR_COLOR_EDEFAULT == null ? barColor != null : !BAR_COLOR_EDEFAULT.equals(barColor);
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
		result.append(" (nameApp: ");
		result.append(nameApp);
		result.append(", textColor: ");
		result.append(textColor);
		result.append(", buttonColor: ");
		result.append(buttonColor);
		result.append(", barColor: ");
		result.append(barColor);
		result.append(')');
		return result.toString();
	}

} //NoorAppImpl
