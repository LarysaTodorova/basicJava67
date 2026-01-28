package lesson36Exceptions.classwork.task1;

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

        int age = Integer.parseInt(stringAge);
        System.out.println("Your age was successfully transform into a number " + age);

        System.out.println("Your name is " + name + " and your age is " + age);

        System.out.println("Work finished");

    }
}
