package lesson27.classwork.task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int[] numbersArray = new int[10];

        List<Integer> numbers = new ArrayList<>();

        numbers.add(7);
        numbers.add(5);
        numbers.add(11);
        numbers.add(23);
        numbers.add(2);

        System.out.println(numbers);

        numbers.add(2, 30);
        System.out.println(numbers);

        numbers.set(2, 50);
        System.out.println(numbers);

        Integer oldElement = numbers.set(3, 20);
        System.out.println(numbers);
        System.out.println("Old(replaced) Element: " + oldElement);

        System.out.println("Element by index 4: " + numbers.get(4));

        List<String> words = new ArrayList<>();
        words.add("Hello");
        words.add("World");
        words.add("I");
        words.add("study");
        words.add("Java");
        System.out.println(words);

        words.remove("World");
        System.out.println(words);
        words.remove(0);
        System.out.println(words);

        System.out.println("Size of list words: " + words.size());
        System.out.println("Is list words empty? " + words.isEmpty());

        words.clear();
        System.out.println(words);

    }
}
