package basiclibrary;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

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




//
//    public static String tally(ArrayList<String> votes) {
//
//
//
//
//
//
//        return ;
//    }

}