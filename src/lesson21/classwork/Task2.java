package lesson21.classwork;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {

        String text1 = "Java";
        String text2 = "Java";
        String text3 = new String("Hello");
        String text4 = new String("Hello");

        boolean result1 = text1 == text2;
        boolean result2 = text3 == text4;
        System.out.println("Are equal strings Java? - " + result1);
        System.out.println("Are equal strings Hello? - " + result2);
        System.out.println("Are equal strings Java? - " + text1.equals(text2));
        System.out.println("Are equal strings Hello? - " + text3.equals(text4));

        int[] numbers1 = {1, 2, 3};
        int[] numbers2 = {1, 2, 3};
        boolean result3 = numbers1.equals(numbers2);
        System.out.println("Are equal arrays? - " + result3);

        result3 = Arrays.equals(numbers1, numbers2);
        System.out.println("Are equal arrays? - " + result3);


    }
}
