/*
 * generated by Xtext 2.16.0
 */
package dk.sdu.mdsd


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class MathInterpreterStandaloneSetup extends MathInterpreterStandaloneSetupGenerated {

	def static void doSetup() {
		new MathInterpreterStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
