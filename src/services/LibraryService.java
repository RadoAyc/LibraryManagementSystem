package services;

import models.Book;
import models.Member;
import models.Loan;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LibraryService {
    private List<Book> books;
    private List<Member> members;
    private List<Loan> loans;

    public LibraryService() {
        books = new ArrayList<>();
        members = new ArrayList<>();
        loans = new ArrayList<>();
    }

    // Add a book
    public void addBook(Book book) {
        books.add(book);
    }

    // Add a member
    public void addMember(Member member) {
        members.add(member);
    }

    // Loan a book
    public void loanBook(String bookId, String memberId) {
        Book book = findBookById(bookId);
        Member member = findMemberById(memberId);

        if (book != null && member != null && !book.isLoaned()) {
            book.setLoaned(true);
            Loan loan = new Loan(book, member, new Date(), null);
            loans.add(loan);
            System.out.println("Book loaned successfully.");
        } else {
            System.out.println("Cannot loan the book.");
        }
    }

    // Return a book
    public void returnBook(String bookId) {
        for (Loan loan : loans) {
            if (loan.getBook().getId().equals(bookId) && loan.getReturnDate() == null) {
                loan.getBook().setLoaned(false);
                loan.setReturnDate(new Date());
                System.out.println("Book returned successfully.");
                return;
            }
        }
        System.out.println("Cannot return the book.");
    }

    // Find book by ID
    private Book findBookById(String bookId) {
        for (Book book : books) {
            if (book.getId().equals(bookId)) {
                return book;
            }
        }
        return null;
    }

    // Find member by ID
    private Member findMemberById(String memberId) {
        for (Member member : members) {
            if (member.getMemberId().equals(memberId)) {
                return member;
            }
        }
        return null;
    }

    // Display all books
    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    // Display all members
    public void displayMembers() {
        for (Member member : members) {
            System.out.println(member);
        }
    }

    // Display all loans
    public void displayLoans() {
        for (Loan loan : loans) {
            System.out.println(loan);
        }
    }
}
