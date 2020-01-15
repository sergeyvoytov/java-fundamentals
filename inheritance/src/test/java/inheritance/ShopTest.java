package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShopTest {

    @Test
    public void testShopCreated() {

        Shop shop1 = new Shop("shop1", 0, 2, "meatlovers");

        System.out.println(shop1);

    }

    @Test
    public void ShopTest() {
        Shop shop2 = new Shop("shop2", 0, 2, "meatlovers");
        Shop shop3 = new Shop("shop3", 0, 1, "fruitlovers");

        shop2.addReview(new Review("anything", "Sam", 3));
        shop2.addReview(new Review("anything", "Sam", 4));
        shop3.addReview(new Review("anything", "Sam", 3));
        shop3.addReview(new Review("anything", "Sam", 4));
        shop2.addReview(new Review("anything", "Sam", 5));

        String expected1 = "The restaurant shop2 has 4.00 stars and contains: meatlovers and has price category of 2, and has 3 reviews";
        String expected2 = "The restaurant shop3 has 3.50 stars and contains: fruitlovers and has price category of 1, and has 2 reviews";

        assertEquals(expected1, (shop2.toString()));
        assertEquals(expected2, (shop3.toString()));
    }


}

