/**
 * generated by Xtext 2.16.0
 */
package dk.sdu.mdsd.mathInterpreter;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiply Or Divide</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.mdsd.mathInterpreter.MultiplyOrDivide#getLeft <em>Left</em>}</li>
 *   <li>{@link dk.sdu.mdsd.mathInterpreter.MultiplyOrDivide#getOperator <em>Operator</em>}</li>
 *   <li>{@link dk.sdu.mdsd.mathInterpreter.MultiplyOrDivide#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see dk.sdu.mdsd.mathInterpreter.MathInterpreterPackage#getMultiplyOrDivide()
 * @model
 * @generated
 */
public interface MultiplyOrDivide extends EObject
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(EObject)
   * @see dk.sdu.mdsd.mathInterpreter.MathInterpreterPackage#getMultiplyOrDivide_Left()
   * @model containment="true"
   * @generated
   */
  EObject getLeft();

  /**
   * Sets the value of the '{@link dk.sdu.mdsd.mathInterpreter.MultiplyOrDivide#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(EObject value);

  /**
   * Returns the value of the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' attribute.
   * @see #setOperator(String)
   * @see dk.sdu.mdsd.mathInterpreter.MathInterpreterPackage#getMultiplyOrDivide_Operator()
   * @model
   * @generated
   */
  String getOperator();

  /**
   * Sets the value of the '{@link dk.sdu.mdsd.mathInterpreter.MultiplyOrDivide#getOperator <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' attribute.
   * @see #getOperator()
   * @generated
   */
  void setOperator(String value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(Primary)
   * @see dk.sdu.mdsd.mathInterpreter.MathInterpreterPackage#getMultiplyOrDivide_Right()
   * @model containment="true"
   * @generated
   */
  Primary getRight();

  /**
   * Sets the value of the '{@link dk.sdu.mdsd.mathInterpreter.MultiplyOrDivide#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Primary value);

} // MultiplyOrDivide
