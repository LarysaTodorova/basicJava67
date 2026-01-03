package lesson28.gptPractice.task4;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        /*
        Дан список строк.
        Перед каждой строкой, начинающейся на "A",
        вставить строку "START".
         */

        List<String> words = new ArrayList<>(List.of("Banana", "Apple", "Avocado", "Cherry"));

        System.out.println("List before changing:");
        System.out.println(words);
        System.out.println();

        ListIterator<String> listIterator = words.listIterator();

        while (listIterator.hasNext()) {
            String word = listIterator.next();

            if (word.startsWith("A")) {
                listIterator.previous();  // вернуться на позицию ПЕРЕД word
                listIterator.add("START"); // вставить START перед word
                listIterator.next(); // вернуться обратно, чтобы не зациклиться
            }
        }
        System.out.println("List after changing:");
        System.out.println(words);
    }
}
/*
Я использую ListIterator, потому что он работает через курсор между элементами.
После next() курсор стоит после текущего элемента, поэтому я делаю previous(),
чтобы вставить START перед ним с помощью add().
После вставки возвращаюсь next(), чтобы корректно продолжить обход.

“ListIterator работает через курсор между элементами, что позволяет безопасно изменять список во время обхода.”
 */
