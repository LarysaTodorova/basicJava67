package lesson21.gptPractice;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        /*
        Есть массив строк:
        ["cat", "elephant", "dog", "horse", "lion", "tiger"]
        Используя StringBuilder
        Используя обычный for
        Вывести ТОЛЬКО слова:
        длина строго больше 4 символов
        Сформировать строку вида:
        {elephant | horse | tiger}
         */

        String[] animals = {"cat", "elephant", "dog", "horse", "lion", "tiger" };

        System.out.println("Animals before change: " + Arrays.toString(animals));

        StringBuilder builder = new StringBuilder();
        builder.append("{");

        int counter = 0;

        for (int i = 0; i < animals.length; i++) {
            if (animals[i].length() > 4) {
                if (counter > 0) {
                    builder.append(" | ");
                }
                builder.append(animals[i]);
                counter++;
            }
        }
        builder.append("}");
        System.out.println("Animals after change: " + builder);

    }
}
