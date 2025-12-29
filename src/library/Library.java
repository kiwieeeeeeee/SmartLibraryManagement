package library;

import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private ArrayList<Book> books = new ArrayList<>();
    private HashMap<Integer, Book> bookMap = new HashMap<>();

    // Add a book
    public void addBook(Book book) {
        books.add(book);
        bookMap.put(book.getId(), book);
    }

    // View all books
    public void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }
        for (Book b : books) {
            System.out.println(b);
        }
    }

    // Issue a book
    public void issueBook(int id) throws LibraryException {
        Book book = bookMap.get(id);

        if (book == null)
            throw new LibraryException("Book not found!");

        if (book.isIssued())
            throw new LibraryException("Book already issued!");

        book.issueBook();
    }

    // Return a book
    public void returnBook(int id) throws LibraryException {
        Book book = bookMap.get(id);

        if (book == null)
            throw new LibraryException("Book not found!");

        book.returnBook();
    }
}

