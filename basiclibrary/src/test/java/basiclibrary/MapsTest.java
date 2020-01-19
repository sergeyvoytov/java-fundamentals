package basiclibrary;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class MapsTest {
    @Test
    public void tempMethod() {

        // Daily average temperatures for Seattle, October 1-28 2017
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };

        assertEquals("High: 72\n" +
                        "Low: 51\n" +
                        "Never saw temperature: 63\n" +
                        "Never saw temperature: 67\n" +
                        "Never saw temperature: 68\n" +
                        "Never saw temperature: 69\n",
                Maps.tempMethod(weeklyMonthTemperatures));
    }

    @Test
    public void tallyTest() {
        ArrayList<String> results = new ArrayList<>();
        results.add("Bush");
        results.add("Bush");
        results.add("Bush");
        results.add("Shrub");
        results.add("Hedge");
        results.add("Shrub");
        results.add("Bush");
        results.add("Hedge");
        results.add("Bush");
        String expected = "Bush";
        assertEquals(expected, Maps.tally(results));
    }
}
