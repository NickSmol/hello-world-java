package edu.week3_task2_b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число для нахождения квадратного корня: ");
        double number = scanner.nextDouble();

        double tolerance = 1e-6;

        double sqrtHeronValue = HeronMethod.sqrtHeron(number, tolerance);

        double sqrtMathValue = Math.sqrt(number);

        System.out.printf("Квадратный корень числа %.5f методом Герона: %.5f\n", number, sqrtHeronValue);

        if (Math.abs(sqrtHeronValue - sqrtMathValue) < tolerance)
        {
            System.out.println("Корень числа расчитан верно");
        }
        else{
            System.out.println("Ошибка. Расчёт неверный.");
        }
    }
}
