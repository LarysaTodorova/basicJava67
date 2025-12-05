package practiceIfElse;

import java.util.Scanner;

public class Task12 {
    /*
    Лифт
Лифт вмещает max 500 кг.
Пользователь вводит вес 3 людей.
Если сумма > 500 — "Overload"
Иначе → "OK".
     */
    public static void main(String[] args) {

        int max = 500;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the weight of first people: ");
        int firstWeight = input.nextInt();
        System.out.println("Enter the weight of second people: ");
        int secondWeight = input.nextInt();
        System.out.println("Enter the weight of third people: ");
        int thirdWeight = input.nextInt();
        int result = firstWeight + secondWeight + thirdWeight;

        if (result > max) {
            System.out.println("Overload");
        } else {
            System.out.println("Ok");
        }
    }
}
