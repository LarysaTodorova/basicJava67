package lesson28Iterator.homework.task1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        Создайте список чисел - 4, 8, 7, 10, 5, 2, 9, 11, 5, 8, 0, 5. Выведите его в консоль.
        Удалите из списка все числа, которые делятся нацело на 5. Снова выведите список в консоль.
         */

        List<Integer> numbers = new ArrayList<>(List.of(-4, 8, 7, 10, 5, 2, 9, 11, 5, 8, 0, 5));

        System.out.println("List before delete:");
        System.out.println(numbers);

        System.out.println();

        Iterator<Integer> iterator = numbers.iterator();

        while (iterator.hasNext()) {
            Integer number = iterator.next();
            if (number % 5 == 0) {
                iterator.remove();
            }
        }

        System.out.println("List after delete:");
        System.out.println(numbers);
    }
}
