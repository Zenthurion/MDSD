package dk.sdu.mdsd.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import dk.sdu.mdsd.services.MathInterpreterGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMathInterpreterParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'given'", "'solve'", "'='", "'+'", "'-'", "'*'", "'/'", "'('", "')'"
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

        public InternalMathInterpreterParser(TokenStream input, MathInterpreterGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Solution";
       	}

       	@Override
       	protected MathInterpreterGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSolution"
    // InternalMathInterpreter.g:64:1: entryRuleSolution returns [EObject current=null] : iv_ruleSolution= ruleSolution EOF ;
    public final EObject entryRuleSolution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSolution = null;


        try {
            // InternalMathInterpreter.g:64:49: (iv_ruleSolution= ruleSolution EOF )
            // InternalMathInterpreter.g:65:2: iv_ruleSolution= ruleSolution EOF
            {
             newCompositeNode(grammarAccess.getSolutionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSolution=ruleSolution();

            state._fsp--;

             current =iv_ruleSolution; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSolution"


    // $ANTLR start "ruleSolution"
    // InternalMathInterpreter.g:71:1: ruleSolution returns [EObject current=null] : ( (otherlv_0= 'given' ( (lv_variables_1_0= ruleVariable ) )* )? otherlv_2= 'solve' ( (lv_expression_3_0= ruleExpression ) ) ) ;
    public final EObject ruleSolution() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_variables_1_0 = null;

        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalMathInterpreter.g:77:2: ( ( (otherlv_0= 'given' ( (lv_variables_1_0= ruleVariable ) )* )? otherlv_2= 'solve' ( (lv_expression_3_0= ruleExpression ) ) ) )
            // InternalMathInterpreter.g:78:2: ( (otherlv_0= 'given' ( (lv_variables_1_0= ruleVariable ) )* )? otherlv_2= 'solve' ( (lv_expression_3_0= ruleExpression ) ) )
            {
            // InternalMathInterpreter.g:78:2: ( (otherlv_0= 'given' ( (lv_variables_1_0= ruleVariable ) )* )? otherlv_2= 'solve' ( (lv_expression_3_0= ruleExpression ) ) )
            // InternalMathInterpreter.g:79:3: (otherlv_0= 'given' ( (lv_variables_1_0= ruleVariable ) )* )? otherlv_2= 'solve' ( (lv_expression_3_0= ruleExpression ) )
            {
            // InternalMathInterpreter.g:79:3: (otherlv_0= 'given' ( (lv_variables_1_0= ruleVariable ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMathInterpreter.g:80:4: otherlv_0= 'given' ( (lv_variables_1_0= ruleVariable ) )*
                    {
                    otherlv_0=(Token)match(input,11,FOLLOW_3); 

                    				newLeafNode(otherlv_0, grammarAccess.getSolutionAccess().getGivenKeyword_0_0());
                    			
                    // InternalMathInterpreter.g:84:4: ( (lv_variables_1_0= ruleVariable ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==RULE_ID) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalMathInterpreter.g:85:5: (lv_variables_1_0= ruleVariable )
                    	    {
                    	    // InternalMathInterpreter.g:85:5: (lv_variables_1_0= ruleVariable )
                    	    // InternalMathInterpreter.g:86:6: lv_variables_1_0= ruleVariable
                    	    {

                    	    						newCompositeNode(grammarAccess.getSolutionAccess().getVariablesVariableParserRuleCall_0_1_0());
                    	    					
                    	    pushFollow(FOLLOW_3);
                    	    lv_variables_1_0=ruleVariable();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getSolutionRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"variables",
                    	    							lv_variables_1_0,
                    	    							"dk.sdu.mdsd.MathInterpreter.Variable");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getSolutionAccess().getSolveKeyword_1());
            		
            // InternalMathInterpreter.g:108:3: ( (lv_expression_3_0= ruleExpression ) )
            // InternalMathInterpreter.g:109:4: (lv_expression_3_0= ruleExpression )
            {
            // InternalMathInterpreter.g:109:4: (lv_expression_3_0= ruleExpression )
            // InternalMathInterpreter.g:110:5: lv_expression_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getSolutionAccess().getExpressionExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_expression_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSolutionRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_3_0,
            						"dk.sdu.mdsd.MathInterpreter.Expression");
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
    // $ANTLR end "ruleSolution"


    // $ANTLR start "entryRuleVariable"
    // InternalMathInterpreter.g:131:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalMathInterpreter.g:131:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalMathInterpreter.g:132:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalMathInterpreter.g:138:1: ruleVariable returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalMathInterpreter.g:144:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) ) )
            // InternalMathInterpreter.g:145:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )
            {
            // InternalMathInterpreter.g:145:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )
            // InternalMathInterpreter.g:146:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) )
            {
            // InternalMathInterpreter.g:146:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalMathInterpreter.g:147:4: (lv_name_0_0= RULE_ID )
            {
            // InternalMathInterpreter.g:147:4: (lv_name_0_0= RULE_ID )
            // InternalMathInterpreter.g:148:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_0_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getVariableAccess().getEqualsSignKeyword_1());
            		
            // InternalMathInterpreter.g:168:3: ( (lv_value_2_0= ruleExpression ) )
            // InternalMathInterpreter.g:169:4: (lv_value_2_0= ruleExpression )
            {
            // InternalMathInterpreter.g:169:4: (lv_value_2_0= ruleExpression )
            // InternalMathInterpreter.g:170:5: lv_value_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getVariableAccess().getValueExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"dk.sdu.mdsd.MathInterpreter.Expression");
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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleExpression"
    // InternalMathInterpreter.g:191:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalMathInterpreter.g:191:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalMathInterpreter.g:192:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalMathInterpreter.g:198:1: ruleExpression returns [EObject current=null] : ( (lv_exp_0_0= rulePlusOrMinus ) ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_exp_0_0 = null;



        	enterRule();

        try {
            // InternalMathInterpreter.g:204:2: ( ( (lv_exp_0_0= rulePlusOrMinus ) ) )
            // InternalMathInterpreter.g:205:2: ( (lv_exp_0_0= rulePlusOrMinus ) )
            {
            // InternalMathInterpreter.g:205:2: ( (lv_exp_0_0= rulePlusOrMinus ) )
            // InternalMathInterpreter.g:206:3: (lv_exp_0_0= rulePlusOrMinus )
            {
            // InternalMathInterpreter.g:206:3: (lv_exp_0_0= rulePlusOrMinus )
            // InternalMathInterpreter.g:207:4: lv_exp_0_0= rulePlusOrMinus
            {

            				newCompositeNode(grammarAccess.getExpressionAccess().getExpPlusOrMinusParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_exp_0_0=rulePlusOrMinus();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getExpressionRule());
            				}
            				set(
            					current,
            					"exp",
            					lv_exp_0_0,
            					"dk.sdu.mdsd.MathInterpreter.PlusOrMinus");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRulePlusOrMinus"
    // InternalMathInterpreter.g:227:1: entryRulePlusOrMinus returns [EObject current=null] : iv_rulePlusOrMinus= rulePlusOrMinus EOF ;
    public final EObject entryRulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusOrMinus = null;


        try {
            // InternalMathInterpreter.g:227:52: (iv_rulePlusOrMinus= rulePlusOrMinus EOF )
            // InternalMathInterpreter.g:228:2: iv_rulePlusOrMinus= rulePlusOrMinus EOF
            {
             newCompositeNode(grammarAccess.getPlusOrMinusRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlusOrMinus=rulePlusOrMinus();

            state._fsp--;

             current =iv_rulePlusOrMinus; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePlusOrMinus"


    // $ANTLR start "rulePlusOrMinus"
    // InternalMathInterpreter.g:234:1: rulePlusOrMinus returns [EObject current=null] : ( ( (lv_left_0_0= ruleMultiplyOrDivide ) ) ( ( () ( (lv_operator_2_0= '+' ) ) ( (lv_right_3_0= ruleMultiplyOrDivide ) ) ) | ( () ( (lv_operator_5_0= '-' ) ) ( (lv_right_6_0= ruleMultiplyOrDivide ) ) ) )* ) ;
    public final EObject rulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_0=null;
        Token lv_operator_5_0=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;



        	enterRule();

        try {
            // InternalMathInterpreter.g:240:2: ( ( ( (lv_left_0_0= ruleMultiplyOrDivide ) ) ( ( () ( (lv_operator_2_0= '+' ) ) ( (lv_right_3_0= ruleMultiplyOrDivide ) ) ) | ( () ( (lv_operator_5_0= '-' ) ) ( (lv_right_6_0= ruleMultiplyOrDivide ) ) ) )* ) )
            // InternalMathInterpreter.g:241:2: ( ( (lv_left_0_0= ruleMultiplyOrDivide ) ) ( ( () ( (lv_operator_2_0= '+' ) ) ( (lv_right_3_0= ruleMultiplyOrDivide ) ) ) | ( () ( (lv_operator_5_0= '-' ) ) ( (lv_right_6_0= ruleMultiplyOrDivide ) ) ) )* )
            {
            // InternalMathInterpreter.g:241:2: ( ( (lv_left_0_0= ruleMultiplyOrDivide ) ) ( ( () ( (lv_operator_2_0= '+' ) ) ( (lv_right_3_0= ruleMultiplyOrDivide ) ) ) | ( () ( (lv_operator_5_0= '-' ) ) ( (lv_right_6_0= ruleMultiplyOrDivide ) ) ) )* )
            // InternalMathInterpreter.g:242:3: ( (lv_left_0_0= ruleMultiplyOrDivide ) ) ( ( () ( (lv_operator_2_0= '+' ) ) ( (lv_right_3_0= ruleMultiplyOrDivide ) ) ) | ( () ( (lv_operator_5_0= '-' ) ) ( (lv_right_6_0= ruleMultiplyOrDivide ) ) ) )*
            {
            // InternalMathInterpreter.g:242:3: ( (lv_left_0_0= ruleMultiplyOrDivide ) )
            // InternalMathInterpreter.g:243:4: (lv_left_0_0= ruleMultiplyOrDivide )
            {
            // InternalMathInterpreter.g:243:4: (lv_left_0_0= ruleMultiplyOrDivide )
            // InternalMathInterpreter.g:244:5: lv_left_0_0= ruleMultiplyOrDivide
            {

            					newCompositeNode(grammarAccess.getPlusOrMinusAccess().getLeftMultiplyOrDivideParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_6);
            lv_left_0_0=ruleMultiplyOrDivide();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPlusOrMinusRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_0_0,
            						"dk.sdu.mdsd.MathInterpreter.MultiplyOrDivide");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMathInterpreter.g:261:3: ( ( () ( (lv_operator_2_0= '+' ) ) ( (lv_right_3_0= ruleMultiplyOrDivide ) ) ) | ( () ( (lv_operator_5_0= '-' ) ) ( (lv_right_6_0= ruleMultiplyOrDivide ) ) ) )*
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }
                else if ( (LA3_0==15) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMathInterpreter.g:262:4: ( () ( (lv_operator_2_0= '+' ) ) ( (lv_right_3_0= ruleMultiplyOrDivide ) ) )
            	    {
            	    // InternalMathInterpreter.g:262:4: ( () ( (lv_operator_2_0= '+' ) ) ( (lv_right_3_0= ruleMultiplyOrDivide ) ) )
            	    // InternalMathInterpreter.g:263:5: () ( (lv_operator_2_0= '+' ) ) ( (lv_right_3_0= ruleMultiplyOrDivide ) )
            	    {
            	    // InternalMathInterpreter.g:263:5: ()
            	    // InternalMathInterpreter.g:264:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    // InternalMathInterpreter.g:270:5: ( (lv_operator_2_0= '+' ) )
            	    // InternalMathInterpreter.g:271:6: (lv_operator_2_0= '+' )
            	    {
            	    // InternalMathInterpreter.g:271:6: (lv_operator_2_0= '+' )
            	    // InternalMathInterpreter.g:272:7: lv_operator_2_0= '+'
            	    {
            	    lv_operator_2_0=(Token)match(input,14,FOLLOW_4); 

            	    							newLeafNode(lv_operator_2_0, grammarAccess.getPlusOrMinusAccess().getOperatorPlusSignKeyword_1_0_1_0());
            	    						

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getPlusOrMinusRule());
            	    							}
            	    							setWithLastConsumed(current, "operator", lv_operator_2_0, "+");
            	    						

            	    }


            	    }

            	    // InternalMathInterpreter.g:284:5: ( (lv_right_3_0= ruleMultiplyOrDivide ) )
            	    // InternalMathInterpreter.g:285:6: (lv_right_3_0= ruleMultiplyOrDivide )
            	    {
            	    // InternalMathInterpreter.g:285:6: (lv_right_3_0= ruleMultiplyOrDivide )
            	    // InternalMathInterpreter.g:286:7: lv_right_3_0= ruleMultiplyOrDivide
            	    {

            	    							newCompositeNode(grammarAccess.getPlusOrMinusAccess().getRightMultiplyOrDivideParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_6);
            	    lv_right_3_0=ruleMultiplyOrDivide();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getPlusOrMinusRule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_3_0,
            	    								"dk.sdu.mdsd.MathInterpreter.MultiplyOrDivide");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMathInterpreter.g:305:4: ( () ( (lv_operator_5_0= '-' ) ) ( (lv_right_6_0= ruleMultiplyOrDivide ) ) )
            	    {
            	    // InternalMathInterpreter.g:305:4: ( () ( (lv_operator_5_0= '-' ) ) ( (lv_right_6_0= ruleMultiplyOrDivide ) ) )
            	    // InternalMathInterpreter.g:306:5: () ( (lv_operator_5_0= '-' ) ) ( (lv_right_6_0= ruleMultiplyOrDivide ) )
            	    {
            	    // InternalMathInterpreter.g:306:5: ()
            	    // InternalMathInterpreter.g:307:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_1_0(),
            	    							current);
            	    					

            	    }

            	    // InternalMathInterpreter.g:313:5: ( (lv_operator_5_0= '-' ) )
            	    // InternalMathInterpreter.g:314:6: (lv_operator_5_0= '-' )
            	    {
            	    // InternalMathInterpreter.g:314:6: (lv_operator_5_0= '-' )
            	    // InternalMathInterpreter.g:315:7: lv_operator_5_0= '-'
            	    {
            	    lv_operator_5_0=(Token)match(input,15,FOLLOW_4); 

            	    							newLeafNode(lv_operator_5_0, grammarAccess.getPlusOrMinusAccess().getOperatorHyphenMinusKeyword_1_1_1_0());
            	    						

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getPlusOrMinusRule());
            	    							}
            	    							setWithLastConsumed(current, "operator", lv_operator_5_0, "-");
            	    						

            	    }


            	    }

            	    // InternalMathInterpreter.g:327:5: ( (lv_right_6_0= ruleMultiplyOrDivide ) )
            	    // InternalMathInterpreter.g:328:6: (lv_right_6_0= ruleMultiplyOrDivide )
            	    {
            	    // InternalMathInterpreter.g:328:6: (lv_right_6_0= ruleMultiplyOrDivide )
            	    // InternalMathInterpreter.g:329:7: lv_right_6_0= ruleMultiplyOrDivide
            	    {

            	    							newCompositeNode(grammarAccess.getPlusOrMinusAccess().getRightMultiplyOrDivideParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_6);
            	    lv_right_6_0=ruleMultiplyOrDivide();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getPlusOrMinusRule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_6_0,
            	    								"dk.sdu.mdsd.MathInterpreter.MultiplyOrDivide");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // $ANTLR end "rulePlusOrMinus"


    // $ANTLR start "entryRuleMultiplyOrDivide"
    // InternalMathInterpreter.g:352:1: entryRuleMultiplyOrDivide returns [EObject current=null] : iv_ruleMultiplyOrDivide= ruleMultiplyOrDivide EOF ;
    public final EObject entryRuleMultiplyOrDivide() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplyOrDivide = null;


        try {
            // InternalMathInterpreter.g:352:57: (iv_ruleMultiplyOrDivide= ruleMultiplyOrDivide EOF )
            // InternalMathInterpreter.g:353:2: iv_ruleMultiplyOrDivide= ruleMultiplyOrDivide EOF
            {
             newCompositeNode(grammarAccess.getMultiplyOrDivideRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiplyOrDivide=ruleMultiplyOrDivide();

            state._fsp--;

             current =iv_ruleMultiplyOrDivide; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMultiplyOrDivide"


    // $ANTLR start "ruleMultiplyOrDivide"
    // InternalMathInterpreter.g:359:1: ruleMultiplyOrDivide returns [EObject current=null] : ( ( (lv_left_0_0= rulePrimary ) ) ( ( () ( (lv_operator_2_0= '*' ) ) ( (lv_right_3_0= rulePrimary ) ) ) | ( () ( (lv_operator_5_0= '/' ) ) ( (lv_right_6_0= rulePrimary ) ) ) )* ) ;
    public final EObject ruleMultiplyOrDivide() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_0=null;
        Token lv_operator_5_0=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;



        	enterRule();

        try {
            // InternalMathInterpreter.g:365:2: ( ( ( (lv_left_0_0= rulePrimary ) ) ( ( () ( (lv_operator_2_0= '*' ) ) ( (lv_right_3_0= rulePrimary ) ) ) | ( () ( (lv_operator_5_0= '/' ) ) ( (lv_right_6_0= rulePrimary ) ) ) )* ) )
            // InternalMathInterpreter.g:366:2: ( ( (lv_left_0_0= rulePrimary ) ) ( ( () ( (lv_operator_2_0= '*' ) ) ( (lv_right_3_0= rulePrimary ) ) ) | ( () ( (lv_operator_5_0= '/' ) ) ( (lv_right_6_0= rulePrimary ) ) ) )* )
            {
            // InternalMathInterpreter.g:366:2: ( ( (lv_left_0_0= rulePrimary ) ) ( ( () ( (lv_operator_2_0= '*' ) ) ( (lv_right_3_0= rulePrimary ) ) ) | ( () ( (lv_operator_5_0= '/' ) ) ( (lv_right_6_0= rulePrimary ) ) ) )* )
            // InternalMathInterpreter.g:367:3: ( (lv_left_0_0= rulePrimary ) ) ( ( () ( (lv_operator_2_0= '*' ) ) ( (lv_right_3_0= rulePrimary ) ) ) | ( () ( (lv_operator_5_0= '/' ) ) ( (lv_right_6_0= rulePrimary ) ) ) )*
            {
            // InternalMathInterpreter.g:367:3: ( (lv_left_0_0= rulePrimary ) )
            // InternalMathInterpreter.g:368:4: (lv_left_0_0= rulePrimary )
            {
            // InternalMathInterpreter.g:368:4: (lv_left_0_0= rulePrimary )
            // InternalMathInterpreter.g:369:5: lv_left_0_0= rulePrimary
            {

            					newCompositeNode(grammarAccess.getMultiplyOrDivideAccess().getLeftPrimaryParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
            lv_left_0_0=rulePrimary();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMultiplyOrDivideRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_0_0,
            						"dk.sdu.mdsd.MathInterpreter.Primary");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMathInterpreter.g:386:3: ( ( () ( (lv_operator_2_0= '*' ) ) ( (lv_right_3_0= rulePrimary ) ) ) | ( () ( (lv_operator_5_0= '/' ) ) ( (lv_right_6_0= rulePrimary ) ) ) )*
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }
                else if ( (LA4_0==17) ) {
                    alt4=2;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMathInterpreter.g:387:4: ( () ( (lv_operator_2_0= '*' ) ) ( (lv_right_3_0= rulePrimary ) ) )
            	    {
            	    // InternalMathInterpreter.g:387:4: ( () ( (lv_operator_2_0= '*' ) ) ( (lv_right_3_0= rulePrimary ) ) )
            	    // InternalMathInterpreter.g:388:5: () ( (lv_operator_2_0= '*' ) ) ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // InternalMathInterpreter.g:388:5: ()
            	    // InternalMathInterpreter.g:389:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getMultiplyOrDivideAccess().getMultiplyLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    // InternalMathInterpreter.g:395:5: ( (lv_operator_2_0= '*' ) )
            	    // InternalMathInterpreter.g:396:6: (lv_operator_2_0= '*' )
            	    {
            	    // InternalMathInterpreter.g:396:6: (lv_operator_2_0= '*' )
            	    // InternalMathInterpreter.g:397:7: lv_operator_2_0= '*'
            	    {
            	    lv_operator_2_0=(Token)match(input,16,FOLLOW_4); 

            	    							newLeafNode(lv_operator_2_0, grammarAccess.getMultiplyOrDivideAccess().getOperatorAsteriskKeyword_1_0_1_0());
            	    						

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getMultiplyOrDivideRule());
            	    							}
            	    							setWithLastConsumed(current, "operator", lv_operator_2_0, "*");
            	    						

            	    }


            	    }

            	    // InternalMathInterpreter.g:409:5: ( (lv_right_3_0= rulePrimary ) )
            	    // InternalMathInterpreter.g:410:6: (lv_right_3_0= rulePrimary )
            	    {
            	    // InternalMathInterpreter.g:410:6: (lv_right_3_0= rulePrimary )
            	    // InternalMathInterpreter.g:411:7: lv_right_3_0= rulePrimary
            	    {

            	    							newCompositeNode(grammarAccess.getMultiplyOrDivideAccess().getRightPrimaryParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_7);
            	    lv_right_3_0=rulePrimary();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getMultiplyOrDivideRule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_3_0,
            	    								"dk.sdu.mdsd.MathInterpreter.Primary");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMathInterpreter.g:430:4: ( () ( (lv_operator_5_0= '/' ) ) ( (lv_right_6_0= rulePrimary ) ) )
            	    {
            	    // InternalMathInterpreter.g:430:4: ( () ( (lv_operator_5_0= '/' ) ) ( (lv_right_6_0= rulePrimary ) ) )
            	    // InternalMathInterpreter.g:431:5: () ( (lv_operator_5_0= '/' ) ) ( (lv_right_6_0= rulePrimary ) )
            	    {
            	    // InternalMathInterpreter.g:431:5: ()
            	    // InternalMathInterpreter.g:432:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getMultiplyOrDivideAccess().getDivideLeftAction_1_1_0(),
            	    							current);
            	    					

            	    }

            	    // InternalMathInterpreter.g:438:5: ( (lv_operator_5_0= '/' ) )
            	    // InternalMathInterpreter.g:439:6: (lv_operator_5_0= '/' )
            	    {
            	    // InternalMathInterpreter.g:439:6: (lv_operator_5_0= '/' )
            	    // InternalMathInterpreter.g:440:7: lv_operator_5_0= '/'
            	    {
            	    lv_operator_5_0=(Token)match(input,17,FOLLOW_4); 

            	    							newLeafNode(lv_operator_5_0, grammarAccess.getMultiplyOrDivideAccess().getOperatorSolidusKeyword_1_1_1_0());
            	    						

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getMultiplyOrDivideRule());
            	    							}
            	    							setWithLastConsumed(current, "operator", lv_operator_5_0, "/");
            	    						

            	    }


            	    }

            	    // InternalMathInterpreter.g:452:5: ( (lv_right_6_0= rulePrimary ) )
            	    // InternalMathInterpreter.g:453:6: (lv_right_6_0= rulePrimary )
            	    {
            	    // InternalMathInterpreter.g:453:6: (lv_right_6_0= rulePrimary )
            	    // InternalMathInterpreter.g:454:7: lv_right_6_0= rulePrimary
            	    {

            	    							newCompositeNode(grammarAccess.getMultiplyOrDivideAccess().getRightPrimaryParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_7);
            	    lv_right_6_0=rulePrimary();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getMultiplyOrDivideRule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_6_0,
            	    								"dk.sdu.mdsd.MathInterpreter.Primary");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // $ANTLR end "ruleMultiplyOrDivide"


    // $ANTLR start "entryRulePrimary"
    // InternalMathInterpreter.g:477:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalMathInterpreter.g:477:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalMathInterpreter.g:478:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalMathInterpreter.g:484:1: rulePrimary returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (otherlv_3= RULE_ID ) ) ) | ( () otherlv_5= '(' ( (lv_value_6_0= ruleExpression ) ) otherlv_7= ')' ) ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_value_6_0 = null;



        	enterRule();

        try {
            // InternalMathInterpreter.g:490:2: ( ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (otherlv_3= RULE_ID ) ) ) | ( () otherlv_5= '(' ( (lv_value_6_0= ruleExpression ) ) otherlv_7= ')' ) ) )
            // InternalMathInterpreter.g:491:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (otherlv_3= RULE_ID ) ) ) | ( () otherlv_5= '(' ( (lv_value_6_0= ruleExpression ) ) otherlv_7= ')' ) )
            {
            // InternalMathInterpreter.g:491:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (otherlv_3= RULE_ID ) ) ) | ( () otherlv_5= '(' ( (lv_value_6_0= ruleExpression ) ) otherlv_7= ')' ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt5=1;
                }
                break;
            case RULE_ID:
                {
                alt5=2;
                }
                break;
            case 18:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMathInterpreter.g:492:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // InternalMathInterpreter.g:492:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    // InternalMathInterpreter.g:493:4: () ( (lv_value_1_0= RULE_INT ) )
                    {
                    // InternalMathInterpreter.g:493:4: ()
                    // InternalMathInterpreter.g:494:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getNumAction_0_0(),
                    						current);
                    				

                    }

                    // InternalMathInterpreter.g:500:4: ( (lv_value_1_0= RULE_INT ) )
                    // InternalMathInterpreter.g:501:5: (lv_value_1_0= RULE_INT )
                    {
                    // InternalMathInterpreter.g:501:5: (lv_value_1_0= RULE_INT )
                    // InternalMathInterpreter.g:502:6: lv_value_1_0= RULE_INT
                    {
                    lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_value_1_0, grammarAccess.getPrimaryAccess().getValueINTTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrimaryRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_1_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMathInterpreter.g:520:3: ( () ( (otherlv_3= RULE_ID ) ) )
                    {
                    // InternalMathInterpreter.g:520:3: ( () ( (otherlv_3= RULE_ID ) ) )
                    // InternalMathInterpreter.g:521:4: () ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalMathInterpreter.g:521:4: ()
                    // InternalMathInterpreter.g:522:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getVariableRefAction_1_0(),
                    						current);
                    				

                    }

                    // InternalMathInterpreter.g:528:4: ( (otherlv_3= RULE_ID ) )
                    // InternalMathInterpreter.g:529:5: (otherlv_3= RULE_ID )
                    {
                    // InternalMathInterpreter.g:529:5: (otherlv_3= RULE_ID )
                    // InternalMathInterpreter.g:530:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrimaryRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_3, grammarAccess.getPrimaryAccess().getValueVariableCrossReference_1_1_0());
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMathInterpreter.g:543:3: ( () otherlv_5= '(' ( (lv_value_6_0= ruleExpression ) ) otherlv_7= ')' )
                    {
                    // InternalMathInterpreter.g:543:3: ( () otherlv_5= '(' ( (lv_value_6_0= ruleExpression ) ) otherlv_7= ')' )
                    // InternalMathInterpreter.g:544:4: () otherlv_5= '(' ( (lv_value_6_0= ruleExpression ) ) otherlv_7= ')'
                    {
                    // InternalMathInterpreter.g:544:4: ()
                    // InternalMathInterpreter.g:545:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getBracketAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_5=(Token)match(input,18,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_2_1());
                    			
                    // InternalMathInterpreter.g:555:4: ( (lv_value_6_0= ruleExpression ) )
                    // InternalMathInterpreter.g:556:5: (lv_value_6_0= ruleExpression )
                    {
                    // InternalMathInterpreter.g:556:5: (lv_value_6_0= ruleExpression )
                    // InternalMathInterpreter.g:557:6: lv_value_6_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getPrimaryAccess().getValueExpressionParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_value_6_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_6_0,
                    							"dk.sdu.mdsd.MathInterpreter.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_2_3());
                    			

                    }


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
    // $ANTLR end "rulePrimary"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000040030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});

}