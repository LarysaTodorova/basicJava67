package lesson17.classwork;

import java.util.Scanner;

public class Main3 {
      /*
      пользователь вводит свой возраст
      он может пройти на аттракцион, если он старше 10 и моложе 65

     */
    public static void main(String[] args) {

        int ageLowLimit = 10;
        int ageHighLimit = 65;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        boolean isAgeOk = age >= ageLowLimit && age <= ageHighLimit;

        System.out.println("attraction is available: " + isAgeOk);

    }

}
