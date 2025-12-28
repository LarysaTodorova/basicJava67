package lesson26Arrays.classwork.task3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] numbers = printNumbers(5);
        System.out.println(Arrays.toString(numbers));

        numbers = printNumbers(10);
        System.out.println(Arrays.toString(numbers));

    }

    // Задача: написать метод, который на вход принимает какое-то целое число N
    // и создаёт и возвращает массив размером N, заполненный значениями от 1 до N
    // Примеры:
    // 5 -> [1, 2, 3, 4, 5]
    // 3 -> [1, 2, 3]

    public static int[] printNumbers(int number) {
        int[] numbers = new int[number];
        for (int i = 0; i < number; i++) {
            numbers[i] = i + 1;
        }
        return numbers;
    }
}
