package dk.sdu.mdsd.ui

import com.google.inject.Inject
import dk.sdu.mdsd.interpreter.ExpressionsInterpreter
import dk.sdu.mdsd.mathInterpreter.Expression
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.util.Diagnostician
import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

class ExpressionsEObjectHoverProvider extends DefaultEObjectHoverProvider {
	@Inject extension ExpressionsInterpreter
	
	override getHoverInfoAsHtml(EObject o) {
		if(o instanceof Expression && o.programHasNoError) {
			val exp = (o as Expression).exp
			return '''
			<p>
			value: <b>�exp.evaluate.toString�</b>
			</p>
			'''
		}
		return super.getHoverInfoAsHtml(o)
	}
	
	def programHasNoError(EObject o) {
		return Diagnostician.INSTANCE.validate(o.rootContainer).children.empty
	}
}