package lesson38InputOutput.classwork.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String massage = "Hello World!";
        System.out.println(massage);

        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();
        System.out.println(value);

        int a = scanner.nextInt();
        System.out.println(a);
    }
}
