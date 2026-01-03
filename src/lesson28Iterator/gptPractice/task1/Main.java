package lesson28Iterator.gptPractice.task1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
       Дан список целых чисел.
       Нужно найти первое отрицательное число.
       Если оно найдено — удалить все нечётные числа ДО него.
       Если отрицательного числа нет — список не менять.
         */

        List<Integer> numbers = new ArrayList<>(List.of(4, 7, 6, 9, -3, 8, 5));

        System.out.println("List before delete: ");
        System.out.println(numbers);
        System.out.println();

        Iterator<Integer> iterator = numbers.iterator();
        boolean found = false;

        while (iterator.hasNext()) {
            if (iterator.next() < 0) {
                found = true;
                break;
            }
        }

        if (found) {
            Iterator<Integer> iterator2 = numbers.iterator();

            while (iterator2.hasNext()) {
                Integer number = iterator2.next();

                if (number < 0) {
                    break;
                }

                if (number % 2 != 0) {
                    iterator2.remove();
                }
            }
        }

        System.out.println("List after delete: ");
        System.out.println(numbers);

    }
}
/*
Мини-вопрос как на собеседовании
Почему ты сделала 2 итератора, а не одним проходом?
Правильный ответ:
Потому что по условию, если отрицательного числа нет, нельзя удалять ничего —
значит сначала нужно проверить наличие “границы”, и только потом удалять.
 */

