package lesson29Set.classwork.task2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();

        hashSet.add("CCC");
        hashSet.add("AAA");
        hashSet.add("BBB");
        hashSet.add("EEE");
        hashSet.add("DDD");
        hashSet.add("BBB");

        linkedHashSet.add("CCC");
        linkedHashSet.add("AAA");
        linkedHashSet.add("BBB");
        linkedHashSet.add("EEE");
        linkedHashSet.add("DDD");
        linkedHashSet.add("BBB");

        treeSet.add("CCC");
        treeSet.add("AAA");
        treeSet.add("BBB");
        treeSet.add("EEE");
        treeSet.add("DDD");
        treeSet.add("BBB");

        System.out.println("HashSet: " + hashSet);
        System.out.println("LinkedHashSet: " + linkedHashSet);
        System.out.println("TreeSet: " + treeSet);
    }
}
