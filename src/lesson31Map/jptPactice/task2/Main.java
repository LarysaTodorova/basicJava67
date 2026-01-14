package lesson31Map.jptPactice.task2;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        /*
        Дана строка:
        String text = "Java java JAVA is great and java is powerful";
        Посчитать, сколько раз встречается каждое слово
Игнорировать регистр
Результат сохранить в Map<String, Integer>
         */

        String text = "Java java JAVA is great and java is powerful";

        text = text.toLowerCase();

        String[] words = text.split(" ");

        Map<String, Integer> myMap = new HashMap<>();

        for (String word : words) {
            if (!word.isEmpty()) {
                if (myMap.containsKey(word)) {
                    myMap.put(word, myMap.get(word) + 1);
                } else {
                    myMap.put(word, 1);
                }
            }
        }

        System.out.println(myMap);

    }
}
