package edu.week4_task1_b;

public class ShannonEntropy{
    // Метод для вычисления энтропии по Шеннону
    public static double calculateEntropy(String input) {
        if (input.isEmpty()) {
            return 0.0; // Возвращаем 0, если строка пустая
        }

        // Массив для хранения частоты символов (ASCII)
        int[] frequency = new int[256]; 
        int totalChars = input.length();

        // Подсчёт частоты символов
        for (char c : input.toCharArray()) {
            frequency[c]++;
        }

        // Вычисление энтропии
        double entropy = 0.0;
        for (int freq : frequency) {
            if (freq > 0) {
                double probability = (double) freq / totalChars;
                entropy -= probability * Math.log(probability) / Math.log(2); // Используем логарифм по основанию 2
            }
        }

        return entropy;
    }
}