package edu.week3_task1_a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите возраст: ");
        int userAge = scanner.nextInt();

        System.out.println("Ваш возраст: " + AgeAnalyse.getAgeDeclension(userAge));
    }
}
