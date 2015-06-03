/**
 */
package emn.a1.elascript.elascript;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link emn.a1.elascript.elascript.Command#getName <em>Name</em>}</li>
 *   <li>{@link emn.a1.elascript.elascript.Command#getParams <em>Params</em>}</li>
 * </ul>
 * </p>
 *
 * @see emn.a1.elascript.elascript.ElascriptPackage#getCommand()
 * @model
 * @generated
 */
public interface Command extends Statement
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
   * @see emn.a1.elascript.elascript.ElascriptPackage#getCommand_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link emn.a1.elascript.elascript.Command#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference list.
   * The list contents are of type {@link emn.a1.elascript.elascript.Param}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see emn.a1.elascript.elascript.ElascriptPackage#getCommand_Params()
   * @model containment="true"
   * @generated
   */
  EList<Param> getParams();

} // Command
