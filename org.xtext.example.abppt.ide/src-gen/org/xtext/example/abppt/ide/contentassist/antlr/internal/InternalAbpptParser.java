package org.xtext.example.abppt.ide.contentassist.antlr.internal;

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
import org.xtext.example.abppt.services.AbpptGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAbpptParser extends AbstractInternalContentAssistParser {
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


        public InternalAbpptParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAbpptParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAbpptParser.tokenNames; }
    public String getGrammarFileName() { return "InternalAbppt.g"; }


    	private AbpptGrammarAccess grammarAccess;

    	public void setGrammarAccess(AbpptGrammarAccess grammarAccess) {
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
    // InternalAbppt.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalAbppt.g:54:1: ( ruleModel EOF )
            // InternalAbppt.g:55:1: ruleModel EOF
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
    // InternalAbppt.g:62:1: ruleModel : ( ( rule__Model__Alternatives )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbppt.g:66:2: ( ( ( rule__Model__Alternatives )* ) )
            // InternalAbppt.g:67:2: ( ( rule__Model__Alternatives )* )
            {
            // InternalAbppt.g:67:2: ( ( rule__Model__Alternatives )* )
            // InternalAbppt.g:68:3: ( rule__Model__Alternatives )*
            {
             before(grammarAccess.getModelAccess().getAlternatives()); 
            // InternalAbppt.g:69:3: ( rule__Model__Alternatives )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13||(LA1_0>=18 && LA1_0<=19)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalAbppt.g:69:4: rule__Model__Alternatives
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
    // InternalAbppt.g:78:1: entryRuleSlideContent : ruleSlideContent EOF ;
    public final void entryRuleSlideContent() throws RecognitionException {
        try {
            // InternalAbppt.g:79:1: ( ruleSlideContent EOF )
            // InternalAbppt.g:80:1: ruleSlideContent EOF
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
    // InternalAbppt.g:87:1: ruleSlideContent : ( ( rule__SlideContent__Group__0 ) ) ;
    public final void ruleSlideContent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbppt.g:91:2: ( ( ( rule__SlideContent__Group__0 ) ) )
            // InternalAbppt.g:92:2: ( ( rule__SlideContent__Group__0 ) )
            {
            // InternalAbppt.g:92:2: ( ( rule__SlideContent__Group__0 ) )
            // InternalAbppt.g:93:3: ( rule__SlideContent__Group__0 )
            {
             before(grammarAccess.getSlideContentAccess().getGroup()); 
            // InternalAbppt.g:94:3: ( rule__SlideContent__Group__0 )
            // InternalAbppt.g:94:4: rule__SlideContent__Group__0
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
    // InternalAbppt.g:103:1: entryRulePresentation : rulePresentation EOF ;
    public final void entryRulePresentation() throws RecognitionException {
        try {
            // InternalAbppt.g:104:1: ( rulePresentation EOF )
            // InternalAbppt.g:105:1: rulePresentation EOF
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
    // InternalAbppt.g:112:1: rulePresentation : ( ( rule__Presentation__Group__0 ) ) ;
    public final void rulePresentation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbppt.g:116:2: ( ( ( rule__Presentation__Group__0 ) ) )
            // InternalAbppt.g:117:2: ( ( rule__Presentation__Group__0 ) )
            {
            // InternalAbppt.g:117:2: ( ( rule__Presentation__Group__0 ) )
            // InternalAbppt.g:118:3: ( rule__Presentation__Group__0 )
            {
             before(grammarAccess.getPresentationAccess().getGroup()); 
            // InternalAbppt.g:119:3: ( rule__Presentation__Group__0 )
            // InternalAbppt.g:119:4: rule__Presentation__Group__0
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
    // InternalAbppt.g:128:1: entryRuleTheme : ruleTheme EOF ;
    public final void entryRuleTheme() throws RecognitionException {
        try {
            // InternalAbppt.g:129:1: ( ruleTheme EOF )
            // InternalAbppt.g:130:1: ruleTheme EOF
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
    // InternalAbppt.g:137:1: ruleTheme : ( ( rule__Theme__Group__0 ) ) ;
    public final void ruleTheme() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbppt.g:141:2: ( ( ( rule__Theme__Group__0 ) ) )
            // InternalAbppt.g:142:2: ( ( rule__Theme__Group__0 ) )
            {
            // InternalAbppt.g:142:2: ( ( rule__Theme__Group__0 ) )
            // InternalAbppt.g:143:3: ( rule__Theme__Group__0 )
            {
             before(grammarAccess.getThemeAccess().getGroup()); 
            // InternalAbppt.g:144:3: ( rule__Theme__Group__0 )
            // InternalAbppt.g:144:4: rule__Theme__Group__0
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
    // InternalAbppt.g:153:1: ruleColor : ( ( rule__Color__Alternatives ) ) ;
    public final void ruleColor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbppt.g:157:1: ( ( ( rule__Color__Alternatives ) ) )
            // InternalAbppt.g:158:2: ( ( rule__Color__Alternatives ) )
            {
            // InternalAbppt.g:158:2: ( ( rule__Color__Alternatives ) )
            // InternalAbppt.g:159:3: ( rule__Color__Alternatives )
            {
             before(grammarAccess.getColorAccess().getAlternatives()); 
            // InternalAbppt.g:160:3: ( rule__Color__Alternatives )
            // InternalAbppt.g:160:4: rule__Color__Alternatives
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
    // InternalAbppt.g:168:1: rule__Model__Alternatives : ( ( ( rule__Model__ContentsAssignment_0 ) ) | ( ( rule__Model__PresentationsAssignment_1 ) ) | ( ( rule__Model__ThemesAssignment_2 ) ) );
    public final void rule__Model__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbppt.g:172:1: ( ( ( rule__Model__ContentsAssignment_0 ) ) | ( ( rule__Model__PresentationsAssignment_1 ) ) | ( ( rule__Model__ThemesAssignment_2 ) ) )
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
                    // InternalAbppt.g:173:2: ( ( rule__Model__ContentsAssignment_0 ) )
                    {
                    // InternalAbppt.g:173:2: ( ( rule__Model__ContentsAssignment_0 ) )
                    // InternalAbppt.g:174:3: ( rule__Model__ContentsAssignment_0 )
                    {
                     before(grammarAccess.getModelAccess().getContentsAssignment_0()); 
                    // InternalAbppt.g:175:3: ( rule__Model__ContentsAssignment_0 )
                    // InternalAbppt.g:175:4: rule__Model__ContentsAssignment_0
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
                    // InternalAbppt.g:179:2: ( ( rule__Model__PresentationsAssignment_1 ) )
                    {
                    // InternalAbppt.g:179:2: ( ( rule__Model__PresentationsAssignment_1 ) )
                    // InternalAbppt.g:180:3: ( rule__Model__PresentationsAssignment_1 )
                    {
                     before(grammarAccess.getModelAccess().getPresentationsAssignment_1()); 
                    // InternalAbppt.g:181:3: ( rule__Model__PresentationsAssignment_1 )
                    // InternalAbppt.g:181:4: rule__Model__PresentationsAssignment_1
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
                    // InternalAbppt.g:185:2: ( ( rule__Model__ThemesAssignment_2 ) )
                    {
                    // InternalAbppt.g:185:2: ( ( rule__Model__ThemesAssignment_2 ) )
                    // InternalAbppt.g:186:3: ( rule__Model__ThemesAssignment_2 )
                    {
                     before(grammarAccess.getModelAccess().getThemesAssignment_2()); 
                    // InternalAbppt.g:187:3: ( rule__Model__ThemesAssignment_2 )
                    // InternalAbppt.g:187:4: rule__Model__ThemesAssignment_2
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
    // InternalAbppt.g:195:1: rule__Color__Alternatives : ( ( ( 'white' ) ) | ( ( 'grey' ) ) );
    public final void rule__Color__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbppt.g:199:1: ( ( ( 'white' ) ) | ( ( 'grey' ) ) )
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
                    // InternalAbppt.g:200:2: ( ( 'white' ) )
                    {
                    // InternalAbppt.g:200:2: ( ( 'white' ) )
                    // InternalAbppt.g:201:3: ( 'white' )
                    {
                     before(grammarAccess.getColorAccess().getWHITEEnumLiteralDeclaration_0()); 
                    // InternalAbppt.g:202:3: ( 'white' )
                    // InternalAbppt.g:202:4: 'white'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorAccess().getWHITEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAbppt.g:206:2: ( ( 'grey' ) )
                    {
                    // InternalAbppt.g:206:2: ( ( 'grey' ) )
                    // InternalAbppt.g:207:3: ( 'grey' )
                    {
                     before(grammarAccess.getColorAccess().getGREYEnumLiteralDeclaration_1()); 
                    // InternalAbppt.g:208:3: ( 'grey' )
                    // InternalAbppt.g:208:4: 'grey'
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
    // InternalAbppt.g:216:1: rule__SlideContent__Group__0 : rule__SlideContent__Group__0__Impl rule__SlideContent__Group__1 ;
    public final void rule__SlideContent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbppt.g:220:1: ( rule__SlideContent__Group__0__Impl rule__SlideContent__Group__1 )
            // InternalAbppt.g:221:2: rule__SlideContent__Group__0__Impl rule__SlideContent__Group__1
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
    // InternalAbppt.g:228:1: rule__SlideContent__Group__0__Impl : ( 'content' ) ;
    public final void rule__SlideContent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbppt.g:232:1: ( ( 'content' ) )
            // InternalAbppt.g:233:1: ( 'content' )
            {
            // InternalAbppt.g:233:1: ( 'content' )
            // InternalAbppt.g:234:2: 'content'
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
    // InternalAbppt.g:243:1: rule__SlideContent__Group__1 : rule__SlideContent__Group__1__Impl rule__SlideContent__Group__2 ;
    public final void rule__SlideContent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbppt.g:247:1: ( rule__SlideContent__Group__1__Impl rule__SlideContent__Group__2 )
            // InternalAbppt.g:248:2: rule__SlideContent__Group__1__Impl rule__SlideContent__Group__2
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
    // InternalAbppt.g:255:1: rule__SlideContent__Group__1__Impl : ( ( rule__SlideContent__NameAssignment_1 ) ) ;
    public final void rule__SlideContent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbppt.g:259:1: ( ( ( rule__SlideContent__NameAssignment_1 ) ) )
            // InternalAbppt.g:260:1: ( ( rule__SlideContent__NameAssignment_1 ) )
            {
            // InternalAbppt.g:260:1: ( ( rule__SlideContent__NameAssignment_1 ) )
            // InternalAbppt.g:261:2: ( rule__SlideContent__NameAssignment_1 )
            {
             before(grammarAccess.getSlideContentAccess().getNameAssignment_1()); 
            // InternalAbppt.g:262:2: ( rule__SlideContent__NameAssignment_1 )
            // InternalAbppt.g:262:3: rule__SlideContent__NameAssignment_1
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
    // InternalAbppt.g:270:1: rule__SlideContent__Group__2 : rule__SlideContent__Group__2__Impl rule__SlideContent__Group__3 ;
    public final void rule__SlideContent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbppt.g:274:1: ( rule__SlideContent__Group__2__Impl rule__SlideContent__Group__3 )
            // InternalAbppt.g:275:2: rule__SlideContent__Group__2__Impl rule__SlideContent__Group__3
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
    // InternalAbppt.g:282:1: rule__SlideContent__Group__2__Impl : ( '{' ) ;
    public final void rule__SlideContent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbppt.g:286:1: ( ( '{' ) )
            // InternalAbppt.g:287:1: ( '{' )
            {
            // InternalAbppt.g:287:1: ( '{' )
            // InternalAbppt.g:288:2: '{'
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
    // InternalAbppt.g:297:1: rule__SlideContent__Group__3 : rule__SlideContent__Group__3__Impl rule__SlideContent__Group__4 ;
    public final void rule__SlideContent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbppt.g:301:1: ( rule__SlideContent__Group__3__Impl rule__SlideContent__Group__4 )
            // InternalAbppt.g:302:2: rule__SlideContent__Group__3__Impl rule__SlideContent__Group__4
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
    // InternalAbppt.g:309:1: rule__SlideContent__Group__3__Impl : ( 'text' ) ;
    public final void rule__SlideContent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbppt.g:313:1: ( ( 'text' ) )
            // InternalAbppt.g:314:1: ( 'text' )
            {
            // InternalAbppt.g:314:1: ( 'text' )
            // InternalAbppt.g:315:2: 'text'
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
    // InternalAbppt.g:324:1: rule__SlideContent__Group__4 : rule__SlideContent__Group__4__Impl rule__SlideContent__Group__5 ;
    public final void rule__SlideContent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbppt.g:328:1: ( rule__SlideContent__Group__4__Impl rule__SlideContent__Group__5 )
            // InternalAbppt.g:329:2: rule__SlideContent__Group__4__Impl rule__SlideContent__Group__5
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
    // InternalAbppt.g:336:1: rule__SlideContent__Group__4__Impl : ( ( rule__SlideContent__TextAssignment_4 ) ) ;
    public final void rule__SlideContent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbppt.g:340:1: ( ( ( rule__SlideContent__TextAssignment_4 ) ) )
            // InternalAbppt.g:341:1: ( ( rule__SlideContent__TextAssignment_4 ) )
            {
            // InternalAbppt.g:341:1: ( ( rule__SlideContent__TextAssignment_4 ) )
            // InternalAbppt.g:342:2: ( rule__SlideContent__TextAssignment_4 )
            {
             before(grammarAccess.getSlideContentAccess().getTextAssignment_4()); 
            // InternalAbppt.g:343:2: ( rule__SlideContent__TextAssignment_4 )
            // InternalAbppt.g:343:3: rule__SlideContent__TextAssignment_4
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
    // InternalAbppt.g:351:1: rule__SlideContent__Group__5 : rule__SlideContent__Group__5__Impl rule__SlideContent__Group__6 ;
    public final void rule__SlideContent__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbppt.g:355:1: ( rule__SlideContent__Group__5__Impl rule__SlideContent__Group__6 )
            // InternalAbppt.g:356:2: rule__SlideContent__Group__5__Impl rule__SlideContent__Group__6
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
    // InternalAbppt.g:363:1: rule__SlideContent__Group__5__Impl : ( ( rule__SlideContent__Group_5__0 )? ) ;
    public final void rule__SlideContent__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbppt.g:367:1: ( ( ( rule__SlideContent__Group_5__0 )? ) )
            // InternalAbppt.g:368:1: ( ( rule__SlideContent__Group_5__0 )? )
            {
            // InternalAbppt.g:368:1: ( ( rule__SlideContent__Group_5__0 )? )
            // InternalAbppt.g:369:2: ( rule__SlideContent__Group_5__0 )?
            {
             before(grammarAccess.getSlideContentAccess().getGroup_5()); 
            // InternalAbppt.g:370:2: ( rule__SlideContent__Group_5__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalAbppt.g:370:3: rule__SlideContent__Group_5__0
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
    // InternalAbppt.g:378:1: rule__SlideContent__Group__6 : rule__SlideContent__Group__6__Impl ;
    public final void rule__SlideContent__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbppt.g:382:1: ( rule__SlideContent__Group__6__Impl )
            // InternalAbppt.g:383:2: rule__SlideContent__Group__6__Impl
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
    // InternalAbppt.g:389:1: rule__SlideContent__Group__6__Impl : ( '}' ) ;
    public final void rule__SlideContent__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbppt.g:393:1: ( ( '}' ) )
            // InternalAbppt.g:394:1: ( '}' )
            {
            // InternalAbppt.g:394:1: ( '}' )
            // InternalAbppt.g:395:2: '}'
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
    // InternalAbppt.g:405:1: rule__SlideContent__Group_5__0 : rule__SlideContent__Group_5__0__Impl rule__SlideContent__Group_5__1 ;
    public final void rule__SlideContent__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbppt.g:409:1: ( rule__SlideContent__Group_5__0__Impl rule__SlideContent__Group_5__1 )
            // InternalAbppt.g:410:2: rule__SlideContent__Group_5__0__Impl rule__SlideContent__Group_5__1
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
    // InternalAbppt.g:417:1: rule__SlideContent__Group_5__0__Impl : ( 'note' ) ;
    public final void rule__SlideContent__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbppt.g:421:1: ( ( 'note' ) )
            // InternalAbppt.g:422:1: ( 'note' )
            {
            // InternalAbppt.g:422:1: ( 'note' )
            // InternalAbppt.g:423:2: 'note'
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
    // InternalAbppt.g:432:1: rule__SlideContent__Group_5__1 : rule__SlideContent__Group_5__1__Impl ;
    public final void rule__SlideContent__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbppt.g:436:1: ( rule__SlideContent__Group_5__1__Impl )
            // InternalAbppt.g:437:2: rule__SlideContent__Group_5__1__Impl
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
    // InternalAbppt.g:443:1: rule__SlideContent__Group_5__1__Impl : ( ( rule__SlideContent__NoteAssignment_5_1 ) ) ;
    public final void rule__SlideContent__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbppt.g:447:1: ( ( ( rule__SlideContent__NoteAssignment_5_1 ) ) )
            // InternalAbppt.g:448:1: ( ( rule__SlideContent__NoteAssignment_5_1 ) )
            {
            // InternalAbppt.g:448:1: ( ( rule__SlideContent__NoteAssignment_5_1 ) )
            // InternalAbppt.g:449:2: ( rule__SlideContent__NoteAssignment_5_1 )
            {
             before(grammarAccess.getSlideContentAccess().getNoteAssignment_5_1()); 
            // InternalAbppt.g:450:2: ( rule__SlideContent__NoteAssignment_5_1 )
            // InternalAbppt.g:450:3: rule__SlideContent__NoteAssignment_5_1
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
    // InternalAbppt.g:459:1: rule__Presentation__Group__0 : rule__Presentation__Group__0__Impl rule__Presentation__Group__1 ;
    public final void rule__Presentation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbppt.g:463:1: ( rule__Presentation__Group__0__Impl rule__Presentation__Group__1 )
            // InternalAbppt.g:464:2: rule__Presentation__Group__0__Impl rule__Presentation__Group__1
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
    // InternalAbppt.g:471:1: rule__Presentation__Group__0__Impl : ( 'presentation' ) ;
    public final void rule__Presentation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbppt.g:475:1: ( ( 'presentation' ) )
            // InternalAbppt.g:476:1: ( 'presentation' )
            {
            // InternalAbppt.g:476:1: ( 'presentation' )
            // InternalAbppt.g:477:2: 'presentation'
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
    // InternalAbppt.g:486:1: rule__Presentation__Group__1 : rule__Presentation__Group__1__Impl rule__Presentation__Group__2 ;
    public final void rule__Presentation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbppt.g:490:1: ( rule__Presentation__Group__1__Impl rule__Presentation__Group__2 )
            // InternalAbppt.g:491:2: rule__Presentation__Group__1__Impl rule__Presentation__Group__2
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
    // InternalAbppt.g:498:1: rule__Presentation__Group__1__Impl : ( ( rule__Presentation__NameAssignment_1 ) ) ;
    public final void rule__Presentation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbppt.g:502:1: ( ( ( rule__Presentation__NameAssignment_1 ) ) )
            // InternalAbppt.g:503:1: ( ( rule__Presentation__NameAssignment_1 ) )
            {
            // InternalAbppt.g:503:1: ( ( rule__Presentation__NameAssignment_1 ) )
            // InternalAbppt.g:504:2: ( rule__Presentation__NameAssignment_1 )
            {
             before(grammarAccess.getPresentationAccess().getNameAssignment_1()); 
            // InternalAbppt.g:505:2: ( rule__Presentation__NameAssignment_1 )
            // InternalAbppt.g:505:3: rule__Presentation__NameAssignment_1
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
    // InternalAbppt.g:513:1: rule__Presentation__Group__2 : rule__Presentation__Group__2__Impl rule__Presentation__Group__3 ;
    public final void rule__Presentation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbppt.g:517:1: ( rule__Presentation__Group__2__Impl rule__Presentation__Group__3 )
            // InternalAbppt.g:518:2: rule__Presentation__Group__2__Impl rule__Presentation__Group__3
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
    // InternalAbppt.g:525:1: rule__Presentation__Group__2__Impl : ( '{' ) ;
    public final void rule__Presentation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbppt.g:529:1: ( ( '{' ) )
            // InternalAbppt.g:530:1: ( '{' )
            {
            // InternalAbppt.g:530:1: ( '{' )
            // InternalAbppt.g:531:2: '{'
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
    // InternalAbppt.g:540:1: rule__Presentation__Group__3 : rule__Presentation__Group__3__Impl rule__Presentation__Group__4 ;
    public final void rule__Presentation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbppt.g:544:1: ( rule__Presentation__Group__3__Impl rule__Presentation__Group__4 )
            // InternalAbppt.g:545:2: rule__Presentation__Group__3__Impl rule__Presentation__Group__4
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
    // InternalAbppt.g:552:1: rule__Presentation__Group__3__Impl : ( 'theme' ) ;
    public final void rule__Presentation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbppt.g:556:1: ( ( 'theme' ) )
            // InternalAbppt.g:557:1: ( 'theme' )
            {
            // InternalAbppt.g:557:1: ( 'theme' )
            // InternalAbppt.g:558:2: 'theme'
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
    // InternalAbppt.g:567:1: rule__Presentation__Group__4 : rule__Presentation__Group__4__Impl rule__Presentation__Group__5 ;
    public final void rule__Presentation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbppt.g:571:1: ( rule__Presentation__Group__4__Impl rule__Presentation__Group__5 )
            // InternalAbppt.g:572:2: rule__Presentation__Group__4__Impl rule__Presentation__Group__5
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
    // InternalAbppt.g:579:1: rule__Presentation__Group__4__Impl : ( ( rule__Presentation__ThemeAssignment_4 ) ) ;
    public final void rule__Presentation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbppt.g:583:1: ( ( ( rule__Presentation__ThemeAssignment_4 ) ) )
            // InternalAbppt.g:584:1: ( ( rule__Presentation__ThemeAssignment_4 ) )
            {
            // InternalAbppt.g:584:1: ( ( rule__Presentation__ThemeAssignment_4 ) )
            // InternalAbppt.g:585:2: ( rule__Presentation__ThemeAssignment_4 )
            {
             before(grammarAccess.getPresentationAccess().getThemeAssignment_4()); 
            // InternalAbppt.g:586:2: ( rule__Presentation__ThemeAssignment_4 )
            // InternalAbppt.g:586:3: rule__Presentation__ThemeAssignment_4
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
    // InternalAbppt.g:594:1: rule__Presentation__Group__5 : rule__Presentation__Group__5__Impl rule__Presentation__Group__6 ;
    public final void rule__Presentation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbppt.g:598:1: ( rule__Presentation__Group__5__Impl rule__Presentation__Group__6 )
            // InternalAbppt.g:599:2: rule__Presentation__Group__5__Impl rule__Presentation__Group__6
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
    // InternalAbppt.g:606:1: rule__Presentation__Group__5__Impl : ( ( rule__Presentation__Group_5__0 )* ) ;
    public final void rule__Presentation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbppt.g:610:1: ( ( ( rule__Presentation__Group_5__0 )* ) )
            // InternalAbppt.g:611:1: ( ( rule__Presentation__Group_5__0 )* )
            {
            // InternalAbppt.g:611:1: ( ( rule__Presentation__Group_5__0 )* )
            // InternalAbppt.g:612:2: ( rule__Presentation__Group_5__0 )*
            {
             before(grammarAccess.getPresentationAccess().getGroup_5()); 
            // InternalAbppt.g:613:2: ( rule__Presentation__Group_5__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==20) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalAbppt.g:613:3: rule__Presentation__Group_5__0
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
    // InternalAbppt.g:621:1: rule__Presentation__Group__6 : rule__Presentation__Group__6__Impl ;
    public final void rule__Presentation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbppt.g:625:1: ( rule__Presentation__Group__6__Impl )
            // InternalAbppt.g:626:2: rule__Presentation__Group__6__Impl
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
    // InternalAbppt.g:632:1: rule__Presentation__Group__6__Impl : ( '}' ) ;
    public final void rule__Presentation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbppt.g:636:1: ( ( '}' ) )
            // InternalAbppt.g:637:1: ( '}' )
            {
            // InternalAbppt.g:637:1: ( '}' )
            // InternalAbppt.g:638:2: '}'
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
    // InternalAbppt.g:648:1: rule__Presentation__Group_5__0 : rule__Presentation__Group_5__0__Impl rule__Presentation__Group_5__1 ;
    public final void rule__Presentation__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbppt.g:652:1: ( rule__Presentation__Group_5__0__Impl rule__Presentation__Group_5__1 )
            // InternalAbppt.g:653:2: rule__Presentation__Group_5__0__Impl rule__Presentation__Group_5__1
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
    // InternalAbppt.g:660:1: rule__Presentation__Group_5__0__Impl : ( 'slide' ) ;
    public final void rule__Presentation__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbppt.g:664:1: ( ( 'slide' ) )
            // InternalAbppt.g:665:1: ( 'slide' )
            {
            // InternalAbppt.g:665:1: ( 'slide' )
            // InternalAbppt.g:666:2: 'slide'
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
    // InternalAbppt.g:675:1: rule__Presentation__Group_5__1 : rule__Presentation__Group_5__1__Impl ;
    public final void rule__Presentation__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbppt.g:679:1: ( rule__Presentation__Group_5__1__Impl )
            // InternalAbppt.g:680:2: rule__Presentation__Group_5__1__Impl
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
    // InternalAbppt.g:686:1: rule__Presentation__Group_5__1__Impl : ( ( rule__Presentation__SlidesAssignment_5_1 ) ) ;
    public final void rule__Presentation__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbppt.g:690:1: ( ( ( rule__Presentation__SlidesAssignment_5_1 ) ) )
            // InternalAbppt.g:691:1: ( ( rule__Presentation__SlidesAssignment_5_1 ) )
            {
            // InternalAbppt.g:691:1: ( ( rule__Presentation__SlidesAssignment_5_1 ) )
            // InternalAbppt.g:692:2: ( rule__Presentation__SlidesAssignment_5_1 )
            {
             before(grammarAccess.getPresentationAccess().getSlidesAssignment_5_1()); 
            // InternalAbppt.g:693:2: ( rule__Presentation__SlidesAssignment_5_1 )
            // InternalAbppt.g:693:3: rule__Presentation__SlidesAssignment_5_1
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
    // InternalAbppt.g:702:1: rule__Theme__Group__0 : rule__Theme__Group__0__Impl rule__Theme__Group__1 ;
    public final void rule__Theme__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbppt.g:706:1: ( rule__Theme__Group__0__Impl rule__Theme__Group__1 )
            // InternalAbppt.g:707:2: rule__Theme__Group__0__Impl rule__Theme__Group__1
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
    // InternalAbppt.g:714:1: rule__Theme__Group__0__Impl : ( 'theme' ) ;
    public final void rule__Theme__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbppt.g:718:1: ( ( 'theme' ) )
            // InternalAbppt.g:719:1: ( 'theme' )
            {
            // InternalAbppt.g:719:1: ( 'theme' )
            // InternalAbppt.g:720:2: 'theme'
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
    // InternalAbppt.g:729:1: rule__Theme__Group__1 : rule__Theme__Group__1__Impl rule__Theme__Group__2 ;
    public final void rule__Theme__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbppt.g:733:1: ( rule__Theme__Group__1__Impl rule__Theme__Group__2 )
            // InternalAbppt.g:734:2: rule__Theme__Group__1__Impl rule__Theme__Group__2
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
    // InternalAbppt.g:741:1: rule__Theme__Group__1__Impl : ( ( rule__Theme__NameAssignment_1 ) ) ;
    public final void rule__Theme__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbppt.g:745:1: ( ( ( rule__Theme__NameAssignment_1 ) ) )
            // InternalAbppt.g:746:1: ( ( rule__Theme__NameAssignment_1 ) )
            {
            // InternalAbppt.g:746:1: ( ( rule__Theme__NameAssignment_1 ) )
            // InternalAbppt.g:747:2: ( rule__Theme__NameAssignment_1 )
            {
             before(grammarAccess.getThemeAccess().getNameAssignment_1()); 
            // InternalAbppt.g:748:2: ( rule__Theme__NameAssignment_1 )
            // InternalAbppt.g:748:3: rule__Theme__NameAssignment_1
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
    // InternalAbppt.g:756:1: rule__Theme__Group__2 : rule__Theme__Group__2__Impl rule__Theme__Group__3 ;
    public final void rule__Theme__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbppt.g:760:1: ( rule__Theme__Group__2__Impl rule__Theme__Group__3 )
            // InternalAbppt.g:761:2: rule__Theme__Group__2__Impl rule__Theme__Group__3
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
    // InternalAbppt.g:768:1: rule__Theme__Group__2__Impl : ( '{' ) ;
    public final void rule__Theme__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbppt.g:772:1: ( ( '{' ) )
            // InternalAbppt.g:773:1: ( '{' )
            {
            // InternalAbppt.g:773:1: ( '{' )
            // InternalAbppt.g:774:2: '{'
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
    // InternalAbppt.g:783:1: rule__Theme__Group__3 : rule__Theme__Group__3__Impl rule__Theme__Group__4 ;
    public final void rule__Theme__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbppt.g:787:1: ( rule__Theme__Group__3__Impl rule__Theme__Group__4 )
            // InternalAbppt.g:788:2: rule__Theme__Group__3__Impl rule__Theme__Group__4
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
    // InternalAbppt.g:795:1: rule__Theme__Group__3__Impl : ( ( rule__Theme__Group_3__0 )? ) ;
    public final void rule__Theme__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbppt.g:799:1: ( ( ( rule__Theme__Group_3__0 )? ) )
            // InternalAbppt.g:800:1: ( ( rule__Theme__Group_3__0 )? )
            {
            // InternalAbppt.g:800:1: ( ( rule__Theme__Group_3__0 )? )
            // InternalAbppt.g:801:2: ( rule__Theme__Group_3__0 )?
            {
             before(grammarAccess.getThemeAccess().getGroup_3()); 
            // InternalAbppt.g:802:2: ( rule__Theme__Group_3__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalAbppt.g:802:3: rule__Theme__Group_3__0
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
    // InternalAbppt.g:810:1: rule__Theme__Group__4 : rule__Theme__Group__4__Impl rule__Theme__Group__5 ;
    public final void rule__Theme__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbppt.g:814:1: ( rule__Theme__Group__4__Impl rule__Theme__Group__5 )
            // InternalAbppt.g:815:2: rule__Theme__Group__4__Impl rule__Theme__Group__5
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
    // InternalAbppt.g:822:1: rule__Theme__Group__4__Impl : ( ( rule__Theme__Group_4__0 )? ) ;
    public final void rule__Theme__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbppt.g:826:1: ( ( ( rule__Theme__Group_4__0 )? ) )
            // InternalAbppt.g:827:1: ( ( rule__Theme__Group_4__0 )? )
            {
            // InternalAbppt.g:827:1: ( ( rule__Theme__Group_4__0 )? )
            // InternalAbppt.g:828:2: ( rule__Theme__Group_4__0 )?
            {
             before(grammarAccess.getThemeAccess().getGroup_4()); 
            // InternalAbppt.g:829:2: ( rule__Theme__Group_4__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalAbppt.g:829:3: rule__Theme__Group_4__0
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
    // InternalAbppt.g:837:1: rule__Theme__Group__5 : rule__Theme__Group__5__Impl rule__Theme__Group__6 ;
    public final void rule__Theme__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbppt.g:841:1: ( rule__Theme__Group__5__Impl rule__Theme__Group__6 )
            // InternalAbppt.g:842:2: rule__Theme__Group__5__Impl rule__Theme__Group__6
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
    // InternalAbppt.g:849:1: rule__Theme__Group__5__Impl : ( ( rule__Theme__Group_5__0 )? ) ;
    public final void rule__Theme__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbppt.g:853:1: ( ( ( rule__Theme__Group_5__0 )? ) )
            // InternalAbppt.g:854:1: ( ( rule__Theme__Group_5__0 )? )
            {
            // InternalAbppt.g:854:1: ( ( rule__Theme__Group_5__0 )? )
            // InternalAbppt.g:855:2: ( rule__Theme__Group_5__0 )?
            {
             before(grammarAccess.getThemeAccess().getGroup_5()); 
            // InternalAbppt.g:856:2: ( rule__Theme__Group_5__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalAbppt.g:856:3: rule__Theme__Group_5__0
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
    // InternalAbppt.g:864:1: rule__Theme__Group__6 : rule__Theme__Group__6__Impl ;
    public final void rule__Theme__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbppt.g:868:1: ( rule__Theme__Group__6__Impl )
            // InternalAbppt.g:869:2: rule__Theme__Group__6__Impl
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
    // InternalAbppt.g:875:1: rule__Theme__Group__6__Impl : ( '}' ) ;
    public final void rule__Theme__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbppt.g:879:1: ( ( '}' ) )
            // InternalAbppt.g:880:1: ( '}' )
            {
            // InternalAbppt.g:880:1: ( '}' )
            // InternalAbppt.g:881:2: '}'
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
    // InternalAbppt.g:891:1: rule__Theme__Group_3__0 : rule__Theme__Group_3__0__Impl rule__Theme__Group_3__1 ;
    public final void rule__Theme__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbppt.g:895:1: ( rule__Theme__Group_3__0__Impl rule__Theme__Group_3__1 )
            // InternalAbppt.g:896:2: rule__Theme__Group_3__0__Impl rule__Theme__Group_3__1
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
    // InternalAbppt.g:903:1: rule__Theme__Group_3__0__Impl : ( 'background' ) ;
    public final void rule__Theme__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbppt.g:907:1: ( ( 'background' ) )
            // InternalAbppt.g:908:1: ( 'background' )
            {
            // InternalAbppt.g:908:1: ( 'background' )
            // InternalAbppt.g:909:2: 'background'
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
    // InternalAbppt.g:918:1: rule__Theme__Group_3__1 : rule__Theme__Group_3__1__Impl ;
    public final void rule__Theme__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbppt.g:922:1: ( rule__Theme__Group_3__1__Impl )
            // InternalAbppt.g:923:2: rule__Theme__Group_3__1__Impl
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
    // InternalAbppt.g:929:1: rule__Theme__Group_3__1__Impl : ( ( rule__Theme__BackgroundAssignment_3_1 ) ) ;
    public final void rule__Theme__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbppt.g:933:1: ( ( ( rule__Theme__BackgroundAssignment_3_1 ) ) )
            // InternalAbppt.g:934:1: ( ( rule__Theme__BackgroundAssignment_3_1 ) )
            {
            // InternalAbppt.g:934:1: ( ( rule__Theme__BackgroundAssignment_3_1 ) )
            // InternalAbppt.g:935:2: ( rule__Theme__BackgroundAssignment_3_1 )
            {
             before(grammarAccess.getThemeAccess().getBackgroundAssignment_3_1()); 
            // InternalAbppt.g:936:2: ( rule__Theme__BackgroundAssignment_3_1 )
            // InternalAbppt.g:936:3: rule__Theme__BackgroundAssignment_3_1
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
    // InternalAbppt.g:945:1: rule__Theme__Group_4__0 : rule__Theme__Group_4__0__Impl rule__Theme__Group_4__1 ;
    public final void rule__Theme__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbppt.g:949:1: ( rule__Theme__Group_4__0__Impl rule__Theme__Group_4__1 )
            // InternalAbppt.g:950:2: rule__Theme__Group_4__0__Impl rule__Theme__Group_4__1
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
    // InternalAbppt.g:957:1: rule__Theme__Group_4__0__Impl : ( 'header' ) ;
    public final void rule__Theme__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbppt.g:961:1: ( ( 'header' ) )
            // InternalAbppt.g:962:1: ( 'header' )
            {
            // InternalAbppt.g:962:1: ( 'header' )
            // InternalAbppt.g:963:2: 'header'
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
    // InternalAbppt.g:972:1: rule__Theme__Group_4__1 : rule__Theme__Group_4__1__Impl ;
    public final void rule__Theme__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbppt.g:976:1: ( rule__Theme__Group_4__1__Impl )
            // InternalAbppt.g:977:2: rule__Theme__Group_4__1__Impl
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
    // InternalAbppt.g:983:1: rule__Theme__Group_4__1__Impl : ( ( rule__Theme__HeaderAssignment_4_1 ) ) ;
    public final void rule__Theme__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbppt.g:987:1: ( ( ( rule__Theme__HeaderAssignment_4_1 ) ) )
            // InternalAbppt.g:988:1: ( ( rule__Theme__HeaderAssignment_4_1 ) )
            {
            // InternalAbppt.g:988:1: ( ( rule__Theme__HeaderAssignment_4_1 ) )
            // InternalAbppt.g:989:2: ( rule__Theme__HeaderAssignment_4_1 )
            {
             before(grammarAccess.getThemeAccess().getHeaderAssignment_4_1()); 
            // InternalAbppt.g:990:2: ( rule__Theme__HeaderAssignment_4_1 )
            // InternalAbppt.g:990:3: rule__Theme__HeaderAssignment_4_1
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
    // InternalAbppt.g:999:1: rule__Theme__Group_5__0 : rule__Theme__Group_5__0__Impl rule__Theme__Group_5__1 ;
    public final void rule__Theme__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbppt.g:1003:1: ( rule__Theme__Group_5__0__Impl rule__Theme__Group_5__1 )
            // InternalAbppt.g:1004:2: rule__Theme__Group_5__0__Impl rule__Theme__Group_5__1
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
    // InternalAbppt.g:1011:1: rule__Theme__Group_5__0__Impl : ( 'footer' ) ;
    public final void rule__Theme__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbppt.g:1015:1: ( ( 'footer' ) )
            // InternalAbppt.g:1016:1: ( 'footer' )
            {
            // InternalAbppt.g:1016:1: ( 'footer' )
            // InternalAbppt.g:1017:2: 'footer'
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
    // InternalAbppt.g:1026:1: rule__Theme__Group_5__1 : rule__Theme__Group_5__1__Impl ;
    public final void rule__Theme__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbppt.g:1030:1: ( rule__Theme__Group_5__1__Impl )
            // InternalAbppt.g:1031:2: rule__Theme__Group_5__1__Impl
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
    // InternalAbppt.g:1037:1: rule__Theme__Group_5__1__Impl : ( ( rule__Theme__FooterAssignment_5_1 ) ) ;
    public final void rule__Theme__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbppt.g:1041:1: ( ( ( rule__Theme__FooterAssignment_5_1 ) ) )
            // InternalAbppt.g:1042:1: ( ( rule__Theme__FooterAssignment_5_1 ) )
            {
            // InternalAbppt.g:1042:1: ( ( rule__Theme__FooterAssignment_5_1 ) )
            // InternalAbppt.g:1043:2: ( rule__Theme__FooterAssignment_5_1 )
            {
             before(grammarAccess.getThemeAccess().getFooterAssignment_5_1()); 
            // InternalAbppt.g:1044:2: ( rule__Theme__FooterAssignment_5_1 )
            // InternalAbppt.g:1044:3: rule__Theme__FooterAssignment_5_1
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
    // InternalAbppt.g:1053:1: rule__Model__ContentsAssignment_0 : ( ruleSlideContent ) ;
    public final void rule__Model__ContentsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbppt.g:1057:1: ( ( ruleSlideContent ) )
            // InternalAbppt.g:1058:2: ( ruleSlideContent )
            {
            // InternalAbppt.g:1058:2: ( ruleSlideContent )
            // InternalAbppt.g:1059:3: ruleSlideContent
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
    // InternalAbppt.g:1068:1: rule__Model__PresentationsAssignment_1 : ( rulePresentation ) ;
    public final void rule__Model__PresentationsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbppt.g:1072:1: ( ( rulePresentation ) )
            // InternalAbppt.g:1073:2: ( rulePresentation )
            {
            // InternalAbppt.g:1073:2: ( rulePresentation )
            // InternalAbppt.g:1074:3: rulePresentation
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
    // InternalAbppt.g:1083:1: rule__Model__ThemesAssignment_2 : ( ruleTheme ) ;
    public final void rule__Model__ThemesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbppt.g:1087:1: ( ( ruleTheme ) )
            // InternalAbppt.g:1088:2: ( ruleTheme )
            {
            // InternalAbppt.g:1088:2: ( ruleTheme )
            // InternalAbppt.g:1089:3: ruleTheme
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
    // InternalAbppt.g:1098:1: rule__SlideContent__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SlideContent__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbppt.g:1102:1: ( ( RULE_ID ) )
            // InternalAbppt.g:1103:2: ( RULE_ID )
            {
            // InternalAbppt.g:1103:2: ( RULE_ID )
            // InternalAbppt.g:1104:3: RULE_ID
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
    // InternalAbppt.g:1113:1: rule__SlideContent__TextAssignment_4 : ( RULE_STRING ) ;
    public final void rule__SlideContent__TextAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbppt.g:1117:1: ( ( RULE_STRING ) )
            // InternalAbppt.g:1118:2: ( RULE_STRING )
            {
            // InternalAbppt.g:1118:2: ( RULE_STRING )
            // InternalAbppt.g:1119:3: RULE_STRING
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
    // InternalAbppt.g:1128:1: rule__SlideContent__NoteAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__SlideContent__NoteAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbppt.g:1132:1: ( ( RULE_STRING ) )
            // InternalAbppt.g:1133:2: ( RULE_STRING )
            {
            // InternalAbppt.g:1133:2: ( RULE_STRING )
            // InternalAbppt.g:1134:3: RULE_STRING
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
    // InternalAbppt.g:1143:1: rule__Presentation__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Presentation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbppt.g:1147:1: ( ( RULE_ID ) )
            // InternalAbppt.g:1148:2: ( RULE_ID )
            {
            // InternalAbppt.g:1148:2: ( RULE_ID )
            // InternalAbppt.g:1149:3: RULE_ID
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
    // InternalAbppt.g:1158:1: rule__Presentation__ThemeAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Presentation__ThemeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbppt.g:1162:1: ( ( ( RULE_ID ) ) )
            // InternalAbppt.g:1163:2: ( ( RULE_ID ) )
            {
            // InternalAbppt.g:1163:2: ( ( RULE_ID ) )
            // InternalAbppt.g:1164:3: ( RULE_ID )
            {
             before(grammarAccess.getPresentationAccess().getThemeThemeCrossReference_4_0()); 
            // InternalAbppt.g:1165:3: ( RULE_ID )
            // InternalAbppt.g:1166:4: RULE_ID
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
    // InternalAbppt.g:1177:1: rule__Presentation__SlidesAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__Presentation__SlidesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbppt.g:1181:1: ( ( ( RULE_ID ) ) )
            // InternalAbppt.g:1182:2: ( ( RULE_ID ) )
            {
            // InternalAbppt.g:1182:2: ( ( RULE_ID ) )
            // InternalAbppt.g:1183:3: ( RULE_ID )
            {
             before(grammarAccess.getPresentationAccess().getSlidesSlideContentCrossReference_5_1_0()); 
            // InternalAbppt.g:1184:3: ( RULE_ID )
            // InternalAbppt.g:1185:4: RULE_ID
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
    // InternalAbppt.g:1196:1: rule__Theme__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Theme__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbppt.g:1200:1: ( ( RULE_ID ) )
            // InternalAbppt.g:1201:2: ( RULE_ID )
            {
            // InternalAbppt.g:1201:2: ( RULE_ID )
            // InternalAbppt.g:1202:3: RULE_ID
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
    // InternalAbppt.g:1211:1: rule__Theme__BackgroundAssignment_3_1 : ( ruleColor ) ;
    public final void rule__Theme__BackgroundAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbppt.g:1215:1: ( ( ruleColor ) )
            // InternalAbppt.g:1216:2: ( ruleColor )
            {
            // InternalAbppt.g:1216:2: ( ruleColor )
            // InternalAbppt.g:1217:3: ruleColor
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
    // InternalAbppt.g:1226:1: rule__Theme__HeaderAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Theme__HeaderAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbppt.g:1230:1: ( ( RULE_STRING ) )
            // InternalAbppt.g:1231:2: ( RULE_STRING )
            {
            // InternalAbppt.g:1231:2: ( RULE_STRING )
            // InternalAbppt.g:1232:3: RULE_STRING
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
    // InternalAbppt.g:1241:1: rule__Theme__FooterAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__Theme__FooterAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbppt.g:1245:1: ( ( RULE_STRING ) )
            // InternalAbppt.g:1246:2: ( RULE_STRING )
            {
            // InternalAbppt.g:1246:2: ( RULE_STRING )
            // InternalAbppt.g:1247:3: RULE_STRING
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