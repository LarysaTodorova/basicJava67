package lesson34StreamAPI.classwork.task1;

import lesson30ComparingObjects.classwork.task4.Cat;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        List<Integer> numbers = List.of(6, 17, 4, 12, 15, 7, 2, 14, 8);
//        List<Integer> numbers = Arrays.asList(6, 17, 4, 12, 15, 7, 2, 14, 8);

        List<Integer> numbers = new ArrayList<>(List.of(6, 17, 4, 12, 15, 7, 2, 14, 8));

        System.out.println("Original numbers: " + numbers);

        numbers.add(50);

        System.out.println("Added numbers: " + numbers);

//        List<Integer> numbers1 = new ArrayList<>();
//
//        for (Integer number : numbers) {
//            if (number > 10) {
//                numbers1.add(number);
//            }
//        }
//        System.out.println("Filtered list: " + numbers1);

        List<Integer> filteredNumbers = numbers
                .stream()
                .filter(x -> x > 10)
                .toList();

        System.out.println("Filtered list: " + filteredNumbers);

        List<Integer> sortedNumbers = numbers
                .stream()
                .sorted()
                .toList();

        System.out.println("Sorted list: " + sortedNumbers);

        List<Cat> cats = List.of(
                new Cat("Black", 3, 3.5),
                new Cat("Ginger", 7, 4.75),
                new Cat("Grey", 1, 3.72),
                new Cat("White", 5, 6.7),
                new Cat("Brown", 2, 1.7)
        );

        List<Cat> sortedCats = cats
                .stream()
                .sorted()
                .toList();

        System.out.println("Original cats:");
        cats.forEach(x -> System.out.println(x));

        System.out.println("Sorted cats: ");
        sortedCats.forEach(System.out::println);

        sortedCats = cats
                .stream()
                .sorted((x, y) -> y.getAge() - x.getAge())
                .toList();

        System.out.println("Another sorted cats:");
        sortedCats.forEach(System.out::println);

        List<Integer> sortedFilteredNumbers = numbers
                .stream()
                .filter(x -> x > 10)
                .sorted()
                .toList();

        System.out.println("Sorted and filtered list: " + sortedFilteredNumbers);

    }
}
