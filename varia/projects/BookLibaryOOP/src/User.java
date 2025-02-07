import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private List<LibaryItem> borrowedItems = new ArrayList<>();
    
    // Constructor
    public User(String name) {
        this.name = name;
    }

    // Method for borrowing a book
    public void borrowBook(LibaryItem item) {
        if (!item.isAvailable()) {
            System.out.println(item.getTitle() + " is already borrowed.");
            return;
        }
        item.borrowItem();
        borrowedItems.add(item);
    }

    // Method for returning a book
    public void returnBook(LibaryItem item) {
        if (borrowedItems.remove(item)) {
            item.returnItem();
            return;
        }
        System.out.println(item.getTitle() + " is not borrowed by " + name);
    }

    // Method for listing borrowed books
    public void listBorrowedBooks() {
        System.out.println(name + " has borrowed the following books:");
        for (LibaryItem book : borrowedItems) 
            System.out.println(book.getTitle());
    }
}
