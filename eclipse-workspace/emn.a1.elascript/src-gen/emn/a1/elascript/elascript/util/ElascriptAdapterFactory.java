/**
 */
package emn.a1.elascript.elascript.util;

import emn.a1.elascript.elascript.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see emn.a1.elascript.elascript.ElascriptPackage
 * @generated
 */
public class ElascriptAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ElascriptPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElascriptAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = ElascriptPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ElascriptSwitch<Adapter> modelSwitch =
    new ElascriptSwitch<Adapter>()
    {
      @Override
      public Adapter caseScript(Script object)
      {
        return createScriptAdapter();
      }
      @Override
      public Adapter caseBeginScript(BeginScript object)
      {
        return createBeginScriptAdapter();
      }
      @Override
      public Adapter caseEndScript(EndScript object)
      {
        return createEndScriptAdapter();
      }
      @Override
      public Adapter caseStatement(Statement object)
      {
        return createStatementAdapter();
      }
      @Override
      public Adapter caseParallel(Parallel object)
      {
        return createParallelAdapter();
      }
      @Override
      public Adapter caseBeginParallel(BeginParallel object)
      {
        return createBeginParallelAdapter();
      }
      @Override
      public Adapter caseEndParallel(EndParallel object)
      {
        return createEndParallelAdapter();
      }
      @Override
      public Adapter caseStatementList(StatementList object)
      {
        return createStatementListAdapter();
      }
      @Override
      public Adapter caseCommand(Command object)
      {
        return createCommandAdapter();
      }
      @Override
      public Adapter caseScaleFunction(ScaleFunction object)
      {
        return createScaleFunctionAdapter();
      }
      @Override
      public Adapter caseWaitFunction(WaitFunction object)
      {
        return createWaitFunctionAdapter();
      }
      @Override
      public Adapter caseGenericFunction(GenericFunction object)
      {
        return createGenericFunctionAdapter();
      }
      @Override
      public Adapter caseScaleInInfra(ScaleInInfra object)
      {
        return createScaleInInfraAdapter();
      }
      @Override
      public Adapter caseScaleOutInfra(ScaleOutInfra object)
      {
        return createScaleOutInfraAdapter();
      }
      @Override
      public Adapter caseScaleUpInfra(ScaleUpInfra object)
      {
        return createScaleUpInfraAdapter();
      }
      @Override
      public Adapter caseScaleDownInfra(ScaleDownInfra object)
      {
        return createScaleDownInfraAdapter();
      }
      @Override
      public Adapter caseScaleInSoft(ScaleInSoft object)
      {
        return createScaleInSoftAdapter();
      }
      @Override
      public Adapter caseScaleOutSoft(ScaleOutSoft object)
      {
        return createScaleOutSoftAdapter();
      }
      @Override
      public Adapter caseScaleUpSoft(ScaleUpSoft object)
      {
        return createScaleUpSoftAdapter();
      }
      @Override
      public Adapter caseScaleDownSoft(ScaleDownSoft object)
      {
        return createScaleDownSoftAdapter();
      }
      @Override
      public Adapter caseParam(Param object)
      {
        return createParamAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link emn.a1.elascript.elascript.Script <em>Script</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see emn.a1.elascript.elascript.Script
   * @generated
   */
  public Adapter createScriptAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link emn.a1.elascript.elascript.BeginScript <em>Begin Script</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see emn.a1.elascript.elascript.BeginScript
   * @generated
   */
  public Adapter createBeginScriptAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link emn.a1.elascript.elascript.EndScript <em>End Script</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see emn.a1.elascript.elascript.EndScript
   * @generated
   */
  public Adapter createEndScriptAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link emn.a1.elascript.elascript.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see emn.a1.elascript.elascript.Statement
   * @generated
   */
  public Adapter createStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link emn.a1.elascript.elascript.Parallel <em>Parallel</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see emn.a1.elascript.elascript.Parallel
   * @generated
   */
  public Adapter createParallelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link emn.a1.elascript.elascript.BeginParallel <em>Begin Parallel</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see emn.a1.elascript.elascript.BeginParallel
   * @generated
   */
  public Adapter createBeginParallelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link emn.a1.elascript.elascript.EndParallel <em>End Parallel</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see emn.a1.elascript.elascript.EndParallel
   * @generated
   */
  public Adapter createEndParallelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link emn.a1.elascript.elascript.StatementList <em>Statement List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see emn.a1.elascript.elascript.StatementList
   * @generated
   */
  public Adapter createStatementListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link emn.a1.elascript.elascript.Command <em>Command</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see emn.a1.elascript.elascript.Command
   * @generated
   */
  public Adapter createCommandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link emn.a1.elascript.elascript.ScaleFunction <em>Scale Function</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see emn.a1.elascript.elascript.ScaleFunction
   * @generated
   */
  public Adapter createScaleFunctionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link emn.a1.elascript.elascript.WaitFunction <em>Wait Function</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see emn.a1.elascript.elascript.WaitFunction
   * @generated
   */
  public Adapter createWaitFunctionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link emn.a1.elascript.elascript.GenericFunction <em>Generic Function</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see emn.a1.elascript.elascript.GenericFunction
   * @generated
   */
  public Adapter createGenericFunctionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link emn.a1.elascript.elascript.ScaleInInfra <em>Scale In Infra</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see emn.a1.elascript.elascript.ScaleInInfra
   * @generated
   */
  public Adapter createScaleInInfraAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link emn.a1.elascript.elascript.ScaleOutInfra <em>Scale Out Infra</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see emn.a1.elascript.elascript.ScaleOutInfra
   * @generated
   */
  public Adapter createScaleOutInfraAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link emn.a1.elascript.elascript.ScaleUpInfra <em>Scale Up Infra</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see emn.a1.elascript.elascript.ScaleUpInfra
   * @generated
   */
  public Adapter createScaleUpInfraAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link emn.a1.elascript.elascript.ScaleDownInfra <em>Scale Down Infra</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see emn.a1.elascript.elascript.ScaleDownInfra
   * @generated
   */
  public Adapter createScaleDownInfraAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link emn.a1.elascript.elascript.ScaleInSoft <em>Scale In Soft</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see emn.a1.elascript.elascript.ScaleInSoft
   * @generated
   */
  public Adapter createScaleInSoftAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link emn.a1.elascript.elascript.ScaleOutSoft <em>Scale Out Soft</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see emn.a1.elascript.elascript.ScaleOutSoft
   * @generated
   */
  public Adapter createScaleOutSoftAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link emn.a1.elascript.elascript.ScaleUpSoft <em>Scale Up Soft</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see emn.a1.elascript.elascript.ScaleUpSoft
   * @generated
   */
  public Adapter createScaleUpSoftAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link emn.a1.elascript.elascript.ScaleDownSoft <em>Scale Down Soft</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see emn.a1.elascript.elascript.ScaleDownSoft
   * @generated
   */
  public Adapter createScaleDownSoftAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link emn.a1.elascript.elascript.Param <em>Param</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see emn.a1.elascript.elascript.Param
   * @generated
   */
  public Adapter createParamAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //ElascriptAdapterFactory
