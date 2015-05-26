/**
 */
package org.elascript.elascript;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Param List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.elascript.elascript.ParamList#getParams <em>Params</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.elascript.elascript.ElascriptPackage#getParamList()
 * @model
 * @generated
 */
public interface ParamList extends EObject
{
  /**
   * Returns the value of the '<em><b>Params</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' attribute list.
   * @see org.elascript.elascript.ElascriptPackage#getParamList_Params()
   * @model unique="false"
   * @generated
   */
  EList<String> getParams();

} // ParamList
