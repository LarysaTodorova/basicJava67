package lesson40Generics.classwork.task4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Box<T> {

    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public T getItem() {
        if (items.isEmpty()) {
            return null;
        }
        Random random = new Random();
        int randomIndex = random.nextInt(items.size());
        return items.get(randomIndex);
    }
}
