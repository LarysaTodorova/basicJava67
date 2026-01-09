package lesson30ComparingObjects.classwork.task3;

import lesson30ComparingObjects.classwork.task1.Cat;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Set<Cat> cats = new TreeSet<>();

        cats.add(new Cat("Black", 3, 3.5));
        cats.add(new Cat("Ginger", 7, 4.75));
        cats.add(new Cat("Grey", 5, 3.72));

        System.out.println(cats);

        Cat cat1 = new Cat("Black", 3, 3.5);
        Cat cat2 = new Cat("Black", 3, 3.5);
//        int result = cat1.compareTo(cat2);


    }
}
