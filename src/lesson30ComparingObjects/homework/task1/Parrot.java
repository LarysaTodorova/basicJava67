package lesson30ComparingObjects.homework.task1;

import java.util.Objects;

public class Parrot implements Comparable<Parrot>{

    private int age;
    private int numberOfWords;

    public Parrot(int age, int numberOfWords) {
        this.age = age;
        this.numberOfWords = numberOfWords;
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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Parrot parrot = (Parrot) o;
        return age == parrot.age && numberOfWords == parrot.numberOfWords;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, numberOfWords);
    }

    @Override
    public String toString() {
        return "Parrot{" +
                "age=" + age +
                ", numberOfWords=" + numberOfWords +
                '}';
    }

    @Override
    public int compareTo(Parrot anotherParrot) {
        return age - anotherParrot.age;
    }
}
