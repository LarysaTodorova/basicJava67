package lesson_18.homework;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        /*
        Представьте, что пользователь придумывает себе пароль при регистрации.
        Правильный пароль должен быть не менее 8 символов в длину. Напишите программу,
         которая запрашивает пароль у пользователя. Причём попытки ввода должны повторяться до тех пор,
         пока пользователь не введёт корректный пароль.
         */
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Please, enter your password:");
            String password = input.nextLine();
            if (password.length() < 8) {
                System.out.println("Password too short, try again");
            } else {
                break;
            }
        }
    }
}
