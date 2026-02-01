package lesson37DateTime.classwork.task3;

import java.time.LocalDate;
import java.time.Month;

public class Mian {
    public static void main(String[] args) {

        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);

        LocalDate date = LocalDate.of(2020, Month.APRIL, 18);
        System.out.println(date);

        System.out.println(date.getMonth());
        System.out.println(date.getMonthValue());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getDayOfMonth());
        System.out.println(date.getDayOfYear());

        LocalDate newDate = date.plusMonths(1);
        System.out.println(newDate);

        newDate = newDate.minusYears(1).minusMonths(1).minusDays(5);
        System.out.println(newDate);


    }
}
