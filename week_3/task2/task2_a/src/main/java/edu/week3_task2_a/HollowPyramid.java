package edu.week3_task2_a;

public class HollowPyramid {

    public static void printPyramid(int height, int spaceBetween) {

        for (int i = 1; i <= height; i++) {
            // Пробелы перед левой частью пирамиды
            for (int j = height; j > i; j--) {
                System.out.print(" ");
            }

            // Вывод левой части пирамиды
            for (int k = 1; k <= i; k++) {
                System.out.print("#");
            }

            // Печатаем пробелы в середине
            for (int m = 1; m <= spaceBetween; m++) {
                System.out.print(" ");
            }

            // Вывод правой части пирамиды
            for (int k = 1; k <= i; k++) {
                System.out.print("#");
            }

            System.out.println();
        }
    }
}

