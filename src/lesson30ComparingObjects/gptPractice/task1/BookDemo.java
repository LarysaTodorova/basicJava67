package lesson30ComparingObjects.gptPractice.task1;

import java.util.Set;
import java.util.TreeSet;

public class BookDemo {
    public static void main(String[] args) {

        Set<Book> books = new TreeSet<>(new BookComparator());

        books.add(new Book("Title1", "Author5", 2016, 562));
        books.add(new Book("Title2", "Author2", 2025, 100));
        books.add(new Book("Title5", "Author3", 1995, 375));
        books.add(new Book("Title3", "Author3", 1996, 459));
        books.add(new Book("Title4", "Author5", 2016, 1257));

        for (Book book : books) {
            System.out.println(book);
        }

    }
}
