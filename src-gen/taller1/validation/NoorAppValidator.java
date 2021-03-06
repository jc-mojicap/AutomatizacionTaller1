/**
 *
 * $Id$
 */
package taller1.validation;

import org.eclipse.emf.common.util.EList;

import taller1.Entidad;

/**
 * A sample validator interface for {@link taller1.NoorApp}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface NoorAppValidator {
	boolean validate();

	boolean validateEntidades(EList<Entidad> value);

	boolean validateNameApp(String value);

	boolean validateTextColor(String value);

	boolean validateButtonColor(String value);

	boolean validateBarColor(String value);

	boolean validateNombreApp(String value);

	boolean validateColorTexto(String value);

	boolean validateColorBoton(String value);

	boolean validateColorBarra(String value);
}
