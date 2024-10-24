package edu.week5_task1_a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ввод имени файла
        System.out.print("Введите путь к файлу в системе Linux (например, /home/user/file.txt): ");
        String filePath = scanner.nextLine();
        
        FileContentDisplay fileContentDisplay = new FileContentDisplay();
        fileContentDisplay.readFile(filePath);
    }
}
