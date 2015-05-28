/*
 * generated by Xtext
 */
package org.elascript.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
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
import org.elascript.elascript.Command;
import org.elascript.elascript.EList;
import org.elascript.elascript.ElascriptPackage;
import org.elascript.elascript.ParallelBody;
import org.elascript.elascript.Param;
import org.elascript.elascript.Script;
import org.elascript.services.ElascriptGrammarAccess;

@SuppressWarnings("all")
public class ElascriptSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ElascriptGrammarAccess grammarAccess;
	
	@Override
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ElascriptPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ElascriptPackage.COMMAND:
				sequence_Command(context, (Command) semanticObject); 
				return; 
			case ElascriptPackage.ELIST:
				sequence_StatementList(context, (EList) semanticObject); 
				return; 
			case ElascriptPackage.PARALLEL_BODY:
				if(context == grammarAccess.getParallelBodyRule()) {
					sequence_ParallelBody(context, (ParallelBody) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getParallelRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_Parallel_ParallelBody(context, (ParallelBody) semanticObject); 
					return; 
				}
				else break;
			case ElascriptPackage.PARAM:
				sequence_Param(context, (Param) semanticObject); 
				return; 
			case ElascriptPackage.SCRIPT:
				sequence_Script(context, (Script) semanticObject); 
				return; 
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=FUNCTION_NAME params+=Param params+=Param*)
	 */
	protected void sequence_Command(EObject context, Command semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (statements+=StatementList statements+=StatementList+)
	 */
	protected void sequence_ParallelBody(EObject context, ParallelBody semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (statements+=StatementList statements+=StatementList+ name=JOIN)
	 */
	protected void sequence_Parallel_ParallelBody(EObject context, ParallelBody semanticObject) {
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
	 *     scriptStatements+=Statement*
	 */
	protected void sequence_Script(EObject context, Script semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     statements+=Statement+
	 */
	protected void sequence_StatementList(EObject context, EList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
