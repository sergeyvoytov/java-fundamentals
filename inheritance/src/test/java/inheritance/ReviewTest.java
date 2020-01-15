package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReviewTest {

    @Test
    public void ReviewTest() {
        Review review1 = new Review("This is a great restaurant if you want to get a food poisoning and die ", "Roger", 1);

        String expected = "The review: This is a great restaurant if you want to get a food poisoning and die  the author is  Roger and it has 1 stars";
        assertEquals(expected, (review1.toString()));
//        System.out.println(review1.toString());
    }
}
