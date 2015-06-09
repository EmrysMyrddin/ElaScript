/**
 */
package emn.a1.elascript.elascript;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link emn.a1.elascript.elascript.StatementList#getStatements <em>Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @see emn.a1.elascript.elascript.ElascriptPackage#getStatementList()
 * @model
 * @generated
 */
public interface StatementList extends EObject
{
  /**
   * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
   * The list contents are of type {@link emn.a1.elascript.elascript.Statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statements</em>' containment reference list.
   * @see emn.a1.elascript.elascript.ElascriptPackage#getStatementList_Statements()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getStatements();

} // StatementList