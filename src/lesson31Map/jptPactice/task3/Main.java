package lesson31Map.jptPactice.task3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        /*
        Есть Map<String, Integer> students, где
ключ — имя студента
значение — номер курса (1–4)
Нужно:
Вывести имена студентов, которые учатся на 2 курсе
Посчитать, сколько студентов на каждом курсе
(Map<Integer, Integer>)
         */

        Map<String, Integer> students = new HashMap<>();
        students.put("John", 1);
        students.put("Jane", 4);
        students.put("Robert", 3);
        students.put("Max", 1);
        students.put("Alexa", 2);
        students.put("Maria", 2);
        students.put("Lucas", 2);
        students.put("Anna", 3);

        for (Map.Entry<String, Integer> pair : students.entrySet()) {
            String name = pair.getKey();
            Integer count = pair.getValue();
            if (count == 2) {
                System.out.println(name);
            }
        }

        Map<Integer, Integer> countOfStudentsOfCourse = new HashMap<>();

        for (Map.Entry<String, Integer> pair : students.entrySet()) {
            Integer course = pair.getValue(); // номер курса (1–4)
            if (countOfStudentsOfCourse.containsKey(course)) {
                countOfStudentsOfCourse.put(course, countOfStudentsOfCourse.get(course) + 1);
            } else {
                countOfStudentsOfCourse.put(course, 1);
            }
        }

        System.out.println("Total number of students in the course is " + countOfStudentsOfCourse);
    }
}
