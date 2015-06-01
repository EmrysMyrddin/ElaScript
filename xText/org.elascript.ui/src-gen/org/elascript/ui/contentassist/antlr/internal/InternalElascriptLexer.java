package org.elascript.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalElascriptLexer extends Lexer {
    public static final int RULE_SEQUENTIAL_SEPARATOR=16;
    public static final int RULE_INF=10;
    public static final int RULE_STRING=21;
    public static final int RULE_SPLIT=11;
    public static final int RULE_SL_COMMENT=23;
    public static final int RULE_SCALE_DOWN=8;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_SOFT=9;
    public static final int RULE_COMMA=17;
    public static final int RULE_WS=24;
    public static final int RULE_JOIN=12;
    public static final int RULE_PARALLEL_SEPARATOR=13;
    public static final int RULE_ANY_OTHER=25;
    public static final int RULE_NUMBER=20;
    public static final int RULE_LETTER=19;
    public static final int RULE_SCALE_UP=7;
    public static final int RULE_INT=18;
    public static final int RULE_ML_COMMENT=22;
    public static final int RULE_SCALE_IN=5;
    public static final int RULE_RP=15;
    public static final int RULE_SCALE_OUT=6;
    public static final int RULE_LP=14;

    // delegates
    // delegators

    public InternalElascriptLexer() {;} 
    public InternalElascriptLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalElascriptLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g"; }

    // $ANTLR start "RULE_SCALE_IN"
    public final void mRULE_SCALE_IN() throws RecognitionException {
        try {
            int _type = RULE_SCALE_IN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1041:15: ( 'ScaleIn' )
            // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1041:17: 'ScaleIn'
            {
            match("ScaleIn"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SCALE_IN"

    // $ANTLR start "RULE_SCALE_OUT"
    public final void mRULE_SCALE_OUT() throws RecognitionException {
        try {
            int _type = RULE_SCALE_OUT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1043:16: ( 'ScaleOut' )
            // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1043:18: 'ScaleOut'
            {
            match("ScaleOut"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SCALE_OUT"

    // $ANTLR start "RULE_SCALE_UP"
    public final void mRULE_SCALE_UP() throws RecognitionException {
        try {
            int _type = RULE_SCALE_UP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1045:15: ( 'ScaleUp' )
            // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1045:17: 'ScaleUp'
            {
            match("ScaleUp"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SCALE_UP"

    // $ANTLR start "RULE_SCALE_DOWN"
    public final void mRULE_SCALE_DOWN() throws RecognitionException {
        try {
            int _type = RULE_SCALE_DOWN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1047:17: ( 'ScaleDown' )
            // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1047:19: 'ScaleDown'
            {
            match("ScaleDown"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SCALE_DOWN"

    // $ANTLR start "RULE_SOFT"
    public final void mRULE_SOFT() throws RecognitionException {
        try {
            int _type = RULE_SOFT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1049:11: ( 'Soft' )
            // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1049:13: 'Soft'
            {
            match("Soft"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SOFT"

    // $ANTLR start "RULE_INF"
    public final void mRULE_INF() throws RecognitionException {
        try {
            int _type = RULE_INF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1051:10: ( 'Inf' )
            // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1051:12: 'Inf'
            {
            match("Inf"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INF"

    // $ANTLR start "RULE_PARALLEL_SEPARATOR"
    public final void mRULE_PARALLEL_SEPARATOR() throws RecognitionException {
        try {
            int _type = RULE_PARALLEL_SEPARATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1053:25: ( '||' )
            // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1053:27: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PARALLEL_SEPARATOR"

    // $ANTLR start "RULE_LP"
    public final void mRULE_LP() throws RecognitionException {
        try {
            int _type = RULE_LP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1055:9: ( '(' )
            // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1055:11: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LP"

    // $ANTLR start "RULE_RP"
    public final void mRULE_RP() throws RecognitionException {
        try {
            int _type = RULE_RP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1057:9: ( ')' )
            // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1057:11: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RP"

    // $ANTLR start "RULE_LETTER"
    public final void mRULE_LETTER() throws RecognitionException {
        try {
            // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1059:22: ( ( '$' | 'A' .. 'Z' | 'a' .. 'z' | '_' ) )
            // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1059:24: ( '$' | 'A' .. 'Z' | 'a' .. 'z' | '_' )
            {
            if ( input.LA(1)=='$'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_LETTER"

    // $ANTLR start "RULE_NUMBER"
    public final void mRULE_NUMBER() throws RecognitionException {
        try {
            // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1061:22: ( '0' .. '9' )
            // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1061:24: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_NUMBER"

    // $ANTLR start "RULE_SEQUENTIAL_SEPARATOR"
    public final void mRULE_SEQUENTIAL_SEPARATOR() throws RecognitionException {
        try {
            int _type = RULE_SEQUENTIAL_SEPARATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1063:27: ( ';' )
            // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1063:29: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SEQUENTIAL_SEPARATOR"

    // $ANTLR start "RULE_COMMA"
    public final void mRULE_COMMA() throws RecognitionException {
        try {
            int _type = RULE_COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1065:12: ( ',' )
            // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1065:14: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMMA"

    // $ANTLR start "RULE_SPLIT"
    public final void mRULE_SPLIT() throws RecognitionException {
        try {
            int _type = RULE_SPLIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1067:12: ( '[' )
            // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1067:14: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SPLIT"

    // $ANTLR start "RULE_JOIN"
    public final void mRULE_JOIN() throws RecognitionException {
        try {
            int _type = RULE_JOIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1069:11: ( ']' )
            // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1069:13: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_JOIN"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1071:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1071:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1071:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1071:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1071:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1073:10: ( ( '0' .. '9' )+ )
            // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1073:12: ( '0' .. '9' )+
            {
            // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1073:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1073:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1075:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1075:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1075:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1075:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1075:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1075:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1075:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1075:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1075:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1075:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1075:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1077:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1077:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1077:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1077:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1079:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1079:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1079:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1079:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1079:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1079:41: ( '\\r' )? '\\n'
                    {
                    // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1079:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1079:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1081:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1081:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1081:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1083:16: ( . )
            // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1083:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1:8: ( RULE_SCALE_IN | RULE_SCALE_OUT | RULE_SCALE_UP | RULE_SCALE_DOWN | RULE_SOFT | RULE_INF | RULE_PARALLEL_SEPARATOR | RULE_LP | RULE_RP | RULE_SEQUENTIAL_SEPARATOR | RULE_COMMA | RULE_SPLIT | RULE_JOIN | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=20;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1:10: RULE_SCALE_IN
                {
                mRULE_SCALE_IN(); 

                }
                break;
            case 2 :
                // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1:24: RULE_SCALE_OUT
                {
                mRULE_SCALE_OUT(); 

                }
                break;
            case 3 :
                // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1:39: RULE_SCALE_UP
                {
                mRULE_SCALE_UP(); 

                }
                break;
            case 4 :
                // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1:53: RULE_SCALE_DOWN
                {
                mRULE_SCALE_DOWN(); 

                }
                break;
            case 5 :
                // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1:69: RULE_SOFT
                {
                mRULE_SOFT(); 

                }
                break;
            case 6 :
                // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1:79: RULE_INF
                {
                mRULE_INF(); 

                }
                break;
            case 7 :
                // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1:88: RULE_PARALLEL_SEPARATOR
                {
                mRULE_PARALLEL_SEPARATOR(); 

                }
                break;
            case 8 :
                // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1:112: RULE_LP
                {
                mRULE_LP(); 

                }
                break;
            case 9 :
                // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1:120: RULE_RP
                {
                mRULE_RP(); 

                }
                break;
            case 10 :
                // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1:128: RULE_SEQUENTIAL_SEPARATOR
                {
                mRULE_SEQUENTIAL_SEPARATOR(); 

                }
                break;
            case 11 :
                // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1:154: RULE_COMMA
                {
                mRULE_COMMA(); 

                }
                break;
            case 12 :
                // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1:165: RULE_SPLIT
                {
                mRULE_SPLIT(); 

                }
                break;
            case 13 :
                // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1:176: RULE_JOIN
                {
                mRULE_JOIN(); 

                }
                break;
            case 14 :
                // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1:186: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 15 :
                // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1:194: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 16 :
                // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1:203: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 17 :
                // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1:215: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 18 :
                // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1:231: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 19 :
                // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1:247: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 20 :
                // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1:255: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\2\24\1\21\6\uffff\1\21\2\uffff\3\21\2\uffff\2\24\1\uffff\1\24\14\uffff\2\24\1\47\1\24\1\51\1\uffff\1\24\1\uffff\4\24\1\62\1\24\1\64\1\24\1\uffff\1\66\1\uffff\1\24\1\uffff\1\70\1\uffff";
    static final String DFA12_eofS =
        "\71\uffff";
    static final String DFA12_minS =
        "\1\0\1\143\1\156\1\174\6\uffff\1\101\2\uffff\2\0\1\52\2\uffff\1\141\1\146\1\uffff\1\146\14\uffff\1\154\1\164\1\60\1\145\1\60\1\uffff\1\104\1\uffff\1\156\1\165\1\160\1\157\1\60\1\164\1\60\1\167\1\uffff\1\60\1\uffff\1\156\1\uffff\1\60\1\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\157\1\156\1\174\6\uffff\1\172\2\uffff\2\uffff\1\57\2\uffff\1\141\1\146\1\uffff\1\146\14\uffff\1\154\1\164\1\172\1\145\1\172\1\uffff\1\125\1\uffff\1\156\1\165\1\160\1\157\1\172\1\164\1\172\1\167\1\uffff\1\172\1\uffff\1\156\1\uffff\1\172\1\uffff";
    static final String DFA12_acceptS =
        "\4\uffff\1\10\1\11\1\12\1\13\1\14\1\15\1\uffff\1\16\1\17\3\uffff\1\23\1\24\2\uffff\1\16\1\uffff\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\17\1\20\1\21\1\22\1\23\5\uffff\1\6\1\uffff\1\5\10\uffff\1\1\1\uffff\1\3\1\uffff\1\2\1\uffff\1\4";
    static final String DFA12_specialS =
        "\1\2\14\uffff\1\0\1\1\52\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\21\2\20\2\21\1\20\22\21\1\20\1\21\1\15\4\21\1\16\1\4\1\5\2\21\1\7\2\21\1\17\12\14\1\21\1\6\5\21\10\13\1\2\11\13\1\1\7\13\1\10\1\21\1\11\1\12\1\13\1\21\32\13\1\21\1\3\uff83\21",
            "\1\22\13\uffff\1\23",
            "\1\25",
            "\1\26",
            "",
            "",
            "",
            "",
            "",
            "",
            "\32\24\4\uffff\1\24\1\uffff\32\24",
            "",
            "",
            "\0\36",
            "\0\36",
            "\1\37\4\uffff\1\40",
            "",
            "",
            "\1\42",
            "\1\43",
            "",
            "\1\44",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\45",
            "\1\46",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\1\50",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "",
            "\1\55\4\uffff\1\52\5\uffff\1\53\5\uffff\1\54",
            "",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\1\63",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\1\65",
            "",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "",
            "\1\67",
            "",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( RULE_SCALE_IN | RULE_SCALE_OUT | RULE_SCALE_UP | RULE_SCALE_DOWN | RULE_SOFT | RULE_INF | RULE_PARALLEL_SEPARATOR | RULE_LP | RULE_RP | RULE_SEQUENTIAL_SEPARATOR | RULE_COMMA | RULE_SPLIT | RULE_JOIN | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_13 = input.LA(1);

                        s = -1;
                        if ( ((LA12_13>='\u0000' && LA12_13<='\uFFFF')) ) {s = 30;}

                        else s = 17;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_14 = input.LA(1);

                        s = -1;
                        if ( ((LA12_14>='\u0000' && LA12_14<='\uFFFF')) ) {s = 30;}

                        else s = 17;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='S') ) {s = 1;}

                        else if ( (LA12_0=='I') ) {s = 2;}

                        else if ( (LA12_0=='|') ) {s = 3;}

                        else if ( (LA12_0=='(') ) {s = 4;}

                        else if ( (LA12_0==')') ) {s = 5;}

                        else if ( (LA12_0==';') ) {s = 6;}

                        else if ( (LA12_0==',') ) {s = 7;}

                        else if ( (LA12_0=='[') ) {s = 8;}

                        else if ( (LA12_0==']') ) {s = 9;}

                        else if ( (LA12_0=='^') ) {s = 10;}

                        else if ( ((LA12_0>='A' && LA12_0<='H')||(LA12_0>='J' && LA12_0<='R')||(LA12_0>='T' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='z')) ) {s = 11;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 12;}

                        else if ( (LA12_0=='\"') ) {s = 13;}

                        else if ( (LA12_0=='\'') ) {s = 14;}

                        else if ( (LA12_0=='/') ) {s = 15;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 16;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='*' && LA12_0<='+')||(LA12_0>='-' && LA12_0<='.')||LA12_0==':'||(LA12_0>='<' && LA12_0<='@')||LA12_0=='\\'||LA12_0=='`'||LA12_0=='{'||(LA12_0>='}' && LA12_0<='\uFFFF')) ) {s = 17;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}