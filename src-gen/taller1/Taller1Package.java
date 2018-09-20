/**
 */
package taller1;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see taller1.Taller1Factory
 * @model kind="package"
 * @generated
 */
public interface Taller1Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "taller1";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/taller1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "taller1";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Taller1Package eINSTANCE = taller1.impl.Taller1PackageImpl.init();

	/**
	 * The meta object id for the '{@link taller1.impl.NoorAppImpl <em>Noor App</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see taller1.impl.NoorAppImpl
	 * @see taller1.impl.Taller1PackageImpl#getNoorApp()
	 * @generated
	 */
	int NOOR_APP = 0;

	/**
	 * The feature id for the '<em><b>Entidades</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOOR_APP__ENTIDADES = 0;

	/**
	 * The feature id for the '<em><b>Name App</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOOR_APP__NAME_APP = 1;

	/**
	 * The feature id for the '<em><b>Text Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOOR_APP__TEXT_COLOR = 2;

	/**
	 * The feature id for the '<em><b>Button Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOOR_APP__BUTTON_COLOR = 3;

	/**
	 * The feature id for the '<em><b>Bar Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOOR_APP__BAR_COLOR = 4;

	/**
	 * The number of structural features of the '<em>Noor App</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOOR_APP_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Noor App</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOOR_APP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link taller1.impl.EntidadImpl <em>Entidad</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see taller1.impl.EntidadImpl
	 * @see taller1.impl.Taller1PackageImpl#getEntidad()
	 * @generated
	 */
	int ENTIDAD = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Detalles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD__DETALLES = 1;

	/**
	 * The feature id for the '<em><b>Relacion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD__RELACION = 2;

	/**
	 * The number of structural features of the '<em>Entidad</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Entidad</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link taller1.impl.AtributoImpl <em>Atributo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see taller1.impl.AtributoImpl
	 * @see taller1.impl.Taller1PackageImpl#getAtributo()
	 * @generated
	 */
	int ATRIBUTO = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Is Primary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO__IS_PRIMARY = 2;

	/**
	 * The feature id for the '<em><b>Is Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO__IS_TITLE = 3;

	/**
	 * The feature id for the '<em><b>Is Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO__IS_REQUIRED = 4;

	/**
	 * The feature id for the '<em><b>Is Visible In List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO__IS_VISIBLE_IN_LIST = 5;

	/**
	 * The number of structural features of the '<em>Atributo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Atributo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link taller1.impl.RelacionImpl <em>Relacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see taller1.impl.RelacionImpl
	 * @see taller1.impl.Taller1PackageImpl#getRelacion()
	 * @generated
	 */
	int RELACION = 3;

	/**
	 * The feature id for the '<em><b>Entidad</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION__ENTIDAD = 0;

	/**
	 * The feature id for the '<em><b>Is Weak</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION__IS_WEAK = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION__NAME = 2;

	/**
	 * The number of structural features of the '<em>Relacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Relacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link taller1.TipoAtributo <em>Tipo Atributo</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see taller1.TipoAtributo
	 * @see taller1.impl.Taller1PackageImpl#getTipoAtributo()
	 * @generated
	 */
	int TIPO_ATRIBUTO = 4;

	/**
	 * Returns the meta object for class '{@link taller1.NoorApp <em>Noor App</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Noor App</em>'.
	 * @see taller1.NoorApp
	 * @generated
	 */
	EClass getNoorApp();

	/**
	 * Returns the meta object for the containment reference list '{@link taller1.NoorApp#getEntidades <em>Entidades</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entidades</em>'.
	 * @see taller1.NoorApp#getEntidades()
	 * @see #getNoorApp()
	 * @generated
	 */
	EReference getNoorApp_Entidades();

	/**
	 * Returns the meta object for the attribute '{@link taller1.NoorApp#getNameApp <em>Name App</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name App</em>'.
	 * @see taller1.NoorApp#getNameApp()
	 * @see #getNoorApp()
	 * @generated
	 */
	EAttribute getNoorApp_NameApp();

	/**
	 * Returns the meta object for the attribute '{@link taller1.NoorApp#getTextColor <em>Text Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Color</em>'.
	 * @see taller1.NoorApp#getTextColor()
	 * @see #getNoorApp()
	 * @generated
	 */
	EAttribute getNoorApp_TextColor();

	/**
	 * Returns the meta object for the attribute '{@link taller1.NoorApp#getButtonColor <em>Button Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Button Color</em>'.
	 * @see taller1.NoorApp#getButtonColor()
	 * @see #getNoorApp()
	 * @generated
	 */
	EAttribute getNoorApp_ButtonColor();

	/**
	 * Returns the meta object for the attribute '{@link taller1.NoorApp#getBarColor <em>Bar Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bar Color</em>'.
	 * @see taller1.NoorApp#getBarColor()
	 * @see #getNoorApp()
	 * @generated
	 */
	EAttribute getNoorApp_BarColor();

	/**
	 * Returns the meta object for class '{@link taller1.Entidad <em>Entidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entidad</em>'.
	 * @see taller1.Entidad
	 * @generated
	 */
	EClass getEntidad();

	/**
	 * Returns the meta object for the attribute '{@link taller1.Entidad#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see taller1.Entidad#getName()
	 * @see #getEntidad()
	 * @generated
	 */
	EAttribute getEntidad_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link taller1.Entidad#getDetalles <em>Detalles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Detalles</em>'.
	 * @see taller1.Entidad#getDetalles()
	 * @see #getEntidad()
	 * @generated
	 */
	EReference getEntidad_Detalles();

	/**
	 * Returns the meta object for the containment reference list '{@link taller1.Entidad#getRelacion <em>Relacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relacion</em>'.
	 * @see taller1.Entidad#getRelacion()
	 * @see #getEntidad()
	 * @generated
	 */
	EReference getEntidad_Relacion();

	/**
	 * Returns the meta object for class '{@link taller1.Atributo <em>Atributo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atributo</em>'.
	 * @see taller1.Atributo
	 * @generated
	 */
	EClass getAtributo();

	/**
	 * Returns the meta object for the attribute '{@link taller1.Atributo#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see taller1.Atributo#getName()
	 * @see #getAtributo()
	 * @generated
	 */
	EAttribute getAtributo_Name();

	/**
	 * Returns the meta object for the attribute '{@link taller1.Atributo#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see taller1.Atributo#getType()
	 * @see #getAtributo()
	 * @generated
	 */
	EAttribute getAtributo_Type();

	/**
	 * Returns the meta object for the attribute '{@link taller1.Atributo#isIsPrimary <em>Is Primary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Primary</em>'.
	 * @see taller1.Atributo#isIsPrimary()
	 * @see #getAtributo()
	 * @generated
	 */
	EAttribute getAtributo_IsPrimary();

	/**
	 * Returns the meta object for the attribute '{@link taller1.Atributo#isIsTitle <em>Is Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Title</em>'.
	 * @see taller1.Atributo#isIsTitle()
	 * @see #getAtributo()
	 * @generated
	 */
	EAttribute getAtributo_IsTitle();

	/**
	 * Returns the meta object for the attribute '{@link taller1.Atributo#isIsRequired <em>Is Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Required</em>'.
	 * @see taller1.Atributo#isIsRequired()
	 * @see #getAtributo()
	 * @generated
	 */
	EAttribute getAtributo_IsRequired();

	/**
	 * Returns the meta object for the attribute '{@link taller1.Atributo#isIsVisibleInList <em>Is Visible In List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Visible In List</em>'.
	 * @see taller1.Atributo#isIsVisibleInList()
	 * @see #getAtributo()
	 * @generated
	 */
	EAttribute getAtributo_IsVisibleInList();

	/**
	 * Returns the meta object for class '{@link taller1.Relacion <em>Relacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relacion</em>'.
	 * @see taller1.Relacion
	 * @generated
	 */
	EClass getRelacion();

	/**
	 * Returns the meta object for the reference '{@link taller1.Relacion#getEntidad <em>Entidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entidad</em>'.
	 * @see taller1.Relacion#getEntidad()
	 * @see #getRelacion()
	 * @generated
	 */
	EReference getRelacion_Entidad();

	/**
	 * Returns the meta object for the attribute '{@link taller1.Relacion#isIsWeak <em>Is Weak</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Weak</em>'.
	 * @see taller1.Relacion#isIsWeak()
	 * @see #getRelacion()
	 * @generated
	 */
	EAttribute getRelacion_IsWeak();

	/**
	 * Returns the meta object for the attribute '{@link taller1.Relacion#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see taller1.Relacion#getName()
	 * @see #getRelacion()
	 * @generated
	 */
	EAttribute getRelacion_Name();

	/**
	 * Returns the meta object for enum '{@link taller1.TipoAtributo <em>Tipo Atributo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tipo Atributo</em>'.
	 * @see taller1.TipoAtributo
	 * @generated
	 */
	EEnum getTipoAtributo();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Taller1Factory getTaller1Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link taller1.impl.NoorAppImpl <em>Noor App</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see taller1.impl.NoorAppImpl
		 * @see taller1.impl.Taller1PackageImpl#getNoorApp()
		 * @generated
		 */
		EClass NOOR_APP = eINSTANCE.getNoorApp();

		/**
		 * The meta object literal for the '<em><b>Entidades</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOOR_APP__ENTIDADES = eINSTANCE.getNoorApp_Entidades();

		/**
		 * The meta object literal for the '<em><b>Name App</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOOR_APP__NAME_APP = eINSTANCE.getNoorApp_NameApp();

		/**
		 * The meta object literal for the '<em><b>Text Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOOR_APP__TEXT_COLOR = eINSTANCE.getNoorApp_TextColor();

		/**
		 * The meta object literal for the '<em><b>Button Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOOR_APP__BUTTON_COLOR = eINSTANCE.getNoorApp_ButtonColor();

		/**
		 * The meta object literal for the '<em><b>Bar Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOOR_APP__BAR_COLOR = eINSTANCE.getNoorApp_BarColor();

		/**
		 * The meta object literal for the '{@link taller1.impl.EntidadImpl <em>Entidad</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see taller1.impl.EntidadImpl
		 * @see taller1.impl.Taller1PackageImpl#getEntidad()
		 * @generated
		 */
		EClass ENTIDAD = eINSTANCE.getEntidad();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTIDAD__NAME = eINSTANCE.getEntidad_Name();

		/**
		 * The meta object literal for the '<em><b>Detalles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTIDAD__DETALLES = eINSTANCE.getEntidad_Detalles();

		/**
		 * The meta object literal for the '<em><b>Relacion</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTIDAD__RELACION = eINSTANCE.getEntidad_Relacion();

		/**
		 * The meta object literal for the '{@link taller1.impl.AtributoImpl <em>Atributo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see taller1.impl.AtributoImpl
		 * @see taller1.impl.Taller1PackageImpl#getAtributo()
		 * @generated
		 */
		EClass ATRIBUTO = eINSTANCE.getAtributo();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATRIBUTO__NAME = eINSTANCE.getAtributo_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATRIBUTO__TYPE = eINSTANCE.getAtributo_Type();

		/**
		 * The meta object literal for the '<em><b>Is Primary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATRIBUTO__IS_PRIMARY = eINSTANCE.getAtributo_IsPrimary();

		/**
		 * The meta object literal for the '<em><b>Is Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATRIBUTO__IS_TITLE = eINSTANCE.getAtributo_IsTitle();

		/**
		 * The meta object literal for the '<em><b>Is Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATRIBUTO__IS_REQUIRED = eINSTANCE.getAtributo_IsRequired();

		/**
		 * The meta object literal for the '<em><b>Is Visible In List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATRIBUTO__IS_VISIBLE_IN_LIST = eINSTANCE.getAtributo_IsVisibleInList();

		/**
		 * The meta object literal for the '{@link taller1.impl.RelacionImpl <em>Relacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see taller1.impl.RelacionImpl
		 * @see taller1.impl.Taller1PackageImpl#getRelacion()
		 * @generated
		 */
		EClass RELACION = eINSTANCE.getRelacion();

		/**
		 * The meta object literal for the '<em><b>Entidad</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELACION__ENTIDAD = eINSTANCE.getRelacion_Entidad();

		/**
		 * The meta object literal for the '<em><b>Is Weak</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELACION__IS_WEAK = eINSTANCE.getRelacion_IsWeak();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELACION__NAME = eINSTANCE.getRelacion_Name();

		/**
		 * The meta object literal for the '{@link taller1.TipoAtributo <em>Tipo Atributo</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see taller1.TipoAtributo
		 * @see taller1.impl.Taller1PackageImpl#getTipoAtributo()
		 * @generated
		 */
		EEnum TIPO_ATRIBUTO = eINSTANCE.getTipoAtributo();

	}

} //Taller1Package
