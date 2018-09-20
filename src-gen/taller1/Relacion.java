/**
 */
package taller1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relacion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link taller1.Relacion#getEntidad <em>Entidad</em>}</li>
 *   <li>{@link taller1.Relacion#isIsWeak <em>Is Weak</em>}</li>
 *   <li>{@link taller1.Relacion#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see taller1.Taller1Package#getRelacion()
 * @model
 * @generated
 */
public interface Relacion extends EObject {
	/**
	 * Returns the value of the '<em><b>Entidad</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entidad</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entidad</em>' reference.
	 * @see #setEntidad(Entidad)
	 * @see taller1.Taller1Package#getRelacion_Entidad()
	 * @model
	 * @generated
	 */
	Entidad getEntidad();

	/**
	 * Sets the value of the '{@link taller1.Relacion#getEntidad <em>Entidad</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entidad</em>' reference.
	 * @see #getEntidad()
	 * @generated
	 */
	void setEntidad(Entidad value);

	/**
	 * Returns the value of the '<em><b>Is Weak</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Weak</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Weak</em>' attribute.
	 * @see #setIsWeak(boolean)
	 * @see taller1.Taller1Package#getRelacion_IsWeak()
	 * @model default="false" unique="false"
	 * @generated
	 */
	boolean isIsWeak();

	/**
	 * Sets the value of the '{@link taller1.Relacion#isIsWeak <em>Is Weak</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Weak</em>' attribute.
	 * @see #isIsWeak()
	 * @generated
	 */
	void setIsWeak(boolean value);

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
	 * @see taller1.Taller1Package#getRelacion_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link taller1.Relacion#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Relacion
