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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SPLIT", "RULE_JOIN", "RULE_PARALLEL_SEPARATOR", "RULE_FUNCTION_NAME", "RULE_LP", "RULE_COMMA", "RULE_RP", "RULE_SEQUENTIAL_SEPARATOR", "RULE_INT", "RULE_LETTER", "RULE_NUMBER", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_SEQUENTIAL_SEPARATOR=11;
    public static final int RULE_FUNCTION_NAME=7;
    public static final int RULE_STRING=16;
    public static final int RULE_SPLIT=4;
    public static final int RULE_SL_COMMENT=18;
    public static final int EOF=-1;
    public static final int RULE_ID=15;
    public static final int RULE_COMMA=9;
    public static final int RULE_WS=19;
    public static final int RULE_JOIN=5;
    public static final int RULE_PARALLEL_SEPARATOR=6;
    public static final int RULE_ANY_OTHER=20;
    public static final int RULE_NUMBER=14;
    public static final int RULE_LETTER=13;
    public static final int RULE_INT=12;
    public static final int RULE_ML_COMMENT=17;
    public static final int RULE_RP=10;
    public static final int RULE_LP=8;

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

                if ( (LA1_0==RULE_SPLIT||LA1_0==RULE_FUNCTION_NAME) ) {
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

            if ( (LA2_0==RULE_FUNCTION_NAME) ) {
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
    // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:155:1: ruleParallel returns [EObject current=null] : (this_SPLIT_0= RULE_SPLIT this_ParallelBody_1= ruleParallelBody ( (lv_name_2_0= RULE_JOIN ) ) ) ;
    public final EObject ruleParallel() throws RecognitionException {
        EObject current = null;

        Token this_SPLIT_0=null;
        Token lv_name_2_0=null;
        EObject this_ParallelBody_1 = null;


         enterRule(); 
            
        try {
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:158:28: ( (this_SPLIT_0= RULE_SPLIT this_ParallelBody_1= ruleParallelBody ( (lv_name_2_0= RULE_JOIN ) ) ) )
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:159:1: (this_SPLIT_0= RULE_SPLIT this_ParallelBody_1= ruleParallelBody ( (lv_name_2_0= RULE_JOIN ) ) )
            {
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:159:1: (this_SPLIT_0= RULE_SPLIT this_ParallelBody_1= ruleParallelBody ( (lv_name_2_0= RULE_JOIN ) ) )
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:159:2: this_SPLIT_0= RULE_SPLIT this_ParallelBody_1= ruleParallelBody ( (lv_name_2_0= RULE_JOIN ) )
            {
            this_SPLIT_0=(Token)match(input,RULE_SPLIT,FOLLOW_RULE_SPLIT_in_ruleParallel331); 
             
                newLeafNode(this_SPLIT_0, grammarAccess.getParallelAccess().getSPLITTerminalRuleCall_0()); 
                
             
                    newCompositeNode(grammarAccess.getParallelAccess().getParallelBodyParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleParallelBody_in_ruleParallel352);
            this_ParallelBody_1=ruleParallelBody();

            state._fsp--;

             
                    current = this_ParallelBody_1; 
                    afterParserOrEnumRuleCall();
                
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:172:1: ( (lv_name_2_0= RULE_JOIN ) )
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:173:1: (lv_name_2_0= RULE_JOIN )
            {
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:173:1: (lv_name_2_0= RULE_JOIN )
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:174:3: lv_name_2_0= RULE_JOIN
            {
            lv_name_2_0=(Token)match(input,RULE_JOIN,FOLLOW_RULE_JOIN_in_ruleParallel368); 

            			newLeafNode(lv_name_2_0, grammarAccess.getParallelAccess().getNameJOINTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getParallelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"JOIN");
            	    

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


    // $ANTLR start "entryRuleParallelBody"
    // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:198:1: entryRuleParallelBody returns [EObject current=null] : iv_ruleParallelBody= ruleParallelBody EOF ;
    public final EObject entryRuleParallelBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParallelBody = null;


        try {
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:199:2: (iv_ruleParallelBody= ruleParallelBody EOF )
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:200:2: iv_ruleParallelBody= ruleParallelBody EOF
            {
             newCompositeNode(grammarAccess.getParallelBodyRule()); 
            pushFollow(FOLLOW_ruleParallelBody_in_entryRuleParallelBody409);
            iv_ruleParallelBody=ruleParallelBody();

            state._fsp--;

             current =iv_ruleParallelBody; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParallelBody419); 

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
    // $ANTLR end "entryRuleParallelBody"


    // $ANTLR start "ruleParallelBody"
    // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:207:1: ruleParallelBody returns [EObject current=null] : ( ( (lv_statements_0_0= ruleStatementList ) ) (this_PARALLEL_SEPARATOR_1= RULE_PARALLEL_SEPARATOR ( (lv_statements_2_0= ruleStatementList ) ) )+ ) ;
    public final EObject ruleParallelBody() throws RecognitionException {
        EObject current = null;

        Token this_PARALLEL_SEPARATOR_1=null;
        EObject lv_statements_0_0 = null;

        EObject lv_statements_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:210:28: ( ( ( (lv_statements_0_0= ruleStatementList ) ) (this_PARALLEL_SEPARATOR_1= RULE_PARALLEL_SEPARATOR ( (lv_statements_2_0= ruleStatementList ) ) )+ ) )
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:211:1: ( ( (lv_statements_0_0= ruleStatementList ) ) (this_PARALLEL_SEPARATOR_1= RULE_PARALLEL_SEPARATOR ( (lv_statements_2_0= ruleStatementList ) ) )+ )
            {
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:211:1: ( ( (lv_statements_0_0= ruleStatementList ) ) (this_PARALLEL_SEPARATOR_1= RULE_PARALLEL_SEPARATOR ( (lv_statements_2_0= ruleStatementList ) ) )+ )
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:211:2: ( (lv_statements_0_0= ruleStatementList ) ) (this_PARALLEL_SEPARATOR_1= RULE_PARALLEL_SEPARATOR ( (lv_statements_2_0= ruleStatementList ) ) )+
            {
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:211:2: ( (lv_statements_0_0= ruleStatementList ) )
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:212:1: (lv_statements_0_0= ruleStatementList )
            {
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:212:1: (lv_statements_0_0= ruleStatementList )
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:213:3: lv_statements_0_0= ruleStatementList
            {
             
            	        newCompositeNode(grammarAccess.getParallelBodyAccess().getStatementsStatementListParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleStatementList_in_ruleParallelBody465);
            lv_statements_0_0=ruleStatementList();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParallelBodyRule());
            	        }
                   		add(
                   			current, 
                   			"statements",
                    		lv_statements_0_0, 
                    		"StatementList");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:229:2: (this_PARALLEL_SEPARATOR_1= RULE_PARALLEL_SEPARATOR ( (lv_statements_2_0= ruleStatementList ) ) )+
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
            	    // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:229:3: this_PARALLEL_SEPARATOR_1= RULE_PARALLEL_SEPARATOR ( (lv_statements_2_0= ruleStatementList ) )
            	    {
            	    this_PARALLEL_SEPARATOR_1=(Token)match(input,RULE_PARALLEL_SEPARATOR,FOLLOW_RULE_PARALLEL_SEPARATOR_in_ruleParallelBody477); 
            	     
            	        newLeafNode(this_PARALLEL_SEPARATOR_1, grammarAccess.getParallelBodyAccess().getPARALLEL_SEPARATORTerminalRuleCall_1_0()); 
            	        
            	    // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:233:1: ( (lv_statements_2_0= ruleStatementList ) )
            	    // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:234:1: (lv_statements_2_0= ruleStatementList )
            	    {
            	    // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:234:1: (lv_statements_2_0= ruleStatementList )
            	    // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:235:3: lv_statements_2_0= ruleStatementList
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getParallelBodyAccess().getStatementsStatementListParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStatementList_in_ruleParallelBody497);
            	    lv_statements_2_0=ruleStatementList();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getParallelBodyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"statements",
            	            		lv_statements_2_0, 
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
    // $ANTLR end "ruleParallelBody"


    // $ANTLR start "entryRuleStatementList"
    // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:259:1: entryRuleStatementList returns [EObject current=null] : iv_ruleStatementList= ruleStatementList EOF ;
    public final EObject entryRuleStatementList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatementList = null;


        try {
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:260:2: (iv_ruleStatementList= ruleStatementList EOF )
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:261:2: iv_ruleStatementList= ruleStatementList EOF
            {
             newCompositeNode(grammarAccess.getStatementListRule()); 
            pushFollow(FOLLOW_ruleStatementList_in_entryRuleStatementList535);
            iv_ruleStatementList=ruleStatementList();

            state._fsp--;

             current =iv_ruleStatementList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatementList545); 

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
    // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:268:1: ruleStatementList returns [EObject current=null] : ( (lv_statements_0_0= ruleStatement ) )+ ;
    public final EObject ruleStatementList() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:271:28: ( ( (lv_statements_0_0= ruleStatement ) )+ )
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:272:1: ( (lv_statements_0_0= ruleStatement ) )+
            {
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:272:1: ( (lv_statements_0_0= ruleStatement ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_SPLIT||LA4_0==RULE_FUNCTION_NAME) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:273:1: (lv_statements_0_0= ruleStatement )
            	    {
            	    // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:273:1: (lv_statements_0_0= ruleStatement )
            	    // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:274:3: lv_statements_0_0= ruleStatement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStatementListAccess().getStatementsStatementParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStatement_in_ruleStatementList590);
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
    // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:298:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:299:2: (iv_ruleCommand= ruleCommand EOF )
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:300:2: iv_ruleCommand= ruleCommand EOF
            {
             newCompositeNode(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_ruleCommand_in_entryRuleCommand626);
            iv_ruleCommand=ruleCommand();

            state._fsp--;

             current =iv_ruleCommand; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommand636); 

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
    // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:307:1: ruleCommand returns [EObject current=null] : ( ( (lv_name_0_0= RULE_FUNCTION_NAME ) ) this_LP_1= RULE_LP ( (lv_params_2_0= ruleParam ) ) (this_COMMA_3= RULE_COMMA ( (lv_params_4_0= ruleParam ) ) )* this_RP_5= RULE_RP this_SEQUENTIAL_SEPARATOR_6= RULE_SEQUENTIAL_SEPARATOR ) ;
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
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:310:28: ( ( ( (lv_name_0_0= RULE_FUNCTION_NAME ) ) this_LP_1= RULE_LP ( (lv_params_2_0= ruleParam ) ) (this_COMMA_3= RULE_COMMA ( (lv_params_4_0= ruleParam ) ) )* this_RP_5= RULE_RP this_SEQUENTIAL_SEPARATOR_6= RULE_SEQUENTIAL_SEPARATOR ) )
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:311:1: ( ( (lv_name_0_0= RULE_FUNCTION_NAME ) ) this_LP_1= RULE_LP ( (lv_params_2_0= ruleParam ) ) (this_COMMA_3= RULE_COMMA ( (lv_params_4_0= ruleParam ) ) )* this_RP_5= RULE_RP this_SEQUENTIAL_SEPARATOR_6= RULE_SEQUENTIAL_SEPARATOR )
            {
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:311:1: ( ( (lv_name_0_0= RULE_FUNCTION_NAME ) ) this_LP_1= RULE_LP ( (lv_params_2_0= ruleParam ) ) (this_COMMA_3= RULE_COMMA ( (lv_params_4_0= ruleParam ) ) )* this_RP_5= RULE_RP this_SEQUENTIAL_SEPARATOR_6= RULE_SEQUENTIAL_SEPARATOR )
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:311:2: ( (lv_name_0_0= RULE_FUNCTION_NAME ) ) this_LP_1= RULE_LP ( (lv_params_2_0= ruleParam ) ) (this_COMMA_3= RULE_COMMA ( (lv_params_4_0= ruleParam ) ) )* this_RP_5= RULE_RP this_SEQUENTIAL_SEPARATOR_6= RULE_SEQUENTIAL_SEPARATOR
            {
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:311:2: ( (lv_name_0_0= RULE_FUNCTION_NAME ) )
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:312:1: (lv_name_0_0= RULE_FUNCTION_NAME )
            {
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:312:1: (lv_name_0_0= RULE_FUNCTION_NAME )
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:313:3: lv_name_0_0= RULE_FUNCTION_NAME
            {
            lv_name_0_0=(Token)match(input,RULE_FUNCTION_NAME,FOLLOW_RULE_FUNCTION_NAME_in_ruleCommand678); 

            			newLeafNode(lv_name_0_0, grammarAccess.getCommandAccess().getNameFUNCTION_NAMETerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCommandRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"FUNCTION_NAME");
            	    

            }


            }

            this_LP_1=(Token)match(input,RULE_LP,FOLLOW_RULE_LP_in_ruleCommand694); 
             
                newLeafNode(this_LP_1, grammarAccess.getCommandAccess().getLPTerminalRuleCall_1()); 
                
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:333:1: ( (lv_params_2_0= ruleParam ) )
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:334:1: (lv_params_2_0= ruleParam )
            {
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:334:1: (lv_params_2_0= ruleParam )
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:335:3: lv_params_2_0= ruleParam
            {
             
            	        newCompositeNode(grammarAccess.getCommandAccess().getParamsParamParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleParam_in_ruleCommand714);
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

            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:351:2: (this_COMMA_3= RULE_COMMA ( (lv_params_4_0= ruleParam ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_COMMA) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:351:3: this_COMMA_3= RULE_COMMA ( (lv_params_4_0= ruleParam ) )
            	    {
            	    this_COMMA_3=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleCommand726); 
            	     
            	        newLeafNode(this_COMMA_3, grammarAccess.getCommandAccess().getCOMMATerminalRuleCall_3_0()); 
            	        
            	    // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:355:1: ( (lv_params_4_0= ruleParam ) )
            	    // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:356:1: (lv_params_4_0= ruleParam )
            	    {
            	    // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:356:1: (lv_params_4_0= ruleParam )
            	    // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:357:3: lv_params_4_0= ruleParam
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCommandAccess().getParamsParamParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleParam_in_ruleCommand746);
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

            this_RP_5=(Token)match(input,RULE_RP,FOLLOW_RULE_RP_in_ruleCommand759); 
             
                newLeafNode(this_RP_5, grammarAccess.getCommandAccess().getRPTerminalRuleCall_4()); 
                
            this_SEQUENTIAL_SEPARATOR_6=(Token)match(input,RULE_SEQUENTIAL_SEPARATOR,FOLLOW_RULE_SEQUENTIAL_SEPARATOR_in_ruleCommand769); 
             
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
    // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:389:1: entryRuleParam returns [EObject current=null] : iv_ruleParam= ruleParam EOF ;
    public final EObject entryRuleParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParam = null;


        try {
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:390:2: (iv_ruleParam= ruleParam EOF )
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:391:2: iv_ruleParam= ruleParam EOF
            {
             newCompositeNode(grammarAccess.getParamRule()); 
            pushFollow(FOLLOW_ruleParam_in_entryRuleParam804);
            iv_ruleParam=ruleParam();

            state._fsp--;

             current =iv_ruleParam; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParam814); 

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
    // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:398:1: ruleParam returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleParam() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:401:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:402:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:402:1: ( (lv_value_0_0= RULE_INT ) )
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:403:1: (lv_value_0_0= RULE_INT )
            {
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:403:1: (lv_value_0_0= RULE_INT )
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:404:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleParam855); 

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
    public static final BitSet FOLLOW_ruleStatement_in_ruleScript130 = new BitSet(new long[]{0x0000000000000092L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_ruleStatement223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParallel_in_ruleStatement250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParallel_in_entryRuleParallel285 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParallel295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SPLIT_in_ruleParallel331 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_ruleParallelBody_in_ruleParallel352 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_JOIN_in_ruleParallel368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParallelBody_in_entryRuleParallelBody409 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParallelBody419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatementList_in_ruleParallelBody465 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_PARALLEL_SEPARATOR_in_ruleParallelBody477 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_ruleStatementList_in_ruleParallelBody497 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleStatementList_in_entryRuleStatementList535 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatementList545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleStatementList590 = new BitSet(new long[]{0x0000000000000092L});
    public static final BitSet FOLLOW_ruleCommand_in_entryRuleCommand626 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommand636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FUNCTION_NAME_in_ruleCommand678 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_LP_in_ruleCommand694 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleParam_in_ruleCommand714 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleCommand726 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleParam_in_ruleCommand746 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_RULE_RP_in_ruleCommand759 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_SEQUENTIAL_SEPARATOR_in_ruleCommand769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParam_in_entryRuleParam804 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParam814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleParam855 = new BitSet(new long[]{0x0000000000000002L});

}