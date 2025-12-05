package practiceIfElse;

import java.util.Scanner;

public class Task15 {
    /*
    Проверка email.
    Если содержит @ и . → valid, иначе → invalid.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter your email: ");
        String email = scanner.nextLine();

        if (email.contains("@") && email.contains(".")) {
            System.out.println("Your email address is correct.");
        } else {
            System.out.println("Your email address is incorrect.");
        }

    }
}
