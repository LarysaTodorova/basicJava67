package lesson21.gptPractice;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        /*
        Task: Сформировать строку из массива городов
Создай массив типа String из 6 городов:
Berlin, Munich, Hamburg, Cologne, Dresden, Stuttgart
Используя StringBuilder и цикл, построй строку вида:
Cities: {Berlin | Munich | Hamburg | Cologne | Dresden | Stuttgart}

Между городами должен стоять символ | (пробел, вертикальная палка, пробел)
Фигурные скобки { } — это часть строки и должны быть выведены.
Выведи в консоль получившуюся строку.
Пример ожидаемого вывода:
Cities: {Berlin | Munich | Hamburg | Cologne | Dresden | Stuttgart}

Важно:
Нельзя использовать Arrays.toString()
Нельзя заранее писать всю строку
Нужно использовать StringBuilder + цикл + условие "если не последний элемент"
         */

        String[] cities = new String[6];
        cities[0] = "Berlin";
        cities[1] = "Munich";
        cities[2] = "Hamburg";
        cities[3] = "Cologne";
        cities[4] = "Dresden";
        cities[5] = "Stuttgart";

        System.out.println("Cities before change: " + Arrays.toString(cities));

        StringBuilder builder = new StringBuilder();
        builder.append("{");

        for (int i = 0; i < cities.length; i++) {
            builder.append(cities[i]);
            if (i < cities.length - 1) {
                builder.append(" | ");
            }
        }
        builder.append("}");
        System.out.println("Cities after change: " + builder);

    }
}
