package edu.week3_task1_b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите номер месяца (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Введите год: ");
        int year = scanner.nextInt();

        int days = DaysInMonth.getDaysInMonth(month, year);

        if (days == -1) {
            System.out.println("Некорректный номер месяца.");
        } else {
            System.out.println("Количество дней в месяце: " + days);
        }
    }
}
