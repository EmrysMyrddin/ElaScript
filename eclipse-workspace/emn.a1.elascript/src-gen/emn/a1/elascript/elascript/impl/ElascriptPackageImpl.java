/**
 */
package emn.a1.elascript.elascript.impl;

import emn.a1.elascript.elascript.BeginParallel;
import emn.a1.elascript.elascript.BeginScript;
import emn.a1.elascript.elascript.Command;
import emn.a1.elascript.elascript.ElascriptFactory;
import emn.a1.elascript.elascript.ElascriptPackage;
import emn.a1.elascript.elascript.EndParallel;
import emn.a1.elascript.elascript.EndScript;
import emn.a1.elascript.elascript.GenericFunction;
import emn.a1.elascript.elascript.Parallel;
import emn.a1.elascript.elascript.Param;
import emn.a1.elascript.elascript.ScaleDownInfra;
import emn.a1.elascript.elascript.ScaleDownSoft;
import emn.a1.elascript.elascript.ScaleFunction;
import emn.a1.elascript.elascript.ScaleInInfra;
import emn.a1.elascript.elascript.ScaleInSoft;
import emn.a1.elascript.elascript.ScaleOutInfra;
import emn.a1.elascript.elascript.ScaleOutSoft;
import emn.a1.elascript.elascript.ScaleUpInfra;
import emn.a1.elascript.elascript.ScaleUpSoft;
import emn.a1.elascript.elascript.Script;
import emn.a1.elascript.elascript.Statement;
import emn.a1.elascript.elascript.StatementList;
import emn.a1.elascript.elascript.WaitFunction;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ElascriptPackageImpl extends EPackageImpl implements ElascriptPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass scriptEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass beginScriptEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass endScriptEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass statementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parallelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass beginParallelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass endParallelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass statementListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass commandEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass scaleFunctionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass waitFunctionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass genericFunctionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass scaleInInfraEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass scaleOutInfraEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass scaleUpInfraEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass scaleDownInfraEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass scaleInSoftEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass scaleOutSoftEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass scaleUpSoftEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass scaleDownSoftEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass paramEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see emn.a1.elascript.elascript.ElascriptPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private ElascriptPackageImpl()
  {
    super(eNS_URI, ElascriptFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link ElascriptPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static ElascriptPackage init()
  {
    if (isInited) return (ElascriptPackage)EPackage.Registry.INSTANCE.getEPackage(ElascriptPackage.eNS_URI);

    // Obtain or create and register package
    ElascriptPackageImpl theElascriptPackage = (ElascriptPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ElascriptPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ElascriptPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theElascriptPackage.createPackageContents();

    // Initialize created meta-data
    theElascriptPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theElascriptPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(ElascriptPackage.eNS_URI, theElascriptPackage);
    return theElascriptPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getScript()
  {
    return scriptEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getScript_BeginScript()
  {
    return (EReference)scriptEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getScript_ScriptStatement()
  {
    return (EReference)scriptEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getScript_EndScript()
  {
    return (EReference)scriptEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBeginScript()
  {
    return beginScriptEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBeginScript_Name()
  {
    return (EAttribute)beginScriptEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEndScript()
  {
    return endScriptEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEndScript_Name()
  {
    return (EAttribute)endScriptEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStatement()
  {
    return statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParallel()
  {
    return parallelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParallel_BeginParallel()
  {
    return (EReference)parallelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParallel_StatementLists()
  {
    return (EReference)parallelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParallel_EndParallel()
  {
    return (EReference)parallelEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBeginParallel()
  {
    return beginParallelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBeginParallel_Name()
  {
    return (EAttribute)beginParallelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEndParallel()
  {
    return endParallelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEndParallel_Name()
  {
    return (EAttribute)endParallelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStatementList()
  {
    return statementListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatementList_Statements()
  {
    return (EReference)statementListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCommand()
  {
    return commandEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCommand_Params()
  {
    return (EReference)commandEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCommand_Name()
  {
    return (EAttribute)commandEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getScaleFunction()
  {
    return scaleFunctionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWaitFunction()
  {
    return waitFunctionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGenericFunction()
  {
    return genericFunctionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getScaleInInfra()
  {
    return scaleInInfraEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getScaleOutInfra()
  {
    return scaleOutInfraEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getScaleUpInfra()
  {
    return scaleUpInfraEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getScaleDownInfra()
  {
    return scaleDownInfraEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getScaleInSoft()
  {
    return scaleInSoftEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getScaleOutSoft()
  {
    return scaleOutSoftEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getScaleUpSoft()
  {
    return scaleUpSoftEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getScaleDownSoft()
  {
    return scaleDownSoftEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParam()
  {
    return paramEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParam_Value()
  {
    return (EAttribute)paramEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElascriptFactory getElascriptFactory()
  {
    return (ElascriptFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    scriptEClass = createEClass(SCRIPT);
    createEReference(scriptEClass, SCRIPT__BEGIN_SCRIPT);
    createEReference(scriptEClass, SCRIPT__SCRIPT_STATEMENT);
    createEReference(scriptEClass, SCRIPT__END_SCRIPT);

    beginScriptEClass = createEClass(BEGIN_SCRIPT);
    createEAttribute(beginScriptEClass, BEGIN_SCRIPT__NAME);

    endScriptEClass = createEClass(END_SCRIPT);
    createEAttribute(endScriptEClass, END_SCRIPT__NAME);

    statementEClass = createEClass(STATEMENT);

    parallelEClass = createEClass(PARALLEL);
    createEReference(parallelEClass, PARALLEL__BEGIN_PARALLEL);
    createEReference(parallelEClass, PARALLEL__STATEMENT_LISTS);
    createEReference(parallelEClass, PARALLEL__END_PARALLEL);

    beginParallelEClass = createEClass(BEGIN_PARALLEL);
    createEAttribute(beginParallelEClass, BEGIN_PARALLEL__NAME);

    endParallelEClass = createEClass(END_PARALLEL);
    createEAttribute(endParallelEClass, END_PARALLEL__NAME);

    statementListEClass = createEClass(STATEMENT_LIST);
    createEReference(statementListEClass, STATEMENT_LIST__STATEMENTS);

    commandEClass = createEClass(COMMAND);
    createEReference(commandEClass, COMMAND__PARAMS);
    createEAttribute(commandEClass, COMMAND__NAME);

    scaleFunctionEClass = createEClass(SCALE_FUNCTION);

    waitFunctionEClass = createEClass(WAIT_FUNCTION);

    genericFunctionEClass = createEClass(GENERIC_FUNCTION);

    scaleInInfraEClass = createEClass(SCALE_IN_INFRA);

    scaleOutInfraEClass = createEClass(SCALE_OUT_INFRA);

    scaleUpInfraEClass = createEClass(SCALE_UP_INFRA);

    scaleDownInfraEClass = createEClass(SCALE_DOWN_INFRA);

    scaleInSoftEClass = createEClass(SCALE_IN_SOFT);

    scaleOutSoftEClass = createEClass(SCALE_OUT_SOFT);

    scaleUpSoftEClass = createEClass(SCALE_UP_SOFT);

    scaleDownSoftEClass = createEClass(SCALE_DOWN_SOFT);

    paramEClass = createEClass(PARAM);
    createEAttribute(paramEClass, PARAM__VALUE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    parallelEClass.getESuperTypes().add(this.getStatement());
    commandEClass.getESuperTypes().add(this.getStatement());
    scaleFunctionEClass.getESuperTypes().add(this.getCommand());
    waitFunctionEClass.getESuperTypes().add(this.getCommand());
    genericFunctionEClass.getESuperTypes().add(this.getCommand());
    scaleInInfraEClass.getESuperTypes().add(this.getScaleFunction());
    scaleOutInfraEClass.getESuperTypes().add(this.getScaleFunction());
    scaleUpInfraEClass.getESuperTypes().add(this.getScaleFunction());
    scaleDownInfraEClass.getESuperTypes().add(this.getScaleFunction());
    scaleInSoftEClass.getESuperTypes().add(this.getScaleFunction());
    scaleOutSoftEClass.getESuperTypes().add(this.getScaleFunction());
    scaleUpSoftEClass.getESuperTypes().add(this.getScaleFunction());
    scaleDownSoftEClass.getESuperTypes().add(this.getScaleFunction());

    // Initialize classes and features; add operations and parameters
    initEClass(scriptEClass, Script.class, "Script", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getScript_BeginScript(), this.getBeginScript(), null, "BeginScript", null, 0, 1, Script.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getScript_ScriptStatement(), this.getStatementList(), null, "scriptStatement", null, 0, 1, Script.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getScript_EndScript(), this.getEndScript(), null, "EndScript", null, 0, 1, Script.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(beginScriptEClass, BeginScript.class, "BeginScript", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBeginScript_Name(), ecorePackage.getEString(), "name", null, 0, 1, BeginScript.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(endScriptEClass, EndScript.class, "EndScript", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEndScript_Name(), ecorePackage.getEString(), "name", null, 0, 1, EndScript.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(statementEClass, Statement.class, "Statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(parallelEClass, Parallel.class, "Parallel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getParallel_BeginParallel(), this.getBeginParallel(), null, "BeginParallel", null, 0, 1, Parallel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getParallel_StatementLists(), this.getStatementList(), null, "statementLists", null, 0, -1, Parallel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getParallel_EndParallel(), this.getEndParallel(), null, "EndParallel", null, 0, 1, Parallel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(beginParallelEClass, BeginParallel.class, "BeginParallel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBeginParallel_Name(), ecorePackage.getEString(), "name", null, 0, 1, BeginParallel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(endParallelEClass, EndParallel.class, "EndParallel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEndParallel_Name(), ecorePackage.getEString(), "name", null, 0, 1, EndParallel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(statementListEClass, StatementList.class, "StatementList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStatementList_Statements(), this.getStatement(), null, "statements", null, 0, -1, StatementList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(commandEClass, Command.class, "Command", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCommand_Params(), this.getParam(), null, "params", null, 0, -1, Command.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCommand_Name(), ecorePackage.getEString(), "name", null, 0, 1, Command.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(scaleFunctionEClass, ScaleFunction.class, "ScaleFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(waitFunctionEClass, WaitFunction.class, "WaitFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(genericFunctionEClass, GenericFunction.class, "GenericFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(scaleInInfraEClass, ScaleInInfra.class, "ScaleInInfra", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(scaleOutInfraEClass, ScaleOutInfra.class, "ScaleOutInfra", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(scaleUpInfraEClass, ScaleUpInfra.class, "ScaleUpInfra", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(scaleDownInfraEClass, ScaleDownInfra.class, "ScaleDownInfra", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(scaleInSoftEClass, ScaleInSoft.class, "ScaleInSoft", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(scaleOutSoftEClass, ScaleOutSoft.class, "ScaleOutSoft", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(scaleUpSoftEClass, ScaleUpSoft.class, "ScaleUpSoft", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(scaleDownSoftEClass, ScaleDownSoft.class, "ScaleDownSoft", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(paramEClass, Param.class, "Param", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getParam_Value(), ecorePackage.getEInt(), "value", null, 0, 1, Param.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //ElascriptPackageImpl
