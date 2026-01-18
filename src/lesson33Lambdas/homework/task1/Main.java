package lesson33Lambdas.homework.task1;

import lesson33Lambdas.classwork.task2.Cat;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        /*
        Напишите функцию (используя интерфейс Function), которая на вход принимает строку вида "5 Black 4.23"
        и возвращает в таком случае объект чёрного кота с возрастом 5 и весом 4.23
        (то есть характеристики кота берутся из строки).
Подсказка: используйте метод split класса String.
Можно использовать уже готовый класс кота из материалов занятия.
Можно либо сразу написать готовую функцию,
либо написать сначала промежуточные функции и из них собрать итоговую - на Ваше усмотрение.
         */

        String value = "5 Black 4.23";

        System.out.println("First way:");

        Function<String, Cat> fromStringToCat = x -> {
            String[] splitedWords = x.split(" ");
            int age = Integer.parseInt(splitedWords[0]);
            String color = splitedWords[1];
            double weight = Double.parseDouble(splitedWords[2]);
            return new Cat(color, age, weight);
        };

        Cat cat = fromStringToCat.apply(value);
        System.out.println("Cats info:");
        System.out.println(cat);
        System.out.println();

//        System.out.println("Second way:");
//        System.out.println("Results of the work of intermediate functions:");
//
//        Function<String[], Integer> getAge = x -> Integer.parseInt(x[0]);
//        Function<String[], String> getColor = x -> x[1];
//        Function<String[], Double> getWeight = x -> Double.parseDouble(x[2]);
//
//        Function<String, Cat> fromStringToCat2 = x -> {
//            String[] words = x.split(" ");
//            return new Cat(
//                    getColor.apply(words),
//                    getAge.apply(words),
//                    getWeight.apply(words)
//            );
//        };
//
//        System.out.println("Cats info: ");
//        System.out.println(fromStringToCat2.apply(value));
    }
}
