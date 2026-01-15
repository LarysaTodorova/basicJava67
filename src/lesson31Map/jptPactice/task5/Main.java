package lesson31Map.jptPactice.task5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        /*
        Задача 5 — Группировка по первой букве (interview)
Условие:
Дан список слов:
List<String> words = List.of("Apple", "Avocado", "Banana", "Blueberry", "Cherry");
Нужно получить:
Map<Character, List<String>>
         */

        List<String> words = List.of("Apple", "Avocado", "Banana", "Blueberry", "Cherry");

        Map<Character, List<String>> myMap = new HashMap<>();

        for (String word : words) {
            if (!word.isEmpty()) {
                word = word.toLowerCase();
                Character letter = word.charAt(0);
                if (!myMap.containsKey(letter)) {
                    myMap.put(letter, new ArrayList<>());
                }
                myMap.get(letter).add(word);
            }
        }

        System.out.println(myMap);

    }
}
