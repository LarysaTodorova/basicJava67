package lesson34StreamAPI.classwork.task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(List.of(6, 17, 4, 12, 15, 7, 2, 14, 8));

        List<Integer> biggestNumbers = numbers
                .stream()
                .sorted((x, y) -> y - x)
                .limit(3)
                .toList();

        System.out.println("Three biggest numbers: " + biggestNumbers);

        List<Integer> numbersWithoutBiggest = numbers
                .stream()
                .sorted((x, y) -> y - x)
                .skip(2)
                .toList();

        System.out.println("Numbers without two biggest: " + numbersWithoutBiggest);

        List<String> fruits = List.of("Apple", "Pineapple", "Banana", "Orange", "Apple", "Banana");

        List<String> uniqueFruits = fruits
                .stream()
                .distinct()
                .toList();

        System.out.println("All fruits: " + fruits);
        System.out.println("Unique fruits: " + uniqueFruits);

        List<String> sortedFruits = fruits
                .stream()
                .sorted()
                .peek(x -> System.out.println(x + " " + x.length()))
                .toList();

        System.out.println("All sorted fruits: " + sortedFruits);

    }
}
