package lesson35.homework.task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        Создать класс Student.
Каждый студент должен иметь имя, возраст и список книг, которые он прочитал (типа List - просто названия книг).
В методе main создать список студентов и наполнить его пятью объектами студентов, причём у каждого студента должен быть свой список книг.
При помощи стрима преобразовать список студентов в список всех книг, прочитанных студентами.
         */

        Book book1 = new Book("Book1");
        Book book2 = new Book("Book2");
        Book book3 = new Book("Book3");
        Book book4 = new Book("Book4");
        Book book5 = new Book("Book5");
        Book book6 = new Book("Book6");
        Book book7 = new Book("Book7");

        List<Student> students = List.of(
                new Student("Max", 28, List.of(book2, book5, book1)),
                new Student("Alexa", 19, List.of(book1, book3)),
                new Student("Robert", 30, List.of(book2, book7, book1, book4)),
                new Student("Lukas", 22, List.of(book4, book6, book1)),
                new Student("Olivia", 19, List.of(book4, book5, book1, book3)),
                new Student("Maria", 29, List.of(book7, book5, book1, book4, book2)),
                new Student("Jack", 25, List.of(book2, book7, book4, book1, book5, book6))
        );

        List<Book> books = students
                .stream()
                .flatMap(x -> x.getBooks().stream())
                .toList();

        System.out.println(books);

    }
}
