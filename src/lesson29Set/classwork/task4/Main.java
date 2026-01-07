package lesson29Set.classwork.task4;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat("black", 5);
        Cat cat2 = new Cat("ginger", 3);
        Cat cat3 = new Cat("white", 1);
        Cat cat4 = new Cat("white", 1);

        Set<Cat> cats = new HashSet<>();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);
        cats.add(new Cat("grey", 2));

        for (Cat cat : cats) {
            System.out.println(cat);
        }

    }
}
