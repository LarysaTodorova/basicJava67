package lesson31Map.homework.task1;

import java.util.HashMap;
import java.util.Map;

public class StudentDemo {
    public static void main(String[] args) {
        /*
        Наполните коллекцию несколькими парами значений (от 8 до 10).
Выведите в консоль средний балл любого из студентов.
Измените средний балл этого же студента, а затем выведите новое значение в консоль.
Проверьте, содержится ли в коллекции студент с любым именем на Ваш выбор.
         */

        Map<String, Student> students = new HashMap<>();
        students.put("Max", new Student("Max", 20.5));
        students.put("Lisa", new Student("Lisa", 18.0));
        students.put("John", new Student("John", 13.3));
        students.put("Alex", new Student("Alex", 20.0));
        students.put("Lukas", new Student("Lukas", 17.9));
        students.put("Maria", new Student("Maria", 16.5));
        students.put("Olivia", new Student("Olivia", 17.8));
        students.put("Robert", new Student("Robert", 19.5));
        students.put("Kate", new Student("Kate", 15.8));

        double averageScore = students.get("Lukas").getAverageScore();
        System.out.println(students.get("Lukas").getName() + " average score: " + averageScore);

        students.get("Lukas").setAverageScore(19.3);
        System.out.println("Lukas changed average score: " + students.get("Lukas").getAverageScore());

        boolean name = students.containsKey("Max");
        System.out.println(name);
    }
}
