public class MovieGenre {
    private String title;
    private int likes;
    private Genre genre;


    public MovieGenre(
        String title,
        int likes,
        Genre genre
    ) {
        this.title = title;
        this.genre = genre;
        this.likes = likes;
    }


    // getters
    public String getTitle() {
        return title;
    }
    public int getLikes() {
        return likes;
    }
    public Genre getGenre() {
        return genre;
    }

}
