package edu.week3_task3_a;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        double[] numbers = new double[size];

        System.out.println("Введите элементы массива по одному:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextDouble();
        } 
    
        System.out.println("Количество чисел, равных максимальному: " + CountMaxValues.maxValuesCount(numbers,size));
    }
}
