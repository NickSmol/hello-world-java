package edu.week1_task3;

import java.util.Scanner;

public class DodVol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину ребра додекаэдра: ");
        double edgeLength = scanner.nextDouble();

        // Вызывается метод для расчёта объема
        double volume = DodVolCalc.calculateVolume(edgeLength);
        System.out.printf("Объём додекаэдра с ребром %.2f равен %.2f\n", edgeLength, volume);

        scanner.close();
    }
}