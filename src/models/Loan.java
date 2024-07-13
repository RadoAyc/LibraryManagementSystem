package models;

import java.util.Date;

public class Loan {
    private Book book;
    private Member member;
    private Date loanDate;
    private Date returnDate;

    public Loan(Book book, Member member, Date loanDate, Date returnDate) {
        this.book = book;
        this.member = member;
        this.loanDate = loanDate;
        this.returnDate = returnDate;
    }

    // Getters and setters
    public Book getBook() {
        return book;
    }

    public Member getMember() {
        return member;
    }

    public Date getLoanDate() {
        return loanDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    @Override
    public String toString() {
        return "Loan [book=" + book + ", member=" + member + ", loanDate=" + loanDate + ", returnDate=" + returnDate + "]";
    }
}
