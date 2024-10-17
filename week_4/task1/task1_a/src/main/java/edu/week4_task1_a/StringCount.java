package edu.week4_task1_a;

public class StringCount {
    // Метод для подсчета вхождений строки в массив строк
    public static int countOccurrences(String[] lines, String target) {
        int count = 0;

        for (int i = 0; i < lines.length; i++) {
            // Считаем количество вхождений целевой строки в текущей строке
            int index = 0;
            while ((index = lines[i].indexOf(target, index)) != -1) {
                count++;
                index += target.length(); // Продвигаемся дальше после найденного вхождения
            }
        }

        return count;
    }
}

