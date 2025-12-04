package lesson_17.homework;

import java.util.Scanner;

public class gpt2 {
    /*
    Напиши программу, которая:
    Запрашивает у пользователя целое число.
    Определяет и выводит, является ли оно чётным или нечётным.
    Если число равно 0, вывести отдельное сообщение:
    "Number is zero"
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = scanner.nextInt();

        boolean isEven = number % 2 == 0;

        if (number == 0) {
            System.out.println("Number is zero");
        }else if (isEven) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }

    }
}
