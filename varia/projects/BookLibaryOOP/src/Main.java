/* 
 * Users can borrow and return books
 * A book can be available or borrowed
 * System tracks the borrowed books for each user
 */
public class Main {
    public static void main(String[] args) throws Exception {

        // Create some books
        Book book1 = new Book("Pepijns Hobbit Life");
        Book book2 = new Book("The Lord of the Rings");

        // Create a user
        User user = new User("Nowi");

        // Borrow books
        user.borrowBook(book1);
        user.borrowBook(book2);

        // try to borrow a book twice
        user.borrowBook(book2);

        // List borrowed books
        user.listBorrowedBooks();

        // Return a book
        user.returnBook(book1);

        // List borrowed books
        user.listBorrowedBooks();

        // show total borrowed book count
        Book.getBorrowedCount();
    }
}
