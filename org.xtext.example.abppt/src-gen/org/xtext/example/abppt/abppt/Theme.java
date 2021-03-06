/**
 * generated by Xtext 2.16.0
 */
package org.xtext.example.abppt.abppt;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Theme</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.abppt.abppt.Theme#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.abppt.abppt.Theme#getBackground <em>Background</em>}</li>
 *   <li>{@link org.xtext.example.abppt.abppt.Theme#getHeader <em>Header</em>}</li>
 *   <li>{@link org.xtext.example.abppt.abppt.Theme#getFooter <em>Footer</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.abppt.abppt.AbpptPackage#getTheme()
 * @model
 * @generated
 */
public interface Theme extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.abppt.abppt.AbpptPackage#getTheme_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.abppt.abppt.Theme#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Background</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.example.abppt.abppt.Color}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Background</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Background</em>' attribute.
   * @see org.xtext.example.abppt.abppt.Color
   * @see #setBackground(Color)
   * @see org.xtext.example.abppt.abppt.AbpptPackage#getTheme_Background()
   * @model
   * @generated
   */
  Color getBackground();

  /**
   * Sets the value of the '{@link org.xtext.example.abppt.abppt.Theme#getBackground <em>Background</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Background</em>' attribute.
   * @see org.xtext.example.abppt.abppt.Color
   * @see #getBackground()
   * @generated
   */
  void setBackground(Color value);

  /**
   * Returns the value of the '<em><b>Header</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Header</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Header</em>' attribute.
   * @see #setHeader(String)
   * @see org.xtext.example.abppt.abppt.AbpptPackage#getTheme_Header()
   * @model
   * @generated
   */
  String getHeader();

  /**
   * Sets the value of the '{@link org.xtext.example.abppt.abppt.Theme#getHeader <em>Header</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Header</em>' attribute.
   * @see #getHeader()
   * @generated
   */
  void setHeader(String value);

  /**
   * Returns the value of the '<em><b>Footer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Footer</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Footer</em>' attribute.
   * @see #setFooter(String)
   * @see org.xtext.example.abppt.abppt.AbpptPackage#getTheme_Footer()
   * @model
   * @generated
   */
  String getFooter();

  /**
   * Sets the value of the '{@link org.xtext.example.abppt.abppt.Theme#getFooter <em>Footer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Footer</em>' attribute.
   * @see #getFooter()
   * @generated
   */
  void setFooter(String value);

} // Theme
