package lesson29Set.classwork.task1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<String> fruits = new HashSet<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Pear");
        fruits.add("Orange");
        fruits.add("Orange");
        fruits.add("Lemon");

        System.out.println(fruits);

        boolean result = fruits.add("Coconut");

        System.out.println("If Coconut was added? - " + result);
        System.out.println(fruits);

        result = fruits.add("Lemon");
        System.out.println("If Lemon was added? - " + result);
        System.out.println(fruits);

        System.out.println("Is set empty? - " + fruits.isEmpty());

        System.out.println("How many elements are in the set? - " + fruits.size());

        System.out.println("Is Pear contains in set? - " + fruits.contains("Pear"));
        System.out.println("Is Tomato contains in set? - " + fruits.contains("Tomato"));

        List<String> fruitsList = new ArrayList<>();
        fruitsList.add("Apple");
        fruitsList.add("Banana");
        fruitsList.add("Lemon");
        fruitsList.add("Kiwi");

        result = fruits.containsAll(fruitsList);
        System.out.println("Are all fruits in the set from the list? - " + result);

        result = fruits.remove("Lemon");
        System.out.println("If lemon was removed? - " + result);
        System.out.println(fruits);

        result = fruits.remove("Peach");
        System.out.println("If Peach was removed? - " + result);
        System.out.println(fruits);

        System.out.println("Set fruits" + fruits);
        System.out.println("List fruits" + fruitsList);

        result = fruits.removeAll(fruitsList);
        System.out.println("Are all fruits in the set from the list were deleted? - " + result);
        System.out.println(fruits);

        fruits.clear();
        System.out.println(fruits);
        System.out.println(fruits.isEmpty());
        System.out.println(fruits.size());

    }
}
