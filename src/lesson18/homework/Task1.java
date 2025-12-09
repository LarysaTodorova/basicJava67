package lesson18.homework;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /*
   Напишите программу, перемножающую чётные числа, которые вводит пользователь.
   Программа должна перемножить любое количество чётных чисел, которое введёт пользователь.
   Ввод должен быть остановлен, если пользователь введёт ноль, после этого должен быть отображён на экране результат умножения.
         */
        Scanner input = new Scanner(System.in);

        int result = 1;

        while (true) {
            System.out.println("Enter number:");
            int number = Integer.parseInt(input.nextLine());

            if (number == 0) {
                System.out.println("Result: " + result);
                break;
            } else if (number % 2 == 0) {
                result *= number;
            }
        }
    }
}
