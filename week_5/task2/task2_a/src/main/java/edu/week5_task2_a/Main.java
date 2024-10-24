package edu.week5_task2_a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DataTypeConverter converter = new DataTypeConverter();

        // Ввод данных
        System.out.print("Введите сообщение для преобразования: ");
        String input = scanner.nextLine();

        System.out.print("Введите тип, в который хотите преобразовать (int, double, bool, str): ");
        String targetType = scanner.nextLine();

        // Преобразование данных
        try {
            Object result = converter.convert(input, targetType);
            System.out.println("Преобразованное сообщение: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
