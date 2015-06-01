/**
 */
package emn.a1.elascript;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Script</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link emn.a1.elascript.Script#getScriptStatements <em>Script Statements</em>}</li>
 * </ul>
 *
 * @see emn.a1.elascript.ElascriptPackage#getScript()
 * @model
 * @generated
 */
public interface Script extends EObject
{
  /**
   * Returns the value of the '<em><b>Script Statements</b></em>' containment reference list.
   * The list contents are of type {@link emn.a1.elascript.Statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Script Statements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Script Statements</em>' containment reference list.
   * @see emn.a1.elascript.ElascriptPackage#getScript_ScriptStatements()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getScriptStatements();

} // Script
