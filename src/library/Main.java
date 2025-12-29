package library;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Library library = new Library();
        Scanner sc = new Scanner(System.in);

        // Sample books
        library.addBook(new Book(1, "Java Programming", "James Gosling"));
        library.addBook(new Book(2, "Data Structures", "CLRS"));
        library.addBook(new Book(3, "OOPS Concepts", "Balagurusamy"));

        while (true) {

            System.out.println("\n--- LIBRARY MENU ---");
            System.out.println("1. View Books");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            try {
                switch (choice) {
                    case 1:
                        library.viewBooks();
                        break;

                    case 2:
                        System.out.print("Enter Book ID to issue: ");
                        library.issueBook(sc.nextInt());
                        System.out.println("Book issued successfully!");
                        break;

                    case 3:
                        System.out.print("Enter Book ID to return: ");
                        library.returnBook(sc.nextInt());
                        System.out.println("Book returned successfully!");
                        break;

                    case 4:
                        System.out.println("Thank you for using the library!");
                        sc.close();
                        return;

                    default:
                        System.out.println("Invalid choice!");
                }
            } catch (LibraryException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
