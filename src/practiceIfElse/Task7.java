package practiceIfElse;

import java.util.Scanner;

public class Task7 {
    /*
    Оценка по баллам
Пользователь вводит число 1–100
|балл|результат|
|---|---|
|90–100|A|
|75–89|B|
|60–74|C|
|<60|D|
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter a score: ");
        int score = input.nextInt();
        String result;

        if (score >= 90) {
            result = "A";
            System.out.println("Your result: " + result);
        } else if (score >= 75) {
            result = "B";
            System.out.println("Your result: " + result);
        } else if (score >= 60) {
            result = "C";
            System.out.println("Your result: " + result);
        } else {
            result = "D";
            System.out.println("Your result: " + result);
        }
    }
}
