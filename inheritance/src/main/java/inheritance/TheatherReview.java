package inheritance;

public class TheatherReview extends Review {
    public TheatherReview(String body, String author, int numberOfStars, String movie) {
        super(body, author, numberOfStars);
        this.movie = movie;
    }

    String movie;

    @Override
// To string method
    public String toString() {
//        name= this.name;

        return String.format(
                "The review: %s the author is  %s and it has %d stars and watched %s movie",
                this.body,
                this.author,
                this.numberOfStars,
                this.movie
        );
    }
}







