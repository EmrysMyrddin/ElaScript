/**
 */
package org.elascript.elascript;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Script</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.elascript.elascript.Script#getActions <em>Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.elascript.elascript.ElascriptPackage#getScript()
 * @model
 * @generated
 */
public interface Script extends EObject
{
  /**
   * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
   * The list contents are of type {@link org.elascript.elascript.Action}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actions</em>' containment reference list.
   * @see org.elascript.elascript.ElascriptPackage#getScript_Actions()
   * @model containment="true"
   * @generated
   */
  EList<Action> getActions();

} // Script
