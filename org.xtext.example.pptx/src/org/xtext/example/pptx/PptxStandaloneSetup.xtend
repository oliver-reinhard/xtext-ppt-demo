/*
 * generated by Xtext 2.16.0
 */
package org.xtext.example.pptx


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class PptxStandaloneSetup extends PptxStandaloneSetupGenerated {

	def static void doSetup() {
		new PptxStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
