package practiceIfElse;

import java.util.Scanner;

public class Task5 {
    /*
    Определить знак числа
    Пользователь вводит число.
Вывести: "Positive", "Negative" или "Zero".
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter a number: ");
        double number = scanner.nextDouble();

        if (number < 0) {
            System.out.println("Negative");
        } else if (number > 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Zero");
        }

    }
}
