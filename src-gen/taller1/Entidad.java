/**
 */
package taller1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entidad</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link taller1.Entidad#getName <em>Name</em>}</li>
 *   <li>{@link taller1.Entidad#getDetalles <em>Detalles</em>}</li>
 *   <li>{@link taller1.Entidad#getRelacion <em>Relacion</em>}</li>
 * </ul>
 *
 * @see taller1.Taller1Package#getEntidad()
 * @model
 * @generated
 */
public interface Entidad extends EObject {
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
	 * @see taller1.Taller1Package#getEntidad_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link taller1.Entidad#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Detalles</b></em>' containment reference list.
	 * The list contents are of type {@link taller1.Atributo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Detalles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Detalles</em>' containment reference list.
	 * @see taller1.Taller1Package#getEntidad_Detalles()
	 * @model containment="true"
	 * @generated
	 */
	EList<Atributo> getDetalles();

	/**
	 * Returns the value of the '<em><b>Relacion</b></em>' containment reference list.
	 * The list contents are of type {@link taller1.Relacion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relacion</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relacion</em>' containment reference list.
	 * @see taller1.Taller1Package#getEntidad_Relacion()
	 * @model containment="true"
	 * @generated
	 */
	EList<Relacion> getRelacion();

} // Entidad
