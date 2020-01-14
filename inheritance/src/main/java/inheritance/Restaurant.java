package inheritance;

import java.util.LinkedList;

public class Restaurant {

    public String name;
    public double numberOfStars;
    public int priceCategory;
    LinkedList<Review> allReviews;

    public Restaurant(String name, int numberOfStars, int priceCategory) {
        this.name = name;
        this.numberOfStars = numberOfStars;
        this.priceCategory = priceCategory;
        this.allReviews = new LinkedList<>();

    }
//   add review method

    public void addReview(Review incomingReview) {

        this.allReviews.add(incomingReview);
        double reviewCounter = 0;
        for (int i = 0; i < allReviews.size(); i++) {
            reviewCounter += allReviews.get(i).numberOfStars;
        }
        numberOfStars = reviewCounter / allReviews.size();
    }

    // To string method
    public String toString() {

        return String.format(
                "The restaurant %s has %.2f stars and has price category of %d, and has %d reviews",
                this.name,
                this.numberOfStars,
                this.priceCategory,
                this.allReviews.size()
        );
    }
}
