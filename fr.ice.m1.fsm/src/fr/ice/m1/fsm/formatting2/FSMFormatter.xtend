/*
 * generated by Xtext 2.12.0
 */
package fr.ice.m1.fsm.formatting2

import com.google.inject.Inject
import fr.ice.m1.fsm.model.FSM
import fr.ice.m1.fsm.model.State
import fr.ice.m1.fsm.model.Transition
import fr.ice.m1.fsm.services.FSMGrammarAccess
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class FSMFormatter extends AbstractFormatter2 {
	
	@Inject extension FSMGrammarAccess

	def dispatch void format(FSM fSM, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (State state : fSM.getState()) {
			state.format;
		}
		for (Transition transition : fSM.getTransition()) {
			transition.format;
		}
	}
	
	// TODO: implement for 
}
