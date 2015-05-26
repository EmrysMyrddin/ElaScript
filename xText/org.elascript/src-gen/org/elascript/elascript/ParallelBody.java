/**
 */
package org.elascript.elascript;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parallel Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.elascript.elascript.ParallelBody#getName <em>Name</em>}</li>
 *   <li>{@link org.elascript.elascript.ParallelBody#getActions <em>Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.elascript.elascript.ElascriptPackage#getParallelBody()
 * @model
 * @generated
 */
public interface ParallelBody extends Parallel
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.elascript.elascript.ElascriptPackage#getParallelBody_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.elascript.elascript.ParallelBody#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
   * The list contents are of type {@link org.elascript.elascript.ActionList}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actions</em>' containment reference list.
   * @see org.elascript.elascript.ElascriptPackage#getParallelBody_Actions()
   * @model containment="true"
   * @generated
   */
  EList<ActionList> getActions();

} // ParallelBody
