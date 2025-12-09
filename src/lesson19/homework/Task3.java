package lesson19.homework;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
/*
Напишите программу, которая находит в созданном заранее массиве целых чисел максимальное и минимальное значения
и меняет их местами.
 */

        int[] numbers = {3, -15, 0, 10, 5, 11, 6, 50};
        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < numbers[minIndex]) {
                minIndex = i;
            }
            if (numbers[i] > numbers[maxIndex]) {
                maxIndex = i;
            }
        }

        int temp = numbers[minIndex];
        numbers[minIndex] = numbers[maxIndex];
        numbers[maxIndex] = temp;

        System.out.println(Arrays.toString(numbers));

    }
}
