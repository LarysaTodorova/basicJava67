package lesson33Lambdas.classwork.task2;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        /*
        Задача: имеется объект собаки.
        У собаки есть цвет, возраст и вес (вещественное число).
        Требуется написать функцию, которая на вход принимает
        объект собаки, а на выходе выдаёт объект кота точно
        такого же цвета, точно такого же возраста, но с весом,
        в два раза меньшим, чем весит собака.
         */

        Dog dog1 = new Dog("Black", 7, 11.5);
        Dog dog2 = new Dog("Braun", 10, 15.95);
        System.out.println("Dogs info: ");
        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println();

        Function<Dog, Cat> converter = x -> {
            String color = x.getColor();
            int age = x.getAge();
            double weight = x.getWeight();
            return new Cat(color, age, weight / 2);
        };

        Cat cat1 = converter.apply(dog1);
        Cat cat2 = converter.apply(dog2);

        System.out.println("Cats info:");
        System.out.println(cat1);
        System.out.println(cat2);
    }
}
