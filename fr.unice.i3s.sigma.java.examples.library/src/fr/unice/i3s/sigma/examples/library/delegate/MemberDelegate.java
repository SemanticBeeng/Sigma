package fr.unice.i3s.sigma.examples.library.delegate;

import static com.google.common.collect.Collections2.filter;
import static com.google.common.collect.Collections2.transform;
import static fr.unice.i3s.sigma.java.delegates.JSigmaDelegateDomain.asEList;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.util.EList;

import com.google.common.base.Function;
import com.google.common.base.Predicate;

import fr.unice.i3s.sigma.core.ValidationResult;
import fr.unice.i3s.sigma.examples.library.Book;
import fr.unice.i3s.sigma.examples.library.Loan;
import fr.unice.i3s.sigma.examples.library.Member;

public final class MemberDelegate {

	private MemberDelegate() {
	}

	public static ValidationResult validateAtMostTwoLoans(Member self) {
		int loans = self.getLoans().size();
		if (loans > 2) {
			return ValidationResult.error("Too many loans: " + loans
					+ " max: 2");
		} else {
			return ValidationResult.ok();
		}
	}

	public static ValidationResult validateUniqueLoans(Member self) {
		Set<Book> duplicates = new HashSet<Book>();
		for (Loan loan1 : self.getLoans()) {
			for (Loan loan2 : self.getLoans()) {
				if (loan1 != loan2 && loan1.getBook().equals(loan2.getBook())) {
					duplicates.add(loan1.getBook());
				}
			}
		}

		if (duplicates.size() > 0) {
			return ValidationResult.error("Duplicate loans of books: "
					+ duplicates);
		} else {
			return ValidationResult.ok();
		}
	}

	public static EList<Loan> getLoans(final Member self) {
		return asEList(filter(self.getLibrary().getLoans(), new Predicate<Loan>() {
			@Override
			public boolean apply(Loan input) {
				return input.getMember().equals(self);
			}
		}));
	}

	public static EList<Book> getBooks(final Member self) {
		return asEList(transform(self.getLoans(), new Function<Loan, Book>() {
			@Override
			public Book apply(Loan input) {
				return input.getBook();
			}
		}));
	}

}