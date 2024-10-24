package edu.week5_task3_a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SensorDataProcessor dataProcessor = new SensorDataProcessor();

        // Ввод строки показаний
        System.out.print("Введите строку показаний с датчиков (макс. 512 символов): ");
        String input = scanner.nextLine();

        if (input.length() > 512) {
            System.out.println("Ошибка: строка превышает допустимую длину 512 символов.");
            return;
        }

        try {
            String[] sensorIds = new String[100];
            double[] sensorAverages = new double[100];
            int validSensors = dataProcessor.processSensorData(input, sensorIds, sensorAverages);

            System.out.print("Введите поле для сортировки (1 - по id датчика, 2 - по средней температуре): ");
            int sortField = scanner.nextInt();
            dataProcessor.sortSensorData(sensorIds, sensorAverages, validSensors, sortField);

            System.out.println("Результат:");
            for (int i = 0; i < validSensors; i++) {
                if (sensorIds[i] != null) {
                    System.out.println(sensorIds[i] + " " + sensorAverages[i]);
                }
            }
        } catch (SensorDataProcessor.TemperatureOutOfRangeException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
