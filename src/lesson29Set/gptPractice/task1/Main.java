package lesson29Set.gptPractice.task1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*
Создать список стран:
"Germany", "France", "Italy", "Spain", "Portugal"

Создать второй список стран:
"Italy", "Spain", "Greece", "Norway"

1️⃣ Написать метод, который принимает оба списка и возвращает
    список всех стран без дубликатов,
    сохраняя порядок первого появления элементов.

Ожидаемый результат:
["Germany", "France", "Italy", "Spain", "Portugal", "Greece", "Norway"]

2️⃣ Написать метод, который принимает оба списка и возвращает
    список стран, которые присутствуют в ОБОИХ списках,
    без дубликатов и в порядке первого списка.

Ожидаемый результат:
["Italy", "Spain"]

❗ Исходные списки изменяться не должны.
*/

        List<String> countries1 = new ArrayList<>(List.of("Germany", "France", "Italy", "Spain", "Portugal"));
        List<String> countries2 = new ArrayList<>(List.of("Italy", "Spain", "Greece", "Norway"));

        System.out.println(countries1);
        System.out.println(countries2);

        System.out.println(getUniqueCountries(countries1, countries2));

        System.out.println(getRepeatingCountries(countries1, countries2));

    }

    public static List<String> getUniqueCountries(List<String> list1, List<String> list2) {
        Set<String> set = new LinkedHashSet<>();
        set.addAll(list1);
        set.addAll(list2);
        return new ArrayList<>(set);
    }

    public static List<String> getRepeatingCountries(List<String> list1, List<String> list2) {
        Set<String> set = new LinkedHashSet<>();
        for (String currentElement : list1) {
            if (list2.contains(currentElement)) {
                set.add(currentElement);
            }
        }
        return new ArrayList<>(set);
    }
}
