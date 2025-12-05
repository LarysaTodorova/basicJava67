package practiceIfElse;

import java.util.Scanner;

public class Task4 {
    /*
Правильные логин="admin", пароль="1234".
Если совпало — "Welcome", иначе — "Wrong credentials".
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your login");
        String login = input.nextLine();
        System.out.println("Please enter your password");
        String password = input.nextLine();

        if (login.equals("admin") && password.equals("1234")) {
            System.out.println("Welcome");
        } else {
            System.out.println("Wrong credentials");
        }

    }
}

