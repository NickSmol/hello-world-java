package edu.week6_task3_a;

import java.util.Queue;
import java.util.Scanner;

public class ArrayInputOutput {
    public static int[] inputArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите элементы массива через пробел:");
        
        String input = scanner.nextLine();
        String[] inputStrings = input.split(" "); 
        
        int[] inputArray = new int[inputStrings.length];
        for (int i = 0; i < inputStrings.length; i++) {
            inputArray[i] = Integer.parseInt(inputStrings[i]);
        }
        
        return inputArray; 
    }

    public static void outputQueue(Queue<Integer> queue) {
        System.out.print("Массив с уникальными элементами: [");
        while (!queue.isEmpty()) {
            System.out.print(queue.poll()); 
            if (!queue.isEmpty()) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
