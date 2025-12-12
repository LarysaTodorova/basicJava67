package lesson21.gptPractice;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {

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

        int counter = 0;

        for (String city : cities) {
            if (city.startsWith("M") || city.startsWith("H")) {
                if (counter > 0) {
                    builder.append(" | ");
                }
                builder.append(city);
                counter++;
            }
        }
        builder.append("}");
        System.out.println("Cities after change: " + builder);
    }
}
