package lesson29Set.gptPractice.task3;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        /*
Даны два списка целых чисел.

Список A:
[1, 2, 3, 4, 5, 6]

Список B:
[4, 5, 6, 7, 8]

1️⃣ Написать метод, который принимает оба списка
    и возвращает список чисел, которые есть В ОБОИХ списках (пересечение).

Ожидаемый результат:
[4, 5, 6]

2️⃣ Написать метод, который принимает оба списка
    и возвращает список чисел, которые есть в первом списке,
    но отсутствуют во втором (разность A - B).

Ожидаемый результат:
[1, 2, 3]

❗ Исходные списки изменяться не должны.
❗ Результат вернуть в виде List<Integer>.
❗ Порядок чисел должен соответствовать первому списку.
*/

        List<Integer> list1 = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));
        List<Integer> list2 = new ArrayList<>(List.of(4, 5, 6, 7, 8));

        System.out.println(list1);
        System.out.println(list2);

        System.out.println(repeatedNumbers(list1, list2));

        System.out.println(getSortedNumbers(list1, list2));
    }

    /*
    Написать метод, который принимает оба списка
    и возвращает список чисел, которые есть В ОБОИХ списках (пересечение).
         */
    public static List<Integer> repeatedNumbers(List<Integer> integers1, List<Integer> integers2) {
        Set<Integer> result = new LinkedHashSet<>();
        for (Integer integer : integers1) {
            if (integers2.contains(integer)) {
                result.add(integer);
            }
        }
        return new ArrayList<>(result);
    }

    /*
    Написать метод, который принимает оба списка
    и возвращает список чисел, которые есть в первом списке,
    но отсутствуют во втором (разность A - B).
     */
    public static List<Integer> getSortedNumbers(List<Integer> integers1, List<Integer> integers2) {
        Set<Integer> result = new LinkedHashSet<>();
        for (Integer integer : integers1) {
            if (!integers2.contains(integer)) {
                result.add(integer);
            }
        }
        return new ArrayList<>(result);
    }
}
