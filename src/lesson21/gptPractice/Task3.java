package lesson21.gptPractice;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        /*
        Task 3: Вывести только города, начинающиеся на букву C или H
         */

        String[] cities = new String[8];
        cities[0] = "Berlin";
        cities[1] = "Munich";
        cities[2] = "Hamburg";
        cities[3] = "Cologne";
        cities[4] = "Dresden";
        cities[5] = "Stuttgart";
        cities[6] = "Hanover";
        cities[7] = "Bonn";



        System.out.println("Cities before change: " + Arrays.toString(cities));

        StringBuilder builder = new StringBuilder();
        builder.append("{");

        boolean first = true;

        for (int i = 0; i < cities.length; i++) {
            if (cities[i].startsWith("C") || cities[i].startsWith("H")) {
                if (!first) {
                    builder.append(" | ");
                }
                builder.append(cities[i]);
                first = false;
            }
        }
        builder.append("}");
        System.out.println("Cities after change: " + builder);
    }
}
