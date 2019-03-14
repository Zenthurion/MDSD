/*
 * generated by Xtext 2.16.0
 */
grammar InternalMathInterpreter;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package dk.sdu.mdsd.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleSolution
entryRuleSolution returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSolutionRule()); }
	iv_ruleSolution=ruleSolution
	{ $current=$iv_ruleSolution.current; }
	EOF;

// Rule Solution
ruleSolution returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='given'
			{
				newLeafNode(otherlv_0, grammarAccess.getSolutionAccess().getGivenKeyword_0_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getSolutionAccess().getVariablesVariableParserRuleCall_0_1_0());
					}
					lv_variables_1_0=ruleVariable
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSolutionRule());
						}
						add(
							$current,
							"variables",
							lv_variables_1_0,
							"dk.sdu.mdsd.MathInterpreter.Variable");
						afterParserOrEnumRuleCall();
					}
				)
			)*
		)?
		otherlv_2='solve'
		{
			newLeafNode(otherlv_2, grammarAccess.getSolutionAccess().getSolveKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSolutionAccess().getExpressionExpressionParserRuleCall_2_0());
				}
				lv_expression_3_0=ruleExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSolutionRule());
					}
					set(
						$current,
						"expression",
						lv_expression_3_0,
						"dk.sdu.mdsd.MathInterpreter.Expression");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleVariable
entryRuleVariable returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVariableRule()); }
	iv_ruleVariable=ruleVariable
	{ $current=$iv_ruleVariable.current; }
	EOF;

// Rule Variable
ruleVariable returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVariableRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_1='='
		{
			newLeafNode(otherlv_1, grammarAccess.getVariableAccess().getEqualsSignKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVariableAccess().getValueExpressionParserRuleCall_2_0());
				}
				lv_value_2_0=ruleExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVariableRule());
					}
					set(
						$current,
						"value",
						lv_value_2_0,
						"dk.sdu.mdsd.MathInterpreter.Expression");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleExpression
entryRuleExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExpressionRule()); }
	iv_ruleExpression=ruleExpression
	{ $current=$iv_ruleExpression.current; }
	EOF;

// Rule Expression
ruleExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getExpressionAccess().getExpPlusOrMinusParserRuleCall_0());
			}
			lv_exp_0_0=rulePlusOrMinus
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getExpressionRule());
				}
				set(
					$current,
					"exp",
					lv_exp_0_0,
					"dk.sdu.mdsd.MathInterpreter.PlusOrMinus");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRulePlusOrMinus
entryRulePlusOrMinus returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPlusOrMinusRule()); }
	iv_rulePlusOrMinus=rulePlusOrMinus
	{ $current=$iv_rulePlusOrMinus.current; }
	EOF;

// Rule PlusOrMinus
rulePlusOrMinus returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getPlusOrMinusAccess().getLeftMultiplyOrDivideParserRuleCall_0_0());
				}
				lv_left_0_0=ruleMultiplyOrDivide
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPlusOrMinusRule());
					}
					set(
						$current,
						"left",
						lv_left_0_0,
						"dk.sdu.mdsd.MathInterpreter.MultiplyOrDivide");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				(
					{
						$current = forceCreateModelElementAndSet(
							grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0(),
							$current);
					}
				)
				(
					(
						lv_operator_2_0='+'
						{
							newLeafNode(lv_operator_2_0, grammarAccess.getPlusOrMinusAccess().getOperatorPlusSignKeyword_1_0_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getPlusOrMinusRule());
							}
							setWithLastConsumed($current, "operator", lv_operator_2_0, "+");
						}
					)
				)
				(
					(
						{
							newCompositeNode(grammarAccess.getPlusOrMinusAccess().getRightMultiplyOrDivideParserRuleCall_1_0_2_0());
						}
						lv_right_3_0=ruleMultiplyOrDivide
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getPlusOrMinusRule());
							}
							set(
								$current,
								"right",
								lv_right_3_0,
								"dk.sdu.mdsd.MathInterpreter.MultiplyOrDivide");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
			    |
			(
				(
					{
						$current = forceCreateModelElementAndSet(
							grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_1_0(),
							$current);
					}
				)
				(
					(
						lv_operator_5_0='-'
						{
							newLeafNode(lv_operator_5_0, grammarAccess.getPlusOrMinusAccess().getOperatorHyphenMinusKeyword_1_1_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getPlusOrMinusRule());
							}
							setWithLastConsumed($current, "operator", lv_operator_5_0, "-");
						}
					)
				)
				(
					(
						{
							newCompositeNode(grammarAccess.getPlusOrMinusAccess().getRightMultiplyOrDivideParserRuleCall_1_1_2_0());
						}
						lv_right_6_0=ruleMultiplyOrDivide
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getPlusOrMinusRule());
							}
							set(
								$current,
								"right",
								lv_right_6_0,
								"dk.sdu.mdsd.MathInterpreter.MultiplyOrDivide");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
		)*
	)
;

// Entry rule entryRuleMultiplyOrDivide
entryRuleMultiplyOrDivide returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMultiplyOrDivideRule()); }
	iv_ruleMultiplyOrDivide=ruleMultiplyOrDivide
	{ $current=$iv_ruleMultiplyOrDivide.current; }
	EOF;

// Rule MultiplyOrDivide
ruleMultiplyOrDivide returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getMultiplyOrDivideAccess().getLeftPrimaryParserRuleCall_0_0());
				}
				lv_left_0_0=rulePrimary
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMultiplyOrDivideRule());
					}
					set(
						$current,
						"left",
						lv_left_0_0,
						"dk.sdu.mdsd.MathInterpreter.Primary");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				(
					{
						$current = forceCreateModelElementAndSet(
							grammarAccess.getMultiplyOrDivideAccess().getMultiplyLeftAction_1_0_0(),
							$current);
					}
				)
				(
					(
						lv_operator_2_0='*'
						{
							newLeafNode(lv_operator_2_0, grammarAccess.getMultiplyOrDivideAccess().getOperatorAsteriskKeyword_1_0_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getMultiplyOrDivideRule());
							}
							setWithLastConsumed($current, "operator", lv_operator_2_0, "*");
						}
					)
				)
				(
					(
						{
							newCompositeNode(grammarAccess.getMultiplyOrDivideAccess().getRightPrimaryParserRuleCall_1_0_2_0());
						}
						lv_right_3_0=rulePrimary
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getMultiplyOrDivideRule());
							}
							set(
								$current,
								"right",
								lv_right_3_0,
								"dk.sdu.mdsd.MathInterpreter.Primary");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
			    |
			(
				(
					{
						$current = forceCreateModelElementAndSet(
							grammarAccess.getMultiplyOrDivideAccess().getDivideLeftAction_1_1_0(),
							$current);
					}
				)
				(
					(
						lv_operator_5_0='/'
						{
							newLeafNode(lv_operator_5_0, grammarAccess.getMultiplyOrDivideAccess().getOperatorSolidusKeyword_1_1_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getMultiplyOrDivideRule());
							}
							setWithLastConsumed($current, "operator", lv_operator_5_0, "/");
						}
					)
				)
				(
					(
						{
							newCompositeNode(grammarAccess.getMultiplyOrDivideAccess().getRightPrimaryParserRuleCall_1_1_2_0());
						}
						lv_right_6_0=rulePrimary
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getMultiplyOrDivideRule());
							}
							set(
								$current,
								"right",
								lv_right_6_0,
								"dk.sdu.mdsd.MathInterpreter.Primary");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
		)*
	)
;

// Entry rule entryRulePrimary
entryRulePrimary returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPrimaryRule()); }
	iv_rulePrimary=rulePrimary
	{ $current=$iv_rulePrimary.current; }
	EOF;

// Rule Primary
rulePrimary returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getPrimaryAccess().getNumAction_0_0(),
						$current);
				}
			)
			(
				(
					lv_value_1_0=RULE_INT
					{
						newLeafNode(lv_value_1_0, grammarAccess.getPrimaryAccess().getValueINTTerminalRuleCall_0_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getPrimaryRule());
						}
						setWithLastConsumed(
							$current,
							"value",
							lv_value_1_0,
							"org.eclipse.xtext.common.Terminals.INT");
					}
				)
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getPrimaryAccess().getVariableRefAction_1_0(),
						$current);
				}
			)
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getPrimaryRule());
						}
					}
					otherlv_3=RULE_ID
					{
						newLeafNode(otherlv_3, grammarAccess.getPrimaryAccess().getValueVariableCrossReference_1_1_0());
					}
				)
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getPrimaryAccess().getBracketAction_2_0(),
						$current);
				}
			)
			otherlv_5='('
			{
				newLeafNode(otherlv_5, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_2_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getPrimaryAccess().getValueExpressionParserRuleCall_2_2_0());
					}
					lv_value_6_0=ruleExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPrimaryRule());
						}
						set(
							$current,
							"value",
							lv_value_6_0,
							"dk.sdu.mdsd.MathInterpreter.Expression");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_7=')'
			{
				newLeafNode(otherlv_7, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_2_3());
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
