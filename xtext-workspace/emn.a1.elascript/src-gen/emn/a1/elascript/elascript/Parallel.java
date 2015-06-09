/**
 */
package emn.a1.elascript.elascript;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parallel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link emn.a1.elascript.elascript.Parallel#getBeginParallel <em>Begin Parallel</em>}</li>
 *   <li>{@link emn.a1.elascript.elascript.Parallel#getStatementLists <em>Statement Lists</em>}</li>
 *   <li>{@link emn.a1.elascript.elascript.Parallel#getEndParallel <em>End Parallel</em>}</li>
 * </ul>
 * </p>
 *
 * @see emn.a1.elascript.elascript.ElascriptPackage#getParallel()
 * @model
 * @generated
 */
public interface Parallel extends Statement
{
  /**
   * Returns the value of the '<em><b>Begin Parallel</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Begin Parallel</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Begin Parallel</em>' containment reference.
   * @see #setBeginParallel(BeginParallel)
   * @see emn.a1.elascript.elascript.ElascriptPackage#getParallel_BeginParallel()
   * @model containment="true"
   * @generated
   */
  BeginParallel getBeginParallel();

  /**
   * Sets the value of the '{@link emn.a1.elascript.elascript.Parallel#getBeginParallel <em>Begin Parallel</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Begin Parallel</em>' containment reference.
   * @see #getBeginParallel()
   * @generated
   */
  void setBeginParallel(BeginParallel value);

  /**
   * Returns the value of the '<em><b>Statement Lists</b></em>' containment reference list.
   * The list contents are of type {@link emn.a1.elascript.elascript.StatementList}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statement Lists</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statement Lists</em>' containment reference list.
   * @see emn.a1.elascript.elascript.ElascriptPackage#getParallel_StatementLists()
   * @model containment="true"
   * @generated
   */
  EList<StatementList> getStatementLists();

  /**
   * Returns the value of the '<em><b>End Parallel</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>End Parallel</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>End Parallel</em>' containment reference.
   * @see #setEndParallel(EndParallel)
   * @see emn.a1.elascript.elascript.ElascriptPackage#getParallel_EndParallel()
   * @model containment="true"
   * @generated
   */
  EndParallel getEndParallel();

  /**
   * Sets the value of the '{@link emn.a1.elascript.elascript.Parallel#getEndParallel <em>End Parallel</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End Parallel</em>' containment reference.
   * @see #getEndParallel()
   * @generated
   */
  void setEndParallel(EndParallel value);

} // Parallel
