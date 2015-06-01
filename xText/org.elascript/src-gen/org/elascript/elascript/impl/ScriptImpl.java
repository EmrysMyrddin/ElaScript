/**
 */
package org.elascript.elascript.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.elascript.elascript.ElascriptPackage;
import org.elascript.elascript.Script;
import org.elascript.elascript.Statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Script</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.elascript.elascript.impl.ScriptImpl#getScriptStatements <em>Script Statements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScriptImpl extends MinimalEObjectImpl.Container implements Script
{
  /**
   * The cached value of the '{@link #getScriptStatements() <em>Script Statements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScriptStatements()
   * @generated
   * @ordered
   */
  protected EList<Statement> scriptStatements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ScriptImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ElascriptPackage.Literals.SCRIPT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Statement> getScriptStatements()
  {
    if (scriptStatements == null)
    {
      scriptStatements = new EObjectContainmentEList<Statement>(Statement.class, this, ElascriptPackage.SCRIPT__SCRIPT_STATEMENTS);
    }
    return scriptStatements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ElascriptPackage.SCRIPT__SCRIPT_STATEMENTS:
        return ((InternalEList<?>)getScriptStatements()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ElascriptPackage.SCRIPT__SCRIPT_STATEMENTS:
        return getScriptStatements();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ElascriptPackage.SCRIPT__SCRIPT_STATEMENTS:
        getScriptStatements().clear();
        getScriptStatements().addAll((Collection<? extends Statement>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ElascriptPackage.SCRIPT__SCRIPT_STATEMENTS:
        getScriptStatements().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ElascriptPackage.SCRIPT__SCRIPT_STATEMENTS:
        return scriptStatements != null && !scriptStatements.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ScriptImpl
