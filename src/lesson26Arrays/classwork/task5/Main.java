package lesson26Arrays.classwork.task5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] clone = numbers.clone();

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(clone));

        System.out.println(numbers == clone);

        clone[2] = 100;
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(clone));
    }
}
