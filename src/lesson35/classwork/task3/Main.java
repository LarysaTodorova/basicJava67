package lesson35.classwork.task3;

import lesson33Lambdas.classwork.task2.Cat;

import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        List<Cat> cats = List.of(
                new Cat("Ginger", 5, 3.75),
                new Cat("Black", 2, 2.5),
                new Cat("White", 7, 6.5),
                new Cat("Ginger", 1, 1.9),
                new Cat("Grey", 9, 4.25),
                new Cat("Black", 3, 3.75),
                new Cat("Grey", 3, 6.4)
        );

        long gingerCats = cats
                .stream()
                .filter(x -> "Ginger".equals(x.getColor()))
                .count();

        System.out.println("Count of a ginger cats: " + gingerCats);

        boolean age5 = cats
                .stream()
                .anyMatch(x -> x.getAge() == 5);

        System.out.println("Age 5: " + age5);

        boolean more10kg = cats
                .stream()
                .anyMatch(x -> x.getWeight() > 10);

        System.out.println("More than 10 kg: " + more10kg);

        boolean result = cats
                .stream()
                .allMatch(x -> x.getWeight() < 10);

        System.out.println("All cats are less than 10 kg: " + result);

        result = cats
                .stream()
                .allMatch(x -> x.getAge() > 1);

        System.out.println("All cats are more than 1 year: " + result);

        Optional<Cat> optionalCat = cats
                .stream()
                .filter(x -> x.getAge() % 2 != 0)
                .findFirst();

        optionalCat.ifPresent(System.out::println);

        optionalCat = cats
                .stream()
                .filter(x -> "Green".equals(x.getColor()))
                .findFirst();

        optionalCat.ifPresent(x -> System.out.println("Green cat - " + x));

        double catsWeight = cats
                .stream()
                .map(x -> x.getWeight())
                .reduce((x, y) -> x + y)
                .orElse(0.0);

        System.out.println("The weight of a cat is: " + catsWeight);

        catsWeight = cats
                .stream()
                .mapToDouble(x -> x.getWeight())
                .sum();

        System.out.println("The weight of a cat is: " + catsWeight);

    }
}
