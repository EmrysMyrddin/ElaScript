/**
 */
package emn.a1.elascript.elascript;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see emn.a1.elascript.elascript.ElascriptPackage
 * @generated
 */
public interface ElascriptFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ElascriptFactory eINSTANCE = emn.a1.elascript.elascript.impl.ElascriptFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Script</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Script</em>'.
   * @generated
   */
  Script createScript();

  /**
   * Returns a new object of class '<em>Begin Script</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Begin Script</em>'.
   * @generated
   */
  BeginScript createBeginScript();

  /**
   * Returns a new object of class '<em>End Script</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>End Script</em>'.
   * @generated
   */
  EndScript createEndScript();

  /**
   * Returns a new object of class '<em>Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Statement</em>'.
   * @generated
   */
  Statement createStatement();

  /**
   * Returns a new object of class '<em>Parallel</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parallel</em>'.
   * @generated
   */
  Parallel createParallel();

  /**
   * Returns a new object of class '<em>Begin Parallel</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Begin Parallel</em>'.
   * @generated
   */
  BeginParallel createBeginParallel();

  /**
   * Returns a new object of class '<em>End Parallel</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>End Parallel</em>'.
   * @generated
   */
  EndParallel createEndParallel();

  /**
   * Returns a new object of class '<em>Statement List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Statement List</em>'.
   * @generated
   */
  StatementList createStatementList();

  /**
   * Returns a new object of class '<em>Command</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Command</em>'.
   * @generated
   */
  Command createCommand();

  /**
   * Returns a new object of class '<em>Scale Function</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Scale Function</em>'.
   * @generated
   */
  ScaleFunction createScaleFunction();

  /**
   * Returns a new object of class '<em>Wait Function</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Wait Function</em>'.
   * @generated
   */
  WaitFunction createWaitFunction();

  /**
   * Returns a new object of class '<em>Generic Function</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Generic Function</em>'.
   * @generated
   */
  GenericFunction createGenericFunction();

  /**
   * Returns a new object of class '<em>Scale In Infra</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Scale In Infra</em>'.
   * @generated
   */
  ScaleInInfra createScaleInInfra();

  /**
   * Returns a new object of class '<em>Scale Out Infra</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Scale Out Infra</em>'.
   * @generated
   */
  ScaleOutInfra createScaleOutInfra();

  /**
   * Returns a new object of class '<em>Scale Up Infra</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Scale Up Infra</em>'.
   * @generated
   */
  ScaleUpInfra createScaleUpInfra();

  /**
   * Returns a new object of class '<em>Scale Down Infra</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Scale Down Infra</em>'.
   * @generated
   */
  ScaleDownInfra createScaleDownInfra();

  /**
   * Returns a new object of class '<em>Scale In Soft</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Scale In Soft</em>'.
   * @generated
   */
  ScaleInSoft createScaleInSoft();

  /**
   * Returns a new object of class '<em>Scale Out Soft</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Scale Out Soft</em>'.
   * @generated
   */
  ScaleOutSoft createScaleOutSoft();

  /**
   * Returns a new object of class '<em>Scale Up Soft</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Scale Up Soft</em>'.
   * @generated
   */
  ScaleUpSoft createScaleUpSoft();

  /**
   * Returns a new object of class '<em>Scale Down Soft</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Scale Down Soft</em>'.
   * @generated
   */
  ScaleDownSoft createScaleDownSoft();

  /**
   * Returns a new object of class '<em>Param</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Param</em>'.
   * @generated
   */
  Param createParam();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  ElascriptPackage getElascriptPackage();

} //ElascriptFactory
