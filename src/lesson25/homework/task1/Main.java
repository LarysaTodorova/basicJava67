package lesson25.homework.task1;

public class Main {
    /*
    Напишите класс Книга.
У Книги должны быть характеристики - год издания, название, имя автора.
Напишите класс Main с методом main, в нём создайте объект книги с любыми значениями характеристик.
Создайте вторую переменную для книги и присвойте в эту переменную значение первой переменной.
Убедитесь, как мы делали это на занятии, что это одна и та же книга, а не две книги.
Доработайте класс Книга так, чтобы он поддерживал клонирование.
При помощи метода clone создайте копию книги.
Убедитесь, что это действительно два объекта книги, а не одна и та же книга.
     */
    public static void main(String[] args) throws CloneNotSupportedException {

        Book book1 = new Book("Title1", 2025, "Author1");
        Book book2 = book1;

        System.out.println(book1 == book2);

        Book book3 = book1.clone();
        System.out.println(book1 == book3);

        book3.setTitle("Title3");
        System.out.println(book1.getTitle());
//        System.out.println(book1);
//        System.out.println(book3);


    }
}
