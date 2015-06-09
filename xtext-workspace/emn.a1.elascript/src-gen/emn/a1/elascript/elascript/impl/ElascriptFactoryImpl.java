/**
 */
package emn.a1.elascript.elascript.impl;

import emn.a1.elascript.elascript.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

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
      case ElascriptPackage.BEGIN_SCRIPT: return createBeginScript();
      case ElascriptPackage.END_SCRIPT: return createEndScript();
      case ElascriptPackage.STATEMENT: return createStatement();
      case ElascriptPackage.PARALLEL: return createParallel();
      case ElascriptPackage.BEGIN_PARALLEL: return createBeginParallel();
      case ElascriptPackage.END_PARALLEL: return createEndParallel();
      case ElascriptPackage.STATEMENT_LIST: return createStatementList();
      case ElascriptPackage.COMMAND: return createCommand();
      case ElascriptPackage.SCALE_FUNCTION: return createScaleFunction();
      case ElascriptPackage.WAIT_FUNCTION: return createWaitFunction();
      case ElascriptPackage.GENERIC_FUNCTION: return createGenericFunction();
      case ElascriptPackage.SCALE_IN_INFRA: return createScaleInInfra();
      case ElascriptPackage.SCALE_OUT_INFRA: return createScaleOutInfra();
      case ElascriptPackage.SCALE_UP_INFRA: return createScaleUpInfra();
      case ElascriptPackage.SCALE_DOWN_INFRA: return createScaleDownInfra();
      case ElascriptPackage.SCALE_IN_SOFT: return createScaleInSoft();
      case ElascriptPackage.SCALE_OUT_SOFT: return createScaleOutSoft();
      case ElascriptPackage.SCALE_UP_SOFT: return createScaleUpSoft();
      case ElascriptPackage.SCALE_DOWN_SOFT: return createScaleDownSoft();
      case ElascriptPackage.PARAM: return createParam();
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
  public BeginScript createBeginScript()
  {
    BeginScriptImpl beginScript = new BeginScriptImpl();
    return beginScript;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EndScript createEndScript()
  {
    EndScriptImpl endScript = new EndScriptImpl();
    return endScript;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement createStatement()
  {
    StatementImpl statement = new StatementImpl();
    return statement;
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
  public BeginParallel createBeginParallel()
  {
    BeginParallelImpl beginParallel = new BeginParallelImpl();
    return beginParallel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EndParallel createEndParallel()
  {
    EndParallelImpl endParallel = new EndParallelImpl();
    return endParallel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StatementList createStatementList()
  {
    StatementListImpl statementList = new StatementListImpl();
    return statementList;
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
  public ScaleFunction createScaleFunction()
  {
    ScaleFunctionImpl scaleFunction = new ScaleFunctionImpl();
    return scaleFunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WaitFunction createWaitFunction()
  {
    WaitFunctionImpl waitFunction = new WaitFunctionImpl();
    return waitFunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GenericFunction createGenericFunction()
  {
    GenericFunctionImpl genericFunction = new GenericFunctionImpl();
    return genericFunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScaleInInfra createScaleInInfra()
  {
    ScaleInInfraImpl scaleInInfra = new ScaleInInfraImpl();
    return scaleInInfra;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScaleOutInfra createScaleOutInfra()
  {
    ScaleOutInfraImpl scaleOutInfra = new ScaleOutInfraImpl();
    return scaleOutInfra;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScaleUpInfra createScaleUpInfra()
  {
    ScaleUpInfraImpl scaleUpInfra = new ScaleUpInfraImpl();
    return scaleUpInfra;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScaleDownInfra createScaleDownInfra()
  {
    ScaleDownInfraImpl scaleDownInfra = new ScaleDownInfraImpl();
    return scaleDownInfra;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScaleInSoft createScaleInSoft()
  {
    ScaleInSoftImpl scaleInSoft = new ScaleInSoftImpl();
    return scaleInSoft;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScaleOutSoft createScaleOutSoft()
  {
    ScaleOutSoftImpl scaleOutSoft = new ScaleOutSoftImpl();
    return scaleOutSoft;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScaleUpSoft createScaleUpSoft()
  {
    ScaleUpSoftImpl scaleUpSoft = new ScaleUpSoftImpl();
    return scaleUpSoft;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScaleDownSoft createScaleDownSoft()
  {
    ScaleDownSoftImpl scaleDownSoft = new ScaleDownSoftImpl();
    return scaleDownSoft;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Param createParam()
  {
    ParamImpl param = new ParamImpl();
    return param;
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
