package lesson33Lambdas.classwork.task5;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        Function<String, String> function = Function.identity();

        String value = "Hello";
        String result = function.apply(value);
        System.out.println("Result: " + result);


    }
}
