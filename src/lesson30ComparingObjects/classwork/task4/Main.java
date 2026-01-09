package lesson30ComparingObjects.classwork.task4;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Set<Cat> cats = new TreeSet<>();

        cats.add(new Cat("Black", 3, 3.5));
        cats.add(new Cat("Ginger", 7, 4.75));
        cats.add(new Cat("Grey", 1, 3.72));
        cats.add(new Cat("White", 5, 6.7));
        cats.add(new Cat("Brown", 2, 1.7));

        for (Cat cat : cats) {
            System.out.println(cat);
        }

        System.out.println();

        Set<Cat> cats1 = new TreeSet<>(new CatComparator());

        cats1.add(new Cat("Black", 3, 3.5));
        cats1.add(new Cat("Ginger", 7, 4.75));
        cats1.add(new Cat("Grey", 1, 3.72));
        cats1.add(new Cat("White", 5, 6.7));
        cats1.add(new Cat("Brown", 2, 1.7));

        for (Cat cat : cats1) {
            System.out.println(cat);
        }
    }
}
