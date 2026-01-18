package lesson33Lambdas.classwork.task1;

public class Main {
    public static void main(String[] args) {
 /*
        Задача: на базе созданного функционального интерфейса
        реализовать такую функцию, которая на вход принимает вещественное число,
        выводит его на экран,
        округляет его по математическим правилам округления и
        возвращает получившееся целое число.
        Ожидаемый результат:
        На вход -> 5.2, результат -> 5.
        На вход -> 7.6, результат -> 8.
         */

        MyFunction function1 = new MyRoundFunction();

        long result1 = function1.getResult(5.2);
        long result2 = function1.getResult(7.6);
        System.out.println("First way results:");
        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
        System.out.println();

        MyFunction function2 = new MyFunction() {
            @Override
            public long getResult(double value) {
                System.out.println("Passed value: " + value);
                return Math.round(value);
            }
        };
        result1 = function2.getResult(5.2);
        result2 = function2.getResult(7.6);
        System.out.println("Second way results:");
        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
        System.out.println();

        MyFunction function3 = x -> {
            System.out.println("Passed value: " + x);
            return Math.round(x);
        };
        result1 = function3.getResult(5.2);
        result2 = function3.getResult(7.6);
        System.out.println("Third way results:");
        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
    }
}
