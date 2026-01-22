package lesson34StreamAPI.homework.task2;

import java.util.Objects;

public class Customer {
    private String name;
    private int age;
    private int numberOfPurchases;

    public Customer(String name, int age, int numberOfPurchases) {
        this.name = name;
        this.age = age;
        this.numberOfPurchases = numberOfPurchases;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getNumberOfPurchases() {
        return numberOfPurchases;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return age == customer.age && numberOfPurchases == customer.numberOfPurchases && Objects.equals(name, customer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, numberOfPurchases);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", numberOfPurchases=" + numberOfPurchases +
                '}';
    }
}
