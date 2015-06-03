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
   * The feature id for the '<em><b>Script Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT__SCRIPT_STATEMENTS = 0;

  /**
   * The number of structural features of the '<em>Script</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link emn.a1.elascript.elascript.impl.StatementImpl <em>Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see emn.a1.elascript.elascript.impl.StatementImpl
   * @see emn.a1.elascript.elascript.impl.ElascriptPackageImpl#getStatement()
   * @generated
   */
  int STATEMENT = 1;

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
  int PARALLEL = 2;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARALLEL__STATEMENTS = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Parallel</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARALLEL_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link emn.a1.elascript.elascript.impl.EListImpl <em>EList</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see emn.a1.elascript.elascript.impl.EListImpl
   * @see emn.a1.elascript.elascript.impl.ElascriptPackageImpl#getEList()
   * @generated
   */
  int ELIST = 3;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELIST__STATEMENTS = 0;

  /**
   * The number of structural features of the '<em>EList</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link emn.a1.elascript.elascript.impl.CommandImpl <em>Command</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see emn.a1.elascript.elascript.impl.CommandImpl
   * @see emn.a1.elascript.elascript.impl.ElascriptPackageImpl#getCommand()
   * @generated
   */
  int COMMAND = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__NAME = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__PARAMS = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Command</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link emn.a1.elascript.elascript.impl.ParamImpl <em>Param</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see emn.a1.elascript.elascript.impl.ParamImpl
   * @see emn.a1.elascript.elascript.impl.ElascriptPackageImpl#getParam()
   * @generated
   */
  int PARAM = 5;

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
   * Returns the meta object for the containment reference list '{@link emn.a1.elascript.elascript.Script#getScriptStatements <em>Script Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Script Statements</em>'.
   * @see emn.a1.elascript.elascript.Script#getScriptStatements()
   * @see #getScript()
   * @generated
   */
  EReference getScript_ScriptStatements();

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
   * Returns the meta object for the containment reference list '{@link emn.a1.elascript.elascript.Parallel#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see emn.a1.elascript.elascript.Parallel#getStatements()
   * @see #getParallel()
   * @generated
   */
  EReference getParallel_Statements();

  /**
   * Returns the meta object for class '{@link emn.a1.elascript.elascript.EList <em>EList</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EList</em>'.
   * @see emn.a1.elascript.elascript.EList
   * @generated
   */
  EClass getEList();

  /**
   * Returns the meta object for the containment reference list '{@link emn.a1.elascript.elascript.EList#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see emn.a1.elascript.elascript.EList#getStatements()
   * @see #getEList()
   * @generated
   */
  EReference getEList_Statements();

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
     * The meta object literal for the '<em><b>Script Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCRIPT__SCRIPT_STATEMENTS = eINSTANCE.getScript_ScriptStatements();

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
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARALLEL__STATEMENTS = eINSTANCE.getParallel_Statements();

    /**
     * The meta object literal for the '{@link emn.a1.elascript.elascript.impl.EListImpl <em>EList</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see emn.a1.elascript.elascript.impl.EListImpl
     * @see emn.a1.elascript.elascript.impl.ElascriptPackageImpl#getEList()
     * @generated
     */
    EClass ELIST = eINSTANCE.getEList();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELIST__STATEMENTS = eINSTANCE.getEList_Statements();

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
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMMAND__NAME = eINSTANCE.getCommand_Name();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMAND__PARAMS = eINSTANCE.getCommand_Params();

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
