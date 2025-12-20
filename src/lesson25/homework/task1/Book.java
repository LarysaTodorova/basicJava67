package lesson25.homework.task1;

import java.util.Objects;

public class Book implements Cloneable{

    private String title;
    private int yearOfPublication;
    private String authorName;

    public Book(String title, int yearOfPublication, String authorName) {
        this.title = title;
        this.yearOfPublication = yearOfPublication;
        this.authorName = authorName;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearOfPublication == book.yearOfPublication && Objects.equals(title, book.title) && Objects.equals(authorName, book.authorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, yearOfPublication, authorName);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", yearOfPublication=" + yearOfPublication +
                ", authorName='" + authorName + '\'' +
                '}';
    }

    @Override
    protected Book clone() throws CloneNotSupportedException {
        return (Book) super.clone();
    }
}
