package lesson37DateTime.homework.task1;

import java.time.LocalDateTime;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        /*
        Создайте объект, соответствующий дате и времени Вашего рождения.
        Если время не знаете, укажите 10 ч, 34 минуты, 56 секунд. Используйте любой класс на Ваше усмотрение.
Создайте объект, который соответствует моменту времени через 5 лет, 3 недели и 9 часов после Вашего рождения.
Выведите оба объекта в консоль.
Проверьте при помощи метода, что второй момент времени наступает действительно после Вашего Дня Рождения.
         */

        LocalDateTime myBirthday = LocalDateTime.of(
                1979, Month.AUGUST, 3, 16, 40, 59
        );
        System.out.println(myBirthday);

        LocalDateTime futureBirthday = myBirthday.plusYears(5).plusWeeks(3).plusHours(9);
        System.out.println(futureBirthday);

        boolean result = futureBirthday.isAfter(myBirthday);
        System.out.println("Is future birthday after my birthday: " + result);
    }
}
