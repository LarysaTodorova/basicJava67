package lesson34StreamAPI.classwork.task3;

import lesson33Lambdas.classwork.task2.Cat;
import lesson33Lambdas.classwork.task2.Dog;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> stringNumbers = List.of("7", "4", "10", "5", "1");

        List<Integer> numbers = stringNumbers
                .stream()
//                .map(x -> Integer.parseInt(x))
                .map(Integer::parseInt)
                .toList();

        System.out.println("Original numbers: " + stringNumbers);
        System.out.println("List of numbers: " + numbers);

        List<Dog> dogs = List.of(
                new Dog("Black", 6, 12.9),
                new Dog("Braun", 2, 4.6),
                new Dog("Ginger", 10, 12.5)
        );

        List<Cat> cats = dogs
                .stream()
                .map(dog -> new Cat(dog.getColor(), dog.getAge(), dog.getWeight()))
                .toList();

        System.out.println("List of dogs: " + dogs);
        System.out.println("List of cats: " + cats);
    }
}
