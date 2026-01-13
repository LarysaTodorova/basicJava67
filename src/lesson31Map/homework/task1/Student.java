package lesson31Map.homework.task1;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Student {
    /*
    Создайте коллекцию, которая содержит пары значений Имя студента - Средний балл студента (дробные значения).

     */

    private String name;
    private double averageScore;

    public Student(String name, double averageScore) {
        this.name = name;
        this.averageScore = averageScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Double.compare(averageScore, student.averageScore) == 0 && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, averageScore);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", averageScore=" + averageScore +
                '}';
    }
}
