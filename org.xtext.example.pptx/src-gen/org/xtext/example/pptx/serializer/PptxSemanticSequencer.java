/*
 * generated by Xtext 2.16.0
 */
package org.xtext.example.pptx.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.xtext.example.pptx.pptx.Model;
import org.xtext.example.pptx.pptx.PptxPackage;
import org.xtext.example.pptx.pptx.Presentation;
import org.xtext.example.pptx.pptx.SlideContent;
import org.xtext.example.pptx.pptx.Theme;
import org.xtext.example.pptx.services.PptxGrammarAccess;

@SuppressWarnings("all")
public class PptxSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private PptxGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == PptxPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case PptxPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case PptxPackage.PRESENTATION:
				sequence_Presentation(context, (Presentation) semanticObject); 
				return; 
			case PptxPackage.SLIDE_CONTENT:
				sequence_SlideContent(context, (SlideContent) semanticObject); 
				return; 
			case PptxPackage.THEME:
				sequence_Theme(context, (Theme) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     (contents+=SlideContent | presentations+=Presentation | themes+=Theme)+
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Presentation returns Presentation
	 *
	 * Constraint:
	 *     (name=ID theme=[Theme|ID] slides+=[SlideContent|ID]*)
	 */
	protected void sequence_Presentation(ISerializationContext context, Presentation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SlideContent returns SlideContent
	 *
	 * Constraint:
	 *     (name=ID text=STRING note=STRING?)
	 */
	protected void sequence_SlideContent(ISerializationContext context, SlideContent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Theme returns Theme
	 *
	 * Constraint:
	 *     (name=ID background=Color? header=STRING? footer=STRING?)
	 */
	protected void sequence_Theme(ISerializationContext context, Theme semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
