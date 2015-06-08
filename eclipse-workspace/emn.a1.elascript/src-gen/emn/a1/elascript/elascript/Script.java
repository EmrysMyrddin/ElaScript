/**
 */
package emn.a1.elascript.elascript;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Script</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link emn.a1.elascript.elascript.Script#getBeginScript <em>Begin Script</em>}</li>
 *   <li>{@link emn.a1.elascript.elascript.Script#getScriptStatement <em>Script Statement</em>}</li>
 *   <li>{@link emn.a1.elascript.elascript.Script#getEndScript <em>End Script</em>}</li>
 * </ul>
 * </p>
 *
 * @see emn.a1.elascript.elascript.ElascriptPackage#getScript()
 * @model
 * @generated
 */
public interface Script extends EObject
{
  /**
   * Returns the value of the '<em><b>Begin Script</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Begin Script</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Begin Script</em>' containment reference.
   * @see #setBeginScript(BeginScript)
   * @see emn.a1.elascript.elascript.ElascriptPackage#getScript_BeginScript()
   * @model containment="true"
   * @generated
   */
  BeginScript getBeginScript();

  /**
   * Sets the value of the '{@link emn.a1.elascript.elascript.Script#getBeginScript <em>Begin Script</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Begin Script</em>' containment reference.
   * @see #getBeginScript()
   * @generated
   */
  void setBeginScript(BeginScript value);

  /**
   * Returns the value of the '<em><b>Script Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Script Statement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Script Statement</em>' containment reference.
   * @see #setScriptStatement(StatementList)
   * @see emn.a1.elascript.elascript.ElascriptPackage#getScript_ScriptStatement()
   * @model containment="true"
   * @generated
   */
  StatementList getScriptStatement();

  /**
   * Sets the value of the '{@link emn.a1.elascript.elascript.Script#getScriptStatement <em>Script Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Script Statement</em>' containment reference.
   * @see #getScriptStatement()
   * @generated
   */
  void setScriptStatement(StatementList value);

  /**
   * Returns the value of the '<em><b>End Script</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>End Script</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>End Script</em>' containment reference.
   * @see #setEndScript(EndScript)
   * @see emn.a1.elascript.elascript.ElascriptPackage#getScript_EndScript()
   * @model containment="true"
   * @generated
   */
  EndScript getEndScript();

  /**
   * Sets the value of the '{@link emn.a1.elascript.elascript.Script#getEndScript <em>End Script</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End Script</em>' containment reference.
   * @see #getEndScript()
   * @generated
   */
  void setEndScript(EndScript value);

} // Script
