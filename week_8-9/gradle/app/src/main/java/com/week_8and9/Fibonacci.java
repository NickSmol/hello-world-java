package com.week_8and9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Fibonacci {

    // Итеративный метод для вычисления чисел Фибоначчи
    public static long classicFibonacciIterative(int n) {
        if (n <= 1) {
            return n;
        }
        
        long a = 0;  // F(0)
        long b = 1;  // F(1)
        
        for (int i = 2; i <= n; i++) {
            long temp = a + b;
            a = b;
            b = temp;
        }
        
        return b;
    }

    // Оптимизированный метод с кешированием (мемоизация)
    public static long optimizedFibonacci(int n, Map<Integer, Long> cache) {
        if (n <= 1) {
            return n;
        }

        // Если результат уже есть в кеше, возвращаем его
        if (cache.containsKey(n)) {
            return cache.get(n);
        }

        // Вычисляем и добавляем в кеш
        long result = optimizedFibonacci(n - 1, cache) + optimizedFibonacci(n - 2, cache);
        cache.put(n, result);

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число n для вычисления F(n): ");
        int n = scanner.nextInt();

        // Итеративный метод
        System.out.println("\nИтеративный метод:");
        long startClassic = System.currentTimeMillis();
        System.out.println("F(" + n + ") = " + classicFibonacciIterative(n));
        long endClassic = System.currentTimeMillis();
        System.out.println("Время выполнения: " + (endClassic - startClassic) + " мс");

        // Оптимизированный метод с кешированием
        System.out.println("\nОптимизированный метод:");
        long startOptimized = System.currentTimeMillis();
        Map<Integer, Long> cache = new HashMap<>();
        System.out.println("F(" + n + ") = " + optimizedFibonacci(n, cache));
        long endOptimized = System.currentTimeMillis();
        System.out.println("Время выполнения: " + (endOptimized - startOptimized) + " мс");

        scanner.close();
    }
}
