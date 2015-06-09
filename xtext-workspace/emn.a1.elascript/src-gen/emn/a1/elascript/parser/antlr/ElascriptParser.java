/*
* generated by Xtext
*/
package emn.a1.elascript.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import emn.a1.elascript.services.ElascriptGrammarAccess;

public class ElascriptParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private ElascriptGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected emn.a1.elascript.parser.antlr.internal.InternalElascriptParser createParser(XtextTokenStream stream) {
		return new emn.a1.elascript.parser.antlr.internal.InternalElascriptParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Script";
	}
	
	public ElascriptGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(ElascriptGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}