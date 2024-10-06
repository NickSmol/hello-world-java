package edu.week2_task1_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение радиуса: ");
        double radius = scanner.nextDouble();
        Octagon octagon = new Octagon(radius);

        System.out.println("Внутренний радиус: " + octagon.getInnerRadius());
        System.out.println("Площадь: " + octagon.calculateArea());
        System.out.println("Периметр: " + octagon.calculatePerimeter());
    }
}
