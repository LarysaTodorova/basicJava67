package practiceIfElse;

import java.util.Scanner;

public class Task1 {
    /*
    Пользователь вводит возраст.
Если >= 18 → вывести "Access granted", иначе → "Access denied".
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("Access granted");
        } else {
            System.out.println("Access denied");
        }

    }
}
