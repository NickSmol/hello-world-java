package edu.week3_task2_a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите высоту пирамиды: ");
        int height = scanner.nextInt();

        System.out.print("Введите ширину пробела между частями пирамиды: ");
        int spaceBetween = scanner.nextInt();

        HollowPyramid.printPyramid(height,spaceBetween);
    }
    
}
