package emn.a1.elascript.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import emn.a1.elascript.services.ElascriptGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalElascriptParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_PARALLEL_SEPARATOR", "RULE_ID", "RULE_LP", "RULE_COMMA", "RULE_RP", "RULE_SEQUENTIAL_SEPARATOR", "RULE_INT", "RULE_LETTER", "RULE_NUMBER", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'begin'", "'end'", "'['", "']'"
    };
    public static final int RULE_SEQUENTIAL_SEPARATOR=9;
    public static final int RULE_STRING=13;
    public static final int RULE_SL_COMMENT=15;
    public static final int T__19=19;
    public static final int T__18=18;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_COMMA=7;
    public static final int RULE_WS=16;
    public static final int RULE_PARALLEL_SEPARATOR=4;
    public static final int RULE_ANY_OTHER=17;
    public static final int RULE_NUMBER=12;
    public static final int RULE_LETTER=11;
    public static final int RULE_INT=10;
    public static final int RULE_ML_COMMENT=14;
    public static final int RULE_RP=8;
    public static final int RULE_LP=6;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalElascriptParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalElascriptParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalElascriptParser.tokenNames; }
    public String getGrammarFileName() { return "../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g"; }



     	private ElascriptGrammarAccess grammarAccess;
     	
        public InternalElascriptParser(TokenStream input, ElascriptGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Script";	
       	}
       	
       	@Override
       	protected ElascriptGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleScript"
    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:67:1: entryRuleScript returns [EObject current=null] : iv_ruleScript= ruleScript EOF ;
    public final EObject entryRuleScript() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScript = null;


        try {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:68:2: (iv_ruleScript= ruleScript EOF )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:69:2: iv_ruleScript= ruleScript EOF
            {
             newCompositeNode(grammarAccess.getScriptRule()); 
            pushFollow(FOLLOW_ruleScript_in_entryRuleScript75);
            iv_ruleScript=ruleScript();

            state._fsp--;

             current =iv_ruleScript; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScript85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScript"


    // $ANTLR start "ruleScript"
    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:76:1: ruleScript returns [EObject current=null] : ( ( (lv_BeginScript_0_0= ruleBeginScript ) ) ( (lv_scriptStatement_1_0= ruleStatementList ) ) ( (lv_EndScript_2_0= ruleEndScript ) ) ) ;
    public final EObject ruleScript() throws RecognitionException {
        EObject current = null;

        EObject lv_BeginScript_0_0 = null;

        EObject lv_scriptStatement_1_0 = null;

        EObject lv_EndScript_2_0 = null;


         enterRule(); 
            
        try {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:79:28: ( ( ( (lv_BeginScript_0_0= ruleBeginScript ) ) ( (lv_scriptStatement_1_0= ruleStatementList ) ) ( (lv_EndScript_2_0= ruleEndScript ) ) ) )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:80:1: ( ( (lv_BeginScript_0_0= ruleBeginScript ) ) ( (lv_scriptStatement_1_0= ruleStatementList ) ) ( (lv_EndScript_2_0= ruleEndScript ) ) )
            {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:80:1: ( ( (lv_BeginScript_0_0= ruleBeginScript ) ) ( (lv_scriptStatement_1_0= ruleStatementList ) ) ( (lv_EndScript_2_0= ruleEndScript ) ) )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:80:2: ( (lv_BeginScript_0_0= ruleBeginScript ) ) ( (lv_scriptStatement_1_0= ruleStatementList ) ) ( (lv_EndScript_2_0= ruleEndScript ) )
            {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:80:2: ( (lv_BeginScript_0_0= ruleBeginScript ) )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:81:1: (lv_BeginScript_0_0= ruleBeginScript )
            {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:81:1: (lv_BeginScript_0_0= ruleBeginScript )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:82:3: lv_BeginScript_0_0= ruleBeginScript
            {
             
            	        newCompositeNode(grammarAccess.getScriptAccess().getBeginScriptBeginScriptParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleBeginScript_in_ruleScript131);
            lv_BeginScript_0_0=ruleBeginScript();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getScriptRule());
            	        }
                   		set(
                   			current, 
                   			"BeginScript",
                    		lv_BeginScript_0_0, 
                    		"BeginScript");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:98:2: ( (lv_scriptStatement_1_0= ruleStatementList ) )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:99:1: (lv_scriptStatement_1_0= ruleStatementList )
            {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:99:1: (lv_scriptStatement_1_0= ruleStatementList )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:100:3: lv_scriptStatement_1_0= ruleStatementList
            {
             
            	        newCompositeNode(grammarAccess.getScriptAccess().getScriptStatementStatementListParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleStatementList_in_ruleScript152);
            lv_scriptStatement_1_0=ruleStatementList();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getScriptRule());
            	        }
                   		set(
                   			current, 
                   			"scriptStatement",
                    		lv_scriptStatement_1_0, 
                    		"StatementList");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:116:2: ( (lv_EndScript_2_0= ruleEndScript ) )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:117:1: (lv_EndScript_2_0= ruleEndScript )
            {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:117:1: (lv_EndScript_2_0= ruleEndScript )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:118:3: lv_EndScript_2_0= ruleEndScript
            {
             
            	        newCompositeNode(grammarAccess.getScriptAccess().getEndScriptEndScriptParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleEndScript_in_ruleScript173);
            lv_EndScript_2_0=ruleEndScript();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getScriptRule());
            	        }
                   		set(
                   			current, 
                   			"EndScript",
                    		lv_EndScript_2_0, 
                    		"EndScript");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScript"


    // $ANTLR start "entryRuleBeginScript"
    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:142:1: entryRuleBeginScript returns [EObject current=null] : iv_ruleBeginScript= ruleBeginScript EOF ;
    public final EObject entryRuleBeginScript() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBeginScript = null;


        try {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:143:2: (iv_ruleBeginScript= ruleBeginScript EOF )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:144:2: iv_ruleBeginScript= ruleBeginScript EOF
            {
             newCompositeNode(grammarAccess.getBeginScriptRule()); 
            pushFollow(FOLLOW_ruleBeginScript_in_entryRuleBeginScript209);
            iv_ruleBeginScript=ruleBeginScript();

            state._fsp--;

             current =iv_ruleBeginScript; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBeginScript219); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBeginScript"


    // $ANTLR start "ruleBeginScript"
    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:151:1: ruleBeginScript returns [EObject current=null] : ( (lv_name_0_0= 'begin' ) ) ;
    public final EObject ruleBeginScript() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:154:28: ( ( (lv_name_0_0= 'begin' ) ) )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:155:1: ( (lv_name_0_0= 'begin' ) )
            {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:155:1: ( (lv_name_0_0= 'begin' ) )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:156:1: (lv_name_0_0= 'begin' )
            {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:156:1: (lv_name_0_0= 'begin' )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:157:3: lv_name_0_0= 'begin'
            {
            lv_name_0_0=(Token)match(input,18,FOLLOW_18_in_ruleBeginScript261); 

                    newLeafNode(lv_name_0_0, grammarAccess.getBeginScriptAccess().getNameBeginKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBeginScriptRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "begin");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBeginScript"


    // $ANTLR start "entryRuleEndScript"
    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:178:1: entryRuleEndScript returns [EObject current=null] : iv_ruleEndScript= ruleEndScript EOF ;
    public final EObject entryRuleEndScript() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEndScript = null;


        try {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:179:2: (iv_ruleEndScript= ruleEndScript EOF )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:180:2: iv_ruleEndScript= ruleEndScript EOF
            {
             newCompositeNode(grammarAccess.getEndScriptRule()); 
            pushFollow(FOLLOW_ruleEndScript_in_entryRuleEndScript309);
            iv_ruleEndScript=ruleEndScript();

            state._fsp--;

             current =iv_ruleEndScript; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEndScript319); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEndScript"


    // $ANTLR start "ruleEndScript"
    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:187:1: ruleEndScript returns [EObject current=null] : ( (lv_name_0_0= 'end' ) ) ;
    public final EObject ruleEndScript() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:190:28: ( ( (lv_name_0_0= 'end' ) ) )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:191:1: ( (lv_name_0_0= 'end' ) )
            {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:191:1: ( (lv_name_0_0= 'end' ) )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:192:1: (lv_name_0_0= 'end' )
            {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:192:1: (lv_name_0_0= 'end' )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:193:3: lv_name_0_0= 'end'
            {
            lv_name_0_0=(Token)match(input,19,FOLLOW_19_in_ruleEndScript361); 

                    newLeafNode(lv_name_0_0, grammarAccess.getEndScriptAccess().getNameEndKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEndScriptRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "end");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEndScript"


    // $ANTLR start "entryRuleStatement"
    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:214:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:215:2: (iv_ruleStatement= ruleStatement EOF )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:216:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement409);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement419); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:223:1: ruleStatement returns [EObject current=null] : (this_Command_0= ruleCommand | this_Parallel_1= ruleParallel ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_Command_0 = null;

        EObject this_Parallel_1 = null;


         enterRule(); 
            
        try {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:226:28: ( (this_Command_0= ruleCommand | this_Parallel_1= ruleParallel ) )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:227:1: (this_Command_0= ruleCommand | this_Parallel_1= ruleParallel )
            {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:227:1: (this_Command_0= ruleCommand | this_Parallel_1= ruleParallel )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                alt1=1;
            }
            else if ( (LA1_0==20) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:228:5: this_Command_0= ruleCommand
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getCommandParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleCommand_in_ruleStatement466);
                    this_Command_0=ruleCommand();

                    state._fsp--;

                     
                            current = this_Command_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:238:5: this_Parallel_1= ruleParallel
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getParallelParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleParallel_in_ruleStatement493);
                    this_Parallel_1=ruleParallel();

                    state._fsp--;

                     
                            current = this_Parallel_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleParallel"
    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:254:1: entryRuleParallel returns [EObject current=null] : iv_ruleParallel= ruleParallel EOF ;
    public final EObject entryRuleParallel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParallel = null;


        try {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:255:2: (iv_ruleParallel= ruleParallel EOF )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:256:2: iv_ruleParallel= ruleParallel EOF
            {
             newCompositeNode(grammarAccess.getParallelRule()); 
            pushFollow(FOLLOW_ruleParallel_in_entryRuleParallel528);
            iv_ruleParallel=ruleParallel();

            state._fsp--;

             current =iv_ruleParallel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParallel538); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParallel"


    // $ANTLR start "ruleParallel"
    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:263:1: ruleParallel returns [EObject current=null] : ( ( (lv_BeginParallel_0_0= ruleBeginParallel ) ) ( (lv_statementLists_1_0= ruleStatementList ) ) (this_PARALLEL_SEPARATOR_2= RULE_PARALLEL_SEPARATOR ( (lv_statementLists_3_0= ruleStatementList ) ) )+ ( (lv_EndParallel_4_0= ruleEndParallel ) ) ) ;
    public final EObject ruleParallel() throws RecognitionException {
        EObject current = null;

        Token this_PARALLEL_SEPARATOR_2=null;
        EObject lv_BeginParallel_0_0 = null;

        EObject lv_statementLists_1_0 = null;

        EObject lv_statementLists_3_0 = null;

        EObject lv_EndParallel_4_0 = null;


         enterRule(); 
            
        try {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:266:28: ( ( ( (lv_BeginParallel_0_0= ruleBeginParallel ) ) ( (lv_statementLists_1_0= ruleStatementList ) ) (this_PARALLEL_SEPARATOR_2= RULE_PARALLEL_SEPARATOR ( (lv_statementLists_3_0= ruleStatementList ) ) )+ ( (lv_EndParallel_4_0= ruleEndParallel ) ) ) )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:267:1: ( ( (lv_BeginParallel_0_0= ruleBeginParallel ) ) ( (lv_statementLists_1_0= ruleStatementList ) ) (this_PARALLEL_SEPARATOR_2= RULE_PARALLEL_SEPARATOR ( (lv_statementLists_3_0= ruleStatementList ) ) )+ ( (lv_EndParallel_4_0= ruleEndParallel ) ) )
            {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:267:1: ( ( (lv_BeginParallel_0_0= ruleBeginParallel ) ) ( (lv_statementLists_1_0= ruleStatementList ) ) (this_PARALLEL_SEPARATOR_2= RULE_PARALLEL_SEPARATOR ( (lv_statementLists_3_0= ruleStatementList ) ) )+ ( (lv_EndParallel_4_0= ruleEndParallel ) ) )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:267:2: ( (lv_BeginParallel_0_0= ruleBeginParallel ) ) ( (lv_statementLists_1_0= ruleStatementList ) ) (this_PARALLEL_SEPARATOR_2= RULE_PARALLEL_SEPARATOR ( (lv_statementLists_3_0= ruleStatementList ) ) )+ ( (lv_EndParallel_4_0= ruleEndParallel ) )
            {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:267:2: ( (lv_BeginParallel_0_0= ruleBeginParallel ) )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:268:1: (lv_BeginParallel_0_0= ruleBeginParallel )
            {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:268:1: (lv_BeginParallel_0_0= ruleBeginParallel )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:269:3: lv_BeginParallel_0_0= ruleBeginParallel
            {
             
            	        newCompositeNode(grammarAccess.getParallelAccess().getBeginParallelBeginParallelParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleBeginParallel_in_ruleParallel584);
            lv_BeginParallel_0_0=ruleBeginParallel();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParallelRule());
            	        }
                   		set(
                   			current, 
                   			"BeginParallel",
                    		lv_BeginParallel_0_0, 
                    		"BeginParallel");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:285:2: ( (lv_statementLists_1_0= ruleStatementList ) )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:286:1: (lv_statementLists_1_0= ruleStatementList )
            {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:286:1: (lv_statementLists_1_0= ruleStatementList )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:287:3: lv_statementLists_1_0= ruleStatementList
            {
             
            	        newCompositeNode(grammarAccess.getParallelAccess().getStatementListsStatementListParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleStatementList_in_ruleParallel605);
            lv_statementLists_1_0=ruleStatementList();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParallelRule());
            	        }
                   		add(
                   			current, 
                   			"statementLists",
                    		lv_statementLists_1_0, 
                    		"StatementList");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:303:2: (this_PARALLEL_SEPARATOR_2= RULE_PARALLEL_SEPARATOR ( (lv_statementLists_3_0= ruleStatementList ) ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_PARALLEL_SEPARATOR) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:303:3: this_PARALLEL_SEPARATOR_2= RULE_PARALLEL_SEPARATOR ( (lv_statementLists_3_0= ruleStatementList ) )
            	    {
            	    this_PARALLEL_SEPARATOR_2=(Token)match(input,RULE_PARALLEL_SEPARATOR,FOLLOW_RULE_PARALLEL_SEPARATOR_in_ruleParallel617); 
            	     
            	        newLeafNode(this_PARALLEL_SEPARATOR_2, grammarAccess.getParallelAccess().getPARALLEL_SEPARATORTerminalRuleCall_2_0()); 
            	        
            	    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:307:1: ( (lv_statementLists_3_0= ruleStatementList ) )
            	    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:308:1: (lv_statementLists_3_0= ruleStatementList )
            	    {
            	    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:308:1: (lv_statementLists_3_0= ruleStatementList )
            	    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:309:3: lv_statementLists_3_0= ruleStatementList
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getParallelAccess().getStatementListsStatementListParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStatementList_in_ruleParallel637);
            	    lv_statementLists_3_0=ruleStatementList();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getParallelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"statementLists",
            	            		lv_statementLists_3_0, 
            	            		"StatementList");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:325:4: ( (lv_EndParallel_4_0= ruleEndParallel ) )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:326:1: (lv_EndParallel_4_0= ruleEndParallel )
            {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:326:1: (lv_EndParallel_4_0= ruleEndParallel )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:327:3: lv_EndParallel_4_0= ruleEndParallel
            {
             
            	        newCompositeNode(grammarAccess.getParallelAccess().getEndParallelEndParallelParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleEndParallel_in_ruleParallel660);
            lv_EndParallel_4_0=ruleEndParallel();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParallelRule());
            	        }
                   		set(
                   			current, 
                   			"EndParallel",
                    		lv_EndParallel_4_0, 
                    		"EndParallel");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParallel"


    // $ANTLR start "entryRuleBeginParallel"
    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:351:1: entryRuleBeginParallel returns [EObject current=null] : iv_ruleBeginParallel= ruleBeginParallel EOF ;
    public final EObject entryRuleBeginParallel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBeginParallel = null;


        try {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:352:2: (iv_ruleBeginParallel= ruleBeginParallel EOF )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:353:2: iv_ruleBeginParallel= ruleBeginParallel EOF
            {
             newCompositeNode(grammarAccess.getBeginParallelRule()); 
            pushFollow(FOLLOW_ruleBeginParallel_in_entryRuleBeginParallel696);
            iv_ruleBeginParallel=ruleBeginParallel();

            state._fsp--;

             current =iv_ruleBeginParallel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBeginParallel706); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBeginParallel"


    // $ANTLR start "ruleBeginParallel"
    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:360:1: ruleBeginParallel returns [EObject current=null] : ( (lv_name_0_0= '[' ) ) ;
    public final EObject ruleBeginParallel() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:363:28: ( ( (lv_name_0_0= '[' ) ) )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:364:1: ( (lv_name_0_0= '[' ) )
            {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:364:1: ( (lv_name_0_0= '[' ) )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:365:1: (lv_name_0_0= '[' )
            {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:365:1: (lv_name_0_0= '[' )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:366:3: lv_name_0_0= '['
            {
            lv_name_0_0=(Token)match(input,20,FOLLOW_20_in_ruleBeginParallel748); 

                    newLeafNode(lv_name_0_0, grammarAccess.getBeginParallelAccess().getNameLeftSquareBracketKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBeginParallelRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "[");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBeginParallel"


    // $ANTLR start "entryRuleEndParallel"
    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:387:1: entryRuleEndParallel returns [EObject current=null] : iv_ruleEndParallel= ruleEndParallel EOF ;
    public final EObject entryRuleEndParallel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEndParallel = null;


        try {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:388:2: (iv_ruleEndParallel= ruleEndParallel EOF )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:389:2: iv_ruleEndParallel= ruleEndParallel EOF
            {
             newCompositeNode(grammarAccess.getEndParallelRule()); 
            pushFollow(FOLLOW_ruleEndParallel_in_entryRuleEndParallel796);
            iv_ruleEndParallel=ruleEndParallel();

            state._fsp--;

             current =iv_ruleEndParallel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEndParallel806); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEndParallel"


    // $ANTLR start "ruleEndParallel"
    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:396:1: ruleEndParallel returns [EObject current=null] : ( (lv_name_0_0= ']' ) ) ;
    public final EObject ruleEndParallel() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:399:28: ( ( (lv_name_0_0= ']' ) ) )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:400:1: ( (lv_name_0_0= ']' ) )
            {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:400:1: ( (lv_name_0_0= ']' ) )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:401:1: (lv_name_0_0= ']' )
            {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:401:1: (lv_name_0_0= ']' )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:402:3: lv_name_0_0= ']'
            {
            lv_name_0_0=(Token)match(input,21,FOLLOW_21_in_ruleEndParallel848); 

                    newLeafNode(lv_name_0_0, grammarAccess.getEndParallelAccess().getNameRightSquareBracketKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEndParallelRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "]");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEndParallel"


    // $ANTLR start "entryRuleStatementList"
    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:423:1: entryRuleStatementList returns [EObject current=null] : iv_ruleStatementList= ruleStatementList EOF ;
    public final EObject entryRuleStatementList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatementList = null;


        try {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:424:2: (iv_ruleStatementList= ruleStatementList EOF )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:425:2: iv_ruleStatementList= ruleStatementList EOF
            {
             newCompositeNode(grammarAccess.getStatementListRule()); 
            pushFollow(FOLLOW_ruleStatementList_in_entryRuleStatementList896);
            iv_ruleStatementList=ruleStatementList();

            state._fsp--;

             current =iv_ruleStatementList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatementList906); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatementList"


    // $ANTLR start "ruleStatementList"
    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:432:1: ruleStatementList returns [EObject current=null] : ( (lv_statements_0_0= ruleStatement ) )+ ;
    public final EObject ruleStatementList() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_0_0 = null;


         enterRule(); 
            
        try {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:435:28: ( ( (lv_statements_0_0= ruleStatement ) )+ )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:436:1: ( (lv_statements_0_0= ruleStatement ) )+
            {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:436:1: ( (lv_statements_0_0= ruleStatement ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID||LA3_0==20) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:437:1: (lv_statements_0_0= ruleStatement )
            	    {
            	    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:437:1: (lv_statements_0_0= ruleStatement )
            	    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:438:3: lv_statements_0_0= ruleStatement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStatementListAccess().getStatementsStatementParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStatement_in_ruleStatementList951);
            	    lv_statements_0_0=ruleStatement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStatementListRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"statements",
            	            		lv_statements_0_0, 
            	            		"Statement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatementList"


    // $ANTLR start "entryRuleCommand"
    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:462:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:463:2: (iv_ruleCommand= ruleCommand EOF )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:464:2: iv_ruleCommand= ruleCommand EOF
            {
             newCompositeNode(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_ruleCommand_in_entryRuleCommand987);
            iv_ruleCommand=ruleCommand();

            state._fsp--;

             current =iv_ruleCommand; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommand997); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:471:1: ruleCommand returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) this_LP_1= RULE_LP ( (lv_params_2_0= ruleParam ) ) (this_COMMA_3= RULE_COMMA ( (lv_params_4_0= ruleParam ) ) )* this_RP_5= RULE_RP this_SEQUENTIAL_SEPARATOR_6= RULE_SEQUENTIAL_SEPARATOR ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token this_LP_1=null;
        Token this_COMMA_3=null;
        Token this_RP_5=null;
        Token this_SEQUENTIAL_SEPARATOR_6=null;
        EObject lv_params_2_0 = null;

        EObject lv_params_4_0 = null;


         enterRule(); 
            
        try {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:474:28: ( ( ( (lv_name_0_0= RULE_ID ) ) this_LP_1= RULE_LP ( (lv_params_2_0= ruleParam ) ) (this_COMMA_3= RULE_COMMA ( (lv_params_4_0= ruleParam ) ) )* this_RP_5= RULE_RP this_SEQUENTIAL_SEPARATOR_6= RULE_SEQUENTIAL_SEPARATOR ) )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:475:1: ( ( (lv_name_0_0= RULE_ID ) ) this_LP_1= RULE_LP ( (lv_params_2_0= ruleParam ) ) (this_COMMA_3= RULE_COMMA ( (lv_params_4_0= ruleParam ) ) )* this_RP_5= RULE_RP this_SEQUENTIAL_SEPARATOR_6= RULE_SEQUENTIAL_SEPARATOR )
            {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:475:1: ( ( (lv_name_0_0= RULE_ID ) ) this_LP_1= RULE_LP ( (lv_params_2_0= ruleParam ) ) (this_COMMA_3= RULE_COMMA ( (lv_params_4_0= ruleParam ) ) )* this_RP_5= RULE_RP this_SEQUENTIAL_SEPARATOR_6= RULE_SEQUENTIAL_SEPARATOR )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:475:2: ( (lv_name_0_0= RULE_ID ) ) this_LP_1= RULE_LP ( (lv_params_2_0= ruleParam ) ) (this_COMMA_3= RULE_COMMA ( (lv_params_4_0= ruleParam ) ) )* this_RP_5= RULE_RP this_SEQUENTIAL_SEPARATOR_6= RULE_SEQUENTIAL_SEPARATOR
            {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:475:2: ( (lv_name_0_0= RULE_ID ) )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:476:1: (lv_name_0_0= RULE_ID )
            {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:476:1: (lv_name_0_0= RULE_ID )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:477:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCommand1039); 

            			newLeafNode(lv_name_0_0, grammarAccess.getCommandAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCommandRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            this_LP_1=(Token)match(input,RULE_LP,FOLLOW_RULE_LP_in_ruleCommand1055); 
             
                newLeafNode(this_LP_1, grammarAccess.getCommandAccess().getLPTerminalRuleCall_1()); 
                
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:497:1: ( (lv_params_2_0= ruleParam ) )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:498:1: (lv_params_2_0= ruleParam )
            {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:498:1: (lv_params_2_0= ruleParam )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:499:3: lv_params_2_0= ruleParam
            {
             
            	        newCompositeNode(grammarAccess.getCommandAccess().getParamsParamParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleParam_in_ruleCommand1075);
            lv_params_2_0=ruleParam();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCommandRule());
            	        }
                   		add(
                   			current, 
                   			"params",
                    		lv_params_2_0, 
                    		"Param");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:515:2: (this_COMMA_3= RULE_COMMA ( (lv_params_4_0= ruleParam ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_COMMA) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:515:3: this_COMMA_3= RULE_COMMA ( (lv_params_4_0= ruleParam ) )
            	    {
            	    this_COMMA_3=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleCommand1087); 
            	     
            	        newLeafNode(this_COMMA_3, grammarAccess.getCommandAccess().getCOMMATerminalRuleCall_3_0()); 
            	        
            	    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:519:1: ( (lv_params_4_0= ruleParam ) )
            	    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:520:1: (lv_params_4_0= ruleParam )
            	    {
            	    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:520:1: (lv_params_4_0= ruleParam )
            	    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:521:3: lv_params_4_0= ruleParam
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCommandAccess().getParamsParamParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleParam_in_ruleCommand1107);
            	    lv_params_4_0=ruleParam();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCommandRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"params",
            	            		lv_params_4_0, 
            	            		"Param");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            this_RP_5=(Token)match(input,RULE_RP,FOLLOW_RULE_RP_in_ruleCommand1120); 
             
                newLeafNode(this_RP_5, grammarAccess.getCommandAccess().getRPTerminalRuleCall_4()); 
                
            this_SEQUENTIAL_SEPARATOR_6=(Token)match(input,RULE_SEQUENTIAL_SEPARATOR,FOLLOW_RULE_SEQUENTIAL_SEPARATOR_in_ruleCommand1130); 
             
                newLeafNode(this_SEQUENTIAL_SEPARATOR_6, grammarAccess.getCommandAccess().getSEQUENTIAL_SEPARATORTerminalRuleCall_5()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleParam"
    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:553:1: entryRuleParam returns [EObject current=null] : iv_ruleParam= ruleParam EOF ;
    public final EObject entryRuleParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParam = null;


        try {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:554:2: (iv_ruleParam= ruleParam EOF )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:555:2: iv_ruleParam= ruleParam EOF
            {
             newCompositeNode(grammarAccess.getParamRule()); 
            pushFollow(FOLLOW_ruleParam_in_entryRuleParam1165);
            iv_ruleParam=ruleParam();

            state._fsp--;

             current =iv_ruleParam; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParam1175); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParam"


    // $ANTLR start "ruleParam"
    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:562:1: ruleParam returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleParam() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:565:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:566:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:566:1: ( (lv_value_0_0= RULE_INT ) )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:567:1: (lv_value_0_0= RULE_INT )
            {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:567:1: (lv_value_0_0= RULE_INT )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:568:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleParam1216); 

            			newLeafNode(lv_value_0_0, grammarAccess.getParamAccess().getValueINTTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getParamRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"INT");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParam"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleScript_in_entryRuleScript75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScript85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBeginScript_in_ruleScript131 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_ruleStatementList_in_ruleScript152 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleEndScript_in_ruleScript173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBeginScript_in_entryRuleBeginScript209 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBeginScript219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleBeginScript261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEndScript_in_entryRuleEndScript309 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEndScript319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleEndScript361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement409 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_ruleStatement466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParallel_in_ruleStatement493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParallel_in_entryRuleParallel528 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParallel538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBeginParallel_in_ruleParallel584 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_ruleStatementList_in_ruleParallel605 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_PARALLEL_SEPARATOR_in_ruleParallel617 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_ruleStatementList_in_ruleParallel637 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_ruleEndParallel_in_ruleParallel660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBeginParallel_in_entryRuleBeginParallel696 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBeginParallel706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleBeginParallel748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEndParallel_in_entryRuleEndParallel796 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEndParallel806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleEndParallel848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatementList_in_entryRuleStatementList896 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatementList906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleStatementList951 = new BitSet(new long[]{0x0000000000100022L});
    public static final BitSet FOLLOW_ruleCommand_in_entryRuleCommand987 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommand997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCommand1039 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_LP_in_ruleCommand1055 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ruleParam_in_ruleCommand1075 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleCommand1087 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ruleParam_in_ruleCommand1107 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_RULE_RP_in_ruleCommand1120 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_SEQUENTIAL_SEPARATOR_in_ruleCommand1130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParam_in_entryRuleParam1165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParam1175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleParam1216 = new BitSet(new long[]{0x0000000000000002L});

}