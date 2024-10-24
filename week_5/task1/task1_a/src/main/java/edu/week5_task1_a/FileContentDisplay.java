package edu.week5_task1_a;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileContentDisplay {
    public void readFile(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            System.out.println("Содержимое файла:");
            
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка: Файл не найден. Проверьте правильность пути: " + filePath);
        } catch (IOException e) {
            System.out.println("Ошибка: Произошла ошибка при чтении файла. " + e.getMessage());
        }
    }
}
