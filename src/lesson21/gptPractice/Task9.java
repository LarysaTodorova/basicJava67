package lesson21.gptPractice;

import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {
        /*
        Есть массив чисел:
        [3, 10, 7, 12, 5, 8, 20]

        Нужно:
        Используя StringBuilder
        Используя for
        Сформировать строку:
        только числа, которые делятся на 2 ИЛИ на 5

        Формат строки:
        <10; 12; 5; 8; 20>
         */

        int[] numbers = {3, 10, 7, 12, 5, 8, 20};

        System.out.println("Array before change: " + Arrays.toString(numbers));

        StringBuilder builder = new StringBuilder();

        builder.append("<");

        int counter = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0 || numbers[i] % 5 == 0) {
                if (counter > 0) {
                    builder.append("; ");
                }
                builder.append(numbers[i]);
                counter++;
            }
        }
        builder.append(">");
        System.out.println("Array after change: " + builder);
    }
}
