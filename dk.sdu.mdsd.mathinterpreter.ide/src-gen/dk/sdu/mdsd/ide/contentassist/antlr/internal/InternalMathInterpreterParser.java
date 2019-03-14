package dk.sdu.mdsd.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import dk.sdu.mdsd.services.MathInterpreterGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMathInterpreterParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'solve'", "'given'", "'='", "'('", "')'", "'+'", "'-'", "'*'", "'/'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalMathInterpreterParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMathInterpreterParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMathInterpreterParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMathInterpreter.g"; }


    	private MathInterpreterGrammarAccess grammarAccess;

    	public void setGrammarAccess(MathInterpreterGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleSolution"
    // InternalMathInterpreter.g:53:1: entryRuleSolution : ruleSolution EOF ;
    public final void entryRuleSolution() throws RecognitionException {
        try {
            // InternalMathInterpreter.g:54:1: ( ruleSolution EOF )
            // InternalMathInterpreter.g:55:1: ruleSolution EOF
            {
             before(grammarAccess.getSolutionRule()); 
            pushFollow(FOLLOW_1);
            ruleSolution();

            state._fsp--;

             after(grammarAccess.getSolutionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSolution"


    // $ANTLR start "ruleSolution"
    // InternalMathInterpreter.g:62:1: ruleSolution : ( ( rule__Solution__Group__0 ) ) ;
    public final void ruleSolution() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathInterpreter.g:66:2: ( ( ( rule__Solution__Group__0 ) ) )
            // InternalMathInterpreter.g:67:2: ( ( rule__Solution__Group__0 ) )
            {
            // InternalMathInterpreter.g:67:2: ( ( rule__Solution__Group__0 ) )
            // InternalMathInterpreter.g:68:3: ( rule__Solution__Group__0 )
            {
             before(grammarAccess.getSolutionAccess().getGroup()); 
            // InternalMathInterpreter.g:69:3: ( rule__Solution__Group__0 )
            // InternalMathInterpreter.g:69:4: rule__Solution__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Solution__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSolutionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSolution"


    // $ANTLR start "entryRuleVariable"
    // InternalMathInterpreter.g:78:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalMathInterpreter.g:79:1: ( ruleVariable EOF )
            // InternalMathInterpreter.g:80:1: ruleVariable EOF
            {
             before(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getVariableRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalMathInterpreter.g:87:1: ruleVariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathInterpreter.g:91:2: ( ( ( rule__Variable__Group__0 ) ) )
            // InternalMathInterpreter.g:92:2: ( ( rule__Variable__Group__0 ) )
            {
            // InternalMathInterpreter.g:92:2: ( ( rule__Variable__Group__0 ) )
            // InternalMathInterpreter.g:93:3: ( rule__Variable__Group__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup()); 
            // InternalMathInterpreter.g:94:3: ( rule__Variable__Group__0 )
            // InternalMathInterpreter.g:94:4: rule__Variable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleExpression"
    // InternalMathInterpreter.g:103:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalMathInterpreter.g:104:1: ( ruleExpression EOF )
            // InternalMathInterpreter.g:105:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalMathInterpreter.g:112:1: ruleExpression : ( ( rule__Expression__ExpAssignment ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathInterpreter.g:116:2: ( ( ( rule__Expression__ExpAssignment ) ) )
            // InternalMathInterpreter.g:117:2: ( ( rule__Expression__ExpAssignment ) )
            {
            // InternalMathInterpreter.g:117:2: ( ( rule__Expression__ExpAssignment ) )
            // InternalMathInterpreter.g:118:3: ( rule__Expression__ExpAssignment )
            {
             before(grammarAccess.getExpressionAccess().getExpAssignment()); 
            // InternalMathInterpreter.g:119:3: ( rule__Expression__ExpAssignment )
            // InternalMathInterpreter.g:119:4: rule__Expression__ExpAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Expression__ExpAssignment();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getExpAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRulePlusOrMinus"
    // InternalMathInterpreter.g:128:1: entryRulePlusOrMinus : rulePlusOrMinus EOF ;
    public final void entryRulePlusOrMinus() throws RecognitionException {
        try {
            // InternalMathInterpreter.g:129:1: ( rulePlusOrMinus EOF )
            // InternalMathInterpreter.g:130:1: rulePlusOrMinus EOF
            {
             before(grammarAccess.getPlusOrMinusRule()); 
            pushFollow(FOLLOW_1);
            rulePlusOrMinus();

            state._fsp--;

             after(grammarAccess.getPlusOrMinusRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePlusOrMinus"


    // $ANTLR start "rulePlusOrMinus"
    // InternalMathInterpreter.g:137:1: rulePlusOrMinus : ( ( rule__PlusOrMinus__Group__0 ) ) ;
    public final void rulePlusOrMinus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathInterpreter.g:141:2: ( ( ( rule__PlusOrMinus__Group__0 ) ) )
            // InternalMathInterpreter.g:142:2: ( ( rule__PlusOrMinus__Group__0 ) )
            {
            // InternalMathInterpreter.g:142:2: ( ( rule__PlusOrMinus__Group__0 ) )
            // InternalMathInterpreter.g:143:3: ( rule__PlusOrMinus__Group__0 )
            {
             before(grammarAccess.getPlusOrMinusAccess().getGroup()); 
            // InternalMathInterpreter.g:144:3: ( rule__PlusOrMinus__Group__0 )
            // InternalMathInterpreter.g:144:4: rule__PlusOrMinus__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPlusOrMinusAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePlusOrMinus"


    // $ANTLR start "entryRuleMultiplyOrDivide"
    // InternalMathInterpreter.g:153:1: entryRuleMultiplyOrDivide : ruleMultiplyOrDivide EOF ;
    public final void entryRuleMultiplyOrDivide() throws RecognitionException {
        try {
            // InternalMathInterpreter.g:154:1: ( ruleMultiplyOrDivide EOF )
            // InternalMathInterpreter.g:155:1: ruleMultiplyOrDivide EOF
            {
             before(grammarAccess.getMultiplyOrDivideRule()); 
            pushFollow(FOLLOW_1);
            ruleMultiplyOrDivide();

            state._fsp--;

             after(grammarAccess.getMultiplyOrDivideRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMultiplyOrDivide"


    // $ANTLR start "ruleMultiplyOrDivide"
    // InternalMathInterpreter.g:162:1: ruleMultiplyOrDivide : ( ( rule__MultiplyOrDivide__Group__0 ) ) ;
    public final void ruleMultiplyOrDivide() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathInterpreter.g:166:2: ( ( ( rule__MultiplyOrDivide__Group__0 ) ) )
            // InternalMathInterpreter.g:167:2: ( ( rule__MultiplyOrDivide__Group__0 ) )
            {
            // InternalMathInterpreter.g:167:2: ( ( rule__MultiplyOrDivide__Group__0 ) )
            // InternalMathInterpreter.g:168:3: ( rule__MultiplyOrDivide__Group__0 )
            {
             before(grammarAccess.getMultiplyOrDivideAccess().getGroup()); 
            // InternalMathInterpreter.g:169:3: ( rule__MultiplyOrDivide__Group__0 )
            // InternalMathInterpreter.g:169:4: rule__MultiplyOrDivide__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MultiplyOrDivide__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplyOrDivideAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiplyOrDivide"


    // $ANTLR start "entryRulePrimary"
    // InternalMathInterpreter.g:178:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalMathInterpreter.g:179:1: ( rulePrimary EOF )
            // InternalMathInterpreter.g:180:1: rulePrimary EOF
            {
             before(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPrimaryRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalMathInterpreter.g:187:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathInterpreter.g:191:2: ( ( ( rule__Primary__Alternatives ) ) )
            // InternalMathInterpreter.g:192:2: ( ( rule__Primary__Alternatives ) )
            {
            // InternalMathInterpreter.g:192:2: ( ( rule__Primary__Alternatives ) )
            // InternalMathInterpreter.g:193:3: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // InternalMathInterpreter.g:194:3: ( rule__Primary__Alternatives )
            // InternalMathInterpreter.g:194:4: rule__Primary__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "rule__PlusOrMinus__Alternatives_1"
    // InternalMathInterpreter.g:202:1: rule__PlusOrMinus__Alternatives_1 : ( ( ( rule__PlusOrMinus__Group_1_0__0 ) ) | ( ( rule__PlusOrMinus__Group_1_1__0 ) ) );
    public final void rule__PlusOrMinus__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathInterpreter.g:206:1: ( ( ( rule__PlusOrMinus__Group_1_0__0 ) ) | ( ( rule__PlusOrMinus__Group_1_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==16) ) {
                alt1=1;
            }
            else if ( (LA1_0==17) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMathInterpreter.g:207:2: ( ( rule__PlusOrMinus__Group_1_0__0 ) )
                    {
                    // InternalMathInterpreter.g:207:2: ( ( rule__PlusOrMinus__Group_1_0__0 ) )
                    // InternalMathInterpreter.g:208:3: ( rule__PlusOrMinus__Group_1_0__0 )
                    {
                     before(grammarAccess.getPlusOrMinusAccess().getGroup_1_0()); 
                    // InternalMathInterpreter.g:209:3: ( rule__PlusOrMinus__Group_1_0__0 )
                    // InternalMathInterpreter.g:209:4: rule__PlusOrMinus__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PlusOrMinus__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPlusOrMinusAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMathInterpreter.g:213:2: ( ( rule__PlusOrMinus__Group_1_1__0 ) )
                    {
                    // InternalMathInterpreter.g:213:2: ( ( rule__PlusOrMinus__Group_1_1__0 ) )
                    // InternalMathInterpreter.g:214:3: ( rule__PlusOrMinus__Group_1_1__0 )
                    {
                     before(grammarAccess.getPlusOrMinusAccess().getGroup_1_1()); 
                    // InternalMathInterpreter.g:215:3: ( rule__PlusOrMinus__Group_1_1__0 )
                    // InternalMathInterpreter.g:215:4: rule__PlusOrMinus__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PlusOrMinus__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPlusOrMinusAccess().getGroup_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Alternatives_1"


    // $ANTLR start "rule__MultiplyOrDivide__Alternatives_1"
    // InternalMathInterpreter.g:223:1: rule__MultiplyOrDivide__Alternatives_1 : ( ( ( rule__MultiplyOrDivide__Group_1_0__0 ) ) | ( ( rule__MultiplyOrDivide__Group_1_1__0 ) ) );
    public final void rule__MultiplyOrDivide__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathInterpreter.g:227:1: ( ( ( rule__MultiplyOrDivide__Group_1_0__0 ) ) | ( ( rule__MultiplyOrDivide__Group_1_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==18) ) {
                alt2=1;
            }
            else if ( (LA2_0==19) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMathInterpreter.g:228:2: ( ( rule__MultiplyOrDivide__Group_1_0__0 ) )
                    {
                    // InternalMathInterpreter.g:228:2: ( ( rule__MultiplyOrDivide__Group_1_0__0 ) )
                    // InternalMathInterpreter.g:229:3: ( rule__MultiplyOrDivide__Group_1_0__0 )
                    {
                     before(grammarAccess.getMultiplyOrDivideAccess().getGroup_1_0()); 
                    // InternalMathInterpreter.g:230:3: ( rule__MultiplyOrDivide__Group_1_0__0 )
                    // InternalMathInterpreter.g:230:4: rule__MultiplyOrDivide__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MultiplyOrDivide__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultiplyOrDivideAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMathInterpreter.g:234:2: ( ( rule__MultiplyOrDivide__Group_1_1__0 ) )
                    {
                    // InternalMathInterpreter.g:234:2: ( ( rule__MultiplyOrDivide__Group_1_1__0 ) )
                    // InternalMathInterpreter.g:235:3: ( rule__MultiplyOrDivide__Group_1_1__0 )
                    {
                     before(grammarAccess.getMultiplyOrDivideAccess().getGroup_1_1()); 
                    // InternalMathInterpreter.g:236:3: ( rule__MultiplyOrDivide__Group_1_1__0 )
                    // InternalMathInterpreter.g:236:4: rule__MultiplyOrDivide__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MultiplyOrDivide__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultiplyOrDivideAccess().getGroup_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplyOrDivide__Alternatives_1"


    // $ANTLR start "rule__Primary__Alternatives"
    // InternalMathInterpreter.g:244:1: rule__Primary__Alternatives : ( ( ( rule__Primary__Group_0__0 ) ) | ( ( rule__Primary__Group_1__0 ) ) | ( ( rule__Primary__Group_2__0 ) ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathInterpreter.g:248:1: ( ( ( rule__Primary__Group_0__0 ) ) | ( ( rule__Primary__Group_1__0 ) ) | ( ( rule__Primary__Group_2__0 ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt3=1;
                }
                break;
            case RULE_ID:
                {
                alt3=2;
                }
                break;
            case 14:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMathInterpreter.g:249:2: ( ( rule__Primary__Group_0__0 ) )
                    {
                    // InternalMathInterpreter.g:249:2: ( ( rule__Primary__Group_0__0 ) )
                    // InternalMathInterpreter.g:250:3: ( rule__Primary__Group_0__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_0()); 
                    // InternalMathInterpreter.g:251:3: ( rule__Primary__Group_0__0 )
                    // InternalMathInterpreter.g:251:4: rule__Primary__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMathInterpreter.g:255:2: ( ( rule__Primary__Group_1__0 ) )
                    {
                    // InternalMathInterpreter.g:255:2: ( ( rule__Primary__Group_1__0 ) )
                    // InternalMathInterpreter.g:256:3: ( rule__Primary__Group_1__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_1()); 
                    // InternalMathInterpreter.g:257:3: ( rule__Primary__Group_1__0 )
                    // InternalMathInterpreter.g:257:4: rule__Primary__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMathInterpreter.g:261:2: ( ( rule__Primary__Group_2__0 ) )
                    {
                    // InternalMathInterpreter.g:261:2: ( ( rule__Primary__Group_2__0 ) )
                    // InternalMathInterpreter.g:262:3: ( rule__Primary__Group_2__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_2()); 
                    // InternalMathInterpreter.g:263:3: ( rule__Primary__Group_2__0 )
                    // InternalMathInterpreter.g:263:4: rule__Primary__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Alternatives"


    // $ANTLR start "rule__Solution__Group__0"
    // InternalMathInterpreter.g:271:1: rule__Solution__Group__0 : rule__Solution__Group__0__Impl rule__Solution__Group__1 ;
    public final void rule__Solution__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathInterpreter.g:275:1: ( rule__Solution__Group__0__Impl rule__Solution__Group__1 )
            // InternalMathInterpreter.g:276:2: rule__Solution__Group__0__Impl rule__Solution__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Solution__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Solution__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Solution__Group__0"


    // $ANTLR start "rule__Solution__Group__0__Impl"
    // InternalMathInterpreter.g:283:1: rule__Solution__Group__0__Impl : ( ( rule__Solution__Group_0__0 )? ) ;
    public final void rule__Solution__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathInterpreter.g:287:1: ( ( ( rule__Solution__Group_0__0 )? ) )
            // InternalMathInterpreter.g:288:1: ( ( rule__Solution__Group_0__0 )? )
            {
            // InternalMathInterpreter.g:288:1: ( ( rule__Solution__Group_0__0 )? )
            // InternalMathInterpreter.g:289:2: ( rule__Solution__Group_0__0 )?
            {
             before(grammarAccess.getSolutionAccess().getGroup_0()); 
            // InternalMathInterpreter.g:290:2: ( rule__Solution__Group_0__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMathInterpreter.g:290:3: rule__Solution__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Solution__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSolutionAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Solution__Group__0__Impl"


    // $ANTLR start "rule__Solution__Group__1"
    // InternalMathInterpreter.g:298:1: rule__Solution__Group__1 : rule__Solution__Group__1__Impl rule__Solution__Group__2 ;
    public final void rule__Solution__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathInterpreter.g:302:1: ( rule__Solution__Group__1__Impl rule__Solution__Group__2 )
            // InternalMathInterpreter.g:303:2: rule__Solution__Group__1__Impl rule__Solution__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Solution__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Solution__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Solution__Group__1"


    // $ANTLR start "rule__Solution__Group__1__Impl"
    // InternalMathInterpreter.g:310:1: rule__Solution__Group__1__Impl : ( 'solve' ) ;
    public final void rule__Solution__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathInterpreter.g:314:1: ( ( 'solve' ) )
            // InternalMathInterpreter.g:315:1: ( 'solve' )
            {
            // InternalMathInterpreter.g:315:1: ( 'solve' )
            // InternalMathInterpreter.g:316:2: 'solve'
            {
             before(grammarAccess.getSolutionAccess().getSolveKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getSolutionAccess().getSolveKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Solution__Group__1__Impl"


    // $ANTLR start "rule__Solution__Group__2"
    // InternalMathInterpreter.g:325:1: rule__Solution__Group__2 : rule__Solution__Group__2__Impl ;
    public final void rule__Solution__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathInterpreter.g:329:1: ( rule__Solution__Group__2__Impl )
            // InternalMathInterpreter.g:330:2: rule__Solution__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Solution__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Solution__Group__2"


    // $ANTLR start "rule__Solution__Group__2__Impl"
    // InternalMathInterpreter.g:336:1: rule__Solution__Group__2__Impl : ( ( rule__Solution__ExpressionAssignment_2 ) ) ;
    public final void rule__Solution__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathInterpreter.g:340:1: ( ( ( rule__Solution__ExpressionAssignment_2 ) ) )
            // InternalMathInterpreter.g:341:1: ( ( rule__Solution__ExpressionAssignment_2 ) )
            {
            // InternalMathInterpreter.g:341:1: ( ( rule__Solution__ExpressionAssignment_2 ) )
            // InternalMathInterpreter.g:342:2: ( rule__Solution__ExpressionAssignment_2 )
            {
             before(grammarAccess.getSolutionAccess().getExpressionAssignment_2()); 
            // InternalMathInterpreter.g:343:2: ( rule__Solution__ExpressionAssignment_2 )
            // InternalMathInterpreter.g:343:3: rule__Solution__ExpressionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Solution__ExpressionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSolutionAccess().getExpressionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Solution__Group__2__Impl"


    // $ANTLR start "rule__Solution__Group_0__0"
    // InternalMathInterpreter.g:352:1: rule__Solution__Group_0__0 : rule__Solution__Group_0__0__Impl rule__Solution__Group_0__1 ;
    public final void rule__Solution__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathInterpreter.g:356:1: ( rule__Solution__Group_0__0__Impl rule__Solution__Group_0__1 )
            // InternalMathInterpreter.g:357:2: rule__Solution__Group_0__0__Impl rule__Solution__Group_0__1
            {
            pushFollow(FOLLOW_5);
            rule__Solution__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Solution__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Solution__Group_0__0"


    // $ANTLR start "rule__Solution__Group_0__0__Impl"
    // InternalMathInterpreter.g:364:1: rule__Solution__Group_0__0__Impl : ( 'given' ) ;
    public final void rule__Solution__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathInterpreter.g:368:1: ( ( 'given' ) )
            // InternalMathInterpreter.g:369:1: ( 'given' )
            {
            // InternalMathInterpreter.g:369:1: ( 'given' )
            // InternalMathInterpreter.g:370:2: 'given'
            {
             before(grammarAccess.getSolutionAccess().getGivenKeyword_0_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getSolutionAccess().getGivenKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Solution__Group_0__0__Impl"


    // $ANTLR start "rule__Solution__Group_0__1"
    // InternalMathInterpreter.g:379:1: rule__Solution__Group_0__1 : rule__Solution__Group_0__1__Impl ;
    public final void rule__Solution__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathInterpreter.g:383:1: ( rule__Solution__Group_0__1__Impl )
            // InternalMathInterpreter.g:384:2: rule__Solution__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Solution__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Solution__Group_0__1"


    // $ANTLR start "rule__Solution__Group_0__1__Impl"
    // InternalMathInterpreter.g:390:1: rule__Solution__Group_0__1__Impl : ( ( rule__Solution__VariablesAssignment_0_1 )* ) ;
    public final void rule__Solution__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathInterpreter.g:394:1: ( ( ( rule__Solution__VariablesAssignment_0_1 )* ) )
            // InternalMathInterpreter.g:395:1: ( ( rule__Solution__VariablesAssignment_0_1 )* )
            {
            // InternalMathInterpreter.g:395:1: ( ( rule__Solution__VariablesAssignment_0_1 )* )
            // InternalMathInterpreter.g:396:2: ( rule__Solution__VariablesAssignment_0_1 )*
            {
             before(grammarAccess.getSolutionAccess().getVariablesAssignment_0_1()); 
            // InternalMathInterpreter.g:397:2: ( rule__Solution__VariablesAssignment_0_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMathInterpreter.g:397:3: rule__Solution__VariablesAssignment_0_1
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Solution__VariablesAssignment_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getSolutionAccess().getVariablesAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Solution__Group_0__1__Impl"


    // $ANTLR start "rule__Variable__Group__0"
    // InternalMathInterpreter.g:406:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathInterpreter.g:410:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalMathInterpreter.g:411:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Variable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__0"


    // $ANTLR start "rule__Variable__Group__0__Impl"
    // InternalMathInterpreter.g:418:1: rule__Variable__Group__0__Impl : ( ( rule__Variable__NameAssignment_0 ) ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathInterpreter.g:422:1: ( ( ( rule__Variable__NameAssignment_0 ) ) )
            // InternalMathInterpreter.g:423:1: ( ( rule__Variable__NameAssignment_0 ) )
            {
            // InternalMathInterpreter.g:423:1: ( ( rule__Variable__NameAssignment_0 ) )
            // InternalMathInterpreter.g:424:2: ( rule__Variable__NameAssignment_0 )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment_0()); 
            // InternalMathInterpreter.g:425:2: ( rule__Variable__NameAssignment_0 )
            // InternalMathInterpreter.g:425:3: rule__Variable__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Variable__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__0__Impl"


    // $ANTLR start "rule__Variable__Group__1"
    // InternalMathInterpreter.g:433:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl rule__Variable__Group__2 ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathInterpreter.g:437:1: ( rule__Variable__Group__1__Impl rule__Variable__Group__2 )
            // InternalMathInterpreter.g:438:2: rule__Variable__Group__1__Impl rule__Variable__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Variable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__1"


    // $ANTLR start "rule__Variable__Group__1__Impl"
    // InternalMathInterpreter.g:445:1: rule__Variable__Group__1__Impl : ( '=' ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathInterpreter.g:449:1: ( ( '=' ) )
            // InternalMathInterpreter.g:450:1: ( '=' )
            {
            // InternalMathInterpreter.g:450:1: ( '=' )
            // InternalMathInterpreter.g:451:2: '='
            {
             before(grammarAccess.getVariableAccess().getEqualsSignKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__1__Impl"


    // $ANTLR start "rule__Variable__Group__2"
    // InternalMathInterpreter.g:460:1: rule__Variable__Group__2 : rule__Variable__Group__2__Impl ;
    public final void rule__Variable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathInterpreter.g:464:1: ( rule__Variable__Group__2__Impl )
            // InternalMathInterpreter.g:465:2: rule__Variable__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__2"


    // $ANTLR start "rule__Variable__Group__2__Impl"
    // InternalMathInterpreter.g:471:1: rule__Variable__Group__2__Impl : ( ( rule__Variable__ValueAssignment_2 ) ) ;
    public final void rule__Variable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathInterpreter.g:475:1: ( ( ( rule__Variable__ValueAssignment_2 ) ) )
            // InternalMathInterpreter.g:476:1: ( ( rule__Variable__ValueAssignment_2 ) )
            {
            // InternalMathInterpreter.g:476:1: ( ( rule__Variable__ValueAssignment_2 ) )
            // InternalMathInterpreter.g:477:2: ( rule__Variable__ValueAssignment_2 )
            {
             before(grammarAccess.getVariableAccess().getValueAssignment_2()); 
            // InternalMathInterpreter.g:478:2: ( rule__Variable__ValueAssignment_2 )
            // InternalMathInterpreter.g:478:3: rule__Variable__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Variable__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__2__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group__0"
    // InternalMathInterpreter.g:487:1: rule__PlusOrMinus__Group__0 : rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1 ;
    public final void rule__PlusOrMinus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathInterpreter.g:491:1: ( rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1 )
            // InternalMathInterpreter.g:492:2: rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__PlusOrMinus__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group__0"


    // $ANTLR start "rule__PlusOrMinus__Group__0__Impl"
    // InternalMathInterpreter.g:499:1: rule__PlusOrMinus__Group__0__Impl : ( ( rule__PlusOrMinus__LeftAssignment_0 ) ) ;
    public final void rule__PlusOrMinus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathInterpreter.g:503:1: ( ( ( rule__PlusOrMinus__LeftAssignment_0 ) ) )
            // InternalMathInterpreter.g:504:1: ( ( rule__PlusOrMinus__LeftAssignment_0 ) )
            {
            // InternalMathInterpreter.g:504:1: ( ( rule__PlusOrMinus__LeftAssignment_0 ) )
            // InternalMathInterpreter.g:505:2: ( rule__PlusOrMinus__LeftAssignment_0 )
            {
             before(grammarAccess.getPlusOrMinusAccess().getLeftAssignment_0()); 
            // InternalMathInterpreter.g:506:2: ( rule__PlusOrMinus__LeftAssignment_0 )
            // InternalMathInterpreter.g:506:3: rule__PlusOrMinus__LeftAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__LeftAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPlusOrMinusAccess().getLeftAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group__0__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group__1"
    // InternalMathInterpreter.g:514:1: rule__PlusOrMinus__Group__1 : rule__PlusOrMinus__Group__1__Impl ;
    public final void rule__PlusOrMinus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathInterpreter.g:518:1: ( rule__PlusOrMinus__Group__1__Impl )
            // InternalMathInterpreter.g:519:2: rule__PlusOrMinus__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group__1"


    // $ANTLR start "rule__PlusOrMinus__Group__1__Impl"
    // InternalMathInterpreter.g:525:1: rule__PlusOrMinus__Group__1__Impl : ( ( rule__PlusOrMinus__Alternatives_1 )* ) ;
    public final void rule__PlusOrMinus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathInterpreter.g:529:1: ( ( ( rule__PlusOrMinus__Alternatives_1 )* ) )
            // InternalMathInterpreter.g:530:1: ( ( rule__PlusOrMinus__Alternatives_1 )* )
            {
            // InternalMathInterpreter.g:530:1: ( ( rule__PlusOrMinus__Alternatives_1 )* )
            // InternalMathInterpreter.g:531:2: ( rule__PlusOrMinus__Alternatives_1 )*
            {
             before(grammarAccess.getPlusOrMinusAccess().getAlternatives_1()); 
            // InternalMathInterpreter.g:532:2: ( rule__PlusOrMinus__Alternatives_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=16 && LA6_0<=17)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMathInterpreter.g:532:3: rule__PlusOrMinus__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__PlusOrMinus__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getPlusOrMinusAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group__1__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0__0"
    // InternalMathInterpreter.g:541:1: rule__PlusOrMinus__Group_1_0__0 : rule__PlusOrMinus__Group_1_0__0__Impl rule__PlusOrMinus__Group_1_0__1 ;
    public final void rule__PlusOrMinus__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathInterpreter.g:545:1: ( rule__PlusOrMinus__Group_1_0__0__Impl rule__PlusOrMinus__Group_1_0__1 )
            // InternalMathInterpreter.g:546:2: rule__PlusOrMinus__Group_1_0__0__Impl rule__PlusOrMinus__Group_1_0__1
            {
            pushFollow(FOLLOW_10);
            rule__PlusOrMinus__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0__0"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0__0__Impl"
    // InternalMathInterpreter.g:553:1: rule__PlusOrMinus__Group_1_0__0__Impl : ( () ) ;
    public final void rule__PlusOrMinus__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathInterpreter.g:557:1: ( ( () ) )
            // InternalMathInterpreter.g:558:1: ( () )
            {
            // InternalMathInterpreter.g:558:1: ( () )
            // InternalMathInterpreter.g:559:2: ()
            {
             before(grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0()); 
            // InternalMathInterpreter.g:560:2: ()
            // InternalMathInterpreter.g:560:3: 
            {
            }

             after(grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0__0__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0__1"
    // InternalMathInterpreter.g:568:1: rule__PlusOrMinus__Group_1_0__1 : rule__PlusOrMinus__Group_1_0__1__Impl rule__PlusOrMinus__Group_1_0__2 ;
    public final void rule__PlusOrMinus__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathInterpreter.g:572:1: ( rule__PlusOrMinus__Group_1_0__1__Impl rule__PlusOrMinus__Group_1_0__2 )
            // InternalMathInterpreter.g:573:2: rule__PlusOrMinus__Group_1_0__1__Impl rule__PlusOrMinus__Group_1_0__2
            {
            pushFollow(FOLLOW_4);
            rule__PlusOrMinus__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group_1_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0__1"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0__1__Impl"
    // InternalMathInterpreter.g:580:1: rule__PlusOrMinus__Group_1_0__1__Impl : ( ( rule__PlusOrMinus__OperatorAssignment_1_0_1 ) ) ;
    public final void rule__PlusOrMinus__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathInterpreter.g:584:1: ( ( ( rule__PlusOrMinus__OperatorAssignment_1_0_1 ) ) )
            // InternalMathInterpreter.g:585:1: ( ( rule__PlusOrMinus__OperatorAssignment_1_0_1 ) )
            {
            // InternalMathInterpreter.g:585:1: ( ( rule__PlusOrMinus__OperatorAssignment_1_0_1 ) )
            // InternalMathInterpreter.g:586:2: ( rule__PlusOrMinus__OperatorAssignment_1_0_1 )
            {
             before(grammarAccess.getPlusOrMinusAccess().getOperatorAssignment_1_0_1()); 
            // InternalMathInterpreter.g:587:2: ( rule__PlusOrMinus__OperatorAssignment_1_0_1 )
            // InternalMathInterpreter.g:587:3: rule__PlusOrMinus__OperatorAssignment_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__OperatorAssignment_1_0_1();

            state._fsp--;


            }

             after(grammarAccess.getPlusOrMinusAccess().getOperatorAssignment_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0__1__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0__2"
    // InternalMathInterpreter.g:595:1: rule__PlusOrMinus__Group_1_0__2 : rule__PlusOrMinus__Group_1_0__2__Impl ;
    public final void rule__PlusOrMinus__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathInterpreter.g:599:1: ( rule__PlusOrMinus__Group_1_0__2__Impl )
            // InternalMathInterpreter.g:600:2: rule__PlusOrMinus__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group_1_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0__2"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0__2__Impl"
    // InternalMathInterpreter.g:606:1: rule__PlusOrMinus__Group_1_0__2__Impl : ( ( rule__PlusOrMinus__RightAssignment_1_0_2 ) ) ;
    public final void rule__PlusOrMinus__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathInterpreter.g:610:1: ( ( ( rule__PlusOrMinus__RightAssignment_1_0_2 ) ) )
            // InternalMathInterpreter.g:611:1: ( ( rule__PlusOrMinus__RightAssignment_1_0_2 ) )
            {
            // InternalMathInterpreter.g:611:1: ( ( rule__PlusOrMinus__RightAssignment_1_0_2 ) )
            // InternalMathInterpreter.g:612:2: ( rule__PlusOrMinus__RightAssignment_1_0_2 )
            {
             before(grammarAccess.getPlusOrMinusAccess().getRightAssignment_1_0_2()); 
            // InternalMathInterpreter.g:613:2: ( rule__PlusOrMinus__RightAssignment_1_0_2 )
            // InternalMathInterpreter.g:613:3: rule__PlusOrMinus__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__RightAssignment_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getPlusOrMinusAccess().getRightAssignment_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0__2__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1_1__0"
    // InternalMathInterpreter.g:622:1: rule__PlusOrMinus__Group_1_1__0 : rule__PlusOrMinus__Group_1_1__0__Impl rule__PlusOrMinus__Group_1_1__1 ;
    public final void rule__PlusOrMinus__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathInterpreter.g:626:1: ( rule__PlusOrMinus__Group_1_1__0__Impl rule__PlusOrMinus__Group_1_1__1 )
            // InternalMathInterpreter.g:627:2: rule__PlusOrMinus__Group_1_1__0__Impl rule__PlusOrMinus__Group_1_1__1
            {
            pushFollow(FOLLOW_8);
            rule__PlusOrMinus__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_1__0"


    // $ANTLR start "rule__PlusOrMinus__Group_1_1__0__Impl"
    // InternalMathInterpreter.g:634:1: rule__PlusOrMinus__Group_1_1__0__Impl : ( () ) ;
    public final void rule__PlusOrMinus__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathInterpreter.g:638:1: ( ( () ) )
            // InternalMathInterpreter.g:639:1: ( () )
            {
            // InternalMathInterpreter.g:639:1: ( () )
            // InternalMathInterpreter.g:640:2: ()
            {
             before(grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_1_0()); 
            // InternalMathInterpreter.g:641:2: ()
            // InternalMathInterpreter.g:641:3: 
            {
            }

             after(grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_1__0__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1_1__1"
    // InternalMathInterpreter.g:649:1: rule__PlusOrMinus__Group_1_1__1 : rule__PlusOrMinus__Group_1_1__1__Impl rule__PlusOrMinus__Group_1_1__2 ;
    public final void rule__PlusOrMinus__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathInterpreter.g:653:1: ( rule__PlusOrMinus__Group_1_1__1__Impl rule__PlusOrMinus__Group_1_1__2 )
            // InternalMathInterpreter.g:654:2: rule__PlusOrMinus__Group_1_1__1__Impl rule__PlusOrMinus__Group_1_1__2
            {
            pushFollow(FOLLOW_4);
            rule__PlusOrMinus__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_1__1"


    // $ANTLR start "rule__PlusOrMinus__Group_1_1__1__Impl"
    // InternalMathInterpreter.g:661:1: rule__PlusOrMinus__Group_1_1__1__Impl : ( ( rule__PlusOrMinus__OperatorAssignment_1_1_1 ) ) ;
    public final void rule__PlusOrMinus__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathInterpreter.g:665:1: ( ( ( rule__PlusOrMinus__OperatorAssignment_1_1_1 ) ) )
            // InternalMathInterpreter.g:666:1: ( ( rule__PlusOrMinus__OperatorAssignment_1_1_1 ) )
            {
            // InternalMathInterpreter.g:666:1: ( ( rule__PlusOrMinus__OperatorAssignment_1_1_1 ) )
            // InternalMathInterpreter.g:667:2: ( rule__PlusOrMinus__OperatorAssignment_1_1_1 )
            {
             before(grammarAccess.getPlusOrMinusAccess().getOperatorAssignment_1_1_1()); 
            // InternalMathInterpreter.g:668:2: ( rule__PlusOrMinus__OperatorAssignment_1_1_1 )
            // InternalMathInterpreter.g:668:3: rule__PlusOrMinus__OperatorAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__OperatorAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPlusOrMinusAccess().getOperatorAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_1__1__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1_1__2"
    // InternalMathInterpreter.g:676:1: rule__PlusOrMinus__Group_1_1__2 : rule__PlusOrMinus__Group_1_1__2__Impl ;
    public final void rule__PlusOrMinus__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathInterpreter.g:680:1: ( rule__PlusOrMinus__Group_1_1__2__Impl )
            // InternalMathInterpreter.g:681:2: rule__PlusOrMinus__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group_1_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_1__2"


    // $ANTLR start "rule__PlusOrMinus__Group_1_1__2__Impl"
    // InternalMathInterpreter.g:687:1: rule__PlusOrMinus__Group_1_1__2__Impl : ( ( rule__PlusOrMinus__RightAssignment_1_1_2 ) ) ;
    public final void rule__PlusOrMinus__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathInterpreter.g:691:1: ( ( ( rule__PlusOrMinus__RightAssignment_1_1_2 ) ) )
            // InternalMathInterpreter.g:692:1: ( ( rule__PlusOrMinus__RightAssignment_1_1_2 ) )
            {
            // InternalMathInterpreter.g:692:1: ( ( rule__PlusOrMinus__RightAssignment_1_1_2 ) )
            // InternalMathInterpreter.g:693:2: ( rule__PlusOrMinus__RightAssignment_1_1_2 )
            {
             before(grammarAccess.getPlusOrMinusAccess().getRightAssignment_1_1_2()); 
            // InternalMathInterpreter.g:694:2: ( rule__PlusOrMinus__RightAssignment_1_1_2 )
            // InternalMathInterpreter.g:694:3: rule__PlusOrMinus__RightAssignment_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__RightAssignment_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getPlusOrMinusAccess().getRightAssignment_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_1__2__Impl"


    // $ANTLR start "rule__MultiplyOrDivide__Group__0"
    // InternalMathInterpreter.g:703:1: rule__MultiplyOrDivide__Group__0 : rule__MultiplyOrDivide__Group__0__Impl rule__MultiplyOrDivide__Group__1 ;
    public final void rule__MultiplyOrDivide__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathInterpreter.g:707:1: ( rule__MultiplyOrDivide__Group__0__Impl rule__MultiplyOrDivide__Group__1 )
            // InternalMathInterpreter.g:708:2: rule__MultiplyOrDivide__Group__0__Impl rule__MultiplyOrDivide__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__MultiplyOrDivide__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiplyOrDivide__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplyOrDivide__Group__0"


    // $ANTLR start "rule__MultiplyOrDivide__Group__0__Impl"
    // InternalMathInterpreter.g:715:1: rule__MultiplyOrDivide__Group__0__Impl : ( ( rule__MultiplyOrDivide__LeftAssignment_0 ) ) ;
    public final void rule__MultiplyOrDivide__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathInterpreter.g:719:1: ( ( ( rule__MultiplyOrDivide__LeftAssignment_0 ) ) )
            // InternalMathInterpreter.g:720:1: ( ( rule__MultiplyOrDivide__LeftAssignment_0 ) )
            {
            // InternalMathInterpreter.g:720:1: ( ( rule__MultiplyOrDivide__LeftAssignment_0 ) )
            // InternalMathInterpreter.g:721:2: ( rule__MultiplyOrDivide__LeftAssignment_0 )
            {
             before(grammarAccess.getMultiplyOrDivideAccess().getLeftAssignment_0()); 
            // InternalMathInterpreter.g:722:2: ( rule__MultiplyOrDivide__LeftAssignment_0 )
            // InternalMathInterpreter.g:722:3: rule__MultiplyOrDivide__LeftAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__MultiplyOrDivide__LeftAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplyOrDivideAccess().getLeftAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplyOrDivide__Group__0__Impl"


    // $ANTLR start "rule__MultiplyOrDivide__Group__1"
    // InternalMathInterpreter.g:730:1: rule__MultiplyOrDivide__Group__1 : rule__MultiplyOrDivide__Group__1__Impl ;
    public final void rule__MultiplyOrDivide__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathInterpreter.g:734:1: ( rule__MultiplyOrDivide__Group__1__Impl )
            // InternalMathInterpreter.g:735:2: rule__MultiplyOrDivide__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiplyOrDivide__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplyOrDivide__Group__1"


    // $ANTLR start "rule__MultiplyOrDivide__Group__1__Impl"
    // InternalMathInterpreter.g:741:1: rule__MultiplyOrDivide__Group__1__Impl : ( ( rule__MultiplyOrDivide__Alternatives_1 )* ) ;
    public final void rule__MultiplyOrDivide__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathInterpreter.g:745:1: ( ( ( rule__MultiplyOrDivide__Alternatives_1 )* ) )
            // InternalMathInterpreter.g:746:1: ( ( rule__MultiplyOrDivide__Alternatives_1 )* )
            {
            // InternalMathInterpreter.g:746:1: ( ( rule__MultiplyOrDivide__Alternatives_1 )* )
            // InternalMathInterpreter.g:747:2: ( rule__MultiplyOrDivide__Alternatives_1 )*
            {
             before(grammarAccess.getMultiplyOrDivideAccess().getAlternatives_1()); 
            // InternalMathInterpreter.g:748:2: ( rule__MultiplyOrDivide__Alternatives_1 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=18 && LA7_0<=19)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMathInterpreter.g:748:3: rule__MultiplyOrDivide__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__MultiplyOrDivide__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getMultiplyOrDivideAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplyOrDivide__Group__1__Impl"


    // $ANTLR start "rule__MultiplyOrDivide__Group_1_0__0"
    // InternalMathInterpreter.g:757:1: rule__MultiplyOrDivide__Group_1_0__0 : rule__MultiplyOrDivide__Group_1_0__0__Impl rule__MultiplyOrDivide__Group_1_0__1 ;
    public final void rule__MultiplyOrDivide__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathInterpreter.g:761:1: ( rule__MultiplyOrDivide__Group_1_0__0__Impl rule__MultiplyOrDivide__Group_1_0__1 )
            // InternalMathInterpreter.g:762:2: rule__MultiplyOrDivide__Group_1_0__0__Impl rule__MultiplyOrDivide__Group_1_0__1
            {
            pushFollow(FOLLOW_13);
            rule__MultiplyOrDivide__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiplyOrDivide__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplyOrDivide__Group_1_0__0"


    // $ANTLR start "rule__MultiplyOrDivide__Group_1_0__0__Impl"
    // InternalMathInterpreter.g:769:1: rule__MultiplyOrDivide__Group_1_0__0__Impl : ( () ) ;
    public final void rule__MultiplyOrDivide__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathInterpreter.g:773:1: ( ( () ) )
            // InternalMathInterpreter.g:774:1: ( () )
            {
            // InternalMathInterpreter.g:774:1: ( () )
            // InternalMathInterpreter.g:775:2: ()
            {
             before(grammarAccess.getMultiplyOrDivideAccess().getMultiplyLeftAction_1_0_0()); 
            // InternalMathInterpreter.g:776:2: ()
            // InternalMathInterpreter.g:776:3: 
            {
            }

             after(grammarAccess.getMultiplyOrDivideAccess().getMultiplyLeftAction_1_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplyOrDivide__Group_1_0__0__Impl"


    // $ANTLR start "rule__MultiplyOrDivide__Group_1_0__1"
    // InternalMathInterpreter.g:784:1: rule__MultiplyOrDivide__Group_1_0__1 : rule__MultiplyOrDivide__Group_1_0__1__Impl rule__MultiplyOrDivide__Group_1_0__2 ;
    public final void rule__MultiplyOrDivide__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathInterpreter.g:788:1: ( rule__MultiplyOrDivide__Group_1_0__1__Impl rule__MultiplyOrDivide__Group_1_0__2 )
            // InternalMathInterpreter.g:789:2: rule__MultiplyOrDivide__Group_1_0__1__Impl rule__MultiplyOrDivide__Group_1_0__2
            {
            pushFollow(FOLLOW_4);
            rule__MultiplyOrDivide__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiplyOrDivide__Group_1_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplyOrDivide__Group_1_0__1"


    // $ANTLR start "rule__MultiplyOrDivide__Group_1_0__1__Impl"
    // InternalMathInterpreter.g:796:1: rule__MultiplyOrDivide__Group_1_0__1__Impl : ( ( rule__MultiplyOrDivide__OperatorAssignment_1_0_1 ) ) ;
    public final void rule__MultiplyOrDivide__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathInterpreter.g:800:1: ( ( ( rule__MultiplyOrDivide__OperatorAssignment_1_0_1 ) ) )
            // InternalMathInterpreter.g:801:1: ( ( rule__MultiplyOrDivide__OperatorAssignment_1_0_1 ) )
            {
            // InternalMathInterpreter.g:801:1: ( ( rule__MultiplyOrDivide__OperatorAssignment_1_0_1 ) )
            // InternalMathInterpreter.g:802:2: ( rule__MultiplyOrDivide__OperatorAssignment_1_0_1 )
            {
             before(grammarAccess.getMultiplyOrDivideAccess().getOperatorAssignment_1_0_1()); 
            // InternalMathInterpreter.g:803:2: ( rule__MultiplyOrDivide__OperatorAssignment_1_0_1 )
            // InternalMathInterpreter.g:803:3: rule__MultiplyOrDivide__OperatorAssignment_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__MultiplyOrDivide__OperatorAssignment_1_0_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiplyOrDivideAccess().getOperatorAssignment_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplyOrDivide__Group_1_0__1__Impl"


    // $ANTLR start "rule__MultiplyOrDivide__Group_1_0__2"
    // InternalMathInterpreter.g:811:1: rule__MultiplyOrDivide__Group_1_0__2 : rule__MultiplyOrDivide__Group_1_0__2__Impl ;
    public final void rule__MultiplyOrDivide__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathInterpreter.g:815:1: ( rule__MultiplyOrDivide__Group_1_0__2__Impl )
            // InternalMathInterpreter.g:816:2: rule__MultiplyOrDivide__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiplyOrDivide__Group_1_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplyOrDivide__Group_1_0__2"


    // $ANTLR start "rule__MultiplyOrDivide__Group_1_0__2__Impl"
    // InternalMathInterpreter.g:822:1: rule__MultiplyOrDivide__Group_1_0__2__Impl : ( ( rule__MultiplyOrDivide__RightAssignment_1_0_2 ) ) ;
    public final void rule__MultiplyOrDivide__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathInterpreter.g:826:1: ( ( ( rule__MultiplyOrDivide__RightAssignment_1_0_2 ) ) )
            // InternalMathInterpreter.g:827:1: ( ( rule__MultiplyOrDivide__RightAssignment_1_0_2 ) )
            {
            // InternalMathInterpreter.g:827:1: ( ( rule__MultiplyOrDivide__RightAssignment_1_0_2 ) )
            // InternalMathInterpreter.g:828:2: ( rule__MultiplyOrDivide__RightAssignment_1_0_2 )
            {
             before(grammarAccess.getMultiplyOrDivideAccess().getRightAssignment_1_0_2()); 
            // InternalMathInterpreter.g:829:2: ( rule__MultiplyOrDivide__RightAssignment_1_0_2 )
            // InternalMathInterpreter.g:829:3: rule__MultiplyOrDivide__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__MultiplyOrDivide__RightAssignment_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getMultiplyOrDivideAccess().getRightAssignment_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplyOrDivide__Group_1_0__2__Impl"


    // $ANTLR start "rule__MultiplyOrDivide__Group_1_1__0"
    // InternalMathInterpreter.g:838:1: rule__MultiplyOrDivide__Group_1_1__0 : rule__MultiplyOrDivide__Group_1_1__0__Impl rule__MultiplyOrDivide__Group_1_1__1 ;
    public final void rule__MultiplyOrDivide__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathInterpreter.g:842:1: ( rule__MultiplyOrDivide__Group_1_1__0__Impl rule__MultiplyOrDivide__Group_1_1__1 )
            // InternalMathInterpreter.g:843:2: rule__MultiplyOrDivide__Group_1_1__0__Impl rule__MultiplyOrDivide__Group_1_1__1
            {
            pushFollow(FOLLOW_11);
            rule__MultiplyOrDivide__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiplyOrDivide__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplyOrDivide__Group_1_1__0"


    // $ANTLR start "rule__MultiplyOrDivide__Group_1_1__0__Impl"
    // InternalMathInterpreter.g:850:1: rule__MultiplyOrDivide__Group_1_1__0__Impl : ( () ) ;
    public final void rule__MultiplyOrDivide__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathInterpreter.g:854:1: ( ( () ) )
            // InternalMathInterpreter.g:855:1: ( () )
            {
            // InternalMathInterpreter.g:855:1: ( () )
            // InternalMathInterpreter.g:856:2: ()
            {
             before(grammarAccess.getMultiplyOrDivideAccess().getDivideLeftAction_1_1_0()); 
            // InternalMathInterpreter.g:857:2: ()
            // InternalMathInterpreter.g:857:3: 
            {
            }

             after(grammarAccess.getMultiplyOrDivideAccess().getDivideLeftAction_1_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplyOrDivide__Group_1_1__0__Impl"


    // $ANTLR start "rule__MultiplyOrDivide__Group_1_1__1"
    // InternalMathInterpreter.g:865:1: rule__MultiplyOrDivide__Group_1_1__1 : rule__MultiplyOrDivide__Group_1_1__1__Impl rule__MultiplyOrDivide__Group_1_1__2 ;
    public final void rule__MultiplyOrDivide__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathInterpreter.g:869:1: ( rule__MultiplyOrDivide__Group_1_1__1__Impl rule__MultiplyOrDivide__Group_1_1__2 )
            // InternalMathInterpreter.g:870:2: rule__MultiplyOrDivide__Group_1_1__1__Impl rule__MultiplyOrDivide__Group_1_1__2
            {
            pushFollow(FOLLOW_4);
            rule__MultiplyOrDivide__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiplyOrDivide__Group_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplyOrDivide__Group_1_1__1"


    // $ANTLR start "rule__MultiplyOrDivide__Group_1_1__1__Impl"
    // InternalMathInterpreter.g:877:1: rule__MultiplyOrDivide__Group_1_1__1__Impl : ( ( rule__MultiplyOrDivide__OperatorAssignment_1_1_1 ) ) ;
    public final void rule__MultiplyOrDivide__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathInterpreter.g:881:1: ( ( ( rule__MultiplyOrDivide__OperatorAssignment_1_1_1 ) ) )
            // InternalMathInterpreter.g:882:1: ( ( rule__MultiplyOrDivide__OperatorAssignment_1_1_1 ) )
            {
            // InternalMathInterpreter.g:882:1: ( ( rule__MultiplyOrDivide__OperatorAssignment_1_1_1 ) )
            // InternalMathInterpreter.g:883:2: ( rule__MultiplyOrDivide__OperatorAssignment_1_1_1 )
            {
             before(grammarAccess.getMultiplyOrDivideAccess().getOperatorAssignment_1_1_1()); 
            // InternalMathInterpreter.g:884:2: ( rule__MultiplyOrDivide__OperatorAssignment_1_1_1 )
            // InternalMathInterpreter.g:884:3: rule__MultiplyOrDivide__OperatorAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MultiplyOrDivide__OperatorAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiplyOrDivideAccess().getOperatorAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplyOrDivide__Group_1_1__1__Impl"


    // $ANTLR start "rule__MultiplyOrDivide__Group_1_1__2"
    // InternalMathInterpreter.g:892:1: rule__MultiplyOrDivide__Group_1_1__2 : rule__MultiplyOrDivide__Group_1_1__2__Impl ;
    public final void rule__MultiplyOrDivide__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathInterpreter.g:896:1: ( rule__MultiplyOrDivide__Group_1_1__2__Impl )
            // InternalMathInterpreter.g:897:2: rule__MultiplyOrDivide__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiplyOrDivide__Group_1_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplyOrDivide__Group_1_1__2"


    // $ANTLR start "rule__MultiplyOrDivide__Group_1_1__2__Impl"
    // InternalMathInterpreter.g:903:1: rule__MultiplyOrDivide__Group_1_1__2__Impl : ( ( rule__MultiplyOrDivide__RightAssignment_1_1_2 ) ) ;
    public final void rule__MultiplyOrDivide__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathInterpreter.g:907:1: ( ( ( rule__MultiplyOrDivide__RightAssignment_1_1_2 ) ) )
            // InternalMathInterpreter.g:908:1: ( ( rule__MultiplyOrDivide__RightAssignment_1_1_2 ) )
            {
            // InternalMathInterpreter.g:908:1: ( ( rule__MultiplyOrDivide__RightAssignment_1_1_2 ) )
            // InternalMathInterpreter.g:909:2: ( rule__MultiplyOrDivide__RightAssignment_1_1_2 )
            {
             before(grammarAccess.getMultiplyOrDivideAccess().getRightAssignment_1_1_2()); 
            // InternalMathInterpreter.g:910:2: ( rule__MultiplyOrDivide__RightAssignment_1_1_2 )
            // InternalMathInterpreter.g:910:3: rule__MultiplyOrDivide__RightAssignment_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__MultiplyOrDivide__RightAssignment_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getMultiplyOrDivideAccess().getRightAssignment_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplyOrDivide__Group_1_1__2__Impl"


    // $ANTLR start "rule__Primary__Group_0__0"
    // InternalMathInterpreter.g:919:1: rule__Primary__Group_0__0 : rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 ;
    public final void rule__Primary__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathInterpreter.g:923:1: ( rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 )
            // InternalMathInterpreter.g:924:2: rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1
            {
            pushFollow(FOLLOW_14);
            rule__Primary__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__0"


    // $ANTLR start "rule__Primary__Group_0__0__Impl"
    // InternalMathInterpreter.g:931:1: rule__Primary__Group_0__0__Impl : ( () ) ;
    public final void rule__Primary__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathInterpreter.g:935:1: ( ( () ) )
            // InternalMathInterpreter.g:936:1: ( () )
            {
            // InternalMathInterpreter.g:936:1: ( () )
            // InternalMathInterpreter.g:937:2: ()
            {
             before(grammarAccess.getPrimaryAccess().getNumAction_0_0()); 
            // InternalMathInterpreter.g:938:2: ()
            // InternalMathInterpreter.g:938:3: 
            {
            }

             after(grammarAccess.getPrimaryAccess().getNumAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__0__Impl"


    // $ANTLR start "rule__Primary__Group_0__1"
    // InternalMathInterpreter.g:946:1: rule__Primary__Group_0__1 : rule__Primary__Group_0__1__Impl ;
    public final void rule__Primary__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathInterpreter.g:950:1: ( rule__Primary__Group_0__1__Impl )
            // InternalMathInterpreter.g:951:2: rule__Primary__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__1"


    // $ANTLR start "rule__Primary__Group_0__1__Impl"
    // InternalMathInterpreter.g:957:1: rule__Primary__Group_0__1__Impl : ( ( rule__Primary__ValueAssignment_0_1 ) ) ;
    public final void rule__Primary__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathInterpreter.g:961:1: ( ( ( rule__Primary__ValueAssignment_0_1 ) ) )
            // InternalMathInterpreter.g:962:1: ( ( rule__Primary__ValueAssignment_0_1 ) )
            {
            // InternalMathInterpreter.g:962:1: ( ( rule__Primary__ValueAssignment_0_1 ) )
            // InternalMathInterpreter.g:963:2: ( rule__Primary__ValueAssignment_0_1 )
            {
             before(grammarAccess.getPrimaryAccess().getValueAssignment_0_1()); 
            // InternalMathInterpreter.g:964:2: ( rule__Primary__ValueAssignment_0_1 )
            // InternalMathInterpreter.g:964:3: rule__Primary__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Primary__ValueAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getValueAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__1__Impl"


    // $ANTLR start "rule__Primary__Group_1__0"
    // InternalMathInterpreter.g:973:1: rule__Primary__Group_1__0 : rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 ;
    public final void rule__Primary__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathInterpreter.g:977:1: ( rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 )
            // InternalMathInterpreter.g:978:2: rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__Primary__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__0"


    // $ANTLR start "rule__Primary__Group_1__0__Impl"
    // InternalMathInterpreter.g:985:1: rule__Primary__Group_1__0__Impl : ( () ) ;
    public final void rule__Primary__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathInterpreter.g:989:1: ( ( () ) )
            // InternalMathInterpreter.g:990:1: ( () )
            {
            // InternalMathInterpreter.g:990:1: ( () )
            // InternalMathInterpreter.g:991:2: ()
            {
             before(grammarAccess.getPrimaryAccess().getVariableRefAction_1_0()); 
            // InternalMathInterpreter.g:992:2: ()
            // InternalMathInterpreter.g:992:3: 
            {
            }

             after(grammarAccess.getPrimaryAccess().getVariableRefAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__0__Impl"


    // $ANTLR start "rule__Primary__Group_1__1"
    // InternalMathInterpreter.g:1000:1: rule__Primary__Group_1__1 : rule__Primary__Group_1__1__Impl ;
    public final void rule__Primary__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathInterpreter.g:1004:1: ( rule__Primary__Group_1__1__Impl )
            // InternalMathInterpreter.g:1005:2: rule__Primary__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__1"


    // $ANTLR start "rule__Primary__Group_1__1__Impl"
    // InternalMathInterpreter.g:1011:1: rule__Primary__Group_1__1__Impl : ( ( rule__Primary__ValueAssignment_1_1 ) ) ;
    public final void rule__Primary__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathInterpreter.g:1015:1: ( ( ( rule__Primary__ValueAssignment_1_1 ) ) )
            // InternalMathInterpreter.g:1016:1: ( ( rule__Primary__ValueAssignment_1_1 ) )
            {
            // InternalMathInterpreter.g:1016:1: ( ( rule__Primary__ValueAssignment_1_1 ) )
            // InternalMathInterpreter.g:1017:2: ( rule__Primary__ValueAssignment_1_1 )
            {
             before(grammarAccess.getPrimaryAccess().getValueAssignment_1_1()); 
            // InternalMathInterpreter.g:1018:2: ( rule__Primary__ValueAssignment_1_1 )
            // InternalMathInterpreter.g:1018:3: rule__Primary__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Primary__ValueAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getValueAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__1__Impl"


    // $ANTLR start "rule__Primary__Group_2__0"
    // InternalMathInterpreter.g:1027:1: rule__Primary__Group_2__0 : rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1 ;
    public final void rule__Primary__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathInterpreter.g:1031:1: ( rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1 )
            // InternalMathInterpreter.g:1032:2: rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Primary__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_2__0"


    // $ANTLR start "rule__Primary__Group_2__0__Impl"
    // InternalMathInterpreter.g:1039:1: rule__Primary__Group_2__0__Impl : ( () ) ;
    public final void rule__Primary__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathInterpreter.g:1043:1: ( ( () ) )
            // InternalMathInterpreter.g:1044:1: ( () )
            {
            // InternalMathInterpreter.g:1044:1: ( () )
            // InternalMathInterpreter.g:1045:2: ()
            {
             before(grammarAccess.getPrimaryAccess().getBracketAction_2_0()); 
            // InternalMathInterpreter.g:1046:2: ()
            // InternalMathInterpreter.g:1046:3: 
            {
            }

             after(grammarAccess.getPrimaryAccess().getBracketAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_2__0__Impl"


    // $ANTLR start "rule__Primary__Group_2__1"
    // InternalMathInterpreter.g:1054:1: rule__Primary__Group_2__1 : rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2 ;
    public final void rule__Primary__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathInterpreter.g:1058:1: ( rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2 )
            // InternalMathInterpreter.g:1059:2: rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2
            {
            pushFollow(FOLLOW_4);
            rule__Primary__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_2__1"


    // $ANTLR start "rule__Primary__Group_2__1__Impl"
    // InternalMathInterpreter.g:1066:1: rule__Primary__Group_2__1__Impl : ( '(' ) ;
    public final void rule__Primary__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathInterpreter.g:1070:1: ( ( '(' ) )
            // InternalMathInterpreter.g:1071:1: ( '(' )
            {
            // InternalMathInterpreter.g:1071:1: ( '(' )
            // InternalMathInterpreter.g:1072:2: '('
            {
             before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_2_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_2__1__Impl"


    // $ANTLR start "rule__Primary__Group_2__2"
    // InternalMathInterpreter.g:1081:1: rule__Primary__Group_2__2 : rule__Primary__Group_2__2__Impl rule__Primary__Group_2__3 ;
    public final void rule__Primary__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathInterpreter.g:1085:1: ( rule__Primary__Group_2__2__Impl rule__Primary__Group_2__3 )
            // InternalMathInterpreter.g:1086:2: rule__Primary__Group_2__2__Impl rule__Primary__Group_2__3
            {
            pushFollow(FOLLOW_15);
            rule__Primary__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_2__2"


    // $ANTLR start "rule__Primary__Group_2__2__Impl"
    // InternalMathInterpreter.g:1093:1: rule__Primary__Group_2__2__Impl : ( ( rule__Primary__ValueAssignment_2_2 ) ) ;
    public final void rule__Primary__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathInterpreter.g:1097:1: ( ( ( rule__Primary__ValueAssignment_2_2 ) ) )
            // InternalMathInterpreter.g:1098:1: ( ( rule__Primary__ValueAssignment_2_2 ) )
            {
            // InternalMathInterpreter.g:1098:1: ( ( rule__Primary__ValueAssignment_2_2 ) )
            // InternalMathInterpreter.g:1099:2: ( rule__Primary__ValueAssignment_2_2 )
            {
             before(grammarAccess.getPrimaryAccess().getValueAssignment_2_2()); 
            // InternalMathInterpreter.g:1100:2: ( rule__Primary__ValueAssignment_2_2 )
            // InternalMathInterpreter.g:1100:3: rule__Primary__ValueAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Primary__ValueAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getValueAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_2__2__Impl"


    // $ANTLR start "rule__Primary__Group_2__3"
    // InternalMathInterpreter.g:1108:1: rule__Primary__Group_2__3 : rule__Primary__Group_2__3__Impl ;
    public final void rule__Primary__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathInterpreter.g:1112:1: ( rule__Primary__Group_2__3__Impl )
            // InternalMathInterpreter.g:1113:2: rule__Primary__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_2__3"


    // $ANTLR start "rule__Primary__Group_2__3__Impl"
    // InternalMathInterpreter.g:1119:1: rule__Primary__Group_2__3__Impl : ( ')' ) ;
    public final void rule__Primary__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathInterpreter.g:1123:1: ( ( ')' ) )
            // InternalMathInterpreter.g:1124:1: ( ')' )
            {
            // InternalMathInterpreter.g:1124:1: ( ')' )
            // InternalMathInterpreter.g:1125:2: ')'
            {
             before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_2_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_2__3__Impl"


    // $ANTLR start "rule__Solution__VariablesAssignment_0_1"
    // InternalMathInterpreter.g:1135:1: rule__Solution__VariablesAssignment_0_1 : ( ruleVariable ) ;
    public final void rule__Solution__VariablesAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathInterpreter.g:1139:1: ( ( ruleVariable ) )
            // InternalMathInterpreter.g:1140:2: ( ruleVariable )
            {
            // InternalMathInterpreter.g:1140:2: ( ruleVariable )
            // InternalMathInterpreter.g:1141:3: ruleVariable
            {
             before(grammarAccess.getSolutionAccess().getVariablesVariableParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getSolutionAccess().getVariablesVariableParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Solution__VariablesAssignment_0_1"


    // $ANTLR start "rule__Solution__ExpressionAssignment_2"
    // InternalMathInterpreter.g:1150:1: rule__Solution__ExpressionAssignment_2 : ( ruleExpression ) ;
    public final void rule__Solution__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathInterpreter.g:1154:1: ( ( ruleExpression ) )
            // InternalMathInterpreter.g:1155:2: ( ruleExpression )
            {
            // InternalMathInterpreter.g:1155:2: ( ruleExpression )
            // InternalMathInterpreter.g:1156:3: ruleExpression
            {
             before(grammarAccess.getSolutionAccess().getExpressionExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getSolutionAccess().getExpressionExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Solution__ExpressionAssignment_2"


    // $ANTLR start "rule__Variable__NameAssignment_0"
    // InternalMathInterpreter.g:1165:1: rule__Variable__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathInterpreter.g:1169:1: ( ( RULE_ID ) )
            // InternalMathInterpreter.g:1170:2: ( RULE_ID )
            {
            // InternalMathInterpreter.g:1170:2: ( RULE_ID )
            // InternalMathInterpreter.g:1171:3: RULE_ID
            {
             before(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__NameAssignment_0"


    // $ANTLR start "rule__Variable__ValueAssignment_2"
    // InternalMathInterpreter.g:1180:1: rule__Variable__ValueAssignment_2 : ( ruleExpression ) ;
    public final void rule__Variable__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathInterpreter.g:1184:1: ( ( ruleExpression ) )
            // InternalMathInterpreter.g:1185:2: ( ruleExpression )
            {
            // InternalMathInterpreter.g:1185:2: ( ruleExpression )
            // InternalMathInterpreter.g:1186:3: ruleExpression
            {
             before(grammarAccess.getVariableAccess().getValueExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getVariableAccess().getValueExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__ValueAssignment_2"


    // $ANTLR start "rule__Expression__ExpAssignment"
    // InternalMathInterpreter.g:1195:1: rule__Expression__ExpAssignment : ( rulePlusOrMinus ) ;
    public final void rule__Expression__ExpAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathInterpreter.g:1199:1: ( ( rulePlusOrMinus ) )
            // InternalMathInterpreter.g:1200:2: ( rulePlusOrMinus )
            {
            // InternalMathInterpreter.g:1200:2: ( rulePlusOrMinus )
            // InternalMathInterpreter.g:1201:3: rulePlusOrMinus
            {
             before(grammarAccess.getExpressionAccess().getExpPlusOrMinusParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePlusOrMinus();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getExpPlusOrMinusParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__ExpAssignment"


    // $ANTLR start "rule__PlusOrMinus__LeftAssignment_0"
    // InternalMathInterpreter.g:1210:1: rule__PlusOrMinus__LeftAssignment_0 : ( ruleMultiplyOrDivide ) ;
    public final void rule__PlusOrMinus__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathInterpreter.g:1214:1: ( ( ruleMultiplyOrDivide ) )
            // InternalMathInterpreter.g:1215:2: ( ruleMultiplyOrDivide )
            {
            // InternalMathInterpreter.g:1215:2: ( ruleMultiplyOrDivide )
            // InternalMathInterpreter.g:1216:3: ruleMultiplyOrDivide
            {
             before(grammarAccess.getPlusOrMinusAccess().getLeftMultiplyOrDivideParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplyOrDivide();

            state._fsp--;

             after(grammarAccess.getPlusOrMinusAccess().getLeftMultiplyOrDivideParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__LeftAssignment_0"


    // $ANTLR start "rule__PlusOrMinus__OperatorAssignment_1_0_1"
    // InternalMathInterpreter.g:1225:1: rule__PlusOrMinus__OperatorAssignment_1_0_1 : ( ( '+' ) ) ;
    public final void rule__PlusOrMinus__OperatorAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathInterpreter.g:1229:1: ( ( ( '+' ) ) )
            // InternalMathInterpreter.g:1230:2: ( ( '+' ) )
            {
            // InternalMathInterpreter.g:1230:2: ( ( '+' ) )
            // InternalMathInterpreter.g:1231:3: ( '+' )
            {
             before(grammarAccess.getPlusOrMinusAccess().getOperatorPlusSignKeyword_1_0_1_0()); 
            // InternalMathInterpreter.g:1232:3: ( '+' )
            // InternalMathInterpreter.g:1233:4: '+'
            {
             before(grammarAccess.getPlusOrMinusAccess().getOperatorPlusSignKeyword_1_0_1_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPlusOrMinusAccess().getOperatorPlusSignKeyword_1_0_1_0()); 

            }

             after(grammarAccess.getPlusOrMinusAccess().getOperatorPlusSignKeyword_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__OperatorAssignment_1_0_1"


    // $ANTLR start "rule__PlusOrMinus__RightAssignment_1_0_2"
    // InternalMathInterpreter.g:1244:1: rule__PlusOrMinus__RightAssignment_1_0_2 : ( ruleMultiplyOrDivide ) ;
    public final void rule__PlusOrMinus__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathInterpreter.g:1248:1: ( ( ruleMultiplyOrDivide ) )
            // InternalMathInterpreter.g:1249:2: ( ruleMultiplyOrDivide )
            {
            // InternalMathInterpreter.g:1249:2: ( ruleMultiplyOrDivide )
            // InternalMathInterpreter.g:1250:3: ruleMultiplyOrDivide
            {
             before(grammarAccess.getPlusOrMinusAccess().getRightMultiplyOrDivideParserRuleCall_1_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplyOrDivide();

            state._fsp--;

             after(grammarAccess.getPlusOrMinusAccess().getRightMultiplyOrDivideParserRuleCall_1_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__RightAssignment_1_0_2"


    // $ANTLR start "rule__PlusOrMinus__OperatorAssignment_1_1_1"
    // InternalMathInterpreter.g:1259:1: rule__PlusOrMinus__OperatorAssignment_1_1_1 : ( ( '-' ) ) ;
    public final void rule__PlusOrMinus__OperatorAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathInterpreter.g:1263:1: ( ( ( '-' ) ) )
            // InternalMathInterpreter.g:1264:2: ( ( '-' ) )
            {
            // InternalMathInterpreter.g:1264:2: ( ( '-' ) )
            // InternalMathInterpreter.g:1265:3: ( '-' )
            {
             before(grammarAccess.getPlusOrMinusAccess().getOperatorHyphenMinusKeyword_1_1_1_0()); 
            // InternalMathInterpreter.g:1266:3: ( '-' )
            // InternalMathInterpreter.g:1267:4: '-'
            {
             before(grammarAccess.getPlusOrMinusAccess().getOperatorHyphenMinusKeyword_1_1_1_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPlusOrMinusAccess().getOperatorHyphenMinusKeyword_1_1_1_0()); 

            }

             after(grammarAccess.getPlusOrMinusAccess().getOperatorHyphenMinusKeyword_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__OperatorAssignment_1_1_1"


    // $ANTLR start "rule__PlusOrMinus__RightAssignment_1_1_2"
    // InternalMathInterpreter.g:1278:1: rule__PlusOrMinus__RightAssignment_1_1_2 : ( ruleMultiplyOrDivide ) ;
    public final void rule__PlusOrMinus__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathInterpreter.g:1282:1: ( ( ruleMultiplyOrDivide ) )
            // InternalMathInterpreter.g:1283:2: ( ruleMultiplyOrDivide )
            {
            // InternalMathInterpreter.g:1283:2: ( ruleMultiplyOrDivide )
            // InternalMathInterpreter.g:1284:3: ruleMultiplyOrDivide
            {
             before(grammarAccess.getPlusOrMinusAccess().getRightMultiplyOrDivideParserRuleCall_1_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplyOrDivide();

            state._fsp--;

             after(grammarAccess.getPlusOrMinusAccess().getRightMultiplyOrDivideParserRuleCall_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__RightAssignment_1_1_2"


    // $ANTLR start "rule__MultiplyOrDivide__LeftAssignment_0"
    // InternalMathInterpreter.g:1293:1: rule__MultiplyOrDivide__LeftAssignment_0 : ( rulePrimary ) ;
    public final void rule__MultiplyOrDivide__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathInterpreter.g:1297:1: ( ( rulePrimary ) )
            // InternalMathInterpreter.g:1298:2: ( rulePrimary )
            {
            // InternalMathInterpreter.g:1298:2: ( rulePrimary )
            // InternalMathInterpreter.g:1299:3: rulePrimary
            {
             before(grammarAccess.getMultiplyOrDivideAccess().getLeftPrimaryParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getMultiplyOrDivideAccess().getLeftPrimaryParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplyOrDivide__LeftAssignment_0"


    // $ANTLR start "rule__MultiplyOrDivide__OperatorAssignment_1_0_1"
    // InternalMathInterpreter.g:1308:1: rule__MultiplyOrDivide__OperatorAssignment_1_0_1 : ( ( '*' ) ) ;
    public final void rule__MultiplyOrDivide__OperatorAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathInterpreter.g:1312:1: ( ( ( '*' ) ) )
            // InternalMathInterpreter.g:1313:2: ( ( '*' ) )
            {
            // InternalMathInterpreter.g:1313:2: ( ( '*' ) )
            // InternalMathInterpreter.g:1314:3: ( '*' )
            {
             before(grammarAccess.getMultiplyOrDivideAccess().getOperatorAsteriskKeyword_1_0_1_0()); 
            // InternalMathInterpreter.g:1315:3: ( '*' )
            // InternalMathInterpreter.g:1316:4: '*'
            {
             before(grammarAccess.getMultiplyOrDivideAccess().getOperatorAsteriskKeyword_1_0_1_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getMultiplyOrDivideAccess().getOperatorAsteriskKeyword_1_0_1_0()); 

            }

             after(grammarAccess.getMultiplyOrDivideAccess().getOperatorAsteriskKeyword_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplyOrDivide__OperatorAssignment_1_0_1"


    // $ANTLR start "rule__MultiplyOrDivide__RightAssignment_1_0_2"
    // InternalMathInterpreter.g:1327:1: rule__MultiplyOrDivide__RightAssignment_1_0_2 : ( rulePrimary ) ;
    public final void rule__MultiplyOrDivide__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathInterpreter.g:1331:1: ( ( rulePrimary ) )
            // InternalMathInterpreter.g:1332:2: ( rulePrimary )
            {
            // InternalMathInterpreter.g:1332:2: ( rulePrimary )
            // InternalMathInterpreter.g:1333:3: rulePrimary
            {
             before(grammarAccess.getMultiplyOrDivideAccess().getRightPrimaryParserRuleCall_1_0_2_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getMultiplyOrDivideAccess().getRightPrimaryParserRuleCall_1_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplyOrDivide__RightAssignment_1_0_2"


    // $ANTLR start "rule__MultiplyOrDivide__OperatorAssignment_1_1_1"
    // InternalMathInterpreter.g:1342:1: rule__MultiplyOrDivide__OperatorAssignment_1_1_1 : ( ( '/' ) ) ;
    public final void rule__MultiplyOrDivide__OperatorAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathInterpreter.g:1346:1: ( ( ( '/' ) ) )
            // InternalMathInterpreter.g:1347:2: ( ( '/' ) )
            {
            // InternalMathInterpreter.g:1347:2: ( ( '/' ) )
            // InternalMathInterpreter.g:1348:3: ( '/' )
            {
             before(grammarAccess.getMultiplyOrDivideAccess().getOperatorSolidusKeyword_1_1_1_0()); 
            // InternalMathInterpreter.g:1349:3: ( '/' )
            // InternalMathInterpreter.g:1350:4: '/'
            {
             before(grammarAccess.getMultiplyOrDivideAccess().getOperatorSolidusKeyword_1_1_1_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getMultiplyOrDivideAccess().getOperatorSolidusKeyword_1_1_1_0()); 

            }

             after(grammarAccess.getMultiplyOrDivideAccess().getOperatorSolidusKeyword_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplyOrDivide__OperatorAssignment_1_1_1"


    // $ANTLR start "rule__MultiplyOrDivide__RightAssignment_1_1_2"
    // InternalMathInterpreter.g:1361:1: rule__MultiplyOrDivide__RightAssignment_1_1_2 : ( rulePrimary ) ;
    public final void rule__MultiplyOrDivide__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathInterpreter.g:1365:1: ( ( rulePrimary ) )
            // InternalMathInterpreter.g:1366:2: ( rulePrimary )
            {
            // InternalMathInterpreter.g:1366:2: ( rulePrimary )
            // InternalMathInterpreter.g:1367:3: rulePrimary
            {
             before(grammarAccess.getMultiplyOrDivideAccess().getRightPrimaryParserRuleCall_1_1_2_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getMultiplyOrDivideAccess().getRightPrimaryParserRuleCall_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplyOrDivide__RightAssignment_1_1_2"


    // $ANTLR start "rule__Primary__ValueAssignment_0_1"
    // InternalMathInterpreter.g:1376:1: rule__Primary__ValueAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__Primary__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathInterpreter.g:1380:1: ( ( RULE_INT ) )
            // InternalMathInterpreter.g:1381:2: ( RULE_INT )
            {
            // InternalMathInterpreter.g:1381:2: ( RULE_INT )
            // InternalMathInterpreter.g:1382:3: RULE_INT
            {
             before(grammarAccess.getPrimaryAccess().getValueINTTerminalRuleCall_0_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getValueINTTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__ValueAssignment_0_1"


    // $ANTLR start "rule__Primary__ValueAssignment_1_1"
    // InternalMathInterpreter.g:1391:1: rule__Primary__ValueAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Primary__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathInterpreter.g:1395:1: ( ( ( RULE_ID ) ) )
            // InternalMathInterpreter.g:1396:2: ( ( RULE_ID ) )
            {
            // InternalMathInterpreter.g:1396:2: ( ( RULE_ID ) )
            // InternalMathInterpreter.g:1397:3: ( RULE_ID )
            {
             before(grammarAccess.getPrimaryAccess().getValueVariableCrossReference_1_1_0()); 
            // InternalMathInterpreter.g:1398:3: ( RULE_ID )
            // InternalMathInterpreter.g:1399:4: RULE_ID
            {
             before(grammarAccess.getPrimaryAccess().getValueVariableIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getValueVariableIDTerminalRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getPrimaryAccess().getValueVariableCrossReference_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__ValueAssignment_1_1"


    // $ANTLR start "rule__Primary__ValueAssignment_2_2"
    // InternalMathInterpreter.g:1410:1: rule__Primary__ValueAssignment_2_2 : ( ruleExpression ) ;
    public final void rule__Primary__ValueAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathInterpreter.g:1414:1: ( ( ruleExpression ) )
            // InternalMathInterpreter.g:1415:2: ( ruleExpression )
            {
            // InternalMathInterpreter.g:1415:2: ( ruleExpression )
            // InternalMathInterpreter.g:1416:3: ruleExpression
            {
             before(grammarAccess.getPrimaryAccess().getValueExpressionParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryAccess().getValueExpressionParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__ValueAssignment_2_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000008000L});

}