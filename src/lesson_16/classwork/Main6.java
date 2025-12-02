package lesson_16.classwork;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter integer number: ");
        String strNumber = scanner.nextLine();
        int number = Integer.parseInt(strNumber);
        System.out.println("Number: " + number);
    }

}
