package lesson19.classwork;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        double[] numbers = {5.4, 2.23, 8.9, 6.48, 1.15, 3.1415};

        System.out.println(numbers[2]);
        System.out.println(Arrays.toString(numbers));

        String[] words = {"Hello", "I", "study", "Java"};
        System.out.println(words[0]);
        System.out.println(Arrays.toString(words));

        words[3] = "Python";
        System.out.println(Arrays.toString(words));

        int arrayLength = words.length;
        System.out.println("Length of array words: " + arrayLength);
        System.out.println("Length of array numbers: " + numbers.length);
    }
}
