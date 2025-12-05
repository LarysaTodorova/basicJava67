package practiceIfElse;

import java.util.Scanner;

public class Task6 {
    /*
    Билеты в кино
Возраст <7 — бесплатно
7–17 — скидка 50%
18–60 — полная цена
60 — скидка 30%
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter your age: ");
        int age = input.nextInt();

        if (age < 7) {
            System.out.println("Free");
        } else if (age <= 17) {
            System.out.println("50% discount");
        } else if (age < 60) {
            System.out.println("full price");
        } else {
            System.out.println("30% discount");
        }

    }
}
