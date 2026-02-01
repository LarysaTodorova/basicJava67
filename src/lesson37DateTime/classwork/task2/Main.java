package lesson37DateTime.classwork.task2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

//        Calendar calendar = new GregorianCalendar();

        Calendar calendar = Calendar.getInstance();

        System.out.println(calendar);

        SimpleDateFormat formater = new SimpleDateFormat(
                "'Today is' EEEE, d MMMM y 'year'", new Locale("en"));

        Date date = calendar.getTime();

        String dateAsString = formater.format(date);

        System.out.println(dateAsString);

        System.out.println(formater.format(calendar.getTime()));

        System.out.println(calendar.get(Calendar.HOUR));
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println(calendar.get(Calendar.WEEK_OF_YEAR));

        calendar.set(Calendar.MONTH, Calendar.SEPTEMBER);
        calendar.set(Calendar.YEAR, 2027);
        System.out.println(formater.format(calendar.getTime()));

        calendar.add(Calendar.YEAR, 3);
        calendar.add(Calendar.WEEK_OF_YEAR, -7);
        System.out.println(formater.format(calendar.getTime()));
    }
}
