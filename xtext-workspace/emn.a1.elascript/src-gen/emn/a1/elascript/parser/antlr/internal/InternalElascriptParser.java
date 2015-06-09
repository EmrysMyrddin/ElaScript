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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_PARALLEL_SEPARATOR", "RULE_LP", "RULE_COMMA", "RULE_RP", "RULE_SEQUENTIAL_SEPARATOR", "RULE_ID", "RULE_INT", "RULE_LETTER", "RULE_NUMBER", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'begin'", "'end'", "'['", "']'", "'wait'", "'scaleInInfra'", "'scaleOutInfra'", "'scaleUpInfra'", "'scaleDownInfra'", "'scaleInSoft'", "'scaleOutSoft'", "'scaleUpSoft'", "'scaleDownSoft'"
    };
    public static final int RULE_SEQUENTIAL_SEPARATOR=8;
    public static final int RULE_STRING=13;
    public static final int RULE_SL_COMMENT=15;
    public static final int T__19=19;
    public static final int T__18=18;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_ID=9;
    public static final int RULE_COMMA=6;
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
    public static final int RULE_RP=7;
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
    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:471:1: ruleCommand returns [EObject current=null] : ( (this_ScaleFunction_0= ruleScaleFunction | this_GenericFunction_1= ruleGenericFunction | this_WaitFunction_2= ruleWaitFunction ) this_LP_3= RULE_LP ( (lv_params_4_0= ruleParam ) ) (this_COMMA_5= RULE_COMMA ( (lv_params_6_0= ruleParam ) ) )* this_RP_7= RULE_RP this_SEQUENTIAL_SEPARATOR_8= RULE_SEQUENTIAL_SEPARATOR ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        Token this_LP_3=null;
        Token this_COMMA_5=null;
        Token this_RP_7=null;
        Token this_SEQUENTIAL_SEPARATOR_8=null;
        EObject this_ScaleFunction_0 = null;

        EObject this_GenericFunction_1 = null;

        EObject this_WaitFunction_2 = null;

        EObject lv_params_4_0 = null;

        EObject lv_params_6_0 = null;


         enterRule(); 
            
        try {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:474:28: ( ( (this_ScaleFunction_0= ruleScaleFunction | this_GenericFunction_1= ruleGenericFunction | this_WaitFunction_2= ruleWaitFunction ) this_LP_3= RULE_LP ( (lv_params_4_0= ruleParam ) ) (this_COMMA_5= RULE_COMMA ( (lv_params_6_0= ruleParam ) ) )* this_RP_7= RULE_RP this_SEQUENTIAL_SEPARATOR_8= RULE_SEQUENTIAL_SEPARATOR ) )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:475:1: ( (this_ScaleFunction_0= ruleScaleFunction | this_GenericFunction_1= ruleGenericFunction | this_WaitFunction_2= ruleWaitFunction ) this_LP_3= RULE_LP ( (lv_params_4_0= ruleParam ) ) (this_COMMA_5= RULE_COMMA ( (lv_params_6_0= ruleParam ) ) )* this_RP_7= RULE_RP this_SEQUENTIAL_SEPARATOR_8= RULE_SEQUENTIAL_SEPARATOR )
            {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:475:1: ( (this_ScaleFunction_0= ruleScaleFunction | this_GenericFunction_1= ruleGenericFunction | this_WaitFunction_2= ruleWaitFunction ) this_LP_3= RULE_LP ( (lv_params_4_0= ruleParam ) ) (this_COMMA_5= RULE_COMMA ( (lv_params_6_0= ruleParam ) ) )* this_RP_7= RULE_RP this_SEQUENTIAL_SEPARATOR_8= RULE_SEQUENTIAL_SEPARATOR )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:475:2: (this_ScaleFunction_0= ruleScaleFunction | this_GenericFunction_1= ruleGenericFunction | this_WaitFunction_2= ruleWaitFunction ) this_LP_3= RULE_LP ( (lv_params_4_0= ruleParam ) ) (this_COMMA_5= RULE_COMMA ( (lv_params_6_0= ruleParam ) ) )* this_RP_7= RULE_RP this_SEQUENTIAL_SEPARATOR_8= RULE_SEQUENTIAL_SEPARATOR
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
                
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:508:1: ( (lv_params_4_0= ruleParam ) )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:509:1: (lv_params_4_0= ruleParam )
            {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:509:1: (lv_params_4_0= ruleParam )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:510:3: lv_params_4_0= ruleParam
            {
             
            	        newCompositeNode(grammarAccess.getCommandAccess().getParamsParamParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleParam_in_ruleCommand1130);
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

            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:526:2: (this_COMMA_5= RULE_COMMA ( (lv_params_6_0= ruleParam ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_COMMA) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:526:3: this_COMMA_5= RULE_COMMA ( (lv_params_6_0= ruleParam ) )
            	    {
            	    this_COMMA_5=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleCommand1142); 
            	     
            	        newLeafNode(this_COMMA_5, grammarAccess.getCommandAccess().getCOMMATerminalRuleCall_3_0()); 
            	        
            	    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:530:1: ( (lv_params_6_0= ruleParam ) )
            	    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:531:1: (lv_params_6_0= ruleParam )
            	    {
            	    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:531:1: (lv_params_6_0= ruleParam )
            	    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:532:3: lv_params_6_0= ruleParam
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCommandAccess().getParamsParamParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleParam_in_ruleCommand1162);
            	    lv_params_6_0=ruleParam();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCommandRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"params",
            	            		lv_params_6_0, 
            	            		"Param");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            this_RP_7=(Token)match(input,RULE_RP,FOLLOW_RULE_RP_in_ruleCommand1175); 
             
                newLeafNode(this_RP_7, grammarAccess.getCommandAccess().getRPTerminalRuleCall_4()); 
                
            this_SEQUENTIAL_SEPARATOR_8=(Token)match(input,RULE_SEQUENTIAL_SEPARATOR,FOLLOW_RULE_SEQUENTIAL_SEPARATOR_in_ruleCommand1185); 
             
                newLeafNode(this_SEQUENTIAL_SEPARATOR_8, grammarAccess.getCommandAccess().getSEQUENTIAL_SEPARATORTerminalRuleCall_5()); 
                

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
    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:564:1: entryRuleScaleFunction returns [EObject current=null] : iv_ruleScaleFunction= ruleScaleFunction EOF ;
    public final EObject entryRuleScaleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScaleFunction = null;


        try {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:565:2: (iv_ruleScaleFunction= ruleScaleFunction EOF )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:566:2: iv_ruleScaleFunction= ruleScaleFunction EOF
            {
             newCompositeNode(grammarAccess.getScaleFunctionRule()); 
            pushFollow(FOLLOW_ruleScaleFunction_in_entryRuleScaleFunction1220);
            iv_ruleScaleFunction=ruleScaleFunction();

            state._fsp--;

             current =iv_ruleScaleFunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScaleFunction1230); 

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
    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:573:1: ruleScaleFunction returns [EObject current=null] : (this_ScaleInInfra_0= ruleScaleInInfra | this_ScaleOutInfra_1= ruleScaleOutInfra | this_ScaleUpInfra_2= ruleScaleUpInfra | this_ScaleDownInfra_3= ruleScaleDownInfra | this_ScaleInSoft_4= ruleScaleInSoft | this_ScaleOutSoft_5= ruleScaleOutSoft | this_ScaleUpSoft_6= ruleScaleUpSoft | this_ScaleDownSoft_7= ruleScaleDownSoft ) ;
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
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:576:28: ( (this_ScaleInInfra_0= ruleScaleInInfra | this_ScaleOutInfra_1= ruleScaleOutInfra | this_ScaleUpInfra_2= ruleScaleUpInfra | this_ScaleDownInfra_3= ruleScaleDownInfra | this_ScaleInSoft_4= ruleScaleInSoft | this_ScaleOutSoft_5= ruleScaleOutSoft | this_ScaleUpSoft_6= ruleScaleUpSoft | this_ScaleDownSoft_7= ruleScaleDownSoft ) )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:577:1: (this_ScaleInInfra_0= ruleScaleInInfra | this_ScaleOutInfra_1= ruleScaleOutInfra | this_ScaleUpInfra_2= ruleScaleUpInfra | this_ScaleDownInfra_3= ruleScaleDownInfra | this_ScaleInSoft_4= ruleScaleInSoft | this_ScaleOutSoft_5= ruleScaleOutSoft | this_ScaleUpSoft_6= ruleScaleUpSoft | this_ScaleDownSoft_7= ruleScaleDownSoft )
            {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:577:1: (this_ScaleInInfra_0= ruleScaleInInfra | this_ScaleOutInfra_1= ruleScaleOutInfra | this_ScaleUpInfra_2= ruleScaleUpInfra | this_ScaleDownInfra_3= ruleScaleDownInfra | this_ScaleInSoft_4= ruleScaleInSoft | this_ScaleOutSoft_5= ruleScaleOutSoft | this_ScaleUpSoft_6= ruleScaleUpSoft | this_ScaleDownSoft_7= ruleScaleDownSoft )
            int alt6=8;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt6=1;
                }
                break;
            case 24:
                {
                alt6=2;
                }
                break;
            case 25:
                {
                alt6=3;
                }
                break;
            case 26:
                {
                alt6=4;
                }
                break;
            case 27:
                {
                alt6=5;
                }
                break;
            case 28:
                {
                alt6=6;
                }
                break;
            case 29:
                {
                alt6=7;
                }
                break;
            case 30:
                {
                alt6=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:578:5: this_ScaleInInfra_0= ruleScaleInInfra
                    {
                     
                            newCompositeNode(grammarAccess.getScaleFunctionAccess().getScaleInInfraParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleScaleInInfra_in_ruleScaleFunction1277);
                    this_ScaleInInfra_0=ruleScaleInInfra();

                    state._fsp--;

                     
                            current = this_ScaleInInfra_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:588:5: this_ScaleOutInfra_1= ruleScaleOutInfra
                    {
                     
                            newCompositeNode(grammarAccess.getScaleFunctionAccess().getScaleOutInfraParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleScaleOutInfra_in_ruleScaleFunction1304);
                    this_ScaleOutInfra_1=ruleScaleOutInfra();

                    state._fsp--;

                     
                            current = this_ScaleOutInfra_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:598:5: this_ScaleUpInfra_2= ruleScaleUpInfra
                    {
                     
                            newCompositeNode(grammarAccess.getScaleFunctionAccess().getScaleUpInfraParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleScaleUpInfra_in_ruleScaleFunction1331);
                    this_ScaleUpInfra_2=ruleScaleUpInfra();

                    state._fsp--;

                     
                            current = this_ScaleUpInfra_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:608:5: this_ScaleDownInfra_3= ruleScaleDownInfra
                    {
                     
                            newCompositeNode(grammarAccess.getScaleFunctionAccess().getScaleDownInfraParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleScaleDownInfra_in_ruleScaleFunction1358);
                    this_ScaleDownInfra_3=ruleScaleDownInfra();

                    state._fsp--;

                     
                            current = this_ScaleDownInfra_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:618:5: this_ScaleInSoft_4= ruleScaleInSoft
                    {
                     
                            newCompositeNode(grammarAccess.getScaleFunctionAccess().getScaleInSoftParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleScaleInSoft_in_ruleScaleFunction1385);
                    this_ScaleInSoft_4=ruleScaleInSoft();

                    state._fsp--;

                     
                            current = this_ScaleInSoft_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:628:5: this_ScaleOutSoft_5= ruleScaleOutSoft
                    {
                     
                            newCompositeNode(grammarAccess.getScaleFunctionAccess().getScaleOutSoftParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleScaleOutSoft_in_ruleScaleFunction1412);
                    this_ScaleOutSoft_5=ruleScaleOutSoft();

                    state._fsp--;

                     
                            current = this_ScaleOutSoft_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:638:5: this_ScaleUpSoft_6= ruleScaleUpSoft
                    {
                     
                            newCompositeNode(grammarAccess.getScaleFunctionAccess().getScaleUpSoftParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleScaleUpSoft_in_ruleScaleFunction1439);
                    this_ScaleUpSoft_6=ruleScaleUpSoft();

                    state._fsp--;

                     
                            current = this_ScaleUpSoft_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:648:5: this_ScaleDownSoft_7= ruleScaleDownSoft
                    {
                     
                            newCompositeNode(grammarAccess.getScaleFunctionAccess().getScaleDownSoftParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleScaleDownSoft_in_ruleScaleFunction1466);
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
    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:664:1: entryRuleWaitFunction returns [EObject current=null] : iv_ruleWaitFunction= ruleWaitFunction EOF ;
    public final EObject entryRuleWaitFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWaitFunction = null;


        try {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:665:2: (iv_ruleWaitFunction= ruleWaitFunction EOF )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:666:2: iv_ruleWaitFunction= ruleWaitFunction EOF
            {
             newCompositeNode(grammarAccess.getWaitFunctionRule()); 
            pushFollow(FOLLOW_ruleWaitFunction_in_entryRuleWaitFunction1501);
            iv_ruleWaitFunction=ruleWaitFunction();

            state._fsp--;

             current =iv_ruleWaitFunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWaitFunction1511); 

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
    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:673:1: ruleWaitFunction returns [EObject current=null] : ( (lv_name_0_0= 'wait' ) ) ;
    public final EObject ruleWaitFunction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:676:28: ( ( (lv_name_0_0= 'wait' ) ) )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:677:1: ( (lv_name_0_0= 'wait' ) )
            {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:677:1: ( (lv_name_0_0= 'wait' ) )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:678:1: (lv_name_0_0= 'wait' )
            {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:678:1: (lv_name_0_0= 'wait' )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:679:3: lv_name_0_0= 'wait'
            {
            lv_name_0_0=(Token)match(input,22,FOLLOW_22_in_ruleWaitFunction1553); 

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
    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:700:1: entryRuleGenericFunction returns [EObject current=null] : iv_ruleGenericFunction= ruleGenericFunction EOF ;
    public final EObject entryRuleGenericFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenericFunction = null;


        try {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:701:2: (iv_ruleGenericFunction= ruleGenericFunction EOF )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:702:2: iv_ruleGenericFunction= ruleGenericFunction EOF
            {
             newCompositeNode(grammarAccess.getGenericFunctionRule()); 
            pushFollow(FOLLOW_ruleGenericFunction_in_entryRuleGenericFunction1601);
            iv_ruleGenericFunction=ruleGenericFunction();

            state._fsp--;

             current =iv_ruleGenericFunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGenericFunction1611); 

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
    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:709:1: ruleGenericFunction returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleGenericFunction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:712:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:713:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:713:1: ( (lv_name_0_0= RULE_ID ) )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:714:1: (lv_name_0_0= RULE_ID )
            {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:714:1: (lv_name_0_0= RULE_ID )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:715:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGenericFunction1652); 

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
    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:739:1: entryRuleScaleInInfra returns [EObject current=null] : iv_ruleScaleInInfra= ruleScaleInInfra EOF ;
    public final EObject entryRuleScaleInInfra() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScaleInInfra = null;


        try {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:740:2: (iv_ruleScaleInInfra= ruleScaleInInfra EOF )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:741:2: iv_ruleScaleInInfra= ruleScaleInInfra EOF
            {
             newCompositeNode(grammarAccess.getScaleInInfraRule()); 
            pushFollow(FOLLOW_ruleScaleInInfra_in_entryRuleScaleInInfra1692);
            iv_ruleScaleInInfra=ruleScaleInInfra();

            state._fsp--;

             current =iv_ruleScaleInInfra; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScaleInInfra1702); 

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
    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:748:1: ruleScaleInInfra returns [EObject current=null] : ( (lv_name_0_0= 'scaleInInfra' ) ) ;
    public final EObject ruleScaleInInfra() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:751:28: ( ( (lv_name_0_0= 'scaleInInfra' ) ) )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:752:1: ( (lv_name_0_0= 'scaleInInfra' ) )
            {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:752:1: ( (lv_name_0_0= 'scaleInInfra' ) )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:753:1: (lv_name_0_0= 'scaleInInfra' )
            {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:753:1: (lv_name_0_0= 'scaleInInfra' )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:754:3: lv_name_0_0= 'scaleInInfra'
            {
            lv_name_0_0=(Token)match(input,23,FOLLOW_23_in_ruleScaleInInfra1744); 

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
    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:775:1: entryRuleScaleOutInfra returns [EObject current=null] : iv_ruleScaleOutInfra= ruleScaleOutInfra EOF ;
    public final EObject entryRuleScaleOutInfra() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScaleOutInfra = null;


        try {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:776:2: (iv_ruleScaleOutInfra= ruleScaleOutInfra EOF )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:777:2: iv_ruleScaleOutInfra= ruleScaleOutInfra EOF
            {
             newCompositeNode(grammarAccess.getScaleOutInfraRule()); 
            pushFollow(FOLLOW_ruleScaleOutInfra_in_entryRuleScaleOutInfra1792);
            iv_ruleScaleOutInfra=ruleScaleOutInfra();

            state._fsp--;

             current =iv_ruleScaleOutInfra; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScaleOutInfra1802); 

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
    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:784:1: ruleScaleOutInfra returns [EObject current=null] : ( (lv_name_0_0= 'scaleOutInfra' ) ) ;
    public final EObject ruleScaleOutInfra() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:787:28: ( ( (lv_name_0_0= 'scaleOutInfra' ) ) )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:788:1: ( (lv_name_0_0= 'scaleOutInfra' ) )
            {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:788:1: ( (lv_name_0_0= 'scaleOutInfra' ) )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:789:1: (lv_name_0_0= 'scaleOutInfra' )
            {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:789:1: (lv_name_0_0= 'scaleOutInfra' )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:790:3: lv_name_0_0= 'scaleOutInfra'
            {
            lv_name_0_0=(Token)match(input,24,FOLLOW_24_in_ruleScaleOutInfra1844); 

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
    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:811:1: entryRuleScaleUpInfra returns [EObject current=null] : iv_ruleScaleUpInfra= ruleScaleUpInfra EOF ;
    public final EObject entryRuleScaleUpInfra() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScaleUpInfra = null;


        try {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:812:2: (iv_ruleScaleUpInfra= ruleScaleUpInfra EOF )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:813:2: iv_ruleScaleUpInfra= ruleScaleUpInfra EOF
            {
             newCompositeNode(grammarAccess.getScaleUpInfraRule()); 
            pushFollow(FOLLOW_ruleScaleUpInfra_in_entryRuleScaleUpInfra1892);
            iv_ruleScaleUpInfra=ruleScaleUpInfra();

            state._fsp--;

             current =iv_ruleScaleUpInfra; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScaleUpInfra1902); 

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
    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:820:1: ruleScaleUpInfra returns [EObject current=null] : ( (lv_name_0_0= 'scaleUpInfra' ) ) ;
    public final EObject ruleScaleUpInfra() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:823:28: ( ( (lv_name_0_0= 'scaleUpInfra' ) ) )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:824:1: ( (lv_name_0_0= 'scaleUpInfra' ) )
            {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:824:1: ( (lv_name_0_0= 'scaleUpInfra' ) )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:825:1: (lv_name_0_0= 'scaleUpInfra' )
            {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:825:1: (lv_name_0_0= 'scaleUpInfra' )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:826:3: lv_name_0_0= 'scaleUpInfra'
            {
            lv_name_0_0=(Token)match(input,25,FOLLOW_25_in_ruleScaleUpInfra1944); 

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
    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:847:1: entryRuleScaleDownInfra returns [EObject current=null] : iv_ruleScaleDownInfra= ruleScaleDownInfra EOF ;
    public final EObject entryRuleScaleDownInfra() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScaleDownInfra = null;


        try {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:848:2: (iv_ruleScaleDownInfra= ruleScaleDownInfra EOF )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:849:2: iv_ruleScaleDownInfra= ruleScaleDownInfra EOF
            {
             newCompositeNode(grammarAccess.getScaleDownInfraRule()); 
            pushFollow(FOLLOW_ruleScaleDownInfra_in_entryRuleScaleDownInfra1992);
            iv_ruleScaleDownInfra=ruleScaleDownInfra();

            state._fsp--;

             current =iv_ruleScaleDownInfra; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScaleDownInfra2002); 

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
    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:856:1: ruleScaleDownInfra returns [EObject current=null] : ( (lv_name_0_0= 'scaleDownInfra' ) ) ;
    public final EObject ruleScaleDownInfra() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:859:28: ( ( (lv_name_0_0= 'scaleDownInfra' ) ) )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:860:1: ( (lv_name_0_0= 'scaleDownInfra' ) )
            {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:860:1: ( (lv_name_0_0= 'scaleDownInfra' ) )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:861:1: (lv_name_0_0= 'scaleDownInfra' )
            {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:861:1: (lv_name_0_0= 'scaleDownInfra' )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:862:3: lv_name_0_0= 'scaleDownInfra'
            {
            lv_name_0_0=(Token)match(input,26,FOLLOW_26_in_ruleScaleDownInfra2044); 

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
    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:883:1: entryRuleScaleInSoft returns [EObject current=null] : iv_ruleScaleInSoft= ruleScaleInSoft EOF ;
    public final EObject entryRuleScaleInSoft() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScaleInSoft = null;


        try {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:884:2: (iv_ruleScaleInSoft= ruleScaleInSoft EOF )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:885:2: iv_ruleScaleInSoft= ruleScaleInSoft EOF
            {
             newCompositeNode(grammarAccess.getScaleInSoftRule()); 
            pushFollow(FOLLOW_ruleScaleInSoft_in_entryRuleScaleInSoft2092);
            iv_ruleScaleInSoft=ruleScaleInSoft();

            state._fsp--;

             current =iv_ruleScaleInSoft; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScaleInSoft2102); 

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
    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:892:1: ruleScaleInSoft returns [EObject current=null] : ( (lv_name_0_0= 'scaleInSoft' ) ) ;
    public final EObject ruleScaleInSoft() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:895:28: ( ( (lv_name_0_0= 'scaleInSoft' ) ) )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:896:1: ( (lv_name_0_0= 'scaleInSoft' ) )
            {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:896:1: ( (lv_name_0_0= 'scaleInSoft' ) )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:897:1: (lv_name_0_0= 'scaleInSoft' )
            {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:897:1: (lv_name_0_0= 'scaleInSoft' )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:898:3: lv_name_0_0= 'scaleInSoft'
            {
            lv_name_0_0=(Token)match(input,27,FOLLOW_27_in_ruleScaleInSoft2144); 

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
    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:919:1: entryRuleScaleOutSoft returns [EObject current=null] : iv_ruleScaleOutSoft= ruleScaleOutSoft EOF ;
    public final EObject entryRuleScaleOutSoft() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScaleOutSoft = null;


        try {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:920:2: (iv_ruleScaleOutSoft= ruleScaleOutSoft EOF )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:921:2: iv_ruleScaleOutSoft= ruleScaleOutSoft EOF
            {
             newCompositeNode(grammarAccess.getScaleOutSoftRule()); 
            pushFollow(FOLLOW_ruleScaleOutSoft_in_entryRuleScaleOutSoft2192);
            iv_ruleScaleOutSoft=ruleScaleOutSoft();

            state._fsp--;

             current =iv_ruleScaleOutSoft; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScaleOutSoft2202); 

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
    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:928:1: ruleScaleOutSoft returns [EObject current=null] : ( (lv_name_0_0= 'scaleOutSoft' ) ) ;
    public final EObject ruleScaleOutSoft() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:931:28: ( ( (lv_name_0_0= 'scaleOutSoft' ) ) )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:932:1: ( (lv_name_0_0= 'scaleOutSoft' ) )
            {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:932:1: ( (lv_name_0_0= 'scaleOutSoft' ) )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:933:1: (lv_name_0_0= 'scaleOutSoft' )
            {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:933:1: (lv_name_0_0= 'scaleOutSoft' )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:934:3: lv_name_0_0= 'scaleOutSoft'
            {
            lv_name_0_0=(Token)match(input,28,FOLLOW_28_in_ruleScaleOutSoft2244); 

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
    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:955:1: entryRuleScaleUpSoft returns [EObject current=null] : iv_ruleScaleUpSoft= ruleScaleUpSoft EOF ;
    public final EObject entryRuleScaleUpSoft() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScaleUpSoft = null;


        try {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:956:2: (iv_ruleScaleUpSoft= ruleScaleUpSoft EOF )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:957:2: iv_ruleScaleUpSoft= ruleScaleUpSoft EOF
            {
             newCompositeNode(grammarAccess.getScaleUpSoftRule()); 
            pushFollow(FOLLOW_ruleScaleUpSoft_in_entryRuleScaleUpSoft2292);
            iv_ruleScaleUpSoft=ruleScaleUpSoft();

            state._fsp--;

             current =iv_ruleScaleUpSoft; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScaleUpSoft2302); 

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
    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:964:1: ruleScaleUpSoft returns [EObject current=null] : ( (lv_name_0_0= 'scaleUpSoft' ) ) ;
    public final EObject ruleScaleUpSoft() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:967:28: ( ( (lv_name_0_0= 'scaleUpSoft' ) ) )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:968:1: ( (lv_name_0_0= 'scaleUpSoft' ) )
            {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:968:1: ( (lv_name_0_0= 'scaleUpSoft' ) )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:969:1: (lv_name_0_0= 'scaleUpSoft' )
            {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:969:1: (lv_name_0_0= 'scaleUpSoft' )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:970:3: lv_name_0_0= 'scaleUpSoft'
            {
            lv_name_0_0=(Token)match(input,29,FOLLOW_29_in_ruleScaleUpSoft2344); 

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
    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:991:1: entryRuleScaleDownSoft returns [EObject current=null] : iv_ruleScaleDownSoft= ruleScaleDownSoft EOF ;
    public final EObject entryRuleScaleDownSoft() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScaleDownSoft = null;


        try {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:992:2: (iv_ruleScaleDownSoft= ruleScaleDownSoft EOF )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:993:2: iv_ruleScaleDownSoft= ruleScaleDownSoft EOF
            {
             newCompositeNode(grammarAccess.getScaleDownSoftRule()); 
            pushFollow(FOLLOW_ruleScaleDownSoft_in_entryRuleScaleDownSoft2392);
            iv_ruleScaleDownSoft=ruleScaleDownSoft();

            state._fsp--;

             current =iv_ruleScaleDownSoft; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScaleDownSoft2402); 

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
    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:1000:1: ruleScaleDownSoft returns [EObject current=null] : ( (lv_name_0_0= 'scaleDownSoft' ) ) ;
    public final EObject ruleScaleDownSoft() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:1003:28: ( ( (lv_name_0_0= 'scaleDownSoft' ) ) )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:1004:1: ( (lv_name_0_0= 'scaleDownSoft' ) )
            {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:1004:1: ( (lv_name_0_0= 'scaleDownSoft' ) )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:1005:1: (lv_name_0_0= 'scaleDownSoft' )
            {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:1005:1: (lv_name_0_0= 'scaleDownSoft' )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:1006:3: lv_name_0_0= 'scaleDownSoft'
            {
            lv_name_0_0=(Token)match(input,30,FOLLOW_30_in_ruleScaleDownSoft2444); 

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
    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:1027:1: entryRuleParam returns [EObject current=null] : iv_ruleParam= ruleParam EOF ;
    public final EObject entryRuleParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParam = null;


        try {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:1028:2: (iv_ruleParam= ruleParam EOF )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:1029:2: iv_ruleParam= ruleParam EOF
            {
             newCompositeNode(grammarAccess.getParamRule()); 
            pushFollow(FOLLOW_ruleParam_in_entryRuleParam2492);
            iv_ruleParam=ruleParam();

            state._fsp--;

             current =iv_ruleParam; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParam2502); 

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
    // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:1036:1: ruleParam returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleParam() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:1039:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:1040:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:1040:1: ( (lv_value_0_0= RULE_INT ) )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:1041:1: (lv_value_0_0= RULE_INT )
            {
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:1041:1: (lv_value_0_0= RULE_INT )
            // ../emn.a1.elascript/src-gen/emn/a1/elascript/parser/antlr/internal/InternalElascript.g:1042:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleParam2543); 

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
    public static final BitSet FOLLOW_RULE_LP_in_ruleCommand1110 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ruleParam_in_ruleCommand1130 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleCommand1142 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ruleParam_in_ruleCommand1162 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_RULE_RP_in_ruleCommand1175 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_SEQUENTIAL_SEPARATOR_in_ruleCommand1185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScaleFunction_in_entryRuleScaleFunction1220 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScaleFunction1230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScaleInInfra_in_ruleScaleFunction1277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScaleOutInfra_in_ruleScaleFunction1304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScaleUpInfra_in_ruleScaleFunction1331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScaleDownInfra_in_ruleScaleFunction1358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScaleInSoft_in_ruleScaleFunction1385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScaleOutSoft_in_ruleScaleFunction1412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScaleUpSoft_in_ruleScaleFunction1439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScaleDownSoft_in_ruleScaleFunction1466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWaitFunction_in_entryRuleWaitFunction1501 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWaitFunction1511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleWaitFunction1553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericFunction_in_entryRuleGenericFunction1601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGenericFunction1611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGenericFunction1652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScaleInInfra_in_entryRuleScaleInInfra1692 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScaleInInfra1702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleScaleInInfra1744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScaleOutInfra_in_entryRuleScaleOutInfra1792 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScaleOutInfra1802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleScaleOutInfra1844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScaleUpInfra_in_entryRuleScaleUpInfra1892 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScaleUpInfra1902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleScaleUpInfra1944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScaleDownInfra_in_entryRuleScaleDownInfra1992 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScaleDownInfra2002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleScaleDownInfra2044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScaleInSoft_in_entryRuleScaleInSoft2092 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScaleInSoft2102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleScaleInSoft2144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScaleOutSoft_in_entryRuleScaleOutSoft2192 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScaleOutSoft2202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleScaleOutSoft2244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScaleUpSoft_in_entryRuleScaleUpSoft2292 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScaleUpSoft2302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleScaleUpSoft2344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScaleDownSoft_in_entryRuleScaleDownSoft2392 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScaleDownSoft2402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleScaleDownSoft2444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParam_in_entryRuleParam2492 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParam2502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleParam2543 = new BitSet(new long[]{0x0000000000000002L});

}