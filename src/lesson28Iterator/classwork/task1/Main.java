package lesson28Iterator.classwork.task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> animals = new ArrayList<>();

        animals.add("Cat");
        animals.add("Dog");
        animals.add("Horse");
        animals.add("Elephant");
        animals.add("Parrot");

        // Способы перебора элементов коллекции
        System.out.println(animals);

        System.out.println();

        for (String animal : animals) {
            System.out.println(animal);
        }

        System.out.println();

        for (int i = 0; i < animals.size(); i++) {
            System.out.println(i + 1 + ". " + animals.get(i));
        }

        System.out.println();

        int index = 0;
        while (animals.size() > index) {
            System.out.println(animals.get(index++));
        }

    }
}
