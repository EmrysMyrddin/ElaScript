package emn.a1.elascript.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalElascriptLexer extends Lexer {
    public static final int RULE_SEQUENTIAL_SEPARATOR=7;
    public static final int RULE_STRING=13;
    public static final int RULE_SL_COMMENT=15;
    public static final int T__19=19;
    public static final int T__18=18;
    public static final int EOF=-1;
    public static final int RULE_ID=9;
    public static final int RULE_COMMA=8;
    public static final int RULE_WS=16;
    public static final int RULE_PARALLEL_SEPARATOR=4;
    public static final int RULE_ANY_OTHER=17;
    public static final int RULE_NUMBER=12;
    public static final int RULE_LETTER=11;
    public static final int RULE_INT=10;
    public static final int RULE_ML_COMMENT=14;
    public static final int RULE_RP=6;
    public static final int RULE_LP=5;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalElascriptLexer() {;} 
    public InternalElascriptLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalElascriptLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../emn.a1.elascript.ui/src-gen/emn/a1/elascript/ui/contentassist/antlr/internal/InternalElascript.g"; }

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../emn.a1.elascript.ui/src-gen/emn/a1/elascript/ui/contentassist/antlr/internal/InternalElascript.g:11:7: ( 'begin' )
            // ../emn.a1.elascript.ui/src-gen/emn/a1/elascript/ui/contentassist/antlr/internal/InternalElascript.g:11:9: 'begin'
            {
            match("begin"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../emn.a1.elascript.ui/src-gen/emn/a1/elascript/ui/contentassist/antlr/internal/InternalElascript.g:12:7: ( 'end' )
            // ../emn.a1.elascript.ui/src-gen/emn/a1/elascript/ui/contentassist/antlr/internal/InternalElascript.g:12:9: 'end'
            {
            match("end"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../emn.a1.elascript.ui/src-gen/emn/a1/elascript/ui/contentassist/antlr/internal/InternalElascript.g:13:7: ( '[' )
            // ../emn.a1.elascript.ui/src-gen/emn/a1/elascript/ui/contentassist/antlr/internal/InternalElascript.g:13:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../emn.a1.elascript.ui/src-gen/emn/a1/elascript/ui/contentassist/antlr/internal/InternalElascript.g:14:7: ( ']' )
            // ../emn.a1.elascript.ui/src-gen/emn/a1/elascript/ui/contentassist/antlr/internal/InternalElascript.g:14:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "RULE_PARALLEL_SEPARATOR"
    public final void mRULE_PARALLEL_SEPARATOR() throws RecognitionException {
        try {
            int _type = RULE_PARALLEL_SEPARATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../emn.a1.elascript.ui/src-gen/emn/a1/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1174:25: ( '||' )
            // ../emn.a1.elascript.ui/src-gen/emn/a1/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1174:27: '||'
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
            // ../emn.a1.elascript.ui/src-gen/emn/a1/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1176:9: ( '(' )
            // ../emn.a1.elascript.ui/src-gen/emn/a1/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1176:11: '('
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
            // ../emn.a1.elascript.ui/src-gen/emn/a1/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1178:9: ( ')' )
            // ../emn.a1.elascript.ui/src-gen/emn/a1/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1178:11: ')'
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
            // ../emn.a1.elascript.ui/src-gen/emn/a1/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1180:22: ( ( '$' | 'A' .. 'Z' | 'a' .. 'z' | '_' ) )
            // ../emn.a1.elascript.ui/src-gen/emn/a1/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1180:24: ( '$' | 'A' .. 'Z' | 'a' .. 'z' | '_' )
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
            // ../emn.a1.elascript.ui/src-gen/emn/a1/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1182:22: ( '0' .. '9' )
            // ../emn.a1.elascript.ui/src-gen/emn/a1/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1182:24: '0' .. '9'
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
            // ../emn.a1.elascript.ui/src-gen/emn/a1/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1184:27: ( ';' )
            // ../emn.a1.elascript.ui/src-gen/emn/a1/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1184:29: ';'
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
            // ../emn.a1.elascript.ui/src-gen/emn/a1/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1186:12: ( ',' )
            // ../emn.a1.elascript.ui/src-gen/emn/a1/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1186:14: ','
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

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../emn.a1.elascript.ui/src-gen/emn/a1/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1188:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../emn.a1.elascript.ui/src-gen/emn/a1/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1188:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../emn.a1.elascript.ui/src-gen/emn/a1/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1188:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../emn.a1.elascript.ui/src-gen/emn/a1/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1188:11: '^'
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

            // ../emn.a1.elascript.ui/src-gen/emn/a1/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1188:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../emn.a1.elascript.ui/src-gen/emn/a1/elascript/ui/contentassist/antlr/internal/InternalElascript.g:
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
            // ../emn.a1.elascript.ui/src-gen/emn/a1/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1190:10: ( ( '0' .. '9' )+ )
            // ../emn.a1.elascript.ui/src-gen/emn/a1/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1190:12: ( '0' .. '9' )+
            {
            // ../emn.a1.elascript.ui/src-gen/emn/a1/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1190:12: ( '0' .. '9' )+
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
            	    // ../emn.a1.elascript.ui/src-gen/emn/a1/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1190:13: '0' .. '9'
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
            // ../emn.a1.elascript.ui/src-gen/emn/a1/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1192:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../emn.a1.elascript.ui/src-gen/emn/a1/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1192:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../emn.a1.elascript.ui/src-gen/emn/a1/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1192:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // ../emn.a1.elascript.ui/src-gen/emn/a1/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1192:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../emn.a1.elascript.ui/src-gen/emn/a1/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1192:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // ../emn.a1.elascript.ui/src-gen/emn/a1/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1192:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../emn.a1.elascript.ui/src-gen/emn/a1/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1192:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // ../emn.a1.elascript.ui/src-gen/emn/a1/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1192:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../emn.a1.elascript.ui/src-gen/emn/a1/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1192:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // ../emn.a1.elascript.ui/src-gen/emn/a1/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1192:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../emn.a1.elascript.ui/src-gen/emn/a1/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1192:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // ../emn.a1.elascript.ui/src-gen/emn/a1/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1194:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../emn.a1.elascript.ui/src-gen/emn/a1/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1194:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../emn.a1.elascript.ui/src-gen/emn/a1/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1194:24: ( options {greedy=false; } : . )*
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
            	    // ../emn.a1.elascript.ui/src-gen/emn/a1/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1194:52: .
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
            // ../emn.a1.elascript.ui/src-gen/emn/a1/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1196:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../emn.a1.elascript.ui/src-gen/emn/a1/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1196:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../emn.a1.elascript.ui/src-gen/emn/a1/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1196:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../emn.a1.elascript.ui/src-gen/emn/a1/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1196:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../emn.a1.elascript.ui/src-gen/emn/a1/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1196:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../emn.a1.elascript.ui/src-gen/emn/a1/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1196:41: ( '\\r' )? '\\n'
                    {
                    // ../emn.a1.elascript.ui/src-gen/emn/a1/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1196:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../emn.a1.elascript.ui/src-gen/emn/a1/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1196:41: '\\r'
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
            // ../emn.a1.elascript.ui/src-gen/emn/a1/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1198:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../emn.a1.elascript.ui/src-gen/emn/a1/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1198:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../emn.a1.elascript.ui/src-gen/emn/a1/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1198:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // ../emn.a1.elascript.ui/src-gen/emn/a1/elascript/ui/contentassist/antlr/internal/InternalElascript.g:
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
            // ../emn.a1.elascript.ui/src-gen/emn/a1/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1200:16: ( . )
            // ../emn.a1.elascript.ui/src-gen/emn/a1/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1200:18: .
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
        // ../emn.a1.elascript.ui/src-gen/emn/a1/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1:8: ( T__18 | T__19 | T__20 | T__21 | RULE_PARALLEL_SEPARATOR | RULE_LP | RULE_RP | RULE_SEQUENTIAL_SEPARATOR | RULE_COMMA | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=16;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // ../emn.a1.elascript.ui/src-gen/emn/a1/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1:10: T__18
                {
                mT__18(); 

                }
                break;
            case 2 :
                // ../emn.a1.elascript.ui/src-gen/emn/a1/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1:16: T__19
                {
                mT__19(); 

                }
                break;
            case 3 :
                // ../emn.a1.elascript.ui/src-gen/emn/a1/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1:22: T__20
                {
                mT__20(); 

                }
                break;
            case 4 :
                // ../emn.a1.elascript.ui/src-gen/emn/a1/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1:28: T__21
                {
                mT__21(); 

                }
                break;
            case 5 :
                // ../emn.a1.elascript.ui/src-gen/emn/a1/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1:34: RULE_PARALLEL_SEPARATOR
                {
                mRULE_PARALLEL_SEPARATOR(); 

                }
                break;
            case 6 :
                // ../emn.a1.elascript.ui/src-gen/emn/a1/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1:58: RULE_LP
                {
                mRULE_LP(); 

                }
                break;
            case 7 :
                // ../emn.a1.elascript.ui/src-gen/emn/a1/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1:66: RULE_RP
                {
                mRULE_RP(); 

                }
                break;
            case 8 :
                // ../emn.a1.elascript.ui/src-gen/emn/a1/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1:74: RULE_SEQUENTIAL_SEPARATOR
                {
                mRULE_SEQUENTIAL_SEPARATOR(); 

                }
                break;
            case 9 :
                // ../emn.a1.elascript.ui/src-gen/emn/a1/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1:100: RULE_COMMA
                {
                mRULE_COMMA(); 

                }
                break;
            case 10 :
                // ../emn.a1.elascript.ui/src-gen/emn/a1/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1:111: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 11 :
                // ../emn.a1.elascript.ui/src-gen/emn/a1/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1:119: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 12 :
                // ../emn.a1.elascript.ui/src-gen/emn/a1/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1:128: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 13 :
                // ../emn.a1.elascript.ui/src-gen/emn/a1/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1:140: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 14 :
                // ../emn.a1.elascript.ui/src-gen/emn/a1/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1:156: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 15 :
                // ../emn.a1.elascript.ui/src-gen/emn/a1/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1:172: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 16 :
                // ../emn.a1.elascript.ui/src-gen/emn/a1/elascript/ui/contentassist/antlr/internal/InternalElascript.g:1:180: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\2\23\2\uffff\1\21\4\uffff\1\21\2\uffff\3\21\2\uffff\1"+
        "\23\1\uffff\1\23\14\uffff\1\23\1\44\1\23\1\uffff\1\46\1\uffff";
    static final String DFA12_eofS =
        "\47\uffff";
    static final String DFA12_minS =
        "\1\0\1\145\1\156\2\uffff\1\174\4\uffff\1\101\2\uffff\2\0\1\52\2"+
        "\uffff\1\147\1\uffff\1\144\14\uffff\1\151\1\60\1\156\1\uffff\1\60"+
        "\1\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\145\1\156\2\uffff\1\174\4\uffff\1\172\2\uffff\2\uffff"+
        "\1\57\2\uffff\1\147\1\uffff\1\144\14\uffff\1\151\1\172\1\156\1\uffff"+
        "\1\172\1\uffff";
    static final String DFA12_acceptS =
        "\3\uffff\1\3\1\4\1\uffff\1\6\1\7\1\10\1\11\1\uffff\1\12\1\13\3"+
        "\uffff\1\17\1\20\1\uffff\1\12\1\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1"+
        "\11\1\13\1\14\1\15\1\16\1\17\3\uffff\1\2\1\uffff\1\1";
    static final String DFA12_specialS =
        "\1\0\14\uffff\1\1\1\2\30\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\21\2\20\2\21\1\20\22\21\1\20\1\21\1\15\4\21\1\16\1\6\1"+
            "\7\2\21\1\11\2\21\1\17\12\14\1\21\1\10\5\21\32\13\1\3\1\21\1"+
            "\4\1\12\1\13\1\21\1\13\1\1\2\13\1\2\25\13\1\21\1\5\uff83\21",
            "\1\22",
            "\1\24",
            "",
            "",
            "\1\27",
            "",
            "",
            "",
            "",
            "\32\23\4\uffff\1\23\1\uffff\32\23",
            "",
            "",
            "\0\35",
            "\0\35",
            "\1\36\4\uffff\1\37",
            "",
            "",
            "\1\41",
            "",
            "\1\42",
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
            "\1\43",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\1\45",
            "",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
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
            return "1:1: Tokens : ( T__18 | T__19 | T__20 | T__21 | RULE_PARALLEL_SEPARATOR | RULE_LP | RULE_RP | RULE_SEQUENTIAL_SEPARATOR | RULE_COMMA | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='b') ) {s = 1;}

                        else if ( (LA12_0=='e') ) {s = 2;}

                        else if ( (LA12_0=='[') ) {s = 3;}

                        else if ( (LA12_0==']') ) {s = 4;}

                        else if ( (LA12_0=='|') ) {s = 5;}

                        else if ( (LA12_0=='(') ) {s = 6;}

                        else if ( (LA12_0==')') ) {s = 7;}

                        else if ( (LA12_0==';') ) {s = 8;}

                        else if ( (LA12_0==',') ) {s = 9;}

                        else if ( (LA12_0=='^') ) {s = 10;}

                        else if ( ((LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||LA12_0=='a'||(LA12_0>='c' && LA12_0<='d')||(LA12_0>='f' && LA12_0<='z')) ) {s = 11;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 12;}

                        else if ( (LA12_0=='\"') ) {s = 13;}

                        else if ( (LA12_0=='\'') ) {s = 14;}

                        else if ( (LA12_0=='/') ) {s = 15;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 16;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='*' && LA12_0<='+')||(LA12_0>='-' && LA12_0<='.')||LA12_0==':'||(LA12_0>='<' && LA12_0<='@')||LA12_0=='\\'||LA12_0=='`'||LA12_0=='{'||(LA12_0>='}' && LA12_0<='\uFFFF')) ) {s = 17;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_13 = input.LA(1);

                        s = -1;
                        if ( ((LA12_13>='\u0000' && LA12_13<='\uFFFF')) ) {s = 29;}

                        else s = 17;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_14 = input.LA(1);

                        s = -1;
                        if ( ((LA12_14>='\u0000' && LA12_14<='\uFFFF')) ) {s = 29;}

                        else s = 17;

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