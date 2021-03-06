/**
 * generated by Xtext 2.16.0
 */
package org.xtext.example.abppt.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.xtext.example.abppt.AbpptRuntimeModule;
import org.xtext.example.abppt.AbpptStandaloneSetup;
import org.xtext.example.abppt.ide.AbpptIdeModule;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class AbpptIdeSetup extends AbpptStandaloneSetup {
  @Override
  public Injector createInjector() {
    AbpptRuntimeModule _abpptRuntimeModule = new AbpptRuntimeModule();
    AbpptIdeModule _abpptIdeModule = new AbpptIdeModule();
    return Guice.createInjector(Modules2.mixin(_abpptRuntimeModule, _abpptIdeModule));
  }
}
