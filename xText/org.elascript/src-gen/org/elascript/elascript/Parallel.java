/**
 */
package org.elascript.elascript;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parallel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.elascript.elascript.Parallel#getStatements <em>Statements</em>}</li>
 * </ul>
 *
 * @see org.elascript.elascript.ElascriptPackage#getParallel()
 * @model
 * @generated
 */
public interface Parallel extends Statement
{
  /**
   * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
   * The list contents are of type {@link org.elascript.elascript.EList}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statements</em>' containment reference list.
   * @see org.elascript.elascript.ElascriptPackage#getParallel_Statements()
   * @model containment="true"
   * @generated
   */
  EList<org.elascript.elascript.EList> getStatements();

} // Parallel
