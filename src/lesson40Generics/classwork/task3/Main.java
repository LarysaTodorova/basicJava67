package lesson40Generics.classwork.task3;

import lesson25.classwork.task3.Dog;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List list = new ArrayList();
        list.add(1);
        list.add("Hello");
        list.add(true);
        list.add(new Dog("Oscar", 10, 12.5));

        Object object = list.get(0);

    }
}
