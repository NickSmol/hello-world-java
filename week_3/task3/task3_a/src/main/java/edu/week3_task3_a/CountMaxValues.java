package edu.week3_task3_a;

import java.util.Scanner;

public class CountMaxValues {
    public static double maxValuesCount(double[] numbers, int size) {
        double max = numbers[0];
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            else if (numbers[i] == max) {
                count++;
            }
            }
            return count;
    }
}