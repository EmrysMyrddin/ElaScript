/**
 */
package emn.a1.elascript.elascript.impl;

import emn.a1.elascript.elascript.BeginParallel;
import emn.a1.elascript.elascript.ElascriptPackage;
import emn.a1.elascript.elascript.EndParallel;
import emn.a1.elascript.elascript.Parallel;
import emn.a1.elascript.elascript.StatementList;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parallel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link emn.a1.elascript.elascript.impl.ParallelImpl#getBeginParallel <em>Begin Parallel</em>}</li>
 *   <li>{@link emn.a1.elascript.elascript.impl.ParallelImpl#getStatementLists <em>Statement Lists</em>}</li>
 *   <li>{@link emn.a1.elascript.elascript.impl.ParallelImpl#getEndParallel <em>End Parallel</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParallelImpl extends StatementImpl implements Parallel
{
  /**
   * The cached value of the '{@link #getBeginParallel() <em>Begin Parallel</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBeginParallel()
   * @generated
   * @ordered
   */
  protected BeginParallel beginParallel;

  /**
   * The cached value of the '{@link #getStatementLists() <em>Statement Lists</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatementLists()
   * @generated
   * @ordered
   */
  protected EList<StatementList> statementLists;

  /**
   * The cached value of the '{@link #getEndParallel() <em>End Parallel</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEndParallel()
   * @generated
   * @ordered
   */
  protected EndParallel endParallel;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ParallelImpl()
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
    return ElascriptPackage.Literals.PARALLEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BeginParallel getBeginParallel()
  {
    return beginParallel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBeginParallel(BeginParallel newBeginParallel, NotificationChain msgs)
  {
    BeginParallel oldBeginParallel = beginParallel;
    beginParallel = newBeginParallel;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElascriptPackage.PARALLEL__BEGIN_PARALLEL, oldBeginParallel, newBeginParallel);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBeginParallel(BeginParallel newBeginParallel)
  {
    if (newBeginParallel != beginParallel)
    {
      NotificationChain msgs = null;
      if (beginParallel != null)
        msgs = ((InternalEObject)beginParallel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElascriptPackage.PARALLEL__BEGIN_PARALLEL, null, msgs);
      if (newBeginParallel != null)
        msgs = ((InternalEObject)newBeginParallel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElascriptPackage.PARALLEL__BEGIN_PARALLEL, null, msgs);
      msgs = basicSetBeginParallel(newBeginParallel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ElascriptPackage.PARALLEL__BEGIN_PARALLEL, newBeginParallel, newBeginParallel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<StatementList> getStatementLists()
  {
    if (statementLists == null)
    {
      statementLists = new EObjectContainmentEList<StatementList>(StatementList.class, this, ElascriptPackage.PARALLEL__STATEMENT_LISTS);
    }
    return statementLists;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EndParallel getEndParallel()
  {
    return endParallel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEndParallel(EndParallel newEndParallel, NotificationChain msgs)
  {
    EndParallel oldEndParallel = endParallel;
    endParallel = newEndParallel;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElascriptPackage.PARALLEL__END_PARALLEL, oldEndParallel, newEndParallel);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEndParallel(EndParallel newEndParallel)
  {
    if (newEndParallel != endParallel)
    {
      NotificationChain msgs = null;
      if (endParallel != null)
        msgs = ((InternalEObject)endParallel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElascriptPackage.PARALLEL__END_PARALLEL, null, msgs);
      if (newEndParallel != null)
        msgs = ((InternalEObject)newEndParallel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElascriptPackage.PARALLEL__END_PARALLEL, null, msgs);
      msgs = basicSetEndParallel(newEndParallel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ElascriptPackage.PARALLEL__END_PARALLEL, newEndParallel, newEndParallel));
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
      case ElascriptPackage.PARALLEL__BEGIN_PARALLEL:
        return basicSetBeginParallel(null, msgs);
      case ElascriptPackage.PARALLEL__STATEMENT_LISTS:
        return ((InternalEList<?>)getStatementLists()).basicRemove(otherEnd, msgs);
      case ElascriptPackage.PARALLEL__END_PARALLEL:
        return basicSetEndParallel(null, msgs);
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
      case ElascriptPackage.PARALLEL__BEGIN_PARALLEL:
        return getBeginParallel();
      case ElascriptPackage.PARALLEL__STATEMENT_LISTS:
        return getStatementLists();
      case ElascriptPackage.PARALLEL__END_PARALLEL:
        return getEndParallel();
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
      case ElascriptPackage.PARALLEL__BEGIN_PARALLEL:
        setBeginParallel((BeginParallel)newValue);
        return;
      case ElascriptPackage.PARALLEL__STATEMENT_LISTS:
        getStatementLists().clear();
        getStatementLists().addAll((Collection<? extends StatementList>)newValue);
        return;
      case ElascriptPackage.PARALLEL__END_PARALLEL:
        setEndParallel((EndParallel)newValue);
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
      case ElascriptPackage.PARALLEL__BEGIN_PARALLEL:
        setBeginParallel((BeginParallel)null);
        return;
      case ElascriptPackage.PARALLEL__STATEMENT_LISTS:
        getStatementLists().clear();
        return;
      case ElascriptPackage.PARALLEL__END_PARALLEL:
        setEndParallel((EndParallel)null);
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
      case ElascriptPackage.PARALLEL__BEGIN_PARALLEL:
        return beginParallel != null;
      case ElascriptPackage.PARALLEL__STATEMENT_LISTS:
        return statementLists != null && !statementLists.isEmpty();
      case ElascriptPackage.PARALLEL__END_PARALLEL:
        return endParallel != null;
    }
    return super.eIsSet(featureID);
  }

} //ParallelImpl
