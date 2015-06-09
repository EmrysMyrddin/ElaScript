package emn.a1.elascript.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import emn.a1.elascript.elascript.BeginParallel;
import emn.a1.elascript.elascript.BeginScript;
import emn.a1.elascript.elascript.ElascriptPackage;
import emn.a1.elascript.elascript.EndParallel;
import emn.a1.elascript.elascript.EndScript;
import emn.a1.elascript.elascript.GenericFunction;
import emn.a1.elascript.elascript.Parallel;
import emn.a1.elascript.elascript.Param;
import emn.a1.elascript.elascript.ScaleDownInfra;
import emn.a1.elascript.elascript.ScaleDownSoft;
import emn.a1.elascript.elascript.ScaleInInfra;
import emn.a1.elascript.elascript.ScaleInSoft;
import emn.a1.elascript.elascript.ScaleOutInfra;
import emn.a1.elascript.elascript.ScaleOutSoft;
import emn.a1.elascript.elascript.ScaleUpInfra;
import emn.a1.elascript.elascript.ScaleUpSoft;
import emn.a1.elascript.elascript.Script;
import emn.a1.elascript.elascript.StatementList;
import emn.a1.elascript.elascript.WaitFunction;
import emn.a1.elascript.services.ElascriptGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class ElascriptSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ElascriptGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ElascriptPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ElascriptPackage.BEGIN_PARALLEL:
				if(context == grammarAccess.getBeginParallelRule()) {
					sequence_BeginParallel(context, (BeginParallel) semanticObject); 
					return; 
				}
				else break;
			case ElascriptPackage.BEGIN_SCRIPT:
				if(context == grammarAccess.getBeginScriptRule()) {
					sequence_BeginScript(context, (BeginScript) semanticObject); 
					return; 
				}
				else break;
			case ElascriptPackage.END_PARALLEL:
				if(context == grammarAccess.getEndParallelRule()) {
					sequence_EndParallel(context, (EndParallel) semanticObject); 
					return; 
				}
				else break;
			case ElascriptPackage.END_SCRIPT:
				if(context == grammarAccess.getEndScriptRule()) {
					sequence_EndScript(context, (EndScript) semanticObject); 
					return; 
				}
				else break;
			case ElascriptPackage.GENERIC_FUNCTION:
				if(context == grammarAccess.getCommandRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_Command_GenericFunction(context, (GenericFunction) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getGenericFunctionRule()) {
					sequence_GenericFunction(context, (GenericFunction) semanticObject); 
					return; 
				}
				else break;
			case ElascriptPackage.PARALLEL:
				if(context == grammarAccess.getParallelRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_Parallel(context, (Parallel) semanticObject); 
					return; 
				}
				else break;
			case ElascriptPackage.PARAM:
				if(context == grammarAccess.getParamRule()) {
					sequence_Param(context, (Param) semanticObject); 
					return; 
				}
				else break;
			case ElascriptPackage.SCALE_DOWN_INFRA:
				if(context == grammarAccess.getCommandRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_Command_ScaleDownInfra(context, (ScaleDownInfra) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getScaleDownInfraRule() ||
				   context == grammarAccess.getScaleFunctionRule()) {
					sequence_ScaleDownInfra(context, (ScaleDownInfra) semanticObject); 
					return; 
				}
				else break;
			case ElascriptPackage.SCALE_DOWN_SOFT:
				if(context == grammarAccess.getCommandRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_Command_ScaleDownSoft(context, (ScaleDownSoft) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getScaleDownSoftRule() ||
				   context == grammarAccess.getScaleFunctionRule()) {
					sequence_ScaleDownSoft(context, (ScaleDownSoft) semanticObject); 
					return; 
				}
				else break;
			case ElascriptPackage.SCALE_IN_INFRA:
				if(context == grammarAccess.getCommandRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_Command_ScaleInInfra(context, (ScaleInInfra) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getScaleFunctionRule() ||
				   context == grammarAccess.getScaleInInfraRule()) {
					sequence_ScaleInInfra(context, (ScaleInInfra) semanticObject); 
					return; 
				}
				else break;
			case ElascriptPackage.SCALE_IN_SOFT:
				if(context == grammarAccess.getCommandRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_Command_ScaleInSoft(context, (ScaleInSoft) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getScaleFunctionRule() ||
				   context == grammarAccess.getScaleInSoftRule()) {
					sequence_ScaleInSoft(context, (ScaleInSoft) semanticObject); 
					return; 
				}
				else break;
			case ElascriptPackage.SCALE_OUT_INFRA:
				if(context == grammarAccess.getCommandRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_Command_ScaleOutInfra(context, (ScaleOutInfra) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getScaleFunctionRule() ||
				   context == grammarAccess.getScaleOutInfraRule()) {
					sequence_ScaleOutInfra(context, (ScaleOutInfra) semanticObject); 
					return; 
				}
				else break;
			case ElascriptPackage.SCALE_OUT_SOFT:
				if(context == grammarAccess.getCommandRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_Command_ScaleOutSoft(context, (ScaleOutSoft) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getScaleFunctionRule() ||
				   context == grammarAccess.getScaleOutSoftRule()) {
					sequence_ScaleOutSoft(context, (ScaleOutSoft) semanticObject); 
					return; 
				}
				else break;
			case ElascriptPackage.SCALE_UP_INFRA:
				if(context == grammarAccess.getCommandRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_Command_ScaleUpInfra(context, (ScaleUpInfra) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getScaleFunctionRule() ||
				   context == grammarAccess.getScaleUpInfraRule()) {
					sequence_ScaleUpInfra(context, (ScaleUpInfra) semanticObject); 
					return; 
				}
				else break;
			case ElascriptPackage.SCALE_UP_SOFT:
				if(context == grammarAccess.getCommandRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_Command_ScaleUpSoft(context, (ScaleUpSoft) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getScaleFunctionRule() ||
				   context == grammarAccess.getScaleUpSoftRule()) {
					sequence_ScaleUpSoft(context, (ScaleUpSoft) semanticObject); 
					return; 
				}
				else break;
			case ElascriptPackage.SCRIPT:
				if(context == grammarAccess.getScriptRule()) {
					sequence_Script(context, (Script) semanticObject); 
					return; 
				}
				else break;
			case ElascriptPackage.STATEMENT_LIST:
				if(context == grammarAccess.getStatementListRule()) {
					sequence_StatementList(context, (StatementList) semanticObject); 
					return; 
				}
				else break;
			case ElascriptPackage.WAIT_FUNCTION:
				if(context == grammarAccess.getCommandRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_Command_WaitFunction(context, (WaitFunction) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getWaitFunctionRule()) {
					sequence_WaitFunction(context, (WaitFunction) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     name='['
	 */
	protected void sequence_BeginParallel(EObject context, BeginParallel semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ElascriptPackage.Literals.BEGIN_PARALLEL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ElascriptPackage.Literals.BEGIN_PARALLEL__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBeginParallelAccess().getNameLeftSquareBracketKeyword_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name='begin'
	 */
	protected void sequence_BeginScript(EObject context, BeginScript semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ElascriptPackage.Literals.BEGIN_SCRIPT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ElascriptPackage.Literals.BEGIN_SCRIPT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBeginScriptAccess().getNameBeginKeyword_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (params+=Param* params+=Param)?)
	 */
	protected void sequence_Command_GenericFunction(EObject context, GenericFunction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name='scaleDownInfra' (params+=Param* params+=Param)?)
	 */
	protected void sequence_Command_ScaleDownInfra(EObject context, ScaleDownInfra semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name='scaleDownSoft' (params+=Param* params+=Param)?)
	 */
	protected void sequence_Command_ScaleDownSoft(EObject context, ScaleDownSoft semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name='scaleInInfra' (params+=Param* params+=Param)?)
	 */
	protected void sequence_Command_ScaleInInfra(EObject context, ScaleInInfra semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name='scaleInSoft' (params+=Param* params+=Param)?)
	 */
	protected void sequence_Command_ScaleInSoft(EObject context, ScaleInSoft semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name='scaleOutInfra' (params+=Param* params+=Param)?)
	 */
	protected void sequence_Command_ScaleOutInfra(EObject context, ScaleOutInfra semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name='scaleOutSoft' (params+=Param* params+=Param)?)
	 */
	protected void sequence_Command_ScaleOutSoft(EObject context, ScaleOutSoft semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name='scaleUpInfra' (params+=Param* params+=Param)?)
	 */
	protected void sequence_Command_ScaleUpInfra(EObject context, ScaleUpInfra semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name='scaleUpSoft' (params+=Param* params+=Param)?)
	 */
	protected void sequence_Command_ScaleUpSoft(EObject context, ScaleUpSoft semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name='wait' (params+=Param* params+=Param)?)
	 */
	protected void sequence_Command_WaitFunction(EObject context, WaitFunction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=']'
	 */
	protected void sequence_EndParallel(EObject context, EndParallel semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ElascriptPackage.Literals.END_PARALLEL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ElascriptPackage.Literals.END_PARALLEL__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEndParallelAccess().getNameRightSquareBracketKeyword_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name='end'
	 */
	protected void sequence_EndScript(EObject context, EndScript semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ElascriptPackage.Literals.END_SCRIPT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ElascriptPackage.Literals.END_SCRIPT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEndScriptAccess().getNameEndKeyword_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_GenericFunction(EObject context, GenericFunction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (BeginParallel=BeginParallel statementLists+=StatementList statementLists+=StatementList+ EndParallel=EndParallel)
	 */
	protected void sequence_Parallel(EObject context, Parallel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_Param(EObject context, Param semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ElascriptPackage.Literals.PARAM__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ElascriptPackage.Literals.PARAM__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getParamAccess().getValueINTTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name='scaleDownInfra'
	 */
	protected void sequence_ScaleDownInfra(EObject context, ScaleDownInfra semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name='scaleDownSoft'
	 */
	protected void sequence_ScaleDownSoft(EObject context, ScaleDownSoft semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name='scaleInInfra'
	 */
	protected void sequence_ScaleInInfra(EObject context, ScaleInInfra semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name='scaleInSoft'
	 */
	protected void sequence_ScaleInSoft(EObject context, ScaleInSoft semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name='scaleOutInfra'
	 */
	protected void sequence_ScaleOutInfra(EObject context, ScaleOutInfra semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name='scaleOutSoft'
	 */
	protected void sequence_ScaleOutSoft(EObject context, ScaleOutSoft semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name='scaleUpInfra'
	 */
	protected void sequence_ScaleUpInfra(EObject context, ScaleUpInfra semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name='scaleUpSoft'
	 */
	protected void sequence_ScaleUpSoft(EObject context, ScaleUpSoft semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (BeginScript=BeginScript scriptStatement=StatementList EndScript=EndScript)
	 */
	protected void sequence_Script(EObject context, Script semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ElascriptPackage.Literals.SCRIPT__BEGIN_SCRIPT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ElascriptPackage.Literals.SCRIPT__BEGIN_SCRIPT));
			if(transientValues.isValueTransient(semanticObject, ElascriptPackage.Literals.SCRIPT__SCRIPT_STATEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ElascriptPackage.Literals.SCRIPT__SCRIPT_STATEMENT));
			if(transientValues.isValueTransient(semanticObject, ElascriptPackage.Literals.SCRIPT__END_SCRIPT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ElascriptPackage.Literals.SCRIPT__END_SCRIPT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getScriptAccess().getBeginScriptBeginScriptParserRuleCall_0_0(), semanticObject.getBeginScript());
		feeder.accept(grammarAccess.getScriptAccess().getScriptStatementStatementListParserRuleCall_1_0(), semanticObject.getScriptStatement());
		feeder.accept(grammarAccess.getScriptAccess().getEndScriptEndScriptParserRuleCall_2_0(), semanticObject.getEndScript());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     statements+=Statement+
	 */
	protected void sequence_StatementList(EObject context, StatementList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name='wait'
	 */
	protected void sequence_WaitFunction(EObject context, WaitFunction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
