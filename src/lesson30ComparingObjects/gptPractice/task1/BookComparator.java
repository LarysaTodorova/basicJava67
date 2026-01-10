package lesson30ComparingObjects.gptPractice.task1;

import java.util.Comparator;

public class BookComparator implements Comparator<Book> {
    /*
    Написать BookComparator, который сортирует:
1️⃣ по автору (A → Z)
2️⃣ если автор одинаковый — по году издания (от старых к новым)
3️⃣ если и год одинаковый — по количеству страниц (по убыванию)
     */

    @Override
    public int compare(Book book1, Book book2) {

        if (book1.getAuthor().compareTo(book2.getAuthor()) != 0) {
            return book1.getAuthor().compareTo(book2.getAuthor());
        }

        if (book1.getYear() - book2.getYear() != 0) {
            return book1.getYear() - book2.getYear();
        }

        return book2.getPages() - book1.getPages();
    }

}
