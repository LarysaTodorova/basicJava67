package lesson21.gptPractice;

import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {

        String[] colors = {"red", "green", "blue", "yellow", "black", "white" };

        System.out.println("Colors before change: " + Arrays.toString(colors));

        StringBuilder builder = new StringBuilder();

        builder.append("{");

        boolean isFirst = true;

        for (int i = 0; i < colors.length; i++) {
            if (colors[i].length() > 5) {
                if (!isFirst) {
                    builder.append(" | ");
                }
                builder.append(colors[i]);
                isFirst = false;
            }
        }
        builder.append("}");
        System.out.println("Colors after change: " + builder);
    }
}

/*
Note:
в этом массиве выводится только слово yellow, т.к. его длина больше 5 символов у остальных цветов длина меньше
 */
