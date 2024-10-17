package edu.week4_task2_b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Создание объекта Scanner для ввода с клавиатуры
        Scanner scanner = new Scanner(System.in);

        // Просим пользователя ввести адрес IPv6
        System.out.print("Введите полный адрес IPv6 для проверки: ");
        String ipv6Address = scanner.nextLine();

        // Проверяем IPv6 на соответствие регулярному выражению
        if (IPv6Validator.isValidIPv6(ipv6Address)) {
            System.out.println("Введённый адрес \"" + ipv6Address + "\" соответствует стандарту IPv6 .");
        } else {
            System.out.println("Введённый адрес \"" + ipv6Address + "\" не соответствует стандарту IPv6.");
        }

        // Закрываем Scanner
        scanner.close();
    }
}
