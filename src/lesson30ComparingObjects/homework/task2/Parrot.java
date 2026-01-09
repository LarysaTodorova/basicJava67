package lesson30ComparingObjects.homework.task2;

import java.util.Objects;

public class Parrot {

    private int age;
    private int numberOfWords;
    private String color;

    public Parrot(int age, int numberOfWords, String color) {
        this.age = age;
        this.numberOfWords = numberOfWords;
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumberOfWords() {
        return numberOfWords;
    }

    public void setNumberOfWords(int numberOfWords) {
        this.numberOfWords = numberOfWords;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Parrot parrot = (Parrot) o;
        return age == parrot.age && numberOfWords == parrot.numberOfWords && Objects.equals(color, parrot.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, numberOfWords, color);
    }

    @Override
    public String toString() {
        return "Parrot{" +
                "age=" + age +
                ", numberOfWords=" + numberOfWords +
                ", color='" + color + '\'' +
                '}';
    }
}
