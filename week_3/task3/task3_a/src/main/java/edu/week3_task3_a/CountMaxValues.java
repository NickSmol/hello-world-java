package edu.week3_task3_a;

import java.util.Scanner;

public class CountMaxValues {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Вводим размер массива
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        // Создаем массив типа double
        double[] numbers = new double[size];

        System.out.println("Введите элементы массива по одному:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextDouble();
        }

        // Нахождение максимальное значение
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

        // Выводим результат
        System.out.println("Маскимальное число: " + max + "\n" + "Количество чисел, равных максимальному: " + count);
    }
}