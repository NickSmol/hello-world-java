package edu.week4_task2_a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Создание объекта Scanner для ввода с клавиатуры
        Scanner scanner = new Scanner(System.in);

        // Просим пользователя ввести email
        System.out.print("Введите адрес электронной почты для проверки: ");
        String email = scanner.nextLine();

        // Проверяем email на соответствие регулярному выражению
        if (EmailValidator.isValidEmail(email)) {
            System.out.println("Ввёдённая строка \"" + email + "\" является Email адресом.");
        } else {
            System.out.println("Ввёдённая строка \"" + email + "\" не является Email адресом.");
        }

        // Закрываем Scanner
        scanner.close();
    }
}
