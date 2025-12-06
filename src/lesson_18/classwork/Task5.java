package lesson_18.classwork;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        /*
        Задача: пользователь вводит название своего домашнего животного.
        Если это кошка или кот, вывести на экран - "Отлично! Вы счастливый обладатель кошки".
        Если это собака, вывести на экран - "Поздравляем! У вас есть собака".
        Если пользователь введёт какое-то другое животное, вывести на экран -
        "У вас какое-то другое животное".
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Введите какое у вас домашнее животное: ");
        String pet = input.nextLine().toLowerCase();

        switch (pet) {
            case "cat":
                System.out.println("Отлично! Вы счастливый обладатель кошки");
                break;
            case "dog":
                System.out.println("Поздравляем! У вас есть собака");
                break;
            default:
                System.out.println("У вас какое-то другое животное");
                break;
        }
    }
}
