package lesson28Iterator.classwork.task3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Lemon");
        fruits.add("Pineapple");
        fruits.add("Kiwi");
        fruits.add("Orange");

        System.out.println("Fruits before delete:");
        System.out.println(fruits);

        Iterator<String> iterator = fruits.iterator();

        while (iterator.hasNext()) {
            String fruit = iterator.next();
            if (fruit.startsWith("A") || fruit.startsWith("B")) {
                iterator.remove();
            }
        }

        System.out.println("Fruits after delete:");
        System.out.println(fruits);
    }
}
