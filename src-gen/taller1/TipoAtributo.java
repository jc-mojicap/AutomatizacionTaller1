/**
 */
package taller1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Tipo Atributo</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see taller1.Taller1Package#getTipoAtributo()
 * @model
 * @generated
 */
public enum TipoAtributo implements Enumerator {
	/**
	 * The '<em><b>EString</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ESTRING_VALUE
	 * @generated
	 * @ordered
	 */
	ESTRING(0, "EString", "EString"),

	/**
	 * The '<em><b>EBoolean</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EBOOLEAN_VALUE
	 * @generated
	 * @ordered
	 */
	EBOOLEAN(1, "EBoolean", "EBoolean"),

	/**
	 * The '<em><b>EInteger</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EINTEGER_VALUE
	 * @generated
	 * @ordered
	 */
	EINTEGER(2, "EInteger", "EInteger"),

	/**
	 * The '<em><b>EDate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDATE_VALUE
	 * @generated
	 * @ordered
	 */
	EDATE(3, "EDate", "EDate");

	/**
	 * The '<em><b>EString</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EString</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ESTRING
	 * @model name="EString"
	 * @generated
	 * @ordered
	 */
	public static final int ESTRING_VALUE = 0;

	/**
	 * The '<em><b>EBoolean</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EBoolean</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EBOOLEAN
	 * @model name="EBoolean"
	 * @generated
	 * @ordered
	 */
	public static final int EBOOLEAN_VALUE = 1;

	/**
	 * The '<em><b>EInteger</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EInteger</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EINTEGER
	 * @model name="EInteger"
	 * @generated
	 * @ordered
	 */
	public static final int EINTEGER_VALUE = 2;

	/**
	 * The '<em><b>EDate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EDate</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EDATE
	 * @model name="EDate"
	 * @generated
	 * @ordered
	 */
	public static final int EDATE_VALUE = 3;

	/**
	 * An array of all the '<em><b>Tipo Atributo</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TipoAtributo[] VALUES_ARRAY = new TipoAtributo[] { ESTRING, EBOOLEAN, EINTEGER, EDATE, };

	/**
	 * A public read-only list of all the '<em><b>Tipo Atributo</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TipoAtributo> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Tipo Atributo</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TipoAtributo get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TipoAtributo result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tipo Atributo</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TipoAtributo getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TipoAtributo result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tipo Atributo</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TipoAtributo get(int value) {
		switch (value) {
		case ESTRING_VALUE:
			return ESTRING;
		case EBOOLEAN_VALUE:
			return EBOOLEAN;
		case EINTEGER_VALUE:
			return EINTEGER;
		case EDATE_VALUE:
			return EDATE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TipoAtributo(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
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
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //TipoAtributo
