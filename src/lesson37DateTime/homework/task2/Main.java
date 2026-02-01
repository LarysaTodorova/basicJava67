package lesson37DateTime.homework.task2;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        /*
        Используя форматирование при помощи класса DateTimeFormatter,
        выведите Вашу дату рождения в консоль по следующему шаблону -
        "Я родился (родилась) в 1983 году, 12 мая. Это был четверг. На часах было 9 часов 10 минут."
         */

        LocalDateTime myBirthday = LocalDateTime.of(
                1979, Month.AUGUST, 3, 16, 40, 59
        );

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(
                "'I was born in' y 'year,' d MMMM'. It was' EEEE'. The clock read' H 'hours' m 'minutes.'"
                , Locale.ENGLISH
        );

        System.out.println(formatter.format(myBirthday));
    }
}
