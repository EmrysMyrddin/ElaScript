/**
 */
package org.elascript.elascript;

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
 * @see org.elascript.elascript.ElascriptFactory
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
  String eNS_URI = "http://www.elascript.org/Elascript";

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
  ElascriptPackage eINSTANCE = org.elascript.elascript.impl.ElascriptPackageImpl.init();

  /**
   * The meta object id for the '{@link org.elascript.elascript.impl.ScriptImpl <em>Script</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elascript.elascript.impl.ScriptImpl
   * @see org.elascript.elascript.impl.ElascriptPackageImpl#getScript()
   * @generated
   */
  int SCRIPT = 0;

  /**
   * The feature id for the '<em><b>Actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT__ACTIONS = 0;

  /**
   * The number of structural features of the '<em>Script</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.elascript.elascript.impl.ActionImpl <em>Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elascript.elascript.impl.ActionImpl
   * @see org.elascript.elascript.impl.ElascriptPackageImpl#getAction()
   * @generated
   */
  int ACTION = 1;

  /**
   * The number of structural features of the '<em>Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.elascript.elascript.impl.ParallelImpl <em>Parallel</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elascript.elascript.impl.ParallelImpl
   * @see org.elascript.elascript.impl.ElascriptPackageImpl#getParallel()
   * @generated
   */
  int PARALLEL = 2;

  /**
   * The number of structural features of the '<em>Parallel</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARALLEL_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.elascript.elascript.impl.ParallelBodyImpl <em>Parallel Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elascript.elascript.impl.ParallelBodyImpl
   * @see org.elascript.elascript.impl.ElascriptPackageImpl#getParallelBody()
   * @generated
   */
  int PARALLEL_BODY = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARALLEL_BODY__NAME = PARALLEL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARALLEL_BODY__ACTIONS = PARALLEL_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Parallel Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARALLEL_BODY_FEATURE_COUNT = PARALLEL_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.elascript.elascript.impl.ActionListImpl <em>Action List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elascript.elascript.impl.ActionListImpl
   * @see org.elascript.elascript.impl.ElascriptPackageImpl#getActionList()
   * @generated
   */
  int ACTION_LIST = 4;

  /**
   * The feature id for the '<em><b>Actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_LIST__ACTIONS = 0;

  /**
   * The number of structural features of the '<em>Action List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.elascript.elascript.impl.CommandImpl <em>Command</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elascript.elascript.impl.CommandImpl
   * @see org.elascript.elascript.impl.ElascriptPackageImpl#getCommand()
   * @generated
   */
  int COMMAND = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__NAME = ACTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__PARAMS = ACTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Command</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.elascript.elascript.impl.ParamListImpl <em>Param List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elascript.elascript.impl.ParamListImpl
   * @see org.elascript.elascript.impl.ElascriptPackageImpl#getParamList()
   * @generated
   */
  int PARAM_LIST = 6;

  /**
   * The feature id for the '<em><b>Params</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM_LIST__PARAMS = 0;

  /**
   * The number of structural features of the '<em>Param List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM_LIST_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link org.elascript.elascript.Script <em>Script</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Script</em>'.
   * @see org.elascript.elascript.Script
   * @generated
   */
  EClass getScript();

  /**
   * Returns the meta object for the containment reference list '{@link org.elascript.elascript.Script#getActions <em>Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actions</em>'.
   * @see org.elascript.elascript.Script#getActions()
   * @see #getScript()
   * @generated
   */
  EReference getScript_Actions();

  /**
   * Returns the meta object for class '{@link org.elascript.elascript.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action</em>'.
   * @see org.elascript.elascript.Action
   * @generated
   */
  EClass getAction();

  /**
   * Returns the meta object for class '{@link org.elascript.elascript.Parallel <em>Parallel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parallel</em>'.
   * @see org.elascript.elascript.Parallel
   * @generated
   */
  EClass getParallel();

  /**
   * Returns the meta object for class '{@link org.elascript.elascript.ParallelBody <em>Parallel Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parallel Body</em>'.
   * @see org.elascript.elascript.ParallelBody
   * @generated
   */
  EClass getParallelBody();

  /**
   * Returns the meta object for the attribute '{@link org.elascript.elascript.ParallelBody#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.elascript.elascript.ParallelBody#getName()
   * @see #getParallelBody()
   * @generated
   */
  EAttribute getParallelBody_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.elascript.elascript.ParallelBody#getActions <em>Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actions</em>'.
   * @see org.elascript.elascript.ParallelBody#getActions()
   * @see #getParallelBody()
   * @generated
   */
  EReference getParallelBody_Actions();

  /**
   * Returns the meta object for class '{@link org.elascript.elascript.ActionList <em>Action List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action List</em>'.
   * @see org.elascript.elascript.ActionList
   * @generated
   */
  EClass getActionList();

  /**
   * Returns the meta object for the containment reference list '{@link org.elascript.elascript.ActionList#getActions <em>Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actions</em>'.
   * @see org.elascript.elascript.ActionList#getActions()
   * @see #getActionList()
   * @generated
   */
  EReference getActionList_Actions();

  /**
   * Returns the meta object for class '{@link org.elascript.elascript.Command <em>Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Command</em>'.
   * @see org.elascript.elascript.Command
   * @generated
   */
  EClass getCommand();

  /**
   * Returns the meta object for the attribute '{@link org.elascript.elascript.Command#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.elascript.elascript.Command#getName()
   * @see #getCommand()
   * @generated
   */
  EAttribute getCommand_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.elascript.elascript.Command#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Params</em>'.
   * @see org.elascript.elascript.Command#getParams()
   * @see #getCommand()
   * @generated
   */
  EReference getCommand_Params();

  /**
   * Returns the meta object for class '{@link org.elascript.elascript.ParamList <em>Param List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Param List</em>'.
   * @see org.elascript.elascript.ParamList
   * @generated
   */
  EClass getParamList();

  /**
   * Returns the meta object for the attribute list '{@link org.elascript.elascript.ParamList#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Params</em>'.
   * @see org.elascript.elascript.ParamList#getParams()
   * @see #getParamList()
   * @generated
   */
  EAttribute getParamList_Params();

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
     * The meta object literal for the '{@link org.elascript.elascript.impl.ScriptImpl <em>Script</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elascript.elascript.impl.ScriptImpl
     * @see org.elascript.elascript.impl.ElascriptPackageImpl#getScript()
     * @generated
     */
    EClass SCRIPT = eINSTANCE.getScript();

    /**
     * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCRIPT__ACTIONS = eINSTANCE.getScript_Actions();

    /**
     * The meta object literal for the '{@link org.elascript.elascript.impl.ActionImpl <em>Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elascript.elascript.impl.ActionImpl
     * @see org.elascript.elascript.impl.ElascriptPackageImpl#getAction()
     * @generated
     */
    EClass ACTION = eINSTANCE.getAction();

    /**
     * The meta object literal for the '{@link org.elascript.elascript.impl.ParallelImpl <em>Parallel</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elascript.elascript.impl.ParallelImpl
     * @see org.elascript.elascript.impl.ElascriptPackageImpl#getParallel()
     * @generated
     */
    EClass PARALLEL = eINSTANCE.getParallel();

    /**
     * The meta object literal for the '{@link org.elascript.elascript.impl.ParallelBodyImpl <em>Parallel Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elascript.elascript.impl.ParallelBodyImpl
     * @see org.elascript.elascript.impl.ElascriptPackageImpl#getParallelBody()
     * @generated
     */
    EClass PARALLEL_BODY = eINSTANCE.getParallelBody();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARALLEL_BODY__NAME = eINSTANCE.getParallelBody_Name();

    /**
     * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARALLEL_BODY__ACTIONS = eINSTANCE.getParallelBody_Actions();

    /**
     * The meta object literal for the '{@link org.elascript.elascript.impl.ActionListImpl <em>Action List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elascript.elascript.impl.ActionListImpl
     * @see org.elascript.elascript.impl.ElascriptPackageImpl#getActionList()
     * @generated
     */
    EClass ACTION_LIST = eINSTANCE.getActionList();

    /**
     * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION_LIST__ACTIONS = eINSTANCE.getActionList_Actions();

    /**
     * The meta object literal for the '{@link org.elascript.elascript.impl.CommandImpl <em>Command</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elascript.elascript.impl.CommandImpl
     * @see org.elascript.elascript.impl.ElascriptPackageImpl#getCommand()
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
     * The meta object literal for the '<em><b>Params</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMAND__PARAMS = eINSTANCE.getCommand_Params();

    /**
     * The meta object literal for the '{@link org.elascript.elascript.impl.ParamListImpl <em>Param List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elascript.elascript.impl.ParamListImpl
     * @see org.elascript.elascript.impl.ElascriptPackageImpl#getParamList()
     * @generated
     */
    EClass PARAM_LIST = eINSTANCE.getParamList();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAM_LIST__PARAMS = eINSTANCE.getParamList_Params();

  }

} //ElascriptPackage
