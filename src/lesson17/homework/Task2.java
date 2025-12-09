package lesson17.homework;

import java.util.Scanner;

public class Task2 {
    /*
   Напишите программу, которая запрашивает у пользователя три числа. Программа должна определить наибольшее из трех чисел.
   Например:
   Ввод: -3, 10, 7 -> Результат: 10
   Ввод: 9, 3, 9 -> Результат: 9
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Please enter the second number: ");
        int secondNumber = scanner.nextInt();
        System.out.println("Please enter the third number: ");
        int thirdNumber = scanner.nextInt();

        int biggestNumber = firstNumber;

        if (secondNumber > biggestNumber) {
            biggestNumber = secondNumber;
        }
        if (thirdNumber > biggestNumber) {
            biggestNumber = thirdNumber;
        }
        System.out.println("The biggest number is: " + biggestNumber);
    }
}

