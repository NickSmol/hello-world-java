package edu.week5_task3_a;

public class SensorDataProcessor {

    // Метод для обработки данных и вычисления средней температуры
    public int processSensorData(String input, String[] sensorIds, double[] sensorAverages) throws TemperatureOutOfRangeException {
        String[] readings = input.split("@");

        int[] sums = new int[100];   // Суммы температур для каждого датчика
        int[] counts = new int[100]; // Количество показаний для каждого датчика

        for (String reading : readings) {
            if (reading.length() < 3) {
                continue;
            }

            String idStr = reading.substring(0, 2);  
            String temperatureStr = reading.substring(2);

            try {
                int id = Integer.parseInt(idStr);
                int temperature = Integer.parseInt(temperatureStr);

                if (temperature < -50 || temperature > 50) {
                    throw new TemperatureOutOfRangeException("Температура выходит за допустимые пределы: " + temperature);
                }

                sums[id] += temperature;
                counts[id]++;
            } catch (NumberFormatException e) {
                continue;
            }
        }

        // Вычисление средней температуры для каждого датчика
        int validSensors = 0;
        for (int id = 0; id < 100; id++) {
            if (counts[id] > 0) {
                sensorIds[validSensors] = String.format("%02d", id);
                sensorAverages[validSensors] = (double) sums[id] / counts[id]; // Средняя температура
                validSensors++;
            }
        }

        return validSensors;
    }

    // Метод для сортировки данных
    public void sortSensorData(String[] sensorIds, double[] sensorAverages, int validSensors, int sortField) {
        for (int i = 0; i < validSensors - 1; i++) {
            for (int j = i + 1; j < validSensors; j++) {
                boolean swap = false;
                if (sortField == 1) {
                    // Сортировка по id
                    if (sensorIds[i].compareTo(sensorIds[j]) > 0) {
                        swap = true;
                    }
                } else if (sortField == 2) {
                    // Сортировка по средней температуре
                    if (sensorAverages[i] > sensorAverages[j]) {
                        swap = true;
                    }
                }

                if (swap == true) {
                    String tempId = sensorIds[i];
                    sensorIds[i] = sensorIds[j];
                    sensorIds[j] = tempId;

                    double tempAverage = sensorAverages[i];
                    sensorAverages[i] = sensorAverages[j];
                    sensorAverages[j] = tempAverage;
                }
            }
        }
    }

    static class TemperatureOutOfRangeException extends Exception {
        public TemperatureOutOfRangeException(String message) {
            super(message);
        }
    }
}
