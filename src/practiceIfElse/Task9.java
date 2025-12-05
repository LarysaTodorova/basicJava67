package practiceIfElse;

import java.util.Scanner;

public class Task9 {
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
        } else if (operation.equals("^")) {
            result = Math.pow(firstNumber, secondNumber);
            System.out.println(result);
        } else if (operation.equals("%")) {
            result = firstNumber % secondNumber;
            System.out.println(result);
        } else {
            System.out.println("Unknown operation");
        }
    }
}
