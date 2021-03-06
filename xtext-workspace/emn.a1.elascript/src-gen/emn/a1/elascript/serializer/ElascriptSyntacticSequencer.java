package emn.a1.elascript.serializer;

import com.google.inject.Inject;
import emn.a1.elascript.services.ElascriptGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class ElascriptSyntacticSequencer extends AbstractSyntacticSequencer {

	protected ElascriptGrammarAccess grammarAccess;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (ElascriptGrammarAccess) access;
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getCOMMARule())
			return getCOMMAToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getLPRule())
			return getLPToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getPARALLEL_SEPARATORRule())
			return getPARALLEL_SEPARATORToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getRPRule())
			return getRPToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getSEQUENTIAL_SEPARATORRule())
			return getSEQUENTIAL_SEPARATORToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal COMMA : ',';
	 */
	protected String getCOMMAToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ",";
	}
	
	/**
	 * terminal LP : '(';
	 */
	protected String getLPToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "(";
	}
	
	/**
	 * terminal PARALLEL_SEPARATOR : '||';
	 */
	protected String getPARALLEL_SEPARATORToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "||";
	}
	
	/**
	 * terminal RP : ')';
	 */
	protected String getRPToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ")";
	}
	
	/**
	 * terminal SEQUENTIAL_SEPARATOR : ';';
	 */
	protected String getSEQUENTIAL_SEPARATORToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ";";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

}
