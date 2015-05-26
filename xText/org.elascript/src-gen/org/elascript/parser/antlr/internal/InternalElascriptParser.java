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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SPLIT", "RULE_JOIN", "RULE_PARALLEL_SEPARATOR", "RULE_FUNCTION_NAME", "RULE_LP", "RULE_RP", "RULE_SEQUENTIAL_SEPARATOR", "RULE_COMMA", "RULE_INT", "RULE_LETTER", "RULE_NUMBER", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_SEQUENTIAL_SEPARATOR=10;
    public static final int RULE_FUNCTION_NAME=7;
    public static final int RULE_STRING=16;
    public static final int RULE_SPLIT=4;
    public static final int RULE_SL_COMMENT=18;
    public static final int EOF=-1;
    public static final int RULE_ID=15;
    public static final int RULE_COMMA=11;
    public static final int RULE_WS=19;
    public static final int RULE_JOIN=5;
    public static final int RULE_PARALLEL_SEPARATOR=6;
    public static final int RULE_ANY_OTHER=20;
    public static final int RULE_NUMBER=14;
    public static final int RULE_LETTER=13;
    public static final int RULE_INT=12;
    public static final int RULE_ML_COMMENT=17;
    public static final int RULE_RP=9;
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
    // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:76:1: ruleScript returns [EObject current=null] : ( (lv_actions_0_0= ruleAction ) )* ;
    public final EObject ruleScript() throws RecognitionException {
        EObject current = null;

        EObject lv_actions_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:79:28: ( ( (lv_actions_0_0= ruleAction ) )* )
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:80:1: ( (lv_actions_0_0= ruleAction ) )*
            {
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:80:1: ( (lv_actions_0_0= ruleAction ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_SPLIT||LA1_0==RULE_FUNCTION_NAME) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:81:1: (lv_actions_0_0= ruleAction )
            	    {
            	    // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:81:1: (lv_actions_0_0= ruleAction )
            	    // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:82:3: lv_actions_0_0= ruleAction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScriptAccess().getActionsActionParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAction_in_ruleScript130);
            	    lv_actions_0_0=ruleAction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getScriptRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"actions",
            	            		lv_actions_0_0, 
            	            		"Action");
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


    // $ANTLR start "entryRuleAction"
    // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:106:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:107:2: (iv_ruleAction= ruleAction EOF )
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:108:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_ruleAction_in_entryRuleAction166);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAction176); 

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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:115:1: ruleAction returns [EObject current=null] : (this_Command_0= ruleCommand | this_Parallel_1= ruleParallel ) ;
    public final EObject ruleAction() throws RecognitionException {
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
                     
                            newCompositeNode(grammarAccess.getActionAccess().getCommandParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleCommand_in_ruleAction223);
                    this_Command_0=ruleCommand();

                    state._fsp--;

                     
                            current = this_Command_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:130:5: this_Parallel_1= ruleParallel
                    {
                     
                            newCompositeNode(grammarAccess.getActionAccess().getParallelParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleParallel_in_ruleAction250);
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
    // $ANTLR end "ruleAction"


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
    // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:207:1: ruleParallelBody returns [EObject current=null] : ( ( (lv_actions_0_0= ruleActionList ) ) (this_PARALLEL_SEPARATOR_1= RULE_PARALLEL_SEPARATOR ( (lv_actions_2_0= ruleActionList ) ) )+ ) ;
    public final EObject ruleParallelBody() throws RecognitionException {
        EObject current = null;

        Token this_PARALLEL_SEPARATOR_1=null;
        EObject lv_actions_0_0 = null;

        EObject lv_actions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:210:28: ( ( ( (lv_actions_0_0= ruleActionList ) ) (this_PARALLEL_SEPARATOR_1= RULE_PARALLEL_SEPARATOR ( (lv_actions_2_0= ruleActionList ) ) )+ ) )
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:211:1: ( ( (lv_actions_0_0= ruleActionList ) ) (this_PARALLEL_SEPARATOR_1= RULE_PARALLEL_SEPARATOR ( (lv_actions_2_0= ruleActionList ) ) )+ )
            {
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:211:1: ( ( (lv_actions_0_0= ruleActionList ) ) (this_PARALLEL_SEPARATOR_1= RULE_PARALLEL_SEPARATOR ( (lv_actions_2_0= ruleActionList ) ) )+ )
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:211:2: ( (lv_actions_0_0= ruleActionList ) ) (this_PARALLEL_SEPARATOR_1= RULE_PARALLEL_SEPARATOR ( (lv_actions_2_0= ruleActionList ) ) )+
            {
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:211:2: ( (lv_actions_0_0= ruleActionList ) )
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:212:1: (lv_actions_0_0= ruleActionList )
            {
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:212:1: (lv_actions_0_0= ruleActionList )
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:213:3: lv_actions_0_0= ruleActionList
            {
             
            	        newCompositeNode(grammarAccess.getParallelBodyAccess().getActionsActionListParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleActionList_in_ruleParallelBody465);
            lv_actions_0_0=ruleActionList();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParallelBodyRule());
            	        }
                   		add(
                   			current, 
                   			"actions",
                    		lv_actions_0_0, 
                    		"ActionList");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:229:2: (this_PARALLEL_SEPARATOR_1= RULE_PARALLEL_SEPARATOR ( (lv_actions_2_0= ruleActionList ) ) )+
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
            	    // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:229:3: this_PARALLEL_SEPARATOR_1= RULE_PARALLEL_SEPARATOR ( (lv_actions_2_0= ruleActionList ) )
            	    {
            	    this_PARALLEL_SEPARATOR_1=(Token)match(input,RULE_PARALLEL_SEPARATOR,FOLLOW_RULE_PARALLEL_SEPARATOR_in_ruleParallelBody477); 
            	     
            	        newLeafNode(this_PARALLEL_SEPARATOR_1, grammarAccess.getParallelBodyAccess().getPARALLEL_SEPARATORTerminalRuleCall_1_0()); 
            	        
            	    // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:233:1: ( (lv_actions_2_0= ruleActionList ) )
            	    // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:234:1: (lv_actions_2_0= ruleActionList )
            	    {
            	    // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:234:1: (lv_actions_2_0= ruleActionList )
            	    // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:235:3: lv_actions_2_0= ruleActionList
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getParallelBodyAccess().getActionsActionListParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleActionList_in_ruleParallelBody497);
            	    lv_actions_2_0=ruleActionList();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getParallelBodyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"actions",
            	            		lv_actions_2_0, 
            	            		"ActionList");
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


    // $ANTLR start "entryRuleActionList"
    // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:259:1: entryRuleActionList returns [EObject current=null] : iv_ruleActionList= ruleActionList EOF ;
    public final EObject entryRuleActionList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionList = null;


        try {
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:260:2: (iv_ruleActionList= ruleActionList EOF )
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:261:2: iv_ruleActionList= ruleActionList EOF
            {
             newCompositeNode(grammarAccess.getActionListRule()); 
            pushFollow(FOLLOW_ruleActionList_in_entryRuleActionList535);
            iv_ruleActionList=ruleActionList();

            state._fsp--;

             current =iv_ruleActionList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionList545); 

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
    // $ANTLR end "entryRuleActionList"


    // $ANTLR start "ruleActionList"
    // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:268:1: ruleActionList returns [EObject current=null] : ( (lv_actions_0_0= ruleAction ) )+ ;
    public final EObject ruleActionList() throws RecognitionException {
        EObject current = null;

        EObject lv_actions_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:271:28: ( ( (lv_actions_0_0= ruleAction ) )+ )
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:272:1: ( (lv_actions_0_0= ruleAction ) )+
            {
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:272:1: ( (lv_actions_0_0= ruleAction ) )+
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
            	    // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:273:1: (lv_actions_0_0= ruleAction )
            	    {
            	    // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:273:1: (lv_actions_0_0= ruleAction )
            	    // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:274:3: lv_actions_0_0= ruleAction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getActionListAccess().getActionsActionParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAction_in_ruleActionList590);
            	    lv_actions_0_0=ruleAction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getActionListRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"actions",
            	            		lv_actions_0_0, 
            	            		"Action");
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
    // $ANTLR end "ruleActionList"


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
    // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:307:1: ruleCommand returns [EObject current=null] : ( ( (lv_name_0_0= RULE_FUNCTION_NAME ) ) this_LP_1= RULE_LP ( (lv_params_2_0= ruleParamList ) ) this_RP_3= RULE_RP this_SEQUENTIAL_SEPARATOR_4= RULE_SEQUENTIAL_SEPARATOR ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token this_LP_1=null;
        Token this_RP_3=null;
        Token this_SEQUENTIAL_SEPARATOR_4=null;
        EObject lv_params_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:310:28: ( ( ( (lv_name_0_0= RULE_FUNCTION_NAME ) ) this_LP_1= RULE_LP ( (lv_params_2_0= ruleParamList ) ) this_RP_3= RULE_RP this_SEQUENTIAL_SEPARATOR_4= RULE_SEQUENTIAL_SEPARATOR ) )
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:311:1: ( ( (lv_name_0_0= RULE_FUNCTION_NAME ) ) this_LP_1= RULE_LP ( (lv_params_2_0= ruleParamList ) ) this_RP_3= RULE_RP this_SEQUENTIAL_SEPARATOR_4= RULE_SEQUENTIAL_SEPARATOR )
            {
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:311:1: ( ( (lv_name_0_0= RULE_FUNCTION_NAME ) ) this_LP_1= RULE_LP ( (lv_params_2_0= ruleParamList ) ) this_RP_3= RULE_RP this_SEQUENTIAL_SEPARATOR_4= RULE_SEQUENTIAL_SEPARATOR )
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:311:2: ( (lv_name_0_0= RULE_FUNCTION_NAME ) ) this_LP_1= RULE_LP ( (lv_params_2_0= ruleParamList ) ) this_RP_3= RULE_RP this_SEQUENTIAL_SEPARATOR_4= RULE_SEQUENTIAL_SEPARATOR
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
                
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:333:1: ( (lv_params_2_0= ruleParamList ) )
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:334:1: (lv_params_2_0= ruleParamList )
            {
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:334:1: (lv_params_2_0= ruleParamList )
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:335:3: lv_params_2_0= ruleParamList
            {
             
            	        newCompositeNode(grammarAccess.getCommandAccess().getParamsParamListParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleParamList_in_ruleCommand714);
            lv_params_2_0=ruleParamList();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCommandRule());
            	        }
                   		set(
                   			current, 
                   			"params",
                    		lv_params_2_0, 
                    		"ParamList");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            this_RP_3=(Token)match(input,RULE_RP,FOLLOW_RULE_RP_in_ruleCommand725); 
             
                newLeafNode(this_RP_3, grammarAccess.getCommandAccess().getRPTerminalRuleCall_3()); 
                
            this_SEQUENTIAL_SEPARATOR_4=(Token)match(input,RULE_SEQUENTIAL_SEPARATOR,FOLLOW_RULE_SEQUENTIAL_SEPARATOR_in_ruleCommand735); 
             
                newLeafNode(this_SEQUENTIAL_SEPARATOR_4, grammarAccess.getCommandAccess().getSEQUENTIAL_SEPARATORTerminalRuleCall_4()); 
                

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


    // $ANTLR start "entryRuleParamList"
    // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:367:1: entryRuleParamList returns [EObject current=null] : iv_ruleParamList= ruleParamList EOF ;
    public final EObject entryRuleParamList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParamList = null;


        try {
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:368:2: (iv_ruleParamList= ruleParamList EOF )
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:369:2: iv_ruleParamList= ruleParamList EOF
            {
             newCompositeNode(grammarAccess.getParamListRule()); 
            pushFollow(FOLLOW_ruleParamList_in_entryRuleParamList770);
            iv_ruleParamList=ruleParamList();

            state._fsp--;

             current =iv_ruleParamList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParamList780); 

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
    // $ANTLR end "entryRuleParamList"


    // $ANTLR start "ruleParamList"
    // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:376:1: ruleParamList returns [EObject current=null] : ( ( (lv_params_0_0= rulePARAM ) ) (this_COMMA_1= RULE_COMMA ( (lv_params_2_0= rulePARAM ) ) )* ) ;
    public final EObject ruleParamList() throws RecognitionException {
        EObject current = null;

        Token this_COMMA_1=null;
        AntlrDatatypeRuleToken lv_params_0_0 = null;

        AntlrDatatypeRuleToken lv_params_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:379:28: ( ( ( (lv_params_0_0= rulePARAM ) ) (this_COMMA_1= RULE_COMMA ( (lv_params_2_0= rulePARAM ) ) )* ) )
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:380:1: ( ( (lv_params_0_0= rulePARAM ) ) (this_COMMA_1= RULE_COMMA ( (lv_params_2_0= rulePARAM ) ) )* )
            {
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:380:1: ( ( (lv_params_0_0= rulePARAM ) ) (this_COMMA_1= RULE_COMMA ( (lv_params_2_0= rulePARAM ) ) )* )
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:380:2: ( (lv_params_0_0= rulePARAM ) ) (this_COMMA_1= RULE_COMMA ( (lv_params_2_0= rulePARAM ) ) )*
            {
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:380:2: ( (lv_params_0_0= rulePARAM ) )
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:381:1: (lv_params_0_0= rulePARAM )
            {
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:381:1: (lv_params_0_0= rulePARAM )
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:382:3: lv_params_0_0= rulePARAM
            {
             
            	        newCompositeNode(grammarAccess.getParamListAccess().getParamsPARAMParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulePARAM_in_ruleParamList826);
            lv_params_0_0=rulePARAM();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParamListRule());
            	        }
                   		add(
                   			current, 
                   			"params",
                    		lv_params_0_0, 
                    		"PARAM");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:398:2: (this_COMMA_1= RULE_COMMA ( (lv_params_2_0= rulePARAM ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_COMMA) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:398:3: this_COMMA_1= RULE_COMMA ( (lv_params_2_0= rulePARAM ) )
            	    {
            	    this_COMMA_1=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleParamList838); 
            	     
            	        newLeafNode(this_COMMA_1, grammarAccess.getParamListAccess().getCOMMATerminalRuleCall_1_0()); 
            	        
            	    // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:402:1: ( (lv_params_2_0= rulePARAM ) )
            	    // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:403:1: (lv_params_2_0= rulePARAM )
            	    {
            	    // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:403:1: (lv_params_2_0= rulePARAM )
            	    // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:404:3: lv_params_2_0= rulePARAM
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getParamListAccess().getParamsPARAMParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePARAM_in_ruleParamList858);
            	    lv_params_2_0=rulePARAM();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getParamListRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"params",
            	            		lv_params_2_0, 
            	            		"PARAM");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
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
    // $ANTLR end "ruleParamList"


    // $ANTLR start "entryRulePARAM"
    // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:428:1: entryRulePARAM returns [String current=null] : iv_rulePARAM= rulePARAM EOF ;
    public final String entryRulePARAM() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePARAM = null;


        try {
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:429:2: (iv_rulePARAM= rulePARAM EOF )
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:430:2: iv_rulePARAM= rulePARAM EOF
            {
             newCompositeNode(grammarAccess.getPARAMRule()); 
            pushFollow(FOLLOW_rulePARAM_in_entryRulePARAM897);
            iv_rulePARAM=rulePARAM();

            state._fsp--;

             current =iv_rulePARAM.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePARAM908); 

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
    // $ANTLR end "entryRulePARAM"


    // $ANTLR start "rulePARAM"
    // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:437:1: rulePARAM returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken rulePARAM() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         enterRule(); 
            
        try {
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:440:28: (this_INT_0= RULE_INT )
            // ../org.elascript/src-gen/org/elascript/parser/antlr/internal/InternalElascript.g:441:5: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_rulePARAM947); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getPARAMAccess().getINTTerminalRuleCall()); 
                

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
    // $ANTLR end "rulePARAM"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleScript_in_entryRuleScript75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScript85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_ruleScript130 = new BitSet(new long[]{0x0000000000000092L});
    public static final BitSet FOLLOW_ruleAction_in_entryRuleAction166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAction176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_ruleAction223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParallel_in_ruleAction250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParallel_in_entryRuleParallel285 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParallel295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SPLIT_in_ruleParallel331 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_ruleParallelBody_in_ruleParallel352 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_JOIN_in_ruleParallel368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParallelBody_in_entryRuleParallelBody409 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParallelBody419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionList_in_ruleParallelBody465 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_PARALLEL_SEPARATOR_in_ruleParallelBody477 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_ruleActionList_in_ruleParallelBody497 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleActionList_in_entryRuleActionList535 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionList545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_ruleActionList590 = new BitSet(new long[]{0x0000000000000092L});
    public static final BitSet FOLLOW_ruleCommand_in_entryRuleCommand626 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommand636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FUNCTION_NAME_in_ruleCommand678 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_LP_in_ruleCommand694 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleParamList_in_ruleCommand714 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_RP_in_ruleCommand725 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_SEQUENTIAL_SEPARATOR_in_ruleCommand735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParamList_in_entryRuleParamList770 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParamList780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePARAM_in_ruleParamList826 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleParamList838 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rulePARAM_in_ruleParamList858 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_rulePARAM_in_entryRulePARAM897 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePARAM908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rulePARAM947 = new BitSet(new long[]{0x0000000000000002L});

}