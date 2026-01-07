package lesson29Set.gptPractice.task2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*
Создать список целых чисел:
[5, 3, 9, 1, 3, 5, 7, 1, 9]

1️⃣ Написать метод, который принимает этот список и возвращает список
    уникальных чисел, используя HashSet.

2️⃣ Написать метод, который принимает этот список и возвращает список
    уникальных чисел, используя LinkedHashSet,
    сохраняя порядок первого появления элементов.

3️⃣ Написать метод, который принимает этот список и возвращает список
    уникальных чисел, используя TreeSet,
    отсортированных по возрастанию.

❗ Исходный список изменяться не должен.
❗ Методы должны возвращать List<Integer>.
*/

        List<Integer> numbers = new ArrayList<>(List.of(5, 3, 9, 1, 3, 5, 7, 1, 9));

        System.out.println(numbers);

        System.out.println(getUniqueNumbers(numbers));
        System.out.println(getUniqueNumbers1(numbers));
        System.out.println(getUniqueNumbers2(numbers));
    }

    public static List<Integer> getUniqueNumbers(List<Integer> integers) {
        Set<Integer> set = new HashSet<>(integers);
        return new ArrayList<>(set);
    }

    public static List<Integer> getUniqueNumbers1(List<Integer> integers) {
        Set<Integer> set = new LinkedHashSet<>(integers);
        return new ArrayList<>(set);
    }

    public static List<Integer> getUniqueNumbers2(List<Integer> integers) {
        Set<Integer> set = new TreeSet<>(integers);
        return new ArrayList<>(set);
    }
}
