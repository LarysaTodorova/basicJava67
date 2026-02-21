package lesson40Generics.homework.task2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Box<T extends Fruit> {

    private List<T> fruits = new ArrayList<>();

    public void add(T fruit) {
        fruits.add(fruit);
    }

    public double getWeight() {
        double sum = 0;
        for (T fruit : fruits) {
            sum += fruit.getWeight();
        }
        return sum;
    }

//    public void sprinkleFruits(Box<T> boxForSprinkle) {
//        boxForSprinkle.fruits.addAll(fruits);
//        fruits.clear();
//    }

    public void sprinkleFruits(Box<T> boxForSprinkle) {
        if (boxForSprinkle == null || boxForSprinkle == this) return;

        Iterator<T> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            T fruit = iterator.next();
            boxForSprinkle.add(fruit);
            iterator.remove();
        }
    }

    public void printData() {
        for (T fruit : fruits) {
            System.out.println(fruit);
        }
    }
}




