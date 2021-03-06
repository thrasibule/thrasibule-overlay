// $ANTLR 3.2 Sep 23, 2009 14:05:07 org/antlr/grammar/v3/ANTLRv3.g 2011-03-17 21:06:26

    package org.antlr.grammar.v3;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

/** ANTLR v3 grammar written in ANTLR v3 with AST construction */
public class ANTLRv3Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "DOC_COMMENT", "PARSER", "LEXER", "RULE", "BLOCK", "OPTIONAL", "CLOSURE", "POSITIVE_CLOSURE", "SYNPRED", "RANGE", "CHAR_RANGE", "EPSILON", "ALT", "EOR", "EOB", "EOA", "ID", "ARG", "ARGLIST", "RET", "LEXER_GRAMMAR", "PARSER_GRAMMAR", "TREE_GRAMMAR", "COMBINED_GRAMMAR", "LABEL", "TEMPLATE", "SCOPE", "SEMPRED", "GATED_SEMPRED", "SYN_SEMPRED", "BACKTRACK_SEMPRED", "FRAGMENT", "TREE_BEGIN", "ROOT", "BANG", "REWRITE", "AT", "LABEL_ASSIGN", "LIST_LABEL_ASSIGN", "TOKENS", "TOKEN_REF", "STRING_LITERAL", "CHAR_LITERAL", "ACTION", "OPTIONS", "INT", "ARG_ACTION", "RULE_REF", "DOUBLE_QUOTE_STRING_LITERAL", "DOUBLE_ANGLE_STRING_LITERAL", "SRC", "SL_COMMENT", "ML_COMMENT", "LITERAL_CHAR", "ESC", "XDIGIT", "NESTED_ARG_ACTION", "ACTION_STRING_LITERAL", "ACTION_CHAR_LITERAL", "NESTED_ACTION", "ACTION_ESC", "WS_LOOP", "WS", "'lexer'", "'parser'", "'tree'", "'grammar'", "';'", "'}'", "'::'", "'*'", "'protected'", "'public'", "'private'", "':'", "'throws'", "','", "'('", "'|'", "')'", "'catch'", "'finally'", "'=>'", "'~'", "'<'", "'>'", "'.'", "'?'", "'+'", "'$'"
    };
    public static final int BACKTRACK_SEMPRED=34;
    public static final int DOUBLE_ANGLE_STRING_LITERAL=53;
    public static final int LEXER_GRAMMAR=24;
    public static final int EOA=19;
    public static final int ARGLIST=22;
    public static final int EOF=-1;
    public static final int SEMPRED=31;
    public static final int ACTION=47;
    public static final int EOB=18;
    public static final int TOKEN_REF=44;
    public static final int T__93=93;
    public static final int T__91=91;
    public static final int RET=23;
    public static final int T__92=92;
    public static final int STRING_LITERAL=45;
    public static final int T__90=90;
    public static final int ARG=21;
    public static final int EOR=17;
    public static final int ARG_ACTION=50;
    public static final int DOUBLE_QUOTE_STRING_LITERAL=52;
    public static final int NESTED_ARG_ACTION=60;
    public static final int ACTION_CHAR_LITERAL=62;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int RULE=7;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int ACTION_ESC=64;
    public static final int PARSER_GRAMMAR=25;
    public static final int SRC=54;
    public static final int CHAR_RANGE=14;
    public static final int INT=49;
    public static final int EPSILON=15;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int REWRITE=39;
    public static final int T__88=88;
    public static final int WS=66;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int COMBINED_GRAMMAR=27;
    public static final int T__70=70;
    public static final int LEXER=6;
    public static final int SL_COMMENT=55;
    public static final int TREE_GRAMMAR=26;
    public static final int T__76=76;
    public static final int CLOSURE=10;
    public static final int T__75=75;
    public static final int PARSER=5;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__67=67;
    public static final int NESTED_ACTION=63;
    public static final int ESC=58;
    public static final int FRAGMENT=35;
    public static final int ID=20;
    public static final int TREE_BEGIN=36;
    public static final int AT=40;
    public static final int ML_COMMENT=56;
    public static final int ALT=16;
    public static final int SCOPE=30;
    public static final int LABEL_ASSIGN=41;
    public static final int DOC_COMMENT=4;
    public static final int WS_LOOP=65;
    public static final int RANGE=13;
    public static final int TOKENS=43;
    public static final int GATED_SEMPRED=32;
    public static final int LITERAL_CHAR=57;
    public static final int BANG=38;
    public static final int LIST_LABEL_ASSIGN=42;
    public static final int ACTION_STRING_LITERAL=61;
    public static final int ROOT=37;
    public static final int RULE_REF=51;
    public static final int SYNPRED=12;
    public static final int OPTIONAL=9;
    public static final int CHAR_LITERAL=46;
    public static final int LABEL=28;
    public static final int TEMPLATE=29;
    public static final int SYN_SEMPRED=33;
    public static final int XDIGIT=59;
    public static final int BLOCK=8;
    public static final int POSITIVE_CLOSURE=11;
    public static final int OPTIONS=48;

    // delegates
    // delegators


        public ANTLRv3Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public ANTLRv3Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return ANTLRv3Parser.tokenNames; }
    public String getGrammarFileName() { return "org/antlr/grammar/v3/ANTLRv3.g"; }


    	int gtype;


    public static class grammarDef_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "grammarDef"
    // org/antlr/grammar/v3/ANTLRv3.g:92:1: grammarDef : ( DOC_COMMENT )? ( 'lexer' | 'parser' | 'tree' | ) g= 'grammar' id ';' ( optionsSpec )? ( tokensSpec )? ( attrScope )* ( action )* ( rule )+ EOF -> ^( id ( DOC_COMMENT )? ( optionsSpec )? ( tokensSpec )? ( attrScope )* ( action )* ( rule )+ ) ;
    public final ANTLRv3Parser.grammarDef_return grammarDef() throws RecognitionException {
        ANTLRv3Parser.grammarDef_return retval = new ANTLRv3Parser.grammarDef_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token g=null;
        Token DOC_COMMENT1=null;
        Token string_literal2=null;
        Token string_literal3=null;
        Token string_literal4=null;
        Token char_literal6=null;
        Token EOF12=null;
        ANTLRv3Parser.id_return id5 = null;

        ANTLRv3Parser.optionsSpec_return optionsSpec7 = null;

        ANTLRv3Parser.tokensSpec_return tokensSpec8 = null;

        ANTLRv3Parser.attrScope_return attrScope9 = null;

        ANTLRv3Parser.action_return action10 = null;

        ANTLRv3Parser.rule_return rule11 = null;


        CommonTree g_tree=null;
        CommonTree DOC_COMMENT1_tree=null;
        CommonTree string_literal2_tree=null;
        CommonTree string_literal3_tree=null;
        CommonTree string_literal4_tree=null;
        CommonTree char_literal6_tree=null;
        CommonTree EOF12_tree=null;
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_DOC_COMMENT=new RewriteRuleTokenStream(adaptor,"token DOC_COMMENT");
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_tokensSpec=new RewriteRuleSubtreeStream(adaptor,"rule tokensSpec");
        RewriteRuleSubtreeStream stream_attrScope=new RewriteRuleSubtreeStream(adaptor,"rule attrScope");
        RewriteRuleSubtreeStream stream_rule=new RewriteRuleSubtreeStream(adaptor,"rule rule");
        RewriteRuleSubtreeStream stream_action=new RewriteRuleSubtreeStream(adaptor,"rule action");
        RewriteRuleSubtreeStream stream_optionsSpec=new RewriteRuleSubtreeStream(adaptor,"rule optionsSpec");
        try {
            // org/antlr/grammar/v3/ANTLRv3.g:93:5: ( ( DOC_COMMENT )? ( 'lexer' | 'parser' | 'tree' | ) g= 'grammar' id ';' ( optionsSpec )? ( tokensSpec )? ( attrScope )* ( action )* ( rule )+ EOF -> ^( id ( DOC_COMMENT )? ( optionsSpec )? ( tokensSpec )? ( attrScope )* ( action )* ( rule )+ ) )
            // org/antlr/grammar/v3/ANTLRv3.g:93:9: ( DOC_COMMENT )? ( 'lexer' | 'parser' | 'tree' | ) g= 'grammar' id ';' ( optionsSpec )? ( tokensSpec )? ( attrScope )* ( action )* ( rule )+ EOF
            {
            // org/antlr/grammar/v3/ANTLRv3.g:93:9: ( DOC_COMMENT )?
            int alt1=2;
            switch ( input.LA(1) ) {
                case DOC_COMMENT:
                    {
                    alt1=1;
                    }
                    break;
            }

            switch (alt1) {
                case 1 :
                    // org/antlr/grammar/v3/ANTLRv3.g:93:9: DOC_COMMENT
                    {
                    DOC_COMMENT1=(Token)match(input,DOC_COMMENT,FOLLOW_DOC_COMMENT_in_grammarDef367); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOC_COMMENT.add(DOC_COMMENT1);


                    }
                    break;

            }

            // org/antlr/grammar/v3/ANTLRv3.g:94:6: ( 'lexer' | 'parser' | 'tree' | )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt2=1;
                }
                break;
            case 68:
                {
                alt2=2;
                }
                break;
            case 69:
                {
                alt2=3;
                }
                break;
            case 70:
                {
                alt2=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // org/antlr/grammar/v3/ANTLRv3.g:94:8: 'lexer'
                    {
                    string_literal2=(Token)match(input,67,FOLLOW_67_in_grammarDef377); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_67.add(string_literal2);

                    if ( state.backtracking==0 ) {
                      gtype=LEXER_GRAMMAR;
                    }

                    }
                    break;
                case 2 :
                    // org/antlr/grammar/v3/ANTLRv3.g:95:10: 'parser'
                    {
                    string_literal3=(Token)match(input,68,FOLLOW_68_in_grammarDef395); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_68.add(string_literal3);

                    if ( state.backtracking==0 ) {
                      gtype=PARSER_GRAMMAR;
                    }

                    }
                    break;
                case 3 :
                    // org/antlr/grammar/v3/ANTLRv3.g:96:10: 'tree'
                    {
                    string_literal4=(Token)match(input,69,FOLLOW_69_in_grammarDef411); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_69.add(string_literal4);

                    if ( state.backtracking==0 ) {
                      gtype=TREE_GRAMMAR;
                    }

                    }
                    break;
                case 4 :
                    // org/antlr/grammar/v3/ANTLRv3.g:97:14: 
                    {
                    if ( state.backtracking==0 ) {
                      gtype=COMBINED_GRAMMAR;
                    }

                    }
                    break;

            }

            g=(Token)match(input,70,FOLLOW_70_in_grammarDef452); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_70.add(g);

            pushFollow(FOLLOW_id_in_grammarDef454);
            id5=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(id5.getTree());
            char_literal6=(Token)match(input,71,FOLLOW_71_in_grammarDef456); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_71.add(char_literal6);

            // org/antlr/grammar/v3/ANTLRv3.g:99:25: ( optionsSpec )?
            int alt3=2;
            switch ( input.LA(1) ) {
                case OPTIONS:
                    {
                    alt3=1;
                    }
                    break;
            }

            switch (alt3) {
                case 1 :
                    // org/antlr/grammar/v3/ANTLRv3.g:99:25: optionsSpec
                    {
                    pushFollow(FOLLOW_optionsSpec_in_grammarDef458);
                    optionsSpec7=optionsSpec();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_optionsSpec.add(optionsSpec7.getTree());

                    }
                    break;

            }

            // org/antlr/grammar/v3/ANTLRv3.g:99:38: ( tokensSpec )?
            int alt4=2;
            switch ( input.LA(1) ) {
                case TOKENS:
                    {
                    alt4=1;
                    }
                    break;
            }

            switch (alt4) {
                case 1 :
                    // org/antlr/grammar/v3/ANTLRv3.g:99:38: tokensSpec
                    {
                    pushFollow(FOLLOW_tokensSpec_in_grammarDef461);
                    tokensSpec8=tokensSpec();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tokensSpec.add(tokensSpec8.getTree());

                    }
                    break;

            }

            // org/antlr/grammar/v3/ANTLRv3.g:99:50: ( attrScope )*
            loop5:
            do {
                int alt5=2;
                switch ( input.LA(1) ) {
                case SCOPE:
                    {
                    alt5=1;
                    }
                    break;

                }

                switch (alt5) {
            	case 1 :
            	    // org/antlr/grammar/v3/ANTLRv3.g:99:50: attrScope
            	    {
            	    pushFollow(FOLLOW_attrScope_in_grammarDef464);
            	    attrScope9=attrScope();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_attrScope.add(attrScope9.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // org/antlr/grammar/v3/ANTLRv3.g:99:61: ( action )*
            loop6:
            do {
                int alt6=2;
                switch ( input.LA(1) ) {
                case AT:
                    {
                    alt6=1;
                    }
                    break;

                }

                switch (alt6) {
            	case 1 :
            	    // org/antlr/grammar/v3/ANTLRv3.g:99:61: action
            	    {
            	    pushFollow(FOLLOW_action_in_grammarDef467);
            	    action10=action();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_action.add(action10.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // org/antlr/grammar/v3/ANTLRv3.g:100:6: ( rule )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                switch ( input.LA(1) ) {
                case DOC_COMMENT:
                case FRAGMENT:
                case TOKEN_REF:
                case RULE_REF:
                case 75:
                case 76:
                case 77:
                    {
                    alt7=1;
                    }
                    break;

                }

                switch (alt7) {
            	case 1 :
            	    // org/antlr/grammar/v3/ANTLRv3.g:100:6: rule
            	    {
            	    pushFollow(FOLLOW_rule_in_grammarDef475);
            	    rule11=rule();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_rule.add(rule11.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            EOF12=(Token)match(input,EOF,FOLLOW_EOF_in_grammarDef483); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EOF.add(EOF12);



            // AST REWRITE
            // elements: attrScope, id, rule, action, tokensSpec, optionsSpec, DOC_COMMENT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 102:6: -> ^( id ( DOC_COMMENT )? ( optionsSpec )? ( tokensSpec )? ( attrScope )* ( action )* ( rule )+ )
            {
                // org/antlr/grammar/v3/ANTLRv3.g:102:9: ^( id ( DOC_COMMENT )? ( optionsSpec )? ( tokensSpec )? ( attrScope )* ( action )* ( rule )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(gtype,g), root_1);

                adaptor.addChild(root_1, stream_id.nextTree());
                // org/antlr/grammar/v3/ANTLRv3.g:103:12: ( DOC_COMMENT )?
                if ( stream_DOC_COMMENT.hasNext() ) {
                    adaptor.addChild(root_1, stream_DOC_COMMENT.nextNode());

                }
                stream_DOC_COMMENT.reset();
                // org/antlr/grammar/v3/ANTLRv3.g:103:25: ( optionsSpec )?
                if ( stream_optionsSpec.hasNext() ) {
                    adaptor.addChild(root_1, stream_optionsSpec.nextTree());

                }
                stream_optionsSpec.reset();
                // org/antlr/grammar/v3/ANTLRv3.g:103:38: ( tokensSpec )?
                if ( stream_tokensSpec.hasNext() ) {
                    adaptor.addChild(root_1, stream_tokensSpec.nextTree());

                }
                stream_tokensSpec.reset();
                // org/antlr/grammar/v3/ANTLRv3.g:103:50: ( attrScope )*
                while ( stream_attrScope.hasNext() ) {
                    adaptor.addChild(root_1, stream_attrScope.nextTree());

                }
                stream_attrScope.reset();
                // org/antlr/grammar/v3/ANTLRv3.g:103:61: ( action )*
                while ( stream_action.hasNext() ) {
                    adaptor.addChild(root_1, stream_action.nextTree());

                }
                stream_action.reset();
                if ( !(stream_rule.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_rule.hasNext() ) {
                    adaptor.addChild(root_1, stream_rule.nextTree());

                }
                stream_rule.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "grammarDef"

    public static class tokensSpec_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "tokensSpec"
    // org/antlr/grammar/v3/ANTLRv3.g:107:1: tokensSpec : TOKENS ( tokenSpec )+ '}' -> ^( TOKENS ( tokenSpec )+ ) ;
    public final ANTLRv3Parser.tokensSpec_return tokensSpec() throws RecognitionException {
        ANTLRv3Parser.tokensSpec_return retval = new ANTLRv3Parser.tokensSpec_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token TOKENS13=null;
        Token char_literal15=null;
        ANTLRv3Parser.tokenSpec_return tokenSpec14 = null;


        CommonTree TOKENS13_tree=null;
        CommonTree char_literal15_tree=null;
        RewriteRuleTokenStream stream_TOKENS=new RewriteRuleTokenStream(adaptor,"token TOKENS");
        RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
        RewriteRuleSubtreeStream stream_tokenSpec=new RewriteRuleSubtreeStream(adaptor,"rule tokenSpec");
        try {
            // org/antlr/grammar/v3/ANTLRv3.g:108:2: ( TOKENS ( tokenSpec )+ '}' -> ^( TOKENS ( tokenSpec )+ ) )
            // org/antlr/grammar/v3/ANTLRv3.g:108:4: TOKENS ( tokenSpec )+ '}'
            {
            TOKENS13=(Token)match(input,TOKENS,FOLLOW_TOKENS_in_tokensSpec544); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_TOKENS.add(TOKENS13);

            // org/antlr/grammar/v3/ANTLRv3.g:108:11: ( tokenSpec )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                switch ( input.LA(1) ) {
                case TOKEN_REF:
                    {
                    alt8=1;
                    }
                    break;

                }

                switch (alt8) {
            	case 1 :
            	    // org/antlr/grammar/v3/ANTLRv3.g:108:11: tokenSpec
            	    {
            	    pushFollow(FOLLOW_tokenSpec_in_tokensSpec546);
            	    tokenSpec14=tokenSpec();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_tokenSpec.add(tokenSpec14.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            char_literal15=(Token)match(input,72,FOLLOW_72_in_tokensSpec549); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_72.add(char_literal15);



            // AST REWRITE
            // elements: TOKENS, tokenSpec
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 108:26: -> ^( TOKENS ( tokenSpec )+ )
            {
                // org/antlr/grammar/v3/ANTLRv3.g:108:29: ^( TOKENS ( tokenSpec )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_TOKENS.nextNode(), root_1);

                if ( !(stream_tokenSpec.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_tokenSpec.hasNext() ) {
                    adaptor.addChild(root_1, stream_tokenSpec.nextTree());

                }
                stream_tokenSpec.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "tokensSpec"

    public static class tokenSpec_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "tokenSpec"
    // org/antlr/grammar/v3/ANTLRv3.g:111:1: tokenSpec : TOKEN_REF ( '=' (lit= STRING_LITERAL | lit= CHAR_LITERAL ) -> ^( '=' TOKEN_REF $lit) | -> TOKEN_REF ) ';' ;
    public final ANTLRv3Parser.tokenSpec_return tokenSpec() throws RecognitionException {
        ANTLRv3Parser.tokenSpec_return retval = new ANTLRv3Parser.tokenSpec_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token lit=null;
        Token TOKEN_REF16=null;
        Token char_literal17=null;
        Token char_literal18=null;

        CommonTree lit_tree=null;
        CommonTree TOKEN_REF16_tree=null;
        CommonTree char_literal17_tree=null;
        CommonTree char_literal18_tree=null;
        RewriteRuleTokenStream stream_STRING_LITERAL=new RewriteRuleTokenStream(adaptor,"token STRING_LITERAL");
        RewriteRuleTokenStream stream_CHAR_LITERAL=new RewriteRuleTokenStream(adaptor,"token CHAR_LITERAL");
        RewriteRuleTokenStream stream_LABEL_ASSIGN=new RewriteRuleTokenStream(adaptor,"token LABEL_ASSIGN");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleTokenStream stream_TOKEN_REF=new RewriteRuleTokenStream(adaptor,"token TOKEN_REF");

        try {
            // org/antlr/grammar/v3/ANTLRv3.g:112:2: ( TOKEN_REF ( '=' (lit= STRING_LITERAL | lit= CHAR_LITERAL ) -> ^( '=' TOKEN_REF $lit) | -> TOKEN_REF ) ';' )
            // org/antlr/grammar/v3/ANTLRv3.g:112:4: TOKEN_REF ( '=' (lit= STRING_LITERAL | lit= CHAR_LITERAL ) -> ^( '=' TOKEN_REF $lit) | -> TOKEN_REF ) ';'
            {
            TOKEN_REF16=(Token)match(input,TOKEN_REF,FOLLOW_TOKEN_REF_in_tokenSpec569); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_TOKEN_REF.add(TOKEN_REF16);

            // org/antlr/grammar/v3/ANTLRv3.g:113:3: ( '=' (lit= STRING_LITERAL | lit= CHAR_LITERAL ) -> ^( '=' TOKEN_REF $lit) | -> TOKEN_REF )
            int alt10=2;
            switch ( input.LA(1) ) {
            case LABEL_ASSIGN:
                {
                alt10=1;
                }
                break;
            case 71:
                {
                alt10=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // org/antlr/grammar/v3/ANTLRv3.g:113:5: '=' (lit= STRING_LITERAL | lit= CHAR_LITERAL )
                    {
                    char_literal17=(Token)match(input,LABEL_ASSIGN,FOLLOW_LABEL_ASSIGN_in_tokenSpec575); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LABEL_ASSIGN.add(char_literal17);

                    // org/antlr/grammar/v3/ANTLRv3.g:113:9: (lit= STRING_LITERAL | lit= CHAR_LITERAL )
                    int alt9=2;
                    switch ( input.LA(1) ) {
                    case STRING_LITERAL:
                        {
                        alt9=1;
                        }
                        break;
                    case CHAR_LITERAL:
                        {
                        alt9=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 0, input);

                        throw nvae;
                    }

                    switch (alt9) {
                        case 1 :
                            // org/antlr/grammar/v3/ANTLRv3.g:113:10: lit= STRING_LITERAL
                            {
                            lit=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_tokenSpec580); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_STRING_LITERAL.add(lit);


                            }
                            break;
                        case 2 :
                            // org/antlr/grammar/v3/ANTLRv3.g:113:29: lit= CHAR_LITERAL
                            {
                            lit=(Token)match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_tokenSpec584); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_CHAR_LITERAL.add(lit);


                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: LABEL_ASSIGN, lit, TOKEN_REF
                    // token labels: lit
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_lit=new RewriteRuleTokenStream(adaptor,"token lit",lit);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 113:47: -> ^( '=' TOKEN_REF $lit)
                    {
                        // org/antlr/grammar/v3/ANTLRv3.g:113:50: ^( '=' TOKEN_REF $lit)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_LABEL_ASSIGN.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_TOKEN_REF.nextNode());
                        adaptor.addChild(root_1, stream_lit.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // org/antlr/grammar/v3/ANTLRv3.g:114:16: 
                    {

                    // AST REWRITE
                    // elements: TOKEN_REF
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 114:16: -> TOKEN_REF
                    {
                        adaptor.addChild(root_0, stream_TOKEN_REF.nextNode());

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }

            char_literal18=(Token)match(input,71,FOLLOW_71_in_tokenSpec623); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_71.add(char_literal18);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "tokenSpec"

    public static class attrScope_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "attrScope"
    // org/antlr/grammar/v3/ANTLRv3.g:119:1: attrScope : 'scope' id ACTION -> ^( 'scope' id ACTION ) ;
    public final ANTLRv3Parser.attrScope_return attrScope() throws RecognitionException {
        ANTLRv3Parser.attrScope_return retval = new ANTLRv3Parser.attrScope_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal19=null;
        Token ACTION21=null;
        ANTLRv3Parser.id_return id20 = null;


        CommonTree string_literal19_tree=null;
        CommonTree ACTION21_tree=null;
        RewriteRuleTokenStream stream_SCOPE=new RewriteRuleTokenStream(adaptor,"token SCOPE");
        RewriteRuleTokenStream stream_ACTION=new RewriteRuleTokenStream(adaptor,"token ACTION");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        try {
            // org/antlr/grammar/v3/ANTLRv3.g:120:2: ( 'scope' id ACTION -> ^( 'scope' id ACTION ) )
            // org/antlr/grammar/v3/ANTLRv3.g:120:4: 'scope' id ACTION
            {
            string_literal19=(Token)match(input,SCOPE,FOLLOW_SCOPE_in_attrScope634); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SCOPE.add(string_literal19);

            pushFollow(FOLLOW_id_in_attrScope636);
            id20=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(id20.getTree());
            ACTION21=(Token)match(input,ACTION,FOLLOW_ACTION_in_attrScope638); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ACTION.add(ACTION21);



            // AST REWRITE
            // elements: SCOPE, id, ACTION
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 120:22: -> ^( 'scope' id ACTION )
            {
                // org/antlr/grammar/v3/ANTLRv3.g:120:25: ^( 'scope' id ACTION )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_SCOPE.nextNode(), root_1);

                adaptor.addChild(root_1, stream_id.nextTree());
                adaptor.addChild(root_1, stream_ACTION.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "attrScope"

    public static class action_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "action"
    // org/antlr/grammar/v3/ANTLRv3.g:123:1: action : '@' ( actionScopeName '::' )? id ACTION -> ^( '@' ( actionScopeName )? id ACTION ) ;
    public final ANTLRv3Parser.action_return action() throws RecognitionException {
        ANTLRv3Parser.action_return retval = new ANTLRv3Parser.action_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal22=null;
        Token string_literal24=null;
        Token ACTION26=null;
        ANTLRv3Parser.actionScopeName_return actionScopeName23 = null;

        ANTLRv3Parser.id_return id25 = null;


        CommonTree char_literal22_tree=null;
        CommonTree string_literal24_tree=null;
        CommonTree ACTION26_tree=null;
        RewriteRuleTokenStream stream_AT=new RewriteRuleTokenStream(adaptor,"token AT");
        RewriteRuleTokenStream stream_ACTION=new RewriteRuleTokenStream(adaptor,"token ACTION");
        RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_actionScopeName=new RewriteRuleSubtreeStream(adaptor,"rule actionScopeName");
        try {
            // org/antlr/grammar/v3/ANTLRv3.g:125:2: ( '@' ( actionScopeName '::' )? id ACTION -> ^( '@' ( actionScopeName )? id ACTION ) )
            // org/antlr/grammar/v3/ANTLRv3.g:125:4: '@' ( actionScopeName '::' )? id ACTION
            {
            char_literal22=(Token)match(input,AT,FOLLOW_AT_in_action661); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_AT.add(char_literal22);

            // org/antlr/grammar/v3/ANTLRv3.g:125:8: ( actionScopeName '::' )?
            int alt11=2;
            switch ( input.LA(1) ) {
                case TOKEN_REF:
                    {
                    switch ( input.LA(2) ) {
                        case 73:
                            {
                            alt11=1;
                            }
                            break;
                    }

                    }
                    break;
                case RULE_REF:
                    {
                    switch ( input.LA(2) ) {
                        case 73:
                            {
                            alt11=1;
                            }
                            break;
                    }

                    }
                    break;
                case 67:
                case 68:
                    {
                    alt11=1;
                    }
                    break;
            }

            switch (alt11) {
                case 1 :
                    // org/antlr/grammar/v3/ANTLRv3.g:125:9: actionScopeName '::'
                    {
                    pushFollow(FOLLOW_actionScopeName_in_action664);
                    actionScopeName23=actionScopeName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_actionScopeName.add(actionScopeName23.getTree());
                    string_literal24=(Token)match(input,73,FOLLOW_73_in_action666); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_73.add(string_literal24);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_action670);
            id25=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(id25.getTree());
            ACTION26=(Token)match(input,ACTION,FOLLOW_ACTION_in_action672); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ACTION.add(ACTION26);



            // AST REWRITE
            // elements: AT, id, ACTION, actionScopeName
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 125:42: -> ^( '@' ( actionScopeName )? id ACTION )
            {
                // org/antlr/grammar/v3/ANTLRv3.g:125:45: ^( '@' ( actionScopeName )? id ACTION )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_AT.nextNode(), root_1);

                // org/antlr/grammar/v3/ANTLRv3.g:125:51: ( actionScopeName )?
                if ( stream_actionScopeName.hasNext() ) {
                    adaptor.addChild(root_1, stream_actionScopeName.nextTree());

                }
                stream_actionScopeName.reset();
                adaptor.addChild(root_1, stream_id.nextTree());
                adaptor.addChild(root_1, stream_ACTION.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "action"

    public static class actionScopeName_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "actionScopeName"
    // org/antlr/grammar/v3/ANTLRv3.g:128:1: actionScopeName : ( id | l= 'lexer' -> ID[$l] | p= 'parser' -> ID[$p] );
    public final ANTLRv3Parser.actionScopeName_return actionScopeName() throws RecognitionException {
        ANTLRv3Parser.actionScopeName_return retval = new ANTLRv3Parser.actionScopeName_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token l=null;
        Token p=null;
        ANTLRv3Parser.id_return id27 = null;


        CommonTree l_tree=null;
        CommonTree p_tree=null;
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");

        try {
            // org/antlr/grammar/v3/ANTLRv3.g:132:2: ( id | l= 'lexer' -> ID[$l] | p= 'parser' -> ID[$p] )
            int alt12=3;
            switch ( input.LA(1) ) {
            case TOKEN_REF:
            case RULE_REF:
                {
                alt12=1;
                }
                break;
            case 67:
                {
                alt12=2;
                }
                break;
            case 68:
                {
                alt12=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // org/antlr/grammar/v3/ANTLRv3.g:132:4: id
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_id_in_actionScopeName698);
                    id27=id();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, id27.getTree());

                    }
                    break;
                case 2 :
                    // org/antlr/grammar/v3/ANTLRv3.g:133:4: l= 'lexer'
                    {
                    l=(Token)match(input,67,FOLLOW_67_in_actionScopeName705); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_67.add(l);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 133:14: -> ID[$l]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(ID, l));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // org/antlr/grammar/v3/ANTLRv3.g:134:9: p= 'parser'
                    {
                    p=(Token)match(input,68,FOLLOW_68_in_actionScopeName722); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_68.add(p);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 134:20: -> ID[$p]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(ID, p));

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "actionScopeName"

    public static class optionsSpec_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "optionsSpec"
    // org/antlr/grammar/v3/ANTLRv3.g:137:1: optionsSpec : OPTIONS ( option ';' )+ '}' -> ^( OPTIONS ( option )+ ) ;
    public final ANTLRv3Parser.optionsSpec_return optionsSpec() throws RecognitionException {
        ANTLRv3Parser.optionsSpec_return retval = new ANTLRv3Parser.optionsSpec_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token OPTIONS28=null;
        Token char_literal30=null;
        Token char_literal31=null;
        ANTLRv3Parser.option_return option29 = null;


        CommonTree OPTIONS28_tree=null;
        CommonTree char_literal30_tree=null;
        CommonTree char_literal31_tree=null;
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
        RewriteRuleTokenStream stream_OPTIONS=new RewriteRuleTokenStream(adaptor,"token OPTIONS");
        RewriteRuleSubtreeStream stream_option=new RewriteRuleSubtreeStream(adaptor,"rule option");
        try {
            // org/antlr/grammar/v3/ANTLRv3.g:138:2: ( OPTIONS ( option ';' )+ '}' -> ^( OPTIONS ( option )+ ) )
            // org/antlr/grammar/v3/ANTLRv3.g:138:4: OPTIONS ( option ';' )+ '}'
            {
            OPTIONS28=(Token)match(input,OPTIONS,FOLLOW_OPTIONS_in_optionsSpec738); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OPTIONS.add(OPTIONS28);

            // org/antlr/grammar/v3/ANTLRv3.g:138:12: ( option ';' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                switch ( input.LA(1) ) {
                case TOKEN_REF:
                case RULE_REF:
                    {
                    alt13=1;
                    }
                    break;

                }

                switch (alt13) {
            	case 1 :
            	    // org/antlr/grammar/v3/ANTLRv3.g:138:13: option ';'
            	    {
            	    pushFollow(FOLLOW_option_in_optionsSpec741);
            	    option29=option();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_option.add(option29.getTree());
            	    char_literal30=(Token)match(input,71,FOLLOW_71_in_optionsSpec743); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_71.add(char_literal30);


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);

            char_literal31=(Token)match(input,72,FOLLOW_72_in_optionsSpec747); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_72.add(char_literal31);



            // AST REWRITE
            // elements: option, OPTIONS
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 138:30: -> ^( OPTIONS ( option )+ )
            {
                // org/antlr/grammar/v3/ANTLRv3.g:138:33: ^( OPTIONS ( option )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_OPTIONS.nextNode(), root_1);

                if ( !(stream_option.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_option.hasNext() ) {
                    adaptor.addChild(root_1, stream_option.nextTree());

                }
                stream_option.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "optionsSpec"

    public static class option_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "option"
    // org/antlr/grammar/v3/ANTLRv3.g:141:1: option : id '=' optionValue -> ^( '=' id optionValue ) ;
    public final ANTLRv3Parser.option_return option() throws RecognitionException {
        ANTLRv3Parser.option_return retval = new ANTLRv3Parser.option_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal33=null;
        ANTLRv3Parser.id_return id32 = null;

        ANTLRv3Parser.optionValue_return optionValue34 = null;


        CommonTree char_literal33_tree=null;
        RewriteRuleTokenStream stream_LABEL_ASSIGN=new RewriteRuleTokenStream(adaptor,"token LABEL_ASSIGN");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_optionValue=new RewriteRuleSubtreeStream(adaptor,"rule optionValue");
        try {
            // org/antlr/grammar/v3/ANTLRv3.g:142:5: ( id '=' optionValue -> ^( '=' id optionValue ) )
            // org/antlr/grammar/v3/ANTLRv3.g:142:9: id '=' optionValue
            {
            pushFollow(FOLLOW_id_in_option772);
            id32=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(id32.getTree());
            char_literal33=(Token)match(input,LABEL_ASSIGN,FOLLOW_LABEL_ASSIGN_in_option774); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LABEL_ASSIGN.add(char_literal33);

            pushFollow(FOLLOW_optionValue_in_option776);
            optionValue34=optionValue();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_optionValue.add(optionValue34.getTree());


            // AST REWRITE
            // elements: LABEL_ASSIGN, optionValue, id
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 142:28: -> ^( '=' id optionValue )
            {
                // org/antlr/grammar/v3/ANTLRv3.g:142:31: ^( '=' id optionValue )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_LABEL_ASSIGN.nextNode(), root_1);

                adaptor.addChild(root_1, stream_id.nextTree());
                adaptor.addChild(root_1, stream_optionValue.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "option"

    public static class optionValue_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "optionValue"
    // org/antlr/grammar/v3/ANTLRv3.g:145:1: optionValue : ( qid | STRING_LITERAL | CHAR_LITERAL | INT | s= '*' -> STRING_LITERAL[$s] );
    public final ANTLRv3Parser.optionValue_return optionValue() throws RecognitionException {
        ANTLRv3Parser.optionValue_return retval = new ANTLRv3Parser.optionValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token s=null;
        Token STRING_LITERAL36=null;
        Token CHAR_LITERAL37=null;
        Token INT38=null;
        ANTLRv3Parser.qid_return qid35 = null;


        CommonTree s_tree=null;
        CommonTree STRING_LITERAL36_tree=null;
        CommonTree CHAR_LITERAL37_tree=null;
        CommonTree INT38_tree=null;
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");

        try {
            // org/antlr/grammar/v3/ANTLRv3.g:146:5: ( qid | STRING_LITERAL | CHAR_LITERAL | INT | s= '*' -> STRING_LITERAL[$s] )
            int alt14=5;
            switch ( input.LA(1) ) {
            case TOKEN_REF:
            case RULE_REF:
                {
                alt14=1;
                }
                break;
            case STRING_LITERAL:
                {
                alt14=2;
                }
                break;
            case CHAR_LITERAL:
                {
                alt14=3;
                }
                break;
            case INT:
                {
                alt14=4;
                }
                break;
            case 74:
                {
                alt14=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // org/antlr/grammar/v3/ANTLRv3.g:146:9: qid
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_qid_in_optionValue805);
                    qid35=qid();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, qid35.getTree());

                    }
                    break;
                case 2 :
                    // org/antlr/grammar/v3/ANTLRv3.g:147:9: STRING_LITERAL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    STRING_LITERAL36=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_optionValue815); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING_LITERAL36_tree = (CommonTree)adaptor.create(STRING_LITERAL36);
                    adaptor.addChild(root_0, STRING_LITERAL36_tree);
                    }

                    }
                    break;
                case 3 :
                    // org/antlr/grammar/v3/ANTLRv3.g:148:9: CHAR_LITERAL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    CHAR_LITERAL37=(Token)match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_optionValue825); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CHAR_LITERAL37_tree = (CommonTree)adaptor.create(CHAR_LITERAL37);
                    adaptor.addChild(root_0, CHAR_LITERAL37_tree);
                    }

                    }
                    break;
                case 4 :
                    // org/antlr/grammar/v3/ANTLRv3.g:149:9: INT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    INT38=(Token)match(input,INT,FOLLOW_INT_in_optionValue835); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT38_tree = (CommonTree)adaptor.create(INT38);
                    adaptor.addChild(root_0, INT38_tree);
                    }

                    }
                    break;
                case 5 :
                    // org/antlr/grammar/v3/ANTLRv3.g:150:7: s= '*'
                    {
                    s=(Token)match(input,74,FOLLOW_74_in_optionValue845); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_74.add(s);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 150:13: -> STRING_LITERAL[$s]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(STRING_LITERAL, s));

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "optionValue"

    protected static class rule_scope {
        String name;
    }
    protected Stack rule_stack = new Stack();

    public static class rule_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rule"
    // org/antlr/grammar/v3/ANTLRv3.g:153:1: rule : ( DOC_COMMENT )? (modifier= ( 'protected' | 'public' | 'private' | 'fragment' ) )? id ( '!' )? (arg= ARG_ACTION )? ( 'returns' rt= ARG_ACTION )? ( throwsSpec )? ( optionsSpec )? ( ruleScopeSpec )? ( ruleAction )* ':' altList ';' ( exceptionGroup )? -> ^( RULE id ( ^( ARG[$arg] $arg) )? ( ^( 'returns' $rt) )? ( throwsSpec )? ( optionsSpec )? ( ruleScopeSpec )? ( ruleAction )* altList ( exceptionGroup )? EOR[\"EOR\"] ) ;
    public final ANTLRv3Parser.rule_return rule() throws RecognitionException {
        rule_stack.push(new rule_scope());
        ANTLRv3Parser.rule_return retval = new ANTLRv3Parser.rule_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token modifier=null;
        Token arg=null;
        Token rt=null;
        Token DOC_COMMENT39=null;
        Token string_literal40=null;
        Token string_literal41=null;
        Token string_literal42=null;
        Token string_literal43=null;
        Token char_literal45=null;
        Token string_literal46=null;
        Token char_literal51=null;
        Token char_literal53=null;
        ANTLRv3Parser.id_return id44 = null;

        ANTLRv3Parser.throwsSpec_return throwsSpec47 = null;

        ANTLRv3Parser.optionsSpec_return optionsSpec48 = null;

        ANTLRv3Parser.ruleScopeSpec_return ruleScopeSpec49 = null;

        ANTLRv3Parser.ruleAction_return ruleAction50 = null;

        ANTLRv3Parser.altList_return altList52 = null;

        ANTLRv3Parser.exceptionGroup_return exceptionGroup54 = null;


        CommonTree modifier_tree=null;
        CommonTree arg_tree=null;
        CommonTree rt_tree=null;
        CommonTree DOC_COMMENT39_tree=null;
        CommonTree string_literal40_tree=null;
        CommonTree string_literal41_tree=null;
        CommonTree string_literal42_tree=null;
        CommonTree string_literal43_tree=null;
        CommonTree char_literal45_tree=null;
        CommonTree string_literal46_tree=null;
        CommonTree char_literal51_tree=null;
        CommonTree char_literal53_tree=null;
        RewriteRuleTokenStream stream_DOC_COMMENT=new RewriteRuleTokenStream(adaptor,"token DOC_COMMENT");
        RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
        RewriteRuleTokenStream stream_RET=new RewriteRuleTokenStream(adaptor,"token RET");
        RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
        RewriteRuleTokenStream stream_BANG=new RewriteRuleTokenStream(adaptor,"token BANG");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleTokenStream stream_FRAGMENT=new RewriteRuleTokenStream(adaptor,"token FRAGMENT");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleTokenStream stream_ARG_ACTION=new RewriteRuleTokenStream(adaptor,"token ARG_ACTION");
        RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_exceptionGroup=new RewriteRuleSubtreeStream(adaptor,"rule exceptionGroup");
        RewriteRuleSubtreeStream stream_throwsSpec=new RewriteRuleSubtreeStream(adaptor,"rule throwsSpec");
        RewriteRuleSubtreeStream stream_ruleScopeSpec=new RewriteRuleSubtreeStream(adaptor,"rule ruleScopeSpec");
        RewriteRuleSubtreeStream stream_optionsSpec=new RewriteRuleSubtreeStream(adaptor,"rule optionsSpec");
        RewriteRuleSubtreeStream stream_altList=new RewriteRuleSubtreeStream(adaptor,"rule altList");
        RewriteRuleSubtreeStream stream_ruleAction=new RewriteRuleSubtreeStream(adaptor,"rule ruleAction");
        try {
            // org/antlr/grammar/v3/ANTLRv3.g:157:2: ( ( DOC_COMMENT )? (modifier= ( 'protected' | 'public' | 'private' | 'fragment' ) )? id ( '!' )? (arg= ARG_ACTION )? ( 'returns' rt= ARG_ACTION )? ( throwsSpec )? ( optionsSpec )? ( ruleScopeSpec )? ( ruleAction )* ':' altList ';' ( exceptionGroup )? -> ^( RULE id ( ^( ARG[$arg] $arg) )? ( ^( 'returns' $rt) )? ( throwsSpec )? ( optionsSpec )? ( ruleScopeSpec )? ( ruleAction )* altList ( exceptionGroup )? EOR[\"EOR\"] ) )
            // org/antlr/grammar/v3/ANTLRv3.g:157:4: ( DOC_COMMENT )? (modifier= ( 'protected' | 'public' | 'private' | 'fragment' ) )? id ( '!' )? (arg= ARG_ACTION )? ( 'returns' rt= ARG_ACTION )? ( throwsSpec )? ( optionsSpec )? ( ruleScopeSpec )? ( ruleAction )* ':' altList ';' ( exceptionGroup )?
            {
            // org/antlr/grammar/v3/ANTLRv3.g:157:4: ( DOC_COMMENT )?
            int alt15=2;
            switch ( input.LA(1) ) {
                case DOC_COMMENT:
                    {
                    alt15=1;
                    }
                    break;
            }

            switch (alt15) {
                case 1 :
                    // org/antlr/grammar/v3/ANTLRv3.g:157:4: DOC_COMMENT
                    {
                    DOC_COMMENT39=(Token)match(input,DOC_COMMENT,FOLLOW_DOC_COMMENT_in_rule870); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOC_COMMENT.add(DOC_COMMENT39);


                    }
                    break;

            }

            // org/antlr/grammar/v3/ANTLRv3.g:158:3: (modifier= ( 'protected' | 'public' | 'private' | 'fragment' ) )?
            int alt17=2;
            switch ( input.LA(1) ) {
                case FRAGMENT:
                case 75:
                case 76:
                case 77:
                    {
                    alt17=1;
                    }
                    break;
            }

            switch (alt17) {
                case 1 :
                    // org/antlr/grammar/v3/ANTLRv3.g:158:5: modifier= ( 'protected' | 'public' | 'private' | 'fragment' )
                    {
                    // org/antlr/grammar/v3/ANTLRv3.g:158:14: ( 'protected' | 'public' | 'private' | 'fragment' )
                    int alt16=4;
                    switch ( input.LA(1) ) {
                    case 75:
                        {
                        alt16=1;
                        }
                        break;
                    case 76:
                        {
                        alt16=2;
                        }
                        break;
                    case 77:
                        {
                        alt16=3;
                        }
                        break;
                    case FRAGMENT:
                        {
                        alt16=4;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 0, input);

                        throw nvae;
                    }

                    switch (alt16) {
                        case 1 :
                            // org/antlr/grammar/v3/ANTLRv3.g:158:15: 'protected'
                            {
                            string_literal40=(Token)match(input,75,FOLLOW_75_in_rule880); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_75.add(string_literal40);


                            }
                            break;
                        case 2 :
                            // org/antlr/grammar/v3/ANTLRv3.g:158:27: 'public'
                            {
                            string_literal41=(Token)match(input,76,FOLLOW_76_in_rule882); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_76.add(string_literal41);


                            }
                            break;
                        case 3 :
                            // org/antlr/grammar/v3/ANTLRv3.g:158:36: 'private'
                            {
                            string_literal42=(Token)match(input,77,FOLLOW_77_in_rule884); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_77.add(string_literal42);


                            }
                            break;
                        case 4 :
                            // org/antlr/grammar/v3/ANTLRv3.g:158:46: 'fragment'
                            {
                            string_literal43=(Token)match(input,FRAGMENT,FOLLOW_FRAGMENT_in_rule886); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_FRAGMENT.add(string_literal43);


                            }
                            break;

                    }


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_rule894);
            id44=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(id44.getTree());
            if ( state.backtracking==0 ) {
              ((rule_scope)rule_stack.peek()).name = (id44!=null?input.toString(id44.start,id44.stop):null);
            }
            // org/antlr/grammar/v3/ANTLRv3.g:160:3: ( '!' )?
            int alt18=2;
            switch ( input.LA(1) ) {
                case BANG:
                    {
                    alt18=1;
                    }
                    break;
            }

            switch (alt18) {
                case 1 :
                    // org/antlr/grammar/v3/ANTLRv3.g:160:3: '!'
                    {
                    char_literal45=(Token)match(input,BANG,FOLLOW_BANG_in_rule900); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BANG.add(char_literal45);


                    }
                    break;

            }

            // org/antlr/grammar/v3/ANTLRv3.g:161:3: (arg= ARG_ACTION )?
            int alt19=2;
            switch ( input.LA(1) ) {
                case ARG_ACTION:
                    {
                    alt19=1;
                    }
                    break;
            }

            switch (alt19) {
                case 1 :
                    // org/antlr/grammar/v3/ANTLRv3.g:161:5: arg= ARG_ACTION
                    {
                    arg=(Token)match(input,ARG_ACTION,FOLLOW_ARG_ACTION_in_rule909); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ARG_ACTION.add(arg);


                    }
                    break;

            }

            // org/antlr/grammar/v3/ANTLRv3.g:162:3: ( 'returns' rt= ARG_ACTION )?
            int alt20=2;
            switch ( input.LA(1) ) {
                case RET:
                    {
                    alt20=1;
                    }
                    break;
            }

            switch (alt20) {
                case 1 :
                    // org/antlr/grammar/v3/ANTLRv3.g:162:5: 'returns' rt= ARG_ACTION
                    {
                    string_literal46=(Token)match(input,RET,FOLLOW_RET_in_rule918); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RET.add(string_literal46);

                    rt=(Token)match(input,ARG_ACTION,FOLLOW_ARG_ACTION_in_rule922); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ARG_ACTION.add(rt);


                    }
                    break;

            }

            // org/antlr/grammar/v3/ANTLRv3.g:163:3: ( throwsSpec )?
            int alt21=2;
            switch ( input.LA(1) ) {
                case 79:
                    {
                    alt21=1;
                    }
                    break;
            }

            switch (alt21) {
                case 1 :
                    // org/antlr/grammar/v3/ANTLRv3.g:163:3: throwsSpec
                    {
                    pushFollow(FOLLOW_throwsSpec_in_rule930);
                    throwsSpec47=throwsSpec();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_throwsSpec.add(throwsSpec47.getTree());

                    }
                    break;

            }

            // org/antlr/grammar/v3/ANTLRv3.g:163:15: ( optionsSpec )?
            int alt22=2;
            switch ( input.LA(1) ) {
                case OPTIONS:
                    {
                    alt22=1;
                    }
                    break;
            }

            switch (alt22) {
                case 1 :
                    // org/antlr/grammar/v3/ANTLRv3.g:163:15: optionsSpec
                    {
                    pushFollow(FOLLOW_optionsSpec_in_rule933);
                    optionsSpec48=optionsSpec();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_optionsSpec.add(optionsSpec48.getTree());

                    }
                    break;

            }

            // org/antlr/grammar/v3/ANTLRv3.g:163:28: ( ruleScopeSpec )?
            int alt23=2;
            switch ( input.LA(1) ) {
                case SCOPE:
                    {
                    alt23=1;
                    }
                    break;
            }

            switch (alt23) {
                case 1 :
                    // org/antlr/grammar/v3/ANTLRv3.g:163:28: ruleScopeSpec
                    {
                    pushFollow(FOLLOW_ruleScopeSpec_in_rule936);
                    ruleScopeSpec49=ruleScopeSpec();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ruleScopeSpec.add(ruleScopeSpec49.getTree());

                    }
                    break;

            }

            // org/antlr/grammar/v3/ANTLRv3.g:163:43: ( ruleAction )*
            loop24:
            do {
                int alt24=2;
                switch ( input.LA(1) ) {
                case AT:
                    {
                    alt24=1;
                    }
                    break;

                }

                switch (alt24) {
            	case 1 :
            	    // org/antlr/grammar/v3/ANTLRv3.g:163:43: ruleAction
            	    {
            	    pushFollow(FOLLOW_ruleAction_in_rule939);
            	    ruleAction50=ruleAction();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_ruleAction.add(ruleAction50.getTree());

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            char_literal51=(Token)match(input,78,FOLLOW_78_in_rule944); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_78.add(char_literal51);

            pushFollow(FOLLOW_altList_in_rule946);
            altList52=altList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_altList.add(altList52.getTree());
            char_literal53=(Token)match(input,71,FOLLOW_71_in_rule948); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_71.add(char_literal53);

            // org/antlr/grammar/v3/ANTLRv3.g:165:3: ( exceptionGroup )?
            int alt25=2;
            switch ( input.LA(1) ) {
                case 84:
                case 85:
                    {
                    alt25=1;
                    }
                    break;
            }

            switch (alt25) {
                case 1 :
                    // org/antlr/grammar/v3/ANTLRv3.g:165:3: exceptionGroup
                    {
                    pushFollow(FOLLOW_exceptionGroup_in_rule952);
                    exceptionGroup54=exceptionGroup();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exceptionGroup.add(exceptionGroup54.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: optionsSpec, throwsSpec, id, exceptionGroup, ruleScopeSpec, rt, altList, RET, arg, ruleAction
            // token labels: arg, rt
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleTokenStream stream_arg=new RewriteRuleTokenStream(adaptor,"token arg",arg);
            RewriteRuleTokenStream stream_rt=new RewriteRuleTokenStream(adaptor,"token rt",rt);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 166:6: -> ^( RULE id ( ^( ARG[$arg] $arg) )? ( ^( 'returns' $rt) )? ( throwsSpec )? ( optionsSpec )? ( ruleScopeSpec )? ( ruleAction )* altList ( exceptionGroup )? EOR[\"EOR\"] )
            {
                // org/antlr/grammar/v3/ANTLRv3.g:166:9: ^( RULE id ( ^( ARG[$arg] $arg) )? ( ^( 'returns' $rt) )? ( throwsSpec )? ( optionsSpec )? ( ruleScopeSpec )? ( ruleAction )* altList ( exceptionGroup )? EOR[\"EOR\"] )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(RULE, "RULE"), root_1);

                adaptor.addChild(root_1, stream_id.nextTree());
                adaptor.addChild(root_1, modifier!=null?adaptor.create(modifier):null);
                // org/antlr/grammar/v3/ANTLRv3.g:166:67: ( ^( ARG[$arg] $arg) )?
                if ( stream_arg.hasNext() ) {
                    // org/antlr/grammar/v3/ANTLRv3.g:166:67: ^( ARG[$arg] $arg)
                    {
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARG, arg), root_2);

                    adaptor.addChild(root_2, stream_arg.nextNode());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_arg.reset();
                // org/antlr/grammar/v3/ANTLRv3.g:166:86: ( ^( 'returns' $rt) )?
                if ( stream_rt.hasNext()||stream_RET.hasNext() ) {
                    // org/antlr/grammar/v3/ANTLRv3.g:166:86: ^( 'returns' $rt)
                    {
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    root_2 = (CommonTree)adaptor.becomeRoot(stream_RET.nextNode(), root_2);

                    adaptor.addChild(root_2, stream_rt.nextNode());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_rt.reset();
                stream_RET.reset();
                // org/antlr/grammar/v3/ANTLRv3.g:167:9: ( throwsSpec )?
                if ( stream_throwsSpec.hasNext() ) {
                    adaptor.addChild(root_1, stream_throwsSpec.nextTree());

                }
                stream_throwsSpec.reset();
                // org/antlr/grammar/v3/ANTLRv3.g:167:21: ( optionsSpec )?
                if ( stream_optionsSpec.hasNext() ) {
                    adaptor.addChild(root_1, stream_optionsSpec.nextTree());

                }
                stream_optionsSpec.reset();
                // org/antlr/grammar/v3/ANTLRv3.g:167:34: ( ruleScopeSpec )?
                if ( stream_ruleScopeSpec.hasNext() ) {
                    adaptor.addChild(root_1, stream_ruleScopeSpec.nextTree());

                }
                stream_ruleScopeSpec.reset();
                // org/antlr/grammar/v3/ANTLRv3.g:167:49: ( ruleAction )*
                while ( stream_ruleAction.hasNext() ) {
                    adaptor.addChild(root_1, stream_ruleAction.nextTree());

                }
                stream_ruleAction.reset();
                adaptor.addChild(root_1, stream_altList.nextTree());
                // org/antlr/grammar/v3/ANTLRv3.g:169:9: ( exceptionGroup )?
                if ( stream_exceptionGroup.hasNext() ) {
                    adaptor.addChild(root_1, stream_exceptionGroup.nextTree());

                }
                stream_exceptionGroup.reset();
                adaptor.addChild(root_1, (CommonTree)adaptor.create(EOR, "EOR"));

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            rule_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "rule"

    public static class ruleAction_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ruleAction"
    // org/antlr/grammar/v3/ANTLRv3.g:174:1: ruleAction : '@' id ACTION -> ^( '@' id ACTION ) ;
    public final ANTLRv3Parser.ruleAction_return ruleAction() throws RecognitionException {
        ANTLRv3Parser.ruleAction_return retval = new ANTLRv3Parser.ruleAction_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal55=null;
        Token ACTION57=null;
        ANTLRv3Parser.id_return id56 = null;


        CommonTree char_literal55_tree=null;
        CommonTree ACTION57_tree=null;
        RewriteRuleTokenStream stream_AT=new RewriteRuleTokenStream(adaptor,"token AT");
        RewriteRuleTokenStream stream_ACTION=new RewriteRuleTokenStream(adaptor,"token ACTION");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        try {
            // org/antlr/grammar/v3/ANTLRv3.g:176:2: ( '@' id ACTION -> ^( '@' id ACTION ) )
            // org/antlr/grammar/v3/ANTLRv3.g:176:4: '@' id ACTION
            {
            char_literal55=(Token)match(input,AT,FOLLOW_AT_in_ruleAction1058); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_AT.add(char_literal55);

            pushFollow(FOLLOW_id_in_ruleAction1060);
            id56=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(id56.getTree());
            ACTION57=(Token)match(input,ACTION,FOLLOW_ACTION_in_ruleAction1062); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ACTION.add(ACTION57);



            // AST REWRITE
            // elements: AT, ACTION, id
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 176:18: -> ^( '@' id ACTION )
            {
                // org/antlr/grammar/v3/ANTLRv3.g:176:21: ^( '@' id ACTION )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_AT.nextNode(), root_1);

                adaptor.addChild(root_1, stream_id.nextTree());
                adaptor.addChild(root_1, stream_ACTION.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "ruleAction"

    public static class throwsSpec_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "throwsSpec"
    // org/antlr/grammar/v3/ANTLRv3.g:179:1: throwsSpec : 'throws' id ( ',' id )* -> ^( 'throws' ( id )+ ) ;
    public final ANTLRv3Parser.throwsSpec_return throwsSpec() throws RecognitionException {
        ANTLRv3Parser.throwsSpec_return retval = new ANTLRv3Parser.throwsSpec_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal58=null;
        Token char_literal60=null;
        ANTLRv3Parser.id_return id59 = null;

        ANTLRv3Parser.id_return id61 = null;


        CommonTree string_literal58_tree=null;
        CommonTree char_literal60_tree=null;
        RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
        RewriteRuleTokenStream stream_80=new RewriteRuleTokenStream(adaptor,"token 80");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        try {
            // org/antlr/grammar/v3/ANTLRv3.g:180:2: ( 'throws' id ( ',' id )* -> ^( 'throws' ( id )+ ) )
            // org/antlr/grammar/v3/ANTLRv3.g:180:4: 'throws' id ( ',' id )*
            {
            string_literal58=(Token)match(input,79,FOLLOW_79_in_throwsSpec1083); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_79.add(string_literal58);

            pushFollow(FOLLOW_id_in_throwsSpec1085);
            id59=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(id59.getTree());
            // org/antlr/grammar/v3/ANTLRv3.g:180:16: ( ',' id )*
            loop26:
            do {
                int alt26=2;
                switch ( input.LA(1) ) {
                case 80:
                    {
                    alt26=1;
                    }
                    break;

                }

                switch (alt26) {
            	case 1 :
            	    // org/antlr/grammar/v3/ANTLRv3.g:180:18: ',' id
            	    {
            	    char_literal60=(Token)match(input,80,FOLLOW_80_in_throwsSpec1089); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_80.add(char_literal60);

            	    pushFollow(FOLLOW_id_in_throwsSpec1091);
            	    id61=id();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_id.add(id61.getTree());

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);



            // AST REWRITE
            // elements: id, 79
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 180:28: -> ^( 'throws' ( id )+ )
            {
                // org/antlr/grammar/v3/ANTLRv3.g:180:31: ^( 'throws' ( id )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_79.nextNode(), root_1);

                if ( !(stream_id.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_id.hasNext() ) {
                    adaptor.addChild(root_1, stream_id.nextTree());

                }
                stream_id.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "throwsSpec"

    public static class ruleScopeSpec_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ruleScopeSpec"
    // org/antlr/grammar/v3/ANTLRv3.g:183:1: ruleScopeSpec : ( 'scope' ACTION -> ^( 'scope' ACTION ) | 'scope' id ( ',' id )* ';' -> ^( 'scope' ( id )+ ) | 'scope' ACTION 'scope' id ( ',' id )* ';' -> ^( 'scope' ACTION ( id )+ ) );
    public final ANTLRv3Parser.ruleScopeSpec_return ruleScopeSpec() throws RecognitionException {
        ANTLRv3Parser.ruleScopeSpec_return retval = new ANTLRv3Parser.ruleScopeSpec_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal62=null;
        Token ACTION63=null;
        Token string_literal64=null;
        Token char_literal66=null;
        Token char_literal68=null;
        Token string_literal69=null;
        Token ACTION70=null;
        Token string_literal71=null;
        Token char_literal73=null;
        Token char_literal75=null;
        ANTLRv3Parser.id_return id65 = null;

        ANTLRv3Parser.id_return id67 = null;

        ANTLRv3Parser.id_return id72 = null;

        ANTLRv3Parser.id_return id74 = null;


        CommonTree string_literal62_tree=null;
        CommonTree ACTION63_tree=null;
        CommonTree string_literal64_tree=null;
        CommonTree char_literal66_tree=null;
        CommonTree char_literal68_tree=null;
        CommonTree string_literal69_tree=null;
        CommonTree ACTION70_tree=null;
        CommonTree string_literal71_tree=null;
        CommonTree char_literal73_tree=null;
        CommonTree char_literal75_tree=null;
        RewriteRuleTokenStream stream_SCOPE=new RewriteRuleTokenStream(adaptor,"token SCOPE");
        RewriteRuleTokenStream stream_80=new RewriteRuleTokenStream(adaptor,"token 80");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleTokenStream stream_ACTION=new RewriteRuleTokenStream(adaptor,"token ACTION");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        try {
            // org/antlr/grammar/v3/ANTLRv3.g:184:2: ( 'scope' ACTION -> ^( 'scope' ACTION ) | 'scope' id ( ',' id )* ';' -> ^( 'scope' ( id )+ ) | 'scope' ACTION 'scope' id ( ',' id )* ';' -> ^( 'scope' ACTION ( id )+ ) )
            int alt29=3;
            switch ( input.LA(1) ) {
            case SCOPE:
                {
                switch ( input.LA(2) ) {
                case ACTION:
                    {
                    switch ( input.LA(3) ) {
                    case SCOPE:
                        {
                        alt29=3;
                        }
                        break;
                    case AT:
                    case 78:
                        {
                        alt29=1;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 29, 2, input);

                        throw nvae;
                    }

                    }
                    break;
                case TOKEN_REF:
                case RULE_REF:
                    {
                    alt29=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 1, input);

                    throw nvae;
                }

                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // org/antlr/grammar/v3/ANTLRv3.g:184:4: 'scope' ACTION
                    {
                    string_literal62=(Token)match(input,SCOPE,FOLLOW_SCOPE_in_ruleScopeSpec1114); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SCOPE.add(string_literal62);

                    ACTION63=(Token)match(input,ACTION,FOLLOW_ACTION_in_ruleScopeSpec1116); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ACTION.add(ACTION63);



                    // AST REWRITE
                    // elements: ACTION, SCOPE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 184:19: -> ^( 'scope' ACTION )
                    {
                        // org/antlr/grammar/v3/ANTLRv3.g:184:22: ^( 'scope' ACTION )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_SCOPE.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_ACTION.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // org/antlr/grammar/v3/ANTLRv3.g:185:4: 'scope' id ( ',' id )* ';'
                    {
                    string_literal64=(Token)match(input,SCOPE,FOLLOW_SCOPE_in_ruleScopeSpec1129); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SCOPE.add(string_literal64);

                    pushFollow(FOLLOW_id_in_ruleScopeSpec1131);
                    id65=id();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_id.add(id65.getTree());
                    // org/antlr/grammar/v3/ANTLRv3.g:185:15: ( ',' id )*
                    loop27:
                    do {
                        int alt27=2;
                        switch ( input.LA(1) ) {
                        case 80:
                            {
                            alt27=1;
                            }
                            break;

                        }

                        switch (alt27) {
                    	case 1 :
                    	    // org/antlr/grammar/v3/ANTLRv3.g:185:16: ',' id
                    	    {
                    	    char_literal66=(Token)match(input,80,FOLLOW_80_in_ruleScopeSpec1134); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_80.add(char_literal66);

                    	    pushFollow(FOLLOW_id_in_ruleScopeSpec1136);
                    	    id67=id();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_id.add(id67.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);

                    char_literal68=(Token)match(input,71,FOLLOW_71_in_ruleScopeSpec1140); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_71.add(char_literal68);



                    // AST REWRITE
                    // elements: id, SCOPE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 185:29: -> ^( 'scope' ( id )+ )
                    {
                        // org/antlr/grammar/v3/ANTLRv3.g:185:32: ^( 'scope' ( id )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_SCOPE.nextNode(), root_1);

                        if ( !(stream_id.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_id.hasNext() ) {
                            adaptor.addChild(root_1, stream_id.nextTree());

                        }
                        stream_id.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // org/antlr/grammar/v3/ANTLRv3.g:186:4: 'scope' ACTION 'scope' id ( ',' id )* ';'
                    {
                    string_literal69=(Token)match(input,SCOPE,FOLLOW_SCOPE_in_ruleScopeSpec1154); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SCOPE.add(string_literal69);

                    ACTION70=(Token)match(input,ACTION,FOLLOW_ACTION_in_ruleScopeSpec1156); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ACTION.add(ACTION70);

                    string_literal71=(Token)match(input,SCOPE,FOLLOW_SCOPE_in_ruleScopeSpec1160); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SCOPE.add(string_literal71);

                    pushFollow(FOLLOW_id_in_ruleScopeSpec1162);
                    id72=id();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_id.add(id72.getTree());
                    // org/antlr/grammar/v3/ANTLRv3.g:187:14: ( ',' id )*
                    loop28:
                    do {
                        int alt28=2;
                        switch ( input.LA(1) ) {
                        case 80:
                            {
                            alt28=1;
                            }
                            break;

                        }

                        switch (alt28) {
                    	case 1 :
                    	    // org/antlr/grammar/v3/ANTLRv3.g:187:15: ',' id
                    	    {
                    	    char_literal73=(Token)match(input,80,FOLLOW_80_in_ruleScopeSpec1165); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_80.add(char_literal73);

                    	    pushFollow(FOLLOW_id_in_ruleScopeSpec1167);
                    	    id74=id();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_id.add(id74.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);

                    char_literal75=(Token)match(input,71,FOLLOW_71_in_ruleScopeSpec1171); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_71.add(char_literal75);



                    // AST REWRITE
                    // elements: SCOPE, id, ACTION
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 188:3: -> ^( 'scope' ACTION ( id )+ )
                    {
                        // org/antlr/grammar/v3/ANTLRv3.g:188:6: ^( 'scope' ACTION ( id )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_SCOPE.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_ACTION.nextNode());
                        if ( !(stream_id.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_id.hasNext() ) {
                            adaptor.addChild(root_1, stream_id.nextTree());

                        }
                        stream_id.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "ruleScopeSpec"

    public static class block_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "block"
    // org/antlr/grammar/v3/ANTLRv3.g:191:1: block : lp= '(' ( (opts= optionsSpec )? ':' )? altpair ( '|' altpair )* rp= ')' -> ^( BLOCK[$lp,\"BLOCK\"] ( optionsSpec )? ( altpair )+ EOB[$rp,\"EOB\"] ) ;
    public final ANTLRv3Parser.block_return block() throws RecognitionException {
        ANTLRv3Parser.block_return retval = new ANTLRv3Parser.block_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token lp=null;
        Token rp=null;
        Token char_literal76=null;
        Token char_literal78=null;
        ANTLRv3Parser.optionsSpec_return opts = null;

        ANTLRv3Parser.altpair_return altpair77 = null;

        ANTLRv3Parser.altpair_return altpair79 = null;


        CommonTree lp_tree=null;
        CommonTree rp_tree=null;
        CommonTree char_literal76_tree=null;
        CommonTree char_literal78_tree=null;
        RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
        RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
        RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
        RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
        RewriteRuleSubtreeStream stream_altpair=new RewriteRuleSubtreeStream(adaptor,"rule altpair");
        RewriteRuleSubtreeStream stream_optionsSpec=new RewriteRuleSubtreeStream(adaptor,"rule optionsSpec");
        try {
            // org/antlr/grammar/v3/ANTLRv3.g:192:5: (lp= '(' ( (opts= optionsSpec )? ':' )? altpair ( '|' altpair )* rp= ')' -> ^( BLOCK[$lp,\"BLOCK\"] ( optionsSpec )? ( altpair )+ EOB[$rp,\"EOB\"] ) )
            // org/antlr/grammar/v3/ANTLRv3.g:192:9: lp= '(' ( (opts= optionsSpec )? ':' )? altpair ( '|' altpair )* rp= ')'
            {
            lp=(Token)match(input,81,FOLLOW_81_in_block1203); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_81.add(lp);

            // org/antlr/grammar/v3/ANTLRv3.g:193:3: ( (opts= optionsSpec )? ':' )?
            int alt31=2;
            switch ( input.LA(1) ) {
                case OPTIONS:
                case 78:
                    {
                    alt31=1;
                    }
                    break;
            }

            switch (alt31) {
                case 1 :
                    // org/antlr/grammar/v3/ANTLRv3.g:193:5: (opts= optionsSpec )? ':'
                    {
                    // org/antlr/grammar/v3/ANTLRv3.g:193:5: (opts= optionsSpec )?
                    int alt30=2;
                    switch ( input.LA(1) ) {
                        case OPTIONS:
                            {
                            alt30=1;
                            }
                            break;
                    }

                    switch (alt30) {
                        case 1 :
                            // org/antlr/grammar/v3/ANTLRv3.g:193:6: opts= optionsSpec
                            {
                            pushFollow(FOLLOW_optionsSpec_in_block1212);
                            opts=optionsSpec();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_optionsSpec.add(opts.getTree());

                            }
                            break;

                    }

                    char_literal76=(Token)match(input,78,FOLLOW_78_in_block1216); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_78.add(char_literal76);


                    }
                    break;

            }

            pushFollow(FOLLOW_altpair_in_block1223);
            altpair77=altpair();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_altpair.add(altpair77.getTree());
            // org/antlr/grammar/v3/ANTLRv3.g:194:11: ( '|' altpair )*
            loop32:
            do {
                int alt32=2;
                switch ( input.LA(1) ) {
                case 82:
                    {
                    alt32=1;
                    }
                    break;

                }

                switch (alt32) {
            	case 1 :
            	    // org/antlr/grammar/v3/ANTLRv3.g:194:13: '|' altpair
            	    {
            	    char_literal78=(Token)match(input,82,FOLLOW_82_in_block1227); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_82.add(char_literal78);

            	    pushFollow(FOLLOW_altpair_in_block1229);
            	    altpair79=altpair();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_altpair.add(altpair79.getTree());

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            rp=(Token)match(input,83,FOLLOW_83_in_block1244); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_83.add(rp);



            // AST REWRITE
            // elements: optionsSpec, altpair
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 196:9: -> ^( BLOCK[$lp,\"BLOCK\"] ( optionsSpec )? ( altpair )+ EOB[$rp,\"EOB\"] )
            {
                // org/antlr/grammar/v3/ANTLRv3.g:196:12: ^( BLOCK[$lp,\"BLOCK\"] ( optionsSpec )? ( altpair )+ EOB[$rp,\"EOB\"] )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, lp, "BLOCK"), root_1);

                // org/antlr/grammar/v3/ANTLRv3.g:196:34: ( optionsSpec )?
                if ( stream_optionsSpec.hasNext() ) {
                    adaptor.addChild(root_1, stream_optionsSpec.nextTree());

                }
                stream_optionsSpec.reset();
                if ( !(stream_altpair.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_altpair.hasNext() ) {
                    adaptor.addChild(root_1, stream_altpair.nextTree());

                }
                stream_altpair.reset();
                adaptor.addChild(root_1, (CommonTree)adaptor.create(EOB, rp, "EOB"));

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "block"

    public static class altpair_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "altpair"
    // org/antlr/grammar/v3/ANTLRv3.g:199:1: altpair : alternative rewrite ;
    public final ANTLRv3Parser.altpair_return altpair() throws RecognitionException {
        ANTLRv3Parser.altpair_return retval = new ANTLRv3Parser.altpair_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        ANTLRv3Parser.alternative_return alternative80 = null;

        ANTLRv3Parser.rewrite_return rewrite81 = null;



        try {
            // org/antlr/grammar/v3/ANTLRv3.g:199:9: ( alternative rewrite )
            // org/antlr/grammar/v3/ANTLRv3.g:199:11: alternative rewrite
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_alternative_in_altpair1283);
            alternative80=alternative();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, alternative80.getTree());
            pushFollow(FOLLOW_rewrite_in_altpair1285);
            rewrite81=rewrite();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, rewrite81.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "altpair"

    public static class altList_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "altList"
    // org/antlr/grammar/v3/ANTLRv3.g:201:1: altList : altpair ( '|' altpair )* -> ^( ( altpair )+ EOB[\"EOB\"] ) ;
    public final ANTLRv3Parser.altList_return altList() throws RecognitionException {
        ANTLRv3Parser.altList_return retval = new ANTLRv3Parser.altList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal83=null;
        ANTLRv3Parser.altpair_return altpair82 = null;

        ANTLRv3Parser.altpair_return altpair84 = null;


        CommonTree char_literal83_tree=null;
        RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
        RewriteRuleSubtreeStream stream_altpair=new RewriteRuleSubtreeStream(adaptor,"rule altpair");

        	// must create root manually as it's used by invoked rules in real antlr tool.
        	// leave here to demonstrate use of {...} in rewrite rule
        	// it's really BLOCK[firstToken,"BLOCK"]; set line/col to previous ( or : token.
            CommonTree blkRoot = (CommonTree)adaptor.create(BLOCK,input.LT(-1),"BLOCK");

        try {
            // org/antlr/grammar/v3/ANTLRv3.g:208:5: ( altpair ( '|' altpair )* -> ^( ( altpair )+ EOB[\"EOB\"] ) )
            // org/antlr/grammar/v3/ANTLRv3.g:208:9: altpair ( '|' altpair )*
            {
            pushFollow(FOLLOW_altpair_in_altList1305);
            altpair82=altpair();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_altpair.add(altpair82.getTree());
            // org/antlr/grammar/v3/ANTLRv3.g:208:17: ( '|' altpair )*
            loop33:
            do {
                int alt33=2;
                switch ( input.LA(1) ) {
                case 82:
                    {
                    alt33=1;
                    }
                    break;

                }

                switch (alt33) {
            	case 1 :
            	    // org/antlr/grammar/v3/ANTLRv3.g:208:19: '|' altpair
            	    {
            	    char_literal83=(Token)match(input,82,FOLLOW_82_in_altList1309); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_82.add(char_literal83);

            	    pushFollow(FOLLOW_altpair_in_altList1311);
            	    altpair84=altpair();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_altpair.add(altpair84.getTree());

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);



            // AST REWRITE
            // elements: altpair
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 208:34: -> ^( ( altpair )+ EOB[\"EOB\"] )
            {
                // org/antlr/grammar/v3/ANTLRv3.g:208:37: ^( ( altpair )+ EOB[\"EOB\"] )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(blkRoot, root_1);

                if ( !(stream_altpair.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_altpair.hasNext() ) {
                    adaptor.addChild(root_1, stream_altpair.nextTree());

                }
                stream_altpair.reset();
                adaptor.addChild(root_1, (CommonTree)adaptor.create(EOB, "EOB"));

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "altList"

    public static class alternative_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "alternative"
    // org/antlr/grammar/v3/ANTLRv3.g:211:1: alternative : ( ( element )+ -> ^( ALT[firstToken,\"ALT\"] ( element )+ EOA[\"EOA\"] ) | -> ^( ALT[prevToken,\"ALT\"] EPSILON[prevToken,\"EPSILON\"] EOA[\"EOA\"] ) );
    public final ANTLRv3Parser.alternative_return alternative() throws RecognitionException {
        ANTLRv3Parser.alternative_return retval = new ANTLRv3Parser.alternative_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        ANTLRv3Parser.element_return element85 = null;


        RewriteRuleSubtreeStream stream_element=new RewriteRuleSubtreeStream(adaptor,"rule element");

        	Token firstToken = input.LT(1);
        	Token prevToken = input.LT(-1); // either : or | I think

        try {
            // org/antlr/grammar/v3/ANTLRv3.g:216:5: ( ( element )+ -> ^( ALT[firstToken,\"ALT\"] ( element )+ EOA[\"EOA\"] ) | -> ^( ALT[prevToken,\"ALT\"] EPSILON[prevToken,\"EPSILON\"] EOA[\"EOA\"] ) )
            int alt35=2;
            switch ( input.LA(1) ) {
            case SEMPRED:
            case TREE_BEGIN:
            case TOKEN_REF:
            case STRING_LITERAL:
            case CHAR_LITERAL:
            case ACTION:
            case RULE_REF:
            case 81:
            case 87:
            case 90:
                {
                alt35=1;
                }
                break;
            case REWRITE:
            case 71:
            case 82:
            case 83:
                {
                alt35=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // org/antlr/grammar/v3/ANTLRv3.g:216:9: ( element )+
                    {
                    // org/antlr/grammar/v3/ANTLRv3.g:216:9: ( element )+
                    int cnt34=0;
                    loop34:
                    do {
                        int alt34=2;
                        switch ( input.LA(1) ) {
                        case SEMPRED:
                        case TREE_BEGIN:
                        case TOKEN_REF:
                        case STRING_LITERAL:
                        case CHAR_LITERAL:
                        case ACTION:
                        case RULE_REF:
                        case 81:
                        case 87:
                        case 90:
                            {
                            alt34=1;
                            }
                            break;

                        }

                        switch (alt34) {
                    	case 1 :
                    	    // org/antlr/grammar/v3/ANTLRv3.g:216:9: element
                    	    {
                    	    pushFollow(FOLLOW_element_in_alternative1352);
                    	    element85=element();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_element.add(element85.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt34 >= 1 ) break loop34;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(34, input);
                                throw eee;
                        }
                        cnt34++;
                    } while (true);



                    // AST REWRITE
                    // elements: element
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 216:18: -> ^( ALT[firstToken,\"ALT\"] ( element )+ EOA[\"EOA\"] )
                    {
                        // org/antlr/grammar/v3/ANTLRv3.g:216:21: ^( ALT[firstToken,\"ALT\"] ( element )+ EOA[\"EOA\"] )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ALT, firstToken, "ALT"), root_1);

                        if ( !(stream_element.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_element.hasNext() ) {
                            adaptor.addChild(root_1, stream_element.nextTree());

                        }
                        stream_element.reset();
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(EOA, "EOA"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // org/antlr/grammar/v3/ANTLRv3.g:217:9: 
                    {

                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 217:9: -> ^( ALT[prevToken,\"ALT\"] EPSILON[prevToken,\"EPSILON\"] EOA[\"EOA\"] )
                    {
                        // org/antlr/grammar/v3/ANTLRv3.g:217:12: ^( ALT[prevToken,\"ALT\"] EPSILON[prevToken,\"EPSILON\"] EOA[\"EOA\"] )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ALT, prevToken, "ALT"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(EPSILON, prevToken, "EPSILON"));
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(EOA, "EOA"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "alternative"

    public static class exceptionGroup_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exceptionGroup"
    // org/antlr/grammar/v3/ANTLRv3.g:220:1: exceptionGroup : ( ( exceptionHandler )+ ( finallyClause )? | finallyClause );
    public final ANTLRv3Parser.exceptionGroup_return exceptionGroup() throws RecognitionException {
        ANTLRv3Parser.exceptionGroup_return retval = new ANTLRv3Parser.exceptionGroup_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        ANTLRv3Parser.exceptionHandler_return exceptionHandler86 = null;

        ANTLRv3Parser.finallyClause_return finallyClause87 = null;

        ANTLRv3Parser.finallyClause_return finallyClause88 = null;



        try {
            // org/antlr/grammar/v3/ANTLRv3.g:221:2: ( ( exceptionHandler )+ ( finallyClause )? | finallyClause )
            int alt38=2;
            switch ( input.LA(1) ) {
            case 84:
                {
                alt38=1;
                }
                break;
            case 85:
                {
                alt38=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // org/antlr/grammar/v3/ANTLRv3.g:221:4: ( exceptionHandler )+ ( finallyClause )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // org/antlr/grammar/v3/ANTLRv3.g:221:4: ( exceptionHandler )+
                    int cnt36=0;
                    loop36:
                    do {
                        int alt36=2;
                        switch ( input.LA(1) ) {
                        case 84:
                            {
                            alt36=1;
                            }
                            break;

                        }

                        switch (alt36) {
                    	case 1 :
                    	    // org/antlr/grammar/v3/ANTLRv3.g:221:6: exceptionHandler
                    	    {
                    	    pushFollow(FOLLOW_exceptionHandler_in_exceptionGroup1403);
                    	    exceptionHandler86=exceptionHandler();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, exceptionHandler86.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt36 >= 1 ) break loop36;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(36, input);
                                throw eee;
                        }
                        cnt36++;
                    } while (true);

                    // org/antlr/grammar/v3/ANTLRv3.g:221:26: ( finallyClause )?
                    int alt37=2;
                    switch ( input.LA(1) ) {
                        case 85:
                            {
                            alt37=1;
                            }
                            break;
                    }

                    switch (alt37) {
                        case 1 :
                            // org/antlr/grammar/v3/ANTLRv3.g:221:28: finallyClause
                            {
                            pushFollow(FOLLOW_finallyClause_in_exceptionGroup1410);
                            finallyClause87=finallyClause();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, finallyClause87.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // org/antlr/grammar/v3/ANTLRv3.g:222:4: finallyClause
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_finallyClause_in_exceptionGroup1418);
                    finallyClause88=finallyClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, finallyClause88.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "exceptionGroup"

    public static class exceptionHandler_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exceptionHandler"
    // org/antlr/grammar/v3/ANTLRv3.g:225:1: exceptionHandler : 'catch' ARG_ACTION ACTION -> ^( 'catch' ARG_ACTION ACTION ) ;
    public final ANTLRv3Parser.exceptionHandler_return exceptionHandler() throws RecognitionException {
        ANTLRv3Parser.exceptionHandler_return retval = new ANTLRv3Parser.exceptionHandler_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal89=null;
        Token ARG_ACTION90=null;
        Token ACTION91=null;

        CommonTree string_literal89_tree=null;
        CommonTree ARG_ACTION90_tree=null;
        CommonTree ACTION91_tree=null;
        RewriteRuleTokenStream stream_ACTION=new RewriteRuleTokenStream(adaptor,"token ACTION");
        RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");
        RewriteRuleTokenStream stream_ARG_ACTION=new RewriteRuleTokenStream(adaptor,"token ARG_ACTION");

        try {
            // org/antlr/grammar/v3/ANTLRv3.g:226:5: ( 'catch' ARG_ACTION ACTION -> ^( 'catch' ARG_ACTION ACTION ) )
            // org/antlr/grammar/v3/ANTLRv3.g:226:10: 'catch' ARG_ACTION ACTION
            {
            string_literal89=(Token)match(input,84,FOLLOW_84_in_exceptionHandler1438); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_84.add(string_literal89);

            ARG_ACTION90=(Token)match(input,ARG_ACTION,FOLLOW_ARG_ACTION_in_exceptionHandler1440); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ARG_ACTION.add(ARG_ACTION90);

            ACTION91=(Token)match(input,ACTION,FOLLOW_ACTION_in_exceptionHandler1442); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ACTION.add(ACTION91);



            // AST REWRITE
            // elements: ARG_ACTION, ACTION, 84
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 226:36: -> ^( 'catch' ARG_ACTION ACTION )
            {
                // org/antlr/grammar/v3/ANTLRv3.g:226:39: ^( 'catch' ARG_ACTION ACTION )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_84.nextNode(), root_1);

                adaptor.addChild(root_1, stream_ARG_ACTION.nextNode());
                adaptor.addChild(root_1, stream_ACTION.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "exceptionHandler"

    public static class finallyClause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "finallyClause"
    // org/antlr/grammar/v3/ANTLRv3.g:229:1: finallyClause : 'finally' ACTION -> ^( 'finally' ACTION ) ;
    public final ANTLRv3Parser.finallyClause_return finallyClause() throws RecognitionException {
        ANTLRv3Parser.finallyClause_return retval = new ANTLRv3Parser.finallyClause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal92=null;
        Token ACTION93=null;

        CommonTree string_literal92_tree=null;
        CommonTree ACTION93_tree=null;
        RewriteRuleTokenStream stream_ACTION=new RewriteRuleTokenStream(adaptor,"token ACTION");
        RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");

        try {
            // org/antlr/grammar/v3/ANTLRv3.g:230:5: ( 'finally' ACTION -> ^( 'finally' ACTION ) )
            // org/antlr/grammar/v3/ANTLRv3.g:230:10: 'finally' ACTION
            {
            string_literal92=(Token)match(input,85,FOLLOW_85_in_finallyClause1472); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_85.add(string_literal92);

            ACTION93=(Token)match(input,ACTION,FOLLOW_ACTION_in_finallyClause1474); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ACTION.add(ACTION93);



            // AST REWRITE
            // elements: 85, ACTION
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 230:27: -> ^( 'finally' ACTION )
            {
                // org/antlr/grammar/v3/ANTLRv3.g:230:30: ^( 'finally' ACTION )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_85.nextNode(), root_1);

                adaptor.addChild(root_1, stream_ACTION.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "finallyClause"

    public static class element_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "element"
    // org/antlr/grammar/v3/ANTLRv3.g:233:1: element : ( id (labelOp= '=' | labelOp= '+=' ) atom ( ebnfSuffix -> ^( ebnfSuffix ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] ^( $labelOp id atom ) EOA[\"EOA\"] ) EOB[\"EOB\"] ) ) | -> ^( $labelOp id atom ) ) | id (labelOp= '=' | labelOp= '+=' ) block ( ebnfSuffix -> ^( ebnfSuffix ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] ^( $labelOp id block ) EOA[\"EOA\"] ) EOB[\"EOB\"] ) ) | -> ^( $labelOp id block ) ) | atom ( ebnfSuffix -> ^( ebnfSuffix ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] atom EOA[\"EOA\"] ) EOB[\"EOB\"] ) ) | -> atom ) | ebnf | ACTION | SEMPRED (g= '=>' -> GATED_SEMPRED[$g] | -> SEMPRED ) | treeSpec ( ebnfSuffix -> ^( ebnfSuffix ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] treeSpec EOA[\"EOA\"] ) EOB[\"EOB\"] ) ) | -> treeSpec ) );
    public final ANTLRv3Parser.element_return element() throws RecognitionException {
        ANTLRv3Parser.element_return retval = new ANTLRv3Parser.element_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token labelOp=null;
        Token g=null;
        Token ACTION103=null;
        Token SEMPRED104=null;
        ANTLRv3Parser.id_return id94 = null;

        ANTLRv3Parser.atom_return atom95 = null;

        ANTLRv3Parser.ebnfSuffix_return ebnfSuffix96 = null;

        ANTLRv3Parser.id_return id97 = null;

        ANTLRv3Parser.block_return block98 = null;

        ANTLRv3Parser.ebnfSuffix_return ebnfSuffix99 = null;

        ANTLRv3Parser.atom_return atom100 = null;

        ANTLRv3Parser.ebnfSuffix_return ebnfSuffix101 = null;

        ANTLRv3Parser.ebnf_return ebnf102 = null;

        ANTLRv3Parser.treeSpec_return treeSpec105 = null;

        ANTLRv3Parser.ebnfSuffix_return ebnfSuffix106 = null;


        CommonTree labelOp_tree=null;
        CommonTree g_tree=null;
        CommonTree ACTION103_tree=null;
        CommonTree SEMPRED104_tree=null;
        RewriteRuleTokenStream stream_LIST_LABEL_ASSIGN=new RewriteRuleTokenStream(adaptor,"token LIST_LABEL_ASSIGN");
        RewriteRuleTokenStream stream_LABEL_ASSIGN=new RewriteRuleTokenStream(adaptor,"token LABEL_ASSIGN");
        RewriteRuleTokenStream stream_SEMPRED=new RewriteRuleTokenStream(adaptor,"token SEMPRED");
        RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");
        RewriteRuleSubtreeStream stream_ebnfSuffix=new RewriteRuleSubtreeStream(adaptor,"rule ebnfSuffix");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_treeSpec=new RewriteRuleSubtreeStream(adaptor,"rule treeSpec");
        try {
            // org/antlr/grammar/v3/ANTLRv3.g:234:2: ( id (labelOp= '=' | labelOp= '+=' ) atom ( ebnfSuffix -> ^( ebnfSuffix ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] ^( $labelOp id atom ) EOA[\"EOA\"] ) EOB[\"EOB\"] ) ) | -> ^( $labelOp id atom ) ) | id (labelOp= '=' | labelOp= '+=' ) block ( ebnfSuffix -> ^( ebnfSuffix ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] ^( $labelOp id block ) EOA[\"EOA\"] ) EOB[\"EOB\"] ) ) | -> ^( $labelOp id block ) ) | atom ( ebnfSuffix -> ^( ebnfSuffix ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] atom EOA[\"EOA\"] ) EOB[\"EOB\"] ) ) | -> atom ) | ebnf | ACTION | SEMPRED (g= '=>' -> GATED_SEMPRED[$g] | -> SEMPRED ) | treeSpec ( ebnfSuffix -> ^( ebnfSuffix ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] treeSpec EOA[\"EOA\"] ) EOB[\"EOB\"] ) ) | -> treeSpec ) )
            int alt46=7;
            alt46 = dfa46.predict(input);
            switch (alt46) {
                case 1 :
                    // org/antlr/grammar/v3/ANTLRv3.g:234:4: id (labelOp= '=' | labelOp= '+=' ) atom ( ebnfSuffix -> ^( ebnfSuffix ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] ^( $labelOp id atom ) EOA[\"EOA\"] ) EOB[\"EOB\"] ) ) | -> ^( $labelOp id atom ) )
                    {
                    pushFollow(FOLLOW_id_in_element1496);
                    id94=id();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_id.add(id94.getTree());
                    // org/antlr/grammar/v3/ANTLRv3.g:234:7: (labelOp= '=' | labelOp= '+=' )
                    int alt39=2;
                    switch ( input.LA(1) ) {
                    case LABEL_ASSIGN:
                        {
                        alt39=1;
                        }
                        break;
                    case LIST_LABEL_ASSIGN:
                        {
                        alt39=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 39, 0, input);

                        throw nvae;
                    }

                    switch (alt39) {
                        case 1 :
                            // org/antlr/grammar/v3/ANTLRv3.g:234:8: labelOp= '='
                            {
                            labelOp=(Token)match(input,LABEL_ASSIGN,FOLLOW_LABEL_ASSIGN_in_element1501); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_LABEL_ASSIGN.add(labelOp);


                            }
                            break;
                        case 2 :
                            // org/antlr/grammar/v3/ANTLRv3.g:234:20: labelOp= '+='
                            {
                            labelOp=(Token)match(input,LIST_LABEL_ASSIGN,FOLLOW_LIST_LABEL_ASSIGN_in_element1505); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_LIST_LABEL_ASSIGN.add(labelOp);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_atom_in_element1508);
                    atom95=atom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_atom.add(atom95.getTree());
                    // org/antlr/grammar/v3/ANTLRv3.g:235:3: ( ebnfSuffix -> ^( ebnfSuffix ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] ^( $labelOp id atom ) EOA[\"EOA\"] ) EOB[\"EOB\"] ) ) | -> ^( $labelOp id atom ) )
                    int alt40=2;
                    switch ( input.LA(1) ) {
                    case 74:
                    case 91:
                    case 92:
                        {
                        alt40=1;
                        }
                        break;
                    case SEMPRED:
                    case TREE_BEGIN:
                    case REWRITE:
                    case TOKEN_REF:
                    case STRING_LITERAL:
                    case CHAR_LITERAL:
                    case ACTION:
                    case RULE_REF:
                    case 71:
                    case 81:
                    case 82:
                    case 83:
                    case 87:
                    case 90:
                        {
                        alt40=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 40, 0, input);

                        throw nvae;
                    }

                    switch (alt40) {
                        case 1 :
                            // org/antlr/grammar/v3/ANTLRv3.g:235:5: ebnfSuffix
                            {
                            pushFollow(FOLLOW_ebnfSuffix_in_element1514);
                            ebnfSuffix96=ebnfSuffix();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_ebnfSuffix.add(ebnfSuffix96.getTree());


                            // AST REWRITE
                            // elements: id, labelOp, atom, ebnfSuffix
                            // token labels: labelOp
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleTokenStream stream_labelOp=new RewriteRuleTokenStream(adaptor,"token labelOp",labelOp);
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 235:16: -> ^( ebnfSuffix ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] ^( $labelOp id atom ) EOA[\"EOA\"] ) EOB[\"EOB\"] ) )
                            {
                                // org/antlr/grammar/v3/ANTLRv3.g:235:19: ^( ebnfSuffix ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] ^( $labelOp id atom ) EOA[\"EOA\"] ) EOB[\"EOB\"] ) )
                                {
                                CommonTree root_1 = (CommonTree)adaptor.nil();
                                root_1 = (CommonTree)adaptor.becomeRoot(stream_ebnfSuffix.nextNode(), root_1);

                                // org/antlr/grammar/v3/ANTLRv3.g:235:33: ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] ^( $labelOp id atom ) EOA[\"EOA\"] ) EOB[\"EOB\"] )
                                {
                                CommonTree root_2 = (CommonTree)adaptor.nil();
                                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_2);

                                // org/antlr/grammar/v3/ANTLRv3.g:235:50: ^( ALT[\"ALT\"] ^( $labelOp id atom ) EOA[\"EOA\"] )
                                {
                                CommonTree root_3 = (CommonTree)adaptor.nil();
                                root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ALT, "ALT"), root_3);

                                // org/antlr/grammar/v3/ANTLRv3.g:235:63: ^( $labelOp id atom )
                                {
                                CommonTree root_4 = (CommonTree)adaptor.nil();
                                root_4 = (CommonTree)adaptor.becomeRoot(stream_labelOp.nextNode(), root_4);

                                adaptor.addChild(root_4, stream_id.nextTree());
                                adaptor.addChild(root_4, stream_atom.nextTree());

                                adaptor.addChild(root_3, root_4);
                                }
                                adaptor.addChild(root_3, (CommonTree)adaptor.create(EOA, "EOA"));

                                adaptor.addChild(root_2, root_3);
                                }
                                adaptor.addChild(root_2, (CommonTree)adaptor.create(EOB, "EOB"));

                                adaptor.addChild(root_1, root_2);
                                }

                                adaptor.addChild(root_0, root_1);
                                }

                            }

                            retval.tree = root_0;}
                            }
                            break;
                        case 2 :
                            // org/antlr/grammar/v3/ANTLRv3.g:236:8: 
                            {

                            // AST REWRITE
                            // elements: id, labelOp, atom
                            // token labels: labelOp
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleTokenStream stream_labelOp=new RewriteRuleTokenStream(adaptor,"token labelOp",labelOp);
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 236:8: -> ^( $labelOp id atom )
                            {
                                // org/antlr/grammar/v3/ANTLRv3.g:236:11: ^( $labelOp id atom )
                                {
                                CommonTree root_1 = (CommonTree)adaptor.nil();
                                root_1 = (CommonTree)adaptor.becomeRoot(stream_labelOp.nextNode(), root_1);

                                adaptor.addChild(root_1, stream_id.nextTree());
                                adaptor.addChild(root_1, stream_atom.nextTree());

                                adaptor.addChild(root_0, root_1);
                                }

                            }

                            retval.tree = root_0;}
                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // org/antlr/grammar/v3/ANTLRv3.g:238:4: id (labelOp= '=' | labelOp= '+=' ) block ( ebnfSuffix -> ^( ebnfSuffix ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] ^( $labelOp id block ) EOA[\"EOA\"] ) EOB[\"EOB\"] ) ) | -> ^( $labelOp id block ) )
                    {
                    pushFollow(FOLLOW_id_in_element1573);
                    id97=id();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_id.add(id97.getTree());
                    // org/antlr/grammar/v3/ANTLRv3.g:238:7: (labelOp= '=' | labelOp= '+=' )
                    int alt41=2;
                    switch ( input.LA(1) ) {
                    case LABEL_ASSIGN:
                        {
                        alt41=1;
                        }
                        break;
                    case LIST_LABEL_ASSIGN:
                        {
                        alt41=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 41, 0, input);

                        throw nvae;
                    }

                    switch (alt41) {
                        case 1 :
                            // org/antlr/grammar/v3/ANTLRv3.g:238:8: labelOp= '='
                            {
                            labelOp=(Token)match(input,LABEL_ASSIGN,FOLLOW_LABEL_ASSIGN_in_element1578); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_LABEL_ASSIGN.add(labelOp);


                            }
                            break;
                        case 2 :
                            // org/antlr/grammar/v3/ANTLRv3.g:238:20: labelOp= '+='
                            {
                            labelOp=(Token)match(input,LIST_LABEL_ASSIGN,FOLLOW_LIST_LABEL_ASSIGN_in_element1582); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_LIST_LABEL_ASSIGN.add(labelOp);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_block_in_element1585);
                    block98=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block98.getTree());
                    // org/antlr/grammar/v3/ANTLRv3.g:239:3: ( ebnfSuffix -> ^( ebnfSuffix ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] ^( $labelOp id block ) EOA[\"EOA\"] ) EOB[\"EOB\"] ) ) | -> ^( $labelOp id block ) )
                    int alt42=2;
                    switch ( input.LA(1) ) {
                    case 74:
                    case 91:
                    case 92:
                        {
                        alt42=1;
                        }
                        break;
                    case SEMPRED:
                    case TREE_BEGIN:
                    case REWRITE:
                    case TOKEN_REF:
                    case STRING_LITERAL:
                    case CHAR_LITERAL:
                    case ACTION:
                    case RULE_REF:
                    case 71:
                    case 81:
                    case 82:
                    case 83:
                    case 87:
                    case 90:
                        {
                        alt42=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 42, 0, input);

                        throw nvae;
                    }

                    switch (alt42) {
                        case 1 :
                            // org/antlr/grammar/v3/ANTLRv3.g:239:5: ebnfSuffix
                            {
                            pushFollow(FOLLOW_ebnfSuffix_in_element1591);
                            ebnfSuffix99=ebnfSuffix();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_ebnfSuffix.add(ebnfSuffix99.getTree());


                            // AST REWRITE
                            // elements: id, ebnfSuffix, block, labelOp
                            // token labels: labelOp
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleTokenStream stream_labelOp=new RewriteRuleTokenStream(adaptor,"token labelOp",labelOp);
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 239:16: -> ^( ebnfSuffix ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] ^( $labelOp id block ) EOA[\"EOA\"] ) EOB[\"EOB\"] ) )
                            {
                                // org/antlr/grammar/v3/ANTLRv3.g:239:19: ^( ebnfSuffix ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] ^( $labelOp id block ) EOA[\"EOA\"] ) EOB[\"EOB\"] ) )
                                {
                                CommonTree root_1 = (CommonTree)adaptor.nil();
                                root_1 = (CommonTree)adaptor.becomeRoot(stream_ebnfSuffix.nextNode(), root_1);

                                // org/antlr/grammar/v3/ANTLRv3.g:239:33: ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] ^( $labelOp id block ) EOA[\"EOA\"] ) EOB[\"EOB\"] )
                                {
                                CommonTree root_2 = (CommonTree)adaptor.nil();
                                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_2);

                                // org/antlr/grammar/v3/ANTLRv3.g:239:50: ^( ALT[\"ALT\"] ^( $labelOp id block ) EOA[\"EOA\"] )
                                {
                                CommonTree root_3 = (CommonTree)adaptor.nil();
                                root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ALT, "ALT"), root_3);

                                // org/antlr/grammar/v3/ANTLRv3.g:239:63: ^( $labelOp id block )
                                {
                                CommonTree root_4 = (CommonTree)adaptor.nil();
                                root_4 = (CommonTree)adaptor.becomeRoot(stream_labelOp.nextNode(), root_4);

                                adaptor.addChild(root_4, stream_id.nextTree());
                                adaptor.addChild(root_4, stream_block.nextTree());

                                adaptor.addChild(root_3, root_4);
                                }
                                adaptor.addChild(root_3, (CommonTree)adaptor.create(EOA, "EOA"));

                                adaptor.addChild(root_2, root_3);
                                }
                                adaptor.addChild(root_2, (CommonTree)adaptor.create(EOB, "EOB"));

                                adaptor.addChild(root_1, root_2);
                                }

                                adaptor.addChild(root_0, root_1);
                                }

                            }

                            retval.tree = root_0;}
                            }
                            break;
                        case 2 :
                            // org/antlr/grammar/v3/ANTLRv3.g:240:8: 
                            {

                            // AST REWRITE
                            // elements: block, id, labelOp
                            // token labels: labelOp
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleTokenStream stream_labelOp=new RewriteRuleTokenStream(adaptor,"token labelOp",labelOp);
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 240:8: -> ^( $labelOp id block )
                            {
                                // org/antlr/grammar/v3/ANTLRv3.g:240:11: ^( $labelOp id block )
                                {
                                CommonTree root_1 = (CommonTree)adaptor.nil();
                                root_1 = (CommonTree)adaptor.becomeRoot(stream_labelOp.nextNode(), root_1);

                                adaptor.addChild(root_1, stream_id.nextTree());
                                adaptor.addChild(root_1, stream_block.nextTree());

                                adaptor.addChild(root_0, root_1);
                                }

                            }

                            retval.tree = root_0;}
                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // org/antlr/grammar/v3/ANTLRv3.g:242:4: atom ( ebnfSuffix -> ^( ebnfSuffix ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] atom EOA[\"EOA\"] ) EOB[\"EOB\"] ) ) | -> atom )
                    {
                    pushFollow(FOLLOW_atom_in_element1650);
                    atom100=atom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_atom.add(atom100.getTree());
                    // org/antlr/grammar/v3/ANTLRv3.g:243:3: ( ebnfSuffix -> ^( ebnfSuffix ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] atom EOA[\"EOA\"] ) EOB[\"EOB\"] ) ) | -> atom )
                    int alt43=2;
                    switch ( input.LA(1) ) {
                    case 74:
                    case 91:
                    case 92:
                        {
                        alt43=1;
                        }
                        break;
                    case SEMPRED:
                    case TREE_BEGIN:
                    case REWRITE:
                    case TOKEN_REF:
                    case STRING_LITERAL:
                    case CHAR_LITERAL:
                    case ACTION:
                    case RULE_REF:
                    case 71:
                    case 81:
                    case 82:
                    case 83:
                    case 87:
                    case 90:
                        {
                        alt43=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 43, 0, input);

                        throw nvae;
                    }

                    switch (alt43) {
                        case 1 :
                            // org/antlr/grammar/v3/ANTLRv3.g:243:5: ebnfSuffix
                            {
                            pushFollow(FOLLOW_ebnfSuffix_in_element1656);
                            ebnfSuffix101=ebnfSuffix();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_ebnfSuffix.add(ebnfSuffix101.getTree());


                            // AST REWRITE
                            // elements: atom, ebnfSuffix
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 243:16: -> ^( ebnfSuffix ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] atom EOA[\"EOA\"] ) EOB[\"EOB\"] ) )
                            {
                                // org/antlr/grammar/v3/ANTLRv3.g:243:19: ^( ebnfSuffix ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] atom EOA[\"EOA\"] ) EOB[\"EOB\"] ) )
                                {
                                CommonTree root_1 = (CommonTree)adaptor.nil();
                                root_1 = (CommonTree)adaptor.becomeRoot(stream_ebnfSuffix.nextNode(), root_1);

                                // org/antlr/grammar/v3/ANTLRv3.g:243:33: ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] atom EOA[\"EOA\"] ) EOB[\"EOB\"] )
                                {
                                CommonTree root_2 = (CommonTree)adaptor.nil();
                                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_2);

                                // org/antlr/grammar/v3/ANTLRv3.g:243:50: ^( ALT[\"ALT\"] atom EOA[\"EOA\"] )
                                {
                                CommonTree root_3 = (CommonTree)adaptor.nil();
                                root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ALT, "ALT"), root_3);

                                adaptor.addChild(root_3, stream_atom.nextTree());
                                adaptor.addChild(root_3, (CommonTree)adaptor.create(EOA, "EOA"));

                                adaptor.addChild(root_2, root_3);
                                }
                                adaptor.addChild(root_2, (CommonTree)adaptor.create(EOB, "EOB"));

                                adaptor.addChild(root_1, root_2);
                                }

                                adaptor.addChild(root_0, root_1);
                                }

                            }

                            retval.tree = root_0;}
                            }
                            break;
                        case 2 :
                            // org/antlr/grammar/v3/ANTLRv3.g:244:8: 
                            {

                            // AST REWRITE
                            // elements: atom
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 244:8: -> atom
                            {
                                adaptor.addChild(root_0, stream_atom.nextTree());

                            }

                            retval.tree = root_0;}
                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // org/antlr/grammar/v3/ANTLRv3.g:246:4: ebnf
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_ebnf_in_element1702);
                    ebnf102=ebnf();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ebnf102.getTree());

                    }
                    break;
                case 5 :
                    // org/antlr/grammar/v3/ANTLRv3.g:247:6: ACTION
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    ACTION103=(Token)match(input,ACTION,FOLLOW_ACTION_in_element1709); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ACTION103_tree = (CommonTree)adaptor.create(ACTION103);
                    adaptor.addChild(root_0, ACTION103_tree);
                    }

                    }
                    break;
                case 6 :
                    // org/antlr/grammar/v3/ANTLRv3.g:248:6: SEMPRED (g= '=>' -> GATED_SEMPRED[$g] | -> SEMPRED )
                    {
                    SEMPRED104=(Token)match(input,SEMPRED,FOLLOW_SEMPRED_in_element1716); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMPRED.add(SEMPRED104);

                    // org/antlr/grammar/v3/ANTLRv3.g:248:14: (g= '=>' -> GATED_SEMPRED[$g] | -> SEMPRED )
                    int alt44=2;
                    switch ( input.LA(1) ) {
                    case 86:
                        {
                        alt44=1;
                        }
                        break;
                    case SEMPRED:
                    case TREE_BEGIN:
                    case REWRITE:
                    case TOKEN_REF:
                    case STRING_LITERAL:
                    case CHAR_LITERAL:
                    case ACTION:
                    case RULE_REF:
                    case 71:
                    case 81:
                    case 82:
                    case 83:
                    case 87:
                    case 90:
                        {
                        alt44=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 44, 0, input);

                        throw nvae;
                    }

                    switch (alt44) {
                        case 1 :
                            // org/antlr/grammar/v3/ANTLRv3.g:248:16: g= '=>'
                            {
                            g=(Token)match(input,86,FOLLOW_86_in_element1722); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_86.add(g);



                            // AST REWRITE
                            // elements: 
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 248:23: -> GATED_SEMPRED[$g]
                            {
                                adaptor.addChild(root_0, (CommonTree)adaptor.create(GATED_SEMPRED, g));

                            }

                            retval.tree = root_0;}
                            }
                            break;
                        case 2 :
                            // org/antlr/grammar/v3/ANTLRv3.g:248:46: 
                            {

                            // AST REWRITE
                            // elements: SEMPRED
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 248:46: -> SEMPRED
                            {
                                adaptor.addChild(root_0, stream_SEMPRED.nextNode());

                            }

                            retval.tree = root_0;}
                            }
                            break;

                    }


                    }
                    break;
                case 7 :
                    // org/antlr/grammar/v3/ANTLRv3.g:249:6: treeSpec ( ebnfSuffix -> ^( ebnfSuffix ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] treeSpec EOA[\"EOA\"] ) EOB[\"EOB\"] ) ) | -> treeSpec )
                    {
                    pushFollow(FOLLOW_treeSpec_in_element1742);
                    treeSpec105=treeSpec();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_treeSpec.add(treeSpec105.getTree());
                    // org/antlr/grammar/v3/ANTLRv3.g:250:3: ( ebnfSuffix -> ^( ebnfSuffix ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] treeSpec EOA[\"EOA\"] ) EOB[\"EOB\"] ) ) | -> treeSpec )
                    int alt45=2;
                    switch ( input.LA(1) ) {
                    case 74:
                    case 91:
                    case 92:
                        {
                        alt45=1;
                        }
                        break;
                    case SEMPRED:
                    case TREE_BEGIN:
                    case REWRITE:
                    case TOKEN_REF:
                    case STRING_LITERAL:
                    case CHAR_LITERAL:
                    case ACTION:
                    case RULE_REF:
                    case 71:
                    case 81:
                    case 82:
                    case 83:
                    case 87:
                    case 90:
                        {
                        alt45=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 45, 0, input);

                        throw nvae;
                    }

                    switch (alt45) {
                        case 1 :
                            // org/antlr/grammar/v3/ANTLRv3.g:250:5: ebnfSuffix
                            {
                            pushFollow(FOLLOW_ebnfSuffix_in_element1748);
                            ebnfSuffix106=ebnfSuffix();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_ebnfSuffix.add(ebnfSuffix106.getTree());


                            // AST REWRITE
                            // elements: treeSpec, ebnfSuffix
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 250:16: -> ^( ebnfSuffix ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] treeSpec EOA[\"EOA\"] ) EOB[\"EOB\"] ) )
                            {
                                // org/antlr/grammar/v3/ANTLRv3.g:250:19: ^( ebnfSuffix ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] treeSpec EOA[\"EOA\"] ) EOB[\"EOB\"] ) )
                                {
                                CommonTree root_1 = (CommonTree)adaptor.nil();
                                root_1 = (CommonTree)adaptor.becomeRoot(stream_ebnfSuffix.nextNode(), root_1);

                                // org/antlr/grammar/v3/ANTLRv3.g:250:33: ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] treeSpec EOA[\"EOA\"] ) EOB[\"EOB\"] )
                                {
                                CommonTree root_2 = (CommonTree)adaptor.nil();
                                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_2);

                                // org/antlr/grammar/v3/ANTLRv3.g:250:50: ^( ALT[\"ALT\"] treeSpec EOA[\"EOA\"] )
                                {
                                CommonTree root_3 = (CommonTree)adaptor.nil();
                                root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ALT, "ALT"), root_3);

                                adaptor.addChild(root_3, stream_treeSpec.nextTree());
                                adaptor.addChild(root_3, (CommonTree)adaptor.create(EOA, "EOA"));

                                adaptor.addChild(root_2, root_3);
                                }
                                adaptor.addChild(root_2, (CommonTree)adaptor.create(EOB, "EOB"));

                                adaptor.addChild(root_1, root_2);
                                }

                                adaptor.addChild(root_0, root_1);
                                }

                            }

                            retval.tree = root_0;}
                            }
                            break;
                        case 2 :
                            // org/antlr/grammar/v3/ANTLRv3.g:251:8: 
                            {

                            // AST REWRITE
                            // elements: treeSpec
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 251:8: -> treeSpec
                            {
                                adaptor.addChild(root_0, stream_treeSpec.nextTree());

                            }

                            retval.tree = root_0;}
                            }
                            break;

                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "element"

    public static class atom_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "atom"
    // org/antlr/grammar/v3/ANTLRv3.g:255:1: atom : ( terminal | range ( (op= '^' | op= '!' ) -> ^( $op range ) | -> range ) | notSet ( (op= '^' | op= '!' ) -> ^( $op notSet ) | -> notSet ) | RULE_REF ( ARG_ACTION )? ( (op= '^' | op= '!' ) -> ^( $op RULE_REF ( ARG_ACTION )? ) | -> ^( RULE_REF ( ARG_ACTION )? ) ) );
    public final ANTLRv3Parser.atom_return atom() throws RecognitionException {
        ANTLRv3Parser.atom_return retval = new ANTLRv3Parser.atom_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token op=null;
        Token RULE_REF110=null;
        Token ARG_ACTION111=null;
        ANTLRv3Parser.terminal_return terminal107 = null;

        ANTLRv3Parser.range_return range108 = null;

        ANTLRv3Parser.notSet_return notSet109 = null;


        CommonTree op_tree=null;
        CommonTree RULE_REF110_tree=null;
        CommonTree ARG_ACTION111_tree=null;
        RewriteRuleTokenStream stream_BANG=new RewriteRuleTokenStream(adaptor,"token BANG");
        RewriteRuleTokenStream stream_ROOT=new RewriteRuleTokenStream(adaptor,"token ROOT");
        RewriteRuleTokenStream stream_RULE_REF=new RewriteRuleTokenStream(adaptor,"token RULE_REF");
        RewriteRuleTokenStream stream_ARG_ACTION=new RewriteRuleTokenStream(adaptor,"token ARG_ACTION");
        RewriteRuleSubtreeStream stream_range=new RewriteRuleSubtreeStream(adaptor,"rule range");
        RewriteRuleSubtreeStream stream_notSet=new RewriteRuleSubtreeStream(adaptor,"rule notSet");
        try {
            // org/antlr/grammar/v3/ANTLRv3.g:255:5: ( terminal | range ( (op= '^' | op= '!' ) -> ^( $op range ) | -> range ) | notSet ( (op= '^' | op= '!' ) -> ^( $op notSet ) | -> notSet ) | RULE_REF ( ARG_ACTION )? ( (op= '^' | op= '!' ) -> ^( $op RULE_REF ( ARG_ACTION )? ) | -> ^( RULE_REF ( ARG_ACTION )? ) ) )
            int alt54=4;
            switch ( input.LA(1) ) {
            case CHAR_LITERAL:
                {
                switch ( input.LA(2) ) {
                case RANGE:
                    {
                    alt54=2;
                    }
                    break;
                case SEMPRED:
                case TREE_BEGIN:
                case ROOT:
                case BANG:
                case REWRITE:
                case TOKEN_REF:
                case STRING_LITERAL:
                case CHAR_LITERAL:
                case ACTION:
                case RULE_REF:
                case 71:
                case 74:
                case 81:
                case 82:
                case 83:
                case 87:
                case 88:
                case 90:
                case 91:
                case 92:
                    {
                    alt54=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 54, 1, input);

                    throw nvae;
                }

                }
                break;
            case TOKEN_REF:
            case STRING_LITERAL:
            case 90:
                {
                alt54=1;
                }
                break;
            case 87:
                {
                alt54=3;
                }
                break;
            case RULE_REF:
                {
                alt54=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }

            switch (alt54) {
                case 1 :
                    // org/antlr/grammar/v3/ANTLRv3.g:255:9: terminal
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_terminal_in_atom1800);
                    terminal107=terminal();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, terminal107.getTree());

                    }
                    break;
                case 2 :
                    // org/antlr/grammar/v3/ANTLRv3.g:256:4: range ( (op= '^' | op= '!' ) -> ^( $op range ) | -> range )
                    {
                    pushFollow(FOLLOW_range_in_atom1805);
                    range108=range();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_range.add(range108.getTree());
                    // org/antlr/grammar/v3/ANTLRv3.g:257:3: ( (op= '^' | op= '!' ) -> ^( $op range ) | -> range )
                    int alt48=2;
                    switch ( input.LA(1) ) {
                    case ROOT:
                    case BANG:
                        {
                        alt48=1;
                        }
                        break;
                    case SEMPRED:
                    case TREE_BEGIN:
                    case REWRITE:
                    case TOKEN_REF:
                    case STRING_LITERAL:
                    case CHAR_LITERAL:
                    case ACTION:
                    case RULE_REF:
                    case 71:
                    case 74:
                    case 81:
                    case 82:
                    case 83:
                    case 87:
                    case 90:
                    case 91:
                    case 92:
                        {
                        alt48=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 48, 0, input);

                        throw nvae;
                    }

                    switch (alt48) {
                        case 1 :
                            // org/antlr/grammar/v3/ANTLRv3.g:257:5: (op= '^' | op= '!' )
                            {
                            // org/antlr/grammar/v3/ANTLRv3.g:257:5: (op= '^' | op= '!' )
                            int alt47=2;
                            switch ( input.LA(1) ) {
                            case ROOT:
                                {
                                alt47=1;
                                }
                                break;
                            case BANG:
                                {
                                alt47=2;
                                }
                                break;
                            default:
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 47, 0, input);

                                throw nvae;
                            }

                            switch (alt47) {
                                case 1 :
                                    // org/antlr/grammar/v3/ANTLRv3.g:257:6: op= '^'
                                    {
                                    op=(Token)match(input,ROOT,FOLLOW_ROOT_in_atom1815); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_ROOT.add(op);


                                    }
                                    break;
                                case 2 :
                                    // org/antlr/grammar/v3/ANTLRv3.g:257:13: op= '!'
                                    {
                                    op=(Token)match(input,BANG,FOLLOW_BANG_in_atom1819); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_BANG.add(op);


                                    }
                                    break;

                            }



                            // AST REWRITE
                            // elements: range, op
                            // token labels: op
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleTokenStream stream_op=new RewriteRuleTokenStream(adaptor,"token op",op);
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 257:21: -> ^( $op range )
                            {
                                // org/antlr/grammar/v3/ANTLRv3.g:257:24: ^( $op range )
                                {
                                CommonTree root_1 = (CommonTree)adaptor.nil();
                                root_1 = (CommonTree)adaptor.becomeRoot(stream_op.nextNode(), root_1);

                                adaptor.addChild(root_1, stream_range.nextTree());

                                adaptor.addChild(root_0, root_1);
                                }

                            }

                            retval.tree = root_0;}
                            }
                            break;
                        case 2 :
                            // org/antlr/grammar/v3/ANTLRv3.g:258:9: 
                            {

                            // AST REWRITE
                            // elements: range
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 258:9: -> range
                            {
                                adaptor.addChild(root_0, stream_range.nextTree());

                            }

                            retval.tree = root_0;}
                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // org/antlr/grammar/v3/ANTLRv3.g:260:7: notSet ( (op= '^' | op= '!' ) -> ^( $op notSet ) | -> notSet )
                    {
                    pushFollow(FOLLOW_notSet_in_atom1853);
                    notSet109=notSet();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_notSet.add(notSet109.getTree());
                    // org/antlr/grammar/v3/ANTLRv3.g:261:3: ( (op= '^' | op= '!' ) -> ^( $op notSet ) | -> notSet )
                    int alt50=2;
                    switch ( input.LA(1) ) {
                    case ROOT:
                    case BANG:
                        {
                        alt50=1;
                        }
                        break;
                    case SEMPRED:
                    case TREE_BEGIN:
                    case REWRITE:
                    case TOKEN_REF:
                    case STRING_LITERAL:
                    case CHAR_LITERAL:
                    case ACTION:
                    case RULE_REF:
                    case 71:
                    case 74:
                    case 81:
                    case 82:
                    case 83:
                    case 87:
                    case 90:
                    case 91:
                    case 92:
                        {
                        alt50=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 50, 0, input);

                        throw nvae;
                    }

                    switch (alt50) {
                        case 1 :
                            // org/antlr/grammar/v3/ANTLRv3.g:261:5: (op= '^' | op= '!' )
                            {
                            // org/antlr/grammar/v3/ANTLRv3.g:261:5: (op= '^' | op= '!' )
                            int alt49=2;
                            switch ( input.LA(1) ) {
                            case ROOT:
                                {
                                alt49=1;
                                }
                                break;
                            case BANG:
                                {
                                alt49=2;
                                }
                                break;
                            default:
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 49, 0, input);

                                throw nvae;
                            }

                            switch (alt49) {
                                case 1 :
                                    // org/antlr/grammar/v3/ANTLRv3.g:261:6: op= '^'
                                    {
                                    op=(Token)match(input,ROOT,FOLLOW_ROOT_in_atom1862); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_ROOT.add(op);


                                    }
                                    break;
                                case 2 :
                                    // org/antlr/grammar/v3/ANTLRv3.g:261:13: op= '!'
                                    {
                                    op=(Token)match(input,BANG,FOLLOW_BANG_in_atom1866); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_BANG.add(op);


                                    }
                                    break;

                            }



                            // AST REWRITE
                            // elements: notSet, op
                            // token labels: op
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleTokenStream stream_op=new RewriteRuleTokenStream(adaptor,"token op",op);
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 261:21: -> ^( $op notSet )
                            {
                                // org/antlr/grammar/v3/ANTLRv3.g:261:24: ^( $op notSet )
                                {
                                CommonTree root_1 = (CommonTree)adaptor.nil();
                                root_1 = (CommonTree)adaptor.becomeRoot(stream_op.nextNode(), root_1);

                                adaptor.addChild(root_1, stream_notSet.nextTree());

                                adaptor.addChild(root_0, root_1);
                                }

                            }

                            retval.tree = root_0;}
                            }
                            break;
                        case 2 :
                            // org/antlr/grammar/v3/ANTLRv3.g:262:9: 
                            {

                            // AST REWRITE
                            // elements: notSet
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 262:9: -> notSet
                            {
                                adaptor.addChild(root_0, stream_notSet.nextTree());

                            }

                            retval.tree = root_0;}
                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // org/antlr/grammar/v3/ANTLRv3.g:264:9: RULE_REF ( ARG_ACTION )? ( (op= '^' | op= '!' ) -> ^( $op RULE_REF ( ARG_ACTION )? ) | -> ^( RULE_REF ( ARG_ACTION )? ) )
                    {
                    RULE_REF110=(Token)match(input,RULE_REF,FOLLOW_RULE_REF_in_atom1902); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RULE_REF.add(RULE_REF110);

                    // org/antlr/grammar/v3/ANTLRv3.g:264:18: ( ARG_ACTION )?
                    int alt51=2;
                    switch ( input.LA(1) ) {
                        case ARG_ACTION:
                            {
                            alt51=1;
                            }
                            break;
                    }

                    switch (alt51) {
                        case 1 :
                            // org/antlr/grammar/v3/ANTLRv3.g:264:18: ARG_ACTION
                            {
                            ARG_ACTION111=(Token)match(input,ARG_ACTION,FOLLOW_ARG_ACTION_in_atom1904); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ARG_ACTION.add(ARG_ACTION111);


                            }
                            break;

                    }

                    // org/antlr/grammar/v3/ANTLRv3.g:265:3: ( (op= '^' | op= '!' ) -> ^( $op RULE_REF ( ARG_ACTION )? ) | -> ^( RULE_REF ( ARG_ACTION )? ) )
                    int alt53=2;
                    switch ( input.LA(1) ) {
                    case ROOT:
                    case BANG:
                        {
                        alt53=1;
                        }
                        break;
                    case SEMPRED:
                    case TREE_BEGIN:
                    case REWRITE:
                    case TOKEN_REF:
                    case STRING_LITERAL:
                    case CHAR_LITERAL:
                    case ACTION:
                    case RULE_REF:
                    case 71:
                    case 74:
                    case 81:
                    case 82:
                    case 83:
                    case 87:
                    case 90:
                    case 91:
                    case 92:
                        {
                        alt53=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 53, 0, input);

                        throw nvae;
                    }

                    switch (alt53) {
                        case 1 :
                            // org/antlr/grammar/v3/ANTLRv3.g:265:5: (op= '^' | op= '!' )
                            {
                            // org/antlr/grammar/v3/ANTLRv3.g:265:5: (op= '^' | op= '!' )
                            int alt52=2;
                            switch ( input.LA(1) ) {
                            case ROOT:
                                {
                                alt52=1;
                                }
                                break;
                            case BANG:
                                {
                                alt52=2;
                                }
                                break;
                            default:
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 52, 0, input);

                                throw nvae;
                            }

                            switch (alt52) {
                                case 1 :
                                    // org/antlr/grammar/v3/ANTLRv3.g:265:6: op= '^'
                                    {
                                    op=(Token)match(input,ROOT,FOLLOW_ROOT_in_atom1914); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_ROOT.add(op);


                                    }
                                    break;
                                case 2 :
                                    // org/antlr/grammar/v3/ANTLRv3.g:265:13: op= '!'
                                    {
                                    op=(Token)match(input,BANG,FOLLOW_BANG_in_atom1918); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_BANG.add(op);


                                    }
                                    break;

                            }



                            // AST REWRITE
                            // elements: RULE_REF, ARG_ACTION, op
                            // token labels: op
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleTokenStream stream_op=new RewriteRuleTokenStream(adaptor,"token op",op);
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 265:21: -> ^( $op RULE_REF ( ARG_ACTION )? )
                            {
                                // org/antlr/grammar/v3/ANTLRv3.g:265:24: ^( $op RULE_REF ( ARG_ACTION )? )
                                {
                                CommonTree root_1 = (CommonTree)adaptor.nil();
                                root_1 = (CommonTree)adaptor.becomeRoot(stream_op.nextNode(), root_1);

                                adaptor.addChild(root_1, stream_RULE_REF.nextNode());
                                // org/antlr/grammar/v3/ANTLRv3.g:265:39: ( ARG_ACTION )?
                                if ( stream_ARG_ACTION.hasNext() ) {
                                    adaptor.addChild(root_1, stream_ARG_ACTION.nextNode());

                                }
                                stream_ARG_ACTION.reset();

                                adaptor.addChild(root_0, root_1);
                                }

                            }

                            retval.tree = root_0;}
                            }
                            break;
                        case 2 :
                            // org/antlr/grammar/v3/ANTLRv3.g:266:9: 
                            {

                            // AST REWRITE
                            // elements: ARG_ACTION, RULE_REF
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 266:9: -> ^( RULE_REF ( ARG_ACTION )? )
                            {
                                // org/antlr/grammar/v3/ANTLRv3.g:266:12: ^( RULE_REF ( ARG_ACTION )? )
                                {
                                CommonTree root_1 = (CommonTree)adaptor.nil();
                                root_1 = (CommonTree)adaptor.becomeRoot(stream_RULE_REF.nextNode(), root_1);

                                // org/antlr/grammar/v3/ANTLRv3.g:266:23: ( ARG_ACTION )?
                                if ( stream_ARG_ACTION.hasNext() ) {
                                    adaptor.addChild(root_1, stream_ARG_ACTION.nextNode());

                                }
                                stream_ARG_ACTION.reset();

                                adaptor.addChild(root_0, root_1);
                                }

                            }

                            retval.tree = root_0;}
                            }
                            break;

                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "atom"

    public static class notSet_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "notSet"
    // org/antlr/grammar/v3/ANTLRv3.g:270:1: notSet : '~' ( notTerminal ( elementOptions )? -> ^( '~' notTerminal ( elementOptions )? ) | block ( elementOptions )? -> ^( '~' block ( elementOptions )? ) ) ;
    public final ANTLRv3Parser.notSet_return notSet() throws RecognitionException {
        ANTLRv3Parser.notSet_return retval = new ANTLRv3Parser.notSet_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal112=null;
        ANTLRv3Parser.notTerminal_return notTerminal113 = null;

        ANTLRv3Parser.elementOptions_return elementOptions114 = null;

        ANTLRv3Parser.block_return block115 = null;

        ANTLRv3Parser.elementOptions_return elementOptions116 = null;


        CommonTree char_literal112_tree=null;
        RewriteRuleTokenStream stream_87=new RewriteRuleTokenStream(adaptor,"token 87");
        RewriteRuleSubtreeStream stream_notTerminal=new RewriteRuleSubtreeStream(adaptor,"rule notTerminal");
        RewriteRuleSubtreeStream stream_elementOptions=new RewriteRuleSubtreeStream(adaptor,"rule elementOptions");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // org/antlr/grammar/v3/ANTLRv3.g:271:2: ( '~' ( notTerminal ( elementOptions )? -> ^( '~' notTerminal ( elementOptions )? ) | block ( elementOptions )? -> ^( '~' block ( elementOptions )? ) ) )
            // org/antlr/grammar/v3/ANTLRv3.g:271:4: '~' ( notTerminal ( elementOptions )? -> ^( '~' notTerminal ( elementOptions )? ) | block ( elementOptions )? -> ^( '~' block ( elementOptions )? ) )
            {
            char_literal112=(Token)match(input,87,FOLLOW_87_in_notSet1966); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_87.add(char_literal112);

            // org/antlr/grammar/v3/ANTLRv3.g:272:3: ( notTerminal ( elementOptions )? -> ^( '~' notTerminal ( elementOptions )? ) | block ( elementOptions )? -> ^( '~' block ( elementOptions )? ) )
            int alt57=2;
            switch ( input.LA(1) ) {
            case TOKEN_REF:
            case STRING_LITERAL:
            case CHAR_LITERAL:
                {
                alt57=1;
                }
                break;
            case 81:
                {
                alt57=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // org/antlr/grammar/v3/ANTLRv3.g:272:5: notTerminal ( elementOptions )?
                    {
                    pushFollow(FOLLOW_notTerminal_in_notSet1972);
                    notTerminal113=notTerminal();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_notTerminal.add(notTerminal113.getTree());
                    // org/antlr/grammar/v3/ANTLRv3.g:272:17: ( elementOptions )?
                    int alt55=2;
                    switch ( input.LA(1) ) {
                        case 88:
                            {
                            alt55=1;
                            }
                            break;
                    }

                    switch (alt55) {
                        case 1 :
                            // org/antlr/grammar/v3/ANTLRv3.g:272:17: elementOptions
                            {
                            pushFollow(FOLLOW_elementOptions_in_notSet1974);
                            elementOptions114=elementOptions();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_elementOptions.add(elementOptions114.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: notTerminal, 87, elementOptions
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 272:33: -> ^( '~' notTerminal ( elementOptions )? )
                    {
                        // org/antlr/grammar/v3/ANTLRv3.g:272:36: ^( '~' notTerminal ( elementOptions )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_87.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_notTerminal.nextTree());
                        // org/antlr/grammar/v3/ANTLRv3.g:272:54: ( elementOptions )?
                        if ( stream_elementOptions.hasNext() ) {
                            adaptor.addChild(root_1, stream_elementOptions.nextTree());

                        }
                        stream_elementOptions.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // org/antlr/grammar/v3/ANTLRv3.g:273:5: block ( elementOptions )?
                    {
                    pushFollow(FOLLOW_block_in_notSet1992);
                    block115=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block115.getTree());
                    // org/antlr/grammar/v3/ANTLRv3.g:273:11: ( elementOptions )?
                    int alt56=2;
                    switch ( input.LA(1) ) {
                        case 88:
                            {
                            alt56=1;
                            }
                            break;
                    }

                    switch (alt56) {
                        case 1 :
                            // org/antlr/grammar/v3/ANTLRv3.g:273:11: elementOptions
                            {
                            pushFollow(FOLLOW_elementOptions_in_notSet1994);
                            elementOptions116=elementOptions();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_elementOptions.add(elementOptions116.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: block, elementOptions, 87
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 273:28: -> ^( '~' block ( elementOptions )? )
                    {
                        // org/antlr/grammar/v3/ANTLRv3.g:273:31: ^( '~' block ( elementOptions )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_87.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_block.nextTree());
                        // org/antlr/grammar/v3/ANTLRv3.g:273:43: ( elementOptions )?
                        if ( stream_elementOptions.hasNext() ) {
                            adaptor.addChild(root_1, stream_elementOptions.nextTree());

                        }
                        stream_elementOptions.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "notSet"

    public static class notTerminal_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "notTerminal"
    // org/antlr/grammar/v3/ANTLRv3.g:277:1: notTerminal : ( CHAR_LITERAL | TOKEN_REF | STRING_LITERAL );
    public final ANTLRv3Parser.notTerminal_return notTerminal() throws RecognitionException {
        ANTLRv3Parser.notTerminal_return retval = new ANTLRv3Parser.notTerminal_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set117=null;

        CommonTree set117_tree=null;

        try {
            // org/antlr/grammar/v3/ANTLRv3.g:278:2: ( CHAR_LITERAL | TOKEN_REF | STRING_LITERAL )
            // org/antlr/grammar/v3/ANTLRv3.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set117=(Token)input.LT(1);
            if ( (input.LA(1)>=TOKEN_REF && input.LA(1)<=CHAR_LITERAL) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set117));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "notTerminal"

    public static class elementOptions_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "elementOptions"
    // org/antlr/grammar/v3/ANTLRv3.g:283:1: elementOptions : ( '<' qid '>' -> ^( OPTIONS qid ) | '<' option ( ';' option )* '>' -> ^( OPTIONS ( option )+ ) );
    public final ANTLRv3Parser.elementOptions_return elementOptions() throws RecognitionException {
        ANTLRv3Parser.elementOptions_return retval = new ANTLRv3Parser.elementOptions_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal118=null;
        Token char_literal120=null;
        Token char_literal121=null;
        Token char_literal123=null;
        Token char_literal125=null;
        ANTLRv3Parser.qid_return qid119 = null;

        ANTLRv3Parser.option_return option122 = null;

        ANTLRv3Parser.option_return option124 = null;


        CommonTree char_literal118_tree=null;
        CommonTree char_literal120_tree=null;
        CommonTree char_literal121_tree=null;
        CommonTree char_literal123_tree=null;
        CommonTree char_literal125_tree=null;
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleTokenStream stream_88=new RewriteRuleTokenStream(adaptor,"token 88");
        RewriteRuleTokenStream stream_89=new RewriteRuleTokenStream(adaptor,"token 89");
        RewriteRuleSubtreeStream stream_qid=new RewriteRuleSubtreeStream(adaptor,"rule qid");
        RewriteRuleSubtreeStream stream_option=new RewriteRuleSubtreeStream(adaptor,"rule option");
        try {
            // org/antlr/grammar/v3/ANTLRv3.g:284:2: ( '<' qid '>' -> ^( OPTIONS qid ) | '<' option ( ';' option )* '>' -> ^( OPTIONS ( option )+ ) )
            int alt59=2;
            switch ( input.LA(1) ) {
            case 88:
                {
                switch ( input.LA(2) ) {
                case TOKEN_REF:
                    {
                    switch ( input.LA(3) ) {
                    case 89:
                    case 90:
                        {
                        alt59=1;
                        }
                        break;
                    case LABEL_ASSIGN:
                        {
                        alt59=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 59, 2, input);

                        throw nvae;
                    }

                    }
                    break;
                case RULE_REF:
                    {
                    switch ( input.LA(3) ) {
                    case 89:
                    case 90:
                        {
                        alt59=1;
                        }
                        break;
                    case LABEL_ASSIGN:
                        {
                        alt59=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 59, 3, input);

                        throw nvae;
                    }

                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 59, 1, input);

                    throw nvae;
                }

                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }

            switch (alt59) {
                case 1 :
                    // org/antlr/grammar/v3/ANTLRv3.g:284:4: '<' qid '>'
                    {
                    char_literal118=(Token)match(input,88,FOLLOW_88_in_elementOptions2046); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_88.add(char_literal118);

                    pushFollow(FOLLOW_qid_in_elementOptions2048);
                    qid119=qid();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_qid.add(qid119.getTree());
                    char_literal120=(Token)match(input,89,FOLLOW_89_in_elementOptions2050); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_89.add(char_literal120);



                    // AST REWRITE
                    // elements: qid
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 284:21: -> ^( OPTIONS qid )
                    {
                        // org/antlr/grammar/v3/ANTLRv3.g:284:24: ^( OPTIONS qid )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OPTIONS, "OPTIONS"), root_1);

                        adaptor.addChild(root_1, stream_qid.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // org/antlr/grammar/v3/ANTLRv3.g:285:4: '<' option ( ';' option )* '>'
                    {
                    char_literal121=(Token)match(input,88,FOLLOW_88_in_elementOptions2068); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_88.add(char_literal121);

                    pushFollow(FOLLOW_option_in_elementOptions2070);
                    option122=option();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_option.add(option122.getTree());
                    // org/antlr/grammar/v3/ANTLRv3.g:285:15: ( ';' option )*
                    loop58:
                    do {
                        int alt58=2;
                        switch ( input.LA(1) ) {
                        case 71:
                            {
                            alt58=1;
                            }
                            break;

                        }

                        switch (alt58) {
                    	case 1 :
                    	    // org/antlr/grammar/v3/ANTLRv3.g:285:16: ';' option
                    	    {
                    	    char_literal123=(Token)match(input,71,FOLLOW_71_in_elementOptions2073); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_71.add(char_literal123);

                    	    pushFollow(FOLLOW_option_in_elementOptions2075);
                    	    option124=option();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_option.add(option124.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop58;
                        }
                    } while (true);

                    char_literal125=(Token)match(input,89,FOLLOW_89_in_elementOptions2079); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_89.add(char_literal125);



                    // AST REWRITE
                    // elements: option
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 285:33: -> ^( OPTIONS ( option )+ )
                    {
                        // org/antlr/grammar/v3/ANTLRv3.g:285:36: ^( OPTIONS ( option )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OPTIONS, "OPTIONS"), root_1);

                        if ( !(stream_option.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_option.hasNext() ) {
                            adaptor.addChild(root_1, stream_option.nextTree());

                        }
                        stream_option.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "elementOptions"

    public static class elementOption_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "elementOption"
    // org/antlr/grammar/v3/ANTLRv3.g:288:1: elementOption : id '=' optionValue -> ^( '=' id optionValue ) ;
    public final ANTLRv3Parser.elementOption_return elementOption() throws RecognitionException {
        ANTLRv3Parser.elementOption_return retval = new ANTLRv3Parser.elementOption_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal127=null;
        ANTLRv3Parser.id_return id126 = null;

        ANTLRv3Parser.optionValue_return optionValue128 = null;


        CommonTree char_literal127_tree=null;
        RewriteRuleTokenStream stream_LABEL_ASSIGN=new RewriteRuleTokenStream(adaptor,"token LABEL_ASSIGN");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_optionValue=new RewriteRuleSubtreeStream(adaptor,"rule optionValue");
        try {
            // org/antlr/grammar/v3/ANTLRv3.g:289:2: ( id '=' optionValue -> ^( '=' id optionValue ) )
            // org/antlr/grammar/v3/ANTLRv3.g:289:4: id '=' optionValue
            {
            pushFollow(FOLLOW_id_in_elementOption2099);
            id126=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(id126.getTree());
            char_literal127=(Token)match(input,LABEL_ASSIGN,FOLLOW_LABEL_ASSIGN_in_elementOption2101); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LABEL_ASSIGN.add(char_literal127);

            pushFollow(FOLLOW_optionValue_in_elementOption2103);
            optionValue128=optionValue();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_optionValue.add(optionValue128.getTree());


            // AST REWRITE
            // elements: LABEL_ASSIGN, optionValue, id
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 289:23: -> ^( '=' id optionValue )
            {
                // org/antlr/grammar/v3/ANTLRv3.g:289:26: ^( '=' id optionValue )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_LABEL_ASSIGN.nextNode(), root_1);

                adaptor.addChild(root_1, stream_id.nextTree());
                adaptor.addChild(root_1, stream_optionValue.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "elementOption"

    public static class treeSpec_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "treeSpec"
    // org/antlr/grammar/v3/ANTLRv3.g:292:1: treeSpec : '^(' element ( element )+ ')' -> ^( TREE_BEGIN ( element )+ ) ;
    public final ANTLRv3Parser.treeSpec_return treeSpec() throws RecognitionException {
        ANTLRv3Parser.treeSpec_return retval = new ANTLRv3Parser.treeSpec_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal129=null;
        Token char_literal132=null;
        ANTLRv3Parser.element_return element130 = null;

        ANTLRv3Parser.element_return element131 = null;


        CommonTree string_literal129_tree=null;
        CommonTree char_literal132_tree=null;
        RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
        RewriteRuleTokenStream stream_TREE_BEGIN=new RewriteRuleTokenStream(adaptor,"token TREE_BEGIN");
        RewriteRuleSubtreeStream stream_element=new RewriteRuleSubtreeStream(adaptor,"rule element");
        try {
            // org/antlr/grammar/v3/ANTLRv3.g:293:2: ( '^(' element ( element )+ ')' -> ^( TREE_BEGIN ( element )+ ) )
            // org/antlr/grammar/v3/ANTLRv3.g:293:4: '^(' element ( element )+ ')'
            {
            string_literal129=(Token)match(input,TREE_BEGIN,FOLLOW_TREE_BEGIN_in_treeSpec2125); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_TREE_BEGIN.add(string_literal129);

            pushFollow(FOLLOW_element_in_treeSpec2127);
            element130=element();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_element.add(element130.getTree());
            // org/antlr/grammar/v3/ANTLRv3.g:293:17: ( element )+
            int cnt60=0;
            loop60:
            do {
                int alt60=2;
                switch ( input.LA(1) ) {
                case SEMPRED:
                case TREE_BEGIN:
                case TOKEN_REF:
                case STRING_LITERAL:
                case CHAR_LITERAL:
                case ACTION:
                case RULE_REF:
                case 81:
                case 87:
                case 90:
                    {
                    alt60=1;
                    }
                    break;

                }

                switch (alt60) {
            	case 1 :
            	    // org/antlr/grammar/v3/ANTLRv3.g:293:19: element
            	    {
            	    pushFollow(FOLLOW_element_in_treeSpec2131);
            	    element131=element();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_element.add(element131.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt60 >= 1 ) break loop60;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(60, input);
                        throw eee;
                }
                cnt60++;
            } while (true);

            char_literal132=(Token)match(input,83,FOLLOW_83_in_treeSpec2136); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_83.add(char_literal132);



            // AST REWRITE
            // elements: element
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 293:34: -> ^( TREE_BEGIN ( element )+ )
            {
                // org/antlr/grammar/v3/ANTLRv3.g:293:37: ^( TREE_BEGIN ( element )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TREE_BEGIN, "TREE_BEGIN"), root_1);

                if ( !(stream_element.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_element.hasNext() ) {
                    adaptor.addChild(root_1, stream_element.nextTree());

                }
                stream_element.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "treeSpec"

    public static class range_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "range"
    // org/antlr/grammar/v3/ANTLRv3.g:296:1: range : c1= CHAR_LITERAL RANGE c2= CHAR_LITERAL ( elementOptions )? -> ^( CHAR_RANGE[$c1,\"..\"] $c1 $c2 ( elementOptions )? ) ;
    public final ANTLRv3Parser.range_return range() throws RecognitionException {
        ANTLRv3Parser.range_return retval = new ANTLRv3Parser.range_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token c1=null;
        Token c2=null;
        Token RANGE133=null;
        ANTLRv3Parser.elementOptions_return elementOptions134 = null;


        CommonTree c1_tree=null;
        CommonTree c2_tree=null;
        CommonTree RANGE133_tree=null;
        RewriteRuleTokenStream stream_RANGE=new RewriteRuleTokenStream(adaptor,"token RANGE");
        RewriteRuleTokenStream stream_CHAR_LITERAL=new RewriteRuleTokenStream(adaptor,"token CHAR_LITERAL");
        RewriteRuleSubtreeStream stream_elementOptions=new RewriteRuleSubtreeStream(adaptor,"rule elementOptions");
        try {
            // org/antlr/grammar/v3/ANTLRv3.g:297:2: (c1= CHAR_LITERAL RANGE c2= CHAR_LITERAL ( elementOptions )? -> ^( CHAR_RANGE[$c1,\"..\"] $c1 $c2 ( elementOptions )? ) )
            // org/antlr/grammar/v3/ANTLRv3.g:297:4: c1= CHAR_LITERAL RANGE c2= CHAR_LITERAL ( elementOptions )?
            {
            c1=(Token)match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_range2159); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CHAR_LITERAL.add(c1);

            RANGE133=(Token)match(input,RANGE,FOLLOW_RANGE_in_range2161); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RANGE.add(RANGE133);

            c2=(Token)match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_range2165); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CHAR_LITERAL.add(c2);

            // org/antlr/grammar/v3/ANTLRv3.g:297:42: ( elementOptions )?
            int alt61=2;
            switch ( input.LA(1) ) {
                case 88:
                    {
                    alt61=1;
                    }
                    break;
            }

            switch (alt61) {
                case 1 :
                    // org/antlr/grammar/v3/ANTLRv3.g:297:42: elementOptions
                    {
                    pushFollow(FOLLOW_elementOptions_in_range2167);
                    elementOptions134=elementOptions();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_elementOptions.add(elementOptions134.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: c2, c1, elementOptions
            // token labels: c1, c2
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleTokenStream stream_c1=new RewriteRuleTokenStream(adaptor,"token c1",c1);
            RewriteRuleTokenStream stream_c2=new RewriteRuleTokenStream(adaptor,"token c2",c2);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 298:3: -> ^( CHAR_RANGE[$c1,\"..\"] $c1 $c2 ( elementOptions )? )
            {
                // org/antlr/grammar/v3/ANTLRv3.g:298:6: ^( CHAR_RANGE[$c1,\"..\"] $c1 $c2 ( elementOptions )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CHAR_RANGE, c1, ".."), root_1);

                adaptor.addChild(root_1, stream_c1.nextNode());
                adaptor.addChild(root_1, stream_c2.nextNode());
                // org/antlr/grammar/v3/ANTLRv3.g:298:37: ( elementOptions )?
                if ( stream_elementOptions.hasNext() ) {
                    adaptor.addChild(root_1, stream_elementOptions.nextTree());

                }
                stream_elementOptions.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "range"

    public static class terminal_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "terminal"
    // org/antlr/grammar/v3/ANTLRv3.g:301:1: terminal : ( CHAR_LITERAL ( elementOptions )? -> ^( CHAR_LITERAL ( elementOptions )? ) | TOKEN_REF ( ARG_ACTION )? ( elementOptions )? -> ^( TOKEN_REF ( ARG_ACTION )? ( elementOptions )? ) | STRING_LITERAL ( elementOptions )? -> ^( STRING_LITERAL ( elementOptions )? ) | '.' ( elementOptions )? -> ^( '.' ( elementOptions )? ) ) ( '^' -> ^( '^' $terminal) | '!' -> ^( '!' $terminal) )? ;
    public final ANTLRv3Parser.terminal_return terminal() throws RecognitionException {
        ANTLRv3Parser.terminal_return retval = new ANTLRv3Parser.terminal_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token CHAR_LITERAL135=null;
        Token TOKEN_REF137=null;
        Token ARG_ACTION138=null;
        Token STRING_LITERAL140=null;
        Token char_literal142=null;
        Token char_literal144=null;
        Token char_literal145=null;
        ANTLRv3Parser.elementOptions_return elementOptions136 = null;

        ANTLRv3Parser.elementOptions_return elementOptions139 = null;

        ANTLRv3Parser.elementOptions_return elementOptions141 = null;

        ANTLRv3Parser.elementOptions_return elementOptions143 = null;


        CommonTree CHAR_LITERAL135_tree=null;
        CommonTree TOKEN_REF137_tree=null;
        CommonTree ARG_ACTION138_tree=null;
        CommonTree STRING_LITERAL140_tree=null;
        CommonTree char_literal142_tree=null;
        CommonTree char_literal144_tree=null;
        CommonTree char_literal145_tree=null;
        RewriteRuleTokenStream stream_STRING_LITERAL=new RewriteRuleTokenStream(adaptor,"token STRING_LITERAL");
        RewriteRuleTokenStream stream_BANG=new RewriteRuleTokenStream(adaptor,"token BANG");
        RewriteRuleTokenStream stream_CHAR_LITERAL=new RewriteRuleTokenStream(adaptor,"token CHAR_LITERAL");
        RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
        RewriteRuleTokenStream stream_ROOT=new RewriteRuleTokenStream(adaptor,"token ROOT");
        RewriteRuleTokenStream stream_TOKEN_REF=new RewriteRuleTokenStream(adaptor,"token TOKEN_REF");
        RewriteRuleTokenStream stream_ARG_ACTION=new RewriteRuleTokenStream(adaptor,"token ARG_ACTION");
        RewriteRuleSubtreeStream stream_elementOptions=new RewriteRuleSubtreeStream(adaptor,"rule elementOptions");
        try {
            // org/antlr/grammar/v3/ANTLRv3.g:302:5: ( ( CHAR_LITERAL ( elementOptions )? -> ^( CHAR_LITERAL ( elementOptions )? ) | TOKEN_REF ( ARG_ACTION )? ( elementOptions )? -> ^( TOKEN_REF ( ARG_ACTION )? ( elementOptions )? ) | STRING_LITERAL ( elementOptions )? -> ^( STRING_LITERAL ( elementOptions )? ) | '.' ( elementOptions )? -> ^( '.' ( elementOptions )? ) ) ( '^' -> ^( '^' $terminal) | '!' -> ^( '!' $terminal) )? )
            // org/antlr/grammar/v3/ANTLRv3.g:302:9: ( CHAR_LITERAL ( elementOptions )? -> ^( CHAR_LITERAL ( elementOptions )? ) | TOKEN_REF ( ARG_ACTION )? ( elementOptions )? -> ^( TOKEN_REF ( ARG_ACTION )? ( elementOptions )? ) | STRING_LITERAL ( elementOptions )? -> ^( STRING_LITERAL ( elementOptions )? ) | '.' ( elementOptions )? -> ^( '.' ( elementOptions )? ) ) ( '^' -> ^( '^' $terminal) | '!' -> ^( '!' $terminal) )?
            {
            // org/antlr/grammar/v3/ANTLRv3.g:302:9: ( CHAR_LITERAL ( elementOptions )? -> ^( CHAR_LITERAL ( elementOptions )? ) | TOKEN_REF ( ARG_ACTION )? ( elementOptions )? -> ^( TOKEN_REF ( ARG_ACTION )? ( elementOptions )? ) | STRING_LITERAL ( elementOptions )? -> ^( STRING_LITERAL ( elementOptions )? ) | '.' ( elementOptions )? -> ^( '.' ( elementOptions )? ) )
            int alt67=4;
            switch ( input.LA(1) ) {
            case CHAR_LITERAL:
                {
                alt67=1;
                }
                break;
            case TOKEN_REF:
                {
                alt67=2;
                }
                break;
            case STRING_LITERAL:
                {
                alt67=3;
                }
                break;
            case 90:
                {
                alt67=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }

            switch (alt67) {
                case 1 :
                    // org/antlr/grammar/v3/ANTLRv3.g:302:11: CHAR_LITERAL ( elementOptions )?
                    {
                    CHAR_LITERAL135=(Token)match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_terminal2204); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CHAR_LITERAL.add(CHAR_LITERAL135);

                    // org/antlr/grammar/v3/ANTLRv3.g:302:24: ( elementOptions )?
                    int alt62=2;
                    switch ( input.LA(1) ) {
                        case 88:
                            {
                            alt62=1;
                            }
                            break;
                    }

                    switch (alt62) {
                        case 1 :
                            // org/antlr/grammar/v3/ANTLRv3.g:302:24: elementOptions
                            {
                            pushFollow(FOLLOW_elementOptions_in_terminal2206);
                            elementOptions136=elementOptions();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_elementOptions.add(elementOptions136.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: CHAR_LITERAL, elementOptions
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 302:46: -> ^( CHAR_LITERAL ( elementOptions )? )
                    {
                        // org/antlr/grammar/v3/ANTLRv3.g:302:49: ^( CHAR_LITERAL ( elementOptions )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_CHAR_LITERAL.nextNode(), root_1);

                        // org/antlr/grammar/v3/ANTLRv3.g:302:64: ( elementOptions )?
                        if ( stream_elementOptions.hasNext() ) {
                            adaptor.addChild(root_1, stream_elementOptions.nextTree());

                        }
                        stream_elementOptions.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // org/antlr/grammar/v3/ANTLRv3.g:304:7: TOKEN_REF ( ARG_ACTION )? ( elementOptions )?
                    {
                    TOKEN_REF137=(Token)match(input,TOKEN_REF,FOLLOW_TOKEN_REF_in_terminal2237); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TOKEN_REF.add(TOKEN_REF137);

                    // org/antlr/grammar/v3/ANTLRv3.g:304:17: ( ARG_ACTION )?
                    int alt63=2;
                    switch ( input.LA(1) ) {
                        case ARG_ACTION:
                            {
                            alt63=1;
                            }
                            break;
                    }

                    switch (alt63) {
                        case 1 :
                            // org/antlr/grammar/v3/ANTLRv3.g:304:17: ARG_ACTION
                            {
                            ARG_ACTION138=(Token)match(input,ARG_ACTION,FOLLOW_ARG_ACTION_in_terminal2239); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ARG_ACTION.add(ARG_ACTION138);


                            }
                            break;

                    }

                    // org/antlr/grammar/v3/ANTLRv3.g:304:29: ( elementOptions )?
                    int alt64=2;
                    switch ( input.LA(1) ) {
                        case 88:
                            {
                            alt64=1;
                            }
                            break;
                    }

                    switch (alt64) {
                        case 1 :
                            // org/antlr/grammar/v3/ANTLRv3.g:304:29: elementOptions
                            {
                            pushFollow(FOLLOW_elementOptions_in_terminal2242);
                            elementOptions139=elementOptions();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_elementOptions.add(elementOptions139.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: elementOptions, TOKEN_REF, ARG_ACTION
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 304:45: -> ^( TOKEN_REF ( ARG_ACTION )? ( elementOptions )? )
                    {
                        // org/antlr/grammar/v3/ANTLRv3.g:304:48: ^( TOKEN_REF ( ARG_ACTION )? ( elementOptions )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_TOKEN_REF.nextNode(), root_1);

                        // org/antlr/grammar/v3/ANTLRv3.g:304:60: ( ARG_ACTION )?
                        if ( stream_ARG_ACTION.hasNext() ) {
                            adaptor.addChild(root_1, stream_ARG_ACTION.nextNode());

                        }
                        stream_ARG_ACTION.reset();
                        // org/antlr/grammar/v3/ANTLRv3.g:304:72: ( elementOptions )?
                        if ( stream_elementOptions.hasNext() ) {
                            adaptor.addChild(root_1, stream_elementOptions.nextTree());

                        }
                        stream_elementOptions.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // org/antlr/grammar/v3/ANTLRv3.g:305:7: STRING_LITERAL ( elementOptions )?
                    {
                    STRING_LITERAL140=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_terminal2263); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STRING_LITERAL.add(STRING_LITERAL140);

                    // org/antlr/grammar/v3/ANTLRv3.g:305:22: ( elementOptions )?
                    int alt65=2;
                    switch ( input.LA(1) ) {
                        case 88:
                            {
                            alt65=1;
                            }
                            break;
                    }

                    switch (alt65) {
                        case 1 :
                            // org/antlr/grammar/v3/ANTLRv3.g:305:22: elementOptions
                            {
                            pushFollow(FOLLOW_elementOptions_in_terminal2265);
                            elementOptions141=elementOptions();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_elementOptions.add(elementOptions141.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: elementOptions, STRING_LITERAL
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 305:41: -> ^( STRING_LITERAL ( elementOptions )? )
                    {
                        // org/antlr/grammar/v3/ANTLRv3.g:305:44: ^( STRING_LITERAL ( elementOptions )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_STRING_LITERAL.nextNode(), root_1);

                        // org/antlr/grammar/v3/ANTLRv3.g:305:61: ( elementOptions )?
                        if ( stream_elementOptions.hasNext() ) {
                            adaptor.addChild(root_1, stream_elementOptions.nextTree());

                        }
                        stream_elementOptions.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // org/antlr/grammar/v3/ANTLRv3.g:306:7: '.' ( elementOptions )?
                    {
                    char_literal142=(Token)match(input,90,FOLLOW_90_in_terminal2286); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_90.add(char_literal142);

                    // org/antlr/grammar/v3/ANTLRv3.g:306:11: ( elementOptions )?
                    int alt66=2;
                    switch ( input.LA(1) ) {
                        case 88:
                            {
                            alt66=1;
                            }
                            break;
                    }

                    switch (alt66) {
                        case 1 :
                            // org/antlr/grammar/v3/ANTLRv3.g:306:11: elementOptions
                            {
                            pushFollow(FOLLOW_elementOptions_in_terminal2288);
                            elementOptions143=elementOptions();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_elementOptions.add(elementOptions143.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: elementOptions, 90
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 306:34: -> ^( '.' ( elementOptions )? )
                    {
                        // org/antlr/grammar/v3/ANTLRv3.g:306:37: ^( '.' ( elementOptions )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_90.nextNode(), root_1);

                        // org/antlr/grammar/v3/ANTLRv3.g:306:43: ( elementOptions )?
                        if ( stream_elementOptions.hasNext() ) {
                            adaptor.addChild(root_1, stream_elementOptions.nextTree());

                        }
                        stream_elementOptions.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }

            // org/antlr/grammar/v3/ANTLRv3.g:308:3: ( '^' -> ^( '^' $terminal) | '!' -> ^( '!' $terminal) )?
            int alt68=3;
            switch ( input.LA(1) ) {
                case ROOT:
                    {
                    alt68=1;
                    }
                    break;
                case BANG:
                    {
                    alt68=2;
                    }
                    break;
            }

            switch (alt68) {
                case 1 :
                    // org/antlr/grammar/v3/ANTLRv3.g:308:5: '^'
                    {
                    char_literal144=(Token)match(input,ROOT,FOLLOW_ROOT_in_terminal2315); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ROOT.add(char_literal144);



                    // AST REWRITE
                    // elements: terminal, ROOT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 308:15: -> ^( '^' $terminal)
                    {
                        // org/antlr/grammar/v3/ANTLRv3.g:308:18: ^( '^' $terminal)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_ROOT.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_retval.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // org/antlr/grammar/v3/ANTLRv3.g:309:5: '!'
                    {
                    char_literal145=(Token)match(input,BANG,FOLLOW_BANG_in_terminal2336); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BANG.add(char_literal145);



                    // AST REWRITE
                    // elements: BANG, terminal
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 309:15: -> ^( '!' $terminal)
                    {
                        // org/antlr/grammar/v3/ANTLRv3.g:309:18: ^( '!' $terminal)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_BANG.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_retval.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "terminal"

    public static class ebnf_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ebnf"
    // org/antlr/grammar/v3/ANTLRv3.g:313:1: ebnf : block (op= '?' -> ^( OPTIONAL[op] block ) | op= '*' -> ^( CLOSURE[op] block ) | op= '+' -> ^( POSITIVE_CLOSURE[op] block ) | '=>' -> {gtype==COMBINED_GRAMMAR &&\n\t\t\t\t\t Character.isUpperCase($rule::name.charAt(0))}? ^( SYNPRED[\"=>\"] block ) -> SYN_SEMPRED | -> block ) ;
    public final ANTLRv3Parser.ebnf_return ebnf() throws RecognitionException {
        ANTLRv3Parser.ebnf_return retval = new ANTLRv3Parser.ebnf_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token op=null;
        Token string_literal147=null;
        ANTLRv3Parser.block_return block146 = null;


        CommonTree op_tree=null;
        CommonTree string_literal147_tree=null;
        RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
        RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
        RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

            Token firstToken = input.LT(1);

        try {
            // org/antlr/grammar/v3/ANTLRv3.g:322:2: ( block (op= '?' -> ^( OPTIONAL[op] block ) | op= '*' -> ^( CLOSURE[op] block ) | op= '+' -> ^( POSITIVE_CLOSURE[op] block ) | '=>' -> {gtype==COMBINED_GRAMMAR &&\n\t\t\t\t\t Character.isUpperCase($rule::name.charAt(0))}? ^( SYNPRED[\"=>\"] block ) -> SYN_SEMPRED | -> block ) )
            // org/antlr/grammar/v3/ANTLRv3.g:322:4: block (op= '?' -> ^( OPTIONAL[op] block ) | op= '*' -> ^( CLOSURE[op] block ) | op= '+' -> ^( POSITIVE_CLOSURE[op] block ) | '=>' -> {gtype==COMBINED_GRAMMAR &&\n\t\t\t\t\t Character.isUpperCase($rule::name.charAt(0))}? ^( SYNPRED[\"=>\"] block ) -> SYN_SEMPRED | -> block )
            {
            pushFollow(FOLLOW_block_in_ebnf2379);
            block146=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block146.getTree());
            // org/antlr/grammar/v3/ANTLRv3.g:323:3: (op= '?' -> ^( OPTIONAL[op] block ) | op= '*' -> ^( CLOSURE[op] block ) | op= '+' -> ^( POSITIVE_CLOSURE[op] block ) | '=>' -> {gtype==COMBINED_GRAMMAR &&\n\t\t\t\t\t Character.isUpperCase($rule::name.charAt(0))}? ^( SYNPRED[\"=>\"] block ) -> SYN_SEMPRED | -> block )
            int alt69=5;
            switch ( input.LA(1) ) {
            case 91:
                {
                alt69=1;
                }
                break;
            case 74:
                {
                alt69=2;
                }
                break;
            case 92:
                {
                alt69=3;
                }
                break;
            case 86:
                {
                alt69=4;
                }
                break;
            case SEMPRED:
            case TREE_BEGIN:
            case REWRITE:
            case TOKEN_REF:
            case STRING_LITERAL:
            case CHAR_LITERAL:
            case ACTION:
            case RULE_REF:
            case 71:
            case 81:
            case 82:
            case 83:
            case 87:
            case 90:
                {
                alt69=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }

            switch (alt69) {
                case 1 :
                    // org/antlr/grammar/v3/ANTLRv3.g:323:5: op= '?'
                    {
                    op=(Token)match(input,91,FOLLOW_91_in_ebnf2387); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_91.add(op);



                    // AST REWRITE
                    // elements: block
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 323:12: -> ^( OPTIONAL[op] block )
                    {
                        // org/antlr/grammar/v3/ANTLRv3.g:323:15: ^( OPTIONAL[op] block )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OPTIONAL, op), root_1);

                        adaptor.addChild(root_1, stream_block.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // org/antlr/grammar/v3/ANTLRv3.g:324:5: op= '*'
                    {
                    op=(Token)match(input,74,FOLLOW_74_in_ebnf2404); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_74.add(op);



                    // AST REWRITE
                    // elements: block
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 324:12: -> ^( CLOSURE[op] block )
                    {
                        // org/antlr/grammar/v3/ANTLRv3.g:324:15: ^( CLOSURE[op] block )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CLOSURE, op), root_1);

                        adaptor.addChild(root_1, stream_block.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // org/antlr/grammar/v3/ANTLRv3.g:325:5: op= '+'
                    {
                    op=(Token)match(input,92,FOLLOW_92_in_ebnf2421); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_92.add(op);



                    // AST REWRITE
                    // elements: block
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 325:12: -> ^( POSITIVE_CLOSURE[op] block )
                    {
                        // org/antlr/grammar/v3/ANTLRv3.g:325:15: ^( POSITIVE_CLOSURE[op] block )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(POSITIVE_CLOSURE, op), root_1);

                        adaptor.addChild(root_1, stream_block.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // org/antlr/grammar/v3/ANTLRv3.g:326:7: '=>'
                    {
                    string_literal147=(Token)match(input,86,FOLLOW_86_in_ebnf2438); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_86.add(string_literal147);



                    // AST REWRITE
                    // elements: block
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 327:6: -> {gtype==COMBINED_GRAMMAR &&\n\t\t\t\t\t Character.isUpperCase($rule::name.charAt(0))}? ^( SYNPRED[\"=>\"] block )
                    if (gtype==COMBINED_GRAMMAR &&
                    					    Character.isUpperCase(((rule_scope)rule_stack.peek()).name.charAt(0))) {
                        // org/antlr/grammar/v3/ANTLRv3.g:330:9: ^( SYNPRED[\"=>\"] block )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SYNPRED, "=>"), root_1);

                        adaptor.addChild(root_1, stream_block.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }
                    else // 332:6: -> SYN_SEMPRED
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SYN_SEMPRED, "SYN_SEMPRED"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // org/antlr/grammar/v3/ANTLRv3.g:333:13: 
                    {

                    // AST REWRITE
                    // elements: block
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 333:13: -> block
                    {
                        adaptor.addChild(root_0, stream_block.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {

              	((CommonTree)retval.tree).getToken().setLine(firstToken.getLine());
              	((CommonTree)retval.tree).getToken().setCharPositionInLine(firstToken.getCharPositionInLine());

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "ebnf"

    public static class ebnfSuffix_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ebnfSuffix"
    // org/antlr/grammar/v3/ANTLRv3.g:337:1: ebnfSuffix : ( '?' -> OPTIONAL[op] | '*' -> CLOSURE[op] | '+' -> POSITIVE_CLOSURE[op] );
    public final ANTLRv3Parser.ebnfSuffix_return ebnfSuffix() throws RecognitionException {
        ANTLRv3Parser.ebnfSuffix_return retval = new ANTLRv3Parser.ebnfSuffix_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal148=null;
        Token char_literal149=null;
        Token char_literal150=null;

        CommonTree char_literal148_tree=null;
        CommonTree char_literal149_tree=null;
        CommonTree char_literal150_tree=null;
        RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
        RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");


        	Token op = input.LT(1);

        try {
            // org/antlr/grammar/v3/ANTLRv3.g:341:2: ( '?' -> OPTIONAL[op] | '*' -> CLOSURE[op] | '+' -> POSITIVE_CLOSURE[op] )
            int alt70=3;
            switch ( input.LA(1) ) {
            case 91:
                {
                alt70=1;
                }
                break;
            case 74:
                {
                alt70=2;
                }
                break;
            case 92:
                {
                alt70=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }

            switch (alt70) {
                case 1 :
                    // org/antlr/grammar/v3/ANTLRv3.g:341:4: '?'
                    {
                    char_literal148=(Token)match(input,91,FOLLOW_91_in_ebnfSuffix2523); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_91.add(char_literal148);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 341:8: -> OPTIONAL[op]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(OPTIONAL, op));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // org/antlr/grammar/v3/ANTLRv3.g:342:6: '*'
                    {
                    char_literal149=(Token)match(input,74,FOLLOW_74_in_ebnfSuffix2535); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_74.add(char_literal149);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 342:10: -> CLOSURE[op]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(CLOSURE, op));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // org/antlr/grammar/v3/ANTLRv3.g:343:7: '+'
                    {
                    char_literal150=(Token)match(input,92,FOLLOW_92_in_ebnfSuffix2548); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_92.add(char_literal150);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 343:11: -> POSITIVE_CLOSURE[op]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(POSITIVE_CLOSURE, op));

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "ebnfSuffix"

    public static class rewrite_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rewrite"
    // org/antlr/grammar/v3/ANTLRv3.g:350:1: rewrite : ( (rew+= '->' preds+= SEMPRED predicated+= rewrite_alternative )* rew2= '->' last= rewrite_alternative -> ( ^( $rew $preds $predicated) )* ^( $rew2 $last) | );
    public final ANTLRv3Parser.rewrite_return rewrite() throws RecognitionException {
        ANTLRv3Parser.rewrite_return retval = new ANTLRv3Parser.rewrite_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token rew2=null;
        Token rew=null;
        Token preds=null;
        List list_rew=null;
        List list_preds=null;
        List list_predicated=null;
        ANTLRv3Parser.rewrite_alternative_return last = null;

        RuleReturnScope predicated = null;
        CommonTree rew2_tree=null;
        CommonTree rew_tree=null;
        CommonTree preds_tree=null;
        RewriteRuleTokenStream stream_SEMPRED=new RewriteRuleTokenStream(adaptor,"token SEMPRED");
        RewriteRuleTokenStream stream_REWRITE=new RewriteRuleTokenStream(adaptor,"token REWRITE");
        RewriteRuleSubtreeStream stream_rewrite_alternative=new RewriteRuleSubtreeStream(adaptor,"rule rewrite_alternative");

        	Token firstToken = input.LT(1);

        try {
            // org/antlr/grammar/v3/ANTLRv3.g:354:2: ( (rew+= '->' preds+= SEMPRED predicated+= rewrite_alternative )* rew2= '->' last= rewrite_alternative -> ( ^( $rew $preds $predicated) )* ^( $rew2 $last) | )
            int alt72=2;
            switch ( input.LA(1) ) {
            case REWRITE:
                {
                alt72=1;
                }
                break;
            case 71:
            case 82:
            case 83:
                {
                alt72=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }

            switch (alt72) {
                case 1 :
                    // org/antlr/grammar/v3/ANTLRv3.g:354:4: (rew+= '->' preds+= SEMPRED predicated+= rewrite_alternative )* rew2= '->' last= rewrite_alternative
                    {
                    // org/antlr/grammar/v3/ANTLRv3.g:354:4: (rew+= '->' preds+= SEMPRED predicated+= rewrite_alternative )*
                    loop71:
                    do {
                        int alt71=2;
                        switch ( input.LA(1) ) {
                        case REWRITE:
                            {
                            switch ( input.LA(2) ) {
                            case SEMPRED:
                                {
                                alt71=1;
                                }
                                break;

                            }

                            }
                            break;

                        }

                        switch (alt71) {
                    	case 1 :
                    	    // org/antlr/grammar/v3/ANTLRv3.g:354:5: rew+= '->' preds+= SEMPRED predicated+= rewrite_alternative
                    	    {
                    	    rew=(Token)match(input,REWRITE,FOLLOW_REWRITE_in_rewrite2577); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_REWRITE.add(rew);

                    	    if (list_rew==null) list_rew=new ArrayList();
                    	    list_rew.add(rew);

                    	    preds=(Token)match(input,SEMPRED,FOLLOW_SEMPRED_in_rewrite2581); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_SEMPRED.add(preds);

                    	    if (list_preds==null) list_preds=new ArrayList();
                    	    list_preds.add(preds);

                    	    pushFollow(FOLLOW_rewrite_alternative_in_rewrite2585);
                    	    predicated=rewrite_alternative();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_rewrite_alternative.add(predicated.getTree());
                    	    if (list_predicated==null) list_predicated=new ArrayList();
                    	    list_predicated.add(predicated.getTree());


                    	    }
                    	    break;

                    	default :
                    	    break loop71;
                        }
                    } while (true);

                    rew2=(Token)match(input,REWRITE,FOLLOW_REWRITE_in_rewrite2593); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_REWRITE.add(rew2);

                    pushFollow(FOLLOW_rewrite_alternative_in_rewrite2597);
                    last=rewrite_alternative();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_rewrite_alternative.add(last.getTree());


                    // AST REWRITE
                    // elements: predicated, rew, last, rew2, preds
                    // token labels: rew2
                    // rule labels: retval, last
                    // token list labels: rew, preds
                    // rule list labels: predicated
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_rew2=new RewriteRuleTokenStream(adaptor,"token rew2",rew2);
                    RewriteRuleTokenStream stream_rew=new RewriteRuleTokenStream(adaptor,"token rew", list_rew);
                    RewriteRuleTokenStream stream_preds=new RewriteRuleTokenStream(adaptor,"token preds", list_preds);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_last=new RewriteRuleSubtreeStream(adaptor,"rule last",last!=null?last.tree:null);
                    RewriteRuleSubtreeStream stream_predicated=new RewriteRuleSubtreeStream(adaptor,"token predicated",list_predicated);
                    root_0 = (CommonTree)adaptor.nil();
                    // 356:9: -> ( ^( $rew $preds $predicated) )* ^( $rew2 $last)
                    {
                        // org/antlr/grammar/v3/ANTLRv3.g:356:12: ( ^( $rew $preds $predicated) )*
                        while ( stream_predicated.hasNext()||stream_rew.hasNext()||stream_preds.hasNext() ) {
                            // org/antlr/grammar/v3/ANTLRv3.g:356:12: ^( $rew $preds $predicated)
                            {
                            CommonTree root_1 = (CommonTree)adaptor.nil();
                            root_1 = (CommonTree)adaptor.becomeRoot(stream_rew.nextNode(), root_1);

                            adaptor.addChild(root_1, stream_preds.nextNode());
                            adaptor.addChild(root_1, stream_predicated.nextTree());

                            adaptor.addChild(root_0, root_1);
                            }

                        }
                        stream_predicated.reset();
                        stream_rew.reset();
                        stream_preds.reset();
                        // org/antlr/grammar/v3/ANTLRv3.g:356:40: ^( $rew2 $last)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_rew2.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_last.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // org/antlr/grammar/v3/ANTLRv3.g:358:2: 
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "rewrite"

    public static class rewrite_alternative_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rewrite_alternative"
    // org/antlr/grammar/v3/ANTLRv3.g:360:1: rewrite_alternative options {backtrack=true; } : ( rewrite_template | rewrite_tree_alternative | -> ^( ALT[\"ALT\"] EPSILON[\"EPSILON\"] EOA[\"EOA\"] ) );
    public final ANTLRv3Parser.rewrite_alternative_return rewrite_alternative() throws RecognitionException {
        ANTLRv3Parser.rewrite_alternative_return retval = new ANTLRv3Parser.rewrite_alternative_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        ANTLRv3Parser.rewrite_template_return rewrite_template151 = null;

        ANTLRv3Parser.rewrite_tree_alternative_return rewrite_tree_alternative152 = null;



        try {
            // org/antlr/grammar/v3/ANTLRv3.g:362:2: ( rewrite_template | rewrite_tree_alternative | -> ^( ALT[\"ALT\"] EPSILON[\"EPSILON\"] EOA[\"EOA\"] ) )
            int alt73=3;
            alt73 = dfa73.predict(input);
            switch (alt73) {
                case 1 :
                    // org/antlr/grammar/v3/ANTLRv3.g:362:4: rewrite_template
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_rewrite_template_in_rewrite_alternative2648);
                    rewrite_template151=rewrite_template();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rewrite_template151.getTree());

                    }
                    break;
                case 2 :
                    // org/antlr/grammar/v3/ANTLRv3.g:363:4: rewrite_tree_alternative
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_rewrite_tree_alternative_in_rewrite_alternative2653);
                    rewrite_tree_alternative152=rewrite_tree_alternative();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rewrite_tree_alternative152.getTree());

                    }
                    break;
                case 3 :
                    // org/antlr/grammar/v3/ANTLRv3.g:364:29: 
                    {

                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 364:29: -> ^( ALT[\"ALT\"] EPSILON[\"EPSILON\"] EOA[\"EOA\"] )
                    {
                        // org/antlr/grammar/v3/ANTLRv3.g:364:32: ^( ALT[\"ALT\"] EPSILON[\"EPSILON\"] EOA[\"EOA\"] )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ALT, "ALT"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(EPSILON, "EPSILON"));
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(EOA, "EOA"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "rewrite_alternative"

    public static class rewrite_tree_block_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rewrite_tree_block"
    // org/antlr/grammar/v3/ANTLRv3.g:367:1: rewrite_tree_block : lp= '(' rewrite_tree_alternative ')' -> ^( BLOCK[$lp,\"BLOCK\"] rewrite_tree_alternative EOB[$lp,\"EOB\"] ) ;
    public final ANTLRv3Parser.rewrite_tree_block_return rewrite_tree_block() throws RecognitionException {
        ANTLRv3Parser.rewrite_tree_block_return retval = new ANTLRv3Parser.rewrite_tree_block_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token lp=null;
        Token char_literal154=null;
        ANTLRv3Parser.rewrite_tree_alternative_return rewrite_tree_alternative153 = null;


        CommonTree lp_tree=null;
        CommonTree char_literal154_tree=null;
        RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
        RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
        RewriteRuleSubtreeStream stream_rewrite_tree_alternative=new RewriteRuleSubtreeStream(adaptor,"rule rewrite_tree_alternative");
        try {
            // org/antlr/grammar/v3/ANTLRv3.g:368:5: (lp= '(' rewrite_tree_alternative ')' -> ^( BLOCK[$lp,\"BLOCK\"] rewrite_tree_alternative EOB[$lp,\"EOB\"] ) )
            // org/antlr/grammar/v3/ANTLRv3.g:368:9: lp= '(' rewrite_tree_alternative ')'
            {
            lp=(Token)match(input,81,FOLLOW_81_in_rewrite_tree_block2695); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_81.add(lp);

            pushFollow(FOLLOW_rewrite_tree_alternative_in_rewrite_tree_block2697);
            rewrite_tree_alternative153=rewrite_tree_alternative();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_rewrite_tree_alternative.add(rewrite_tree_alternative153.getTree());
            char_literal154=(Token)match(input,83,FOLLOW_83_in_rewrite_tree_block2699); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_83.add(char_literal154);



            // AST REWRITE
            // elements: rewrite_tree_alternative
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 369:6: -> ^( BLOCK[$lp,\"BLOCK\"] rewrite_tree_alternative EOB[$lp,\"EOB\"] )
            {
                // org/antlr/grammar/v3/ANTLRv3.g:369:9: ^( BLOCK[$lp,\"BLOCK\"] rewrite_tree_alternative EOB[$lp,\"EOB\"] )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, lp, "BLOCK"), root_1);

                adaptor.addChild(root_1, stream_rewrite_tree_alternative.nextTree());
                adaptor.addChild(root_1, (CommonTree)adaptor.create(EOB, lp, "EOB"));

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "rewrite_tree_block"

    public static class rewrite_tree_alternative_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rewrite_tree_alternative"
    // org/antlr/grammar/v3/ANTLRv3.g:372:1: rewrite_tree_alternative : ( rewrite_tree_element )+ -> ^( ALT[\"ALT\"] ( rewrite_tree_element )+ EOA[\"EOA\"] ) ;
    public final ANTLRv3Parser.rewrite_tree_alternative_return rewrite_tree_alternative() throws RecognitionException {
        ANTLRv3Parser.rewrite_tree_alternative_return retval = new ANTLRv3Parser.rewrite_tree_alternative_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        ANTLRv3Parser.rewrite_tree_element_return rewrite_tree_element155 = null;


        RewriteRuleSubtreeStream stream_rewrite_tree_element=new RewriteRuleSubtreeStream(adaptor,"rule rewrite_tree_element");
        try {
            // org/antlr/grammar/v3/ANTLRv3.g:373:5: ( ( rewrite_tree_element )+ -> ^( ALT[\"ALT\"] ( rewrite_tree_element )+ EOA[\"EOA\"] ) )
            // org/antlr/grammar/v3/ANTLRv3.g:373:7: ( rewrite_tree_element )+
            {
            // org/antlr/grammar/v3/ANTLRv3.g:373:7: ( rewrite_tree_element )+
            int cnt74=0;
            loop74:
            do {
                int alt74=2;
                switch ( input.LA(1) ) {
                case TREE_BEGIN:
                case TOKEN_REF:
                case STRING_LITERAL:
                case CHAR_LITERAL:
                case ACTION:
                case RULE_REF:
                case 81:
                case 93:
                    {
                    alt74=1;
                    }
                    break;

                }

                switch (alt74) {
            	case 1 :
            	    // org/antlr/grammar/v3/ANTLRv3.g:373:7: rewrite_tree_element
            	    {
            	    pushFollow(FOLLOW_rewrite_tree_element_in_rewrite_tree_alternative2733);
            	    rewrite_tree_element155=rewrite_tree_element();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_rewrite_tree_element.add(rewrite_tree_element155.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt74 >= 1 ) break loop74;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(74, input);
                        throw eee;
                }
                cnt74++;
            } while (true);



            // AST REWRITE
            // elements: rewrite_tree_element
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 373:29: -> ^( ALT[\"ALT\"] ( rewrite_tree_element )+ EOA[\"EOA\"] )
            {
                // org/antlr/grammar/v3/ANTLRv3.g:373:32: ^( ALT[\"ALT\"] ( rewrite_tree_element )+ EOA[\"EOA\"] )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ALT, "ALT"), root_1);

                if ( !(stream_rewrite_tree_element.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_rewrite_tree_element.hasNext() ) {
                    adaptor.addChild(root_1, stream_rewrite_tree_element.nextTree());

                }
                stream_rewrite_tree_element.reset();
                adaptor.addChild(root_1, (CommonTree)adaptor.create(EOA, "EOA"));

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "rewrite_tree_alternative"

    public static class rewrite_tree_element_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rewrite_tree_element"
    // org/antlr/grammar/v3/ANTLRv3.g:376:1: rewrite_tree_element : ( rewrite_tree_atom | rewrite_tree_atom ebnfSuffix -> ^( ebnfSuffix ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] rewrite_tree_atom EOA[\"EOA\"] ) EOB[\"EOB\"] ) ) | rewrite_tree ( ebnfSuffix -> ^( ebnfSuffix ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] rewrite_tree EOA[\"EOA\"] ) EOB[\"EOB\"] ) ) | -> rewrite_tree ) | rewrite_tree_ebnf );
    public final ANTLRv3Parser.rewrite_tree_element_return rewrite_tree_element() throws RecognitionException {
        ANTLRv3Parser.rewrite_tree_element_return retval = new ANTLRv3Parser.rewrite_tree_element_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        ANTLRv3Parser.rewrite_tree_atom_return rewrite_tree_atom156 = null;

        ANTLRv3Parser.rewrite_tree_atom_return rewrite_tree_atom157 = null;

        ANTLRv3Parser.ebnfSuffix_return ebnfSuffix158 = null;

        ANTLRv3Parser.rewrite_tree_return rewrite_tree159 = null;

        ANTLRv3Parser.ebnfSuffix_return ebnfSuffix160 = null;

        ANTLRv3Parser.rewrite_tree_ebnf_return rewrite_tree_ebnf161 = null;


        RewriteRuleSubtreeStream stream_rewrite_tree=new RewriteRuleSubtreeStream(adaptor,"rule rewrite_tree");
        RewriteRuleSubtreeStream stream_ebnfSuffix=new RewriteRuleSubtreeStream(adaptor,"rule ebnfSuffix");
        RewriteRuleSubtreeStream stream_rewrite_tree_atom=new RewriteRuleSubtreeStream(adaptor,"rule rewrite_tree_atom");
        try {
            // org/antlr/grammar/v3/ANTLRv3.g:377:2: ( rewrite_tree_atom | rewrite_tree_atom ebnfSuffix -> ^( ebnfSuffix ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] rewrite_tree_atom EOA[\"EOA\"] ) EOB[\"EOB\"] ) ) | rewrite_tree ( ebnfSuffix -> ^( ebnfSuffix ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] rewrite_tree EOA[\"EOA\"] ) EOB[\"EOB\"] ) ) | -> rewrite_tree ) | rewrite_tree_ebnf )
            int alt76=4;
            alt76 = dfa76.predict(input);
            switch (alt76) {
                case 1 :
                    // org/antlr/grammar/v3/ANTLRv3.g:377:4: rewrite_tree_atom
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_rewrite_tree_atom_in_rewrite_tree_element2761);
                    rewrite_tree_atom156=rewrite_tree_atom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rewrite_tree_atom156.getTree());

                    }
                    break;
                case 2 :
                    // org/antlr/grammar/v3/ANTLRv3.g:378:4: rewrite_tree_atom ebnfSuffix
                    {
                    pushFollow(FOLLOW_rewrite_tree_atom_in_rewrite_tree_element2766);
                    rewrite_tree_atom157=rewrite_tree_atom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_rewrite_tree_atom.add(rewrite_tree_atom157.getTree());
                    pushFollow(FOLLOW_ebnfSuffix_in_rewrite_tree_element2768);
                    ebnfSuffix158=ebnfSuffix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ebnfSuffix.add(ebnfSuffix158.getTree());


                    // AST REWRITE
                    // elements: rewrite_tree_atom, ebnfSuffix
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 379:3: -> ^( ebnfSuffix ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] rewrite_tree_atom EOA[\"EOA\"] ) EOB[\"EOB\"] ) )
                    {
                        // org/antlr/grammar/v3/ANTLRv3.g:379:6: ^( ebnfSuffix ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] rewrite_tree_atom EOA[\"EOA\"] ) EOB[\"EOB\"] ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_ebnfSuffix.nextNode(), root_1);

                        // org/antlr/grammar/v3/ANTLRv3.g:379:20: ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] rewrite_tree_atom EOA[\"EOA\"] ) EOB[\"EOB\"] )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_2);

                        // org/antlr/grammar/v3/ANTLRv3.g:379:37: ^( ALT[\"ALT\"] rewrite_tree_atom EOA[\"EOA\"] )
                        {
                        CommonTree root_3 = (CommonTree)adaptor.nil();
                        root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ALT, "ALT"), root_3);

                        adaptor.addChild(root_3, stream_rewrite_tree_atom.nextTree());
                        adaptor.addChild(root_3, (CommonTree)adaptor.create(EOA, "EOA"));

                        adaptor.addChild(root_2, root_3);
                        }
                        adaptor.addChild(root_2, (CommonTree)adaptor.create(EOB, "EOB"));

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // org/antlr/grammar/v3/ANTLRv3.g:380:6: rewrite_tree ( ebnfSuffix -> ^( ebnfSuffix ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] rewrite_tree EOA[\"EOA\"] ) EOB[\"EOB\"] ) ) | -> rewrite_tree )
                    {
                    pushFollow(FOLLOW_rewrite_tree_in_rewrite_tree_element2802);
                    rewrite_tree159=rewrite_tree();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_rewrite_tree.add(rewrite_tree159.getTree());
                    // org/antlr/grammar/v3/ANTLRv3.g:381:3: ( ebnfSuffix -> ^( ebnfSuffix ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] rewrite_tree EOA[\"EOA\"] ) EOB[\"EOB\"] ) ) | -> rewrite_tree )
                    int alt75=2;
                    switch ( input.LA(1) ) {
                    case 74:
                    case 91:
                    case 92:
                        {
                        alt75=1;
                        }
                        break;
                    case EOF:
                    case TREE_BEGIN:
                    case REWRITE:
                    case TOKEN_REF:
                    case STRING_LITERAL:
                    case CHAR_LITERAL:
                    case ACTION:
                    case RULE_REF:
                    case 71:
                    case 81:
                    case 82:
                    case 83:
                    case 93:
                        {
                        alt75=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 75, 0, input);

                        throw nvae;
                    }

                    switch (alt75) {
                        case 1 :
                            // org/antlr/grammar/v3/ANTLRv3.g:381:5: ebnfSuffix
                            {
                            pushFollow(FOLLOW_ebnfSuffix_in_rewrite_tree_element2808);
                            ebnfSuffix160=ebnfSuffix();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_ebnfSuffix.add(ebnfSuffix160.getTree());


                            // AST REWRITE
                            // elements: ebnfSuffix, rewrite_tree
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 382:4: -> ^( ebnfSuffix ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] rewrite_tree EOA[\"EOA\"] ) EOB[\"EOB\"] ) )
                            {
                                // org/antlr/grammar/v3/ANTLRv3.g:382:7: ^( ebnfSuffix ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] rewrite_tree EOA[\"EOA\"] ) EOB[\"EOB\"] ) )
                                {
                                CommonTree root_1 = (CommonTree)adaptor.nil();
                                root_1 = (CommonTree)adaptor.becomeRoot(stream_ebnfSuffix.nextNode(), root_1);

                                // org/antlr/grammar/v3/ANTLRv3.g:382:20: ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] rewrite_tree EOA[\"EOA\"] ) EOB[\"EOB\"] )
                                {
                                CommonTree root_2 = (CommonTree)adaptor.nil();
                                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_2);

                                // org/antlr/grammar/v3/ANTLRv3.g:382:37: ^( ALT[\"ALT\"] rewrite_tree EOA[\"EOA\"] )
                                {
                                CommonTree root_3 = (CommonTree)adaptor.nil();
                                root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ALT, "ALT"), root_3);

                                adaptor.addChild(root_3, stream_rewrite_tree.nextTree());
                                adaptor.addChild(root_3, (CommonTree)adaptor.create(EOA, "EOA"));

                                adaptor.addChild(root_2, root_3);
                                }
                                adaptor.addChild(root_2, (CommonTree)adaptor.create(EOB, "EOB"));

                                adaptor.addChild(root_1, root_2);
                                }

                                adaptor.addChild(root_0, root_1);
                                }

                            }

                            retval.tree = root_0;}
                            }
                            break;
                        case 2 :
                            // org/antlr/grammar/v3/ANTLRv3.g:383:5: 
                            {

                            // AST REWRITE
                            // elements: rewrite_tree
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 383:5: -> rewrite_tree
                            {
                                adaptor.addChild(root_0, stream_rewrite_tree.nextTree());

                            }

                            retval.tree = root_0;}
                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // org/antlr/grammar/v3/ANTLRv3.g:385:6: rewrite_tree_ebnf
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_rewrite_tree_ebnf_in_rewrite_tree_element2854);
                    rewrite_tree_ebnf161=rewrite_tree_ebnf();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rewrite_tree_ebnf161.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "rewrite_tree_element"

    public static class rewrite_tree_atom_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rewrite_tree_atom"
    // org/antlr/grammar/v3/ANTLRv3.g:388:1: rewrite_tree_atom : ( CHAR_LITERAL | TOKEN_REF ( ARG_ACTION )? -> ^( TOKEN_REF ( ARG_ACTION )? ) | RULE_REF | STRING_LITERAL | d= '$' id -> LABEL[$d,$id.text] | ACTION );
    public final ANTLRv3Parser.rewrite_tree_atom_return rewrite_tree_atom() throws RecognitionException {
        ANTLRv3Parser.rewrite_tree_atom_return retval = new ANTLRv3Parser.rewrite_tree_atom_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token d=null;
        Token CHAR_LITERAL162=null;
        Token TOKEN_REF163=null;
        Token ARG_ACTION164=null;
        Token RULE_REF165=null;
        Token STRING_LITERAL166=null;
        Token ACTION168=null;
        ANTLRv3Parser.id_return id167 = null;


        CommonTree d_tree=null;
        CommonTree CHAR_LITERAL162_tree=null;
        CommonTree TOKEN_REF163_tree=null;
        CommonTree ARG_ACTION164_tree=null;
        CommonTree RULE_REF165_tree=null;
        CommonTree STRING_LITERAL166_tree=null;
        CommonTree ACTION168_tree=null;
        RewriteRuleTokenStream stream_93=new RewriteRuleTokenStream(adaptor,"token 93");
        RewriteRuleTokenStream stream_TOKEN_REF=new RewriteRuleTokenStream(adaptor,"token TOKEN_REF");
        RewriteRuleTokenStream stream_ARG_ACTION=new RewriteRuleTokenStream(adaptor,"token ARG_ACTION");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        try {
            // org/antlr/grammar/v3/ANTLRv3.g:389:5: ( CHAR_LITERAL | TOKEN_REF ( ARG_ACTION )? -> ^( TOKEN_REF ( ARG_ACTION )? ) | RULE_REF | STRING_LITERAL | d= '$' id -> LABEL[$d,$id.text] | ACTION )
            int alt78=6;
            switch ( input.LA(1) ) {
            case CHAR_LITERAL:
                {
                alt78=1;
                }
                break;
            case TOKEN_REF:
                {
                alt78=2;
                }
                break;
            case RULE_REF:
                {
                alt78=3;
                }
                break;
            case STRING_LITERAL:
                {
                alt78=4;
                }
                break;
            case 93:
                {
                alt78=5;
                }
                break;
            case ACTION:
                {
                alt78=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }

            switch (alt78) {
                case 1 :
                    // org/antlr/grammar/v3/ANTLRv3.g:389:9: CHAR_LITERAL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    CHAR_LITERAL162=(Token)match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_rewrite_tree_atom2870); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CHAR_LITERAL162_tree = (CommonTree)adaptor.create(CHAR_LITERAL162);
                    adaptor.addChild(root_0, CHAR_LITERAL162_tree);
                    }

                    }
                    break;
                case 2 :
                    // org/antlr/grammar/v3/ANTLRv3.g:390:6: TOKEN_REF ( ARG_ACTION )?
                    {
                    TOKEN_REF163=(Token)match(input,TOKEN_REF,FOLLOW_TOKEN_REF_in_rewrite_tree_atom2877); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TOKEN_REF.add(TOKEN_REF163);

                    // org/antlr/grammar/v3/ANTLRv3.g:390:16: ( ARG_ACTION )?
                    int alt77=2;
                    switch ( input.LA(1) ) {
                        case ARG_ACTION:
                            {
                            alt77=1;
                            }
                            break;
                    }

                    switch (alt77) {
                        case 1 :
                            // org/antlr/grammar/v3/ANTLRv3.g:390:16: ARG_ACTION
                            {
                            ARG_ACTION164=(Token)match(input,ARG_ACTION,FOLLOW_ARG_ACTION_in_rewrite_tree_atom2879); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ARG_ACTION.add(ARG_ACTION164);


                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: ARG_ACTION, TOKEN_REF
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 390:28: -> ^( TOKEN_REF ( ARG_ACTION )? )
                    {
                        // org/antlr/grammar/v3/ANTLRv3.g:390:31: ^( TOKEN_REF ( ARG_ACTION )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_TOKEN_REF.nextNode(), root_1);

                        // org/antlr/grammar/v3/ANTLRv3.g:390:43: ( ARG_ACTION )?
                        if ( stream_ARG_ACTION.hasNext() ) {
                            adaptor.addChild(root_1, stream_ARG_ACTION.nextNode());

                        }
                        stream_ARG_ACTION.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // org/antlr/grammar/v3/ANTLRv3.g:391:9: RULE_REF
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    RULE_REF165=(Token)match(input,RULE_REF,FOLLOW_RULE_REF_in_rewrite_tree_atom2900); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RULE_REF165_tree = (CommonTree)adaptor.create(RULE_REF165);
                    adaptor.addChild(root_0, RULE_REF165_tree);
                    }

                    }
                    break;
                case 4 :
                    // org/antlr/grammar/v3/ANTLRv3.g:392:6: STRING_LITERAL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    STRING_LITERAL166=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_rewrite_tree_atom2907); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING_LITERAL166_tree = (CommonTree)adaptor.create(STRING_LITERAL166);
                    adaptor.addChild(root_0, STRING_LITERAL166_tree);
                    }

                    }
                    break;
                case 5 :
                    // org/antlr/grammar/v3/ANTLRv3.g:393:6: d= '$' id
                    {
                    d=(Token)match(input,93,FOLLOW_93_in_rewrite_tree_atom2916); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_93.add(d);

                    pushFollow(FOLLOW_id_in_rewrite_tree_atom2918);
                    id167=id();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_id.add(id167.getTree());


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 393:15: -> LABEL[$d,$id.text]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(LABEL, d, (id167!=null?input.toString(id167.start,id167.stop):null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // org/antlr/grammar/v3/ANTLRv3.g:394:4: ACTION
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    ACTION168=(Token)match(input,ACTION,FOLLOW_ACTION_in_rewrite_tree_atom2929); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ACTION168_tree = (CommonTree)adaptor.create(ACTION168);
                    adaptor.addChild(root_0, ACTION168_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "rewrite_tree_atom"

    public static class rewrite_tree_ebnf_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rewrite_tree_ebnf"
    // org/antlr/grammar/v3/ANTLRv3.g:397:1: rewrite_tree_ebnf : rewrite_tree_block ebnfSuffix -> ^( ebnfSuffix rewrite_tree_block ) ;
    public final ANTLRv3Parser.rewrite_tree_ebnf_return rewrite_tree_ebnf() throws RecognitionException {
        ANTLRv3Parser.rewrite_tree_ebnf_return retval = new ANTLRv3Parser.rewrite_tree_ebnf_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        ANTLRv3Parser.rewrite_tree_block_return rewrite_tree_block169 = null;

        ANTLRv3Parser.ebnfSuffix_return ebnfSuffix170 = null;


        RewriteRuleSubtreeStream stream_ebnfSuffix=new RewriteRuleSubtreeStream(adaptor,"rule ebnfSuffix");
        RewriteRuleSubtreeStream stream_rewrite_tree_block=new RewriteRuleSubtreeStream(adaptor,"rule rewrite_tree_block");

            Token firstToken = input.LT(1);

        try {
            // org/antlr/grammar/v3/ANTLRv3.g:405:2: ( rewrite_tree_block ebnfSuffix -> ^( ebnfSuffix rewrite_tree_block ) )
            // org/antlr/grammar/v3/ANTLRv3.g:405:4: rewrite_tree_block ebnfSuffix
            {
            pushFollow(FOLLOW_rewrite_tree_block_in_rewrite_tree_ebnf2950);
            rewrite_tree_block169=rewrite_tree_block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_rewrite_tree_block.add(rewrite_tree_block169.getTree());
            pushFollow(FOLLOW_ebnfSuffix_in_rewrite_tree_ebnf2952);
            ebnfSuffix170=ebnfSuffix();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ebnfSuffix.add(ebnfSuffix170.getTree());


            // AST REWRITE
            // elements: rewrite_tree_block, ebnfSuffix
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 405:34: -> ^( ebnfSuffix rewrite_tree_block )
            {
                // org/antlr/grammar/v3/ANTLRv3.g:405:37: ^( ebnfSuffix rewrite_tree_block )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_ebnfSuffix.nextNode(), root_1);

                adaptor.addChild(root_1, stream_rewrite_tree_block.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {

              	((CommonTree)retval.tree).getToken().setLine(firstToken.getLine());
              	((CommonTree)retval.tree).getToken().setCharPositionInLine(firstToken.getCharPositionInLine());

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "rewrite_tree_ebnf"

    public static class rewrite_tree_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rewrite_tree"
    // org/antlr/grammar/v3/ANTLRv3.g:408:1: rewrite_tree : '^(' rewrite_tree_atom ( rewrite_tree_element )* ')' -> ^( TREE_BEGIN rewrite_tree_atom ( rewrite_tree_element )* ) ;
    public final ANTLRv3Parser.rewrite_tree_return rewrite_tree() throws RecognitionException {
        ANTLRv3Parser.rewrite_tree_return retval = new ANTLRv3Parser.rewrite_tree_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal171=null;
        Token char_literal174=null;
        ANTLRv3Parser.rewrite_tree_atom_return rewrite_tree_atom172 = null;

        ANTLRv3Parser.rewrite_tree_element_return rewrite_tree_element173 = null;


        CommonTree string_literal171_tree=null;
        CommonTree char_literal174_tree=null;
        RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
        RewriteRuleTokenStream stream_TREE_BEGIN=new RewriteRuleTokenStream(adaptor,"token TREE_BEGIN");
        RewriteRuleSubtreeStream stream_rewrite_tree_element=new RewriteRuleSubtreeStream(adaptor,"rule rewrite_tree_element");
        RewriteRuleSubtreeStream stream_rewrite_tree_atom=new RewriteRuleSubtreeStream(adaptor,"rule rewrite_tree_atom");
        try {
            // org/antlr/grammar/v3/ANTLRv3.g:409:2: ( '^(' rewrite_tree_atom ( rewrite_tree_element )* ')' -> ^( TREE_BEGIN rewrite_tree_atom ( rewrite_tree_element )* ) )
            // org/antlr/grammar/v3/ANTLRv3.g:409:4: '^(' rewrite_tree_atom ( rewrite_tree_element )* ')'
            {
            string_literal171=(Token)match(input,TREE_BEGIN,FOLLOW_TREE_BEGIN_in_rewrite_tree2972); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_TREE_BEGIN.add(string_literal171);

            pushFollow(FOLLOW_rewrite_tree_atom_in_rewrite_tree2974);
            rewrite_tree_atom172=rewrite_tree_atom();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_rewrite_tree_atom.add(rewrite_tree_atom172.getTree());
            // org/antlr/grammar/v3/ANTLRv3.g:409:27: ( rewrite_tree_element )*
            loop79:
            do {
                int alt79=2;
                switch ( input.LA(1) ) {
                case TREE_BEGIN:
                case TOKEN_REF:
                case STRING_LITERAL:
                case CHAR_LITERAL:
                case ACTION:
                case RULE_REF:
                case 81:
                case 93:
                    {
                    alt79=1;
                    }
                    break;

                }

                switch (alt79) {
            	case 1 :
            	    // org/antlr/grammar/v3/ANTLRv3.g:409:27: rewrite_tree_element
            	    {
            	    pushFollow(FOLLOW_rewrite_tree_element_in_rewrite_tree2976);
            	    rewrite_tree_element173=rewrite_tree_element();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_rewrite_tree_element.add(rewrite_tree_element173.getTree());

            	    }
            	    break;

            	default :
            	    break loop79;
                }
            } while (true);

            char_literal174=(Token)match(input,83,FOLLOW_83_in_rewrite_tree2979); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_83.add(char_literal174);



            // AST REWRITE
            // elements: rewrite_tree_atom, rewrite_tree_element
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 410:3: -> ^( TREE_BEGIN rewrite_tree_atom ( rewrite_tree_element )* )
            {
                // org/antlr/grammar/v3/ANTLRv3.g:410:6: ^( TREE_BEGIN rewrite_tree_atom ( rewrite_tree_element )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TREE_BEGIN, "TREE_BEGIN"), root_1);

                adaptor.addChild(root_1, stream_rewrite_tree_atom.nextTree());
                // org/antlr/grammar/v3/ANTLRv3.g:410:37: ( rewrite_tree_element )*
                while ( stream_rewrite_tree_element.hasNext() ) {
                    adaptor.addChild(root_1, stream_rewrite_tree_element.nextTree());

                }
                stream_rewrite_tree_element.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "rewrite_tree"

    public static class rewrite_template_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rewrite_template"
    // org/antlr/grammar/v3/ANTLRv3.g:413:1: rewrite_template : ( id lp= '(' rewrite_template_args ')' (str= DOUBLE_QUOTE_STRING_LITERAL | str= DOUBLE_ANGLE_STRING_LITERAL ) -> ^( TEMPLATE[$lp,\"TEMPLATE\"] id rewrite_template_args $str) | rewrite_template_ref | rewrite_indirect_template_head | ACTION );
    public final ANTLRv3Parser.rewrite_template_return rewrite_template() throws RecognitionException {
        ANTLRv3Parser.rewrite_template_return retval = new ANTLRv3Parser.rewrite_template_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token lp=null;
        Token str=null;
        Token char_literal177=null;
        Token ACTION180=null;
        ANTLRv3Parser.id_return id175 = null;

        ANTLRv3Parser.rewrite_template_args_return rewrite_template_args176 = null;

        ANTLRv3Parser.rewrite_template_ref_return rewrite_template_ref178 = null;

        ANTLRv3Parser.rewrite_indirect_template_head_return rewrite_indirect_template_head179 = null;


        CommonTree lp_tree=null;
        CommonTree str_tree=null;
        CommonTree char_literal177_tree=null;
        CommonTree ACTION180_tree=null;
        RewriteRuleTokenStream stream_DOUBLE_QUOTE_STRING_LITERAL=new RewriteRuleTokenStream(adaptor,"token DOUBLE_QUOTE_STRING_LITERAL");
        RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
        RewriteRuleTokenStream stream_DOUBLE_ANGLE_STRING_LITERAL=new RewriteRuleTokenStream(adaptor,"token DOUBLE_ANGLE_STRING_LITERAL");
        RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_rewrite_template_args=new RewriteRuleSubtreeStream(adaptor,"rule rewrite_template_args");
        try {
            // org/antlr/grammar/v3/ANTLRv3.g:425:2: ( id lp= '(' rewrite_template_args ')' (str= DOUBLE_QUOTE_STRING_LITERAL | str= DOUBLE_ANGLE_STRING_LITERAL ) -> ^( TEMPLATE[$lp,\"TEMPLATE\"] id rewrite_template_args $str) | rewrite_template_ref | rewrite_indirect_template_head | ACTION )
            int alt81=4;
            alt81 = dfa81.predict(input);
            switch (alt81) {
                case 1 :
                    // org/antlr/grammar/v3/ANTLRv3.g:426:3: id lp= '(' rewrite_template_args ')' (str= DOUBLE_QUOTE_STRING_LITERAL | str= DOUBLE_ANGLE_STRING_LITERAL )
                    {
                    pushFollow(FOLLOW_id_in_rewrite_template3011);
                    id175=id();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_id.add(id175.getTree());
                    lp=(Token)match(input,81,FOLLOW_81_in_rewrite_template3015); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_81.add(lp);

                    pushFollow(FOLLOW_rewrite_template_args_in_rewrite_template3017);
                    rewrite_template_args176=rewrite_template_args();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_rewrite_template_args.add(rewrite_template_args176.getTree());
                    char_literal177=(Token)match(input,83,FOLLOW_83_in_rewrite_template3019); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_83.add(char_literal177);

                    // org/antlr/grammar/v3/ANTLRv3.g:427:3: (str= DOUBLE_QUOTE_STRING_LITERAL | str= DOUBLE_ANGLE_STRING_LITERAL )
                    int alt80=2;
                    switch ( input.LA(1) ) {
                    case DOUBLE_QUOTE_STRING_LITERAL:
                        {
                        alt80=1;
                        }
                        break;
                    case DOUBLE_ANGLE_STRING_LITERAL:
                        {
                        alt80=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 80, 0, input);

                        throw nvae;
                    }

                    switch (alt80) {
                        case 1 :
                            // org/antlr/grammar/v3/ANTLRv3.g:427:5: str= DOUBLE_QUOTE_STRING_LITERAL
                            {
                            str=(Token)match(input,DOUBLE_QUOTE_STRING_LITERAL,FOLLOW_DOUBLE_QUOTE_STRING_LITERAL_in_rewrite_template3027); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DOUBLE_QUOTE_STRING_LITERAL.add(str);


                            }
                            break;
                        case 2 :
                            // org/antlr/grammar/v3/ANTLRv3.g:427:39: str= DOUBLE_ANGLE_STRING_LITERAL
                            {
                            str=(Token)match(input,DOUBLE_ANGLE_STRING_LITERAL,FOLLOW_DOUBLE_ANGLE_STRING_LITERAL_in_rewrite_template3033); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DOUBLE_ANGLE_STRING_LITERAL.add(str);


                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: str, rewrite_template_args, id
                    // token labels: str
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_str=new RewriteRuleTokenStream(adaptor,"token str",str);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 428:3: -> ^( TEMPLATE[$lp,\"TEMPLATE\"] id rewrite_template_args $str)
                    {
                        // org/antlr/grammar/v3/ANTLRv3.g:428:6: ^( TEMPLATE[$lp,\"TEMPLATE\"] id rewrite_template_args $str)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TEMPLATE, lp, "TEMPLATE"), root_1);

                        adaptor.addChild(root_1, stream_id.nextTree());
                        adaptor.addChild(root_1, stream_rewrite_template_args.nextTree());
                        adaptor.addChild(root_1, stream_str.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // org/antlr/grammar/v3/ANTLRv3.g:431:3: rewrite_template_ref
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_rewrite_template_ref_in_rewrite_template3060);
                    rewrite_template_ref178=rewrite_template_ref();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rewrite_template_ref178.getTree());

                    }
                    break;
                case 3 :
                    // org/antlr/grammar/v3/ANTLRv3.g:434:3: rewrite_indirect_template_head
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_rewrite_indirect_template_head_in_rewrite_template3069);
                    rewrite_indirect_template_head179=rewrite_indirect_template_head();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rewrite_indirect_template_head179.getTree());

                    }
                    break;
                case 4 :
                    // org/antlr/grammar/v3/ANTLRv3.g:437:3: ACTION
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    ACTION180=(Token)match(input,ACTION,FOLLOW_ACTION_in_rewrite_template3078); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ACTION180_tree = (CommonTree)adaptor.create(ACTION180);
                    adaptor.addChild(root_0, ACTION180_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "rewrite_template"

    public static class rewrite_template_ref_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rewrite_template_ref"
    // org/antlr/grammar/v3/ANTLRv3.g:440:1: rewrite_template_ref : id lp= '(' rewrite_template_args ')' -> ^( TEMPLATE[$lp,\"TEMPLATE\"] id rewrite_template_args ) ;
    public final ANTLRv3Parser.rewrite_template_ref_return rewrite_template_ref() throws RecognitionException {
        ANTLRv3Parser.rewrite_template_ref_return retval = new ANTLRv3Parser.rewrite_template_ref_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token lp=null;
        Token char_literal183=null;
        ANTLRv3Parser.id_return id181 = null;

        ANTLRv3Parser.rewrite_template_args_return rewrite_template_args182 = null;


        CommonTree lp_tree=null;
        CommonTree char_literal183_tree=null;
        RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
        RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_rewrite_template_args=new RewriteRuleSubtreeStream(adaptor,"rule rewrite_template_args");
        try {
            // org/antlr/grammar/v3/ANTLRv3.g:442:2: ( id lp= '(' rewrite_template_args ')' -> ^( TEMPLATE[$lp,\"TEMPLATE\"] id rewrite_template_args ) )
            // org/antlr/grammar/v3/ANTLRv3.g:442:4: id lp= '(' rewrite_template_args ')'
            {
            pushFollow(FOLLOW_id_in_rewrite_template_ref3091);
            id181=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(id181.getTree());
            lp=(Token)match(input,81,FOLLOW_81_in_rewrite_template_ref3095); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_81.add(lp);

            pushFollow(FOLLOW_rewrite_template_args_in_rewrite_template_ref3097);
            rewrite_template_args182=rewrite_template_args();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_rewrite_template_args.add(rewrite_template_args182.getTree());
            char_literal183=(Token)match(input,83,FOLLOW_83_in_rewrite_template_ref3099); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_83.add(char_literal183);



            // AST REWRITE
            // elements: rewrite_template_args, id
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 443:3: -> ^( TEMPLATE[$lp,\"TEMPLATE\"] id rewrite_template_args )
            {
                // org/antlr/grammar/v3/ANTLRv3.g:443:6: ^( TEMPLATE[$lp,\"TEMPLATE\"] id rewrite_template_args )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TEMPLATE, lp, "TEMPLATE"), root_1);

                adaptor.addChild(root_1, stream_id.nextTree());
                adaptor.addChild(root_1, stream_rewrite_template_args.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "rewrite_template_ref"

    public static class rewrite_indirect_template_head_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rewrite_indirect_template_head"
    // org/antlr/grammar/v3/ANTLRv3.g:446:1: rewrite_indirect_template_head : lp= '(' ACTION ')' '(' rewrite_template_args ')' -> ^( TEMPLATE[$lp,\"TEMPLATE\"] ACTION rewrite_template_args ) ;
    public final ANTLRv3Parser.rewrite_indirect_template_head_return rewrite_indirect_template_head() throws RecognitionException {
        ANTLRv3Parser.rewrite_indirect_template_head_return retval = new ANTLRv3Parser.rewrite_indirect_template_head_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token lp=null;
        Token ACTION184=null;
        Token char_literal185=null;
        Token char_literal186=null;
        Token char_literal188=null;
        ANTLRv3Parser.rewrite_template_args_return rewrite_template_args187 = null;


        CommonTree lp_tree=null;
        CommonTree ACTION184_tree=null;
        CommonTree char_literal185_tree=null;
        CommonTree char_literal186_tree=null;
        CommonTree char_literal188_tree=null;
        RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
        RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
        RewriteRuleTokenStream stream_ACTION=new RewriteRuleTokenStream(adaptor,"token ACTION");
        RewriteRuleSubtreeStream stream_rewrite_template_args=new RewriteRuleSubtreeStream(adaptor,"rule rewrite_template_args");
        try {
            // org/antlr/grammar/v3/ANTLRv3.g:448:2: (lp= '(' ACTION ')' '(' rewrite_template_args ')' -> ^( TEMPLATE[$lp,\"TEMPLATE\"] ACTION rewrite_template_args ) )
            // org/antlr/grammar/v3/ANTLRv3.g:448:4: lp= '(' ACTION ')' '(' rewrite_template_args ')'
            {
            lp=(Token)match(input,81,FOLLOW_81_in_rewrite_indirect_template_head3127); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_81.add(lp);

            ACTION184=(Token)match(input,ACTION,FOLLOW_ACTION_in_rewrite_indirect_template_head3129); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ACTION.add(ACTION184);

            char_literal185=(Token)match(input,83,FOLLOW_83_in_rewrite_indirect_template_head3131); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_83.add(char_literal185);

            char_literal186=(Token)match(input,81,FOLLOW_81_in_rewrite_indirect_template_head3133); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_81.add(char_literal186);

            pushFollow(FOLLOW_rewrite_template_args_in_rewrite_indirect_template_head3135);
            rewrite_template_args187=rewrite_template_args();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_rewrite_template_args.add(rewrite_template_args187.getTree());
            char_literal188=(Token)match(input,83,FOLLOW_83_in_rewrite_indirect_template_head3137); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_83.add(char_literal188);



            // AST REWRITE
            // elements: rewrite_template_args, ACTION
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 449:3: -> ^( TEMPLATE[$lp,\"TEMPLATE\"] ACTION rewrite_template_args )
            {
                // org/antlr/grammar/v3/ANTLRv3.g:449:6: ^( TEMPLATE[$lp,\"TEMPLATE\"] ACTION rewrite_template_args )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TEMPLATE, lp, "TEMPLATE"), root_1);

                adaptor.addChild(root_1, stream_ACTION.nextNode());
                adaptor.addChild(root_1, stream_rewrite_template_args.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "rewrite_indirect_template_head"

    public static class rewrite_template_args_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rewrite_template_args"
    // org/antlr/grammar/v3/ANTLRv3.g:452:1: rewrite_template_args : ( rewrite_template_arg ( ',' rewrite_template_arg )* -> ^( ARGLIST ( rewrite_template_arg )+ ) | -> ARGLIST );
    public final ANTLRv3Parser.rewrite_template_args_return rewrite_template_args() throws RecognitionException {
        ANTLRv3Parser.rewrite_template_args_return retval = new ANTLRv3Parser.rewrite_template_args_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal190=null;
        ANTLRv3Parser.rewrite_template_arg_return rewrite_template_arg189 = null;

        ANTLRv3Parser.rewrite_template_arg_return rewrite_template_arg191 = null;


        CommonTree char_literal190_tree=null;
        RewriteRuleTokenStream stream_80=new RewriteRuleTokenStream(adaptor,"token 80");
        RewriteRuleSubtreeStream stream_rewrite_template_arg=new RewriteRuleSubtreeStream(adaptor,"rule rewrite_template_arg");
        try {
            // org/antlr/grammar/v3/ANTLRv3.g:453:2: ( rewrite_template_arg ( ',' rewrite_template_arg )* -> ^( ARGLIST ( rewrite_template_arg )+ ) | -> ARGLIST )
            int alt83=2;
            switch ( input.LA(1) ) {
            case TOKEN_REF:
            case RULE_REF:
                {
                alt83=1;
                }
                break;
            case 83:
                {
                alt83=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }

            switch (alt83) {
                case 1 :
                    // org/antlr/grammar/v3/ANTLRv3.g:453:4: rewrite_template_arg ( ',' rewrite_template_arg )*
                    {
                    pushFollow(FOLLOW_rewrite_template_arg_in_rewrite_template_args3161);
                    rewrite_template_arg189=rewrite_template_arg();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_rewrite_template_arg.add(rewrite_template_arg189.getTree());
                    // org/antlr/grammar/v3/ANTLRv3.g:453:25: ( ',' rewrite_template_arg )*
                    loop82:
                    do {
                        int alt82=2;
                        switch ( input.LA(1) ) {
                        case 80:
                            {
                            alt82=1;
                            }
                            break;

                        }

                        switch (alt82) {
                    	case 1 :
                    	    // org/antlr/grammar/v3/ANTLRv3.g:453:26: ',' rewrite_template_arg
                    	    {
                    	    char_literal190=(Token)match(input,80,FOLLOW_80_in_rewrite_template_args3164); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_80.add(char_literal190);

                    	    pushFollow(FOLLOW_rewrite_template_arg_in_rewrite_template_args3166);
                    	    rewrite_template_arg191=rewrite_template_arg();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_rewrite_template_arg.add(rewrite_template_arg191.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop82;
                        }
                    } while (true);



                    // AST REWRITE
                    // elements: rewrite_template_arg
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 454:3: -> ^( ARGLIST ( rewrite_template_arg )+ )
                    {
                        // org/antlr/grammar/v3/ANTLRv3.g:454:6: ^( ARGLIST ( rewrite_template_arg )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARGLIST, "ARGLIST"), root_1);

                        if ( !(stream_rewrite_template_arg.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_rewrite_template_arg.hasNext() ) {
                            adaptor.addChild(root_1, stream_rewrite_template_arg.nextTree());

                        }
                        stream_rewrite_template_arg.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // org/antlr/grammar/v3/ANTLRv3.g:455:4: 
                    {

                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 455:4: -> ARGLIST
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(ARGLIST, "ARGLIST"));

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "rewrite_template_args"

    public static class rewrite_template_arg_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rewrite_template_arg"
    // org/antlr/grammar/v3/ANTLRv3.g:458:1: rewrite_template_arg : id '=' ACTION -> ^( ARG[$id.start] id ACTION ) ;
    public final ANTLRv3Parser.rewrite_template_arg_return rewrite_template_arg() throws RecognitionException {
        ANTLRv3Parser.rewrite_template_arg_return retval = new ANTLRv3Parser.rewrite_template_arg_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal193=null;
        Token ACTION194=null;
        ANTLRv3Parser.id_return id192 = null;


        CommonTree char_literal193_tree=null;
        CommonTree ACTION194_tree=null;
        RewriteRuleTokenStream stream_LABEL_ASSIGN=new RewriteRuleTokenStream(adaptor,"token LABEL_ASSIGN");
        RewriteRuleTokenStream stream_ACTION=new RewriteRuleTokenStream(adaptor,"token ACTION");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        try {
            // org/antlr/grammar/v3/ANTLRv3.g:459:2: ( id '=' ACTION -> ^( ARG[$id.start] id ACTION ) )
            // org/antlr/grammar/v3/ANTLRv3.g:459:6: id '=' ACTION
            {
            pushFollow(FOLLOW_id_in_rewrite_template_arg3199);
            id192=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(id192.getTree());
            char_literal193=(Token)match(input,LABEL_ASSIGN,FOLLOW_LABEL_ASSIGN_in_rewrite_template_arg3201); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LABEL_ASSIGN.add(char_literal193);

            ACTION194=(Token)match(input,ACTION,FOLLOW_ACTION_in_rewrite_template_arg3203); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ACTION.add(ACTION194);



            // AST REWRITE
            // elements: id, ACTION
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 459:20: -> ^( ARG[$id.start] id ACTION )
            {
                // org/antlr/grammar/v3/ANTLRv3.g:459:23: ^( ARG[$id.start] id ACTION )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARG, (id192!=null?((Token)id192.start):null)), root_1);

                adaptor.addChild(root_1, stream_id.nextTree());
                adaptor.addChild(root_1, stream_ACTION.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "rewrite_template_arg"

    public static class qid_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "qid"
    // org/antlr/grammar/v3/ANTLRv3.g:462:1: qid : id ( '.' id )* ;
    public final ANTLRv3Parser.qid_return qid() throws RecognitionException {
        ANTLRv3Parser.qid_return retval = new ANTLRv3Parser.qid_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal196=null;
        ANTLRv3Parser.id_return id195 = null;

        ANTLRv3Parser.id_return id197 = null;


        CommonTree char_literal196_tree=null;

        try {
            // org/antlr/grammar/v3/ANTLRv3.g:462:5: ( id ( '.' id )* )
            // org/antlr/grammar/v3/ANTLRv3.g:462:7: id ( '.' id )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_id_in_qid3224);
            id195=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id195.getTree());
            // org/antlr/grammar/v3/ANTLRv3.g:462:10: ( '.' id )*
            loop84:
            do {
                int alt84=2;
                switch ( input.LA(1) ) {
                case 90:
                    {
                    alt84=1;
                    }
                    break;

                }

                switch (alt84) {
            	case 1 :
            	    // org/antlr/grammar/v3/ANTLRv3.g:462:11: '.' id
            	    {
            	    char_literal196=(Token)match(input,90,FOLLOW_90_in_qid3227); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal196_tree = (CommonTree)adaptor.create(char_literal196);
            	    adaptor.addChild(root_0, char_literal196_tree);
            	    }
            	    pushFollow(FOLLOW_id_in_qid3229);
            	    id197=id();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, id197.getTree());

            	    }
            	    break;

            	default :
            	    break loop84;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "qid"

    public static class id_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "id"
    // org/antlr/grammar/v3/ANTLRv3.g:464:1: id : ( TOKEN_REF -> ID[$TOKEN_REF] | RULE_REF -> ID[$RULE_REF] );
    public final ANTLRv3Parser.id_return id() throws RecognitionException {
        ANTLRv3Parser.id_return retval = new ANTLRv3Parser.id_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token TOKEN_REF198=null;
        Token RULE_REF199=null;

        CommonTree TOKEN_REF198_tree=null;
        CommonTree RULE_REF199_tree=null;
        RewriteRuleTokenStream stream_RULE_REF=new RewriteRuleTokenStream(adaptor,"token RULE_REF");
        RewriteRuleTokenStream stream_TOKEN_REF=new RewriteRuleTokenStream(adaptor,"token TOKEN_REF");

        try {
            // org/antlr/grammar/v3/ANTLRv3.g:464:4: ( TOKEN_REF -> ID[$TOKEN_REF] | RULE_REF -> ID[$RULE_REF] )
            int alt85=2;
            switch ( input.LA(1) ) {
            case TOKEN_REF:
                {
                alt85=1;
                }
                break;
            case RULE_REF:
                {
                alt85=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;
            }

            switch (alt85) {
                case 1 :
                    // org/antlr/grammar/v3/ANTLRv3.g:464:6: TOKEN_REF
                    {
                    TOKEN_REF198=(Token)match(input,TOKEN_REF,FOLLOW_TOKEN_REF_in_id3241); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TOKEN_REF.add(TOKEN_REF198);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 464:16: -> ID[$TOKEN_REF]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(ID, TOKEN_REF198));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // org/antlr/grammar/v3/ANTLRv3.g:465:4: RULE_REF
                    {
                    RULE_REF199=(Token)match(input,RULE_REF,FOLLOW_RULE_REF_in_id3251); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RULE_REF.add(RULE_REF199);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 465:14: -> ID[$RULE_REF]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(ID, RULE_REF199));

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "id"

    // $ANTLR start synpred1_ANTLRv3
    public final void synpred1_ANTLRv3_fragment() throws RecognitionException {   
        // org/antlr/grammar/v3/ANTLRv3.g:362:4: ( rewrite_template )
        // org/antlr/grammar/v3/ANTLRv3.g:362:4: rewrite_template
        {
        pushFollow(FOLLOW_rewrite_template_in_synpred1_ANTLRv32648);
        rewrite_template();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_ANTLRv3

    // $ANTLR start synpred2_ANTLRv3
    public final void synpred2_ANTLRv3_fragment() throws RecognitionException {   
        // org/antlr/grammar/v3/ANTLRv3.g:363:4: ( rewrite_tree_alternative )
        // org/antlr/grammar/v3/ANTLRv3.g:363:4: rewrite_tree_alternative
        {
        pushFollow(FOLLOW_rewrite_tree_alternative_in_synpred2_ANTLRv32653);
        rewrite_tree_alternative();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_ANTLRv3

    // Delegated rules

    public final boolean synpred2_ANTLRv3() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_ANTLRv3_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_ANTLRv3() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_ANTLRv3_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA46 dfa46 = new DFA46(this);
    protected DFA73 dfa73 = new DFA73(this);
    protected DFA76 dfa76 = new DFA76(this);
    protected DFA81 dfa81 = new DFA81(this);
    static final String DFA46_eotS =
        "\14\uffff";
    static final String DFA46_eofS =
        "\14\uffff";
    static final String DFA46_minS =
        "\3\37\5\uffff\2\54\2\uffff";
    static final String DFA46_maxS =
        "\1\132\2\134\5\uffff\2\132\2\uffff";
    static final String DFA46_acceptS =
        "\3\uffff\1\3\1\4\1\5\1\6\1\7\2\uffff\1\2\1\1";
    static final String DFA46_specialS =
        "\14\uffff}>";
    static final String[] DFA46_transitionS = {
            "\1\6\4\uffff\1\7\7\uffff\1\1\2\3\1\5\3\uffff\1\2\35\uffff\1"+
            "\4\5\uffff\1\3\2\uffff\1\3",
            "\1\3\4\uffff\4\3\1\uffff\1\10\1\11\1\uffff\4\3\2\uffff\2\3"+
            "\23\uffff\1\3\2\uffff\1\3\6\uffff\3\3\3\uffff\2\3\1\uffff\3"+
            "\3",
            "\1\3\4\uffff\4\3\1\uffff\1\10\1\11\1\uffff\4\3\2\uffff\2\3"+
            "\23\uffff\1\3\2\uffff\1\3\6\uffff\3\3\3\uffff\1\3\2\uffff\3"+
            "\3",
            "",
            "",
            "",
            "",
            "",
            "\3\13\4\uffff\1\13\35\uffff\1\12\5\uffff\1\13\2\uffff\1\13",
            "\3\13\4\uffff\1\13\35\uffff\1\12\5\uffff\1\13\2\uffff\1\13",
            "",
            ""
    };

    static final short[] DFA46_eot = DFA.unpackEncodedString(DFA46_eotS);
    static final short[] DFA46_eof = DFA.unpackEncodedString(DFA46_eofS);
    static final char[] DFA46_min = DFA.unpackEncodedStringToUnsignedChars(DFA46_minS);
    static final char[] DFA46_max = DFA.unpackEncodedStringToUnsignedChars(DFA46_maxS);
    static final short[] DFA46_accept = DFA.unpackEncodedString(DFA46_acceptS);
    static final short[] DFA46_special = DFA.unpackEncodedString(DFA46_specialS);
    static final short[][] DFA46_transition;

    static {
        int numStates = DFA46_transitionS.length;
        DFA46_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA46_transition[i] = DFA.unpackEncodedString(DFA46_transitionS[i]);
        }
    }

    class DFA46 extends DFA {

        public DFA46(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 46;
            this.eot = DFA46_eot;
            this.eof = DFA46_eof;
            this.min = DFA46_min;
            this.max = DFA46_max;
            this.accept = DFA46_accept;
            this.special = DFA46_special;
            this.transition = DFA46_transition;
        }
        public String getDescription() {
            return "233:1: element : ( id (labelOp= '=' | labelOp= '+=' ) atom ( ebnfSuffix -> ^( ebnfSuffix ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] ^( $labelOp id atom ) EOA[\"EOA\"] ) EOB[\"EOB\"] ) ) | -> ^( $labelOp id atom ) ) | id (labelOp= '=' | labelOp= '+=' ) block ( ebnfSuffix -> ^( ebnfSuffix ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] ^( $labelOp id block ) EOA[\"EOA\"] ) EOB[\"EOB\"] ) ) | -> ^( $labelOp id block ) ) | atom ( ebnfSuffix -> ^( ebnfSuffix ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] atom EOA[\"EOA\"] ) EOB[\"EOB\"] ) ) | -> atom ) | ebnf | ACTION | SEMPRED (g= '=>' -> GATED_SEMPRED[$g] | -> SEMPRED ) | treeSpec ( ebnfSuffix -> ^( ebnfSuffix ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] treeSpec EOA[\"EOA\"] ) EOB[\"EOB\"] ) ) | -> treeSpec ) );";
        }
    }
    static final String DFA73_eotS =
        "\15\uffff";
    static final String DFA73_eofS =
        "\15\uffff";
    static final String DFA73_minS =
        "\4\44\1\0\2\uffff\2\44\1\uffff\2\44\1\112";
    static final String DFA73_maxS =
        "\4\135\1\0\2\uffff\2\135\1\uffff\2\135\1\134";
    static final String DFA73_acceptS =
        "\5\uffff\1\2\1\3\2\uffff\1\1\3\uffff";
    static final String DFA73_specialS =
        "\4\uffff\1\0\10\uffff}>";
    static final String[] DFA73_transitionS = {
            "\1\5\2\uffff\1\6\4\uffff\1\1\2\5\1\4\3\uffff\1\2\23\uffff\1"+
            "\6\11\uffff\1\3\2\6\11\uffff\1\5",
            "\1\5\2\uffff\1\5\4\uffff\4\5\2\uffff\2\5\23\uffff\1\5\2\uffff"+
            "\1\5\6\uffff\1\7\2\5\7\uffff\3\5",
            "\1\5\2\uffff\1\5\4\uffff\4\5\3\uffff\1\5\23\uffff\1\5\2\uffff"+
            "\1\5\6\uffff\1\7\2\5\7\uffff\3\5",
            "\1\5\7\uffff\3\5\1\10\3\uffff\1\5\35\uffff\1\5\13\uffff\1\5",
            "\1\uffff",
            "",
            "",
            "\1\5\7\uffff\1\12\3\5\3\uffff\1\13\35\uffff\1\5\1\uffff\1\11"+
            "\11\uffff\1\5",
            "\1\5\7\uffff\4\5\3\uffff\1\5\26\uffff\1\5\6\uffff\1\5\1\uffff"+
            "\1\14\7\uffff\3\5",
            "",
            "\1\5\4\uffff\1\11\2\uffff\4\5\2\uffff\2\5\26\uffff\1\5\6\uffff"+
            "\1\5\1\uffff\1\5\7\uffff\3\5",
            "\1\5\4\uffff\1\11\2\uffff\4\5\3\uffff\1\5\26\uffff\1\5\6\uffff"+
            "\1\5\1\uffff\1\5\7\uffff\3\5",
            "\1\5\6\uffff\1\11\11\uffff\2\5"
    };

    static final short[] DFA73_eot = DFA.unpackEncodedString(DFA73_eotS);
    static final short[] DFA73_eof = DFA.unpackEncodedString(DFA73_eofS);
    static final char[] DFA73_min = DFA.unpackEncodedStringToUnsignedChars(DFA73_minS);
    static final char[] DFA73_max = DFA.unpackEncodedStringToUnsignedChars(DFA73_maxS);
    static final short[] DFA73_accept = DFA.unpackEncodedString(DFA73_acceptS);
    static final short[] DFA73_special = DFA.unpackEncodedString(DFA73_specialS);
    static final short[][] DFA73_transition;

    static {
        int numStates = DFA73_transitionS.length;
        DFA73_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA73_transition[i] = DFA.unpackEncodedString(DFA73_transitionS[i]);
        }
    }

    class DFA73 extends DFA {

        public DFA73(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 73;
            this.eot = DFA73_eot;
            this.eof = DFA73_eof;
            this.min = DFA73_min;
            this.max = DFA73_max;
            this.accept = DFA73_accept;
            this.special = DFA73_special;
            this.transition = DFA73_transition;
        }
        public String getDescription() {
            return "360:1: rewrite_alternative options {backtrack=true; } : ( rewrite_template | rewrite_tree_alternative | -> ^( ALT[\"ALT\"] EPSILON[\"EPSILON\"] EOA[\"EOA\"] ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA73_4 = input.LA(1);

                         
                        int index73_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_ANTLRv3()) ) {s = 9;}

                        else if ( (synpred2_ANTLRv3()) ) {s = 5;}

                         
                        input.seek(index73_4);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 73, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA76_eotS =
        "\16\uffff";
    static final String DFA76_eofS =
        "\1\uffff\4\12\1\uffff\1\12\4\uffff\3\12";
    static final String DFA76_minS =
        "\5\44\1\54\1\44\4\uffff\3\44";
    static final String DFA76_maxS =
        "\5\135\1\63\1\135\4\uffff\3\135";
    static final String DFA76_acceptS =
        "\7\uffff\1\3\1\4\1\2\1\1\3\uffff";
    static final String DFA76_specialS =
        "\16\uffff}>";
    static final String[] DFA76_transitionS = {
            "\1\7\7\uffff\1\2\1\4\1\1\1\6\3\uffff\1\3\35\uffff\1\10\13\uffff"+
            "\1\5",
            "\1\12\2\uffff\1\12\4\uffff\4\12\3\uffff\1\12\23\uffff\1\12"+
            "\2\uffff\1\11\6\uffff\3\12\7\uffff\2\11\1\12",
            "\1\12\2\uffff\1\12\4\uffff\4\12\2\uffff\1\13\1\12\23\uffff"+
            "\1\12\2\uffff\1\11\6\uffff\3\12\7\uffff\2\11\1\12",
            "\1\12\2\uffff\1\12\4\uffff\4\12\3\uffff\1\12\23\uffff\1\12"+
            "\2\uffff\1\11\6\uffff\3\12\7\uffff\2\11\1\12",
            "\1\12\2\uffff\1\12\4\uffff\4\12\3\uffff\1\12\23\uffff\1\12"+
            "\2\uffff\1\11\6\uffff\3\12\7\uffff\2\11\1\12",
            "\1\14\6\uffff\1\15",
            "\1\12\2\uffff\1\12\4\uffff\4\12\3\uffff\1\12\23\uffff\1\12"+
            "\2\uffff\1\11\6\uffff\3\12\7\uffff\2\11\1\12",
            "",
            "",
            "",
            "",
            "\1\12\2\uffff\1\12\4\uffff\4\12\3\uffff\1\12\23\uffff\1\12"+
            "\2\uffff\1\11\6\uffff\3\12\7\uffff\2\11\1\12",
            "\1\12\2\uffff\1\12\4\uffff\4\12\3\uffff\1\12\23\uffff\1\12"+
            "\2\uffff\1\11\6\uffff\3\12\7\uffff\2\11\1\12",
            "\1\12\2\uffff\1\12\4\uffff\4\12\3\uffff\1\12\23\uffff\1\12"+
            "\2\uffff\1\11\6\uffff\3\12\7\uffff\2\11\1\12"
    };

    static final short[] DFA76_eot = DFA.unpackEncodedString(DFA76_eotS);
    static final short[] DFA76_eof = DFA.unpackEncodedString(DFA76_eofS);
    static final char[] DFA76_min = DFA.unpackEncodedStringToUnsignedChars(DFA76_minS);
    static final char[] DFA76_max = DFA.unpackEncodedStringToUnsignedChars(DFA76_maxS);
    static final short[] DFA76_accept = DFA.unpackEncodedString(DFA76_acceptS);
    static final short[] DFA76_special = DFA.unpackEncodedString(DFA76_specialS);
    static final short[][] DFA76_transition;

    static {
        int numStates = DFA76_transitionS.length;
        DFA76_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA76_transition[i] = DFA.unpackEncodedString(DFA76_transitionS[i]);
        }
    }

    class DFA76 extends DFA {

        public DFA76(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 76;
            this.eot = DFA76_eot;
            this.eof = DFA76_eof;
            this.min = DFA76_min;
            this.max = DFA76_max;
            this.accept = DFA76_accept;
            this.special = DFA76_special;
            this.transition = DFA76_transition;
        }
        public String getDescription() {
            return "376:1: rewrite_tree_element : ( rewrite_tree_atom | rewrite_tree_atom ebnfSuffix -> ^( ebnfSuffix ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] rewrite_tree_atom EOA[\"EOA\"] ) EOB[\"EOB\"] ) ) | rewrite_tree ( ebnfSuffix -> ^( ebnfSuffix ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] rewrite_tree EOA[\"EOA\"] ) EOB[\"EOB\"] ) ) | -> rewrite_tree ) | rewrite_tree_ebnf );";
        }
    }
    static final String DFA81_eotS =
        "\22\uffff";
    static final String DFA81_eofS =
        "\10\uffff\1\12\11\uffff";
    static final String DFA81_minS =
        "\1\54\2\121\2\uffff\1\54\2\51\1\47\1\57\2\uffff\1\120\1\54\2\51"+
        "\1\57\1\120";
    static final String DFA81_maxS =
        "\3\121\2\uffff\1\123\2\51\1\123\1\57\2\uffff\1\123\1\63\2\51\1\57"+
        "\1\123";
    static final String DFA81_acceptS =
        "\3\uffff\1\3\1\4\5\uffff\1\2\1\1\6\uffff";
    static final String DFA81_specialS =
        "\22\uffff}>";
    static final String[] DFA81_transitionS = {
            "\1\1\2\uffff\1\4\3\uffff\1\2\35\uffff\1\3",
            "\1\5",
            "\1\5",
            "",
            "",
            "\1\6\6\uffff\1\7\37\uffff\1\10",
            "\1\11",
            "\1\11",
            "\1\12\14\uffff\2\13\21\uffff\1\12\12\uffff\2\12",
            "\1\14",
            "",
            "",
            "\1\15\2\uffff\1\10",
            "\1\16\6\uffff\1\17",
            "\1\20",
            "\1\20",
            "\1\21",
            "\1\15\2\uffff\1\10"
    };

    static final short[] DFA81_eot = DFA.unpackEncodedString(DFA81_eotS);
    static final short[] DFA81_eof = DFA.unpackEncodedString(DFA81_eofS);
    static final char[] DFA81_min = DFA.unpackEncodedStringToUnsignedChars(DFA81_minS);
    static final char[] DFA81_max = DFA.unpackEncodedStringToUnsignedChars(DFA81_maxS);
    static final short[] DFA81_accept = DFA.unpackEncodedString(DFA81_acceptS);
    static final short[] DFA81_special = DFA.unpackEncodedString(DFA81_specialS);
    static final short[][] DFA81_transition;

    static {
        int numStates = DFA81_transitionS.length;
        DFA81_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA81_transition[i] = DFA.unpackEncodedString(DFA81_transitionS[i]);
        }
    }

    class DFA81 extends DFA {

        public DFA81(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 81;
            this.eot = DFA81_eot;
            this.eof = DFA81_eof;
            this.min = DFA81_min;
            this.max = DFA81_max;
            this.accept = DFA81_accept;
            this.special = DFA81_special;
            this.transition = DFA81_transition;
        }
        public String getDescription() {
            return "413:1: rewrite_template : ( id lp= '(' rewrite_template_args ')' (str= DOUBLE_QUOTE_STRING_LITERAL | str= DOUBLE_ANGLE_STRING_LITERAL ) -> ^( TEMPLATE[$lp,\"TEMPLATE\"] id rewrite_template_args $str) | rewrite_template_ref | rewrite_indirect_template_head | ACTION );";
        }
    }
 

    public static final BitSet FOLLOW_DOC_COMMENT_in_grammarDef367 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000078L});
    public static final BitSet FOLLOW_67_in_grammarDef377 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_68_in_grammarDef395 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_69_in_grammarDef411 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_grammarDef452 = new BitSet(new long[]{0x0008100000000000L});
    public static final BitSet FOLLOW_id_in_grammarDef454 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_grammarDef456 = new BitSet(new long[]{0x0009190840000010L,0x0000000000003800L});
    public static final BitSet FOLLOW_optionsSpec_in_grammarDef458 = new BitSet(new long[]{0x0009190840000010L,0x0000000000003800L});
    public static final BitSet FOLLOW_tokensSpec_in_grammarDef461 = new BitSet(new long[]{0x0009190840000010L,0x0000000000003800L});
    public static final BitSet FOLLOW_attrScope_in_grammarDef464 = new BitSet(new long[]{0x0009190840000010L,0x0000000000003800L});
    public static final BitSet FOLLOW_action_in_grammarDef467 = new BitSet(new long[]{0x0009190840000010L,0x0000000000003800L});
    public static final BitSet FOLLOW_rule_in_grammarDef475 = new BitSet(new long[]{0x0009190840000010L,0x0000000000003800L});
    public static final BitSet FOLLOW_EOF_in_grammarDef483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOKENS_in_tokensSpec544 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_tokenSpec_in_tokensSpec546 = new BitSet(new long[]{0x0000100000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_tokensSpec549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOKEN_REF_in_tokenSpec569 = new BitSet(new long[]{0x0000020000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_LABEL_ASSIGN_in_tokenSpec575 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_tokenSpec580 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_CHAR_LITERAL_in_tokenSpec584 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_tokenSpec623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SCOPE_in_attrScope634 = new BitSet(new long[]{0x0008100000000000L});
    public static final BitSet FOLLOW_id_in_attrScope636 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_ACTION_in_attrScope638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_action661 = new BitSet(new long[]{0x0008100000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_actionScopeName_in_action664 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_action666 = new BitSet(new long[]{0x0008100000000000L});
    public static final BitSet FOLLOW_id_in_action670 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_ACTION_in_action672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_actionScopeName698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_actionScopeName705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_actionScopeName722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPTIONS_in_optionsSpec738 = new BitSet(new long[]{0x0008100000000000L});
    public static final BitSet FOLLOW_option_in_optionsSpec741 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_optionsSpec743 = new BitSet(new long[]{0x0008100000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_optionsSpec747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_option772 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_LABEL_ASSIGN_in_option774 = new BitSet(new long[]{0x000A700000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_optionValue_in_option776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qid_in_optionValue805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_optionValue815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_LITERAL_in_optionValue825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_optionValue835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_optionValue845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOC_COMMENT_in_rule870 = new BitSet(new long[]{0x0008100800000000L,0x0000000000003800L});
    public static final BitSet FOLLOW_75_in_rule880 = new BitSet(new long[]{0x0008100000000000L});
    public static final BitSet FOLLOW_76_in_rule882 = new BitSet(new long[]{0x0008100000000000L});
    public static final BitSet FOLLOW_77_in_rule884 = new BitSet(new long[]{0x0008100000000000L});
    public static final BitSet FOLLOW_FRAGMENT_in_rule886 = new BitSet(new long[]{0x0008100000000000L});
    public static final BitSet FOLLOW_id_in_rule894 = new BitSet(new long[]{0x0005014040800000L,0x000000000000C000L});
    public static final BitSet FOLLOW_BANG_in_rule900 = new BitSet(new long[]{0x0005010040800000L,0x000000000000C000L});
    public static final BitSet FOLLOW_ARG_ACTION_in_rule909 = new BitSet(new long[]{0x0001010040800000L,0x000000000000C000L});
    public static final BitSet FOLLOW_RET_in_rule918 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_ARG_ACTION_in_rule922 = new BitSet(new long[]{0x0001010040000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_throwsSpec_in_rule930 = new BitSet(new long[]{0x0001010040000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_optionsSpec_in_rule933 = new BitSet(new long[]{0x0000010040000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleScopeSpec_in_rule936 = new BitSet(new long[]{0x0000010000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleAction_in_rule939 = new BitSet(new long[]{0x0000010000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_rule944 = new BitSet(new long[]{0x0008F09080000000L,0x0000000004820000L});
    public static final BitSet FOLLOW_altList_in_rule946 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_rule948 = new BitSet(new long[]{0x0000000000000002L,0x0000000000300000L});
    public static final BitSet FOLLOW_exceptionGroup_in_rule952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_ruleAction1058 = new BitSet(new long[]{0x0008100000000000L});
    public static final BitSet FOLLOW_id_in_ruleAction1060 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_ACTION_in_ruleAction1062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_throwsSpec1083 = new BitSet(new long[]{0x0008100000000000L});
    public static final BitSet FOLLOW_id_in_throwsSpec1085 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_throwsSpec1089 = new BitSet(new long[]{0x0008100000000000L});
    public static final BitSet FOLLOW_id_in_throwsSpec1091 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_SCOPE_in_ruleScopeSpec1114 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_ACTION_in_ruleScopeSpec1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SCOPE_in_ruleScopeSpec1129 = new BitSet(new long[]{0x0008100000000000L});
    public static final BitSet FOLLOW_id_in_ruleScopeSpec1131 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010080L});
    public static final BitSet FOLLOW_80_in_ruleScopeSpec1134 = new BitSet(new long[]{0x0008100000000000L});
    public static final BitSet FOLLOW_id_in_ruleScopeSpec1136 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010080L});
    public static final BitSet FOLLOW_71_in_ruleScopeSpec1140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SCOPE_in_ruleScopeSpec1154 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_ACTION_in_ruleScopeSpec1156 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_SCOPE_in_ruleScopeSpec1160 = new BitSet(new long[]{0x0008100000000000L});
    public static final BitSet FOLLOW_id_in_ruleScopeSpec1162 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010080L});
    public static final BitSet FOLLOW_80_in_ruleScopeSpec1165 = new BitSet(new long[]{0x0008100000000000L});
    public static final BitSet FOLLOW_id_in_ruleScopeSpec1167 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010080L});
    public static final BitSet FOLLOW_71_in_ruleScopeSpec1171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_block1203 = new BitSet(new long[]{0x0009F09080000000L,0x0000000004824000L});
    public static final BitSet FOLLOW_optionsSpec_in_block1212 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_block1216 = new BitSet(new long[]{0x0008F09080000000L,0x0000000004820000L});
    public static final BitSet FOLLOW_altpair_in_block1223 = new BitSet(new long[]{0x0000000000000000L,0x00000000000C0000L});
    public static final BitSet FOLLOW_82_in_block1227 = new BitSet(new long[]{0x0008F09080000000L,0x0000000004820000L});
    public static final BitSet FOLLOW_altpair_in_block1229 = new BitSet(new long[]{0x0000000000000000L,0x00000000000C0000L});
    public static final BitSet FOLLOW_83_in_block1244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alternative_in_altpair1283 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rewrite_in_altpair1285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_altpair_in_altList1305 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_altList1309 = new BitSet(new long[]{0x0008F09080000000L,0x0000000004820000L});
    public static final BitSet FOLLOW_altpair_in_altList1311 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_element_in_alternative1352 = new BitSet(new long[]{0x0008F01080000002L,0x0000000004820000L});
    public static final BitSet FOLLOW_exceptionHandler_in_exceptionGroup1403 = new BitSet(new long[]{0x0000000000000002L,0x0000000000300000L});
    public static final BitSet FOLLOW_finallyClause_in_exceptionGroup1410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_finallyClause_in_exceptionGroup1418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_exceptionHandler1438 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_ARG_ACTION_in_exceptionHandler1440 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_ACTION_in_exceptionHandler1442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_finallyClause1472 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_ACTION_in_finallyClause1474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_element1496 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_LABEL_ASSIGN_in_element1501 = new BitSet(new long[]{0x0008700000000000L,0x0000000004800000L});
    public static final BitSet FOLLOW_LIST_LABEL_ASSIGN_in_element1505 = new BitSet(new long[]{0x0008700000000000L,0x0000000004800000L});
    public static final BitSet FOLLOW_atom_in_element1508 = new BitSet(new long[]{0x0000000000000002L,0x0000000018000400L});
    public static final BitSet FOLLOW_ebnfSuffix_in_element1514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_element1573 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_LABEL_ASSIGN_in_element1578 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_LIST_LABEL_ASSIGN_in_element1582 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_block_in_element1585 = new BitSet(new long[]{0x0000000000000002L,0x0000000018000400L});
    public static final BitSet FOLLOW_ebnfSuffix_in_element1591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_element1650 = new BitSet(new long[]{0x0000000000000002L,0x0000000018000400L});
    public static final BitSet FOLLOW_ebnfSuffix_in_element1656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ebnf_in_element1702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACTION_in_element1709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMPRED_in_element1716 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_element1722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_treeSpec_in_element1742 = new BitSet(new long[]{0x0000000000000002L,0x0000000018000400L});
    public static final BitSet FOLLOW_ebnfSuffix_in_element1748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminal_in_atom1800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_range_in_atom1805 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_ROOT_in_atom1815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BANG_in_atom1819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notSet_in_atom1853 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_ROOT_in_atom1862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BANG_in_atom1866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REF_in_atom1902 = new BitSet(new long[]{0x0004006000000002L});
    public static final BitSet FOLLOW_ARG_ACTION_in_atom1904 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_ROOT_in_atom1914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BANG_in_atom1918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_notSet1966 = new BitSet(new long[]{0x0000700000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_notTerminal_in_notSet1972 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_elementOptions_in_notSet1974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_notSet1992 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_elementOptions_in_notSet1994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_notTerminal0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_elementOptions2046 = new BitSet(new long[]{0x0008100000000000L});
    public static final BitSet FOLLOW_qid_in_elementOptions2048 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_elementOptions2050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_elementOptions2068 = new BitSet(new long[]{0x0008100000000000L});
    public static final BitSet FOLLOW_option_in_elementOptions2070 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000080L});
    public static final BitSet FOLLOW_71_in_elementOptions2073 = new BitSet(new long[]{0x0008100000000000L});
    public static final BitSet FOLLOW_option_in_elementOptions2075 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000080L});
    public static final BitSet FOLLOW_89_in_elementOptions2079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_elementOption2099 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_LABEL_ASSIGN_in_elementOption2101 = new BitSet(new long[]{0x000A700000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_optionValue_in_elementOption2103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TREE_BEGIN_in_treeSpec2125 = new BitSet(new long[]{0x0008F01080000000L,0x0000000004820000L});
    public static final BitSet FOLLOW_element_in_treeSpec2127 = new BitSet(new long[]{0x0008F01080000000L,0x0000000004820000L});
    public static final BitSet FOLLOW_element_in_treeSpec2131 = new BitSet(new long[]{0x0008F01080000000L,0x00000000048A0000L});
    public static final BitSet FOLLOW_83_in_treeSpec2136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_LITERAL_in_range2159 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RANGE_in_range2161 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_CHAR_LITERAL_in_range2165 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_elementOptions_in_range2167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_LITERAL_in_terminal2204 = new BitSet(new long[]{0x0000006000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_elementOptions_in_terminal2206 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_TOKEN_REF_in_terminal2237 = new BitSet(new long[]{0x0004006000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_ARG_ACTION_in_terminal2239 = new BitSet(new long[]{0x0000006000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_elementOptions_in_terminal2242 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_terminal2263 = new BitSet(new long[]{0x0000006000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_elementOptions_in_terminal2265 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_90_in_terminal2286 = new BitSet(new long[]{0x0000006000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_elementOptions_in_terminal2288 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_ROOT_in_terminal2315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BANG_in_terminal2336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_ebnf2379 = new BitSet(new long[]{0x0000000000000002L,0x0000000018400400L});
    public static final BitSet FOLLOW_91_in_ebnf2387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ebnf2404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ebnf2421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ebnf2438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ebnfSuffix2523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ebnfSuffix2535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ebnfSuffix2548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REWRITE_in_rewrite2577 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_SEMPRED_in_rewrite2581 = new BitSet(new long[]{0x0008F09000000000L,0x0000000020020000L});
    public static final BitSet FOLLOW_rewrite_alternative_in_rewrite2585 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_REWRITE_in_rewrite2593 = new BitSet(new long[]{0x0008F01000000000L,0x0000000020020000L});
    public static final BitSet FOLLOW_rewrite_alternative_in_rewrite2597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rewrite_template_in_rewrite_alternative2648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rewrite_tree_alternative_in_rewrite_alternative2653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_rewrite_tree_block2695 = new BitSet(new long[]{0x0008F01000000000L,0x0000000020020000L});
    public static final BitSet FOLLOW_rewrite_tree_alternative_in_rewrite_tree_block2697 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_rewrite_tree_block2699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rewrite_tree_element_in_rewrite_tree_alternative2733 = new BitSet(new long[]{0x0008F01000000002L,0x0000000020020000L});
    public static final BitSet FOLLOW_rewrite_tree_atom_in_rewrite_tree_element2761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rewrite_tree_atom_in_rewrite_tree_element2766 = new BitSet(new long[]{0x0000000000000000L,0x0000000018000400L});
    public static final BitSet FOLLOW_ebnfSuffix_in_rewrite_tree_element2768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rewrite_tree_in_rewrite_tree_element2802 = new BitSet(new long[]{0x0000000000000002L,0x0000000018000400L});
    public static final BitSet FOLLOW_ebnfSuffix_in_rewrite_tree_element2808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rewrite_tree_ebnf_in_rewrite_tree_element2854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_LITERAL_in_rewrite_tree_atom2870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOKEN_REF_in_rewrite_tree_atom2877 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_ARG_ACTION_in_rewrite_tree_atom2879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REF_in_rewrite_tree_atom2900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_rewrite_tree_atom2907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_rewrite_tree_atom2916 = new BitSet(new long[]{0x0008100000000000L});
    public static final BitSet FOLLOW_id_in_rewrite_tree_atom2918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACTION_in_rewrite_tree_atom2929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rewrite_tree_block_in_rewrite_tree_ebnf2950 = new BitSet(new long[]{0x0000000000000000L,0x0000000018000400L});
    public static final BitSet FOLLOW_ebnfSuffix_in_rewrite_tree_ebnf2952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TREE_BEGIN_in_rewrite_tree2972 = new BitSet(new long[]{0x0008F00000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_rewrite_tree_atom_in_rewrite_tree2974 = new BitSet(new long[]{0x0008F01000000000L,0x00000000200A0000L});
    public static final BitSet FOLLOW_rewrite_tree_element_in_rewrite_tree2976 = new BitSet(new long[]{0x0008F01000000000L,0x00000000200A0000L});
    public static final BitSet FOLLOW_83_in_rewrite_tree2979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_rewrite_template3011 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_rewrite_template3015 = new BitSet(new long[]{0x0008100000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_rewrite_template_args_in_rewrite_template3017 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_rewrite_template3019 = new BitSet(new long[]{0x0030000000000000L});
    public static final BitSet FOLLOW_DOUBLE_QUOTE_STRING_LITERAL_in_rewrite_template3027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_ANGLE_STRING_LITERAL_in_rewrite_template3033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rewrite_template_ref_in_rewrite_template3060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rewrite_indirect_template_head_in_rewrite_template3069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACTION_in_rewrite_template3078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_rewrite_template_ref3091 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_rewrite_template_ref3095 = new BitSet(new long[]{0x0008100000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_rewrite_template_args_in_rewrite_template_ref3097 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_rewrite_template_ref3099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_rewrite_indirect_template_head3127 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_ACTION_in_rewrite_indirect_template_head3129 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_rewrite_indirect_template_head3131 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_rewrite_indirect_template_head3133 = new BitSet(new long[]{0x0008100000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_rewrite_template_args_in_rewrite_indirect_template_head3135 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_rewrite_indirect_template_head3137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rewrite_template_arg_in_rewrite_template_args3161 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_rewrite_template_args3164 = new BitSet(new long[]{0x0008100000000000L});
    public static final BitSet FOLLOW_rewrite_template_arg_in_rewrite_template_args3166 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_id_in_rewrite_template_arg3199 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_LABEL_ASSIGN_in_rewrite_template_arg3201 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_ACTION_in_rewrite_template_arg3203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_qid3224 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_qid3227 = new BitSet(new long[]{0x0008100000000000L});
    public static final BitSet FOLLOW_id_in_qid3229 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_TOKEN_REF_in_id3241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REF_in_id3251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rewrite_template_in_synpred1_ANTLRv32648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rewrite_tree_alternative_in_synpred2_ANTLRv32653 = new BitSet(new long[]{0x0000000000000002L});

}