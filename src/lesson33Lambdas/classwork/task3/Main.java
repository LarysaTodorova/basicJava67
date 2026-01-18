package lesson33Lambdas.classwork.task3;

import java.util.Locale;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        /*
        Задача: мы имеем на входе вещественное число в виде строки.
        Требуется написать функцию, которая делает следующее:
        1. Преобразует строку в вещественное число.
        2. Округляет это вещественное число до целого.
        3. Возвращает квадрат этого числа.
        Примеры:
        "5.4"  ->  5.4  ->  5  ->  25
        "8.7"  ->  8.7  ->  9  ->  81
         */

        String value1 = "5.4";
        String value2 = "8.7";

        Function<String, Long> function = x -> {
            Double result1 = Double.parseDouble(x);
            Long result2 = Math.round(result1);
            Long result3 = result2 * result2;
            return result3;
        };

        System.out.println("First way results:");
        System.out.println("First result: " + function.apply(value1));
        System.out.println("Second result: " + function.apply(value2));
    }
}
