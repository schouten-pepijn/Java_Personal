public interface LibaryItem {
    String getTitle();
    boolean isAvailable();
    void borrowItem();
    void returnItem();
}