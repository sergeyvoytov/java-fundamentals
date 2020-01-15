package inheritance;

import java.util.LinkedList;


public class Theather extends Restaurant {


    public Theather(String name, int numberOfStars, int priceCategory) {
        super(name, numberOfStars, priceCategory);
        this.moviesList = new LinkedList<>();
    }

    LinkedList<String> moviesList;


    public String getAllElements() {
        return moviesList.toString();
    }

    public void addMovie(String movie) {
        moviesList.add(movie);
    }


    public void removeMovie(String movie) {
        moviesList.remove(movie);
    }


    @Override
// To string method
    public String toString() {

        return String.format(
                "The theather %s has %.2f stars and contains: %s and has %d reviews  and %d movies are shown",
                this.name,
                this.numberOfStars,
                this.moviesList.toString(),
                this.allReviews.size(),
                this.moviesList.size()
        );
    }



}


//        Theater   name and all of the movies currently showing there.