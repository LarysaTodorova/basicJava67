package lesson28.gptPractice.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        /*
        Дан список строк.
        Нужно найти первую строку длиной больше 5.
        Удалить все строки короче 4 символов ПЕРЕД ней.
        Саму найденную строку не удалять.
        Если такой строки нет — ничего не делать.
         */

        List<String> words = new ArrayList<>(List.of("cat", "dog", "apple", "banana", "kiwi"));

        System.out.println("List before sorting:");
        System.out.println(words);
        System.out.println();

        ListIterator<String> listIterator = words.listIterator();
        boolean found = false;

        // 1) Ищем первую строку длиной > 5
        while (listIterator.hasNext()) {
            String word = listIterator.next();
            if (word.length() > 5) {
                found = true;
                break;  // курсор стоит ПОСЛЕ найденного слова
            }
        }

        // 2) Если нашли — удаляем строки < 4 ПЕРЕД найденным словом
        if (found) {
            listIterator.previous();  // <-- шаг назад, чтобы "найденное слово" не попало под удаление

            while (listIterator.hasPrevious()) {
                String word1 = listIterator.previous();

                if (word1.length() < 4) {
                    listIterator.remove();
                }
            }
        }

        System.out.println("List after sorting:");
        System.out.println(words);
    }
}
