package lesson33Lambdas.classwork.task4;

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

        System.out.println("Results of the work of intermediate functions:");

        Function<String, Double> function1 = x -> Double.parseDouble(x);
        System.out.println("First function: " + function1.apply("5.9"));

        Function<Double, Long> function2 = x -> Math.round(x);
        System.out.println("Second result: " + function2.apply(25.6));

        Function<Long, Long> function3 = x -> x * x;
        System.out.println("Third result: " + function3.apply(5L));

        Function<String, Long> targetFunction = function1.andThen(function2).andThen(function3);
        System.out.println("Results of second way:");
        System.out.println("First result: " + targetFunction.apply(value1));
        System.out.println("Second result: " + targetFunction.apply(value2));

        targetFunction = function2.andThen(function3).compose(function1);
        System.out.println("Results of third way:");
        System.out.println("First result: " + targetFunction.apply(value1));
        System.out.println("Second result: " + targetFunction.apply(value2));

    }
}
