package lesson32LambdasFunctionalInterface.classwork.task1;

import java.util.ArrayList;
import java.util.List;

import static lesson32LambdasFunctionalInterface.classwork.task1.StudentUtils.printFilterStudents;

public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Max", 25, 5, 4.1, Degree.MASTER));
        students.add(new Student("Olivia", 28, 1, 5.0, Degree.BACHELOR));
        students.add(new Student("Anna", 19, 2, 4.5, Degree.MASTER));
        students.add(new Student("Jack", 20, 5, 4.7, Degree.BACHELOR));
        students.add(new Student("Lukas", 30, 3, 4.6, Degree.BACHELOR));
        students.add(new Student("Maria", 27, 1, 4.1, Degree.MASTER));
        students.add(new Student("Alexa", 21, 2, 4.5, Degree.MASTER));

        System.out.println("All students:");

        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println();

        System.out.println("Students with rate more than 4.6:");
        printFilterStudents(students, new FilterByRate());

        System.out.println("Bachelors less than 4 course:");
        printFilterStudents(students, new FilterByDegreeAndCourse());

        System.out.println("Students less than 25 years:");
        printFilterStudents(students, new Filter() {
            @Override
            public boolean test(Student student) {
                return student.getAge() < 25;
            }
        });

        System.out.println("Masters with name length 5 letters:");
        printFilterStudents(students, new Filter() {
            @Override
            public boolean test(Student student) {
                return student.getName().length() == 5 && student.getDegree().equals(Degree.MASTER);
            }
        });

        System.out.println("Students with odd age:");
        printFilterStudents(students, x -> x.getAge() % 2 != 0);

        System.out.println("Students with name starts with 'A': ");
        printFilterStudents(students, x -> x.getName().charAt(0) == 'A');

        System.out.println("Students with name starts with 'M': ");
        printFilterStudents(students, x-> x.getName().startsWith("M"));

    }
}
