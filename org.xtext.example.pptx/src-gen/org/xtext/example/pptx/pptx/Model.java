/**
 * generated by Xtext 2.16.0
 */
package org.xtext.example.pptx.pptx;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.pptx.pptx.Model#getContents <em>Contents</em>}</li>
 *   <li>{@link org.xtext.example.pptx.pptx.Model#getPresentations <em>Presentations</em>}</li>
 *   <li>{@link org.xtext.example.pptx.pptx.Model#getThemes <em>Themes</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.pptx.pptx.PptxPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Contents</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.pptx.pptx.SlideContent}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Contents</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contents</em>' containment reference list.
   * @see org.xtext.example.pptx.pptx.PptxPackage#getModel_Contents()
   * @model containment="true"
   * @generated
   */
  EList<SlideContent> getContents();

  /**
   * Returns the value of the '<em><b>Presentations</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.pptx.pptx.Presentation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Presentations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Presentations</em>' containment reference list.
   * @see org.xtext.example.pptx.pptx.PptxPackage#getModel_Presentations()
   * @model containment="true"
   * @generated
   */
  EList<Presentation> getPresentations();

  /**
   * Returns the value of the '<em><b>Themes</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.pptx.pptx.Theme}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Themes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Themes</em>' containment reference list.
   * @see org.xtext.example.pptx.pptx.PptxPackage#getModel_Themes()
   * @model containment="true"
   * @generated
   */
  EList<Theme> getThemes();

} // Model
