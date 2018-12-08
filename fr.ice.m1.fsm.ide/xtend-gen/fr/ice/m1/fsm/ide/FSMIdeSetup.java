/**
 * generated by Xtext 2.12.0
 */
package fr.ice.m1.fsm.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import fr.ice.m1.fsm.FSMRuntimeModule;
import fr.ice.m1.fsm.FSMStandaloneSetup;
import fr.ice.m1.fsm.ide.FSMIdeModule;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class FSMIdeSetup extends FSMStandaloneSetup {
  @Override
  public Injector createInjector() {
    FSMRuntimeModule _fSMRuntimeModule = new FSMRuntimeModule();
    FSMIdeModule _fSMIdeModule = new FSMIdeModule();
    return Guice.createInjector(Modules2.mixin(_fSMRuntimeModule, _fSMIdeModule));
  }
}
