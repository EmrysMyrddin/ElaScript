/**
 */
package org.elascript.elascript.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.elascript.elascript.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ElascriptFactoryImpl extends EFactoryImpl implements ElascriptFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ElascriptFactory init()
  {
    try
    {
      ElascriptFactory theElascriptFactory = (ElascriptFactory)EPackage.Registry.INSTANCE.getEFactory(ElascriptPackage.eNS_URI);
      if (theElascriptFactory != null)
      {
        return theElascriptFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ElascriptFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElascriptFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case ElascriptPackage.SCRIPT: return createScript();
      case ElascriptPackage.ACTION: return createAction();
      case ElascriptPackage.PARALLEL: return createParallel();
      case ElascriptPackage.PARALLEL_BODY: return createParallelBody();
      case ElascriptPackage.ACTION_LIST: return createActionList();
      case ElascriptPackage.COMMAND: return createCommand();
      case ElascriptPackage.PARAM_LIST: return createParamList();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Script createScript()
  {
    ScriptImpl script = new ScriptImpl();
    return script;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Action createAction()
  {
    ActionImpl action = new ActionImpl();
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parallel createParallel()
  {
    ParallelImpl parallel = new ParallelImpl();
    return parallel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParallelBody createParallelBody()
  {
    ParallelBodyImpl parallelBody = new ParallelBodyImpl();
    return parallelBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionList createActionList()
  {
    ActionListImpl actionList = new ActionListImpl();
    return actionList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Command createCommand()
  {
    CommandImpl command = new CommandImpl();
    return command;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParamList createParamList()
  {
    ParamListImpl paramList = new ParamListImpl();
    return paramList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElascriptPackage getElascriptPackage()
  {
    return (ElascriptPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ElascriptPackage getPackage()
  {
    return ElascriptPackage.eINSTANCE;
  }

} //ElascriptFactoryImpl
