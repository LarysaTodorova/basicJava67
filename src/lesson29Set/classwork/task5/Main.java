package lesson29Set.classwork.task5;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        // String[] array = {"BBB", "CCC", "DDD", "CCC", "EEE", "AAA"};
        String[] array = {"BBB", "CCC", "DDD", "EEE", "AAA"};

        System.out.println("Source array: ");
        System.out.println(Arrays.toString(array));

        Set<String> set1 = new HashSet<>();

        for (String element : array) {
            set1.add(element);
        }
        System.out.println(set1);

        List<String> list = Arrays.asList(array);

        Set<String> set2 = new HashSet<>(list);
        System.out.println(set2);

        Set<String> set3 = new HashSet<>();
        Collections.addAll(set3, array);
        System.out.println(set3);

        Set<String> set4 = Arrays.stream(array).collect(Collectors.toSet());
        System.out.println(set4);

        Set<String> set5 = Set.of(array);
        System.out.println(set5);
    }
}
