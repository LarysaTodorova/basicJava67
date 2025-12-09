package lesson_19.classwork;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {

        int a = 5;

        int[] numbers = new int[5];

        numbers[2] = 20;

        System.out.println("Value cell 2: " + numbers[2]);
        System.out.println(numbers[1]);

        boolean[] booleans = new boolean[5];
        System.out.println("Value cell 3 of array booleans: " + booleans[3]);

        String[] words = new String[5];
        System.out.println("Value cell 2 of array words: " + words[2]);

        // System.out.println("Value cell 5 of array words: " + words[5]);

        System.out.println(numbers);

        String stringArray = Arrays.toString(numbers);
        System.out.println("Array as a string: " + stringArray);
        System.out.println("Array as a string: " + Arrays.toString(numbers));

        words[3] = "Hello!";
        booleans[4] =  true;
        System.out.println(Arrays.toString(words));
        System.out.println(Arrays.toString(booleans));
    }
}
