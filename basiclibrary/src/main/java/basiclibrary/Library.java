/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import java.util.Random;

public class Library {

    public static int[] roll(int n) {
        int numberOfSides = 6;
        int[] counts = new int[n];
        for (int i = 0; i < n; i++) {
            counts[i] = ((int) (Math.random() * numberOfSides) + 1);
        }
        return counts;
    }

//    method called containsDuplicates that returns true or false depending on whether the array contains duplicate values.

    public static boolean containsDuplicates(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == (array[j])) {
                    return true;
                }
            }
        }
        return false;
    }

    //    Calculating Averages
    public static float calculatingAverages(int[] array) {
        int total = 0;
        float average;
        for (int i = 0; i < array.length; i++) {
            total = total + array[i];
        }
        average = (float) total / (array.length);
        return average;
    }
    //    Arrays of Arrays
//    calculate the average value for each array and return the array with the lowest average.
    public static int arraysOfArrays(int[][] weatherArray) {
        int lowest = 999;
        for (int i = 0; i < weatherArray.length; i++) {
            int sum = 0;
            int average;
            for (int j = 0; j < weatherArray[i].length; j++) {
                sum = sum + weatherArray[i][j];
            }
            average = sum / (weatherArray[i].length);
            if (average < lowest) {
                lowest = average;
            }
        }
        return lowest;
    }
}




