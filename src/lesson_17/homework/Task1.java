package lesson_17.homework;

import java.util.Scanner;

public class Task1 {
    /*
    Напишите программу, которая запрашивает у пользователя число. Если введённое число делится на 5 без остатка,
    программа должна выводить результат деления, иначе выводить результат деления и остаток.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter a number: ");
        int number = scanner.nextInt();
        int result = number / 5;
        int rest = number % 5;

        if (rest == 0) {
            System.out.println("Result: " + result);
        } else {
            System.out.println("Result: " + result +  " , rest: " + rest);
        }

    }

}
