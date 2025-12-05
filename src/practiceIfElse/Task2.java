package practiceIfElse;

import java.util.Scanner;

public class Task2 {
    /*
    Чётное или нечётное число
    Если число делится на 2 → "Even"
Если делится на 3 → "Divisible by 3"
Если делится и на 2, и на 3 → "Divisible by 6"
Иначе → "Not divisible".
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = input.nextInt();

        if (number % 6 == 0) {
            System.out.println("Divisible by 6");
        } else if (number % 2 == 0) {
            System.out.println("Divisible by 2");
        } else if (number % 3 == 0) {
            System.out.println("Divisible by 3");
        } else {
            System.out.println("Not divisible");
        }

    }
}
