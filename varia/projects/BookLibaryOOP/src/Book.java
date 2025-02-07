public class Book implements LibaryItem {
    // Static fields
    public static int totalBorrowedCount = 0;

    // Static method for printing borrowed books
    public static void getBorrowedCount() {
        System.out.println("There have been " + totalBorrowedCount + " books borrowed.");
    }

    // Static method for counting borrowed books
    private static void increaseBorrowedCount() {
        totalBorrowedCount++;
    }

    // Fields
    private String title;
    private boolean isAvailable = true;

    // Constructor
    public Book(String title) {
        setTitle(title);
    }

    // Method for availability
    @Override
    public boolean isAvailable() {
        return isAvailable;
    }

    // Method for borrowing
    @Override
    public void borrowItem() {
        if (isAvailable)  {
            setIsAvailable(false);
            increaseBorrowedCount();
            System.out.println(title + " is now borrowed.");
            return;
        }
        System.out.println(title + " is already borrowed.");
    }

    // Method for returning
    @Override
    public void returnItem() {
        setIsAvailable(true);
        System.out.println(title + " has been returned.");
    }

    // getters
    @Override
    public String getTitle() {
        return title;
    }

    // setters
    private void setTitle(String title) {
        this.title = title;
    }

    private void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
}
