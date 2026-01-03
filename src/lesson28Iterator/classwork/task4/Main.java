package lesson28Iterator.classwork.task4;

import java.util.Enumeration;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        Vector<String> fruits = new Vector<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Lemon");
        fruits.add("Pineapple");
        fruits.add("Kiwi");
        fruits.add("Orange");

        System.out.println("Fruits before delete:");
        System.out.println(fruits);

        Enumeration<String> enumeration = fruits.elements();

        System.out.println("Fruits after delete:");

        while (enumeration.hasMoreElements()) {
            String fruit = enumeration.nextElement();
            if (!fruit.startsWith("A") && !fruit.startsWith("B")) {
                System.out.print(fruit + ", ");
            }
        }
    }
}
