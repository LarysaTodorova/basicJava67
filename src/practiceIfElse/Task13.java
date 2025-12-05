package practiceIfElse;

import java.util.Scanner;

public class Task13 {
    /*
    Високосный год.
    Год високосный, если год % 400 == 0 или (год % 4 == 0 и год % 100 != 0).
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = input.nextInt();

        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("Leap year");
        } else {
            System.out.println("Year is not a leap");
        }
    }
}
