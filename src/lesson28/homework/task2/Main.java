package lesson28.homework.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        /*
        Создайте список чисел - 4, 8, 7, 10, 5, 2, 9, 11, 5, 8, 0, 5. Выведите его в консоль.
        Двигаясь по списку, найдите число, которое больше 10.
        Удалите из списка все чётные числа перед этим числом. Снова выведите список в консоль.
        Если такое число не было найдено, то и удалять ничего не нужно.
         */

        List<Integer> numbers = new ArrayList<>(List.of(-4, 8, 7, 10, 5, 2, 9, 11, 5, 8, 0, 5));

        System.out.println("List before delete:");
        System.out.println(numbers);

        System.out.println();

        ListIterator<Integer> iterator = numbers.listIterator();

        while (iterator.hasNext()) {
            Integer number = iterator.next();
            if (number > 10) {
                iterator.previous();

                while (iterator.hasPrevious()) {
                    number = iterator.previous();
                    if (number % 2 == 0) {
                        iterator.remove();
                    }
                }
                break;
            }
        }

//        while (iterator.hasNext()) {
//            Integer number = iterator.next();
//            if (number > 10) {
//                break;
//            }
//            if (number % 2 == 0) {
//                iterator.remove();
//            }
//        }

        System.out.println("List after delete:");
        System.out.println(numbers);

    }
}
