package lesson38InputOutput.classwork.task3;

import lesson33Lambdas.classwork.task2.Cat;

import java.util.Date;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        System.out.print("One! ");
        System.out.print("Two! ");
        System.out.print("Three! ");

        System.out.println("One!");
        System.out.println("Two!");
        System.out.println("Three!");

        System.out.printf("One!%nTwo%nThree%n");

        int x = 5;
        int y = 7;

        System.out.println("Sum " + x + " and " + y + " is " + (x + y));
        System.out.printf("Sum %d and %d is %d%n", x, y, x + y);

        String name = "Alex";
        System.out.printf("Hello, %s! Nice to meet you.%n", name);

        System.out.printf("Number P is %f.%n", Math.PI);
        System.out.printf("Number P is %.2f.%n", Math.PI);
        System.out.printf("Number P is %.4f.%n", Math.PI);
        System.out.printf("Number P is %.10f.%n", Math.PI);

        System.out.printf("x less than y - %b%n", x < y);
        System.out.printf("X MORE THAN Y - %B%n", x > y);

        char button = 'Y';
        System.out.printf("Enter %c, if you are agree.%n", button);

        Cat cat = new Cat("Ginger", 5, 4.75);
        System.out.printf("I have a cat - %s. He likes to eat.%n", cat);

        Date date = new Date();
        Locale englishLocale = new Locale("en", "UK");
        System.out.printf(englishLocale, "Today is %td %tB %tY, %tA, locale time - %tT.%n",
                date, date, date, date, date);

        System.out.printf(englishLocale, "Today is %1$td %1$tB %1$tY, %1$tA, locale time - %1$tT.%n",
                date);
    }
}
