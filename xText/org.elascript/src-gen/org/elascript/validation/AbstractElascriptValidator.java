/*
 * generated by Xtext
 */
package org.elascript.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractElascriptValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(org.elascript.elascript.ElascriptPackage.eINSTANCE);
		return result;
	}
}