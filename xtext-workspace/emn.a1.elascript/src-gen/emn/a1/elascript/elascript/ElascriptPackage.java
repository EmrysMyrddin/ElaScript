/**
 */
package emn.a1.elascript.elascript;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see emn.a1.elascript.elascript.ElascriptFactory
 * @model kind="package"
 * @generated
 */
public interface ElascriptPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "elascript";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.a1.emn/elascript/Elascript";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "elascript";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ElascriptPackage eINSTANCE = emn.a1.elascript.elascript.impl.ElascriptPackageImpl.init();

  /**
   * The meta object id for the '{@link emn.a1.elascript.elascript.impl.ScriptImpl <em>Script</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see emn.a1.elascript.elascript.impl.ScriptImpl
   * @see emn.a1.elascript.elascript.impl.ElascriptPackageImpl#getScript()
   * @generated
   */
  int SCRIPT = 0;

  /**
   * The feature id for the '<em><b>Begin Script</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT__BEGIN_SCRIPT = 0;

  /**
   * The feature id for the '<em><b>Script Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT__SCRIPT_STATEMENT = 1;

  /**
   * The feature id for the '<em><b>End Script</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT__END_SCRIPT = 2;

  /**
   * The number of structural features of the '<em>Script</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link emn.a1.elascript.elascript.impl.BeginScriptImpl <em>Begin Script</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see emn.a1.elascript.elascript.impl.BeginScriptImpl
   * @see emn.a1.elascript.elascript.impl.ElascriptPackageImpl#getBeginScript()
   * @generated
   */
  int BEGIN_SCRIPT = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEGIN_SCRIPT__NAME = 0;

  /**
   * The number of structural features of the '<em>Begin Script</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEGIN_SCRIPT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link emn.a1.elascript.elascript.impl.EndScriptImpl <em>End Script</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see emn.a1.elascript.elascript.impl.EndScriptImpl
   * @see emn.a1.elascript.elascript.impl.ElascriptPackageImpl#getEndScript()
   * @generated
   */
  int END_SCRIPT = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int END_SCRIPT__NAME = 0;

  /**
   * The number of structural features of the '<em>End Script</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int END_SCRIPT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link emn.a1.elascript.elascript.impl.StatementImpl <em>Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see emn.a1.elascript.elascript.impl.StatementImpl
   * @see emn.a1.elascript.elascript.impl.ElascriptPackageImpl#getStatement()
   * @generated
   */
  int STATEMENT = 3;

  /**
   * The number of structural features of the '<em>Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link emn.a1.elascript.elascript.impl.ParallelImpl <em>Parallel</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see emn.a1.elascript.elascript.impl.ParallelImpl
   * @see emn.a1.elascript.elascript.impl.ElascriptPackageImpl#getParallel()
   * @generated
   */
  int PARALLEL = 4;

  /**
   * The feature id for the '<em><b>Begin Parallel</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARALLEL__BEGIN_PARALLEL = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Statement Lists</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARALLEL__STATEMENT_LISTS = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>End Parallel</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARALLEL__END_PARALLEL = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Parallel</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARALLEL_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link emn.a1.elascript.elascript.impl.BeginParallelImpl <em>Begin Parallel</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see emn.a1.elascript.elascript.impl.BeginParallelImpl
   * @see emn.a1.elascript.elascript.impl.ElascriptPackageImpl#getBeginParallel()
   * @generated
   */
  int BEGIN_PARALLEL = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEGIN_PARALLEL__NAME = 0;

  /**
   * The number of structural features of the '<em>Begin Parallel</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEGIN_PARALLEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link emn.a1.elascript.elascript.impl.EndParallelImpl <em>End Parallel</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see emn.a1.elascript.elascript.impl.EndParallelImpl
   * @see emn.a1.elascript.elascript.impl.ElascriptPackageImpl#getEndParallel()
   * @generated
   */
  int END_PARALLEL = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int END_PARALLEL__NAME = 0;

  /**
   * The number of structural features of the '<em>End Parallel</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int END_PARALLEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link emn.a1.elascript.elascript.impl.StatementListImpl <em>Statement List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see emn.a1.elascript.elascript.impl.StatementListImpl
   * @see emn.a1.elascript.elascript.impl.ElascriptPackageImpl#getStatementList()
   * @generated
   */
  int STATEMENT_LIST = 7;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_LIST__STATEMENTS = 0;

  /**
   * The number of structural features of the '<em>Statement List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link emn.a1.elascript.elascript.impl.CommandImpl <em>Command</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see emn.a1.elascript.elascript.impl.CommandImpl
   * @see emn.a1.elascript.elascript.impl.ElascriptPackageImpl#getCommand()
   * @generated
   */
  int COMMAND = 8;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__PARAMS = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__NAME = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Command</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link emn.a1.elascript.elascript.impl.ScaleFunctionImpl <em>Scale Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see emn.a1.elascript.elascript.impl.ScaleFunctionImpl
   * @see emn.a1.elascript.elascript.impl.ElascriptPackageImpl#getScaleFunction()
   * @generated
   */
  int SCALE_FUNCTION = 9;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCALE_FUNCTION__PARAMS = COMMAND__PARAMS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCALE_FUNCTION__NAME = COMMAND__NAME;

  /**
   * The number of structural features of the '<em>Scale Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCALE_FUNCTION_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link emn.a1.elascript.elascript.impl.WaitFunctionImpl <em>Wait Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see emn.a1.elascript.elascript.impl.WaitFunctionImpl
   * @see emn.a1.elascript.elascript.impl.ElascriptPackageImpl#getWaitFunction()
   * @generated
   */
  int WAIT_FUNCTION = 10;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WAIT_FUNCTION__PARAMS = COMMAND__PARAMS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WAIT_FUNCTION__NAME = COMMAND__NAME;

  /**
   * The number of structural features of the '<em>Wait Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WAIT_FUNCTION_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link emn.a1.elascript.elascript.impl.GenericFunctionImpl <em>Generic Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see emn.a1.elascript.elascript.impl.GenericFunctionImpl
   * @see emn.a1.elascript.elascript.impl.ElascriptPackageImpl#getGenericFunction()
   * @generated
   */
  int GENERIC_FUNCTION = 11;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC_FUNCTION__PARAMS = COMMAND__PARAMS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC_FUNCTION__NAME = COMMAND__NAME;

  /**
   * The number of structural features of the '<em>Generic Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC_FUNCTION_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link emn.a1.elascript.elascript.impl.ScaleInInfraImpl <em>Scale In Infra</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see emn.a1.elascript.elascript.impl.ScaleInInfraImpl
   * @see emn.a1.elascript.elascript.impl.ElascriptPackageImpl#getScaleInInfra()
   * @generated
   */
  int SCALE_IN_INFRA = 12;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCALE_IN_INFRA__PARAMS = SCALE_FUNCTION__PARAMS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCALE_IN_INFRA__NAME = SCALE_FUNCTION__NAME;

  /**
   * The number of structural features of the '<em>Scale In Infra</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCALE_IN_INFRA_FEATURE_COUNT = SCALE_FUNCTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link emn.a1.elascript.elascript.impl.ScaleOutInfraImpl <em>Scale Out Infra</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see emn.a1.elascript.elascript.impl.ScaleOutInfraImpl
   * @see emn.a1.elascript.elascript.impl.ElascriptPackageImpl#getScaleOutInfra()
   * @generated
   */
  int SCALE_OUT_INFRA = 13;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCALE_OUT_INFRA__PARAMS = SCALE_FUNCTION__PARAMS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCALE_OUT_INFRA__NAME = SCALE_FUNCTION__NAME;

  /**
   * The number of structural features of the '<em>Scale Out Infra</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCALE_OUT_INFRA_FEATURE_COUNT = SCALE_FUNCTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link emn.a1.elascript.elascript.impl.ScaleUpInfraImpl <em>Scale Up Infra</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see emn.a1.elascript.elascript.impl.ScaleUpInfraImpl
   * @see emn.a1.elascript.elascript.impl.ElascriptPackageImpl#getScaleUpInfra()
   * @generated
   */
  int SCALE_UP_INFRA = 14;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCALE_UP_INFRA__PARAMS = SCALE_FUNCTION__PARAMS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCALE_UP_INFRA__NAME = SCALE_FUNCTION__NAME;

  /**
   * The number of structural features of the '<em>Scale Up Infra</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCALE_UP_INFRA_FEATURE_COUNT = SCALE_FUNCTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link emn.a1.elascript.elascript.impl.ScaleDownInfraImpl <em>Scale Down Infra</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see emn.a1.elascript.elascript.impl.ScaleDownInfraImpl
   * @see emn.a1.elascript.elascript.impl.ElascriptPackageImpl#getScaleDownInfra()
   * @generated
   */
  int SCALE_DOWN_INFRA = 15;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCALE_DOWN_INFRA__PARAMS = SCALE_FUNCTION__PARAMS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCALE_DOWN_INFRA__NAME = SCALE_FUNCTION__NAME;

  /**
   * The number of structural features of the '<em>Scale Down Infra</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCALE_DOWN_INFRA_FEATURE_COUNT = SCALE_FUNCTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link emn.a1.elascript.elascript.impl.ScaleInSoftImpl <em>Scale In Soft</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see emn.a1.elascript.elascript.impl.ScaleInSoftImpl
   * @see emn.a1.elascript.elascript.impl.ElascriptPackageImpl#getScaleInSoft()
   * @generated
   */
  int SCALE_IN_SOFT = 16;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCALE_IN_SOFT__PARAMS = SCALE_FUNCTION__PARAMS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCALE_IN_SOFT__NAME = SCALE_FUNCTION__NAME;

  /**
   * The number of structural features of the '<em>Scale In Soft</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCALE_IN_SOFT_FEATURE_COUNT = SCALE_FUNCTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link emn.a1.elascript.elascript.impl.ScaleOutSoftImpl <em>Scale Out Soft</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see emn.a1.elascript.elascript.impl.ScaleOutSoftImpl
   * @see emn.a1.elascript.elascript.impl.ElascriptPackageImpl#getScaleOutSoft()
   * @generated
   */
  int SCALE_OUT_SOFT = 17;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCALE_OUT_SOFT__PARAMS = SCALE_FUNCTION__PARAMS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCALE_OUT_SOFT__NAME = SCALE_FUNCTION__NAME;

  /**
   * The number of structural features of the '<em>Scale Out Soft</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCALE_OUT_SOFT_FEATURE_COUNT = SCALE_FUNCTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link emn.a1.elascript.elascript.impl.ScaleUpSoftImpl <em>Scale Up Soft</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see emn.a1.elascript.elascript.impl.ScaleUpSoftImpl
   * @see emn.a1.elascript.elascript.impl.ElascriptPackageImpl#getScaleUpSoft()
   * @generated
   */
  int SCALE_UP_SOFT = 18;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCALE_UP_SOFT__PARAMS = SCALE_FUNCTION__PARAMS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCALE_UP_SOFT__NAME = SCALE_FUNCTION__NAME;

  /**
   * The number of structural features of the '<em>Scale Up Soft</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCALE_UP_SOFT_FEATURE_COUNT = SCALE_FUNCTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link emn.a1.elascript.elascript.impl.ScaleDownSoftImpl <em>Scale Down Soft</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see emn.a1.elascript.elascript.impl.ScaleDownSoftImpl
   * @see emn.a1.elascript.elascript.impl.ElascriptPackageImpl#getScaleDownSoft()
   * @generated
   */
  int SCALE_DOWN_SOFT = 19;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCALE_DOWN_SOFT__PARAMS = SCALE_FUNCTION__PARAMS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCALE_DOWN_SOFT__NAME = SCALE_FUNCTION__NAME;

  /**
   * The number of structural features of the '<em>Scale Down Soft</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCALE_DOWN_SOFT_FEATURE_COUNT = SCALE_FUNCTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link emn.a1.elascript.elascript.impl.ParamImpl <em>Param</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see emn.a1.elascript.elascript.impl.ParamImpl
   * @see emn.a1.elascript.elascript.impl.ElascriptPackageImpl#getParam()
   * @generated
   */
  int PARAM = 20;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM__VALUE = 0;

  /**
   * The number of structural features of the '<em>Param</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link emn.a1.elascript.elascript.Script <em>Script</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Script</em>'.
   * @see emn.a1.elascript.elascript.Script
   * @generated
   */
  EClass getScript();

  /**
   * Returns the meta object for the containment reference '{@link emn.a1.elascript.elascript.Script#getBeginScript <em>Begin Script</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Begin Script</em>'.
   * @see emn.a1.elascript.elascript.Script#getBeginScript()
   * @see #getScript()
   * @generated
   */
  EReference getScript_BeginScript();

  /**
   * Returns the meta object for the containment reference '{@link emn.a1.elascript.elascript.Script#getScriptStatement <em>Script Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Script Statement</em>'.
   * @see emn.a1.elascript.elascript.Script#getScriptStatement()
   * @see #getScript()
   * @generated
   */
  EReference getScript_ScriptStatement();

  /**
   * Returns the meta object for the containment reference '{@link emn.a1.elascript.elascript.Script#getEndScript <em>End Script</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>End Script</em>'.
   * @see emn.a1.elascript.elascript.Script#getEndScript()
   * @see #getScript()
   * @generated
   */
  EReference getScript_EndScript();

  /**
   * Returns the meta object for class '{@link emn.a1.elascript.elascript.BeginScript <em>Begin Script</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Begin Script</em>'.
   * @see emn.a1.elascript.elascript.BeginScript
   * @generated
   */
  EClass getBeginScript();

  /**
   * Returns the meta object for the attribute '{@link emn.a1.elascript.elascript.BeginScript#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see emn.a1.elascript.elascript.BeginScript#getName()
   * @see #getBeginScript()
   * @generated
   */
  EAttribute getBeginScript_Name();

  /**
   * Returns the meta object for class '{@link emn.a1.elascript.elascript.EndScript <em>End Script</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>End Script</em>'.
   * @see emn.a1.elascript.elascript.EndScript
   * @generated
   */
  EClass getEndScript();

  /**
   * Returns the meta object for the attribute '{@link emn.a1.elascript.elascript.EndScript#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see emn.a1.elascript.elascript.EndScript#getName()
   * @see #getEndScript()
   * @generated
   */
  EAttribute getEndScript_Name();

  /**
   * Returns the meta object for class '{@link emn.a1.elascript.elascript.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement</em>'.
   * @see emn.a1.elascript.elascript.Statement
   * @generated
   */
  EClass getStatement();

  /**
   * Returns the meta object for class '{@link emn.a1.elascript.elascript.Parallel <em>Parallel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parallel</em>'.
   * @see emn.a1.elascript.elascript.Parallel
   * @generated
   */
  EClass getParallel();

  /**
   * Returns the meta object for the containment reference '{@link emn.a1.elascript.elascript.Parallel#getBeginParallel <em>Begin Parallel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Begin Parallel</em>'.
   * @see emn.a1.elascript.elascript.Parallel#getBeginParallel()
   * @see #getParallel()
   * @generated
   */
  EReference getParallel_BeginParallel();

  /**
   * Returns the meta object for the containment reference list '{@link emn.a1.elascript.elascript.Parallel#getStatementLists <em>Statement Lists</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statement Lists</em>'.
   * @see emn.a1.elascript.elascript.Parallel#getStatementLists()
   * @see #getParallel()
   * @generated
   */
  EReference getParallel_StatementLists();

  /**
   * Returns the meta object for the containment reference '{@link emn.a1.elascript.elascript.Parallel#getEndParallel <em>End Parallel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>End Parallel</em>'.
   * @see emn.a1.elascript.elascript.Parallel#getEndParallel()
   * @see #getParallel()
   * @generated
   */
  EReference getParallel_EndParallel();

  /**
   * Returns the meta object for class '{@link emn.a1.elascript.elascript.BeginParallel <em>Begin Parallel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Begin Parallel</em>'.
   * @see emn.a1.elascript.elascript.BeginParallel
   * @generated
   */
  EClass getBeginParallel();

  /**
   * Returns the meta object for the attribute '{@link emn.a1.elascript.elascript.BeginParallel#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see emn.a1.elascript.elascript.BeginParallel#getName()
   * @see #getBeginParallel()
   * @generated
   */
  EAttribute getBeginParallel_Name();

  /**
   * Returns the meta object for class '{@link emn.a1.elascript.elascript.EndParallel <em>End Parallel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>End Parallel</em>'.
   * @see emn.a1.elascript.elascript.EndParallel
   * @generated
   */
  EClass getEndParallel();

  /**
   * Returns the meta object for the attribute '{@link emn.a1.elascript.elascript.EndParallel#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see emn.a1.elascript.elascript.EndParallel#getName()
   * @see #getEndParallel()
   * @generated
   */
  EAttribute getEndParallel_Name();

  /**
   * Returns the meta object for class '{@link emn.a1.elascript.elascript.StatementList <em>Statement List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement List</em>'.
   * @see emn.a1.elascript.elascript.StatementList
   * @generated
   */
  EClass getStatementList();

  /**
   * Returns the meta object for the containment reference list '{@link emn.a1.elascript.elascript.StatementList#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see emn.a1.elascript.elascript.StatementList#getStatements()
   * @see #getStatementList()
   * @generated
   */
  EReference getStatementList_Statements();

  /**
   * Returns the meta object for class '{@link emn.a1.elascript.elascript.Command <em>Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Command</em>'.
   * @see emn.a1.elascript.elascript.Command
   * @generated
   */
  EClass getCommand();

  /**
   * Returns the meta object for the containment reference list '{@link emn.a1.elascript.elascript.Command#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see emn.a1.elascript.elascript.Command#getParams()
   * @see #getCommand()
   * @generated
   */
  EReference getCommand_Params();

  /**
   * Returns the meta object for the attribute '{@link emn.a1.elascript.elascript.Command#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see emn.a1.elascript.elascript.Command#getName()
   * @see #getCommand()
   * @generated
   */
  EAttribute getCommand_Name();

  /**
   * Returns the meta object for class '{@link emn.a1.elascript.elascript.ScaleFunction <em>Scale Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scale Function</em>'.
   * @see emn.a1.elascript.elascript.ScaleFunction
   * @generated
   */
  EClass getScaleFunction();

  /**
   * Returns the meta object for class '{@link emn.a1.elascript.elascript.WaitFunction <em>Wait Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Wait Function</em>'.
   * @see emn.a1.elascript.elascript.WaitFunction
   * @generated
   */
  EClass getWaitFunction();

  /**
   * Returns the meta object for class '{@link emn.a1.elascript.elascript.GenericFunction <em>Generic Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Generic Function</em>'.
   * @see emn.a1.elascript.elascript.GenericFunction
   * @generated
   */
  EClass getGenericFunction();

  /**
   * Returns the meta object for class '{@link emn.a1.elascript.elascript.ScaleInInfra <em>Scale In Infra</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scale In Infra</em>'.
   * @see emn.a1.elascript.elascript.ScaleInInfra
   * @generated
   */
  EClass getScaleInInfra();

  /**
   * Returns the meta object for class '{@link emn.a1.elascript.elascript.ScaleOutInfra <em>Scale Out Infra</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scale Out Infra</em>'.
   * @see emn.a1.elascript.elascript.ScaleOutInfra
   * @generated
   */
  EClass getScaleOutInfra();

  /**
   * Returns the meta object for class '{@link emn.a1.elascript.elascript.ScaleUpInfra <em>Scale Up Infra</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scale Up Infra</em>'.
   * @see emn.a1.elascript.elascript.ScaleUpInfra
   * @generated
   */
  EClass getScaleUpInfra();

  /**
   * Returns the meta object for class '{@link emn.a1.elascript.elascript.ScaleDownInfra <em>Scale Down Infra</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scale Down Infra</em>'.
   * @see emn.a1.elascript.elascript.ScaleDownInfra
   * @generated
   */
  EClass getScaleDownInfra();

  /**
   * Returns the meta object for class '{@link emn.a1.elascript.elascript.ScaleInSoft <em>Scale In Soft</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scale In Soft</em>'.
   * @see emn.a1.elascript.elascript.ScaleInSoft
   * @generated
   */
  EClass getScaleInSoft();

  /**
   * Returns the meta object for class '{@link emn.a1.elascript.elascript.ScaleOutSoft <em>Scale Out Soft</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scale Out Soft</em>'.
   * @see emn.a1.elascript.elascript.ScaleOutSoft
   * @generated
   */
  EClass getScaleOutSoft();

  /**
   * Returns the meta object for class '{@link emn.a1.elascript.elascript.ScaleUpSoft <em>Scale Up Soft</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scale Up Soft</em>'.
   * @see emn.a1.elascript.elascript.ScaleUpSoft
   * @generated
   */
  EClass getScaleUpSoft();

  /**
   * Returns the meta object for class '{@link emn.a1.elascript.elascript.ScaleDownSoft <em>Scale Down Soft</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scale Down Soft</em>'.
   * @see emn.a1.elascript.elascript.ScaleDownSoft
   * @generated
   */
  EClass getScaleDownSoft();

  /**
   * Returns the meta object for class '{@link emn.a1.elascript.elascript.Param <em>Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Param</em>'.
   * @see emn.a1.elascript.elascript.Param
   * @generated
   */
  EClass getParam();

  /**
   * Returns the meta object for the attribute '{@link emn.a1.elascript.elascript.Param#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see emn.a1.elascript.elascript.Param#getValue()
   * @see #getParam()
   * @generated
   */
  EAttribute getParam_Value();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ElascriptFactory getElascriptFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link emn.a1.elascript.elascript.impl.ScriptImpl <em>Script</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see emn.a1.elascript.elascript.impl.ScriptImpl
     * @see emn.a1.elascript.elascript.impl.ElascriptPackageImpl#getScript()
     * @generated
     */
    EClass SCRIPT = eINSTANCE.getScript();

    /**
     * The meta object literal for the '<em><b>Begin Script</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCRIPT__BEGIN_SCRIPT = eINSTANCE.getScript_BeginScript();

    /**
     * The meta object literal for the '<em><b>Script Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCRIPT__SCRIPT_STATEMENT = eINSTANCE.getScript_ScriptStatement();

    /**
     * The meta object literal for the '<em><b>End Script</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCRIPT__END_SCRIPT = eINSTANCE.getScript_EndScript();

    /**
     * The meta object literal for the '{@link emn.a1.elascript.elascript.impl.BeginScriptImpl <em>Begin Script</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see emn.a1.elascript.elascript.impl.BeginScriptImpl
     * @see emn.a1.elascript.elascript.impl.ElascriptPackageImpl#getBeginScript()
     * @generated
     */
    EClass BEGIN_SCRIPT = eINSTANCE.getBeginScript();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BEGIN_SCRIPT__NAME = eINSTANCE.getBeginScript_Name();

    /**
     * The meta object literal for the '{@link emn.a1.elascript.elascript.impl.EndScriptImpl <em>End Script</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see emn.a1.elascript.elascript.impl.EndScriptImpl
     * @see emn.a1.elascript.elascript.impl.ElascriptPackageImpl#getEndScript()
     * @generated
     */
    EClass END_SCRIPT = eINSTANCE.getEndScript();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute END_SCRIPT__NAME = eINSTANCE.getEndScript_Name();

    /**
     * The meta object literal for the '{@link emn.a1.elascript.elascript.impl.StatementImpl <em>Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see emn.a1.elascript.elascript.impl.StatementImpl
     * @see emn.a1.elascript.elascript.impl.ElascriptPackageImpl#getStatement()
     * @generated
     */
    EClass STATEMENT = eINSTANCE.getStatement();

    /**
     * The meta object literal for the '{@link emn.a1.elascript.elascript.impl.ParallelImpl <em>Parallel</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see emn.a1.elascript.elascript.impl.ParallelImpl
     * @see emn.a1.elascript.elascript.impl.ElascriptPackageImpl#getParallel()
     * @generated
     */
    EClass PARALLEL = eINSTANCE.getParallel();

    /**
     * The meta object literal for the '<em><b>Begin Parallel</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARALLEL__BEGIN_PARALLEL = eINSTANCE.getParallel_BeginParallel();

    /**
     * The meta object literal for the '<em><b>Statement Lists</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARALLEL__STATEMENT_LISTS = eINSTANCE.getParallel_StatementLists();

    /**
     * The meta object literal for the '<em><b>End Parallel</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARALLEL__END_PARALLEL = eINSTANCE.getParallel_EndParallel();

    /**
     * The meta object literal for the '{@link emn.a1.elascript.elascript.impl.BeginParallelImpl <em>Begin Parallel</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see emn.a1.elascript.elascript.impl.BeginParallelImpl
     * @see emn.a1.elascript.elascript.impl.ElascriptPackageImpl#getBeginParallel()
     * @generated
     */
    EClass BEGIN_PARALLEL = eINSTANCE.getBeginParallel();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BEGIN_PARALLEL__NAME = eINSTANCE.getBeginParallel_Name();

    /**
     * The meta object literal for the '{@link emn.a1.elascript.elascript.impl.EndParallelImpl <em>End Parallel</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see emn.a1.elascript.elascript.impl.EndParallelImpl
     * @see emn.a1.elascript.elascript.impl.ElascriptPackageImpl#getEndParallel()
     * @generated
     */
    EClass END_PARALLEL = eINSTANCE.getEndParallel();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute END_PARALLEL__NAME = eINSTANCE.getEndParallel_Name();

    /**
     * The meta object literal for the '{@link emn.a1.elascript.elascript.impl.StatementListImpl <em>Statement List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see emn.a1.elascript.elascript.impl.StatementListImpl
     * @see emn.a1.elascript.elascript.impl.ElascriptPackageImpl#getStatementList()
     * @generated
     */
    EClass STATEMENT_LIST = eINSTANCE.getStatementList();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT_LIST__STATEMENTS = eINSTANCE.getStatementList_Statements();

    /**
     * The meta object literal for the '{@link emn.a1.elascript.elascript.impl.CommandImpl <em>Command</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see emn.a1.elascript.elascript.impl.CommandImpl
     * @see emn.a1.elascript.elascript.impl.ElascriptPackageImpl#getCommand()
     * @generated
     */
    EClass COMMAND = eINSTANCE.getCommand();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMAND__PARAMS = eINSTANCE.getCommand_Params();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMMAND__NAME = eINSTANCE.getCommand_Name();

    /**
     * The meta object literal for the '{@link emn.a1.elascript.elascript.impl.ScaleFunctionImpl <em>Scale Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see emn.a1.elascript.elascript.impl.ScaleFunctionImpl
     * @see emn.a1.elascript.elascript.impl.ElascriptPackageImpl#getScaleFunction()
     * @generated
     */
    EClass SCALE_FUNCTION = eINSTANCE.getScaleFunction();

    /**
     * The meta object literal for the '{@link emn.a1.elascript.elascript.impl.WaitFunctionImpl <em>Wait Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see emn.a1.elascript.elascript.impl.WaitFunctionImpl
     * @see emn.a1.elascript.elascript.impl.ElascriptPackageImpl#getWaitFunction()
     * @generated
     */
    EClass WAIT_FUNCTION = eINSTANCE.getWaitFunction();

    /**
     * The meta object literal for the '{@link emn.a1.elascript.elascript.impl.GenericFunctionImpl <em>Generic Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see emn.a1.elascript.elascript.impl.GenericFunctionImpl
     * @see emn.a1.elascript.elascript.impl.ElascriptPackageImpl#getGenericFunction()
     * @generated
     */
    EClass GENERIC_FUNCTION = eINSTANCE.getGenericFunction();

    /**
     * The meta object literal for the '{@link emn.a1.elascript.elascript.impl.ScaleInInfraImpl <em>Scale In Infra</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see emn.a1.elascript.elascript.impl.ScaleInInfraImpl
     * @see emn.a1.elascript.elascript.impl.ElascriptPackageImpl#getScaleInInfra()
     * @generated
     */
    EClass SCALE_IN_INFRA = eINSTANCE.getScaleInInfra();

    /**
     * The meta object literal for the '{@link emn.a1.elascript.elascript.impl.ScaleOutInfraImpl <em>Scale Out Infra</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see emn.a1.elascript.elascript.impl.ScaleOutInfraImpl
     * @see emn.a1.elascript.elascript.impl.ElascriptPackageImpl#getScaleOutInfra()
     * @generated
     */
    EClass SCALE_OUT_INFRA = eINSTANCE.getScaleOutInfra();

    /**
     * The meta object literal for the '{@link emn.a1.elascript.elascript.impl.ScaleUpInfraImpl <em>Scale Up Infra</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see emn.a1.elascript.elascript.impl.ScaleUpInfraImpl
     * @see emn.a1.elascript.elascript.impl.ElascriptPackageImpl#getScaleUpInfra()
     * @generated
     */
    EClass SCALE_UP_INFRA = eINSTANCE.getScaleUpInfra();

    /**
     * The meta object literal for the '{@link emn.a1.elascript.elascript.impl.ScaleDownInfraImpl <em>Scale Down Infra</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see emn.a1.elascript.elascript.impl.ScaleDownInfraImpl
     * @see emn.a1.elascript.elascript.impl.ElascriptPackageImpl#getScaleDownInfra()
     * @generated
     */
    EClass SCALE_DOWN_INFRA = eINSTANCE.getScaleDownInfra();

    /**
     * The meta object literal for the '{@link emn.a1.elascript.elascript.impl.ScaleInSoftImpl <em>Scale In Soft</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see emn.a1.elascript.elascript.impl.ScaleInSoftImpl
     * @see emn.a1.elascript.elascript.impl.ElascriptPackageImpl#getScaleInSoft()
     * @generated
     */
    EClass SCALE_IN_SOFT = eINSTANCE.getScaleInSoft();

    /**
     * The meta object literal for the '{@link emn.a1.elascript.elascript.impl.ScaleOutSoftImpl <em>Scale Out Soft</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see emn.a1.elascript.elascript.impl.ScaleOutSoftImpl
     * @see emn.a1.elascript.elascript.impl.ElascriptPackageImpl#getScaleOutSoft()
     * @generated
     */
    EClass SCALE_OUT_SOFT = eINSTANCE.getScaleOutSoft();

    /**
     * The meta object literal for the '{@link emn.a1.elascript.elascript.impl.ScaleUpSoftImpl <em>Scale Up Soft</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see emn.a1.elascript.elascript.impl.ScaleUpSoftImpl
     * @see emn.a1.elascript.elascript.impl.ElascriptPackageImpl#getScaleUpSoft()
     * @generated
     */
    EClass SCALE_UP_SOFT = eINSTANCE.getScaleUpSoft();

    /**
     * The meta object literal for the '{@link emn.a1.elascript.elascript.impl.ScaleDownSoftImpl <em>Scale Down Soft</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see emn.a1.elascript.elascript.impl.ScaleDownSoftImpl
     * @see emn.a1.elascript.elascript.impl.ElascriptPackageImpl#getScaleDownSoft()
     * @generated
     */
    EClass SCALE_DOWN_SOFT = eINSTANCE.getScaleDownSoft();

    /**
     * The meta object literal for the '{@link emn.a1.elascript.elascript.impl.ParamImpl <em>Param</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see emn.a1.elascript.elascript.impl.ParamImpl
     * @see emn.a1.elascript.elascript.impl.ElascriptPackageImpl#getParam()
     * @generated
     */
    EClass PARAM = eINSTANCE.getParam();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAM__VALUE = eINSTANCE.getParam_Value();

  }

} //ElascriptPackage
