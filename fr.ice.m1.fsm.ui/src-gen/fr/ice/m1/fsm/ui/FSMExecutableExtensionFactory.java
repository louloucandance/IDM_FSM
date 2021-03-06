/*
 * generated by Xtext 2.12.0
 */
package fr.ice.m1.fsm.ui;

import com.google.inject.Injector;
import fr.ice.m1.fsm.ui.internal.FsmActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class FSMExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FsmActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return FsmActivator.getInstance().getInjector(FsmActivator.FR_ICE_M1_FSM_FSM);
	}
	
}
