package edu.week3_task2_b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число для нахождения квадратного корня: ");
        double number = scanner.nextDouble();;

        double sqrtHeronValue = HeronMethod.sqrtHeron(number);

        double sqrtMathValue = Math.sqrt(number);

        System.out.printf("Квадратный корень числа %.5f методом Герона: %.5f\n", number, sqrtHeronValue);
        System.out.println();
        System.out.println("Проверка на коректность вычислений");
        System.out.printf("Квадратный корень числа %.5f методом Math: %.5f\n", number, sqrtMathValue);
        System.out.println("Разница между результатами: " + Math.abs(sqrtHeronValue - sqrtMathValue));
    }
}
