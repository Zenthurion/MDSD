/**
 * generated by Xtext 2.16.0
 */
package dk.sdu.mdsd.mathInterpreter.impl;

import dk.sdu.mdsd.mathInterpreter.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MathInterpreterFactoryImpl extends EFactoryImpl implements MathInterpreterFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MathInterpreterFactory init()
  {
    try
    {
      MathInterpreterFactory theMathInterpreterFactory = (MathInterpreterFactory)EPackage.Registry.INSTANCE.getEFactory(MathInterpreterPackage.eNS_URI);
      if (theMathInterpreterFactory != null)
      {
        return theMathInterpreterFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MathInterpreterFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MathInterpreterFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case MathInterpreterPackage.SOLUTION: return createSolution();
      case MathInterpreterPackage.VARIABLE: return createVariable();
      case MathInterpreterPackage.EXPRESSION: return createExpression();
      case MathInterpreterPackage.PLUS_OR_MINUS: return createPlusOrMinus();
      case MathInterpreterPackage.MULTIPLY_OR_DIVIDE: return createMultiplyOrDivide();
      case MathInterpreterPackage.PRIMARY: return createPrimary();
      case MathInterpreterPackage.PLUS: return createPlus();
      case MathInterpreterPackage.MINUS: return createMinus();
      case MathInterpreterPackage.MULTIPLY: return createMultiply();
      case MathInterpreterPackage.DIVIDE: return createDivide();
      case MathInterpreterPackage.NUM: return createNum();
      case MathInterpreterPackage.VARIABLE_REF: return createVariableRef();
      case MathInterpreterPackage.BRACKET: return createBracket();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Solution createSolution()
  {
    SolutionImpl solution = new SolutionImpl();
    return solution;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Variable createVariable()
  {
    VariableImpl variable = new VariableImpl();
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PlusOrMinus createPlusOrMinus()
  {
    PlusOrMinusImpl plusOrMinus = new PlusOrMinusImpl();
    return plusOrMinus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MultiplyOrDivide createMultiplyOrDivide()
  {
    MultiplyOrDivideImpl multiplyOrDivide = new MultiplyOrDivideImpl();
    return multiplyOrDivide;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Primary createPrimary()
  {
    PrimaryImpl primary = new PrimaryImpl();
    return primary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Plus createPlus()
  {
    PlusImpl plus = new PlusImpl();
    return plus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Minus createMinus()
  {
    MinusImpl minus = new MinusImpl();
    return minus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Multiply createMultiply()
  {
    MultiplyImpl multiply = new MultiplyImpl();
    return multiply;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Divide createDivide()
  {
    DivideImpl divide = new DivideImpl();
    return divide;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Num createNum()
  {
    NumImpl num = new NumImpl();
    return num;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public VariableRef createVariableRef()
  {
    VariableRefImpl variableRef = new VariableRefImpl();
    return variableRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Bracket createBracket()
  {
    BracketImpl bracket = new BracketImpl();
    return bracket;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MathInterpreterPackage getMathInterpreterPackage()
  {
    return (MathInterpreterPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MathInterpreterPackage getPackage()
  {
    return MathInterpreterPackage.eINSTANCE;
  }

} //MathInterpreterFactoryImpl
