/**
 */
package taller1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atributo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link taller1.Atributo#getName <em>Name</em>}</li>
 *   <li>{@link taller1.Atributo#getType <em>Type</em>}</li>
 *   <li>{@link taller1.Atributo#isIsPrimary <em>Is Primary</em>}</li>
 *   <li>{@link taller1.Atributo#isIsTitle <em>Is Title</em>}</li>
 *   <li>{@link taller1.Atributo#isIsRequired <em>Is Required</em>}</li>
 *   <li>{@link taller1.Atributo#isIsVisibleInList <em>Is Visible In List</em>}</li>
 * </ul>
 *
 * @see taller1.Taller1Package#getAtributo()
 * @model
 * @generated
 */
public interface Atributo extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see taller1.Taller1Package#getAtributo_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link taller1.Atributo#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"EString"</code>.
	 * The literals are from the enumeration {@link taller1.TipoAtributo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see taller1.TipoAtributo
	 * @see #setType(TipoAtributo)
	 * @see taller1.Taller1Package#getAtributo_Type()
	 * @model default="EString" unique="false" ordered="false"
	 * @generated
	 */
	TipoAtributo getType();

	/**
	 * Sets the value of the '{@link taller1.Atributo#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see taller1.TipoAtributo
	 * @see #getType()
	 * @generated
	 */
	void setType(TipoAtributo value);

	/**
	 * Returns the value of the '<em><b>Is Primary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Primary</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Primary</em>' attribute.
	 * @see #setIsPrimary(boolean)
	 * @see taller1.Taller1Package#getAtributo_IsPrimary()
	 * @model
	 * @generated
	 */
	boolean isIsPrimary();

	/**
	 * Sets the value of the '{@link taller1.Atributo#isIsPrimary <em>Is Primary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Primary</em>' attribute.
	 * @see #isIsPrimary()
	 * @generated
	 */
	void setIsPrimary(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Title</em>' attribute.
	 * @see #setIsTitle(boolean)
	 * @see taller1.Taller1Package#getAtributo_IsTitle()
	 * @model
	 * @generated
	 */
	boolean isIsTitle();

	/**
	 * Sets the value of the '{@link taller1.Atributo#isIsTitle <em>Is Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Title</em>' attribute.
	 * @see #isIsTitle()
	 * @generated
	 */
	void setIsTitle(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Required</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Required</em>' attribute.
	 * @see #setIsRequired(boolean)
	 * @see taller1.Taller1Package#getAtributo_IsRequired()
	 * @model
	 * @generated
	 */
	boolean isIsRequired();

	/**
	 * Sets the value of the '{@link taller1.Atributo#isIsRequired <em>Is Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Required</em>' attribute.
	 * @see #isIsRequired()
	 * @generated
	 */
	void setIsRequired(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Visible In List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Visible In List</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Visible In List</em>' attribute.
	 * @see #setIsVisibleInList(boolean)
	 * @see taller1.Taller1Package#getAtributo_IsVisibleInList()
	 * @model
	 * @generated
	 */
	boolean isIsVisibleInList();

	/**
	 * Sets the value of the '{@link taller1.Atributo#isIsVisibleInList <em>Is Visible In List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Visible In List</em>' attribute.
	 * @see #isIsVisibleInList()
	 * @generated
	 */
	void setIsVisibleInList(boolean value);

} // Atributo
