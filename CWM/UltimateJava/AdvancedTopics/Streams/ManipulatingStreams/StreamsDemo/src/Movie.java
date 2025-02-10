public class Movie {
    private String title;
    private int likes;

    // constructor
    public Movie(String title, int likes) {
        this.title = title;
        this.likes = likes;
    }

    // getters
    public int getLikes() {
        return likes;
    }
    public String getTitle() {
        return title;
    }
}
