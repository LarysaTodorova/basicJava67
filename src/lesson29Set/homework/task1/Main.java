package lesson29Set.homework.task1;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        /*
        Создать сет имён студентов - Jack, John, Ada, Bill, Leon, John.
        Определить размер сета и вывести размер в консоль. Почему размер
        не соответствует количеству добавленных элементов? Напишите ответ в комментарии.
        Добавить в сет нового студента Jenna и результат добавления записать в boolean переменную.
        Был ли добавлен студент? Вывести результат в консоль.
        Определить, есть ли в сете студент Leon.
        Определить, есть ли в сете студент Samantha.
        Вывести каждое имя студента сета в консоль с новой строки при помощи for-each.
         */

        Set<String> studentNames = new HashSet<>();
        studentNames.add("Jack");
        studentNames.add("John");
        studentNames.add("Ada");
        studentNames.add("Bill");
        studentNames.add("Leon");
        studentNames.add("John");

        int size = studentNames.size();
        System.out.println("Size of student names: " + size);
        // размер не соответствует количеству добавленных элементов, потому что имя John повторяется 2 раза

        boolean jenna = studentNames.add("Jenna");
        System.out.println("Was Jenna added in the set? - " + jenna);

        boolean leon = studentNames.contains("Leon");
        boolean samantha = studentNames.contains("Samantha");
        System.out.println("Was Leon added in the set? - " + leon);
        System.out.println("Was Samantha added in the set? - " + samantha);

        for (String name : studentNames) {
            System.out.println(name);
        }
    }
}
