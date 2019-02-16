/**
 * generated by Xtext 2.16.0
 */
package org.xtext.example.pptx.pptx;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.pptx.pptx.PptxPackage
 * @generated
 */
public interface PptxFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PptxFactory eINSTANCE = org.xtext.example.pptx.pptx.impl.PptxFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Slide Content</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Slide Content</em>'.
   * @generated
   */
  SlideContent createSlideContent();

  /**
   * Returns a new object of class '<em>Presentation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Presentation</em>'.
   * @generated
   */
  Presentation createPresentation();

  /**
   * Returns a new object of class '<em>Theme</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Theme</em>'.
   * @generated
   */
  Theme createTheme();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  PptxPackage getPptxPackage();

} //PptxFactory
