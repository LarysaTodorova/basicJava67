package practiceIfElse;

import java.util.Scanner;

public class Task10 {
    /*
    Конвертер валют
Пользователь вводит сумму и код валюты ("USD","EUR","UAH")
Программа выводит сумму в гривнах (курс задать вручную).
     */
    public static void main(String[] args) {

        double euro = 49.5;
        double dollar = 42.5;
        double result;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a summa: ");
        double sum = input.nextDouble();
        System.out.println("Enter a code: USD, EUR, or UAH");
        input.nextLine();
        String code = input.nextLine();

        if (code.equalsIgnoreCase("USD")) {
            result = sum * dollar;
            System.out.println(result + "UAH");
        } else if (code.equalsIgnoreCase("EUR")) {
            result = sum * euro;
            System.out.println(result + "UAH");
        } else if (code.equalsIgnoreCase("UAH")) {
            System.out.println((sum / dollar) + " USD");
            System.out.println((sum / euro) + " EUR");
        } else {
            System.out.println("Invalid code");
        }
    }
}
