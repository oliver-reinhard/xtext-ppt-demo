/**
 * generated by Xtext 2.16.0
 */
package org.xtext.example.abppt.abppt;

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
 *   <li>{@link org.xtext.example.abppt.abppt.Model#getContents <em>Contents</em>}</li>
 *   <li>{@link org.xtext.example.abppt.abppt.Model#getPresentations <em>Presentations</em>}</li>
 *   <li>{@link org.xtext.example.abppt.abppt.Model#getThemes <em>Themes</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.abppt.abppt.AbpptPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Contents</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.abppt.abppt.SlideContent}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Contents</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contents</em>' containment reference list.
   * @see org.xtext.example.abppt.abppt.AbpptPackage#getModel_Contents()
   * @model containment="true"
   * @generated
   */
  EList<SlideContent> getContents();

  /**
   * Returns the value of the '<em><b>Presentations</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.abppt.abppt.Presentation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Presentations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Presentations</em>' containment reference list.
   * @see org.xtext.example.abppt.abppt.AbpptPackage#getModel_Presentations()
   * @model containment="true"
   * @generated
   */
  EList<Presentation> getPresentations();

  /**
   * Returns the value of the '<em><b>Themes</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.abppt.abppt.Theme}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Themes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Themes</em>' containment reference list.
   * @see org.xtext.example.abppt.abppt.AbpptPackage#getModel_Themes()
   * @model containment="true"
   * @generated
   */
  EList<Theme> getThemes();

} // Model
