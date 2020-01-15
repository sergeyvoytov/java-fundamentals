package inheritance;

import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

public class TheatherTest {

    @Test
    public void getAllElements() {
    }

    @Test
    public void testAddMovie() {
        Theather th1 = new Theather("AMC", 0, 0);
        th1.addMovie("Movie");
        th1.addMovie("Movie1");
//        System.out.println(th1.getAllElements());
        String expected = "[Movie, Movie1]";
        assertEquals(expected, (th1.getAllElements()));
    }

    @Test
    public void removeMovie() {

        Theather th1 = new Theather("XXX", 0, 0);
        th1.addMovie("Movie");
        th1.addMovie("Movie1");
        th1.addMovie("Movie2");
        th1.addMovie("Movie3");
        //remove the element

        th1.removeMovie("Movie1");

        String expected = "[Movie, Movie2, Movie3]";
        assertEquals(expected, (th1.getAllElements()));
//        System.out.println(th1.getAllElements());
    }

    @Test
    public void testToString() {
        LinkedList moviesList = new LinkedList();
        moviesList.add("rembo");
        moviesList.add("terminator");

        String expected = "[rembo, terminator]";
        assertEquals(expected, (moviesList.toString()));
//        System.out.println(moviesList.toString());
    }

    @Test
    public void TheatherTest() {
        Theather AMC = new Theather("AMC", 4, 2);

        AMC.addMovie("Star Trek");

        AMC.addReview(new TheatherReview("anything", "Sam", 1, "Star Trek"));
        AMC.addReview(new TheatherReview("anything", "Sam", 2, ""));
        AMC.addReview(new TheatherReview("anything", "Sam", 3, "star wars"));

        System.out.println(AMC);
        String expected = "The theather AMC has 2.00 stars and contains: [Star Trek] and has 3 reviews  and 1 movies are shown";
        assertEquals(expected, (AMC.toString()));
    }

}
