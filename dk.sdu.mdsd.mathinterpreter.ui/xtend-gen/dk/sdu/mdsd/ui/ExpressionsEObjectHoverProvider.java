package dk.sdu.mdsd.ui;

import com.google.inject.Inject;
import dk.sdu.mdsd.interpreter.ExpressionsInterpreter;
import dk.sdu.mdsd.mathInterpreter.Expression;
import dk.sdu.mdsd.mathInterpreter.PlusOrMinus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class ExpressionsEObjectHoverProvider extends DefaultEObjectHoverProvider {
  @Inject
  @Extension
  private ExpressionsInterpreter _expressionsInterpreter;
  
  @Override
  public String getHoverInfoAsHtml(final EObject o) {
    if (((o instanceof Expression) && this.programHasNoError(o))) {
      final PlusOrMinus exp = ((Expression) o).getExp();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<p>");
      _builder.newLine();
      _builder.append("value: <b>");
      String _string = Integer.valueOf(this._expressionsInterpreter.evaluate(exp)).toString();
      _builder.append(_string);
      _builder.append("</b>");
      _builder.newLineIfNotEmpty();
      _builder.append("</p>");
      _builder.newLine();
      return _builder.toString();
    }
    return super.getHoverInfoAsHtml(o);
  }
  
  public boolean programHasNoError(final EObject o) {
    return Diagnostician.INSTANCE.validate(EcoreUtil.getRootContainer(o)).getChildren().isEmpty();
  }
}
