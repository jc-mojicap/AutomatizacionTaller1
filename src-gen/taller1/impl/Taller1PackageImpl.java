/**
 */
package taller1.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import taller1.Atributo;
import taller1.Entidad;
import taller1.NoorApp;
import taller1.Relacion;
import taller1.Taller1Factory;
import taller1.Taller1Package;
import taller1.TipoAtributo;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Taller1PackageImpl extends EPackageImpl implements Taller1Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass noorAppEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entidadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atributoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relacionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tipoAtributoEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see taller1.Taller1Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Taller1PackageImpl() {
		super(eNS_URI, Taller1Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link Taller1Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Taller1Package init() {
		if (isInited)
			return (Taller1Package) EPackage.Registry.INSTANCE.getEPackage(Taller1Package.eNS_URI);

		// Obtain or create and register package
		Taller1PackageImpl theTaller1Package = (Taller1PackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof Taller1PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new Taller1PackageImpl());

		isInited = true;

		// Create package meta-data objects
		theTaller1Package.createPackageContents();

		// Initialize created meta-data
		theTaller1Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTaller1Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Taller1Package.eNS_URI, theTaller1Package);
		return theTaller1Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNoorApp() {
		return noorAppEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNoorApp_Entidades() {
		return (EReference) noorAppEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNoorApp_NameApp() {
		return (EAttribute) noorAppEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNoorApp_TextColor() {
		return (EAttribute) noorAppEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNoorApp_ButtonColor() {
		return (EAttribute) noorAppEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNoorApp_BarColor() {
		return (EAttribute) noorAppEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntidad() {
		return entidadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntidad_Name() {
		return (EAttribute) entidadEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntidad_Detalles() {
		return (EReference) entidadEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntidad_Relacion() {
		return (EReference) entidadEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtributo() {
		return atributoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAtributo_Name() {
		return (EAttribute) atributoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAtributo_Type() {
		return (EAttribute) atributoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAtributo_IsPrimary() {
		return (EAttribute) atributoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAtributo_IsTitle() {
		return (EAttribute) atributoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAtributo_IsRequired() {
		return (EAttribute) atributoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAtributo_IsVisibleInList() {
		return (EAttribute) atributoEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelacion() {
		return relacionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelacion_Entidad() {
		return (EReference) relacionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelacion_IsWeak() {
		return (EAttribute) relacionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelacion_Name() {
		return (EAttribute) relacionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTipoAtributo() {
		return tipoAtributoEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Taller1Factory getTaller1Factory() {
		return (Taller1Factory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		noorAppEClass = createEClass(NOOR_APP);
		createEReference(noorAppEClass, NOOR_APP__ENTIDADES);
		createEAttribute(noorAppEClass, NOOR_APP__NAME_APP);
		createEAttribute(noorAppEClass, NOOR_APP__TEXT_COLOR);
		createEAttribute(noorAppEClass, NOOR_APP__BUTTON_COLOR);
		createEAttribute(noorAppEClass, NOOR_APP__BAR_COLOR);

		entidadEClass = createEClass(ENTIDAD);
		createEAttribute(entidadEClass, ENTIDAD__NAME);
		createEReference(entidadEClass, ENTIDAD__DETALLES);
		createEReference(entidadEClass, ENTIDAD__RELACION);

		atributoEClass = createEClass(ATRIBUTO);
		createEAttribute(atributoEClass, ATRIBUTO__NAME);
		createEAttribute(atributoEClass, ATRIBUTO__TYPE);
		createEAttribute(atributoEClass, ATRIBUTO__IS_PRIMARY);
		createEAttribute(atributoEClass, ATRIBUTO__IS_TITLE);
		createEAttribute(atributoEClass, ATRIBUTO__IS_REQUIRED);
		createEAttribute(atributoEClass, ATRIBUTO__IS_VISIBLE_IN_LIST);

		relacionEClass = createEClass(RELACION);
		createEReference(relacionEClass, RELACION__ENTIDAD);
		createEAttribute(relacionEClass, RELACION__IS_WEAK);
		createEAttribute(relacionEClass, RELACION__NAME);

		// Create enums
		tipoAtributoEEnum = createEEnum(TIPO_ATRIBUTO);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(noorAppEClass, NoorApp.class, "NoorApp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNoorApp_Entidades(), this.getEntidad(), null, "entidades", null, 0, -1, NoorApp.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNoorApp_NameApp(), ecorePackage.getEString(), "nameApp", null, 0, 1, NoorApp.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNoorApp_TextColor(), ecorePackage.getEString(), "textColor", null, 0, 1, NoorApp.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNoorApp_ButtonColor(), ecorePackage.getEString(), "buttonColor", null, 0, 1, NoorApp.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNoorApp_BarColor(), ecorePackage.getEString(), "barColor", null, 0, 1, NoorApp.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entidadEClass, Entidad.class, "Entidad", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntidad_Name(), ecorePackage.getEString(), "name", null, 0, 1, Entidad.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntidad_Detalles(), this.getAtributo(), null, "detalles", null, 0, -1, Entidad.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntidad_Relacion(), this.getRelacion(), null, "relacion", null, 0, -1, Entidad.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(atributoEClass, Atributo.class, "Atributo", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAtributo_Name(), ecorePackage.getEString(), "name", null, 0, 1, Atributo.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAtributo_Type(), this.getTipoAtributo(), "type", "EString", 0, 1, Atributo.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEAttribute(getAtributo_IsPrimary(), ecorePackage.getEBoolean(), "isPrimary", null, 0, 1, Atributo.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAtributo_IsTitle(), ecorePackage.getEBoolean(), "isTitle", null, 0, 1, Atributo.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAtributo_IsRequired(), ecorePackage.getEBoolean(), "isRequired", null, 0, 1, Atributo.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAtributo_IsVisibleInList(), ecorePackage.getEBoolean(), "isVisibleInList", null, 0, 1,
				Atributo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(relacionEClass, Relacion.class, "Relacion", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelacion_Entidad(), this.getEntidad(), null, "entidad", null, 0, 1, Relacion.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelacion_IsWeak(), ecorePackage.getEBoolean(), "isWeak", "false", 0, 1, Relacion.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getRelacion_Name(), ecorePackage.getEString(), "name", null, 0, 1, Relacion.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(tipoAtributoEEnum, TipoAtributo.class, "TipoAtributo");
		addEEnumLiteral(tipoAtributoEEnum, TipoAtributo.ESTRING);
		addEEnumLiteral(tipoAtributoEEnum, TipoAtributo.EBOOLEAN);
		addEEnumLiteral(tipoAtributoEEnum, TipoAtributo.EINTEGER);
		addEEnumLiteral(tipoAtributoEEnum, TipoAtributo.EDATE);

		// Create resource
		createResource(eNS_URI);
	}

} //Taller1PackageImpl
