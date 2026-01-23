package lesson35.classwork.task2;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        // Задача: имеется сет, состоящий из листов. При этом каждый лист
        // состоит из строк. Нужно преобразовать такой сет листов
        // в один лист, который содержит все элементы из всех листов сета.

        List<String> list1 = List.of("AAA", "BBB", "CCC", "DDD");
        List<String> list2 = List.of("EEE", "FFF");
        List<String> list3 = List.of("GGG", "HHH", "III");

        Set<List<String>> setOfLists = new HashSet<>();
        setOfLists.add(list1);
        setOfLists.add(list2);
        setOfLists.add(list3);

        System.out.println("Original set:");
        System.out.println(setOfLists);

        List<String> result = setOfLists
                .stream()
                .flatMap(x -> x.stream())
                .toList();

        System.out.println("Result:");
        System.out.println(result);

    }
}
