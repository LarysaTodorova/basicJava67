package lesson21.gptPractice;

import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {
        /*
        Есть массив строк, в которых записаны числа в виде текста:
        ["10", "3", "25", "8", "15", "2", "40", "7"]
        Нужно:
        Используя StringBuilder
        Используя обычный for (с индексом)
        В ОБРАТНОМ ПОРЯДКЕ
        Вывести ТОЛЬКО те значения, которые:
        после преобразования в число
        делятся на 5 и больше 10
        Сформировать строку вида:
        <40, 25, 15>
         */

        String[] numbers = {"10", "3", "25", "8", "15", "2", "40", "7" };
        System.out.println("Numbers before change: " + Arrays.toString(numbers));

        StringBuilder builder = new StringBuilder();

        builder.append("<");

        int counter = 0;

        for (int i = numbers.length - 1; i >= 0; i--) {
            int number = Integer.parseInt(numbers[i]);
            if (number % 5 == 0 && number > 10) {
                if (counter > 0) {
                    builder.append(", ");
                }
                builder.append(numbers[i]);
                counter++;
            }
        }
        builder.append(">");
        System.out.println("Numbers after change: " + builder);
    }
}

/*
NOTE:
По условию число должно делиться на 5 и быть больше 10.
При обходе массива в обратном порядке корректный вывод:
<40, 15, 25>.
Пример <40, 25, 15> не соответствует обратному порядку массива.
 */
