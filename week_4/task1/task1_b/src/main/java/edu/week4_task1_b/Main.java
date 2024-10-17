package edu.week4_task1_b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем у пользователя строку для анализа
        System.out.print("Введите строку для анализа: ");
        String input = scanner.nextLine();

        // Проверяем, что строка не пустая
        if (input.isEmpty()) {
            System.out.println("Строка не должна быть пустой.");
            scanner.close();
            return;
        }

        // Вызываем метод для расчёта энтропии
        double entropy = ShannonEntropy.calculateEntropy(input);

        // Форматируем и выводим результат
        System.out.printf("Энтропия по Шеннону: %.2f\n", entropy);

        // Закрываем Scanner
        scanner.close();
    }
}
