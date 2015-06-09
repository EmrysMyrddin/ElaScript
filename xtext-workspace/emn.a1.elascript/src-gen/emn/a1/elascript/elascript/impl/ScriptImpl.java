/**
 */
package emn.a1.elascript.elascript.impl;

import emn.a1.elascript.elascript.BeginScript;
import emn.a1.elascript.elascript.ElascriptPackage;
import emn.a1.elascript.elascript.EndScript;
import emn.a1.elascript.elascript.Script;
import emn.a1.elascript.elascript.StatementList;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Script</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link emn.a1.elascript.elascript.impl.ScriptImpl#getBeginScript <em>Begin Script</em>}</li>
 *   <li>{@link emn.a1.elascript.elascript.impl.ScriptImpl#getScriptStatement <em>Script Statement</em>}</li>
 *   <li>{@link emn.a1.elascript.elascript.impl.ScriptImpl#getEndScript <em>End Script</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScriptImpl extends MinimalEObjectImpl.Container implements Script
{
  /**
   * The cached value of the '{@link #getBeginScript() <em>Begin Script</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBeginScript()
   * @generated
   * @ordered
   */
  protected BeginScript beginScript;

  /**
   * The cached value of the '{@link #getScriptStatement() <em>Script Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScriptStatement()
   * @generated
   * @ordered
   */
  protected StatementList scriptStatement;

  /**
   * The cached value of the '{@link #getEndScript() <em>End Script</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEndScript()
   * @generated
   * @ordered
   */
  protected EndScript endScript;

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
  public BeginScript getBeginScript()
  {
    return beginScript;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBeginScript(BeginScript newBeginScript, NotificationChain msgs)
  {
    BeginScript oldBeginScript = beginScript;
    beginScript = newBeginScript;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElascriptPackage.SCRIPT__BEGIN_SCRIPT, oldBeginScript, newBeginScript);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBeginScript(BeginScript newBeginScript)
  {
    if (newBeginScript != beginScript)
    {
      NotificationChain msgs = null;
      if (beginScript != null)
        msgs = ((InternalEObject)beginScript).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElascriptPackage.SCRIPT__BEGIN_SCRIPT, null, msgs);
      if (newBeginScript != null)
        msgs = ((InternalEObject)newBeginScript).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElascriptPackage.SCRIPT__BEGIN_SCRIPT, null, msgs);
      msgs = basicSetBeginScript(newBeginScript, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ElascriptPackage.SCRIPT__BEGIN_SCRIPT, newBeginScript, newBeginScript));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StatementList getScriptStatement()
  {
    return scriptStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetScriptStatement(StatementList newScriptStatement, NotificationChain msgs)
  {
    StatementList oldScriptStatement = scriptStatement;
    scriptStatement = newScriptStatement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElascriptPackage.SCRIPT__SCRIPT_STATEMENT, oldScriptStatement, newScriptStatement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setScriptStatement(StatementList newScriptStatement)
  {
    if (newScriptStatement != scriptStatement)
    {
      NotificationChain msgs = null;
      if (scriptStatement != null)
        msgs = ((InternalEObject)scriptStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElascriptPackage.SCRIPT__SCRIPT_STATEMENT, null, msgs);
      if (newScriptStatement != null)
        msgs = ((InternalEObject)newScriptStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElascriptPackage.SCRIPT__SCRIPT_STATEMENT, null, msgs);
      msgs = basicSetScriptStatement(newScriptStatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ElascriptPackage.SCRIPT__SCRIPT_STATEMENT, newScriptStatement, newScriptStatement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EndScript getEndScript()
  {
    return endScript;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEndScript(EndScript newEndScript, NotificationChain msgs)
  {
    EndScript oldEndScript = endScript;
    endScript = newEndScript;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElascriptPackage.SCRIPT__END_SCRIPT, oldEndScript, newEndScript);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEndScript(EndScript newEndScript)
  {
    if (newEndScript != endScript)
    {
      NotificationChain msgs = null;
      if (endScript != null)
        msgs = ((InternalEObject)endScript).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElascriptPackage.SCRIPT__END_SCRIPT, null, msgs);
      if (newEndScript != null)
        msgs = ((InternalEObject)newEndScript).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElascriptPackage.SCRIPT__END_SCRIPT, null, msgs);
      msgs = basicSetEndScript(newEndScript, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ElascriptPackage.SCRIPT__END_SCRIPT, newEndScript, newEndScript));
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
      case ElascriptPackage.SCRIPT__BEGIN_SCRIPT:
        return basicSetBeginScript(null, msgs);
      case ElascriptPackage.SCRIPT__SCRIPT_STATEMENT:
        return basicSetScriptStatement(null, msgs);
      case ElascriptPackage.SCRIPT__END_SCRIPT:
        return basicSetEndScript(null, msgs);
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
      case ElascriptPackage.SCRIPT__BEGIN_SCRIPT:
        return getBeginScript();
      case ElascriptPackage.SCRIPT__SCRIPT_STATEMENT:
        return getScriptStatement();
      case ElascriptPackage.SCRIPT__END_SCRIPT:
        return getEndScript();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ElascriptPackage.SCRIPT__BEGIN_SCRIPT:
        setBeginScript((BeginScript)newValue);
        return;
      case ElascriptPackage.SCRIPT__SCRIPT_STATEMENT:
        setScriptStatement((StatementList)newValue);
        return;
      case ElascriptPackage.SCRIPT__END_SCRIPT:
        setEndScript((EndScript)newValue);
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
      case ElascriptPackage.SCRIPT__BEGIN_SCRIPT:
        setBeginScript((BeginScript)null);
        return;
      case ElascriptPackage.SCRIPT__SCRIPT_STATEMENT:
        setScriptStatement((StatementList)null);
        return;
      case ElascriptPackage.SCRIPT__END_SCRIPT:
        setEndScript((EndScript)null);
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
      case ElascriptPackage.SCRIPT__BEGIN_SCRIPT:
        return beginScript != null;
      case ElascriptPackage.SCRIPT__SCRIPT_STATEMENT:
        return scriptStatement != null;
      case ElascriptPackage.SCRIPT__END_SCRIPT:
        return endScript != null;
    }
    return super.eIsSet(featureID);
  }

} //ScriptImpl
