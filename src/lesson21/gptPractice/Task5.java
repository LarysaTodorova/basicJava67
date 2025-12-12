package lesson21.gptPractice;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {

        /*
        Есть массив городов:
        Berlin, Munich, Hamburg, Cologne, Dresden, Stuttgart, Hanover, Bonn

        Используя StringBuilder
        Используя обычный for (с индексом)
        В обратном порядке
        Вывести ТОЛЬКО города:
        длина названия больше 6 символов
        Сформировать строку вида:
        {Stuttgart | Dresden | Cologne | Hamburg | Munich}
         */

        String[] cities = {"Berlin", "Munich", "Hamburg", "Cologne", "Dresden", "Stuttgart", "Hanover", "Bonn" };
        System.out.println("Cities before change: " + Arrays.toString(cities));

        StringBuilder builder = new StringBuilder();
        builder.append("{");

        int counter = 0;

        for (int i = cities.length - 1; i >= 0; i--) {
            if (cities[i].length() > 6) {
                if (counter > 0) {
                    builder.append(" | ");
                }
                builder.append(cities[i]);
                counter++;
            }
        }
        builder.append("}");
        System.out.println("Cities after change: " + builder);
    }
}
