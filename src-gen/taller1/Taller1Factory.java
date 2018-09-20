/**
 */
package taller1;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see taller1.Taller1Package
 * @generated
 */
public interface Taller1Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Taller1Factory eINSTANCE = taller1.impl.Taller1FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Noor App</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Noor App</em>'.
	 * @generated
	 */
	NoorApp createNoorApp();

	/**
	 * Returns a new object of class '<em>Entidad</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entidad</em>'.
	 * @generated
	 */
	Entidad createEntidad();

	/**
	 * Returns a new object of class '<em>Atributo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Atributo</em>'.
	 * @generated
	 */
	Atributo createAtributo();

	/**
	 * Returns a new object of class '<em>Relacion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relacion</em>'.
	 * @generated
	 */
	Relacion createRelacion();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Taller1Package getTaller1Package();

} //Taller1Factory
