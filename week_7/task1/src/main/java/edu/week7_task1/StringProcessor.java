package edu.week7_task1;

import java.util.Map;
import java.util.stream.Collectors;

public class StringProcessor {
    public static Map.Entry<Character, Long> findMostFrequentCharacter(String s) {
        return s.chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(ch -> ch, Collectors.counting()))
                .entrySet()
                .stream()
                .collect(Collectors.maxBy(Map.Entry.comparingByValue()))
                .orElse(null);
    }
}