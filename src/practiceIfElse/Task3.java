package practiceIfElse;

import java.util.Scanner;

public class Task3 {
    /*
Пользователь вводит температуру воздуха:
Если <0 → "Freezing"
Если 0–20 → "Cold"
Если 20–30 → "Warm"
Иначе → "Hot".
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temperature: ");
        int temperature = input.nextInt();

        if (temperature < 0) {
            System.out.println("Freezing");
        } else if (temperature < 20) {
            System.out.println("Cold");
        } else if (temperature < 30) {
            System.out.println("Warm");
        } else {
            System.out.println("Hot");
        }

    }
}
