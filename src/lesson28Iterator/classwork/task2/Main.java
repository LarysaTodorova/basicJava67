package lesson28Iterator.classwork.task2;

import java.util.ArrayList;
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

//        for (int i = 0; i < fruits.size(); i++) {
//            String fruit = fruits.get(i);
//            if (fruit.startsWith("A") || fruit.startsWith("B")) {
//                fruits.remove(fruit);
//            }
//        }

//        for (String fruit : fruits) {
//            if (fruit.startsWith("A") || fruit.startsWith("B")) {
//                fruits.remove(fruit);
//            }
//        }

//        int index = 0;
//        while (fruits.size() > index) {
//            if(fruits.get(index).startsWith("A") || fruits.get(index).startsWith("B")) {
//                fruits.remove(index);
//            }
//            index++;
//        }

        for (int i = fruits.size() - 1; i >= 0; i--) {
            String fruit = fruits.get(i);
            if (fruit.startsWith("A") || fruit.startsWith("B")) {
                fruits.remove(fruits.get(i));
            }
        }

        System.out.println("Fruits after delete:");
        System.out.println(fruits);

    }
}
