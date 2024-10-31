package edu.week6_task2_a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class DictionaryConverter {
    
    public Map<String, List<String>> convertToLatinEnglish(Map<String, List<String>> englishLatin) {
        Map<String, List<String>> latinEnglish = new TreeMap<>();
        
        for (Map.Entry<String, List<String>> entry : englishLatin.entrySet()) {
            String englishWord = entry.getKey();
            List<String> latinTranslations = entry.getValue();
            
            for (String latinWord : latinTranslations) {
                latinEnglish.computeIfAbsent(latinWord, k -> new ArrayList<>()).add(englishWord);
            }
        }
        
        for (List<String> translations : latinEnglish.values()) {
            Collections.sort(translations);
        }
        
        return latinEnglish;
    }
}
