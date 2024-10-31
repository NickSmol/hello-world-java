package edu.week6_task3_a;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class ArrayProcessor {
    public static Queue<Integer> removeDuplicates(int[] inputArray) {
        Set<Integer> uniqueSet = new HashSet<>();
        Queue<Integer> uniqueQueue = new LinkedList<>();

        for (int num : inputArray) {
            if (uniqueSet.add(num)) {
                uniqueQueue.add(num);
            }
        }
        return uniqueQueue;
}
}
