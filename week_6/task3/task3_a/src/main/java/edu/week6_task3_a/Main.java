package edu.week6_task3_a;

import java.util.Queue;

public class Main {
       public static void main(String[] args) {
        int[] inputArray = ArrayInputOutput.inputArray();
        
        Queue<Integer> uniqueQueue = ArrayProcessor.removeDuplicates(inputArray);
        
        ArrayInputOutput.outputQueue(uniqueQueue);
    }
}
