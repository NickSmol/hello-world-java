package edu.week1_task2;

public class MinMaxValues {

    public static void main(String[] args) {

        // Целочисленные типы данных
        System.out.println("Целочисленные типы данных\n");

        // byte: 8 бит. Значения от -128 до 127.
        // Это связано с тем, что 8 бит позволяют представить 2^8 (256) значений, половина из которых
        // используется для отрицательных чисел в диапазоне от -128 до 127, с учётом того, что 0 занимает одно из значений.
        System.out.println("Тип переменной: byte ");
        System.out.println("Максимальное значение: " + Byte.MAX_VALUE);
        System.out.println("Минимальное значение: " + Byte.MIN_VALUE + "\n");

        // short: 16 бит. Значения от -32,768 до 32,767.
        // 16 бит позволяют представить 2^16 (65,536) значений, где половина отрицательные.
        System.out.println("Тип переменной: short");
        System.out.println("Максимальное значение short: " + Short.MAX_VALUE);
        System.out.println("Минимальное значение short: " + Short.MIN_VALUE + "\n");

        // int: 32 бита. Значения от -2^31 (-2,147,483,648) до 2^31 - 1 (2,147,483,647).
        // 32 бита дают возможность представить 2^32 различных значений, половина для отрицательных.
        System.out.println("Тип переменной: int");
        System.out.println("Максимальное значение int: " + Integer.MAX_VALUE);
        System.out.println("Минимальное значение int: " + Integer.MIN_VALUE + "\n");

        // long: 64 бита. Значения от -2^63 (-9,223,372,036,854,775,808) до 2^63 - 1 (9,223,372,036,854,775,807).
        // Аналогично, 64 бита дают 2^64 возможных значений, где половина отрицательные.
        System.out.println("Тип переменной: long");
        System.out.println("Максимальное значение long: " + Long.MAX_VALUE);
        System.out.println("Минимальное значение long: " + Long.MIN_VALUE + "\n");

        // Числа с плавающей запятой
        System.out.println("Числа с плавающей запятой\n");

        // float: 32-битное число с плавающей точкой, основанное на стандарте IEEE 754.
        // Это стандарт, который определяет представление чисел с плавающей точкой, где максимальное и минимальное значения
        // float зависят от разрядности мантиссы и экспоненты.
        System.out.println("Тип переменной: float");
        System.out.println("Максимальное значение float: " + Float.MAX_VALUE);
        System.out.println("Минимальное положительное значение float: " + Float.MIN_VALUE);
                System.out.println("Минимальное отрицательное значение float: " + -Float.MAX_VALUE + "\n");

        // double: 64-битное число с плавающей точкой по стандарту IEEE 754.
        // Для double возможен гораздо больший диапазон значений из-за увеличенной разрядности.
        System.out.println("Тип переменной: double");
        System.out.println("Максимальное значение double: " + Double.MAX_VALUE);
        System.out.println("Минимальное положительное значение double: " + Double.MIN_VALUE);
        System.out.println("Минимальное отрицательное значение double: " + -Double.MAX_VALUE + "\n");

    }
}
