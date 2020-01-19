package basiclibrary;

import java.util.*;

public class Maps {

    public static String tempMethod(int[][] weeklyMonthTemperatures) {
        String weatherTemp = "";
        HashSet<Integer> tempSet = new HashSet<>();
        for (int[] week : weeklyMonthTemperatures) {
            for (int day : week) {
                tempSet.add(day);
            }
        }
        Object objMin = Collections.min(tempSet);
        Object objMax = Collections.max(tempSet);
        weatherTemp += "High: " + (int) objMax + "\n";
        weatherTemp += "Low: " + (int) objMin + "\n";

        for (int i = (int) objMin; i < (int) objMax; i++) {
            if (!tempSet.contains(i)) {
                weatherTemp += "Never saw temperature: " + i + "\n";
            }
        }
        return weatherTemp;
    }


    public static String tally(ArrayList<String> results) {
        HashMap<String, Integer> votes = new HashMap<>();
        for (String result : results) {
            votes.put(result, 0);
        }
        for (String result : results) {
            votes.put(result, votes.get(result) + 1);
        }
        int winningCount = 0;
        String president = "";
        for (String contestant : votes.keySet()) {
            if (votes.get(contestant) > winningCount) {
                winningCount = votes.get(contestant);
                president = contestant;
            }
        }
        return president;
    }
}