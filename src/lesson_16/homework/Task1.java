package lesson_16.homework;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите свое имя: ");
        String name = scanner.nextLine();
        System.out.println("Введите фамилию: ");
        String surname = scanner.nextLine();
        System.out.println("Введите отчество: ");
        String lastName = scanner.nextLine();

        char charName = name.charAt(0);
        char charLastName = lastName.charAt(0);

        System.out.println(name + " " + surname + " " + lastName + " (" + charName + "." + charLastName + ". " + surname + ")");


    }
}
