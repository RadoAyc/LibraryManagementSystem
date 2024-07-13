import models.Book;
import models.Member;
import services.LibraryService;

import java.util.Scanner;

public class Main {
    private static LibraryService libraryService = new LibraryService();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            System.out.println("Library Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Add Member");
            System.out.println("3. Loan Book");
            System.out.println("4. Return Book");
            System.out.println("5. Display Books");
            System.out.println("6. Display Members");
            System.out.println("7. Display Loans");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    addMember();
                    break;
                case 3:
                    loanBook();
                    break;
                case 4:
                    returnBook();
                    break;
                case 5:
                    libraryService.displayBooks();
                    break;
                case 6:
                    libraryService.displayMembers();
                    break;
                case 7:
                    libraryService.displayLoans();
                    break;
                case 8:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addBook() {
        System.out.print("Enter book ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();
        System.out.print("Enter book author: ");
        String author = scanner.nextLine();
        Book book = new Book(id, title, author);
        libraryService.addBook(book);
        System.out.println("Book added successfully.");
    }

    private static void addMember() {
        System.out.print("Enter member ID: ");
        String memberId = scanner.nextLine();
        System.out.print("Enter member name: ");
        String name = scanner.nextLine();
        Member member = new Member(memberId, name);
        libraryService.addMember(member);
        System.out.println("Member added successfully.");
    }

    private static void loanBook() {
        System.out.print("Enter book ID to loan: ");
        String bookId = scanner.nextLine();
        System.out.print("Enter member ID: ");
        String memberId = scanner.nextLine();
        libraryService.loanBook(bookId, memberId);
    }

    private static void returnBook() {
        System.out.print("Enter book ID to return: ");
        String bookId = scanner.nextLine();
        libraryService.returnBook(bookId);
    }
}
