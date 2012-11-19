/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.unice.i3s.sigma.examples.library;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.unice.i3s.sigma.examples.library.LibraryFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.i3s.unice.fr/Sigma' settingDelegates='http://www.i3s.unice.fr/Sigma' validationDelegates='http://www.i3s.unice.fr/Sigma'"
 * @generated
 */
public interface LibraryPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "library";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.i3s.unice.fr/sigma/examples/Library";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "library";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LibraryPackage eINSTANCE = fr.unice.i3s.sigma.examples.library.impl.LibraryPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.unice.i3s.sigma.examples.library.impl.LibraryImpl <em>Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.i3s.sigma.examples.library.impl.LibraryImpl
	 * @see fr.unice.i3s.sigma.examples.library.impl.LibraryPackageImpl#getLibrary()
	 * @generated
	 */
	int LIBRARY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Books</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__BOOKS = 1;

	/**
	 * The feature id for the '<em><b>Loans</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__LOANS = 2;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__MEMBERS = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__DESCRIPTION = 4;

	/**
	 * The number of structural features of the '<em>Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Get Book By Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY___GET_BOOK_BY_NAME__CHARSEQUENCE = 0;

	/**
	 * The number of operations of the '<em>Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link fr.unice.i3s.sigma.examples.library.impl.BookImpl <em>Book</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.i3s.sigma.examples.library.impl.BookImpl
	 * @see fr.unice.i3s.sigma.examples.library.impl.LibraryPackageImpl#getBook()
	 * @generated
	 */
	int BOOK = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__NAME = 0;

	/**
	 * The feature id for the '<em><b>Copies</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__COPIES = 1;

	/**
	 * The feature id for the '<em><b>Library</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__LIBRARY = 2;

	/**
	 * The feature id for the '<em><b>Loans</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__LOANS = 3;

	/**
	 * The number of structural features of the '<em>Book</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Is Available</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK___IS_AVAILABLE = 0;

	/**
	 * The number of operations of the '<em>Book</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link fr.unice.i3s.sigma.examples.library.impl.MemberImpl <em>Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.i3s.sigma.examples.library.impl.MemberImpl
	 * @see fr.unice.i3s.sigma.examples.library.impl.LibraryPackageImpl#getMember()
	 * @generated
	 */
	int MEMBER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Library</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__LIBRARY = 1;

	/**
	 * The feature id for the '<em><b>Loans</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__LOANS = 2;

	/**
	 * The feature id for the '<em><b>Books</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__BOOKS = 3;

	/**
	 * The number of structural features of the '<em>Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.unice.i3s.sigma.examples.library.impl.LoanImpl <em>Loan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.i3s.sigma.examples.library.impl.LoanImpl
	 * @see fr.unice.i3s.sigma.examples.library.impl.LibraryPackageImpl#getLoan()
	 * @generated
	 */
	int LOAN = 3;

	/**
	 * The feature id for the '<em><b>Book</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAN__BOOK = 0;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAN__MEMBER = 1;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAN__DATE = 2;

	/**
	 * The number of structural features of the '<em>Loan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAN_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Loan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '<em>EChar Sequence</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.CharSequence
	 * @see fr.unice.i3s.sigma.examples.library.impl.LibraryPackageImpl#getECharSequence()
	 * @generated
	 */
	int ECHAR_SEQUENCE = 4;


	/**
	 * Returns the meta object for class '{@link fr.unice.i3s.sigma.examples.library.Library <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Library</em>'.
	 * @see fr.unice.i3s.sigma.examples.library.Library
	 * @generated
	 */
	EClass getLibrary();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.i3s.sigma.examples.library.Library#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.unice.i3s.sigma.examples.library.Library#getName()
	 * @see #getLibrary()
	 * @generated
	 */
	EAttribute getLibrary_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.unice.i3s.sigma.examples.library.Library#getBooks <em>Books</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Books</em>'.
	 * @see fr.unice.i3s.sigma.examples.library.Library#getBooks()
	 * @see #getLibrary()
	 * @generated
	 */
	EReference getLibrary_Books();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.unice.i3s.sigma.examples.library.Library#getLoans <em>Loans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Loans</em>'.
	 * @see fr.unice.i3s.sigma.examples.library.Library#getLoans()
	 * @see #getLibrary()
	 * @generated
	 */
	EReference getLibrary_Loans();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.unice.i3s.sigma.examples.library.Library#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Members</em>'.
	 * @see fr.unice.i3s.sigma.examples.library.Library#getMembers()
	 * @see #getLibrary()
	 * @generated
	 */
	EReference getLibrary_Members();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.i3s.sigma.examples.library.Library#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see fr.unice.i3s.sigma.examples.library.Library#getDescription()
	 * @see #getLibrary()
	 * @generated
	 */
	EAttribute getLibrary_Description();

	/**
	 * Returns the meta object for the '{@link fr.unice.i3s.sigma.examples.library.Library#getBookByName(java.lang.CharSequence) <em>Get Book By Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Book By Name</em>' operation.
	 * @see fr.unice.i3s.sigma.examples.library.Library#getBookByName(java.lang.CharSequence)
	 * @generated
	 */
	EOperation getLibrary__GetBookByName__CharSequence();

	/**
	 * Returns the meta object for class '{@link fr.unice.i3s.sigma.examples.library.Book <em>Book</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Book</em>'.
	 * @see fr.unice.i3s.sigma.examples.library.Book
	 * @generated
	 */
	EClass getBook();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.i3s.sigma.examples.library.Book#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.unice.i3s.sigma.examples.library.Book#getName()
	 * @see #getBook()
	 * @generated
	 */
	EAttribute getBook_Name();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.i3s.sigma.examples.library.Book#getCopies <em>Copies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Copies</em>'.
	 * @see fr.unice.i3s.sigma.examples.library.Book#getCopies()
	 * @see #getBook()
	 * @generated
	 */
	EAttribute getBook_Copies();

	/**
	 * Returns the meta object for the reference '{@link fr.unice.i3s.sigma.examples.library.Book#getLibrary <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Library</em>'.
	 * @see fr.unice.i3s.sigma.examples.library.Book#getLibrary()
	 * @see #getBook()
	 * @generated
	 */
	EReference getBook_Library();

	/**
	 * Returns the meta object for the reference list '{@link fr.unice.i3s.sigma.examples.library.Book#getLoans <em>Loans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Loans</em>'.
	 * @see fr.unice.i3s.sigma.examples.library.Book#getLoans()
	 * @see #getBook()
	 * @generated
	 */
	EReference getBook_Loans();

	/**
	 * Returns the meta object for the '{@link fr.unice.i3s.sigma.examples.library.Book#isAvailable() <em>Is Available</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Available</em>' operation.
	 * @see fr.unice.i3s.sigma.examples.library.Book#isAvailable()
	 * @generated
	 */
	EOperation getBook__IsAvailable();

	/**
	 * Returns the meta object for class '{@link fr.unice.i3s.sigma.examples.library.Member <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Member</em>'.
	 * @see fr.unice.i3s.sigma.examples.library.Member
	 * @generated
	 */
	EClass getMember();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.i3s.sigma.examples.library.Member#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.unice.i3s.sigma.examples.library.Member#getName()
	 * @see #getMember()
	 * @generated
	 */
	EAttribute getMember_Name();

	/**
	 * Returns the meta object for the reference '{@link fr.unice.i3s.sigma.examples.library.Member#getLibrary <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Library</em>'.
	 * @see fr.unice.i3s.sigma.examples.library.Member#getLibrary()
	 * @see #getMember()
	 * @generated
	 */
	EReference getMember_Library();

	/**
	 * Returns the meta object for the reference list '{@link fr.unice.i3s.sigma.examples.library.Member#getLoans <em>Loans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Loans</em>'.
	 * @see fr.unice.i3s.sigma.examples.library.Member#getLoans()
	 * @see #getMember()
	 * @generated
	 */
	EReference getMember_Loans();

	/**
	 * Returns the meta object for the reference list '{@link fr.unice.i3s.sigma.examples.library.Member#getBooks <em>Books</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Books</em>'.
	 * @see fr.unice.i3s.sigma.examples.library.Member#getBooks()
	 * @see #getMember()
	 * @generated
	 */
	EReference getMember_Books();

	/**
	 * Returns the meta object for class '{@link fr.unice.i3s.sigma.examples.library.Loan <em>Loan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loan</em>'.
	 * @see fr.unice.i3s.sigma.examples.library.Loan
	 * @generated
	 */
	EClass getLoan();

	/**
	 * Returns the meta object for the reference '{@link fr.unice.i3s.sigma.examples.library.Loan#getBook <em>Book</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Book</em>'.
	 * @see fr.unice.i3s.sigma.examples.library.Loan#getBook()
	 * @see #getLoan()
	 * @generated
	 */
	EReference getLoan_Book();

	/**
	 * Returns the meta object for the reference '{@link fr.unice.i3s.sigma.examples.library.Loan#getMember <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Member</em>'.
	 * @see fr.unice.i3s.sigma.examples.library.Loan#getMember()
	 * @see #getLoan()
	 * @generated
	 */
	EReference getLoan_Member();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.i3s.sigma.examples.library.Loan#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see fr.unice.i3s.sigma.examples.library.Loan#getDate()
	 * @see #getLoan()
	 * @generated
	 */
	EAttribute getLoan_Date();

	/**
	 * Returns the meta object for data type '{@link java.lang.CharSequence <em>EChar Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EChar Sequence</em>'.
	 * @see java.lang.CharSequence
	 * @model instanceClass="java.lang.CharSequence"
	 * @generated
	 */
	EDataType getECharSequence();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LibraryFactory getLibraryFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fr.unice.i3s.sigma.examples.library.impl.LibraryImpl <em>Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.i3s.sigma.examples.library.impl.LibraryImpl
		 * @see fr.unice.i3s.sigma.examples.library.impl.LibraryPackageImpl#getLibrary()
		 * @generated
		 */
		EClass LIBRARY = eINSTANCE.getLibrary();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIBRARY__NAME = eINSTANCE.getLibrary_Name();

		/**
		 * The meta object literal for the '<em><b>Books</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY__BOOKS = eINSTANCE.getLibrary_Books();

		/**
		 * The meta object literal for the '<em><b>Loans</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY__LOANS = eINSTANCE.getLibrary_Loans();

		/**
		 * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY__MEMBERS = eINSTANCE.getLibrary_Members();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIBRARY__DESCRIPTION = eINSTANCE.getLibrary_Description();

		/**
		 * The meta object literal for the '<em><b>Get Book By Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LIBRARY___GET_BOOK_BY_NAME__CHARSEQUENCE = eINSTANCE.getLibrary__GetBookByName__CharSequence();

		/**
		 * The meta object literal for the '{@link fr.unice.i3s.sigma.examples.library.impl.BookImpl <em>Book</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.i3s.sigma.examples.library.impl.BookImpl
		 * @see fr.unice.i3s.sigma.examples.library.impl.LibraryPackageImpl#getBook()
		 * @generated
		 */
		EClass BOOK = eINSTANCE.getBook();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOK__NAME = eINSTANCE.getBook_Name();

		/**
		 * The meta object literal for the '<em><b>Copies</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOK__COPIES = eINSTANCE.getBook_Copies();

		/**
		 * The meta object literal for the '<em><b>Library</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOK__LIBRARY = eINSTANCE.getBook_Library();

		/**
		 * The meta object literal for the '<em><b>Loans</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOK__LOANS = eINSTANCE.getBook_Loans();

		/**
		 * The meta object literal for the '<em><b>Is Available</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOK___IS_AVAILABLE = eINSTANCE.getBook__IsAvailable();

		/**
		 * The meta object literal for the '{@link fr.unice.i3s.sigma.examples.library.impl.MemberImpl <em>Member</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.i3s.sigma.examples.library.impl.MemberImpl
		 * @see fr.unice.i3s.sigma.examples.library.impl.LibraryPackageImpl#getMember()
		 * @generated
		 */
		EClass MEMBER = eINSTANCE.getMember();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBER__NAME = eINSTANCE.getMember_Name();

		/**
		 * The meta object literal for the '<em><b>Library</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMBER__LIBRARY = eINSTANCE.getMember_Library();

		/**
		 * The meta object literal for the '<em><b>Loans</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMBER__LOANS = eINSTANCE.getMember_Loans();

		/**
		 * The meta object literal for the '<em><b>Books</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMBER__BOOKS = eINSTANCE.getMember_Books();

		/**
		 * The meta object literal for the '{@link fr.unice.i3s.sigma.examples.library.impl.LoanImpl <em>Loan</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.i3s.sigma.examples.library.impl.LoanImpl
		 * @see fr.unice.i3s.sigma.examples.library.impl.LibraryPackageImpl#getLoan()
		 * @generated
		 */
		EClass LOAN = eINSTANCE.getLoan();

		/**
		 * The meta object literal for the '<em><b>Book</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOAN__BOOK = eINSTANCE.getLoan_Book();

		/**
		 * The meta object literal for the '<em><b>Member</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOAN__MEMBER = eINSTANCE.getLoan_Member();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAN__DATE = eINSTANCE.getLoan_Date();

		/**
		 * The meta object literal for the '<em>EChar Sequence</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.CharSequence
		 * @see fr.unice.i3s.sigma.examples.library.impl.LibraryPackageImpl#getECharSequence()
		 * @generated
		 */
		EDataType ECHAR_SEQUENCE = eINSTANCE.getECharSequence();

	}

} //LibraryPackage