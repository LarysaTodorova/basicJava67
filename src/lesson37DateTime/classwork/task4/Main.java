package lesson37DateTime.classwork.task4;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("'Now is' H:m");
        System.out.println(formatter.format(now));

        LocalDateTime futureDate = LocalDateTime.of(
                2030, Month.APRIL, 15, 11, 29, 36);
        System.out.println(formatter.format(futureDate));

    }
}
