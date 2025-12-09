package lesson18.homework;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        /*
         Доработайте вторую задачу таким образом, чтобы у пользователя было только пять попыток ввода.
         После пятой некорректной попытки программа должна завершаться с сообщением "Ошибка регистрации!".
         */
        Scanner input = new Scanner(System.in);
        int counter = 0;

        System.out.println("Please, enter your password:");

        while (true) {
            String password = input.nextLine();
            if (counter >= 4) {
                System.out.println("Registration error!");
                break;
            }
            if (password.length() < 8) {
                System.out.println("Password too short, try again");
                counter++;
            }
            if (password.length() >= 8) {
                System.out.println("Password Ok");
                break;
            }
        }
    }
}

