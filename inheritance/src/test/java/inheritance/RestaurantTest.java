package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class RestaurantTest {

    @Test
    public void RestaurantCreated() {
        Restaurant olive = new Restaurant("olive", 4, 2);
        String expected = "The restaurant olive has 4.00 stars and has price category of 2, and has 0 reviews";
        assertEquals(expected, (olive.toString()));

    }


    @Test
    public void RestaurantTest() {
        Restaurant mcdonalds = new Restaurant("McDonalds", 4, 2);
        Restaurant olive = new Restaurant("olive", 4, 2);

        mcdonalds.addReview(new Review("anything", "Sam", 1));
        mcdonalds.addReview(new Review("anything", "Sam", 2));
        mcdonalds.addReview(new Review("anything", "Sam", 3));
        mcdonalds.addReview(new Review("anything", "Sam", 4));
        mcdonalds.addReview(new Review("anything", "Sam", 1));

        String expected = "The restaurant McDonalds has 2.20 stars and has price category of 2, and has 5 reviews";

        assertEquals(expected, (mcdonalds.toString()));

    }


}


