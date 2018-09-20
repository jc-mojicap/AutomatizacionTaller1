/**
 */
package taller1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Noor App</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link taller1.NoorApp#getEntidades <em>Entidades</em>}</li>
 *   <li>{@link taller1.NoorApp#getNameApp <em>Name App</em>}</li>
 *   <li>{@link taller1.NoorApp#getTextColor <em>Text Color</em>}</li>
 *   <li>{@link taller1.NoorApp#getButtonColor <em>Button Color</em>}</li>
 *   <li>{@link taller1.NoorApp#getBarColor <em>Bar Color</em>}</li>
 * </ul>
 *
 * @see taller1.Taller1Package#getNoorApp()
 * @model
 * @generated
 */
public interface NoorApp extends EObject {
	/**
	 * Returns the value of the '<em><b>Entidades</b></em>' containment reference list.
	 * The list contents are of type {@link taller1.Entidad}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entidades</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entidades</em>' containment reference list.
	 * @see taller1.Taller1Package#getNoorApp_Entidades()
	 * @model containment="true"
	 * @generated
	 */
	EList<Entidad> getEntidades();

	/**
	 * Returns the value of the '<em><b>Name App</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name App</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name App</em>' attribute.
	 * @see #setNameApp(String)
	 * @see taller1.Taller1Package#getNoorApp_NameApp()
	 * @model
	 * @generated
	 */
	String getNameApp();

	/**
	 * Sets the value of the '{@link taller1.NoorApp#getNameApp <em>Name App</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name App</em>' attribute.
	 * @see #getNameApp()
	 * @generated
	 */
	void setNameApp(String value);

	/**
	 * Returns the value of the '<em><b>Text Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Color</em>' attribute.
	 * @see #setTextColor(String)
	 * @see taller1.Taller1Package#getNoorApp_TextColor()
	 * @model
	 * @generated
	 */
	String getTextColor();

	/**
	 * Sets the value of the '{@link taller1.NoorApp#getTextColor <em>Text Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Color</em>' attribute.
	 * @see #getTextColor()
	 * @generated
	 */
	void setTextColor(String value);

	/**
	 * Returns the value of the '<em><b>Button Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Button Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Button Color</em>' attribute.
	 * @see #setButtonColor(String)
	 * @see taller1.Taller1Package#getNoorApp_ButtonColor()
	 * @model
	 * @generated
	 */
	String getButtonColor();

	/**
	 * Sets the value of the '{@link taller1.NoorApp#getButtonColor <em>Button Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Button Color</em>' attribute.
	 * @see #getButtonColor()
	 * @generated
	 */
	void setButtonColor(String value);

	/**
	 * Returns the value of the '<em><b>Bar Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bar Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bar Color</em>' attribute.
	 * @see #setBarColor(String)
	 * @see taller1.Taller1Package#getNoorApp_BarColor()
	 * @model
	 * @generated
	 */
	String getBarColor();

	/**
	 * Sets the value of the '{@link taller1.NoorApp#getBarColor <em>Bar Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bar Color</em>' attribute.
	 * @see #getBarColor()
	 * @generated
	 */
	void setBarColor(String value);

} // NoorApp
