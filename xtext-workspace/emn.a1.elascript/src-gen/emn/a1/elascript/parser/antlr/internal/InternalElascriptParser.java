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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_PARALLEL_SEPARATOR", "RULE_LP", "RULE_RP", "RULE_COMMA", "RULE_SEQUENTIAL_SEPARATOR", "RULE_ID", "RULE_INT", "RULE_LETTER", "RULE_NUMBER", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'begin'", "'end'", "'['", "']'", "'wait'", "'scaleInInfra'", "'scaleOutInfra'", "'scaleUpInfra'", "'scaleDownInfra'", "'scaleInSoft'", "'scaleOutSoft'", "'scaleUpSoft'", "'scaleDownSoft'"
    };
    public static final int RULE_SEQUENTIAL_SEPARATOR=8;
    public static final int RULE_STRING=13;
    public static final int RULE_SL_COMMENT=15;
    public static final int T__19=19;
    public static final int T__18=18;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_ID=9;
    public static final int RULE_COMMA=7;
    public static final int RULE_WS=16;
    public static final int RULE_PARALLEL_SEPARATOR=4;
    public static final int RULE_ANY_OTHER=17;
    public static final int RULE_NUMBER=12;
    public static final int RULE_LETTER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=10;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=14;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_RP=6;
    public static final int RULE_LP=5;
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

            if ( (LA1_0==RULE_ID||(LA1_0>=22 && LA1_0<=30)) ) {
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

                if ( (LA3_0==RULE_ID||LA3_0==20||(LA3_0>=22 && LA3_0<=30)) ) {
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
    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:471:1: ruleCommand returns [EObject current=null] : ( (this_ScaleFunction_0= ruleScaleFunction | this_GenericFunction_1= ruleGenericFunction | this_WaitFunction_2= ruleWaitFunction ) this_LP_3= RULE_LP (this_RP_4= RULE_RP | ( ( ( (lv_params_5_0= ruleParam ) ) this_COMMA_6= RULE_COMMA )* ( (lv_params_7_0= ruleParam ) ) this_RP_8= RULE_RP ) ) this_SEQUENTIAL_SEPARATOR_9= RULE_SEQUENTIAL_SEPARATOR ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        Token this_LP_3=null;
        Token this_RP_4=null;
        Token this_COMMA_6=null;
        Token this_RP_8=null;
        Token this_SEQUENTIAL_SEPARATOR_9=null;
        EObject this_ScaleFunction_0 = null;

        EObject this_GenericFunction_1 = null;

        EObject this_WaitFunction_2 = null;

        EObject lv_params_5_0 = null;

        EObject lv_params_7_0 = null;


         enterRule(); 
            
        try {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:474:28: ( ( (this_ScaleFunction_0= ruleScaleFunction | this_GenericFunction_1= ruleGenericFunction | this_WaitFunction_2= ruleWaitFunction ) this_LP_3= RULE_LP (this_RP_4= RULE_RP | ( ( ( (lv_params_5_0= ruleParam ) ) this_COMMA_6= RULE_COMMA )* ( (lv_params_7_0= ruleParam ) ) this_RP_8= RULE_RP ) ) this_SEQUENTIAL_SEPARATOR_9= RULE_SEQUENTIAL_SEPARATOR ) )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:475:1: ( (this_ScaleFunction_0= ruleScaleFunction | this_GenericFunction_1= ruleGenericFunction | this_WaitFunction_2= ruleWaitFunction ) this_LP_3= RULE_LP (this_RP_4= RULE_RP | ( ( ( (lv_params_5_0= ruleParam ) ) this_COMMA_6= RULE_COMMA )* ( (lv_params_7_0= ruleParam ) ) this_RP_8= RULE_RP ) ) this_SEQUENTIAL_SEPARATOR_9= RULE_SEQUENTIAL_SEPARATOR )
            {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:475:1: ( (this_ScaleFunction_0= ruleScaleFunction | this_GenericFunction_1= ruleGenericFunction | this_WaitFunction_2= ruleWaitFunction ) this_LP_3= RULE_LP (this_RP_4= RULE_RP | ( ( ( (lv_params_5_0= ruleParam ) ) this_COMMA_6= RULE_COMMA )* ( (lv_params_7_0= ruleParam ) ) this_RP_8= RULE_RP ) ) this_SEQUENTIAL_SEPARATOR_9= RULE_SEQUENTIAL_SEPARATOR )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:475:2: (this_ScaleFunction_0= ruleScaleFunction | this_GenericFunction_1= ruleGenericFunction | this_WaitFunction_2= ruleWaitFunction ) this_LP_3= RULE_LP (this_RP_4= RULE_RP | ( ( ( (lv_params_5_0= ruleParam ) ) this_COMMA_6= RULE_COMMA )* ( (lv_params_7_0= ruleParam ) ) this_RP_8= RULE_RP ) ) this_SEQUENTIAL_SEPARATOR_9= RULE_SEQUENTIAL_SEPARATOR
            {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:475:2: (this_ScaleFunction_0= ruleScaleFunction | this_GenericFunction_1= ruleGenericFunction | this_WaitFunction_2= ruleWaitFunction )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
                {
                alt4=1;
                }
                break;
            case RULE_ID:
                {
                alt4=2;
                }
                break;
            case 22:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:476:5: this_ScaleFunction_0= ruleScaleFunction
                    {
                     
                            newCompositeNode(grammarAccess.getCommandAccess().getScaleFunctionParserRuleCall_0_0()); 
                        
                    pushFollow(FOLLOW_ruleScaleFunction_in_ruleCommand1045);
                    this_ScaleFunction_0=ruleScaleFunction();

                    state._fsp--;

                     
                            current = this_ScaleFunction_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:486:5: this_GenericFunction_1= ruleGenericFunction
                    {
                     
                            newCompositeNode(grammarAccess.getCommandAccess().getGenericFunctionParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleGenericFunction_in_ruleCommand1072);
                    this_GenericFunction_1=ruleGenericFunction();

                    state._fsp--;

                     
                            current = this_GenericFunction_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:496:5: this_WaitFunction_2= ruleWaitFunction
                    {
                     
                            newCompositeNode(grammarAccess.getCommandAccess().getWaitFunctionParserRuleCall_0_2()); 
                        
                    pushFollow(FOLLOW_ruleWaitFunction_in_ruleCommand1099);
                    this_WaitFunction_2=ruleWaitFunction();

                    state._fsp--;

                     
                            current = this_WaitFunction_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            this_LP_3=(Token)match(input,RULE_LP,FOLLOW_RULE_LP_in_ruleCommand1110); 
             
                newLeafNode(this_LP_3, grammarAccess.getCommandAccess().getLPTerminalRuleCall_1()); 
                
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:508:1: (this_RP_4= RULE_RP | ( ( ( (lv_params_5_0= ruleParam ) ) this_COMMA_6= RULE_COMMA )* ( (lv_params_7_0= ruleParam ) ) this_RP_8= RULE_RP ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_RP) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_INT) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:508:2: this_RP_4= RULE_RP
                    {
                    this_RP_4=(Token)match(input,RULE_RP,FOLLOW_RULE_RP_in_ruleCommand1121); 
                     
                        newLeafNode(this_RP_4, grammarAccess.getCommandAccess().getRPTerminalRuleCall_2_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:513:6: ( ( ( (lv_params_5_0= ruleParam ) ) this_COMMA_6= RULE_COMMA )* ( (lv_params_7_0= ruleParam ) ) this_RP_8= RULE_RP )
                    {
                    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:513:6: ( ( ( (lv_params_5_0= ruleParam ) ) this_COMMA_6= RULE_COMMA )* ( (lv_params_7_0= ruleParam ) ) this_RP_8= RULE_RP )
                    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:513:7: ( ( (lv_params_5_0= ruleParam ) ) this_COMMA_6= RULE_COMMA )* ( (lv_params_7_0= ruleParam ) ) this_RP_8= RULE_RP
                    {
                    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:513:7: ( ( (lv_params_5_0= ruleParam ) ) this_COMMA_6= RULE_COMMA )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==RULE_INT) ) {
                            int LA5_1 = input.LA(2);

                            if ( (LA5_1==RULE_COMMA) ) {
                                alt5=1;
                            }


                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:513:8: ( (lv_params_5_0= ruleParam ) ) this_COMMA_6= RULE_COMMA
                    	    {
                    	    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:513:8: ( (lv_params_5_0= ruleParam ) )
                    	    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:514:1: (lv_params_5_0= ruleParam )
                    	    {
                    	    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:514:1: (lv_params_5_0= ruleParam )
                    	    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:515:3: lv_params_5_0= ruleParam
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCommandAccess().getParamsParamParserRuleCall_2_1_0_0_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleParam_in_ruleCommand1149);
                    	    lv_params_5_0=ruleParam();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getCommandRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"params",
                    	            		lv_params_5_0, 
                    	            		"Param");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }

                    	    this_COMMA_6=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleCommand1160); 
                    	     
                    	        newLeafNode(this_COMMA_6, grammarAccess.getCommandAccess().getCOMMATerminalRuleCall_2_1_0_1()); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:535:3: ( (lv_params_7_0= ruleParam ) )
                    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:536:1: (lv_params_7_0= ruleParam )
                    {
                    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:536:1: (lv_params_7_0= ruleParam )
                    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:537:3: lv_params_7_0= ruleParam
                    {
                     
                    	        newCompositeNode(grammarAccess.getCommandAccess().getParamsParamParserRuleCall_2_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParam_in_ruleCommand1182);
                    lv_params_7_0=ruleParam();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCommandRule());
                    	        }
                           		add(
                           			current, 
                           			"params",
                            		lv_params_7_0, 
                            		"Param");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    this_RP_8=(Token)match(input,RULE_RP,FOLLOW_RULE_RP_in_ruleCommand1193); 
                     
                        newLeafNode(this_RP_8, grammarAccess.getCommandAccess().getRPTerminalRuleCall_2_1_2()); 
                        

                    }


                    }
                    break;

            }

            this_SEQUENTIAL_SEPARATOR_9=(Token)match(input,RULE_SEQUENTIAL_SEPARATOR,FOLLOW_RULE_SEQUENTIAL_SEPARATOR_in_ruleCommand1205); 
             
                newLeafNode(this_SEQUENTIAL_SEPARATOR_9, grammarAccess.getCommandAccess().getSEQUENTIAL_SEPARATORTerminalRuleCall_3()); 
                

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


    // $ANTLR start "entryRuleScaleFunction"
    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:569:1: entryRuleScaleFunction returns [EObject current=null] : iv_ruleScaleFunction= ruleScaleFunction EOF ;
    public final EObject entryRuleScaleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScaleFunction = null;


        try {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:570:2: (iv_ruleScaleFunction= ruleScaleFunction EOF )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:571:2: iv_ruleScaleFunction= ruleScaleFunction EOF
            {
             newCompositeNode(grammarAccess.getScaleFunctionRule()); 
            pushFollow(FOLLOW_ruleScaleFunction_in_entryRuleScaleFunction1240);
            iv_ruleScaleFunction=ruleScaleFunction();

            state._fsp--;

             current =iv_ruleScaleFunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScaleFunction1250); 

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
    // $ANTLR end "entryRuleScaleFunction"


    // $ANTLR start "ruleScaleFunction"
    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:578:1: ruleScaleFunction returns [EObject current=null] : (this_ScaleInInfra_0= ruleScaleInInfra | this_ScaleOutInfra_1= ruleScaleOutInfra | this_ScaleUpInfra_2= ruleScaleUpInfra | this_ScaleDownInfra_3= ruleScaleDownInfra | this_ScaleInSoft_4= ruleScaleInSoft | this_ScaleOutSoft_5= ruleScaleOutSoft | this_ScaleUpSoft_6= ruleScaleUpSoft | this_ScaleDownSoft_7= ruleScaleDownSoft ) ;
    public final EObject ruleScaleFunction() throws RecognitionException {
        EObject current = null;

        EObject this_ScaleInInfra_0 = null;

        EObject this_ScaleOutInfra_1 = null;

        EObject this_ScaleUpInfra_2 = null;

        EObject this_ScaleDownInfra_3 = null;

        EObject this_ScaleInSoft_4 = null;

        EObject this_ScaleOutSoft_5 = null;

        EObject this_ScaleUpSoft_6 = null;

        EObject this_ScaleDownSoft_7 = null;


         enterRule(); 
            
        try {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:581:28: ( (this_ScaleInInfra_0= ruleScaleInInfra | this_ScaleOutInfra_1= ruleScaleOutInfra | this_ScaleUpInfra_2= ruleScaleUpInfra | this_ScaleDownInfra_3= ruleScaleDownInfra | this_ScaleInSoft_4= ruleScaleInSoft | this_ScaleOutSoft_5= ruleScaleOutSoft | this_ScaleUpSoft_6= ruleScaleUpSoft | this_ScaleDownSoft_7= ruleScaleDownSoft ) )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:582:1: (this_ScaleInInfra_0= ruleScaleInInfra | this_ScaleOutInfra_1= ruleScaleOutInfra | this_ScaleUpInfra_2= ruleScaleUpInfra | this_ScaleDownInfra_3= ruleScaleDownInfra | this_ScaleInSoft_4= ruleScaleInSoft | this_ScaleOutSoft_5= ruleScaleOutSoft | this_ScaleUpSoft_6= ruleScaleUpSoft | this_ScaleDownSoft_7= ruleScaleDownSoft )
            {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:582:1: (this_ScaleInInfra_0= ruleScaleInInfra | this_ScaleOutInfra_1= ruleScaleOutInfra | this_ScaleUpInfra_2= ruleScaleUpInfra | this_ScaleDownInfra_3= ruleScaleDownInfra | this_ScaleInSoft_4= ruleScaleInSoft | this_ScaleOutSoft_5= ruleScaleOutSoft | this_ScaleUpSoft_6= ruleScaleUpSoft | this_ScaleDownSoft_7= ruleScaleDownSoft )
            int alt7=8;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt7=1;
                }
                break;
            case 24:
                {
                alt7=2;
                }
                break;
            case 25:
                {
                alt7=3;
                }
                break;
            case 26:
                {
                alt7=4;
                }
                break;
            case 27:
                {
                alt7=5;
                }
                break;
            case 28:
                {
                alt7=6;
                }
                break;
            case 29:
                {
                alt7=7;
                }
                break;
            case 30:
                {
                alt7=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:583:5: this_ScaleInInfra_0= ruleScaleInInfra
                    {
                     
                            newCompositeNode(grammarAccess.getScaleFunctionAccess().getScaleInInfraParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleScaleInInfra_in_ruleScaleFunction1297);
                    this_ScaleInInfra_0=ruleScaleInInfra();

                    state._fsp--;

                     
                            current = this_ScaleInInfra_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:593:5: this_ScaleOutInfra_1= ruleScaleOutInfra
                    {
                     
                            newCompositeNode(grammarAccess.getScaleFunctionAccess().getScaleOutInfraParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleScaleOutInfra_in_ruleScaleFunction1324);
                    this_ScaleOutInfra_1=ruleScaleOutInfra();

                    state._fsp--;

                     
                            current = this_ScaleOutInfra_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:603:5: this_ScaleUpInfra_2= ruleScaleUpInfra
                    {
                     
                            newCompositeNode(grammarAccess.getScaleFunctionAccess().getScaleUpInfraParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleScaleUpInfra_in_ruleScaleFunction1351);
                    this_ScaleUpInfra_2=ruleScaleUpInfra();

                    state._fsp--;

                     
                            current = this_ScaleUpInfra_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:613:5: this_ScaleDownInfra_3= ruleScaleDownInfra
                    {
                     
                            newCompositeNode(grammarAccess.getScaleFunctionAccess().getScaleDownInfraParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleScaleDownInfra_in_ruleScaleFunction1378);
                    this_ScaleDownInfra_3=ruleScaleDownInfra();

                    state._fsp--;

                     
                            current = this_ScaleDownInfra_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:623:5: this_ScaleInSoft_4= ruleScaleInSoft
                    {
                     
                            newCompositeNode(grammarAccess.getScaleFunctionAccess().getScaleInSoftParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleScaleInSoft_in_ruleScaleFunction1405);
                    this_ScaleInSoft_4=ruleScaleInSoft();

                    state._fsp--;

                     
                            current = this_ScaleInSoft_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:633:5: this_ScaleOutSoft_5= ruleScaleOutSoft
                    {
                     
                            newCompositeNode(grammarAccess.getScaleFunctionAccess().getScaleOutSoftParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleScaleOutSoft_in_ruleScaleFunction1432);
                    this_ScaleOutSoft_5=ruleScaleOutSoft();

                    state._fsp--;

                     
                            current = this_ScaleOutSoft_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:643:5: this_ScaleUpSoft_6= ruleScaleUpSoft
                    {
                     
                            newCompositeNode(grammarAccess.getScaleFunctionAccess().getScaleUpSoftParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleScaleUpSoft_in_ruleScaleFunction1459);
                    this_ScaleUpSoft_6=ruleScaleUpSoft();

                    state._fsp--;

                     
                            current = this_ScaleUpSoft_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:653:5: this_ScaleDownSoft_7= ruleScaleDownSoft
                    {
                     
                            newCompositeNode(grammarAccess.getScaleFunctionAccess().getScaleDownSoftParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleScaleDownSoft_in_ruleScaleFunction1486);
                    this_ScaleDownSoft_7=ruleScaleDownSoft();

                    state._fsp--;

                     
                            current = this_ScaleDownSoft_7; 
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
    // $ANTLR end "ruleScaleFunction"


    // $ANTLR start "entryRuleWaitFunction"
    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:669:1: entryRuleWaitFunction returns [EObject current=null] : iv_ruleWaitFunction= ruleWaitFunction EOF ;
    public final EObject entryRuleWaitFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWaitFunction = null;


        try {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:670:2: (iv_ruleWaitFunction= ruleWaitFunction EOF )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:671:2: iv_ruleWaitFunction= ruleWaitFunction EOF
            {
             newCompositeNode(grammarAccess.getWaitFunctionRule()); 
            pushFollow(FOLLOW_ruleWaitFunction_in_entryRuleWaitFunction1521);
            iv_ruleWaitFunction=ruleWaitFunction();

            state._fsp--;

             current =iv_ruleWaitFunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWaitFunction1531); 

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
    // $ANTLR end "entryRuleWaitFunction"


    // $ANTLR start "ruleWaitFunction"
    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:678:1: ruleWaitFunction returns [EObject current=null] : ( (lv_name_0_0= 'wait' ) ) ;
    public final EObject ruleWaitFunction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:681:28: ( ( (lv_name_0_0= 'wait' ) ) )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:682:1: ( (lv_name_0_0= 'wait' ) )
            {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:682:1: ( (lv_name_0_0= 'wait' ) )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:683:1: (lv_name_0_0= 'wait' )
            {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:683:1: (lv_name_0_0= 'wait' )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:684:3: lv_name_0_0= 'wait'
            {
            lv_name_0_0=(Token)match(input,22,FOLLOW_22_in_ruleWaitFunction1573); 

                    newLeafNode(lv_name_0_0, grammarAccess.getWaitFunctionAccess().getNameWaitKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getWaitFunctionRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "wait");
            	    

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
    // $ANTLR end "ruleWaitFunction"


    // $ANTLR start "entryRuleGenericFunction"
    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:705:1: entryRuleGenericFunction returns [EObject current=null] : iv_ruleGenericFunction= ruleGenericFunction EOF ;
    public final EObject entryRuleGenericFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenericFunction = null;


        try {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:706:2: (iv_ruleGenericFunction= ruleGenericFunction EOF )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:707:2: iv_ruleGenericFunction= ruleGenericFunction EOF
            {
             newCompositeNode(grammarAccess.getGenericFunctionRule()); 
            pushFollow(FOLLOW_ruleGenericFunction_in_entryRuleGenericFunction1621);
            iv_ruleGenericFunction=ruleGenericFunction();

            state._fsp--;

             current =iv_ruleGenericFunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGenericFunction1631); 

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
    // $ANTLR end "entryRuleGenericFunction"


    // $ANTLR start "ruleGenericFunction"
    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:714:1: ruleGenericFunction returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleGenericFunction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:717:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:718:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:718:1: ( (lv_name_0_0= RULE_ID ) )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:719:1: (lv_name_0_0= RULE_ID )
            {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:719:1: (lv_name_0_0= RULE_ID )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:720:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGenericFunction1672); 

            			newLeafNode(lv_name_0_0, grammarAccess.getGenericFunctionAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGenericFunctionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleGenericFunction"


    // $ANTLR start "entryRuleScaleInInfra"
    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:744:1: entryRuleScaleInInfra returns [EObject current=null] : iv_ruleScaleInInfra= ruleScaleInInfra EOF ;
    public final EObject entryRuleScaleInInfra() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScaleInInfra = null;


        try {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:745:2: (iv_ruleScaleInInfra= ruleScaleInInfra EOF )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:746:2: iv_ruleScaleInInfra= ruleScaleInInfra EOF
            {
             newCompositeNode(grammarAccess.getScaleInInfraRule()); 
            pushFollow(FOLLOW_ruleScaleInInfra_in_entryRuleScaleInInfra1712);
            iv_ruleScaleInInfra=ruleScaleInInfra();

            state._fsp--;

             current =iv_ruleScaleInInfra; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScaleInInfra1722); 

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
    // $ANTLR end "entryRuleScaleInInfra"


    // $ANTLR start "ruleScaleInInfra"
    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:753:1: ruleScaleInInfra returns [EObject current=null] : ( (lv_name_0_0= 'scaleInInfra' ) ) ;
    public final EObject ruleScaleInInfra() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:756:28: ( ( (lv_name_0_0= 'scaleInInfra' ) ) )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:757:1: ( (lv_name_0_0= 'scaleInInfra' ) )
            {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:757:1: ( (lv_name_0_0= 'scaleInInfra' ) )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:758:1: (lv_name_0_0= 'scaleInInfra' )
            {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:758:1: (lv_name_0_0= 'scaleInInfra' )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:759:3: lv_name_0_0= 'scaleInInfra'
            {
            lv_name_0_0=(Token)match(input,23,FOLLOW_23_in_ruleScaleInInfra1764); 

                    newLeafNode(lv_name_0_0, grammarAccess.getScaleInInfraAccess().getNameScaleInInfraKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getScaleInInfraRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "scaleInInfra");
            	    

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
    // $ANTLR end "ruleScaleInInfra"


    // $ANTLR start "entryRuleScaleOutInfra"
    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:780:1: entryRuleScaleOutInfra returns [EObject current=null] : iv_ruleScaleOutInfra= ruleScaleOutInfra EOF ;
    public final EObject entryRuleScaleOutInfra() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScaleOutInfra = null;


        try {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:781:2: (iv_ruleScaleOutInfra= ruleScaleOutInfra EOF )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:782:2: iv_ruleScaleOutInfra= ruleScaleOutInfra EOF
            {
             newCompositeNode(grammarAccess.getScaleOutInfraRule()); 
            pushFollow(FOLLOW_ruleScaleOutInfra_in_entryRuleScaleOutInfra1812);
            iv_ruleScaleOutInfra=ruleScaleOutInfra();

            state._fsp--;

             current =iv_ruleScaleOutInfra; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScaleOutInfra1822); 

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
    // $ANTLR end "entryRuleScaleOutInfra"


    // $ANTLR start "ruleScaleOutInfra"
    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:789:1: ruleScaleOutInfra returns [EObject current=null] : ( (lv_name_0_0= 'scaleOutInfra' ) ) ;
    public final EObject ruleScaleOutInfra() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:792:28: ( ( (lv_name_0_0= 'scaleOutInfra' ) ) )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:793:1: ( (lv_name_0_0= 'scaleOutInfra' ) )
            {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:793:1: ( (lv_name_0_0= 'scaleOutInfra' ) )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:794:1: (lv_name_0_0= 'scaleOutInfra' )
            {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:794:1: (lv_name_0_0= 'scaleOutInfra' )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:795:3: lv_name_0_0= 'scaleOutInfra'
            {
            lv_name_0_0=(Token)match(input,24,FOLLOW_24_in_ruleScaleOutInfra1864); 

                    newLeafNode(lv_name_0_0, grammarAccess.getScaleOutInfraAccess().getNameScaleOutInfraKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getScaleOutInfraRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "scaleOutInfra");
            	    

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
    // $ANTLR end "ruleScaleOutInfra"


    // $ANTLR start "entryRuleScaleUpInfra"
    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:816:1: entryRuleScaleUpInfra returns [EObject current=null] : iv_ruleScaleUpInfra= ruleScaleUpInfra EOF ;
    public final EObject entryRuleScaleUpInfra() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScaleUpInfra = null;


        try {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:817:2: (iv_ruleScaleUpInfra= ruleScaleUpInfra EOF )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:818:2: iv_ruleScaleUpInfra= ruleScaleUpInfra EOF
            {
             newCompositeNode(grammarAccess.getScaleUpInfraRule()); 
            pushFollow(FOLLOW_ruleScaleUpInfra_in_entryRuleScaleUpInfra1912);
            iv_ruleScaleUpInfra=ruleScaleUpInfra();

            state._fsp--;

             current =iv_ruleScaleUpInfra; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScaleUpInfra1922); 

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
    // $ANTLR end "entryRuleScaleUpInfra"


    // $ANTLR start "ruleScaleUpInfra"
    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:825:1: ruleScaleUpInfra returns [EObject current=null] : ( (lv_name_0_0= 'scaleUpInfra' ) ) ;
    public final EObject ruleScaleUpInfra() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:828:28: ( ( (lv_name_0_0= 'scaleUpInfra' ) ) )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:829:1: ( (lv_name_0_0= 'scaleUpInfra' ) )
            {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:829:1: ( (lv_name_0_0= 'scaleUpInfra' ) )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:830:1: (lv_name_0_0= 'scaleUpInfra' )
            {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:830:1: (lv_name_0_0= 'scaleUpInfra' )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:831:3: lv_name_0_0= 'scaleUpInfra'
            {
            lv_name_0_0=(Token)match(input,25,FOLLOW_25_in_ruleScaleUpInfra1964); 

                    newLeafNode(lv_name_0_0, grammarAccess.getScaleUpInfraAccess().getNameScaleUpInfraKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getScaleUpInfraRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "scaleUpInfra");
            	    

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
    // $ANTLR end "ruleScaleUpInfra"


    // $ANTLR start "entryRuleScaleDownInfra"
    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:852:1: entryRuleScaleDownInfra returns [EObject current=null] : iv_ruleScaleDownInfra= ruleScaleDownInfra EOF ;
    public final EObject entryRuleScaleDownInfra() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScaleDownInfra = null;


        try {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:853:2: (iv_ruleScaleDownInfra= ruleScaleDownInfra EOF )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:854:2: iv_ruleScaleDownInfra= ruleScaleDownInfra EOF
            {
             newCompositeNode(grammarAccess.getScaleDownInfraRule()); 
            pushFollow(FOLLOW_ruleScaleDownInfra_in_entryRuleScaleDownInfra2012);
            iv_ruleScaleDownInfra=ruleScaleDownInfra();

            state._fsp--;

             current =iv_ruleScaleDownInfra; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScaleDownInfra2022); 

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
    // $ANTLR end "entryRuleScaleDownInfra"


    // $ANTLR start "ruleScaleDownInfra"
    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:861:1: ruleScaleDownInfra returns [EObject current=null] : ( (lv_name_0_0= 'scaleDownInfra' ) ) ;
    public final EObject ruleScaleDownInfra() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:864:28: ( ( (lv_name_0_0= 'scaleDownInfra' ) ) )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:865:1: ( (lv_name_0_0= 'scaleDownInfra' ) )
            {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:865:1: ( (lv_name_0_0= 'scaleDownInfra' ) )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:866:1: (lv_name_0_0= 'scaleDownInfra' )
            {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:866:1: (lv_name_0_0= 'scaleDownInfra' )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:867:3: lv_name_0_0= 'scaleDownInfra'
            {
            lv_name_0_0=(Token)match(input,26,FOLLOW_26_in_ruleScaleDownInfra2064); 

                    newLeafNode(lv_name_0_0, grammarAccess.getScaleDownInfraAccess().getNameScaleDownInfraKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getScaleDownInfraRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "scaleDownInfra");
            	    

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
    // $ANTLR end "ruleScaleDownInfra"


    // $ANTLR start "entryRuleScaleInSoft"
    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:888:1: entryRuleScaleInSoft returns [EObject current=null] : iv_ruleScaleInSoft= ruleScaleInSoft EOF ;
    public final EObject entryRuleScaleInSoft() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScaleInSoft = null;


        try {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:889:2: (iv_ruleScaleInSoft= ruleScaleInSoft EOF )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:890:2: iv_ruleScaleInSoft= ruleScaleInSoft EOF
            {
             newCompositeNode(grammarAccess.getScaleInSoftRule()); 
            pushFollow(FOLLOW_ruleScaleInSoft_in_entryRuleScaleInSoft2112);
            iv_ruleScaleInSoft=ruleScaleInSoft();

            state._fsp--;

             current =iv_ruleScaleInSoft; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScaleInSoft2122); 

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
    // $ANTLR end "entryRuleScaleInSoft"


    // $ANTLR start "ruleScaleInSoft"
    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:897:1: ruleScaleInSoft returns [EObject current=null] : ( (lv_name_0_0= 'scaleInSoft' ) ) ;
    public final EObject ruleScaleInSoft() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:900:28: ( ( (lv_name_0_0= 'scaleInSoft' ) ) )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:901:1: ( (lv_name_0_0= 'scaleInSoft' ) )
            {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:901:1: ( (lv_name_0_0= 'scaleInSoft' ) )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:902:1: (lv_name_0_0= 'scaleInSoft' )
            {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:902:1: (lv_name_0_0= 'scaleInSoft' )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:903:3: lv_name_0_0= 'scaleInSoft'
            {
            lv_name_0_0=(Token)match(input,27,FOLLOW_27_in_ruleScaleInSoft2164); 

                    newLeafNode(lv_name_0_0, grammarAccess.getScaleInSoftAccess().getNameScaleInSoftKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getScaleInSoftRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "scaleInSoft");
            	    

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
    // $ANTLR end "ruleScaleInSoft"


    // $ANTLR start "entryRuleScaleOutSoft"
    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:924:1: entryRuleScaleOutSoft returns [EObject current=null] : iv_ruleScaleOutSoft= ruleScaleOutSoft EOF ;
    public final EObject entryRuleScaleOutSoft() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScaleOutSoft = null;


        try {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:925:2: (iv_ruleScaleOutSoft= ruleScaleOutSoft EOF )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:926:2: iv_ruleScaleOutSoft= ruleScaleOutSoft EOF
            {
             newCompositeNode(grammarAccess.getScaleOutSoftRule()); 
            pushFollow(FOLLOW_ruleScaleOutSoft_in_entryRuleScaleOutSoft2212);
            iv_ruleScaleOutSoft=ruleScaleOutSoft();

            state._fsp--;

             current =iv_ruleScaleOutSoft; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScaleOutSoft2222); 

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
    // $ANTLR end "entryRuleScaleOutSoft"


    // $ANTLR start "ruleScaleOutSoft"
    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:933:1: ruleScaleOutSoft returns [EObject current=null] : ( (lv_name_0_0= 'scaleOutSoft' ) ) ;
    public final EObject ruleScaleOutSoft() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:936:28: ( ( (lv_name_0_0= 'scaleOutSoft' ) ) )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:937:1: ( (lv_name_0_0= 'scaleOutSoft' ) )
            {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:937:1: ( (lv_name_0_0= 'scaleOutSoft' ) )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:938:1: (lv_name_0_0= 'scaleOutSoft' )
            {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:938:1: (lv_name_0_0= 'scaleOutSoft' )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:939:3: lv_name_0_0= 'scaleOutSoft'
            {
            lv_name_0_0=(Token)match(input,28,FOLLOW_28_in_ruleScaleOutSoft2264); 

                    newLeafNode(lv_name_0_0, grammarAccess.getScaleOutSoftAccess().getNameScaleOutSoftKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getScaleOutSoftRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "scaleOutSoft");
            	    

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
    // $ANTLR end "ruleScaleOutSoft"


    // $ANTLR start "entryRuleScaleUpSoft"
    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:960:1: entryRuleScaleUpSoft returns [EObject current=null] : iv_ruleScaleUpSoft= ruleScaleUpSoft EOF ;
    public final EObject entryRuleScaleUpSoft() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScaleUpSoft = null;


        try {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:961:2: (iv_ruleScaleUpSoft= ruleScaleUpSoft EOF )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:962:2: iv_ruleScaleUpSoft= ruleScaleUpSoft EOF
            {
             newCompositeNode(grammarAccess.getScaleUpSoftRule()); 
            pushFollow(FOLLOW_ruleScaleUpSoft_in_entryRuleScaleUpSoft2312);
            iv_ruleScaleUpSoft=ruleScaleUpSoft();

            state._fsp--;

             current =iv_ruleScaleUpSoft; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScaleUpSoft2322); 

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
    // $ANTLR end "entryRuleScaleUpSoft"


    // $ANTLR start "ruleScaleUpSoft"
    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:969:1: ruleScaleUpSoft returns [EObject current=null] : ( (lv_name_0_0= 'scaleUpSoft' ) ) ;
    public final EObject ruleScaleUpSoft() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:972:28: ( ( (lv_name_0_0= 'scaleUpSoft' ) ) )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:973:1: ( (lv_name_0_0= 'scaleUpSoft' ) )
            {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:973:1: ( (lv_name_0_0= 'scaleUpSoft' ) )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:974:1: (lv_name_0_0= 'scaleUpSoft' )
            {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:974:1: (lv_name_0_0= 'scaleUpSoft' )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:975:3: lv_name_0_0= 'scaleUpSoft'
            {
            lv_name_0_0=(Token)match(input,29,FOLLOW_29_in_ruleScaleUpSoft2364); 

                    newLeafNode(lv_name_0_0, grammarAccess.getScaleUpSoftAccess().getNameScaleUpSoftKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getScaleUpSoftRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "scaleUpSoft");
            	    

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
    // $ANTLR end "ruleScaleUpSoft"


    // $ANTLR start "entryRuleScaleDownSoft"
    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:996:1: entryRuleScaleDownSoft returns [EObject current=null] : iv_ruleScaleDownSoft= ruleScaleDownSoft EOF ;
    public final EObject entryRuleScaleDownSoft() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScaleDownSoft = null;


        try {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:997:2: (iv_ruleScaleDownSoft= ruleScaleDownSoft EOF )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:998:2: iv_ruleScaleDownSoft= ruleScaleDownSoft EOF
            {
             newCompositeNode(grammarAccess.getScaleDownSoftRule()); 
            pushFollow(FOLLOW_ruleScaleDownSoft_in_entryRuleScaleDownSoft2412);
            iv_ruleScaleDownSoft=ruleScaleDownSoft();

            state._fsp--;

             current =iv_ruleScaleDownSoft; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScaleDownSoft2422); 

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
    // $ANTLR end "entryRuleScaleDownSoft"


    // $ANTLR start "ruleScaleDownSoft"
    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:1005:1: ruleScaleDownSoft returns [EObject current=null] : ( (lv_name_0_0= 'scaleDownSoft' ) ) ;
    public final EObject ruleScaleDownSoft() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:1008:28: ( ( (lv_name_0_0= 'scaleDownSoft' ) ) )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:1009:1: ( (lv_name_0_0= 'scaleDownSoft' ) )
            {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:1009:1: ( (lv_name_0_0= 'scaleDownSoft' ) )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:1010:1: (lv_name_0_0= 'scaleDownSoft' )
            {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:1010:1: (lv_name_0_0= 'scaleDownSoft' )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:1011:3: lv_name_0_0= 'scaleDownSoft'
            {
            lv_name_0_0=(Token)match(input,30,FOLLOW_30_in_ruleScaleDownSoft2464); 

                    newLeafNode(lv_name_0_0, grammarAccess.getScaleDownSoftAccess().getNameScaleDownSoftKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getScaleDownSoftRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "scaleDownSoft");
            	    

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
    // $ANTLR end "ruleScaleDownSoft"


    // $ANTLR start "entryRuleParam"
    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:1032:1: entryRuleParam returns [EObject current=null] : iv_ruleParam= ruleParam EOF ;
    public final EObject entryRuleParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParam = null;


        try {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:1033:2: (iv_ruleParam= ruleParam EOF )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:1034:2: iv_ruleParam= ruleParam EOF
            {
             newCompositeNode(grammarAccess.getParamRule()); 
            pushFollow(FOLLOW_ruleParam_in_entryRuleParam2512);
            iv_ruleParam=ruleParam();

            state._fsp--;

             current =iv_ruleParam; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParam2522); 

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
    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:1041:1: ruleParam returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleParam() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:1044:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:1045:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:1045:1: ( (lv_value_0_0= RULE_INT ) )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:1046:1: (lv_value_0_0= RULE_INT )
            {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:1046:1: (lv_value_0_0= RULE_INT )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:1047:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleParam2563); 

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
    public static final BitSet FOLLOW_ruleBeginScript_in_ruleScript131 = new BitSet(new long[]{0x000000007FD00200L});
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
    public static final BitSet FOLLOW_ruleBeginParallel_in_ruleParallel584 = new BitSet(new long[]{0x000000007FD00200L});
    public static final BitSet FOLLOW_ruleStatementList_in_ruleParallel605 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_PARALLEL_SEPARATOR_in_ruleParallel617 = new BitSet(new long[]{0x000000007FD00200L});
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
    public static final BitSet FOLLOW_ruleStatement_in_ruleStatementList951 = new BitSet(new long[]{0x000000007FD00202L});
    public static final BitSet FOLLOW_ruleCommand_in_entryRuleCommand987 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommand997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScaleFunction_in_ruleCommand1045 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleGenericFunction_in_ruleCommand1072 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleWaitFunction_in_ruleCommand1099 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_LP_in_ruleCommand1110 = new BitSet(new long[]{0x0000000000000440L});
    public static final BitSet FOLLOW_RULE_RP_in_ruleCommand1121 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleParam_in_ruleCommand1149 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleCommand1160 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ruleParam_in_ruleCommand1182 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_RP_in_ruleCommand1193 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_SEQUENTIAL_SEPARATOR_in_ruleCommand1205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScaleFunction_in_entryRuleScaleFunction1240 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScaleFunction1250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScaleInInfra_in_ruleScaleFunction1297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScaleOutInfra_in_ruleScaleFunction1324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScaleUpInfra_in_ruleScaleFunction1351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScaleDownInfra_in_ruleScaleFunction1378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScaleInSoft_in_ruleScaleFunction1405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScaleOutSoft_in_ruleScaleFunction1432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScaleUpSoft_in_ruleScaleFunction1459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScaleDownSoft_in_ruleScaleFunction1486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWaitFunction_in_entryRuleWaitFunction1521 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWaitFunction1531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleWaitFunction1573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericFunction_in_entryRuleGenericFunction1621 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGenericFunction1631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGenericFunction1672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScaleInInfra_in_entryRuleScaleInInfra1712 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScaleInInfra1722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleScaleInInfra1764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScaleOutInfra_in_entryRuleScaleOutInfra1812 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScaleOutInfra1822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleScaleOutInfra1864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScaleUpInfra_in_entryRuleScaleUpInfra1912 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScaleUpInfra1922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleScaleUpInfra1964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScaleDownInfra_in_entryRuleScaleDownInfra2012 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScaleDownInfra2022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleScaleDownInfra2064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScaleInSoft_in_entryRuleScaleInSoft2112 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScaleInSoft2122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleScaleInSoft2164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScaleOutSoft_in_entryRuleScaleOutSoft2212 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScaleOutSoft2222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleScaleOutSoft2264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScaleUpSoft_in_entryRuleScaleUpSoft2312 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScaleUpSoft2322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleScaleUpSoft2364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScaleDownSoft_in_entryRuleScaleDownSoft2412 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScaleDownSoft2422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleScaleDownSoft2464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParam_in_entryRuleParam2512 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParam2522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleParam2563 = new BitSet(new long[]{0x0000000000000002L});

}