package edu.week1_task3;

import java.util.Scanner;

class DodVolCalc {

    // Метод для расчета объема додекаэдра
    public static double calculateVolume(double edgeLength) {
        // Вычисление объема додекаэдра по формуле: V = (15 + 7 * sqrt(5)) / 4 * a^3
        double volume = (15 + 7 * Math.sqrt(5)) / 4 * Math.pow(edgeLength, 3);
        return volume;
    }
}

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