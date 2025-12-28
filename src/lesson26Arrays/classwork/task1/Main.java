package lesson26Arrays.classwork.task1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String[] words;
        words = new String[5];

        int[] numbers = new int[5];

        boolean[] booleans = new boolean[5];

        System.out.println(Arrays.toString(words));
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(booleans));

        int[] numbers1 = {11, 25, 33, 49, 50};
        System.out.println(Arrays.toString(numbers1));

        numbers1[3] = 40;
        System.out.println(Arrays.toString(numbers1));
        System.out.println(numbers1[2]);
        System.out.println(numbers1.length);

        numbers1 = new int[7];
        System.out.println(Arrays.toString(numbers1));
    }
}
