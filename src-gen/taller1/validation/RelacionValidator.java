/**
 *
 * $Id$
 */
package taller1.validation;

import taller1.Entidad;

/**
 * A sample validator interface for {@link taller1.Relacion}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface RelacionValidator {
	boolean validate();

	boolean validateEntidad(Entidad value);

	boolean validateIsWeak(boolean value);

	boolean validateName(String value);

	boolean validateEsDebil(boolean value);
}