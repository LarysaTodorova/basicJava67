package lesson_17.homework;

import java.util.Scanner;

public class gpt3 {
    /*
Напиши программу, которая:
Запрашивает у пользователя два числа.
Запрашивает математическую операцию (+, -, *, /).
Выполняет операцию и выводит результат.
Если пользователь вводит /, но второе число равно 0 — вывести сообщение:
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a first number: ");
        double firstNumber = scan.nextDouble();
        System.out.println("Enter a second number: ");
        double secondNumber = scan.nextDouble();
        System.out.println("Enter operation (+ - * /)");
        scan.nextLine();
        String operation = scan.nextLine();
        double result;

        if (operation.equals("+")) {
            result = firstNumber + secondNumber;
            System.out.println(result);
        } else if (operation.equals("-")) {
            result = firstNumber - secondNumber;
            System.out.println(result);
        } else if (operation.equals("*")) {
            result = firstNumber * secondNumber;
            System.out.println(result);
        } else if (operation.equals("/")) {
            if (secondNumber == 0) {
                System.out.println("Division by zero is not allowed!\n");
            } else {
                result = firstNumber / secondNumber;
                System.out.println(result);
            }
        } else {
            System.out.println("Unknown operation");
        }
    }
}
