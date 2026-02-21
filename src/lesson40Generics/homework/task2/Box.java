package lesson40Generics.homework.task2;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {

    private List<T> fruits = new ArrayList<>();

    public void add(T fruit) {
        fruits.add(fruit);
    }

    double sum;

    public double getWeight() {
        for (T fruit : fruits) {
            double weight = fruit.getWeight();
            sum += weight;
        }
        return sum;
    }

    public List<T> sprinkleFruits(List<T> fruitsForSprinkle) {
        List<T> sprinkledFruits = new ArrayList<>();
        for (T fruit : fruitsForSprinkle) {
            if (fruits.contains(fruit)) {
                sprinkledFruits.add(fruit);
            } else {
                System.out.println("This box can contains only " + fruit);
            }
        }
        return sprinkledFruits;
    }

}


