package lesson29Set.classwork.task3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<String> fruits = new HashSet<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Pear");
        fruits.add("Orange");
        fruits.add("Lemon");
        fruits.add("Peach");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        Iterator<String> iterator = fruits.iterator();

        while (iterator.hasNext()) {
            if (iterator.next().startsWith("P")) {
                iterator.remove();
            }
        }
        System.out.println(fruits);
    }
}
