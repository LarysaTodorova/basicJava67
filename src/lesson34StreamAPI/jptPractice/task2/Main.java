package lesson34StreamAPI.jptPractice.task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        Дан List<String> words.
➡ Вернуть List<String> из тех же слов, но:
все буквы — в верхнем регистре
длина слова больше 3
         */

        List<String> words = new ArrayList<>(List.of("hello", "Apple", "world", "dog", "cat", "Lemon"));

        System.out.println("Original list: " + words);

        List<String> filteredWords = words.stream()
                .filter(word -> word.length() > 3)
                .map(String::toUpperCase)
                .toList();

        System.out.println("Filtered list: " + filteredWords);
    }
}
