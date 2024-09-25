package practice_highlevelprog.week_1.task_3;

import java.util.Scanner;

public class DodVol {
    public static void main(String[] args) {
        // Создание объекта Scanner для ввода данных
        Scanner scanner = new Scanner(System.in);

        // Запрос длины ребра додекаэдра
        System.out.print("Введите длину ребра додекаэдра: ");
        double edgeLength = scanner.nextDouble();

        // Вычисление объема додекаэдра
        double volume = (15 + 7 * Math.sqrt(5)) / 4 * Math.pow(edgeLength, 3);

        // Вывод результата
        System.out.printf("Объем додекаэдра с длиной ребра %.2f равен %.2f\n", edgeLength, volume);
        
        // Закрытие сканера
        scanner.close();
    }
}
