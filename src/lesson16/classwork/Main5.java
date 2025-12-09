package lesson16.classwork;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hallo " + name);

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Your age is: " + age);

        System.out.println("Enter your weight: ");
        double weight = scanner.nextDouble();
        System.out.println("Your weight is: " + weight);

    }

}
