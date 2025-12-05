package practiceIfElse;

import java.util.Scanner;

public class Task8 {
    /*
    Проверка треугольника
Ввод 3 сторон.
Если a+b>c && a+c>b && b+c>a → существует
Иначе → нет.
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter a: ");
        int a = input.nextInt();
        System.out.println("Please, enter b: ");
        int b = input.nextInt();
        System.out.println("Please, enter c: ");
        int c = input.nextInt();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Exists");
        } else {
            System.out.println("Not exists");
        }

    }
}
