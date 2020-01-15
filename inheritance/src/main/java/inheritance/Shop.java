package inheritance;

import javax.xml.namespace.QName;
import java.util.LinkedList;

public class Shop extends Restaurant {
    public Shop (String name, int numberOfStars, int priceCategory, String description) {
        super(name, numberOfStars, priceCategory);
        this.description = description;
    }
    String description;


    @Override
// To string method
    public String toString() {

        return String.format(
                "The restaurant %s has %.2f stars and contains: %s and has price category of %d, and has %d reviews",
                this.name,
                this.numberOfStars,
                this.description,
                this.priceCategory,
                this.allReviews.size()
        );
    }
}


