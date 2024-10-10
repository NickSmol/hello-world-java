package edu.week3_task3_b;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        double[] array = new double[size];

        System.out.println("Введите элементы массива по одному:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextDouble();
        }

        MergeSort.mergeSort(array, 0, size - 1);

        System.out.println("Отсортированный массив:");
        for (double num : array) {
            System.out.print(num + " ");
        }
    }
}
