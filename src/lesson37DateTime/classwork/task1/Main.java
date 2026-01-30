package lesson37DateTime.classwork.task1;

import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Date currentDate = new Date();
        System.out.println(currentDate);

        Date secondDate = new Date();
        System.out.println(secondDate);

        boolean result = currentDate.equals(secondDate);
        System.out.println("Are the dates equals? " + result);

        System.out.println("How many milliseconds have passed since midnight on 1 january 1970: ");
        System.out.println(currentDate.getTime());
        System.out.println(secondDate.getTime());

        Date date = new Date(126, 0, 30);
        System.out.println(date);

        Date futureDate = new Date(2000_000_000_000L);
        System.out.println("At 2 trillion milliseconds after midnight on January 1, 1970: " + futureDate);

        Date pastDate = new Date(-1000_000_000_000L);
        System.out.println("1 trillion milliseconds before midnight on January 1, 1970: " + pastDate);

        /*
        Задача: создать объект момента времени, которое наступает в будущем
        ровно через 5 минут 20 секунд после текущего момента времени.
         */

        currentDate = new Date();
        long millis = currentDate.getTime();
        millis += (5 * 60 + 20) * 1000;
        futureDate = new Date(millis);
        System.out.println(currentDate);
        System.out.println(futureDate);

        result = currentDate.before(futureDate);
        System.out.println("currentDate started before futureDate - " + result);

        result = futureDate.before(pastDate);
        System.out.println("futureDate started before pastDate - " + result);

        result = currentDate.after(futureDate);
        System.out.println("currentDate started after futureDate - " + result);

        result = futureDate.after(pastDate);
        System.out.println("futureDate started after pastDate - " + result);

        Date date1 = new Date(1000L);
        Date date2 = new Date(1000L);

        System.out.println(currentDate.compareTo(futureDate));
        System.out.println(futureDate.compareTo(currentDate));
        System.out.println(date1.compareTo(date2));

        System.out.println();

        Set<Date> dates = new TreeSet<>();
        dates.add(new Date(100_000_000_000L));
        dates.add(new Date(50_000_000_000L));
        dates.add(new Date(30_000_000_000L));
        dates.add(new Date(250_000_000_000L));
        dates.add(new Date(150_000_000_000L));

        System.out.println("Sorted dates: ");
        dates.forEach(System.out::println);

    }
}
