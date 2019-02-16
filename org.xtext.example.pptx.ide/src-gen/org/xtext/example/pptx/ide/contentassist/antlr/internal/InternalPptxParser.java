package org.xtext.example.pptx.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.pptx.services.PptxGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPptxParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'white'", "'grey'", "'content'", "'{'", "'text'", "'}'", "'note'", "'presentation'", "'theme'", "'slide'", "'background'", "'header'", "'footer'"
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

    	public void setGrammarAccess(PptxGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalPptx.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalPptx.g:54:1: ( ruleModel EOF )
            // InternalPptx.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalPptx.g:62:1: ruleModel : ( ( rule__Model__Alternatives )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPptx.g:66:2: ( ( ( rule__Model__Alternatives )* ) )
            // InternalPptx.g:67:2: ( ( rule__Model__Alternatives )* )
            {
            // InternalPptx.g:67:2: ( ( rule__Model__Alternatives )* )
            // InternalPptx.g:68:3: ( rule__Model__Alternatives )*
            {
             before(grammarAccess.getModelAccess().getAlternatives()); 
            // InternalPptx.g:69:3: ( rule__Model__Alternatives )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13||(LA1_0>=18 && LA1_0<=19)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalPptx.g:69:4: rule__Model__Alternatives
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__Alternatives();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleSlideContent"
    // InternalPptx.g:78:1: entryRuleSlideContent : ruleSlideContent EOF ;
    public final void entryRuleSlideContent() throws RecognitionException {
        try {
            // InternalPptx.g:79:1: ( ruleSlideContent EOF )
            // InternalPptx.g:80:1: ruleSlideContent EOF
            {
             before(grammarAccess.getSlideContentRule()); 
            pushFollow(FOLLOW_1);
            ruleSlideContent();

            state._fsp--;

             after(grammarAccess.getSlideContentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSlideContent"


    // $ANTLR start "ruleSlideContent"
    // InternalPptx.g:87:1: ruleSlideContent : ( ( rule__SlideContent__Group__0 ) ) ;
    public final void ruleSlideContent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPptx.g:91:2: ( ( ( rule__SlideContent__Group__0 ) ) )
            // InternalPptx.g:92:2: ( ( rule__SlideContent__Group__0 ) )
            {
            // InternalPptx.g:92:2: ( ( rule__SlideContent__Group__0 ) )
            // InternalPptx.g:93:3: ( rule__SlideContent__Group__0 )
            {
             before(grammarAccess.getSlideContentAccess().getGroup()); 
            // InternalPptx.g:94:3: ( rule__SlideContent__Group__0 )
            // InternalPptx.g:94:4: rule__SlideContent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SlideContent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSlideContentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSlideContent"


    // $ANTLR start "entryRulePresentation"
    // InternalPptx.g:103:1: entryRulePresentation : rulePresentation EOF ;
    public final void entryRulePresentation() throws RecognitionException {
        try {
            // InternalPptx.g:104:1: ( rulePresentation EOF )
            // InternalPptx.g:105:1: rulePresentation EOF
            {
             before(grammarAccess.getPresentationRule()); 
            pushFollow(FOLLOW_1);
            rulePresentation();

            state._fsp--;

             after(grammarAccess.getPresentationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePresentation"


    // $ANTLR start "rulePresentation"
    // InternalPptx.g:112:1: rulePresentation : ( ( rule__Presentation__Group__0 ) ) ;
    public final void rulePresentation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPptx.g:116:2: ( ( ( rule__Presentation__Group__0 ) ) )
            // InternalPptx.g:117:2: ( ( rule__Presentation__Group__0 ) )
            {
            // InternalPptx.g:117:2: ( ( rule__Presentation__Group__0 ) )
            // InternalPptx.g:118:3: ( rule__Presentation__Group__0 )
            {
             before(grammarAccess.getPresentationAccess().getGroup()); 
            // InternalPptx.g:119:3: ( rule__Presentation__Group__0 )
            // InternalPptx.g:119:4: rule__Presentation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Presentation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPresentationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePresentation"


    // $ANTLR start "entryRuleTheme"
    // InternalPptx.g:128:1: entryRuleTheme : ruleTheme EOF ;
    public final void entryRuleTheme() throws RecognitionException {
        try {
            // InternalPptx.g:129:1: ( ruleTheme EOF )
            // InternalPptx.g:130:1: ruleTheme EOF
            {
             before(grammarAccess.getThemeRule()); 
            pushFollow(FOLLOW_1);
            ruleTheme();

            state._fsp--;

             after(grammarAccess.getThemeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTheme"


    // $ANTLR start "ruleTheme"
    // InternalPptx.g:137:1: ruleTheme : ( ( rule__Theme__Group__0 ) ) ;
    public final void ruleTheme() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPptx.g:141:2: ( ( ( rule__Theme__Group__0 ) ) )
            // InternalPptx.g:142:2: ( ( rule__Theme__Group__0 ) )
            {
            // InternalPptx.g:142:2: ( ( rule__Theme__Group__0 ) )
            // InternalPptx.g:143:3: ( rule__Theme__Group__0 )
            {
             before(grammarAccess.getThemeAccess().getGroup()); 
            // InternalPptx.g:144:3: ( rule__Theme__Group__0 )
            // InternalPptx.g:144:4: rule__Theme__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Theme__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getThemeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTheme"


    // $ANTLR start "ruleColor"
    // InternalPptx.g:153:1: ruleColor : ( ( rule__Color__Alternatives ) ) ;
    public final void ruleColor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPptx.g:157:1: ( ( ( rule__Color__Alternatives ) ) )
            // InternalPptx.g:158:2: ( ( rule__Color__Alternatives ) )
            {
            // InternalPptx.g:158:2: ( ( rule__Color__Alternatives ) )
            // InternalPptx.g:159:3: ( rule__Color__Alternatives )
            {
             before(grammarAccess.getColorAccess().getAlternatives()); 
            // InternalPptx.g:160:3: ( rule__Color__Alternatives )
            // InternalPptx.g:160:4: rule__Color__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Color__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColor"


    // $ANTLR start "rule__Model__Alternatives"
    // InternalPptx.g:168:1: rule__Model__Alternatives : ( ( ( rule__Model__ContentsAssignment_0 ) ) | ( ( rule__Model__PresentationsAssignment_1 ) ) | ( ( rule__Model__ThemesAssignment_2 ) ) );
    public final void rule__Model__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPptx.g:172:1: ( ( ( rule__Model__ContentsAssignment_0 ) ) | ( ( rule__Model__PresentationsAssignment_1 ) ) | ( ( rule__Model__ThemesAssignment_2 ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt2=1;
                }
                break;
            case 18:
                {
                alt2=2;
                }
                break;
            case 19:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalPptx.g:173:2: ( ( rule__Model__ContentsAssignment_0 ) )
                    {
                    // InternalPptx.g:173:2: ( ( rule__Model__ContentsAssignment_0 ) )
                    // InternalPptx.g:174:3: ( rule__Model__ContentsAssignment_0 )
                    {
                     before(grammarAccess.getModelAccess().getContentsAssignment_0()); 
                    // InternalPptx.g:175:3: ( rule__Model__ContentsAssignment_0 )
                    // InternalPptx.g:175:4: rule__Model__ContentsAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__ContentsAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getContentsAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPptx.g:179:2: ( ( rule__Model__PresentationsAssignment_1 ) )
                    {
                    // InternalPptx.g:179:2: ( ( rule__Model__PresentationsAssignment_1 ) )
                    // InternalPptx.g:180:3: ( rule__Model__PresentationsAssignment_1 )
                    {
                     before(grammarAccess.getModelAccess().getPresentationsAssignment_1()); 
                    // InternalPptx.g:181:3: ( rule__Model__PresentationsAssignment_1 )
                    // InternalPptx.g:181:4: rule__Model__PresentationsAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__PresentationsAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getPresentationsAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPptx.g:185:2: ( ( rule__Model__ThemesAssignment_2 ) )
                    {
                    // InternalPptx.g:185:2: ( ( rule__Model__ThemesAssignment_2 ) )
                    // InternalPptx.g:186:3: ( rule__Model__ThemesAssignment_2 )
                    {
                     before(grammarAccess.getModelAccess().getThemesAssignment_2()); 
                    // InternalPptx.g:187:3: ( rule__Model__ThemesAssignment_2 )
                    // InternalPptx.g:187:4: rule__Model__ThemesAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__ThemesAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getThemesAssignment_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Alternatives"


    // $ANTLR start "rule__Color__Alternatives"
    // InternalPptx.g:195:1: rule__Color__Alternatives : ( ( ( 'white' ) ) | ( ( 'grey' ) ) );
    public final void rule__Color__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPptx.g:199:1: ( ( ( 'white' ) ) | ( ( 'grey' ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalPptx.g:200:2: ( ( 'white' ) )
                    {
                    // InternalPptx.g:200:2: ( ( 'white' ) )
                    // InternalPptx.g:201:3: ( 'white' )
                    {
                     before(grammarAccess.getColorAccess().getWHITEEnumLiteralDeclaration_0()); 
                    // InternalPptx.g:202:3: ( 'white' )
                    // InternalPptx.g:202:4: 'white'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorAccess().getWHITEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPptx.g:206:2: ( ( 'grey' ) )
                    {
                    // InternalPptx.g:206:2: ( ( 'grey' ) )
                    // InternalPptx.g:207:3: ( 'grey' )
                    {
                     before(grammarAccess.getColorAccess().getGREYEnumLiteralDeclaration_1()); 
                    // InternalPptx.g:208:3: ( 'grey' )
                    // InternalPptx.g:208:4: 'grey'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorAccess().getGREYEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Alternatives"


    // $ANTLR start "rule__SlideContent__Group__0"
    // InternalPptx.g:216:1: rule__SlideContent__Group__0 : rule__SlideContent__Group__0__Impl rule__SlideContent__Group__1 ;
    public final void rule__SlideContent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPptx.g:220:1: ( rule__SlideContent__Group__0__Impl rule__SlideContent__Group__1 )
            // InternalPptx.g:221:2: rule__SlideContent__Group__0__Impl rule__SlideContent__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__SlideContent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SlideContent__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlideContent__Group__0"


    // $ANTLR start "rule__SlideContent__Group__0__Impl"
    // InternalPptx.g:228:1: rule__SlideContent__Group__0__Impl : ( 'content' ) ;
    public final void rule__SlideContent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPptx.g:232:1: ( ( 'content' ) )
            // InternalPptx.g:233:1: ( 'content' )
            {
            // InternalPptx.g:233:1: ( 'content' )
            // InternalPptx.g:234:2: 'content'
            {
             before(grammarAccess.getSlideContentAccess().getContentKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getSlideContentAccess().getContentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlideContent__Group__0__Impl"


    // $ANTLR start "rule__SlideContent__Group__1"
    // InternalPptx.g:243:1: rule__SlideContent__Group__1 : rule__SlideContent__Group__1__Impl rule__SlideContent__Group__2 ;
    public final void rule__SlideContent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPptx.g:247:1: ( rule__SlideContent__Group__1__Impl rule__SlideContent__Group__2 )
            // InternalPptx.g:248:2: rule__SlideContent__Group__1__Impl rule__SlideContent__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__SlideContent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SlideContent__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlideContent__Group__1"


    // $ANTLR start "rule__SlideContent__Group__1__Impl"
    // InternalPptx.g:255:1: rule__SlideContent__Group__1__Impl : ( ( rule__SlideContent__NameAssignment_1 ) ) ;
    public final void rule__SlideContent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPptx.g:259:1: ( ( ( rule__SlideContent__NameAssignment_1 ) ) )
            // InternalPptx.g:260:1: ( ( rule__SlideContent__NameAssignment_1 ) )
            {
            // InternalPptx.g:260:1: ( ( rule__SlideContent__NameAssignment_1 ) )
            // InternalPptx.g:261:2: ( rule__SlideContent__NameAssignment_1 )
            {
             before(grammarAccess.getSlideContentAccess().getNameAssignment_1()); 
            // InternalPptx.g:262:2: ( rule__SlideContent__NameAssignment_1 )
            // InternalPptx.g:262:3: rule__SlideContent__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SlideContent__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSlideContentAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlideContent__Group__1__Impl"


    // $ANTLR start "rule__SlideContent__Group__2"
    // InternalPptx.g:270:1: rule__SlideContent__Group__2 : rule__SlideContent__Group__2__Impl rule__SlideContent__Group__3 ;
    public final void rule__SlideContent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPptx.g:274:1: ( rule__SlideContent__Group__2__Impl rule__SlideContent__Group__3 )
            // InternalPptx.g:275:2: rule__SlideContent__Group__2__Impl rule__SlideContent__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__SlideContent__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SlideContent__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlideContent__Group__2"


    // $ANTLR start "rule__SlideContent__Group__2__Impl"
    // InternalPptx.g:282:1: rule__SlideContent__Group__2__Impl : ( '{' ) ;
    public final void rule__SlideContent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPptx.g:286:1: ( ( '{' ) )
            // InternalPptx.g:287:1: ( '{' )
            {
            // InternalPptx.g:287:1: ( '{' )
            // InternalPptx.g:288:2: '{'
            {
             before(grammarAccess.getSlideContentAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSlideContentAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlideContent__Group__2__Impl"


    // $ANTLR start "rule__SlideContent__Group__3"
    // InternalPptx.g:297:1: rule__SlideContent__Group__3 : rule__SlideContent__Group__3__Impl rule__SlideContent__Group__4 ;
    public final void rule__SlideContent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPptx.g:301:1: ( rule__SlideContent__Group__3__Impl rule__SlideContent__Group__4 )
            // InternalPptx.g:302:2: rule__SlideContent__Group__3__Impl rule__SlideContent__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__SlideContent__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SlideContent__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlideContent__Group__3"


    // $ANTLR start "rule__SlideContent__Group__3__Impl"
    // InternalPptx.g:309:1: rule__SlideContent__Group__3__Impl : ( 'text' ) ;
    public final void rule__SlideContent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPptx.g:313:1: ( ( 'text' ) )
            // InternalPptx.g:314:1: ( 'text' )
            {
            // InternalPptx.g:314:1: ( 'text' )
            // InternalPptx.g:315:2: 'text'
            {
             before(grammarAccess.getSlideContentAccess().getTextKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getSlideContentAccess().getTextKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlideContent__Group__3__Impl"


    // $ANTLR start "rule__SlideContent__Group__4"
    // InternalPptx.g:324:1: rule__SlideContent__Group__4 : rule__SlideContent__Group__4__Impl rule__SlideContent__Group__5 ;
    public final void rule__SlideContent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPptx.g:328:1: ( rule__SlideContent__Group__4__Impl rule__SlideContent__Group__5 )
            // InternalPptx.g:329:2: rule__SlideContent__Group__4__Impl rule__SlideContent__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__SlideContent__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SlideContent__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlideContent__Group__4"


    // $ANTLR start "rule__SlideContent__Group__4__Impl"
    // InternalPptx.g:336:1: rule__SlideContent__Group__4__Impl : ( ( rule__SlideContent__TextAssignment_4 ) ) ;
    public final void rule__SlideContent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPptx.g:340:1: ( ( ( rule__SlideContent__TextAssignment_4 ) ) )
            // InternalPptx.g:341:1: ( ( rule__SlideContent__TextAssignment_4 ) )
            {
            // InternalPptx.g:341:1: ( ( rule__SlideContent__TextAssignment_4 ) )
            // InternalPptx.g:342:2: ( rule__SlideContent__TextAssignment_4 )
            {
             before(grammarAccess.getSlideContentAccess().getTextAssignment_4()); 
            // InternalPptx.g:343:2: ( rule__SlideContent__TextAssignment_4 )
            // InternalPptx.g:343:3: rule__SlideContent__TextAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__SlideContent__TextAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSlideContentAccess().getTextAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlideContent__Group__4__Impl"


    // $ANTLR start "rule__SlideContent__Group__5"
    // InternalPptx.g:351:1: rule__SlideContent__Group__5 : rule__SlideContent__Group__5__Impl rule__SlideContent__Group__6 ;
    public final void rule__SlideContent__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPptx.g:355:1: ( rule__SlideContent__Group__5__Impl rule__SlideContent__Group__6 )
            // InternalPptx.g:356:2: rule__SlideContent__Group__5__Impl rule__SlideContent__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__SlideContent__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SlideContent__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlideContent__Group__5"


    // $ANTLR start "rule__SlideContent__Group__5__Impl"
    // InternalPptx.g:363:1: rule__SlideContent__Group__5__Impl : ( ( rule__SlideContent__Group_5__0 )? ) ;
    public final void rule__SlideContent__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPptx.g:367:1: ( ( ( rule__SlideContent__Group_5__0 )? ) )
            // InternalPptx.g:368:1: ( ( rule__SlideContent__Group_5__0 )? )
            {
            // InternalPptx.g:368:1: ( ( rule__SlideContent__Group_5__0 )? )
            // InternalPptx.g:369:2: ( rule__SlideContent__Group_5__0 )?
            {
             before(grammarAccess.getSlideContentAccess().getGroup_5()); 
            // InternalPptx.g:370:2: ( rule__SlideContent__Group_5__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalPptx.g:370:3: rule__SlideContent__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SlideContent__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSlideContentAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlideContent__Group__5__Impl"


    // $ANTLR start "rule__SlideContent__Group__6"
    // InternalPptx.g:378:1: rule__SlideContent__Group__6 : rule__SlideContent__Group__6__Impl ;
    public final void rule__SlideContent__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPptx.g:382:1: ( rule__SlideContent__Group__6__Impl )
            // InternalPptx.g:383:2: rule__SlideContent__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SlideContent__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlideContent__Group__6"


    // $ANTLR start "rule__SlideContent__Group__6__Impl"
    // InternalPptx.g:389:1: rule__SlideContent__Group__6__Impl : ( '}' ) ;
    public final void rule__SlideContent__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPptx.g:393:1: ( ( '}' ) )
            // InternalPptx.g:394:1: ( '}' )
            {
            // InternalPptx.g:394:1: ( '}' )
            // InternalPptx.g:395:2: '}'
            {
             before(grammarAccess.getSlideContentAccess().getRightCurlyBracketKeyword_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSlideContentAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlideContent__Group__6__Impl"


    // $ANTLR start "rule__SlideContent__Group_5__0"
    // InternalPptx.g:405:1: rule__SlideContent__Group_5__0 : rule__SlideContent__Group_5__0__Impl rule__SlideContent__Group_5__1 ;
    public final void rule__SlideContent__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPptx.g:409:1: ( rule__SlideContent__Group_5__0__Impl rule__SlideContent__Group_5__1 )
            // InternalPptx.g:410:2: rule__SlideContent__Group_5__0__Impl rule__SlideContent__Group_5__1
            {
            pushFollow(FOLLOW_7);
            rule__SlideContent__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SlideContent__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlideContent__Group_5__0"


    // $ANTLR start "rule__SlideContent__Group_5__0__Impl"
    // InternalPptx.g:417:1: rule__SlideContent__Group_5__0__Impl : ( 'note' ) ;
    public final void rule__SlideContent__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPptx.g:421:1: ( ( 'note' ) )
            // InternalPptx.g:422:1: ( 'note' )
            {
            // InternalPptx.g:422:1: ( 'note' )
            // InternalPptx.g:423:2: 'note'
            {
             before(grammarAccess.getSlideContentAccess().getNoteKeyword_5_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSlideContentAccess().getNoteKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlideContent__Group_5__0__Impl"


    // $ANTLR start "rule__SlideContent__Group_5__1"
    // InternalPptx.g:432:1: rule__SlideContent__Group_5__1 : rule__SlideContent__Group_5__1__Impl ;
    public final void rule__SlideContent__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPptx.g:436:1: ( rule__SlideContent__Group_5__1__Impl )
            // InternalPptx.g:437:2: rule__SlideContent__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SlideContent__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlideContent__Group_5__1"


    // $ANTLR start "rule__SlideContent__Group_5__1__Impl"
    // InternalPptx.g:443:1: rule__SlideContent__Group_5__1__Impl : ( ( rule__SlideContent__NoteAssignment_5_1 ) ) ;
    public final void rule__SlideContent__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPptx.g:447:1: ( ( ( rule__SlideContent__NoteAssignment_5_1 ) ) )
            // InternalPptx.g:448:1: ( ( rule__SlideContent__NoteAssignment_5_1 ) )
            {
            // InternalPptx.g:448:1: ( ( rule__SlideContent__NoteAssignment_5_1 ) )
            // InternalPptx.g:449:2: ( rule__SlideContent__NoteAssignment_5_1 )
            {
             before(grammarAccess.getSlideContentAccess().getNoteAssignment_5_1()); 
            // InternalPptx.g:450:2: ( rule__SlideContent__NoteAssignment_5_1 )
            // InternalPptx.g:450:3: rule__SlideContent__NoteAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__SlideContent__NoteAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getSlideContentAccess().getNoteAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlideContent__Group_5__1__Impl"


    // $ANTLR start "rule__Presentation__Group__0"
    // InternalPptx.g:459:1: rule__Presentation__Group__0 : rule__Presentation__Group__0__Impl rule__Presentation__Group__1 ;
    public final void rule__Presentation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPptx.g:463:1: ( rule__Presentation__Group__0__Impl rule__Presentation__Group__1 )
            // InternalPptx.g:464:2: rule__Presentation__Group__0__Impl rule__Presentation__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Presentation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Presentation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Presentation__Group__0"


    // $ANTLR start "rule__Presentation__Group__0__Impl"
    // InternalPptx.g:471:1: rule__Presentation__Group__0__Impl : ( 'presentation' ) ;
    public final void rule__Presentation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPptx.g:475:1: ( ( 'presentation' ) )
            // InternalPptx.g:476:1: ( 'presentation' )
            {
            // InternalPptx.g:476:1: ( 'presentation' )
            // InternalPptx.g:477:2: 'presentation'
            {
             before(grammarAccess.getPresentationAccess().getPresentationKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPresentationAccess().getPresentationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Presentation__Group__0__Impl"


    // $ANTLR start "rule__Presentation__Group__1"
    // InternalPptx.g:486:1: rule__Presentation__Group__1 : rule__Presentation__Group__1__Impl rule__Presentation__Group__2 ;
    public final void rule__Presentation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPptx.g:490:1: ( rule__Presentation__Group__1__Impl rule__Presentation__Group__2 )
            // InternalPptx.g:491:2: rule__Presentation__Group__1__Impl rule__Presentation__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Presentation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Presentation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Presentation__Group__1"


    // $ANTLR start "rule__Presentation__Group__1__Impl"
    // InternalPptx.g:498:1: rule__Presentation__Group__1__Impl : ( ( rule__Presentation__NameAssignment_1 ) ) ;
    public final void rule__Presentation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPptx.g:502:1: ( ( ( rule__Presentation__NameAssignment_1 ) ) )
            // InternalPptx.g:503:1: ( ( rule__Presentation__NameAssignment_1 ) )
            {
            // InternalPptx.g:503:1: ( ( rule__Presentation__NameAssignment_1 ) )
            // InternalPptx.g:504:2: ( rule__Presentation__NameAssignment_1 )
            {
             before(grammarAccess.getPresentationAccess().getNameAssignment_1()); 
            // InternalPptx.g:505:2: ( rule__Presentation__NameAssignment_1 )
            // InternalPptx.g:505:3: rule__Presentation__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Presentation__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPresentationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Presentation__Group__1__Impl"


    // $ANTLR start "rule__Presentation__Group__2"
    // InternalPptx.g:513:1: rule__Presentation__Group__2 : rule__Presentation__Group__2__Impl rule__Presentation__Group__3 ;
    public final void rule__Presentation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPptx.g:517:1: ( rule__Presentation__Group__2__Impl rule__Presentation__Group__3 )
            // InternalPptx.g:518:2: rule__Presentation__Group__2__Impl rule__Presentation__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Presentation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Presentation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Presentation__Group__2"


    // $ANTLR start "rule__Presentation__Group__2__Impl"
    // InternalPptx.g:525:1: rule__Presentation__Group__2__Impl : ( '{' ) ;
    public final void rule__Presentation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPptx.g:529:1: ( ( '{' ) )
            // InternalPptx.g:530:1: ( '{' )
            {
            // InternalPptx.g:530:1: ( '{' )
            // InternalPptx.g:531:2: '{'
            {
             before(grammarAccess.getPresentationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPresentationAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Presentation__Group__2__Impl"


    // $ANTLR start "rule__Presentation__Group__3"
    // InternalPptx.g:540:1: rule__Presentation__Group__3 : rule__Presentation__Group__3__Impl rule__Presentation__Group__4 ;
    public final void rule__Presentation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPptx.g:544:1: ( rule__Presentation__Group__3__Impl rule__Presentation__Group__4 )
            // InternalPptx.g:545:2: rule__Presentation__Group__3__Impl rule__Presentation__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Presentation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Presentation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Presentation__Group__3"


    // $ANTLR start "rule__Presentation__Group__3__Impl"
    // InternalPptx.g:552:1: rule__Presentation__Group__3__Impl : ( 'theme' ) ;
    public final void rule__Presentation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPptx.g:556:1: ( ( 'theme' ) )
            // InternalPptx.g:557:1: ( 'theme' )
            {
            // InternalPptx.g:557:1: ( 'theme' )
            // InternalPptx.g:558:2: 'theme'
            {
             before(grammarAccess.getPresentationAccess().getThemeKeyword_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getPresentationAccess().getThemeKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Presentation__Group__3__Impl"


    // $ANTLR start "rule__Presentation__Group__4"
    // InternalPptx.g:567:1: rule__Presentation__Group__4 : rule__Presentation__Group__4__Impl rule__Presentation__Group__5 ;
    public final void rule__Presentation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPptx.g:571:1: ( rule__Presentation__Group__4__Impl rule__Presentation__Group__5 )
            // InternalPptx.g:572:2: rule__Presentation__Group__4__Impl rule__Presentation__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__Presentation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Presentation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Presentation__Group__4"


    // $ANTLR start "rule__Presentation__Group__4__Impl"
    // InternalPptx.g:579:1: rule__Presentation__Group__4__Impl : ( ( rule__Presentation__ThemeAssignment_4 ) ) ;
    public final void rule__Presentation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPptx.g:583:1: ( ( ( rule__Presentation__ThemeAssignment_4 ) ) )
            // InternalPptx.g:584:1: ( ( rule__Presentation__ThemeAssignment_4 ) )
            {
            // InternalPptx.g:584:1: ( ( rule__Presentation__ThemeAssignment_4 ) )
            // InternalPptx.g:585:2: ( rule__Presentation__ThemeAssignment_4 )
            {
             before(grammarAccess.getPresentationAccess().getThemeAssignment_4()); 
            // InternalPptx.g:586:2: ( rule__Presentation__ThemeAssignment_4 )
            // InternalPptx.g:586:3: rule__Presentation__ThemeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Presentation__ThemeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPresentationAccess().getThemeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Presentation__Group__4__Impl"


    // $ANTLR start "rule__Presentation__Group__5"
    // InternalPptx.g:594:1: rule__Presentation__Group__5 : rule__Presentation__Group__5__Impl rule__Presentation__Group__6 ;
    public final void rule__Presentation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPptx.g:598:1: ( rule__Presentation__Group__5__Impl rule__Presentation__Group__6 )
            // InternalPptx.g:599:2: rule__Presentation__Group__5__Impl rule__Presentation__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__Presentation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Presentation__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Presentation__Group__5"


    // $ANTLR start "rule__Presentation__Group__5__Impl"
    // InternalPptx.g:606:1: rule__Presentation__Group__5__Impl : ( ( rule__Presentation__Group_5__0 )* ) ;
    public final void rule__Presentation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPptx.g:610:1: ( ( ( rule__Presentation__Group_5__0 )* ) )
            // InternalPptx.g:611:1: ( ( rule__Presentation__Group_5__0 )* )
            {
            // InternalPptx.g:611:1: ( ( rule__Presentation__Group_5__0 )* )
            // InternalPptx.g:612:2: ( rule__Presentation__Group_5__0 )*
            {
             before(grammarAccess.getPresentationAccess().getGroup_5()); 
            // InternalPptx.g:613:2: ( rule__Presentation__Group_5__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==20) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalPptx.g:613:3: rule__Presentation__Group_5__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Presentation__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getPresentationAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Presentation__Group__5__Impl"


    // $ANTLR start "rule__Presentation__Group__6"
    // InternalPptx.g:621:1: rule__Presentation__Group__6 : rule__Presentation__Group__6__Impl ;
    public final void rule__Presentation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPptx.g:625:1: ( rule__Presentation__Group__6__Impl )
            // InternalPptx.g:626:2: rule__Presentation__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Presentation__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Presentation__Group__6"


    // $ANTLR start "rule__Presentation__Group__6__Impl"
    // InternalPptx.g:632:1: rule__Presentation__Group__6__Impl : ( '}' ) ;
    public final void rule__Presentation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPptx.g:636:1: ( ( '}' ) )
            // InternalPptx.g:637:1: ( '}' )
            {
            // InternalPptx.g:637:1: ( '}' )
            // InternalPptx.g:638:2: '}'
            {
             before(grammarAccess.getPresentationAccess().getRightCurlyBracketKeyword_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPresentationAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Presentation__Group__6__Impl"


    // $ANTLR start "rule__Presentation__Group_5__0"
    // InternalPptx.g:648:1: rule__Presentation__Group_5__0 : rule__Presentation__Group_5__0__Impl rule__Presentation__Group_5__1 ;
    public final void rule__Presentation__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPptx.g:652:1: ( rule__Presentation__Group_5__0__Impl rule__Presentation__Group_5__1 )
            // InternalPptx.g:653:2: rule__Presentation__Group_5__0__Impl rule__Presentation__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__Presentation__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Presentation__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Presentation__Group_5__0"


    // $ANTLR start "rule__Presentation__Group_5__0__Impl"
    // InternalPptx.g:660:1: rule__Presentation__Group_5__0__Impl : ( 'slide' ) ;
    public final void rule__Presentation__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPptx.g:664:1: ( ( 'slide' ) )
            // InternalPptx.g:665:1: ( 'slide' )
            {
            // InternalPptx.g:665:1: ( 'slide' )
            // InternalPptx.g:666:2: 'slide'
            {
             before(grammarAccess.getPresentationAccess().getSlideKeyword_5_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPresentationAccess().getSlideKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Presentation__Group_5__0__Impl"


    // $ANTLR start "rule__Presentation__Group_5__1"
    // InternalPptx.g:675:1: rule__Presentation__Group_5__1 : rule__Presentation__Group_5__1__Impl ;
    public final void rule__Presentation__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPptx.g:679:1: ( rule__Presentation__Group_5__1__Impl )
            // InternalPptx.g:680:2: rule__Presentation__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Presentation__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Presentation__Group_5__1"


    // $ANTLR start "rule__Presentation__Group_5__1__Impl"
    // InternalPptx.g:686:1: rule__Presentation__Group_5__1__Impl : ( ( rule__Presentation__SlidesAssignment_5_1 ) ) ;
    public final void rule__Presentation__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPptx.g:690:1: ( ( ( rule__Presentation__SlidesAssignment_5_1 ) ) )
            // InternalPptx.g:691:1: ( ( rule__Presentation__SlidesAssignment_5_1 ) )
            {
            // InternalPptx.g:691:1: ( ( rule__Presentation__SlidesAssignment_5_1 ) )
            // InternalPptx.g:692:2: ( rule__Presentation__SlidesAssignment_5_1 )
            {
             before(grammarAccess.getPresentationAccess().getSlidesAssignment_5_1()); 
            // InternalPptx.g:693:2: ( rule__Presentation__SlidesAssignment_5_1 )
            // InternalPptx.g:693:3: rule__Presentation__SlidesAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Presentation__SlidesAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getPresentationAccess().getSlidesAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Presentation__Group_5__1__Impl"


    // $ANTLR start "rule__Theme__Group__0"
    // InternalPptx.g:702:1: rule__Theme__Group__0 : rule__Theme__Group__0__Impl rule__Theme__Group__1 ;
    public final void rule__Theme__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPptx.g:706:1: ( rule__Theme__Group__0__Impl rule__Theme__Group__1 )
            // InternalPptx.g:707:2: rule__Theme__Group__0__Impl rule__Theme__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Theme__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Theme__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theme__Group__0"


    // $ANTLR start "rule__Theme__Group__0__Impl"
    // InternalPptx.g:714:1: rule__Theme__Group__0__Impl : ( 'theme' ) ;
    public final void rule__Theme__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPptx.g:718:1: ( ( 'theme' ) )
            // InternalPptx.g:719:1: ( 'theme' )
            {
            // InternalPptx.g:719:1: ( 'theme' )
            // InternalPptx.g:720:2: 'theme'
            {
             before(grammarAccess.getThemeAccess().getThemeKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getThemeAccess().getThemeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theme__Group__0__Impl"


    // $ANTLR start "rule__Theme__Group__1"
    // InternalPptx.g:729:1: rule__Theme__Group__1 : rule__Theme__Group__1__Impl rule__Theme__Group__2 ;
    public final void rule__Theme__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPptx.g:733:1: ( rule__Theme__Group__1__Impl rule__Theme__Group__2 )
            // InternalPptx.g:734:2: rule__Theme__Group__1__Impl rule__Theme__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Theme__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Theme__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theme__Group__1"


    // $ANTLR start "rule__Theme__Group__1__Impl"
    // InternalPptx.g:741:1: rule__Theme__Group__1__Impl : ( ( rule__Theme__NameAssignment_1 ) ) ;
    public final void rule__Theme__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPptx.g:745:1: ( ( ( rule__Theme__NameAssignment_1 ) ) )
            // InternalPptx.g:746:1: ( ( rule__Theme__NameAssignment_1 ) )
            {
            // InternalPptx.g:746:1: ( ( rule__Theme__NameAssignment_1 ) )
            // InternalPptx.g:747:2: ( rule__Theme__NameAssignment_1 )
            {
             before(grammarAccess.getThemeAccess().getNameAssignment_1()); 
            // InternalPptx.g:748:2: ( rule__Theme__NameAssignment_1 )
            // InternalPptx.g:748:3: rule__Theme__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Theme__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getThemeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theme__Group__1__Impl"


    // $ANTLR start "rule__Theme__Group__2"
    // InternalPptx.g:756:1: rule__Theme__Group__2 : rule__Theme__Group__2__Impl rule__Theme__Group__3 ;
    public final void rule__Theme__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPptx.g:760:1: ( rule__Theme__Group__2__Impl rule__Theme__Group__3 )
            // InternalPptx.g:761:2: rule__Theme__Group__2__Impl rule__Theme__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Theme__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Theme__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theme__Group__2"


    // $ANTLR start "rule__Theme__Group__2__Impl"
    // InternalPptx.g:768:1: rule__Theme__Group__2__Impl : ( '{' ) ;
    public final void rule__Theme__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPptx.g:772:1: ( ( '{' ) )
            // InternalPptx.g:773:1: ( '{' )
            {
            // InternalPptx.g:773:1: ( '{' )
            // InternalPptx.g:774:2: '{'
            {
             before(grammarAccess.getThemeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getThemeAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theme__Group__2__Impl"


    // $ANTLR start "rule__Theme__Group__3"
    // InternalPptx.g:783:1: rule__Theme__Group__3 : rule__Theme__Group__3__Impl rule__Theme__Group__4 ;
    public final void rule__Theme__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPptx.g:787:1: ( rule__Theme__Group__3__Impl rule__Theme__Group__4 )
            // InternalPptx.g:788:2: rule__Theme__Group__3__Impl rule__Theme__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Theme__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Theme__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theme__Group__3"


    // $ANTLR start "rule__Theme__Group__3__Impl"
    // InternalPptx.g:795:1: rule__Theme__Group__3__Impl : ( ( rule__Theme__Group_3__0 )? ) ;
    public final void rule__Theme__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPptx.g:799:1: ( ( ( rule__Theme__Group_3__0 )? ) )
            // InternalPptx.g:800:1: ( ( rule__Theme__Group_3__0 )? )
            {
            // InternalPptx.g:800:1: ( ( rule__Theme__Group_3__0 )? )
            // InternalPptx.g:801:2: ( rule__Theme__Group_3__0 )?
            {
             before(grammarAccess.getThemeAccess().getGroup_3()); 
            // InternalPptx.g:802:2: ( rule__Theme__Group_3__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalPptx.g:802:3: rule__Theme__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Theme__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getThemeAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theme__Group__3__Impl"


    // $ANTLR start "rule__Theme__Group__4"
    // InternalPptx.g:810:1: rule__Theme__Group__4 : rule__Theme__Group__4__Impl rule__Theme__Group__5 ;
    public final void rule__Theme__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPptx.g:814:1: ( rule__Theme__Group__4__Impl rule__Theme__Group__5 )
            // InternalPptx.g:815:2: rule__Theme__Group__4__Impl rule__Theme__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__Theme__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Theme__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theme__Group__4"


    // $ANTLR start "rule__Theme__Group__4__Impl"
    // InternalPptx.g:822:1: rule__Theme__Group__4__Impl : ( ( rule__Theme__Group_4__0 )? ) ;
    public final void rule__Theme__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPptx.g:826:1: ( ( ( rule__Theme__Group_4__0 )? ) )
            // InternalPptx.g:827:1: ( ( rule__Theme__Group_4__0 )? )
            {
            // InternalPptx.g:827:1: ( ( rule__Theme__Group_4__0 )? )
            // InternalPptx.g:828:2: ( rule__Theme__Group_4__0 )?
            {
             before(grammarAccess.getThemeAccess().getGroup_4()); 
            // InternalPptx.g:829:2: ( rule__Theme__Group_4__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalPptx.g:829:3: rule__Theme__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Theme__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getThemeAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theme__Group__4__Impl"


    // $ANTLR start "rule__Theme__Group__5"
    // InternalPptx.g:837:1: rule__Theme__Group__5 : rule__Theme__Group__5__Impl rule__Theme__Group__6 ;
    public final void rule__Theme__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPptx.g:841:1: ( rule__Theme__Group__5__Impl rule__Theme__Group__6 )
            // InternalPptx.g:842:2: rule__Theme__Group__5__Impl rule__Theme__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__Theme__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Theme__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theme__Group__5"


    // $ANTLR start "rule__Theme__Group__5__Impl"
    // InternalPptx.g:849:1: rule__Theme__Group__5__Impl : ( ( rule__Theme__Group_5__0 )? ) ;
    public final void rule__Theme__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPptx.g:853:1: ( ( ( rule__Theme__Group_5__0 )? ) )
            // InternalPptx.g:854:1: ( ( rule__Theme__Group_5__0 )? )
            {
            // InternalPptx.g:854:1: ( ( rule__Theme__Group_5__0 )? )
            // InternalPptx.g:855:2: ( rule__Theme__Group_5__0 )?
            {
             before(grammarAccess.getThemeAccess().getGroup_5()); 
            // InternalPptx.g:856:2: ( rule__Theme__Group_5__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalPptx.g:856:3: rule__Theme__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Theme__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getThemeAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theme__Group__5__Impl"


    // $ANTLR start "rule__Theme__Group__6"
    // InternalPptx.g:864:1: rule__Theme__Group__6 : rule__Theme__Group__6__Impl ;
    public final void rule__Theme__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPptx.g:868:1: ( rule__Theme__Group__6__Impl )
            // InternalPptx.g:869:2: rule__Theme__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Theme__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theme__Group__6"


    // $ANTLR start "rule__Theme__Group__6__Impl"
    // InternalPptx.g:875:1: rule__Theme__Group__6__Impl : ( '}' ) ;
    public final void rule__Theme__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPptx.g:879:1: ( ( '}' ) )
            // InternalPptx.g:880:1: ( '}' )
            {
            // InternalPptx.g:880:1: ( '}' )
            // InternalPptx.g:881:2: '}'
            {
             before(grammarAccess.getThemeAccess().getRightCurlyBracketKeyword_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getThemeAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theme__Group__6__Impl"


    // $ANTLR start "rule__Theme__Group_3__0"
    // InternalPptx.g:891:1: rule__Theme__Group_3__0 : rule__Theme__Group_3__0__Impl rule__Theme__Group_3__1 ;
    public final void rule__Theme__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPptx.g:895:1: ( rule__Theme__Group_3__0__Impl rule__Theme__Group_3__1 )
            // InternalPptx.g:896:2: rule__Theme__Group_3__0__Impl rule__Theme__Group_3__1
            {
            pushFollow(FOLLOW_13);
            rule__Theme__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Theme__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theme__Group_3__0"


    // $ANTLR start "rule__Theme__Group_3__0__Impl"
    // InternalPptx.g:903:1: rule__Theme__Group_3__0__Impl : ( 'background' ) ;
    public final void rule__Theme__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPptx.g:907:1: ( ( 'background' ) )
            // InternalPptx.g:908:1: ( 'background' )
            {
            // InternalPptx.g:908:1: ( 'background' )
            // InternalPptx.g:909:2: 'background'
            {
             before(grammarAccess.getThemeAccess().getBackgroundKeyword_3_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getThemeAccess().getBackgroundKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theme__Group_3__0__Impl"


    // $ANTLR start "rule__Theme__Group_3__1"
    // InternalPptx.g:918:1: rule__Theme__Group_3__1 : rule__Theme__Group_3__1__Impl ;
    public final void rule__Theme__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPptx.g:922:1: ( rule__Theme__Group_3__1__Impl )
            // InternalPptx.g:923:2: rule__Theme__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Theme__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theme__Group_3__1"


    // $ANTLR start "rule__Theme__Group_3__1__Impl"
    // InternalPptx.g:929:1: rule__Theme__Group_3__1__Impl : ( ( rule__Theme__BackgroundAssignment_3_1 ) ) ;
    public final void rule__Theme__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPptx.g:933:1: ( ( ( rule__Theme__BackgroundAssignment_3_1 ) ) )
            // InternalPptx.g:934:1: ( ( rule__Theme__BackgroundAssignment_3_1 ) )
            {
            // InternalPptx.g:934:1: ( ( rule__Theme__BackgroundAssignment_3_1 ) )
            // InternalPptx.g:935:2: ( rule__Theme__BackgroundAssignment_3_1 )
            {
             before(grammarAccess.getThemeAccess().getBackgroundAssignment_3_1()); 
            // InternalPptx.g:936:2: ( rule__Theme__BackgroundAssignment_3_1 )
            // InternalPptx.g:936:3: rule__Theme__BackgroundAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Theme__BackgroundAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getThemeAccess().getBackgroundAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theme__Group_3__1__Impl"


    // $ANTLR start "rule__Theme__Group_4__0"
    // InternalPptx.g:945:1: rule__Theme__Group_4__0 : rule__Theme__Group_4__0__Impl rule__Theme__Group_4__1 ;
    public final void rule__Theme__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPptx.g:949:1: ( rule__Theme__Group_4__0__Impl rule__Theme__Group_4__1 )
            // InternalPptx.g:950:2: rule__Theme__Group_4__0__Impl rule__Theme__Group_4__1
            {
            pushFollow(FOLLOW_7);
            rule__Theme__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Theme__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theme__Group_4__0"


    // $ANTLR start "rule__Theme__Group_4__0__Impl"
    // InternalPptx.g:957:1: rule__Theme__Group_4__0__Impl : ( 'header' ) ;
    public final void rule__Theme__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPptx.g:961:1: ( ( 'header' ) )
            // InternalPptx.g:962:1: ( 'header' )
            {
            // InternalPptx.g:962:1: ( 'header' )
            // InternalPptx.g:963:2: 'header'
            {
             before(grammarAccess.getThemeAccess().getHeaderKeyword_4_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getThemeAccess().getHeaderKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theme__Group_4__0__Impl"


    // $ANTLR start "rule__Theme__Group_4__1"
    // InternalPptx.g:972:1: rule__Theme__Group_4__1 : rule__Theme__Group_4__1__Impl ;
    public final void rule__Theme__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPptx.g:976:1: ( rule__Theme__Group_4__1__Impl )
            // InternalPptx.g:977:2: rule__Theme__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Theme__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theme__Group_4__1"


    // $ANTLR start "rule__Theme__Group_4__1__Impl"
    // InternalPptx.g:983:1: rule__Theme__Group_4__1__Impl : ( ( rule__Theme__HeaderAssignment_4_1 ) ) ;
    public final void rule__Theme__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPptx.g:987:1: ( ( ( rule__Theme__HeaderAssignment_4_1 ) ) )
            // InternalPptx.g:988:1: ( ( rule__Theme__HeaderAssignment_4_1 ) )
            {
            // InternalPptx.g:988:1: ( ( rule__Theme__HeaderAssignment_4_1 ) )
            // InternalPptx.g:989:2: ( rule__Theme__HeaderAssignment_4_1 )
            {
             before(grammarAccess.getThemeAccess().getHeaderAssignment_4_1()); 
            // InternalPptx.g:990:2: ( rule__Theme__HeaderAssignment_4_1 )
            // InternalPptx.g:990:3: rule__Theme__HeaderAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Theme__HeaderAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getThemeAccess().getHeaderAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theme__Group_4__1__Impl"


    // $ANTLR start "rule__Theme__Group_5__0"
    // InternalPptx.g:999:1: rule__Theme__Group_5__0 : rule__Theme__Group_5__0__Impl rule__Theme__Group_5__1 ;
    public final void rule__Theme__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPptx.g:1003:1: ( rule__Theme__Group_5__0__Impl rule__Theme__Group_5__1 )
            // InternalPptx.g:1004:2: rule__Theme__Group_5__0__Impl rule__Theme__Group_5__1
            {
            pushFollow(FOLLOW_7);
            rule__Theme__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Theme__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theme__Group_5__0"


    // $ANTLR start "rule__Theme__Group_5__0__Impl"
    // InternalPptx.g:1011:1: rule__Theme__Group_5__0__Impl : ( 'footer' ) ;
    public final void rule__Theme__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPptx.g:1015:1: ( ( 'footer' ) )
            // InternalPptx.g:1016:1: ( 'footer' )
            {
            // InternalPptx.g:1016:1: ( 'footer' )
            // InternalPptx.g:1017:2: 'footer'
            {
             before(grammarAccess.getThemeAccess().getFooterKeyword_5_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getThemeAccess().getFooterKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theme__Group_5__0__Impl"


    // $ANTLR start "rule__Theme__Group_5__1"
    // InternalPptx.g:1026:1: rule__Theme__Group_5__1 : rule__Theme__Group_5__1__Impl ;
    public final void rule__Theme__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPptx.g:1030:1: ( rule__Theme__Group_5__1__Impl )
            // InternalPptx.g:1031:2: rule__Theme__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Theme__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theme__Group_5__1"


    // $ANTLR start "rule__Theme__Group_5__1__Impl"
    // InternalPptx.g:1037:1: rule__Theme__Group_5__1__Impl : ( ( rule__Theme__FooterAssignment_5_1 ) ) ;
    public final void rule__Theme__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPptx.g:1041:1: ( ( ( rule__Theme__FooterAssignment_5_1 ) ) )
            // InternalPptx.g:1042:1: ( ( rule__Theme__FooterAssignment_5_1 ) )
            {
            // InternalPptx.g:1042:1: ( ( rule__Theme__FooterAssignment_5_1 ) )
            // InternalPptx.g:1043:2: ( rule__Theme__FooterAssignment_5_1 )
            {
             before(grammarAccess.getThemeAccess().getFooterAssignment_5_1()); 
            // InternalPptx.g:1044:2: ( rule__Theme__FooterAssignment_5_1 )
            // InternalPptx.g:1044:3: rule__Theme__FooterAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Theme__FooterAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getThemeAccess().getFooterAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theme__Group_5__1__Impl"


    // $ANTLR start "rule__Model__ContentsAssignment_0"
    // InternalPptx.g:1053:1: rule__Model__ContentsAssignment_0 : ( ruleSlideContent ) ;
    public final void rule__Model__ContentsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPptx.g:1057:1: ( ( ruleSlideContent ) )
            // InternalPptx.g:1058:2: ( ruleSlideContent )
            {
            // InternalPptx.g:1058:2: ( ruleSlideContent )
            // InternalPptx.g:1059:3: ruleSlideContent
            {
             before(grammarAccess.getModelAccess().getContentsSlideContentParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSlideContent();

            state._fsp--;

             after(grammarAccess.getModelAccess().getContentsSlideContentParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ContentsAssignment_0"


    // $ANTLR start "rule__Model__PresentationsAssignment_1"
    // InternalPptx.g:1068:1: rule__Model__PresentationsAssignment_1 : ( rulePresentation ) ;
    public final void rule__Model__PresentationsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPptx.g:1072:1: ( ( rulePresentation ) )
            // InternalPptx.g:1073:2: ( rulePresentation )
            {
            // InternalPptx.g:1073:2: ( rulePresentation )
            // InternalPptx.g:1074:3: rulePresentation
            {
             before(grammarAccess.getModelAccess().getPresentationsPresentationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePresentation();

            state._fsp--;

             after(grammarAccess.getModelAccess().getPresentationsPresentationParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__PresentationsAssignment_1"


    // $ANTLR start "rule__Model__ThemesAssignment_2"
    // InternalPptx.g:1083:1: rule__Model__ThemesAssignment_2 : ( ruleTheme ) ;
    public final void rule__Model__ThemesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPptx.g:1087:1: ( ( ruleTheme ) )
            // InternalPptx.g:1088:2: ( ruleTheme )
            {
            // InternalPptx.g:1088:2: ( ruleTheme )
            // InternalPptx.g:1089:3: ruleTheme
            {
             before(grammarAccess.getModelAccess().getThemesThemeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTheme();

            state._fsp--;

             after(grammarAccess.getModelAccess().getThemesThemeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ThemesAssignment_2"


    // $ANTLR start "rule__SlideContent__NameAssignment_1"
    // InternalPptx.g:1098:1: rule__SlideContent__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SlideContent__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPptx.g:1102:1: ( ( RULE_ID ) )
            // InternalPptx.g:1103:2: ( RULE_ID )
            {
            // InternalPptx.g:1103:2: ( RULE_ID )
            // InternalPptx.g:1104:3: RULE_ID
            {
             before(grammarAccess.getSlideContentAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSlideContentAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlideContent__NameAssignment_1"


    // $ANTLR start "rule__SlideContent__TextAssignment_4"
    // InternalPptx.g:1113:1: rule__SlideContent__TextAssignment_4 : ( RULE_STRING ) ;
    public final void rule__SlideContent__TextAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPptx.g:1117:1: ( ( RULE_STRING ) )
            // InternalPptx.g:1118:2: ( RULE_STRING )
            {
            // InternalPptx.g:1118:2: ( RULE_STRING )
            // InternalPptx.g:1119:3: RULE_STRING
            {
             before(grammarAccess.getSlideContentAccess().getTextSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSlideContentAccess().getTextSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlideContent__TextAssignment_4"


    // $ANTLR start "rule__SlideContent__NoteAssignment_5_1"
    // InternalPptx.g:1128:1: rule__SlideContent__NoteAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__SlideContent__NoteAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPptx.g:1132:1: ( ( RULE_STRING ) )
            // InternalPptx.g:1133:2: ( RULE_STRING )
            {
            // InternalPptx.g:1133:2: ( RULE_STRING )
            // InternalPptx.g:1134:3: RULE_STRING
            {
             before(grammarAccess.getSlideContentAccess().getNoteSTRINGTerminalRuleCall_5_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSlideContentAccess().getNoteSTRINGTerminalRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlideContent__NoteAssignment_5_1"


    // $ANTLR start "rule__Presentation__NameAssignment_1"
    // InternalPptx.g:1143:1: rule__Presentation__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Presentation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPptx.g:1147:1: ( ( RULE_ID ) )
            // InternalPptx.g:1148:2: ( RULE_ID )
            {
            // InternalPptx.g:1148:2: ( RULE_ID )
            // InternalPptx.g:1149:3: RULE_ID
            {
             before(grammarAccess.getPresentationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPresentationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Presentation__NameAssignment_1"


    // $ANTLR start "rule__Presentation__ThemeAssignment_4"
    // InternalPptx.g:1158:1: rule__Presentation__ThemeAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Presentation__ThemeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPptx.g:1162:1: ( ( ( RULE_ID ) ) )
            // InternalPptx.g:1163:2: ( ( RULE_ID ) )
            {
            // InternalPptx.g:1163:2: ( ( RULE_ID ) )
            // InternalPptx.g:1164:3: ( RULE_ID )
            {
             before(grammarAccess.getPresentationAccess().getThemeThemeCrossReference_4_0()); 
            // InternalPptx.g:1165:3: ( RULE_ID )
            // InternalPptx.g:1166:4: RULE_ID
            {
             before(grammarAccess.getPresentationAccess().getThemeThemeIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPresentationAccess().getThemeThemeIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getPresentationAccess().getThemeThemeCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Presentation__ThemeAssignment_4"


    // $ANTLR start "rule__Presentation__SlidesAssignment_5_1"
    // InternalPptx.g:1177:1: rule__Presentation__SlidesAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__Presentation__SlidesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPptx.g:1181:1: ( ( ( RULE_ID ) ) )
            // InternalPptx.g:1182:2: ( ( RULE_ID ) )
            {
            // InternalPptx.g:1182:2: ( ( RULE_ID ) )
            // InternalPptx.g:1183:3: ( RULE_ID )
            {
             before(grammarAccess.getPresentationAccess().getSlidesSlideContentCrossReference_5_1_0()); 
            // InternalPptx.g:1184:3: ( RULE_ID )
            // InternalPptx.g:1185:4: RULE_ID
            {
             before(grammarAccess.getPresentationAccess().getSlidesSlideContentIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPresentationAccess().getSlidesSlideContentIDTerminalRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getPresentationAccess().getSlidesSlideContentCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Presentation__SlidesAssignment_5_1"


    // $ANTLR start "rule__Theme__NameAssignment_1"
    // InternalPptx.g:1196:1: rule__Theme__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Theme__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPptx.g:1200:1: ( ( RULE_ID ) )
            // InternalPptx.g:1201:2: ( RULE_ID )
            {
            // InternalPptx.g:1201:2: ( RULE_ID )
            // InternalPptx.g:1202:3: RULE_ID
            {
             before(grammarAccess.getThemeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getThemeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theme__NameAssignment_1"


    // $ANTLR start "rule__Theme__BackgroundAssignment_3_1"
    // InternalPptx.g:1211:1: rule__Theme__BackgroundAssignment_3_1 : ( ruleColor ) ;
    public final void rule__Theme__BackgroundAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPptx.g:1215:1: ( ( ruleColor ) )
            // InternalPptx.g:1216:2: ( ruleColor )
            {
            // InternalPptx.g:1216:2: ( ruleColor )
            // InternalPptx.g:1217:3: ruleColor
            {
             before(grammarAccess.getThemeAccess().getBackgroundColorEnumRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleColor();

            state._fsp--;

             after(grammarAccess.getThemeAccess().getBackgroundColorEnumRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theme__BackgroundAssignment_3_1"


    // $ANTLR start "rule__Theme__HeaderAssignment_4_1"
    // InternalPptx.g:1226:1: rule__Theme__HeaderAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Theme__HeaderAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPptx.g:1230:1: ( ( RULE_STRING ) )
            // InternalPptx.g:1231:2: ( RULE_STRING )
            {
            // InternalPptx.g:1231:2: ( RULE_STRING )
            // InternalPptx.g:1232:3: RULE_STRING
            {
             before(grammarAccess.getThemeAccess().getHeaderSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getThemeAccess().getHeaderSTRINGTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theme__HeaderAssignment_4_1"


    // $ANTLR start "rule__Theme__FooterAssignment_5_1"
    // InternalPptx.g:1241:1: rule__Theme__FooterAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__Theme__FooterAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPptx.g:1245:1: ( ( RULE_STRING ) )
            // InternalPptx.g:1246:2: ( RULE_STRING )
            {
            // InternalPptx.g:1246:2: ( RULE_STRING )
            // InternalPptx.g:1247:3: RULE_STRING
            {
             before(grammarAccess.getThemeAccess().getFooterSTRINGTerminalRuleCall_5_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getThemeAccess().getFooterSTRINGTerminalRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theme__FooterAssignment_5_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000000C2002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000E10000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000001800L});

}