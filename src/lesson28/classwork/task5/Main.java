package lesson28.classwork.task5;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Avocado");
        fruits.add("Cherry");
        fruits.add("Lemon");
        fruits.add("Apricot");
        fruits.add("Kiwi");
        fruits.add("Orange");

        /*
        Задача: пройти по списку фруктов и найти в нём первый попавшийся фрукт на букву Л.
        После этого разместить рядом с этим фруктом новый фрукт Манго.
        После этого удалить все фрукты на букву А, которые встречались до этого места.
        Фрукты на букву А после этого места должны остаться нетронутыми.
         */

        System.out.println("List before changing:");
        System.out.println(fruits);
        System.out.println();

        ListIterator<String> listIterator = fruits.listIterator();

        while (listIterator.hasNext()) {
            String fruit = listIterator.next();
            if (fruit.startsWith("L")) {
                listIterator.add("Mango");

                while (listIterator.hasPrevious()) {
                    fruit = listIterator.previous();
                    if (fruit.startsWith("A")) {
                        listIterator.remove();
                    }
                }
                break;
            }
        }

        System.out.println("List after changing:");
        System.out.println(fruits);
    }
}
