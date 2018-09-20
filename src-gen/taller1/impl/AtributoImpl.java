/**
 */
package taller1.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import taller1.Atributo;
import taller1.Taller1Package;
import taller1.TipoAtributo;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atributo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link taller1.impl.AtributoImpl#getName <em>Name</em>}</li>
 *   <li>{@link taller1.impl.AtributoImpl#getType <em>Type</em>}</li>
 *   <li>{@link taller1.impl.AtributoImpl#isIsPrimary <em>Is Primary</em>}</li>
 *   <li>{@link taller1.impl.AtributoImpl#isIsTitle <em>Is Title</em>}</li>
 *   <li>{@link taller1.impl.AtributoImpl#isIsRequired <em>Is Required</em>}</li>
 *   <li>{@link taller1.impl.AtributoImpl#isIsVisibleInList <em>Is Visible In List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AtributoImpl extends MinimalEObjectImpl.Container implements Atributo {
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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TipoAtributo TYPE_EDEFAULT = TipoAtributo.ESTRING;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TipoAtributo type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsPrimary() <em>Is Primary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPrimary()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PRIMARY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsPrimary() <em>Is Primary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPrimary()
	 * @generated
	 * @ordered
	 */
	protected boolean isPrimary = IS_PRIMARY_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsTitle() <em>Is Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsTitle()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_TITLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsTitle() <em>Is Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsTitle()
	 * @generated
	 * @ordered
	 */
	protected boolean isTitle = IS_TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsRequired() <em>Is Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRequired()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_REQUIRED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsRequired() <em>Is Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRequired()
	 * @generated
	 * @ordered
	 */
	protected boolean isRequired = IS_REQUIRED_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsVisibleInList() <em>Is Visible In List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsVisibleInList()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_VISIBLE_IN_LIST_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsVisibleInList() <em>Is Visible In List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsVisibleInList()
	 * @generated
	 * @ordered
	 */
	protected boolean isVisibleInList = IS_VISIBLE_IN_LIST_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtributoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Taller1Package.Literals.ATRIBUTO;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Taller1Package.ATRIBUTO__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoAtributo getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TipoAtributo newType) {
		TipoAtributo oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Taller1Package.ATRIBUTO__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsPrimary() {
		return isPrimary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPrimary(boolean newIsPrimary) {
		boolean oldIsPrimary = isPrimary;
		isPrimary = newIsPrimary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Taller1Package.ATRIBUTO__IS_PRIMARY, oldIsPrimary,
					isPrimary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsTitle() {
		return isTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsTitle(boolean newIsTitle) {
		boolean oldIsTitle = isTitle;
		isTitle = newIsTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Taller1Package.ATRIBUTO__IS_TITLE, oldIsTitle,
					isTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsRequired() {
		return isRequired;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsRequired(boolean newIsRequired) {
		boolean oldIsRequired = isRequired;
		isRequired = newIsRequired;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Taller1Package.ATRIBUTO__IS_REQUIRED, oldIsRequired,
					isRequired));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsVisibleInList() {
		return isVisibleInList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsVisibleInList(boolean newIsVisibleInList) {
		boolean oldIsVisibleInList = isVisibleInList;
		isVisibleInList = newIsVisibleInList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Taller1Package.ATRIBUTO__IS_VISIBLE_IN_LIST,
					oldIsVisibleInList, isVisibleInList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Taller1Package.ATRIBUTO__NAME:
			return getName();
		case Taller1Package.ATRIBUTO__TYPE:
			return getType();
		case Taller1Package.ATRIBUTO__IS_PRIMARY:
			return isIsPrimary();
		case Taller1Package.ATRIBUTO__IS_TITLE:
			return isIsTitle();
		case Taller1Package.ATRIBUTO__IS_REQUIRED:
			return isIsRequired();
		case Taller1Package.ATRIBUTO__IS_VISIBLE_IN_LIST:
			return isIsVisibleInList();
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
		case Taller1Package.ATRIBUTO__NAME:
			setName((String) newValue);
			return;
		case Taller1Package.ATRIBUTO__TYPE:
			setType((TipoAtributo) newValue);
			return;
		case Taller1Package.ATRIBUTO__IS_PRIMARY:
			setIsPrimary((Boolean) newValue);
			return;
		case Taller1Package.ATRIBUTO__IS_TITLE:
			setIsTitle((Boolean) newValue);
			return;
		case Taller1Package.ATRIBUTO__IS_REQUIRED:
			setIsRequired((Boolean) newValue);
			return;
		case Taller1Package.ATRIBUTO__IS_VISIBLE_IN_LIST:
			setIsVisibleInList((Boolean) newValue);
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
		case Taller1Package.ATRIBUTO__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Taller1Package.ATRIBUTO__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case Taller1Package.ATRIBUTO__IS_PRIMARY:
			setIsPrimary(IS_PRIMARY_EDEFAULT);
			return;
		case Taller1Package.ATRIBUTO__IS_TITLE:
			setIsTitle(IS_TITLE_EDEFAULT);
			return;
		case Taller1Package.ATRIBUTO__IS_REQUIRED:
			setIsRequired(IS_REQUIRED_EDEFAULT);
			return;
		case Taller1Package.ATRIBUTO__IS_VISIBLE_IN_LIST:
			setIsVisibleInList(IS_VISIBLE_IN_LIST_EDEFAULT);
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
		case Taller1Package.ATRIBUTO__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Taller1Package.ATRIBUTO__TYPE:
			return type != TYPE_EDEFAULT;
		case Taller1Package.ATRIBUTO__IS_PRIMARY:
			return isPrimary != IS_PRIMARY_EDEFAULT;
		case Taller1Package.ATRIBUTO__IS_TITLE:
			return isTitle != IS_TITLE_EDEFAULT;
		case Taller1Package.ATRIBUTO__IS_REQUIRED:
			return isRequired != IS_REQUIRED_EDEFAULT;
		case Taller1Package.ATRIBUTO__IS_VISIBLE_IN_LIST:
			return isVisibleInList != IS_VISIBLE_IN_LIST_EDEFAULT;
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
		result.append(", type: ");
		result.append(type);
		result.append(", isPrimary: ");
		result.append(isPrimary);
		result.append(", isTitle: ");
		result.append(isTitle);
		result.append(", isRequired: ");
		result.append(isRequired);
		result.append(", isVisibleInList: ");
		result.append(isVisibleInList);
		result.append(')');
		return result.toString();
	}

} //AtributoImpl
