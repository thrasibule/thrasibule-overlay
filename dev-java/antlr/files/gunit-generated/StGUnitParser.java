// $ANTLR 3.3 March 12, 2011 17:33:47 org/antlr/gunit/swingui/parsers/StGUnit.g 2011-03-18 09:45:44

package org.antlr.gunit.swingui.parsers;
import org.antlr.gunit.swingui.model.*;
import org.antlr.gunit.swingui.runner.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class StGUnitParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "OK", "FAIL", "DOC_COMMENT", "ACTION", "RULE_REF", "TOKEN_REF", "RETVAL", "AST", "STRING", "ML_STRING", "EXT", "SL_COMMENT", "ML_COMMENT", "ESC", "NESTED_RETVAL", "NESTED_AST", "NESTED_ACTION", "STRING_LITERAL", "CHAR_LITERAL", "XDIGIT", "WS", "'gunit'", "'walks'", "';'", "'@header'", "':'", "'returns'", "'->'"
    };
    public static final int EOF=-1;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int OK=4;
    public static final int FAIL=5;
    public static final int DOC_COMMENT=6;
    public static final int ACTION=7;
    public static final int RULE_REF=8;
    public static final int TOKEN_REF=9;
    public static final int RETVAL=10;
    public static final int AST=11;
    public static final int STRING=12;
    public static final int ML_STRING=13;
    public static final int EXT=14;
    public static final int SL_COMMENT=15;
    public static final int ML_COMMENT=16;
    public static final int ESC=17;
    public static final int NESTED_RETVAL=18;
    public static final int NESTED_AST=19;
    public static final int NESTED_ACTION=20;
    public static final int STRING_LITERAL=21;
    public static final int CHAR_LITERAL=22;
    public static final int XDIGIT=23;
    public static final int WS=24;

    // delegates
    // delegators


        public StGUnitParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public StGUnitParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return StGUnitParser.tokenNames; }
    public String getGrammarFileName() { return "org/antlr/gunit/swingui/parsers/StGUnit.g"; }


    public TestSuiteAdapter adapter ;;



    // $ANTLR start "gUnitDef"
    // org/antlr/gunit/swingui/parsers/StGUnit.g:52:1: gUnitDef : 'gunit' name= id ( 'walks' id )? ';' ( header )? ( suite )* ;
    public final void gUnitDef() throws RecognitionException {
        StGUnitParser.id_return name = null;


        try {
            // org/antlr/gunit/swingui/parsers/StGUnit.g:53:2: ( 'gunit' name= id ( 'walks' id )? ';' ( header )? ( suite )* )
            // org/antlr/gunit/swingui/parsers/StGUnit.g:53:4: 'gunit' name= id ( 'walks' id )? ';' ( header )? ( suite )*
            {
            match(input,25,FOLLOW_25_in_gUnitDef68); 
            pushFollow(FOLLOW_id_in_gUnitDef72);
            name=id();

            state._fsp--;

            adapter.setGrammarName((name!=null?input.toString(name.start,name.stop):null));
            // org/antlr/gunit/swingui/parsers/StGUnit.g:54:6: ( 'walks' id )?
            int alt1=2;
            switch ( input.LA(1) ) {
                case 26:
                    {
                    alt1=1;
                    }
                    break;
            }

            switch (alt1) {
                case 1 :
                    // org/antlr/gunit/swingui/parsers/StGUnit.g:54:7: 'walks' id
                    {
                    match(input,26,FOLLOW_26_in_gUnitDef82); 
                    pushFollow(FOLLOW_id_in_gUnitDef84);
                    id();

                    state._fsp--;


                    }
                    break;

            }

            match(input,27,FOLLOW_27_in_gUnitDef88); 
            // org/antlr/gunit/swingui/parsers/StGUnit.g:55:3: ( header )?
            int alt2=2;
            switch ( input.LA(1) ) {
                case 28:
                    {
                    alt2=1;
                    }
                    break;
            }

            switch (alt2) {
                case 1 :
                    // org/antlr/gunit/swingui/parsers/StGUnit.g:55:3: header
                    {
                    pushFollow(FOLLOW_header_in_gUnitDef93);
                    header();

                    state._fsp--;


                    }
                    break;

            }

            // org/antlr/gunit/swingui/parsers/StGUnit.g:55:11: ( suite )*
            loop3:
            do {
                int alt3=2;
                switch ( input.LA(1) ) {
                case RULE_REF:
                case TOKEN_REF:
                    {
                    alt3=1;
                    }
                    break;

                }

                switch (alt3) {
            	case 1 :
            	    // org/antlr/gunit/swingui/parsers/StGUnit.g:55:11: suite
            	    {
            	    pushFollow(FOLLOW_suite_in_gUnitDef96);
            	    suite();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "gUnitDef"


    // $ANTLR start "header"
    // org/antlr/gunit/swingui/parsers/StGUnit.g:58:1: header : '@header' ACTION ;
    public final void header() throws RecognitionException {
        try {
            // org/antlr/gunit/swingui/parsers/StGUnit.g:59:2: ( '@header' ACTION )
            // org/antlr/gunit/swingui/parsers/StGUnit.g:59:4: '@header' ACTION
            {
            match(input,28,FOLLOW_28_in_header108); 
            match(input,ACTION,FOLLOW_ACTION_in_header110); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "header"


    // $ANTLR start "suite"
    // org/antlr/gunit/swingui/parsers/StGUnit.g:62:1: suite : (parserRule= RULE_REF ( 'walks' RULE_REF )? | lexerRule= TOKEN_REF ) ':' ( test )+ ;
    public final void suite() throws RecognitionException {
        Token parserRule=null;
        Token lexerRule=null;

        try {
            // org/antlr/gunit/swingui/parsers/StGUnit.g:63:2: ( (parserRule= RULE_REF ( 'walks' RULE_REF )? | lexerRule= TOKEN_REF ) ':' ( test )+ )
            // org/antlr/gunit/swingui/parsers/StGUnit.g:63:4: (parserRule= RULE_REF ( 'walks' RULE_REF )? | lexerRule= TOKEN_REF ) ':' ( test )+
            {
            // org/antlr/gunit/swingui/parsers/StGUnit.g:63:4: (parserRule= RULE_REF ( 'walks' RULE_REF )? | lexerRule= TOKEN_REF )
            int alt5=2;
            switch ( input.LA(1) ) {
            case RULE_REF:
                {
                alt5=1;
                }
                break;
            case TOKEN_REF:
                {
                alt5=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // org/antlr/gunit/swingui/parsers/StGUnit.g:63:6: parserRule= RULE_REF ( 'walks' RULE_REF )?
                    {
                    parserRule=(Token)match(input,RULE_REF,FOLLOW_RULE_REF_in_suite127); 
                    // org/antlr/gunit/swingui/parsers/StGUnit.g:63:26: ( 'walks' RULE_REF )?
                    int alt4=2;
                    switch ( input.LA(1) ) {
                        case 26:
                            {
                            alt4=1;
                            }
                            break;
                    }

                    switch (alt4) {
                        case 1 :
                            // org/antlr/gunit/swingui/parsers/StGUnit.g:63:27: 'walks' RULE_REF
                            {
                            match(input,26,FOLLOW_26_in_suite130); 
                            match(input,RULE_REF,FOLLOW_RULE_REF_in_suite132); 

                            }
                            break;

                    }

                    adapter.startRule((parserRule!=null?parserRule.getText():null));

                    }
                    break;
                case 2 :
                    // org/antlr/gunit/swingui/parsers/StGUnit.g:65:5: lexerRule= TOKEN_REF
                    {
                    lexerRule=(Token)match(input,TOKEN_REF,FOLLOW_TOKEN_REF_in_suite154); 
                    adapter.startRule((lexerRule!=null?lexerRule.getText():null));

                    }
                    break;

            }

            match(input,29,FOLLOW_29_in_suite168); 
            // org/antlr/gunit/swingui/parsers/StGUnit.g:69:3: ( test )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                switch ( input.LA(1) ) {
                case RULE_REF:
                    {
                    switch ( input.LA(2) ) {
                    case OK:
                    case FAIL:
                    case EXT:
                    case 30:
                    case 31:
                        {
                        alt6=1;
                        }
                        break;

                    }

                    }
                    break;
                case TOKEN_REF:
                    {
                    switch ( input.LA(2) ) {
                    case OK:
                    case FAIL:
                    case EXT:
                    case 30:
                    case 31:
                        {
                        alt6=1;
                        }
                        break;

                    }

                    }
                    break;
                case STRING:
                case ML_STRING:
                    {
                    alt6=1;
                    }
                    break;

                }

                switch (alt6) {
            	case 1 :
            	    // org/antlr/gunit/swingui/parsers/StGUnit.g:69:3: test
            	    {
            	    pushFollow(FOLLOW_test_in_suite172);
            	    test();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            adapter.endRule();

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "suite"


    // $ANTLR start "test"
    // org/antlr/gunit/swingui/parsers/StGUnit.g:73:1: test : input expect ;
    public final void test() throws RecognitionException {
        ITestCaseInput input1 = null;

        ITestCaseOutput expect2 = null;


        try {
            // org/antlr/gunit/swingui/parsers/StGUnit.g:74:2: ( input expect )
            // org/antlr/gunit/swingui/parsers/StGUnit.g:74:4: input expect
            {
            pushFollow(FOLLOW_input_in_test188);
            input1=input();

            state._fsp--;

            pushFollow(FOLLOW_expect_in_test190);
            expect2=expect();

            state._fsp--;

            adapter.addTestCase(input1, expect2);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "test"


    // $ANTLR start "expect"
    // org/antlr/gunit/swingui/parsers/StGUnit.g:78:1: expect returns [ITestCaseOutput out] : ( OK | FAIL | 'returns' RETVAL | '->' output | '->' AST );
    public final ITestCaseOutput expect() throws RecognitionException {
        ITestCaseOutput out = null;

        Token RETVAL3=null;
        Token AST5=null;
        StGUnitParser.output_return output4 = null;


        try {
            // org/antlr/gunit/swingui/parsers/StGUnit.g:79:2: ( OK | FAIL | 'returns' RETVAL | '->' output | '->' AST )
            int alt7=5;
            switch ( input.LA(1) ) {
            case OK:
                {
                alt7=1;
                }
                break;
            case FAIL:
                {
                alt7=2;
                }
                break;
            case 30:
                {
                alt7=3;
                }
                break;
            case 31:
                {
                switch ( input.LA(2) ) {
                case AST:
                    {
                    alt7=5;
                    }
                    break;
                case ACTION:
                case STRING:
                case ML_STRING:
                    {
                    alt7=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 4, input);

                    throw nvae;
                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // org/antlr/gunit/swingui/parsers/StGUnit.g:79:4: OK
                    {
                    match(input,OK,FOLLOW_OK_in_expect210); 
                    out = adapter.createBoolOutput(true);

                    }
                    break;
                case 2 :
                    // org/antlr/gunit/swingui/parsers/StGUnit.g:80:4: FAIL
                    {
                    match(input,FAIL,FOLLOW_FAIL_in_expect219); 
                    out = adapter.createBoolOutput(false);

                    }
                    break;
                case 3 :
                    // org/antlr/gunit/swingui/parsers/StGUnit.g:81:4: 'returns' RETVAL
                    {
                    match(input,30,FOLLOW_30_in_expect227); 
                    RETVAL3=(Token)match(input,RETVAL,FOLLOW_RETVAL_in_expect229); 
                    out = adapter.createReturnOutput((RETVAL3!=null?RETVAL3.getText():null));

                    }
                    break;
                case 4 :
                    // org/antlr/gunit/swingui/parsers/StGUnit.g:82:4: '->' output
                    {
                    match(input,31,FOLLOW_31_in_expect236); 
                    pushFollow(FOLLOW_output_in_expect238);
                    output4=output();

                    state._fsp--;

                    out = adapter.createStdOutput((output4!=null?input.toString(output4.start,output4.stop):null));

                    }
                    break;
                case 5 :
                    // org/antlr/gunit/swingui/parsers/StGUnit.g:83:4: '->' AST
                    {
                    match(input,31,FOLLOW_31_in_expect245); 
                    AST5=(Token)match(input,AST,FOLLOW_AST_in_expect247); 
                    out = adapter.createAstOutput((AST5!=null?AST5.getText():null));

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return out;
    }
    // $ANTLR end "expect"


    // $ANTLR start "input"
    // org/antlr/gunit/swingui/parsers/StGUnit.g:86:1: input returns [ITestCaseInput in] : ( STRING | ML_STRING | fileInput );
    public final ITestCaseInput input() throws RecognitionException {
        ITestCaseInput in = null;

        Token STRING6=null;
        Token ML_STRING7=null;
        String fileInput8 = null;


        try {
            // org/antlr/gunit/swingui/parsers/StGUnit.g:87:2: ( STRING | ML_STRING | fileInput )
            int alt8=3;
            switch ( input.LA(1) ) {
            case STRING:
                {
                alt8=1;
                }
                break;
            case ML_STRING:
                {
                alt8=2;
                }
                break;
            case RULE_REF:
            case TOKEN_REF:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // org/antlr/gunit/swingui/parsers/StGUnit.g:87:4: STRING
                    {
                    STRING6=(Token)match(input,STRING,FOLLOW_STRING_in_input264); 
                    in = adapter.createStringInput((STRING6!=null?STRING6.getText():null));

                    }
                    break;
                case 2 :
                    // org/antlr/gunit/swingui/parsers/StGUnit.g:88:4: ML_STRING
                    {
                    ML_STRING7=(Token)match(input,ML_STRING,FOLLOW_ML_STRING_in_input273); 
                    in = adapter.createMultiInput((ML_STRING7!=null?ML_STRING7.getText():null));

                    }
                    break;
                case 3 :
                    // org/antlr/gunit/swingui/parsers/StGUnit.g:89:4: fileInput
                    {
                    pushFollow(FOLLOW_fileInput_in_input280);
                    fileInput8=fileInput();

                    state._fsp--;

                    in = adapter.createFileInput(fileInput8);

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return in;
    }
    // $ANTLR end "input"

    public static class output_return extends ParserRuleReturnScope {
    };

    // $ANTLR start "output"
    // org/antlr/gunit/swingui/parsers/StGUnit.g:92:1: output : ( STRING | ML_STRING | ACTION );
    public final StGUnitParser.output_return output() throws RecognitionException {
        StGUnitParser.output_return retval = new StGUnitParser.output_return();
        retval.start = input.LT(1);

        try {
            // org/antlr/gunit/swingui/parsers/StGUnit.g:93:2: ( STRING | ML_STRING | ACTION )
            // org/antlr/gunit/swingui/parsers/StGUnit.g:
            {
            if ( input.LA(1)==ACTION||(input.LA(1)>=STRING && input.LA(1)<=ML_STRING) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "output"


    // $ANTLR start "fileInput"
    // org/antlr/gunit/swingui/parsers/StGUnit.g:98:1: fileInput returns [String path] : id ( EXT )? ;
    public final String fileInput() throws RecognitionException {
        String path = null;

        Token EXT10=null;
        StGUnitParser.id_return id9 = null;


        try {
            // org/antlr/gunit/swingui/parsers/StGUnit.g:99:2: ( id ( EXT )? )
            // org/antlr/gunit/swingui/parsers/StGUnit.g:99:4: id ( EXT )?
            {
            pushFollow(FOLLOW_id_in_fileInput319);
            id9=id();

            state._fsp--;

            path = (id9!=null?input.toString(id9.start,id9.stop):null);
            // org/antlr/gunit/swingui/parsers/StGUnit.g:99:27: ( EXT )?
            int alt9=2;
            switch ( input.LA(1) ) {
                case EXT:
                    {
                    alt9=1;
                    }
                    break;
            }

            switch (alt9) {
                case 1 :
                    // org/antlr/gunit/swingui/parsers/StGUnit.g:99:28: EXT
                    {
                    EXT10=(Token)match(input,EXT,FOLLOW_EXT_in_fileInput324); 
                    path += (EXT10!=null?EXT10.getText():null);

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return path;
    }
    // $ANTLR end "fileInput"

    public static class id_return extends ParserRuleReturnScope {
    };

    // $ANTLR start "id"
    // org/antlr/gunit/swingui/parsers/StGUnit.g:102:1: id : ( TOKEN_REF | RULE_REF );
    public final StGUnitParser.id_return id() throws RecognitionException {
        StGUnitParser.id_return retval = new StGUnitParser.id_return();
        retval.start = input.LT(1);

        try {
            // org/antlr/gunit/swingui/parsers/StGUnit.g:102:5: ( TOKEN_REF | RULE_REF )
            // org/antlr/gunit/swingui/parsers/StGUnit.g:
            {
            if ( (input.LA(1)>=RULE_REF && input.LA(1)<=TOKEN_REF) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "id"

    // Delegated rules


 

    public static final BitSet FOLLOW_25_in_gUnitDef68 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_id_in_gUnitDef72 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_26_in_gUnitDef82 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_id_in_gUnitDef84 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_gUnitDef88 = new BitSet(new long[]{0x0000000010000302L});
    public static final BitSet FOLLOW_header_in_gUnitDef93 = new BitSet(new long[]{0x0000000000000302L});
    public static final BitSet FOLLOW_suite_in_gUnitDef96 = new BitSet(new long[]{0x0000000000000302L});
    public static final BitSet FOLLOW_28_in_header108 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ACTION_in_header110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REF_in_suite127 = new BitSet(new long[]{0x0000000024000000L});
    public static final BitSet FOLLOW_26_in_suite130 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_REF_in_suite132 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_TOKEN_REF_in_suite154 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_suite168 = new BitSet(new long[]{0x0000000000003300L});
    public static final BitSet FOLLOW_test_in_suite172 = new BitSet(new long[]{0x0000000000003302L});
    public static final BitSet FOLLOW_input_in_test188 = new BitSet(new long[]{0x00000000C0000030L});
    public static final BitSet FOLLOW_expect_in_test190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OK_in_expect210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FAIL_in_expect219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_expect227 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RETVAL_in_expect229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_expect236 = new BitSet(new long[]{0x0000000000003080L});
    public static final BitSet FOLLOW_output_in_expect238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_expect245 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_AST_in_expect247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_input264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ML_STRING_in_input273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fileInput_in_input280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_output0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_fileInput319 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_EXT_in_fileInput324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_id0 = new BitSet(new long[]{0x0000000000000002L});

}