package edu.week6_task2_a;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DictionaryConverter converter = new DictionaryConverter();
        
        System.out.print("Введите количество английских слов: ");
        int n = Integer.parseInt(scanner.nextLine());
        
        Map<String, List<String>> englishLatin = new TreeMap<>();
        
        for (int i = 0; i < n; i++) {
            System.out.print("Введите слово и переводы: ");
            String line = scanner.nextLine();
            
            String[] parts = line.split(" - ");
            String englishWord = parts[0];
            String[] latinWords = parts[1].split(", ");
            
            List<String> translations = Arrays.asList(latinWords);
            englishLatin.put(englishWord, translations);
        }
        
        Map<String, List<String>> latinEnglish = converter.convertToLatinEnglish(englishLatin);
        
        System.out.println(latinEnglish.size());
        for (Map.Entry<String, List<String>> entry : latinEnglish.entrySet()) {
            System.out.println(entry.getKey() + " - " + String.join(", ", entry.getValue()));
        }
    }
}
