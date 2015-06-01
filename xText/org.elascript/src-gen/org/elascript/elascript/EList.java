/**
 */
package org.elascript.elascript;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EList</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.elascript.elascript.EList#getStatements <em>Statements</em>}</li>
 * </ul>
 *
 * @see org.elascript.elascript.ElascriptPackage#getEList()
 * @model
 * @generated
 */
public interface EList extends EObject
{
  /**
   * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
   * The list contents are of type {@link org.elascript.elascript.Statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statements</em>' containment reference list.
   * @see org.elascript.elascript.ElascriptPackage#getEList_Statements()
   * @model containment="true"
   * @generated
   */
  org.eclipse.emf.common.util.EList<Statement> getStatements();

} // EList
