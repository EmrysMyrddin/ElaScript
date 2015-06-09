/**
 */
package emn.a1.elascript.elascript.util;

import emn.a1.elascript.elascript.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see emn.a1.elascript.elascript.ElascriptPackage
 * @generated
 */
public class ElascriptSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ElascriptPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElascriptSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = ElascriptPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case ElascriptPackage.SCRIPT:
      {
        Script script = (Script)theEObject;
        T result = caseScript(script);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ElascriptPackage.BEGIN_SCRIPT:
      {
        BeginScript beginScript = (BeginScript)theEObject;
        T result = caseBeginScript(beginScript);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ElascriptPackage.END_SCRIPT:
      {
        EndScript endScript = (EndScript)theEObject;
        T result = caseEndScript(endScript);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ElascriptPackage.STATEMENT:
      {
        Statement statement = (Statement)theEObject;
        T result = caseStatement(statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ElascriptPackage.PARALLEL:
      {
        Parallel parallel = (Parallel)theEObject;
        T result = caseParallel(parallel);
        if (result == null) result = caseStatement(parallel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ElascriptPackage.BEGIN_PARALLEL:
      {
        BeginParallel beginParallel = (BeginParallel)theEObject;
        T result = caseBeginParallel(beginParallel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ElascriptPackage.END_PARALLEL:
      {
        EndParallel endParallel = (EndParallel)theEObject;
        T result = caseEndParallel(endParallel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ElascriptPackage.STATEMENT_LIST:
      {
        StatementList statementList = (StatementList)theEObject;
        T result = caseStatementList(statementList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ElascriptPackage.COMMAND:
      {
        Command command = (Command)theEObject;
        T result = caseCommand(command);
        if (result == null) result = caseStatement(command);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ElascriptPackage.SCALE_FUNCTION:
      {
        ScaleFunction scaleFunction = (ScaleFunction)theEObject;
        T result = caseScaleFunction(scaleFunction);
        if (result == null) result = caseCommand(scaleFunction);
        if (result == null) result = caseStatement(scaleFunction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ElascriptPackage.WAIT_FUNCTION:
      {
        WaitFunction waitFunction = (WaitFunction)theEObject;
        T result = caseWaitFunction(waitFunction);
        if (result == null) result = caseCommand(waitFunction);
        if (result == null) result = caseStatement(waitFunction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ElascriptPackage.GENERIC_FUNCTION:
      {
        GenericFunction genericFunction = (GenericFunction)theEObject;
        T result = caseGenericFunction(genericFunction);
        if (result == null) result = caseCommand(genericFunction);
        if (result == null) result = caseStatement(genericFunction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ElascriptPackage.SCALE_IN_INFRA:
      {
        ScaleInInfra scaleInInfra = (ScaleInInfra)theEObject;
        T result = caseScaleInInfra(scaleInInfra);
        if (result == null) result = caseScaleFunction(scaleInInfra);
        if (result == null) result = caseCommand(scaleInInfra);
        if (result == null) result = caseStatement(scaleInInfra);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ElascriptPackage.SCALE_OUT_INFRA:
      {
        ScaleOutInfra scaleOutInfra = (ScaleOutInfra)theEObject;
        T result = caseScaleOutInfra(scaleOutInfra);
        if (result == null) result = caseScaleFunction(scaleOutInfra);
        if (result == null) result = caseCommand(scaleOutInfra);
        if (result == null) result = caseStatement(scaleOutInfra);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ElascriptPackage.SCALE_UP_INFRA:
      {
        ScaleUpInfra scaleUpInfra = (ScaleUpInfra)theEObject;
        T result = caseScaleUpInfra(scaleUpInfra);
        if (result == null) result = caseScaleFunction(scaleUpInfra);
        if (result == null) result = caseCommand(scaleUpInfra);
        if (result == null) result = caseStatement(scaleUpInfra);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ElascriptPackage.SCALE_DOWN_INFRA:
      {
        ScaleDownInfra scaleDownInfra = (ScaleDownInfra)theEObject;
        T result = caseScaleDownInfra(scaleDownInfra);
        if (result == null) result = caseScaleFunction(scaleDownInfra);
        if (result == null) result = caseCommand(scaleDownInfra);
        if (result == null) result = caseStatement(scaleDownInfra);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ElascriptPackage.SCALE_IN_SOFT:
      {
        ScaleInSoft scaleInSoft = (ScaleInSoft)theEObject;
        T result = caseScaleInSoft(scaleInSoft);
        if (result == null) result = caseScaleFunction(scaleInSoft);
        if (result == null) result = caseCommand(scaleInSoft);
        if (result == null) result = caseStatement(scaleInSoft);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ElascriptPackage.SCALE_OUT_SOFT:
      {
        ScaleOutSoft scaleOutSoft = (ScaleOutSoft)theEObject;
        T result = caseScaleOutSoft(scaleOutSoft);
        if (result == null) result = caseScaleFunction(scaleOutSoft);
        if (result == null) result = caseCommand(scaleOutSoft);
        if (result == null) result = caseStatement(scaleOutSoft);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ElascriptPackage.SCALE_UP_SOFT:
      {
        ScaleUpSoft scaleUpSoft = (ScaleUpSoft)theEObject;
        T result = caseScaleUpSoft(scaleUpSoft);
        if (result == null) result = caseScaleFunction(scaleUpSoft);
        if (result == null) result = caseCommand(scaleUpSoft);
        if (result == null) result = caseStatement(scaleUpSoft);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ElascriptPackage.SCALE_DOWN_SOFT:
      {
        ScaleDownSoft scaleDownSoft = (ScaleDownSoft)theEObject;
        T result = caseScaleDownSoft(scaleDownSoft);
        if (result == null) result = caseScaleFunction(scaleDownSoft);
        if (result == null) result = caseCommand(scaleDownSoft);
        if (result == null) result = caseStatement(scaleDownSoft);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ElascriptPackage.PARAM:
      {
        Param param = (Param)theEObject;
        T result = caseParam(param);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Script</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Script</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScript(Script object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Begin Script</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Begin Script</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBeginScript(BeginScript object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>End Script</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>End Script</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEndScript(EndScript object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStatement(Statement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parallel</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parallel</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParallel(Parallel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Begin Parallel</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Begin Parallel</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBeginParallel(BeginParallel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>End Parallel</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>End Parallel</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEndParallel(EndParallel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Statement List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Statement List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStatementList(StatementList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Command</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Command</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCommand(Command object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Scale Function</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Scale Function</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScaleFunction(ScaleFunction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Wait Function</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Wait Function</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWaitFunction(WaitFunction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Generic Function</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Generic Function</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGenericFunction(GenericFunction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Scale In Infra</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Scale In Infra</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScaleInInfra(ScaleInInfra object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Scale Out Infra</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Scale Out Infra</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScaleOutInfra(ScaleOutInfra object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Scale Up Infra</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Scale Up Infra</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScaleUpInfra(ScaleUpInfra object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Scale Down Infra</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Scale Down Infra</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScaleDownInfra(ScaleDownInfra object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Scale In Soft</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Scale In Soft</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScaleInSoft(ScaleInSoft object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Scale Out Soft</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Scale Out Soft</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScaleOutSoft(ScaleOutSoft object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Scale Up Soft</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Scale Up Soft</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScaleUpSoft(ScaleUpSoft object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Scale Down Soft</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Scale Down Soft</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScaleDownSoft(ScaleDownSoft object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Param</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Param</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParam(Param object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //ElascriptSwitch
