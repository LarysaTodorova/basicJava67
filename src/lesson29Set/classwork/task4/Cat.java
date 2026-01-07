package lesson29Set.classwork.task4;

import java.util.Objects;

public class Cat {

    private String color;
    private int age;


    public Cat(String color, int age) {
        this.color = color;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && Objects.equals(color, cat.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, age);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
