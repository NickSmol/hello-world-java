package edu.week7_task1;

import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку:");
        String input = scanner.nextLine();

        Map.Entry<Character, Long> result = StringProcessor.findMostFrequentCharacter(input);

        if (result != null) {
            System.out.println("Результат: ['" + result.getKey() + "', " + result.getValue() +"]");
        } else {
            System.out.println("Строка пуста.");
        }
    }
}
