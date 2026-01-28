package lesson36Exceptions.classwork.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Задача: запросить у пользователя имя и возраст.
        // Вывести информацию о пользователе на экран.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Please enter your age: ");
        String stringAge = scanner.nextLine();

        System.out.println("User data successfully read");

        try {
            System.out.println("Start of block try");
            int age = Integer.parseInt(stringAge);

            System.out.println("Your age was successfully transform into a number " + age);

            System.out.println("Your name is " + name + " and your age is " + age);

            System.out.println("Finish of block try");

        } catch (NumberFormatException e) {
            System.out.println("Start of block catch");

            System.out.println("Error! You entered uncorrected data ");
            System.out.println("Message about exception " + e.getMessage());
            e.printStackTrace();

            System.out.println("Finish of block catch");
        }

        System.out.println("Work finished");

    }
}
