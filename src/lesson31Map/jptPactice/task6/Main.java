package lesson31Map.jptPactice.task6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        /*
        Задача 6 — Группировка по длине слова (interview-style)
Условие
Дан список слов:
List<String> words = List.of(
        "Java", "Spring", "Map", "Collection",
        "API", "HashMap", "List", "Stream"
);
Нужно получить:
Map<Integer, List<String>>
где:
ключ — длина слова
значение — список слов этой длины
         */

        List<String> words = List.of(
                "Java", "Spring", "Map", "Collection",
                "API", "HashMap", "List", "Stream"
        );

        Map<Integer, List<String>> mymap = new HashMap<>();

        for (String word : words) {
            if (!word.isEmpty()) {
                int wordLength = word.length();
                if (!mymap.containsKey(wordLength)) {
                    mymap.put(wordLength, new ArrayList<>());
                }
                mymap.get(wordLength).add(word);
            }
        }

        System.out.println(mymap);

    }
}
