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
    public static final int RULE_SEQUENTIAL_SEPARATOR=8;
    public static final int RULE_FUNCTION_NAME=11;
    public static final int RULE_STRING=16;
    public static final int RULE_SPLIT=4;
    public static final int RULE_SL_COMMENT=18;
    public static final int EOF=-1;
    public static final int RULE_ID=15;
    public static final int RULE_COMMA=9;
    public static final int RULE_WS=19;
    public static final int RULE_PARALLEL_SEPARATOR=5;
    public static final int RULE_JOIN=10;
    public static final int RULE_ANY_OTHER=20;
    public static final int RULE_NUMBER=14;
    public static final int RULE_LETTER=13;
    public static final int RULE_INT=12;
    public static final int RULE_ML_COMMENT=17;
    public static final int RULE_RP=7;
    public static final int RULE_LP=6;

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

    // $ANTLR start "RULE_FUNCTION_NAME"
    public final void mRULE_FUNCTION_NAME() throws RecognitionException {
        try {
            int _type = RULE_FUNCTION_NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:891:20: ( RULE_LETTER ( RULE_LETTER | RULE_NUMBER )* )
            // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:891:22: RULE_LETTER ( RULE_LETTER | RULE_NUMBER )*
            {
            mRULE_LETTER(); 
            // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:891:34: ( RULE_LETTER | RULE_NUMBER )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='$'||(LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:
            	    {
            	    if ( input.LA(1)=='$'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FUNCTION_NAME"

    // $ANTLR start "RULE_PARALLEL_SEPARATOR"
    public final void mRULE_PARALLEL_SEPARATOR() throws RecognitionException {
        try {
            int _type = RULE_PARALLEL_SEPARATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:893:25: ( '||' )
            // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:893:27: '||'
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
            // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:895:9: ( '(' )
            // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:895:11: '('
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
            // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:897:9: ( ')' )
            // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:897:11: ')'
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
            // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:899:22: ( ( '$' | 'A' .. 'Z' | 'a' .. 'z' | '_' ) )
            // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:899:24: ( '$' | 'A' .. 'Z' | 'a' .. 'z' | '_' )
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
            // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:901:22: ( '0' .. '9' )
            // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:901:24: '0' .. '9'
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
            // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:903:27: ( ';' )
            // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:903:29: ';'
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
            // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:905:12: ( ',' )
            // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:905:14: ','
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
            // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:907:12: ( '[' )
            // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:907:14: '['
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
            // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:909:11: ( ']' )
            // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:909:13: ']'
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
            // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:911:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:911:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:911:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:911:11: '^'
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

            // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:911:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
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
            	    break loop3;
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
            // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:913:10: ( ( '0' .. '9' )+ )
            // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:913:12: ( '0' .. '9' )+
            {
            // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:913:12: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:913:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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
            // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:915:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:915:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:915:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:915:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:915:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:915:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:915:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop5;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:915:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:915:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:915:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:915:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop6;
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
            // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:917:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:917:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:917:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:917:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
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
            // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:919:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:919:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:919:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:919:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop9;
                }
            } while (true);

            // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:919:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:919:41: ( '\\r' )? '\\n'
                    {
                    // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:919:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:919:41: '\\r'
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
            // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:921:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:921:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:921:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
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
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
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
            // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:923:16: ( . )
            // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:923:18: .
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
        // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1:8: ( RULE_FUNCTION_NAME | RULE_PARALLEL_SEPARATOR | RULE_LP | RULE_RP | RULE_SEQUENTIAL_SEPARATOR | RULE_COMMA | RULE_SPLIT | RULE_JOIN | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=15;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1:10: RULE_FUNCTION_NAME
                {
                mRULE_FUNCTION_NAME(); 

                }
                break;
            case 2 :
                // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1:29: RULE_PARALLEL_SEPARATOR
                {
                mRULE_PARALLEL_SEPARATOR(); 

                }
                break;
            case 3 :
                // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1:53: RULE_LP
                {
                mRULE_LP(); 

                }
                break;
            case 4 :
                // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1:61: RULE_RP
                {
                mRULE_RP(); 

                }
                break;
            case 5 :
                // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1:69: RULE_SEQUENTIAL_SEPARATOR
                {
                mRULE_SEQUENTIAL_SEPARATOR(); 

                }
                break;
            case 6 :
                // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1:95: RULE_COMMA
                {
                mRULE_COMMA(); 

                }
                break;
            case 7 :
                // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1:106: RULE_SPLIT
                {
                mRULE_SPLIT(); 

                }
                break;
            case 8 :
                // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1:117: RULE_JOIN
                {
                mRULE_JOIN(); 

                }
                break;
            case 9 :
                // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1:127: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 10 :
                // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1:135: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 11 :
                // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1:144: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 12 :
                // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1:156: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 13 :
                // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1:172: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 14 :
                // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1:188: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 15 :
                // ../org.elascript.ui/src-gen/org/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1:196: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\1\22\1\20\6\uffff\1\20\2\uffff\3\20\2\uffff\1\22\16\uffff";
    static final String DFA13_eofS =
        "\40\uffff";
    static final String DFA13_minS =
        "\1\0\1\60\1\174\6\uffff\1\101\2\uffff\2\0\1\52\2\uffff\1\60\16"+
        "\uffff";
    static final String DFA13_maxS =
        "\1\uffff\1\172\1\174\6\uffff\1\172\2\uffff\2\uffff\1\57\2\uffff"+
        "\1\172\16\uffff";
    static final String DFA13_acceptS =
        "\3\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\uffff\1\1\1\12\3\uffff\1\16"+
        "\1\17\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16";
    static final String DFA13_specialS =
        "\1\1\13\uffff\1\0\1\2\22\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\20\2\17\2\20\1\17\22\20\1\17\1\20\1\14\1\20\1\12\2\20\1"+
            "\15\1\3\1\4\2\20\1\6\2\20\1\16\12\13\1\20\1\5\5\20\32\1\1\7"+
            "\1\20\1\10\1\11\1\1\1\20\32\1\1\20\1\2\uff83\20",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "\1\23",
            "",
            "",
            "",
            "",
            "",
            "",
            "\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "",
            "\0\34",
            "\0\34",
            "\1\35\4\uffff\1\36",
            "",
            "",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
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
            "",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( RULE_FUNCTION_NAME | RULE_PARALLEL_SEPARATOR | RULE_LP | RULE_RP | RULE_SEQUENTIAL_SEPARATOR | RULE_COMMA | RULE_SPLIT | RULE_JOIN | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_12 = input.LA(1);

                        s = -1;
                        if ( ((LA13_12>='\u0000' && LA13_12<='\uFFFF')) ) {s = 28;}

                        else s = 16;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( ((LA13_0>='A' && LA13_0<='Z')||LA13_0=='_'||(LA13_0>='a' && LA13_0<='z')) ) {s = 1;}

                        else if ( (LA13_0=='|') ) {s = 2;}

                        else if ( (LA13_0=='(') ) {s = 3;}

                        else if ( (LA13_0==')') ) {s = 4;}

                        else if ( (LA13_0==';') ) {s = 5;}

                        else if ( (LA13_0==',') ) {s = 6;}

                        else if ( (LA13_0=='[') ) {s = 7;}

                        else if ( (LA13_0==']') ) {s = 8;}

                        else if ( (LA13_0=='^') ) {s = 9;}

                        else if ( (LA13_0=='$') ) {s = 10;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 11;}

                        else if ( (LA13_0=='\"') ) {s = 12;}

                        else if ( (LA13_0=='\'') ) {s = 13;}

                        else if ( (LA13_0=='/') ) {s = 14;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 15;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||LA13_0=='#'||(LA13_0>='%' && LA13_0<='&')||(LA13_0>='*' && LA13_0<='+')||(LA13_0>='-' && LA13_0<='.')||LA13_0==':'||(LA13_0>='<' && LA13_0<='@')||LA13_0=='\\'||LA13_0=='`'||LA13_0=='{'||(LA13_0>='}' && LA13_0<='\uFFFF')) ) {s = 16;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_13 = input.LA(1);

                        s = -1;
                        if ( ((LA13_13>='\u0000' && LA13_13<='\uFFFF')) ) {s = 28;}

                        else s = 16;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}