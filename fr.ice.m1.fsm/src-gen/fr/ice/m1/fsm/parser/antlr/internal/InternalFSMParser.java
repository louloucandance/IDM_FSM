package fr.ice.m1.fsm.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.ice.m1.fsm.services.FSMGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFSMParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'FSM'", "'state'", "'transition'", "'->'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=6;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalFSMParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFSMParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFSMParser.tokenNames; }
    public String getGrammarFileName() { return "InternalFSM.g"; }



     	private FSMGrammarAccess grammarAccess;

        public InternalFSMParser(TokenStream input, FSMGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "FSM";
       	}

       	@Override
       	protected FSMGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleFSM"
    // InternalFSM.g:64:1: entryRuleFSM returns [EObject current=null] : iv_ruleFSM= ruleFSM EOF ;
    public final EObject entryRuleFSM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFSM = null;


        try {
            // InternalFSM.g:64:44: (iv_ruleFSM= ruleFSM EOF )
            // InternalFSM.g:65:2: iv_ruleFSM= ruleFSM EOF
            {
             newCompositeNode(grammarAccess.getFSMRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFSM=ruleFSM();

            state._fsp--;

             current =iv_ruleFSM; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFSM"


    // $ANTLR start "ruleFSM"
    // InternalFSM.g:71:1: ruleFSM returns [EObject current=null] : ( () otherlv_1= 'FSM' ( (lv_name_2_0= ruleEString ) ) ( (otherlv_3= 'state' ( (lv_state_4_0= ruleState ) ) ) | (otherlv_5= 'transition' ( (lv_transition_6_0= ruleTransition ) ) ) )* ) ;
    public final EObject ruleFSM() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_state_4_0 = null;

        EObject lv_transition_6_0 = null;



        	enterRule();

        try {
            // InternalFSM.g:77:2: ( ( () otherlv_1= 'FSM' ( (lv_name_2_0= ruleEString ) ) ( (otherlv_3= 'state' ( (lv_state_4_0= ruleState ) ) ) | (otherlv_5= 'transition' ( (lv_transition_6_0= ruleTransition ) ) ) )* ) )
            // InternalFSM.g:78:2: ( () otherlv_1= 'FSM' ( (lv_name_2_0= ruleEString ) ) ( (otherlv_3= 'state' ( (lv_state_4_0= ruleState ) ) ) | (otherlv_5= 'transition' ( (lv_transition_6_0= ruleTransition ) ) ) )* )
            {
            // InternalFSM.g:78:2: ( () otherlv_1= 'FSM' ( (lv_name_2_0= ruleEString ) ) ( (otherlv_3= 'state' ( (lv_state_4_0= ruleState ) ) ) | (otherlv_5= 'transition' ( (lv_transition_6_0= ruleTransition ) ) ) )* )
            // InternalFSM.g:79:3: () otherlv_1= 'FSM' ( (lv_name_2_0= ruleEString ) ) ( (otherlv_3= 'state' ( (lv_state_4_0= ruleState ) ) ) | (otherlv_5= 'transition' ( (lv_transition_6_0= ruleTransition ) ) ) )*
            {
            // InternalFSM.g:79:3: ()
            // InternalFSM.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFSMAccess().getFSMAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getFSMAccess().getFSMKeyword_1());
            		
            // InternalFSM.g:90:3: ( (lv_name_2_0= ruleEString ) )
            // InternalFSM.g:91:4: (lv_name_2_0= ruleEString )
            {
            // InternalFSM.g:91:4: (lv_name_2_0= ruleEString )
            // InternalFSM.g:92:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFSMAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFSMRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.ice.m1.fsm.FSM.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFSM.g:109:3: ( (otherlv_3= 'state' ( (lv_state_4_0= ruleState ) ) ) | (otherlv_5= 'transition' ( (lv_transition_6_0= ruleTransition ) ) ) )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }
                else if ( (LA1_0==13) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalFSM.g:110:4: (otherlv_3= 'state' ( (lv_state_4_0= ruleState ) ) )
            	    {
            	    // InternalFSM.g:110:4: (otherlv_3= 'state' ( (lv_state_4_0= ruleState ) ) )
            	    // InternalFSM.g:111:5: otherlv_3= 'state' ( (lv_state_4_0= ruleState ) )
            	    {
            	    otherlv_3=(Token)match(input,12,FOLLOW_3); 

            	    					newLeafNode(otherlv_3, grammarAccess.getFSMAccess().getStateKeyword_3_0_0());
            	    				
            	    // InternalFSM.g:115:5: ( (lv_state_4_0= ruleState ) )
            	    // InternalFSM.g:116:6: (lv_state_4_0= ruleState )
            	    {
            	    // InternalFSM.g:116:6: (lv_state_4_0= ruleState )
            	    // InternalFSM.g:117:7: lv_state_4_0= ruleState
            	    {

            	    							newCompositeNode(grammarAccess.getFSMAccess().getStateStateParserRuleCall_3_0_1_0());
            	    						
            	    pushFollow(FOLLOW_4);
            	    lv_state_4_0=ruleState();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getFSMRule());
            	    							}
            	    							add(
            	    								current,
            	    								"state",
            	    								lv_state_4_0,
            	    								"fr.ice.m1.fsm.FSM.State");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalFSM.g:136:4: (otherlv_5= 'transition' ( (lv_transition_6_0= ruleTransition ) ) )
            	    {
            	    // InternalFSM.g:136:4: (otherlv_5= 'transition' ( (lv_transition_6_0= ruleTransition ) ) )
            	    // InternalFSM.g:137:5: otherlv_5= 'transition' ( (lv_transition_6_0= ruleTransition ) )
            	    {
            	    otherlv_5=(Token)match(input,13,FOLLOW_5); 

            	    					newLeafNode(otherlv_5, grammarAccess.getFSMAccess().getTransitionKeyword_3_1_0());
            	    				
            	    // InternalFSM.g:141:5: ( (lv_transition_6_0= ruleTransition ) )
            	    // InternalFSM.g:142:6: (lv_transition_6_0= ruleTransition )
            	    {
            	    // InternalFSM.g:142:6: (lv_transition_6_0= ruleTransition )
            	    // InternalFSM.g:143:7: lv_transition_6_0= ruleTransition
            	    {

            	    							newCompositeNode(grammarAccess.getFSMAccess().getTransitionTransitionParserRuleCall_3_1_1_0());
            	    						
            	    pushFollow(FOLLOW_4);
            	    lv_transition_6_0=ruleTransition();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getFSMRule());
            	    							}
            	    							add(
            	    								current,
            	    								"transition",
            	    								lv_transition_6_0,
            	    								"fr.ice.m1.fsm.FSM.Transition");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFSM"


    // $ANTLR start "entryRuleEString"
    // InternalFSM.g:166:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalFSM.g:166:47: (iv_ruleEString= ruleEString EOF )
            // InternalFSM.g:167:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalFSM.g:173:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalFSM.g:179:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalFSM.g:180:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalFSM.g:180:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalFSM.g:181:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalFSM.g:189:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleState"
    // InternalFSM.g:200:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalFSM.g:200:46: (iv_ruleState= ruleState EOF )
            // InternalFSM.g:201:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalFSM.g:207:1: ruleState returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalFSM.g:213:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalFSM.g:214:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalFSM.g:214:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalFSM.g:215:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalFSM.g:215:3: ()
            // InternalFSM.g:216:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStateAccess().getStateAction_0(),
            					current);
            			

            }

            // InternalFSM.g:222:3: ( (lv_name_1_0= ruleEString ) )
            // InternalFSM.g:223:4: (lv_name_1_0= ruleEString )
            {
            // InternalFSM.g:223:4: (lv_name_1_0= ruleEString )
            // InternalFSM.g:224:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStateAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStateRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.ice.m1.fsm.FSM.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleTransition"
    // InternalFSM.g:245:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalFSM.g:245:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalFSM.g:246:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalFSM.g:252:1: ruleTransition returns [EObject current=null] : (otherlv_0= 'transition' ( (lv_name_1_0= ruleEString ) ) ( ( ruleEString ) ) otherlv_3= '->' ( ( ruleEString ) ) ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalFSM.g:258:2: ( (otherlv_0= 'transition' ( (lv_name_1_0= ruleEString ) ) ( ( ruleEString ) ) otherlv_3= '->' ( ( ruleEString ) ) ) )
            // InternalFSM.g:259:2: (otherlv_0= 'transition' ( (lv_name_1_0= ruleEString ) ) ( ( ruleEString ) ) otherlv_3= '->' ( ( ruleEString ) ) )
            {
            // InternalFSM.g:259:2: (otherlv_0= 'transition' ( (lv_name_1_0= ruleEString ) ) ( ( ruleEString ) ) otherlv_3= '->' ( ( ruleEString ) ) )
            // InternalFSM.g:260:3: otherlv_0= 'transition' ( (lv_name_1_0= ruleEString ) ) ( ( ruleEString ) ) otherlv_3= '->' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getTransitionKeyword_0());
            		
            // InternalFSM.g:264:3: ( (lv_name_1_0= ruleEString ) )
            // InternalFSM.g:265:4: (lv_name_1_0= ruleEString )
            {
            // InternalFSM.g:265:4: (lv_name_1_0= ruleEString )
            // InternalFSM.g:266:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTransitionAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransitionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.ice.m1.fsm.FSM.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFSM.g:283:3: ( ( ruleEString ) )
            // InternalFSM.g:284:4: ( ruleEString )
            {
            // InternalFSM.g:284:4: ( ruleEString )
            // InternalFSM.g:285:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTransitionAccess().getToStateCrossReference_2_0());
            				
            pushFollow(FOLLOW_6);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		
            // InternalFSM.g:303:3: ( ( ruleEString ) )
            // InternalFSM.g:304:4: ( ruleEString )
            {
            // InternalFSM.g:304:4: ( ruleEString )
            // InternalFSM.g:305:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTransitionAccess().getFromStateCrossReference_4_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransition"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});

}