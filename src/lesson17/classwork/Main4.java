package lesson17.classwork;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        if (age >= 18) {
            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            System.out.println(name + ", you can participate in the elections.");
            System.out.println("Recorded, " + name);
        } else {
            System.out.println("You can't participate in the elections.");
        }

    }

}
