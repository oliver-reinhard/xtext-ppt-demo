/**
 * generated by Xtext 2.16.0
 */
package org.xtext.example.abppt.abppt;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.example.abppt.abppt.AbpptFactory
 * @model kind="package"
 * @generated
 */
public interface AbpptPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "abppt";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/abppt/Abppt";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "abppt";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  AbpptPackage eINSTANCE = org.xtext.example.abppt.abppt.impl.AbpptPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.abppt.abppt.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.abppt.abppt.impl.ModelImpl
   * @see org.xtext.example.abppt.abppt.impl.AbpptPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Contents</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__CONTENTS = 0;

  /**
   * The feature id for the '<em><b>Presentations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__PRESENTATIONS = 1;

  /**
   * The feature id for the '<em><b>Themes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__THEMES = 2;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.abppt.abppt.impl.SlideContentImpl <em>Slide Content</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.abppt.abppt.impl.SlideContentImpl
   * @see org.xtext.example.abppt.abppt.impl.AbpptPackageImpl#getSlideContent()
   * @generated
   */
  int SLIDE_CONTENT = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLIDE_CONTENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLIDE_CONTENT__TEXT = 1;

  /**
   * The feature id for the '<em><b>Note</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLIDE_CONTENT__NOTE = 2;

  /**
   * The number of structural features of the '<em>Slide Content</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLIDE_CONTENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.abppt.abppt.impl.PresentationImpl <em>Presentation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.abppt.abppt.impl.PresentationImpl
   * @see org.xtext.example.abppt.abppt.impl.AbpptPackageImpl#getPresentation()
   * @generated
   */
  int PRESENTATION = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRESENTATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Theme</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRESENTATION__THEME = 1;

  /**
   * The feature id for the '<em><b>Slides</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRESENTATION__SLIDES = 2;

  /**
   * The number of structural features of the '<em>Presentation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRESENTATION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.abppt.abppt.impl.ThemeImpl <em>Theme</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.abppt.abppt.impl.ThemeImpl
   * @see org.xtext.example.abppt.abppt.impl.AbpptPackageImpl#getTheme()
   * @generated
   */
  int THEME = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THEME__NAME = 0;

  /**
   * The feature id for the '<em><b>Background</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THEME__BACKGROUND = 1;

  /**
   * The feature id for the '<em><b>Header</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THEME__HEADER = 2;

  /**
   * The feature id for the '<em><b>Footer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THEME__FOOTER = 3;

  /**
   * The number of structural features of the '<em>Theme</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THEME_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.example.abppt.abppt.Color <em>Color</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.abppt.abppt.Color
   * @see org.xtext.example.abppt.abppt.impl.AbpptPackageImpl#getColor()
   * @generated
   */
  int COLOR = 4;


  /**
   * Returns the meta object for class '{@link org.xtext.example.abppt.abppt.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.xtext.example.abppt.abppt.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.abppt.abppt.Model#getContents <em>Contents</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Contents</em>'.
   * @see org.xtext.example.abppt.abppt.Model#getContents()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Contents();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.abppt.abppt.Model#getPresentations <em>Presentations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Presentations</em>'.
   * @see org.xtext.example.abppt.abppt.Model#getPresentations()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Presentations();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.abppt.abppt.Model#getThemes <em>Themes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Themes</em>'.
   * @see org.xtext.example.abppt.abppt.Model#getThemes()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Themes();

  /**
   * Returns the meta object for class '{@link org.xtext.example.abppt.abppt.SlideContent <em>Slide Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Slide Content</em>'.
   * @see org.xtext.example.abppt.abppt.SlideContent
   * @generated
   */
  EClass getSlideContent();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.abppt.abppt.SlideContent#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.abppt.abppt.SlideContent#getName()
   * @see #getSlideContent()
   * @generated
   */
  EAttribute getSlideContent_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.abppt.abppt.SlideContent#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see org.xtext.example.abppt.abppt.SlideContent#getText()
   * @see #getSlideContent()
   * @generated
   */
  EAttribute getSlideContent_Text();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.abppt.abppt.SlideContent#getNote <em>Note</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Note</em>'.
   * @see org.xtext.example.abppt.abppt.SlideContent#getNote()
   * @see #getSlideContent()
   * @generated
   */
  EAttribute getSlideContent_Note();

  /**
   * Returns the meta object for class '{@link org.xtext.example.abppt.abppt.Presentation <em>Presentation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Presentation</em>'.
   * @see org.xtext.example.abppt.abppt.Presentation
   * @generated
   */
  EClass getPresentation();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.abppt.abppt.Presentation#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.abppt.abppt.Presentation#getName()
   * @see #getPresentation()
   * @generated
   */
  EAttribute getPresentation_Name();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.abppt.abppt.Presentation#getTheme <em>Theme</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Theme</em>'.
   * @see org.xtext.example.abppt.abppt.Presentation#getTheme()
   * @see #getPresentation()
   * @generated
   */
  EReference getPresentation_Theme();

  /**
   * Returns the meta object for the reference list '{@link org.xtext.example.abppt.abppt.Presentation#getSlides <em>Slides</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Slides</em>'.
   * @see org.xtext.example.abppt.abppt.Presentation#getSlides()
   * @see #getPresentation()
   * @generated
   */
  EReference getPresentation_Slides();

  /**
   * Returns the meta object for class '{@link org.xtext.example.abppt.abppt.Theme <em>Theme</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Theme</em>'.
   * @see org.xtext.example.abppt.abppt.Theme
   * @generated
   */
  EClass getTheme();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.abppt.abppt.Theme#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.abppt.abppt.Theme#getName()
   * @see #getTheme()
   * @generated
   */
  EAttribute getTheme_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.abppt.abppt.Theme#getBackground <em>Background</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Background</em>'.
   * @see org.xtext.example.abppt.abppt.Theme#getBackground()
   * @see #getTheme()
   * @generated
   */
  EAttribute getTheme_Background();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.abppt.abppt.Theme#getHeader <em>Header</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Header</em>'.
   * @see org.xtext.example.abppt.abppt.Theme#getHeader()
   * @see #getTheme()
   * @generated
   */
  EAttribute getTheme_Header();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.abppt.abppt.Theme#getFooter <em>Footer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Footer</em>'.
   * @see org.xtext.example.abppt.abppt.Theme#getFooter()
   * @see #getTheme()
   * @generated
   */
  EAttribute getTheme_Footer();

  /**
   * Returns the meta object for enum '{@link org.xtext.example.abppt.abppt.Color <em>Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Color</em>'.
   * @see org.xtext.example.abppt.abppt.Color
   * @generated
   */
  EEnum getColor();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  AbpptFactory getAbpptFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.example.abppt.abppt.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.abppt.abppt.impl.ModelImpl
     * @see org.xtext.example.abppt.abppt.impl.AbpptPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__CONTENTS = eINSTANCE.getModel_Contents();

    /**
     * The meta object literal for the '<em><b>Presentations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__PRESENTATIONS = eINSTANCE.getModel_Presentations();

    /**
     * The meta object literal for the '<em><b>Themes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__THEMES = eINSTANCE.getModel_Themes();

    /**
     * The meta object literal for the '{@link org.xtext.example.abppt.abppt.impl.SlideContentImpl <em>Slide Content</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.abppt.abppt.impl.SlideContentImpl
     * @see org.xtext.example.abppt.abppt.impl.AbpptPackageImpl#getSlideContent()
     * @generated
     */
    EClass SLIDE_CONTENT = eINSTANCE.getSlideContent();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SLIDE_CONTENT__NAME = eINSTANCE.getSlideContent_Name();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SLIDE_CONTENT__TEXT = eINSTANCE.getSlideContent_Text();

    /**
     * The meta object literal for the '<em><b>Note</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SLIDE_CONTENT__NOTE = eINSTANCE.getSlideContent_Note();

    /**
     * The meta object literal for the '{@link org.xtext.example.abppt.abppt.impl.PresentationImpl <em>Presentation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.abppt.abppt.impl.PresentationImpl
     * @see org.xtext.example.abppt.abppt.impl.AbpptPackageImpl#getPresentation()
     * @generated
     */
    EClass PRESENTATION = eINSTANCE.getPresentation();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRESENTATION__NAME = eINSTANCE.getPresentation_Name();

    /**
     * The meta object literal for the '<em><b>Theme</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRESENTATION__THEME = eINSTANCE.getPresentation_Theme();

    /**
     * The meta object literal for the '<em><b>Slides</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRESENTATION__SLIDES = eINSTANCE.getPresentation_Slides();

    /**
     * The meta object literal for the '{@link org.xtext.example.abppt.abppt.impl.ThemeImpl <em>Theme</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.abppt.abppt.impl.ThemeImpl
     * @see org.xtext.example.abppt.abppt.impl.AbpptPackageImpl#getTheme()
     * @generated
     */
    EClass THEME = eINSTANCE.getTheme();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute THEME__NAME = eINSTANCE.getTheme_Name();

    /**
     * The meta object literal for the '<em><b>Background</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute THEME__BACKGROUND = eINSTANCE.getTheme_Background();

    /**
     * The meta object literal for the '<em><b>Header</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute THEME__HEADER = eINSTANCE.getTheme_Header();

    /**
     * The meta object literal for the '<em><b>Footer</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute THEME__FOOTER = eINSTANCE.getTheme_Footer();

    /**
     * The meta object literal for the '{@link org.xtext.example.abppt.abppt.Color <em>Color</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.abppt.abppt.Color
     * @see org.xtext.example.abppt.abppt.impl.AbpptPackageImpl#getColor()
     * @generated
     */
    EEnum COLOR = eINSTANCE.getColor();

  }

} //AbpptPackage
