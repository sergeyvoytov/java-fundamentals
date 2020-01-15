package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class TheatherReviewTest {
    @Test
    public void theatherReviewTest() {
        TheatherReview review1 = new TheatherReview("This is a great movie thaether if you want to get  fun going ", "Roger", 1, "dd");
        String expected = "The review: This is a great movie thaether if you want to get  fun going  the author is  Roger and it has 1 stars and watched dd movie";
        assertEquals(expected, (review1.toString()));
    }
}

