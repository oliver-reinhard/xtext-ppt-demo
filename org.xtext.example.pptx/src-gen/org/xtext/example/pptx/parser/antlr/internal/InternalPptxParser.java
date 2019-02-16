package org.xtext.example.pptx.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.pptx.services.PptxGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPptxParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'content'", "'{'", "'text'", "'note'", "'}'", "'presentation'", "'theme'", "'slide'", "'background'", "'header'", "'footer'", "'white'", "'grey'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalPptxParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPptxParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPptxParser.tokenNames; }
    public String getGrammarFileName() { return "InternalPptx.g"; }



     	private PptxGrammarAccess grammarAccess;

        public InternalPptxParser(TokenStream input, PptxGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected PptxGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalPptx.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalPptx.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalPptx.g:66:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalPptx.g:72:1: ruleModel returns [EObject current=null] : ( ( (lv_contents_0_0= ruleSlideContent ) ) | ( (lv_presentations_1_0= rulePresentation ) ) | ( (lv_themes_2_0= ruleTheme ) ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_contents_0_0 = null;

        EObject lv_presentations_1_0 = null;

        EObject lv_themes_2_0 = null;



        	enterRule();

        try {
            // InternalPptx.g:78:2: ( ( ( (lv_contents_0_0= ruleSlideContent ) ) | ( (lv_presentations_1_0= rulePresentation ) ) | ( (lv_themes_2_0= ruleTheme ) ) )* )
            // InternalPptx.g:79:2: ( ( (lv_contents_0_0= ruleSlideContent ) ) | ( (lv_presentations_1_0= rulePresentation ) ) | ( (lv_themes_2_0= ruleTheme ) ) )*
            {
            // InternalPptx.g:79:2: ( ( (lv_contents_0_0= ruleSlideContent ) ) | ( (lv_presentations_1_0= rulePresentation ) ) | ( (lv_themes_2_0= ruleTheme ) ) )*
            loop1:
            do {
                int alt1=4;
                switch ( input.LA(1) ) {
                case 11:
                    {
                    alt1=1;
                    }
                    break;
                case 16:
                    {
                    alt1=2;
                    }
                    break;
                case 17:
                    {
                    alt1=3;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // InternalPptx.g:80:3: ( (lv_contents_0_0= ruleSlideContent ) )
            	    {
            	    // InternalPptx.g:80:3: ( (lv_contents_0_0= ruleSlideContent ) )
            	    // InternalPptx.g:81:4: (lv_contents_0_0= ruleSlideContent )
            	    {
            	    // InternalPptx.g:81:4: (lv_contents_0_0= ruleSlideContent )
            	    // InternalPptx.g:82:5: lv_contents_0_0= ruleSlideContent
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getContentsSlideContentParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_contents_0_0=ruleSlideContent();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"contents",
            	    						lv_contents_0_0,
            	    						"org.xtext.example.pptx.Pptx.SlideContent");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalPptx.g:100:3: ( (lv_presentations_1_0= rulePresentation ) )
            	    {
            	    // InternalPptx.g:100:3: ( (lv_presentations_1_0= rulePresentation ) )
            	    // InternalPptx.g:101:4: (lv_presentations_1_0= rulePresentation )
            	    {
            	    // InternalPptx.g:101:4: (lv_presentations_1_0= rulePresentation )
            	    // InternalPptx.g:102:5: lv_presentations_1_0= rulePresentation
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getPresentationsPresentationParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_presentations_1_0=rulePresentation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"presentations",
            	    						lv_presentations_1_0,
            	    						"org.xtext.example.pptx.Pptx.Presentation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalPptx.g:120:3: ( (lv_themes_2_0= ruleTheme ) )
            	    {
            	    // InternalPptx.g:120:3: ( (lv_themes_2_0= ruleTheme ) )
            	    // InternalPptx.g:121:4: (lv_themes_2_0= ruleTheme )
            	    {
            	    // InternalPptx.g:121:4: (lv_themes_2_0= ruleTheme )
            	    // InternalPptx.g:122:5: lv_themes_2_0= ruleTheme
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getThemesThemeParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_themes_2_0=ruleTheme();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"themes",
            	    						lv_themes_2_0,
            	    						"org.xtext.example.pptx.Pptx.Theme");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleSlideContent"
    // InternalPptx.g:143:1: entryRuleSlideContent returns [EObject current=null] : iv_ruleSlideContent= ruleSlideContent EOF ;
    public final EObject entryRuleSlideContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlideContent = null;


        try {
            // InternalPptx.g:143:53: (iv_ruleSlideContent= ruleSlideContent EOF )
            // InternalPptx.g:144:2: iv_ruleSlideContent= ruleSlideContent EOF
            {
             newCompositeNode(grammarAccess.getSlideContentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSlideContent=ruleSlideContent();

            state._fsp--;

             current =iv_ruleSlideContent; 
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
    // $ANTLR end "entryRuleSlideContent"


    // $ANTLR start "ruleSlideContent"
    // InternalPptx.g:150:1: ruleSlideContent returns [EObject current=null] : (otherlv_0= 'content' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'text' ( (lv_text_4_0= RULE_STRING ) ) (otherlv_5= 'note' ( (lv_note_6_0= RULE_STRING ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleSlideContent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_text_4_0=null;
        Token otherlv_5=null;
        Token lv_note_6_0=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalPptx.g:156:2: ( (otherlv_0= 'content' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'text' ( (lv_text_4_0= RULE_STRING ) ) (otherlv_5= 'note' ( (lv_note_6_0= RULE_STRING ) ) )? otherlv_7= '}' ) )
            // InternalPptx.g:157:2: (otherlv_0= 'content' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'text' ( (lv_text_4_0= RULE_STRING ) ) (otherlv_5= 'note' ( (lv_note_6_0= RULE_STRING ) ) )? otherlv_7= '}' )
            {
            // InternalPptx.g:157:2: (otherlv_0= 'content' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'text' ( (lv_text_4_0= RULE_STRING ) ) (otherlv_5= 'note' ( (lv_note_6_0= RULE_STRING ) ) )? otherlv_7= '}' )
            // InternalPptx.g:158:3: otherlv_0= 'content' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'text' ( (lv_text_4_0= RULE_STRING ) ) (otherlv_5= 'note' ( (lv_note_6_0= RULE_STRING ) ) )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSlideContentAccess().getContentKeyword_0());
            		
            // InternalPptx.g:162:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPptx.g:163:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPptx.g:163:4: (lv_name_1_0= RULE_ID )
            // InternalPptx.g:164:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSlideContentAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSlideContentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getSlideContentAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getSlideContentAccess().getTextKeyword_3());
            		
            // InternalPptx.g:188:3: ( (lv_text_4_0= RULE_STRING ) )
            // InternalPptx.g:189:4: (lv_text_4_0= RULE_STRING )
            {
            // InternalPptx.g:189:4: (lv_text_4_0= RULE_STRING )
            // InternalPptx.g:190:5: lv_text_4_0= RULE_STRING
            {
            lv_text_4_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_text_4_0, grammarAccess.getSlideContentAccess().getTextSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSlideContentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"text",
            						lv_text_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalPptx.g:206:3: (otherlv_5= 'note' ( (lv_note_6_0= RULE_STRING ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalPptx.g:207:4: otherlv_5= 'note' ( (lv_note_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_5, grammarAccess.getSlideContentAccess().getNoteKeyword_5_0());
                    			
                    // InternalPptx.g:211:4: ( (lv_note_6_0= RULE_STRING ) )
                    // InternalPptx.g:212:5: (lv_note_6_0= RULE_STRING )
                    {
                    // InternalPptx.g:212:5: (lv_note_6_0= RULE_STRING )
                    // InternalPptx.g:213:6: lv_note_6_0= RULE_STRING
                    {
                    lv_note_6_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

                    						newLeafNode(lv_note_6_0, grammarAccess.getSlideContentAccess().getNoteSTRINGTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSlideContentRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"note",
                    							lv_note_6_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getSlideContentAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleSlideContent"


    // $ANTLR start "entryRulePresentation"
    // InternalPptx.g:238:1: entryRulePresentation returns [EObject current=null] : iv_rulePresentation= rulePresentation EOF ;
    public final EObject entryRulePresentation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePresentation = null;


        try {
            // InternalPptx.g:238:53: (iv_rulePresentation= rulePresentation EOF )
            // InternalPptx.g:239:2: iv_rulePresentation= rulePresentation EOF
            {
             newCompositeNode(grammarAccess.getPresentationRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePresentation=rulePresentation();

            state._fsp--;

             current =iv_rulePresentation; 
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
    // $ANTLR end "entryRulePresentation"


    // $ANTLR start "rulePresentation"
    // InternalPptx.g:245:1: rulePresentation returns [EObject current=null] : (otherlv_0= 'presentation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'theme' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'slide' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '}' ) ;
    public final EObject rulePresentation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalPptx.g:251:2: ( (otherlv_0= 'presentation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'theme' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'slide' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '}' ) )
            // InternalPptx.g:252:2: (otherlv_0= 'presentation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'theme' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'slide' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '}' )
            {
            // InternalPptx.g:252:2: (otherlv_0= 'presentation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'theme' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'slide' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '}' )
            // InternalPptx.g:253:3: otherlv_0= 'presentation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'theme' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'slide' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPresentationAccess().getPresentationKeyword_0());
            		
            // InternalPptx.g:257:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPptx.g:258:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPptx.g:258:4: (lv_name_1_0= RULE_ID )
            // InternalPptx.g:259:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPresentationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPresentationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getPresentationAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getPresentationAccess().getThemeKeyword_3());
            		
            // InternalPptx.g:283:3: ( (otherlv_4= RULE_ID ) )
            // InternalPptx.g:284:4: (otherlv_4= RULE_ID )
            {
            // InternalPptx.g:284:4: (otherlv_4= RULE_ID )
            // InternalPptx.g:285:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPresentationRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_4, grammarAccess.getPresentationAccess().getThemeThemeCrossReference_4_0());
            				

            }


            }

            // InternalPptx.g:296:3: (otherlv_5= 'slide' ( (otherlv_6= RULE_ID ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==18) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalPptx.g:297:4: otherlv_5= 'slide' ( (otherlv_6= RULE_ID ) )
            	    {
            	    otherlv_5=(Token)match(input,18,FOLLOW_4); 

            	    				newLeafNode(otherlv_5, grammarAccess.getPresentationAccess().getSlideKeyword_5_0());
            	    			
            	    // InternalPptx.g:301:4: ( (otherlv_6= RULE_ID ) )
            	    // InternalPptx.g:302:5: (otherlv_6= RULE_ID )
            	    {
            	    // InternalPptx.g:302:5: (otherlv_6= RULE_ID )
            	    // InternalPptx.g:303:6: otherlv_6= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getPresentationRule());
            	    						}
            	    					
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_11); 

            	    						newLeafNode(otherlv_6, grammarAccess.getPresentationAccess().getSlidesSlideContentCrossReference_5_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getPresentationAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "rulePresentation"


    // $ANTLR start "entryRuleTheme"
    // InternalPptx.g:323:1: entryRuleTheme returns [EObject current=null] : iv_ruleTheme= ruleTheme EOF ;
    public final EObject entryRuleTheme() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTheme = null;


        try {
            // InternalPptx.g:323:46: (iv_ruleTheme= ruleTheme EOF )
            // InternalPptx.g:324:2: iv_ruleTheme= ruleTheme EOF
            {
             newCompositeNode(grammarAccess.getThemeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTheme=ruleTheme();

            state._fsp--;

             current =iv_ruleTheme; 
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
    // $ANTLR end "entryRuleTheme"


    // $ANTLR start "ruleTheme"
    // InternalPptx.g:330:1: ruleTheme returns [EObject current=null] : (otherlv_0= 'theme' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'background' ( (lv_background_4_0= ruleColor ) ) )? (otherlv_5= 'header' ( (lv_header_6_0= RULE_STRING ) ) )? (otherlv_7= 'footer' ( (lv_footer_8_0= RULE_STRING ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleTheme() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_header_6_0=null;
        Token otherlv_7=null;
        Token lv_footer_8_0=null;
        Token otherlv_9=null;
        Enumerator lv_background_4_0 = null;



        	enterRule();

        try {
            // InternalPptx.g:336:2: ( (otherlv_0= 'theme' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'background' ( (lv_background_4_0= ruleColor ) ) )? (otherlv_5= 'header' ( (lv_header_6_0= RULE_STRING ) ) )? (otherlv_7= 'footer' ( (lv_footer_8_0= RULE_STRING ) ) )? otherlv_9= '}' ) )
            // InternalPptx.g:337:2: (otherlv_0= 'theme' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'background' ( (lv_background_4_0= ruleColor ) ) )? (otherlv_5= 'header' ( (lv_header_6_0= RULE_STRING ) ) )? (otherlv_7= 'footer' ( (lv_footer_8_0= RULE_STRING ) ) )? otherlv_9= '}' )
            {
            // InternalPptx.g:337:2: (otherlv_0= 'theme' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'background' ( (lv_background_4_0= ruleColor ) ) )? (otherlv_5= 'header' ( (lv_header_6_0= RULE_STRING ) ) )? (otherlv_7= 'footer' ( (lv_footer_8_0= RULE_STRING ) ) )? otherlv_9= '}' )
            // InternalPptx.g:338:3: otherlv_0= 'theme' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'background' ( (lv_background_4_0= ruleColor ) ) )? (otherlv_5= 'header' ( (lv_header_6_0= RULE_STRING ) ) )? (otherlv_7= 'footer' ( (lv_footer_8_0= RULE_STRING ) ) )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getThemeAccess().getThemeKeyword_0());
            		
            // InternalPptx.g:342:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPptx.g:343:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPptx.g:343:4: (lv_name_1_0= RULE_ID )
            // InternalPptx.g:344:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getThemeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getThemeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getThemeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalPptx.g:364:3: (otherlv_3= 'background' ( (lv_background_4_0= ruleColor ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalPptx.g:365:4: otherlv_3= 'background' ( (lv_background_4_0= ruleColor ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getThemeAccess().getBackgroundKeyword_3_0());
                    			
                    // InternalPptx.g:369:4: ( (lv_background_4_0= ruleColor ) )
                    // InternalPptx.g:370:5: (lv_background_4_0= ruleColor )
                    {
                    // InternalPptx.g:370:5: (lv_background_4_0= ruleColor )
                    // InternalPptx.g:371:6: lv_background_4_0= ruleColor
                    {

                    						newCompositeNode(grammarAccess.getThemeAccess().getBackgroundColorEnumRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_background_4_0=ruleColor();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getThemeRule());
                    						}
                    						set(
                    							current,
                    							"background",
                    							lv_background_4_0,
                    							"org.xtext.example.pptx.Pptx.Color");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPptx.g:389:3: (otherlv_5= 'header' ( (lv_header_6_0= RULE_STRING ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalPptx.g:390:4: otherlv_5= 'header' ( (lv_header_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,20,FOLLOW_7); 

                    				newLeafNode(otherlv_5, grammarAccess.getThemeAccess().getHeaderKeyword_4_0());
                    			
                    // InternalPptx.g:394:4: ( (lv_header_6_0= RULE_STRING ) )
                    // InternalPptx.g:395:5: (lv_header_6_0= RULE_STRING )
                    {
                    // InternalPptx.g:395:5: (lv_header_6_0= RULE_STRING )
                    // InternalPptx.g:396:6: lv_header_6_0= RULE_STRING
                    {
                    lv_header_6_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

                    						newLeafNode(lv_header_6_0, grammarAccess.getThemeAccess().getHeaderSTRINGTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getThemeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"header",
                    							lv_header_6_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPptx.g:413:3: (otherlv_7= 'footer' ( (lv_footer_8_0= RULE_STRING ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalPptx.g:414:4: otherlv_7= 'footer' ( (lv_footer_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,21,FOLLOW_7); 

                    				newLeafNode(otherlv_7, grammarAccess.getThemeAccess().getFooterKeyword_5_0());
                    			
                    // InternalPptx.g:418:4: ( (lv_footer_8_0= RULE_STRING ) )
                    // InternalPptx.g:419:5: (lv_footer_8_0= RULE_STRING )
                    {
                    // InternalPptx.g:419:5: (lv_footer_8_0= RULE_STRING )
                    // InternalPptx.g:420:6: lv_footer_8_0= RULE_STRING
                    {
                    lv_footer_8_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

                    						newLeafNode(lv_footer_8_0, grammarAccess.getThemeAccess().getFooterSTRINGTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getThemeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"footer",
                    							lv_footer_8_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getThemeAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleTheme"


    // $ANTLR start "ruleColor"
    // InternalPptx.g:445:1: ruleColor returns [Enumerator current=null] : ( (enumLiteral_0= 'white' ) | (enumLiteral_1= 'grey' ) ) ;
    public final Enumerator ruleColor() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalPptx.g:451:2: ( ( (enumLiteral_0= 'white' ) | (enumLiteral_1= 'grey' ) ) )
            // InternalPptx.g:452:2: ( (enumLiteral_0= 'white' ) | (enumLiteral_1= 'grey' ) )
            {
            // InternalPptx.g:452:2: ( (enumLiteral_0= 'white' ) | (enumLiteral_1= 'grey' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            else if ( (LA7_0==23) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalPptx.g:453:3: (enumLiteral_0= 'white' )
                    {
                    // InternalPptx.g:453:3: (enumLiteral_0= 'white' )
                    // InternalPptx.g:454:4: enumLiteral_0= 'white'
                    {
                    enumLiteral_0=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getColorAccess().getWHITEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getColorAccess().getWHITEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPptx.g:461:3: (enumLiteral_1= 'grey' )
                    {
                    // InternalPptx.g:461:3: (enumLiteral_1= 'grey' )
                    // InternalPptx.g:462:4: enumLiteral_1= 'grey'
                    {
                    enumLiteral_1=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getColorAccess().getGREYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getColorAccess().getGREYEnumLiteralDeclaration_1());
                    			

                    }


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
    // $ANTLR end "ruleColor"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000030802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000388000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000308000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000208000L});

}