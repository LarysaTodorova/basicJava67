package lesson27List.homework.task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        Создайте список названий фруктов и заполните его несколькими значениями (5-10 значений).
        Создайте второй список названий фруктов и при помощи цикла заполните его
        только теми названиями фруктов из первого списка, длина которых нечётная.
        Выведите оба списка в консоль, проконтролируйте результат.
         */

        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Watermelon");
        fruits.add("Pear");
        fruits.add("Strawberry");
        fruits.add("Mango");
        fruits.add("Pineapple");

        List<String> fruits2 = new ArrayList<>();

//        for (int i = 0; i < fruits.size(); i++) {
//            if (fruits.get(i).length() % 2 != 0) {
//                fruits2.add(fruits.get(i));
//            }
//        }

        for (String fruit : fruits) {
            if (fruit.length() % 2 != 0) {
                fruits2.add(fruit);
            }
        }

        System.out.println(fruits);
        System.out.println(fruits2);
    }
}
