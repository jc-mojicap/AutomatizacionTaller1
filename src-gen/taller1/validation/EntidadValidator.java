/**
 *
 * $Id$
 */
package taller1.validation;

import org.eclipse.emf.common.util.EList;

import taller1.Atributo;
import taller1.Relacion;

/**
 * A sample validator interface for {@link taller1.Entidad}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface EntidadValidator {
	boolean validate();

	boolean validateName(String value);

	boolean validateNombre(String value);

	boolean validateDetalles(EList<Atributo> value);

	boolean validateRelacion(EList<Relacion> value);
}