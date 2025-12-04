package lesson_17.homework;

import java.util.Scanner;

public class gpt1 {
    /*
Напиши программу, которая:
Запрашивает у пользователя два целых числа.
Делит первое число на второе.
Если деление выполняется без остатка, выводит только результат.
Если есть остаток — выводит результат и остаток.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a first number:");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter a second number:");
        int secondNumber = scanner.nextInt();

        if (secondNumber == 0) {
            System.out.println("Division by zero is not allowed!");
        } else {
            int result = firstNumber / secondNumber;
            int rest = firstNumber % secondNumber;

            if (rest == 0) {
                System.out.println("Result is " + result);
            } else {
                System.out.println("Result is: " + result + ", rest is: " + rest);
            }
        }
    }
}
