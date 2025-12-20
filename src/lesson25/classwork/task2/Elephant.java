package lesson25.classwork.task2;

import java.util.Objects;

public class Elephant {

    private String color;
    private int age;

    public Elephant(String color, int age) {
        this.color = color;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Elephant elephant = (Elephant) o;
        return age == elephant.age && Objects.equals(color, elephant.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, age);
    }
}
