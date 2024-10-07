package edu.week1_task3;

class DodVolCalc {

    // Метод для расчета объема додекаэдра
    public static double calculateVolume(double edgeLength) {
        // Вычисление объема додекаэдра по формуле: V = (15 + 7 * sqrt(5)) / 4 * a^3
        double volume = (15 + 7 * Math.sqrt(5)) / 4 * Math.pow(edgeLength, 3);
        return volume;
    }
}