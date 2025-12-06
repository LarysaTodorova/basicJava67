package lesson_18.homework;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /*
   Напишите программу, перемножающую чётные числа, которые вводит пользователь.
   Программа должна перемножить любое количество чётных чисел, которое введёт пользователь.
   Ввод должен быть остановлен, если пользователь введёт ноль, после этого должен быть отображён на экране результат умножения.
         */
        Scanner input = new Scanner(System.in);

        int result = 0;

        while (true) {
            System.out.println("Please enter a first number: ");
            int firstNumber = Integer.parseInt(input.nextLine());
            if (firstNumber == 0) {
                System.out.println("Result: " + result);
                break;
            }
            System.out.println("Please enter a second number: ");
            int secondNumber = Integer.parseInt(input.nextLine());
            if (secondNumber == 0) {
                System.out.println("Result: " + result);
                break;
            }
            if (firstNumber % 2 == 0 && secondNumber % 2 == 0) {
                result = firstNumber * secondNumber;
            }
        }
    }
}
