package org.elascript.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.elascript.services.ElascriptGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalElascriptParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SPLIT", "RULE_PARALLEL_SEPARATOR", "RULE_JOIN", "RULE_LP", "RULE_COMMA", "RULE_RP", "RULE_SEQUENTIAL_SEPARATOR", "RULE_ID", "RULE_INT", "RULE_SCALE_IN", "RULE_SCALE_OUT", "RULE_SCALE_UP", "RULE_SCALE_DOWN", "RULE_SOFT", "RULE_INF", "RULE_LETTER", "RULE_NUMBER", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_SEQUENTIAL_SEPARATOR=10;
    public static final int RULE_INF=18;
    public static final int RULE_STRING=21;
    public static final int RULE_SPLIT=4;
    public static final int RULE_SL_COMMENT=23;
    public static final int RULE_SCALE_DOWN=16;
    public static final int EOF=-1;
    public static final int RULE_ID=11;
    public static final int RULE_SOFT=17;
    public static final int RULE_COMMA=8;
    public static final int RULE_WS=24;
    public static final int RULE_PARALLEL_SEPARATOR=5;
    public static final int RULE_JOIN=6;
    public static final int RULE_ANY_OTHER=25;
    public static final int RULE_NUMBER=20;
    public static final int RULE_LETTER=19;
    public static final int RULE_SCALE_UP=15;
    public static final int RULE_INT=12;
    public static final int RULE_ML_COMMENT=22;
    public static final int RULE_SCALE_IN=13;
    public static final int RULE_RP=9;
    public static final int RULE_SCALE_OUT=14;
    public static final int RULE_LP=7;

    // delegates
    // delegators


        public InternalElascriptParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalElascriptParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalElascriptParser.tokenNames; }
    public String getGrammarFileName() { return "../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g"; }



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
    // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:67:1: entryRuleScript returns [EObject current=null] : iv_ruleScript= ruleScript EOF ;
    public final EObject entryRuleScript() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScript = null;


        try {
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:68:2: (iv_ruleScript= ruleScript EOF )
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:69:2: iv_ruleScript= ruleScript EOF
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
    // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:76:1: ruleScript returns [EObject current=null] : ( (lv_scriptStatements_0_0= ruleStatement ) )* ;
    public final EObject ruleScript() throws RecognitionException {
        EObject current = null;

        EObject lv_scriptStatements_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:79:28: ( ( (lv_scriptStatements_0_0= ruleStatement ) )* )
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:80:1: ( (lv_scriptStatements_0_0= ruleStatement ) )*
            {
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:80:1: ( (lv_scriptStatements_0_0= ruleStatement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_SPLIT||LA1_0==RULE_ID||(LA1_0>=RULE_SCALE_IN && LA1_0<=RULE_SCALE_DOWN)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:81:1: (lv_scriptStatements_0_0= ruleStatement )
            	    {
            	    // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:81:1: (lv_scriptStatements_0_0= ruleStatement )
            	    // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:82:3: lv_scriptStatements_0_0= ruleStatement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScriptAccess().getScriptStatementsStatementParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStatement_in_ruleScript130);
            	    lv_scriptStatements_0_0=ruleStatement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getScriptRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"scriptStatements",
            	            		lv_scriptStatements_0_0, 
            	            		"Statement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
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
    // $ANTLR end "ruleScript"


    // $ANTLR start "entryRuleStatement"
    // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:106:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:107:2: (iv_ruleStatement= ruleStatement EOF )
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:108:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement166);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement176); 

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
    // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:115:1: ruleStatement returns [EObject current=null] : (this_Command_0= ruleCommand | this_Parallel_1= ruleParallel ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_Command_0 = null;

        EObject this_Parallel_1 = null;


         enterRule(); 
            
        try {
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:118:28: ( (this_Command_0= ruleCommand | this_Parallel_1= ruleParallel ) )
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:119:1: (this_Command_0= ruleCommand | this_Parallel_1= ruleParallel )
            {
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:119:1: (this_Command_0= ruleCommand | this_Parallel_1= ruleParallel )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID||(LA2_0>=RULE_SCALE_IN && LA2_0<=RULE_SCALE_DOWN)) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_SPLIT) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:120:5: this_Command_0= ruleCommand
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getCommandParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleCommand_in_ruleStatement223);
                    this_Command_0=ruleCommand();

                    state._fsp--;

                     
                            current = this_Command_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:130:5: this_Parallel_1= ruleParallel
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getParallelParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleParallel_in_ruleStatement250);
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
    // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:146:1: entryRuleParallel returns [EObject current=null] : iv_ruleParallel= ruleParallel EOF ;
    public final EObject entryRuleParallel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParallel = null;


        try {
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:147:2: (iv_ruleParallel= ruleParallel EOF )
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:148:2: iv_ruleParallel= ruleParallel EOF
            {
             newCompositeNode(grammarAccess.getParallelRule()); 
            pushFollow(FOLLOW_ruleParallel_in_entryRuleParallel285);
            iv_ruleParallel=ruleParallel();

            state._fsp--;

             current =iv_ruleParallel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParallel295); 

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
    // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:155:1: ruleParallel returns [EObject current=null] : (this_SPLIT_0= RULE_SPLIT ( (lv_statements_1_0= ruleStatementList ) ) (this_PARALLEL_SEPARATOR_2= RULE_PARALLEL_SEPARATOR ( (lv_statements_3_0= ruleStatementList ) ) )+ this_JOIN_4= RULE_JOIN ) ;
    public final EObject ruleParallel() throws RecognitionException {
        EObject current = null;

        Token this_SPLIT_0=null;
        Token this_PARALLEL_SEPARATOR_2=null;
        Token this_JOIN_4=null;
        EObject lv_statements_1_0 = null;

        EObject lv_statements_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:158:28: ( (this_SPLIT_0= RULE_SPLIT ( (lv_statements_1_0= ruleStatementList ) ) (this_PARALLEL_SEPARATOR_2= RULE_PARALLEL_SEPARATOR ( (lv_statements_3_0= ruleStatementList ) ) )+ this_JOIN_4= RULE_JOIN ) )
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:159:1: (this_SPLIT_0= RULE_SPLIT ( (lv_statements_1_0= ruleStatementList ) ) (this_PARALLEL_SEPARATOR_2= RULE_PARALLEL_SEPARATOR ( (lv_statements_3_0= ruleStatementList ) ) )+ this_JOIN_4= RULE_JOIN )
            {
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:159:1: (this_SPLIT_0= RULE_SPLIT ( (lv_statements_1_0= ruleStatementList ) ) (this_PARALLEL_SEPARATOR_2= RULE_PARALLEL_SEPARATOR ( (lv_statements_3_0= ruleStatementList ) ) )+ this_JOIN_4= RULE_JOIN )
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:159:2: this_SPLIT_0= RULE_SPLIT ( (lv_statements_1_0= ruleStatementList ) ) (this_PARALLEL_SEPARATOR_2= RULE_PARALLEL_SEPARATOR ( (lv_statements_3_0= ruleStatementList ) ) )+ this_JOIN_4= RULE_JOIN
            {
            this_SPLIT_0=(Token)match(input,RULE_SPLIT,FOLLOW_RULE_SPLIT_in_ruleParallel331); 
             
                newLeafNode(this_SPLIT_0, grammarAccess.getParallelAccess().getSPLITTerminalRuleCall_0()); 
                
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:163:1: ( (lv_statements_1_0= ruleStatementList ) )
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:164:1: (lv_statements_1_0= ruleStatementList )
            {
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:164:1: (lv_statements_1_0= ruleStatementList )
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:165:3: lv_statements_1_0= ruleStatementList
            {
             
            	        newCompositeNode(grammarAccess.getParallelAccess().getStatementsStatementListParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleStatementList_in_ruleParallel351);
            lv_statements_1_0=ruleStatementList();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParallelRule());
            	        }
                   		add(
                   			current, 
                   			"statements",
                    		lv_statements_1_0, 
                    		"StatementList");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:181:2: (this_PARALLEL_SEPARATOR_2= RULE_PARALLEL_SEPARATOR ( (lv_statements_3_0= ruleStatementList ) ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_PARALLEL_SEPARATOR) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:181:3: this_PARALLEL_SEPARATOR_2= RULE_PARALLEL_SEPARATOR ( (lv_statements_3_0= ruleStatementList ) )
            	    {
            	    this_PARALLEL_SEPARATOR_2=(Token)match(input,RULE_PARALLEL_SEPARATOR,FOLLOW_RULE_PARALLEL_SEPARATOR_in_ruleParallel363); 
            	     
            	        newLeafNode(this_PARALLEL_SEPARATOR_2, grammarAccess.getParallelAccess().getPARALLEL_SEPARATORTerminalRuleCall_2_0()); 
            	        
            	    // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:185:1: ( (lv_statements_3_0= ruleStatementList ) )
            	    // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:186:1: (lv_statements_3_0= ruleStatementList )
            	    {
            	    // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:186:1: (lv_statements_3_0= ruleStatementList )
            	    // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:187:3: lv_statements_3_0= ruleStatementList
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getParallelAccess().getStatementsStatementListParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStatementList_in_ruleParallel383);
            	    lv_statements_3_0=ruleStatementList();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getParallelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"statements",
            	            		lv_statements_3_0, 
            	            		"StatementList");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


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

            this_JOIN_4=(Token)match(input,RULE_JOIN,FOLLOW_RULE_JOIN_in_ruleParallel396); 
             
                newLeafNode(this_JOIN_4, grammarAccess.getParallelAccess().getJOINTerminalRuleCall_3()); 
                

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


    // $ANTLR start "entryRuleStatementList"
    // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:215:1: entryRuleStatementList returns [EObject current=null] : iv_ruleStatementList= ruleStatementList EOF ;
    public final EObject entryRuleStatementList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatementList = null;


        try {
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:216:2: (iv_ruleStatementList= ruleStatementList EOF )
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:217:2: iv_ruleStatementList= ruleStatementList EOF
            {
             newCompositeNode(grammarAccess.getStatementListRule()); 
            pushFollow(FOLLOW_ruleStatementList_in_entryRuleStatementList431);
            iv_ruleStatementList=ruleStatementList();

            state._fsp--;

             current =iv_ruleStatementList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatementList441); 

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
    // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:224:1: ruleStatementList returns [EObject current=null] : ( (lv_statements_0_0= ruleStatement ) )+ ;
    public final EObject ruleStatementList() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:227:28: ( ( (lv_statements_0_0= ruleStatement ) )+ )
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:228:1: ( (lv_statements_0_0= ruleStatement ) )+
            {
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:228:1: ( (lv_statements_0_0= ruleStatement ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_SPLIT||LA4_0==RULE_ID||(LA4_0>=RULE_SCALE_IN && LA4_0<=RULE_SCALE_DOWN)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:229:1: (lv_statements_0_0= ruleStatement )
            	    {
            	    // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:229:1: (lv_statements_0_0= ruleStatement )
            	    // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:230:3: lv_statements_0_0= ruleStatement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStatementListAccess().getStatementsStatementParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStatement_in_ruleStatementList486);
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
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
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
    // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:254:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:255:2: (iv_ruleCommand= ruleCommand EOF )
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:256:2: iv_ruleCommand= ruleCommand EOF
            {
             newCompositeNode(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_ruleCommand_in_entryRuleCommand522);
            iv_ruleCommand=ruleCommand();

            state._fsp--;

             current =iv_ruleCommand; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommand532); 

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
    // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:263:1: ruleCommand returns [EObject current=null] : ( ( (lv_name_0_0= ruleFunctionName ) ) this_LP_1= RULE_LP ( (lv_params_2_0= ruleParam ) ) (this_COMMA_3= RULE_COMMA ( (lv_params_4_0= ruleParam ) ) )* this_RP_5= RULE_RP this_SEQUENTIAL_SEPARATOR_6= RULE_SEQUENTIAL_SEPARATOR ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        Token this_LP_1=null;
        Token this_COMMA_3=null;
        Token this_RP_5=null;
        Token this_SEQUENTIAL_SEPARATOR_6=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_params_2_0 = null;

        EObject lv_params_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:266:28: ( ( ( (lv_name_0_0= ruleFunctionName ) ) this_LP_1= RULE_LP ( (lv_params_2_0= ruleParam ) ) (this_COMMA_3= RULE_COMMA ( (lv_params_4_0= ruleParam ) ) )* this_RP_5= RULE_RP this_SEQUENTIAL_SEPARATOR_6= RULE_SEQUENTIAL_SEPARATOR ) )
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:267:1: ( ( (lv_name_0_0= ruleFunctionName ) ) this_LP_1= RULE_LP ( (lv_params_2_0= ruleParam ) ) (this_COMMA_3= RULE_COMMA ( (lv_params_4_0= ruleParam ) ) )* this_RP_5= RULE_RP this_SEQUENTIAL_SEPARATOR_6= RULE_SEQUENTIAL_SEPARATOR )
            {
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:267:1: ( ( (lv_name_0_0= ruleFunctionName ) ) this_LP_1= RULE_LP ( (lv_params_2_0= ruleParam ) ) (this_COMMA_3= RULE_COMMA ( (lv_params_4_0= ruleParam ) ) )* this_RP_5= RULE_RP this_SEQUENTIAL_SEPARATOR_6= RULE_SEQUENTIAL_SEPARATOR )
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:267:2: ( (lv_name_0_0= ruleFunctionName ) ) this_LP_1= RULE_LP ( (lv_params_2_0= ruleParam ) ) (this_COMMA_3= RULE_COMMA ( (lv_params_4_0= ruleParam ) ) )* this_RP_5= RULE_RP this_SEQUENTIAL_SEPARATOR_6= RULE_SEQUENTIAL_SEPARATOR
            {
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:267:2: ( (lv_name_0_0= ruleFunctionName ) )
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:268:1: (lv_name_0_0= ruleFunctionName )
            {
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:268:1: (lv_name_0_0= ruleFunctionName )
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:269:3: lv_name_0_0= ruleFunctionName
            {
             
            	        newCompositeNode(grammarAccess.getCommandAccess().getNameFunctionNameParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleFunctionName_in_ruleCommand578);
            lv_name_0_0=ruleFunctionName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCommandRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"FunctionName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            this_LP_1=(Token)match(input,RULE_LP,FOLLOW_RULE_LP_in_ruleCommand589); 
             
                newLeafNode(this_LP_1, grammarAccess.getCommandAccess().getLPTerminalRuleCall_1()); 
                
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:289:1: ( (lv_params_2_0= ruleParam ) )
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:290:1: (lv_params_2_0= ruleParam )
            {
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:290:1: (lv_params_2_0= ruleParam )
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:291:3: lv_params_2_0= ruleParam
            {
             
            	        newCompositeNode(grammarAccess.getCommandAccess().getParamsParamParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleParam_in_ruleCommand609);
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

            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:307:2: (this_COMMA_3= RULE_COMMA ( (lv_params_4_0= ruleParam ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_COMMA) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:307:3: this_COMMA_3= RULE_COMMA ( (lv_params_4_0= ruleParam ) )
            	    {
            	    this_COMMA_3=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleCommand621); 
            	     
            	        newLeafNode(this_COMMA_3, grammarAccess.getCommandAccess().getCOMMATerminalRuleCall_3_0()); 
            	        
            	    // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:311:1: ( (lv_params_4_0= ruleParam ) )
            	    // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:312:1: (lv_params_4_0= ruleParam )
            	    {
            	    // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:312:1: (lv_params_4_0= ruleParam )
            	    // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:313:3: lv_params_4_0= ruleParam
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCommandAccess().getParamsParamParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleParam_in_ruleCommand641);
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
            	    break loop5;
                }
            } while (true);

            this_RP_5=(Token)match(input,RULE_RP,FOLLOW_RULE_RP_in_ruleCommand654); 
             
                newLeafNode(this_RP_5, grammarAccess.getCommandAccess().getRPTerminalRuleCall_4()); 
                
            this_SEQUENTIAL_SEPARATOR_6=(Token)match(input,RULE_SEQUENTIAL_SEPARATOR,FOLLOW_RULE_SEQUENTIAL_SEPARATOR_in_ruleCommand664); 
             
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


    // $ANTLR start "entryRuleFunctionName"
    // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:345:1: entryRuleFunctionName returns [String current=null] : iv_ruleFunctionName= ruleFunctionName EOF ;
    public final String entryRuleFunctionName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFunctionName = null;


        try {
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:346:2: (iv_ruleFunctionName= ruleFunctionName EOF )
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:347:2: iv_ruleFunctionName= ruleFunctionName EOF
            {
             newCompositeNode(grammarAccess.getFunctionNameRule()); 
            pushFollow(FOLLOW_ruleFunctionName_in_entryRuleFunctionName700);
            iv_ruleFunctionName=ruleFunctionName();

            state._fsp--;

             current =iv_ruleFunctionName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionName711); 

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
    // $ANTLR end "entryRuleFunctionName"


    // $ANTLR start "ruleFunctionName"
    // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:354:1: ruleFunctionName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_Scale_0= ruleScale this_Type_1= ruleType ) | this_ID_2= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleFunctionName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_2=null;
        AntlrDatatypeRuleToken this_Scale_0 = null;

        AntlrDatatypeRuleToken this_Type_1 = null;


         enterRule(); 
            
        try {
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:357:28: ( ( (this_Scale_0= ruleScale this_Type_1= ruleType ) | this_ID_2= RULE_ID ) )
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:358:1: ( (this_Scale_0= ruleScale this_Type_1= ruleType ) | this_ID_2= RULE_ID )
            {
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:358:1: ( (this_Scale_0= ruleScale this_Type_1= ruleType ) | this_ID_2= RULE_ID )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULE_SCALE_IN && LA6_0<=RULE_SCALE_DOWN)) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:358:2: (this_Scale_0= ruleScale this_Type_1= ruleType )
                    {
                    // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:358:2: (this_Scale_0= ruleScale this_Type_1= ruleType )
                    // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:359:5: this_Scale_0= ruleScale this_Type_1= ruleType
                    {
                     
                            newCompositeNode(grammarAccess.getFunctionNameAccess().getScaleParserRuleCall_0_0()); 
                        
                    pushFollow(FOLLOW_ruleScale_in_ruleFunctionName759);
                    this_Scale_0=ruleScale();

                    state._fsp--;


                    		current.merge(this_Scale_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                     
                            newCompositeNode(grammarAccess.getFunctionNameAccess().getTypeParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleType_in_ruleFunctionName786);
                    this_Type_1=ruleType();

                    state._fsp--;


                    		current.merge(this_Type_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:381:10: this_ID_2= RULE_ID
                    {
                    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionName813); 

                    		current.merge(this_ID_2);
                        
                     
                        newLeafNode(this_ID_2, grammarAccess.getFunctionNameAccess().getIDTerminalRuleCall_1()); 
                        

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
    // $ANTLR end "ruleFunctionName"


    // $ANTLR start "entryRuleParam"
    // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:396:1: entryRuleParam returns [EObject current=null] : iv_ruleParam= ruleParam EOF ;
    public final EObject entryRuleParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParam = null;


        try {
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:397:2: (iv_ruleParam= ruleParam EOF )
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:398:2: iv_ruleParam= ruleParam EOF
            {
             newCompositeNode(grammarAccess.getParamRule()); 
            pushFollow(FOLLOW_ruleParam_in_entryRuleParam858);
            iv_ruleParam=ruleParam();

            state._fsp--;

             current =iv_ruleParam; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParam868); 

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
    // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:405:1: ruleParam returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleParam() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:408:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:409:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:409:1: ( (lv_value_0_0= RULE_INT ) )
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:410:1: (lv_value_0_0= RULE_INT )
            {
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:410:1: (lv_value_0_0= RULE_INT )
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:411:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleParam909); 

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


    // $ANTLR start "entryRuleScale"
    // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:435:1: entryRuleScale returns [String current=null] : iv_ruleScale= ruleScale EOF ;
    public final String entryRuleScale() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleScale = null;


        try {
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:436:2: (iv_ruleScale= ruleScale EOF )
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:437:2: iv_ruleScale= ruleScale EOF
            {
             newCompositeNode(grammarAccess.getScaleRule()); 
            pushFollow(FOLLOW_ruleScale_in_entryRuleScale950);
            iv_ruleScale=ruleScale();

            state._fsp--;

             current =iv_ruleScale.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScale961); 

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
    // $ANTLR end "entryRuleScale"


    // $ANTLR start "ruleScale"
    // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:444:1: ruleScale returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_SCALE_IN_0= RULE_SCALE_IN | this_SCALE_OUT_1= RULE_SCALE_OUT | this_SCALE_UP_2= RULE_SCALE_UP | this_SCALE_DOWN_3= RULE_SCALE_DOWN ) ;
    public final AntlrDatatypeRuleToken ruleScale() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SCALE_IN_0=null;
        Token this_SCALE_OUT_1=null;
        Token this_SCALE_UP_2=null;
        Token this_SCALE_DOWN_3=null;

         enterRule(); 
            
        try {
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:447:28: ( (this_SCALE_IN_0= RULE_SCALE_IN | this_SCALE_OUT_1= RULE_SCALE_OUT | this_SCALE_UP_2= RULE_SCALE_UP | this_SCALE_DOWN_3= RULE_SCALE_DOWN ) )
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:448:1: (this_SCALE_IN_0= RULE_SCALE_IN | this_SCALE_OUT_1= RULE_SCALE_OUT | this_SCALE_UP_2= RULE_SCALE_UP | this_SCALE_DOWN_3= RULE_SCALE_DOWN )
            {
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:448:1: (this_SCALE_IN_0= RULE_SCALE_IN | this_SCALE_OUT_1= RULE_SCALE_OUT | this_SCALE_UP_2= RULE_SCALE_UP | this_SCALE_DOWN_3= RULE_SCALE_DOWN )
            int alt7=4;
            switch ( input.LA(1) ) {
            case RULE_SCALE_IN:
                {
                alt7=1;
                }
                break;
            case RULE_SCALE_OUT:
                {
                alt7=2;
                }
                break;
            case RULE_SCALE_UP:
                {
                alt7=3;
                }
                break;
            case RULE_SCALE_DOWN:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:448:6: this_SCALE_IN_0= RULE_SCALE_IN
                    {
                    this_SCALE_IN_0=(Token)match(input,RULE_SCALE_IN,FOLLOW_RULE_SCALE_IN_in_ruleScale1001); 

                    		current.merge(this_SCALE_IN_0);
                        
                     
                        newLeafNode(this_SCALE_IN_0, grammarAccess.getScaleAccess().getSCALE_INTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:456:10: this_SCALE_OUT_1= RULE_SCALE_OUT
                    {
                    this_SCALE_OUT_1=(Token)match(input,RULE_SCALE_OUT,FOLLOW_RULE_SCALE_OUT_in_ruleScale1027); 

                    		current.merge(this_SCALE_OUT_1);
                        
                     
                        newLeafNode(this_SCALE_OUT_1, grammarAccess.getScaleAccess().getSCALE_OUTTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:464:10: this_SCALE_UP_2= RULE_SCALE_UP
                    {
                    this_SCALE_UP_2=(Token)match(input,RULE_SCALE_UP,FOLLOW_RULE_SCALE_UP_in_ruleScale1053); 

                    		current.merge(this_SCALE_UP_2);
                        
                     
                        newLeafNode(this_SCALE_UP_2, grammarAccess.getScaleAccess().getSCALE_UPTerminalRuleCall_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:472:10: this_SCALE_DOWN_3= RULE_SCALE_DOWN
                    {
                    this_SCALE_DOWN_3=(Token)match(input,RULE_SCALE_DOWN,FOLLOW_RULE_SCALE_DOWN_in_ruleScale1079); 

                    		current.merge(this_SCALE_DOWN_3);
                        
                     
                        newLeafNode(this_SCALE_DOWN_3, grammarAccess.getScaleAccess().getSCALE_DOWNTerminalRuleCall_3()); 
                        

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
    // $ANTLR end "ruleScale"


    // $ANTLR start "entryRuleType"
    // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:487:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:488:2: (iv_ruleType= ruleType EOF )
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:489:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType1125);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType1136); 

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:496:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_SOFT_0= RULE_SOFT | this_INF_1= RULE_INF ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SOFT_0=null;
        Token this_INF_1=null;

         enterRule(); 
            
        try {
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:499:28: ( (this_SOFT_0= RULE_SOFT | this_INF_1= RULE_INF ) )
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:500:1: (this_SOFT_0= RULE_SOFT | this_INF_1= RULE_INF )
            {
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:500:1: (this_SOFT_0= RULE_SOFT | this_INF_1= RULE_INF )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_SOFT) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_INF) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:500:6: this_SOFT_0= RULE_SOFT
                    {
                    this_SOFT_0=(Token)match(input,RULE_SOFT,FOLLOW_RULE_SOFT_in_ruleType1176); 

                    		current.merge(this_SOFT_0);
                        
                     
                        newLeafNode(this_SOFT_0, grammarAccess.getTypeAccess().getSOFTTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:508:10: this_INF_1= RULE_INF
                    {
                    this_INF_1=(Token)match(input,RULE_INF,FOLLOW_RULE_INF_in_ruleType1202); 

                    		current.merge(this_INF_1);
                        
                     
                        newLeafNode(this_INF_1, grammarAccess.getTypeAccess().getINFTerminalRuleCall_1()); 
                        

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
    // $ANTLR end "ruleType"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleScript_in_entryRuleScript75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScript85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleScript130 = new BitSet(new long[]{0x000000000001E812L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_ruleStatement223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParallel_in_ruleStatement250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParallel_in_entryRuleParallel285 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParallel295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SPLIT_in_ruleParallel331 = new BitSet(new long[]{0x000000000001E810L});
    public static final BitSet FOLLOW_ruleStatementList_in_ruleParallel351 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_PARALLEL_SEPARATOR_in_ruleParallel363 = new BitSet(new long[]{0x000000000001E810L});
    public static final BitSet FOLLOW_ruleStatementList_in_ruleParallel383 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_RULE_JOIN_in_ruleParallel396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatementList_in_entryRuleStatementList431 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatementList441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleStatementList486 = new BitSet(new long[]{0x000000000001E812L});
    public static final BitSet FOLLOW_ruleCommand_in_entryRuleCommand522 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommand532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionName_in_ruleCommand578 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_LP_in_ruleCommand589 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleParam_in_ruleCommand609 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleCommand621 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleParam_in_ruleCommand641 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_RULE_RP_in_ruleCommand654 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_SEQUENTIAL_SEPARATOR_in_ruleCommand664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionName_in_entryRuleFunctionName700 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionName711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScale_in_ruleFunctionName759 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_ruleType_in_ruleFunctionName786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionName813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParam_in_entryRuleParam858 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParam868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleParam909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScale_in_entryRuleScale950 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScale961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SCALE_IN_in_ruleScale1001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SCALE_OUT_in_ruleScale1027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SCALE_UP_in_ruleScale1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SCALE_DOWN_in_ruleScale1079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType1125 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType1136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SOFT_in_ruleType1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INF_in_ruleType1202 = new BitSet(new long[]{0x0000000000000002L});

}