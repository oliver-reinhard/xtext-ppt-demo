/**
 * generated by Xtext 2.16.0
 */
package org.xtext.example.pptx;

import org.xtext.example.pptx.PptxStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class PptxStandaloneSetup extends PptxStandaloneSetupGenerated {
  public static void doSetup() {
    new PptxStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
