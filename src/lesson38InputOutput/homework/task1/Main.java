package lesson38InputOutput.homework.task1;

import java.util.Date;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        /*
        Создайте объект текущей даты.
Создайте текстовую переменную и поместите туда имя Майк.
Создайте целочисленную переменную и поместите туда значение 32.
При помощи метода printf и созданных переменных выведите в консоль фразу -
"Привет! Меня зовут Майк и мне 32 года. Сегодня вторник, 27 августа, и я занимаюсь изучением ООП."
Метод printf должен читать значения из созданных переменных.
         */

        Date currentDate = new Date();
        Locale englishLocale = new Locale("en", "GB");
        String name = "Mike";
        int age = 32;

        System.out.printf(englishLocale,"Hello! My name is %s and I'm %d years old. Today is %3$tA, %3$td %3$tB, and I study OOP.%n",
                name, age, currentDate);
    }
}
