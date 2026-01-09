package lesson30ComparingObjects.homework.task2;

import java.util.Set;
import java.util.TreeSet;

public class ParrotDemo {
    public static void main(String[] args) {

        Set<Parrot> parrots = new TreeSet<>(new ParrotComparator());

        parrots.add(new Parrot(7, 10, "White"));
        parrots.add(new Parrot(15, 85, "Ginger"));
        parrots.add(new Parrot(5, 10, "White"));
        parrots.add(new Parrot(18, 63, "Red"));
        parrots.add(new Parrot(9, 35, "Blue"));

        for (Parrot parrot : parrots) {
            System.out.println(parrot);
        }

    }
}
