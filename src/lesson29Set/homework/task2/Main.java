package lesson29Set.homework.task2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*
        Создать лист элементов - AAA, BBB, CCC, DDD, EEE.
        Создать второй лист элементов - DDD, EEE, FFF, GGG.
        Написать метод, который на вход принимает оба этих листа и возвращает результирующий лист,
        содержащий элементы обоих листов, но без дубликатов - AAA, BBB, CCC, DDD, EEE, FFF, GGG.
        Написать метод, который на вход принимает оба этих листа и возвращает результирующий лист,
        содержащий только те элементы, которые содержатся в обоих листах - DDD, EEE.
        В обоих случаях исходные листы изменяться не должны.
         */

        List<String> letters1 = new ArrayList<>(List.of("AAA", "BBB", "CCC", "DDD", "EEE"));
        List<String> letters2 = new ArrayList<>(List.of("DDD", "EEE", "FFF", "GGG"));

        System.out.println(letters1);
        System.out.println(letters2);

        System.out.println(getUniqueElements(letters1, letters2));

        System.out.println(getRepeatingElements(letters1, letters2));

    }

    public static List<String> getUniqueElements(List<String> array1, List<String> array2) {
        Set<String> set = new LinkedHashSet<>(array1);
        set.addAll(array2);
        return new ArrayList<>(set);
    }

    public static List<String> getRepeatingElements(List<String> array1, List<String> array2) {
        List<String> sortedList = new ArrayList<>();
        for (int i = 0; i < array1.size(); i++) {
            for (int j = 0; j < array2.size(); j++) {
                if (array1.get(i).equals(array2.get(j))) {
                    sortedList.add(array1.get(i));
                }
            }
        }
        Set<String> set = new LinkedHashSet<>(sortedList);
        return new ArrayList<>(set);
    }
}

