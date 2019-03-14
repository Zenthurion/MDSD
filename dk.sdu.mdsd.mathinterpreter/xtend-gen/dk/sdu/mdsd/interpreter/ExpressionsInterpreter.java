package dk.sdu.mdsd.interpreter;

import com.google.common.base.Objects;
import dk.sdu.mdsd.mathInterpreter.Bracket;
import dk.sdu.mdsd.mathInterpreter.Expression;
import dk.sdu.mdsd.mathInterpreter.MultiplyOrDivide;
import dk.sdu.mdsd.mathInterpreter.Num;
import dk.sdu.mdsd.mathInterpreter.PlusOrMinus;
import dk.sdu.mdsd.mathInterpreter.Primary;
import dk.sdu.mdsd.mathInterpreter.Solution;
import dk.sdu.mdsd.mathInterpreter.VariableRef;
import java.util.Arrays;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public class ExpressionsInterpreter {
  protected int _evaluate(final Solution it) {
    return this.evaluate(it.getExpression());
  }
  
  protected int _evaluate(final Expression it) {
    return this.evaluate(it.getExp());
  }
  
  protected int _evaluate(final PlusOrMinus it) {
    MultiplyOrDivide _right = it.getRight();
    boolean _tripleEquals = (_right == null);
    if (_tripleEquals) {
      return this.evaluate(it.getLeft());
    } else {
      String _operator = it.getOperator();
      boolean _equals = Objects.equal(_operator, "+");
      if (_equals) {
        int _evaluate = this.evaluate(it.getLeft());
        int _evaluate_1 = this.evaluate(it.getRight());
        return (_evaluate + _evaluate_1);
      } else {
        int _evaluate_2 = this.evaluate(it.getLeft());
        int _evaluate_3 = this.evaluate(it.getRight());
        return (_evaluate_2 - _evaluate_3);
      }
    }
  }
  
  protected int _evaluate(final MultiplyOrDivide it) {
    Primary _right = it.getRight();
    boolean _tripleEquals = (_right == null);
    if (_tripleEquals) {
      return this.evaluate(it.getLeft());
    } else {
      String _operator = it.getOperator();
      boolean _equals = Objects.equal(_operator, "*");
      if (_equals) {
        int _evaluate = this.evaluate(it.getLeft());
        int _evaluate_1 = this.evaluate(it.getRight());
        return (_evaluate * _evaluate_1);
      } else {
        int _evaluate_2 = this.evaluate(it.getLeft());
        int _evaluate_3 = this.evaluate(it.getRight());
        return (_evaluate_2 / _evaluate_3);
      }
    }
  }
  
  protected int _evaluate(final Num it) {
    return it.getValue();
  }
  
  protected int _evaluate(final VariableRef it) {
    return this.evaluate(it.getValue().getValue());
  }
  
  protected int _evaluate(final Bracket it) {
    return this.evaluate(it.getValue());
  }
  
  public int evaluate(final EObject it) {
    if (it instanceof Bracket) {
      return _evaluate((Bracket)it);
    } else if (it instanceof Num) {
      return _evaluate((Num)it);
    } else if (it instanceof VariableRef) {
      return _evaluate((VariableRef)it);
    } else if (it instanceof Expression) {
      return _evaluate((Expression)it);
    } else if (it instanceof MultiplyOrDivide) {
      return _evaluate((MultiplyOrDivide)it);
    } else if (it instanceof PlusOrMinus) {
      return _evaluate((PlusOrMinus)it);
    } else if (it instanceof Solution) {
      return _evaluate((Solution)it);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it).toString());
    }
  }
}
