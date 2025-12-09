package lesson18.classwork;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

/*
        Задача: Пользователь вводит число.
        Если число равно 1 - вывести фразу "Ваше число равно единице".
        Если число равно 2 - вывести фразу "Ваше число равно двойке".
        Если число равно 3 или 4 - вывести фразу "Ваше число равно тройке или четвёрке".
        Если число равно 5 - вывести фразу "Ваше число равно пятёрке".
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter a number: ");
        int number = Integer.parseInt(input.nextLine());

        switch (number) {
            case 1:
                System.out.println("Your number is one.");
                break;
            case 2:
                System.out.println("Your number is two.");
                break;
            case 3:
                System.out.println("Your number is three or four.");
                break;
            case 4:
                System.out.println("Your number is three or four.");
                break;
            case 5:
                System.out.println("Your number is five.");
                break;
        }
    }
}
