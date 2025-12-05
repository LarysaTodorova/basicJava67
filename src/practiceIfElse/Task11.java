package practiceIfElse;

import java.util.Scanner;

public class Task11 {
    /*
    Меню выбора
Пользователь вводит номер:
1 - Погода
2 - Новости
3 - Курсы валют
Вывести текст в зависимости от выбора.
Если другое число — "Unknown command".
     */
    public static void main(String[] args) {

        String one = "Weather";
        String two = "News";
        String three = "Exchange Rates";

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: 1, 2 or 3 ");
        int number = input.nextInt();

        if (number == 1) {
            System.out.println(one);
        } else if (number == 2) {
            System.out.println(two);
        } else if (number == 3) {
            System.out.println(three);
        } else {
            System.out.println("Unknown command");
        }
    }
}
