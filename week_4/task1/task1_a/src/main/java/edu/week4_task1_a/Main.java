package edu.week4_task1_a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем количество строк
        System.out.print("Введите количество строк: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Чистим буфер после nextInt

        // Создаем массив для строк
        String[] lines = new String[n];

        // Запрашиваем строки у пользователя
        System.out.println("Введите строки:");
        for (int i = 0; i < n; i++) {
            lines[i] = scanner.nextLine();
        }
                // Запрашиваем у пользователя строку для поиска
        System.out.print("Введите строку для поиска: ");
        String target = scanner.nextLine();

        // Вызываем метод для подсчета вхождений
        int occurrences = StringCount.countOccurrences(lines, target);

        // Выводим результат
        System.out.println("Количество вхождений \"" + target + "\": " + occurrences);

        // Закрываем Scanner
        scanner.close();
    }
}
