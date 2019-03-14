package dk.sdu.mdsd.interpreter

import dk.sdu.mdsd.mathInterpreter.Bracket
import dk.sdu.mdsd.mathInterpreter.Expression
import dk.sdu.mdsd.mathInterpreter.MultiplyOrDivide
import dk.sdu.mdsd.mathInterpreter.Num
import dk.sdu.mdsd.mathInterpreter.PlusOrMinus
import dk.sdu.mdsd.mathInterpreter.Solution
import dk.sdu.mdsd.mathInterpreter.VariableRef

class ExpressionsInterpreter {
	
	def dispatch int evaluate(Solution it){
		return expression.evaluate
	}
	def dispatch int evaluate(Expression it){
		return exp.evaluate
	}
	def dispatch int evaluate(PlusOrMinus it){
		if(right === null)
			return left.evaluate
		else 
			if(operator == "+")
				return left.evaluate + right.evaluate
			else 
				return left.evaluate - right.evaluate
	}
	def dispatch int evaluate(MultiplyOrDivide it){
		if(right === null)
			return left.evaluate
		else 
			if(operator == "*")
				return left.evaluate * right.evaluate
			else 
				return left.evaluate / right.evaluate
	}
	def dispatch int evaluate(Num it){
		return value
	}
	def dispatch int evaluate(VariableRef it){
		return value.value.evaluate
	}
	def dispatch int evaluate(Bracket it){
		return value.evaluate
	}
}
