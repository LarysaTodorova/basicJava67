package lesson21.gptPractice;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        /*
        Вывести города в обратном порядке:
        Berlin, Munich, Hamburg, Cologne, Dresden, Stuttgart
        {Stuttgart | Dresden | Cologne | Hamburg | Munich | Berlin}
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

        for (int i = cities.length - 1; i >= 0; i--) {
            builder.append(cities[i]);
            if (i > 0) {
                builder.append(" | ");
            }
        }
        builder.append("}");
        System.out.println("Cities after change: " + builder);

    }
}
