package lesson19.homework;

public class Task2 {
    public static void main(String[] args) {
/*
Создайте массив, который состоит из нескольких положительных целых чисел.
Напишите программу, которая определяет и выводит на экран максимальное из чётных чисел массива.
 */

        int[] numbers = {3, 10, 5, 11, 6};
        int number = 0;

        for (int currentNumber : numbers) {
            if (currentNumber > number && currentNumber % 2 == 0) {
                number = currentNumber;
            }
        }
        System.out.println(number);

    }
}
