package lesson40Generics.classwork.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Box {

    private List<Object> items = new ArrayList<>();

    public void addItem(Object item) {
        items.add(item);
    }

    public Object getItem() {
        if (items.isEmpty()) {
            return null;
        }
        Random random = new Random();
        int randomIndex = random.nextInt(items.size());
        return items.get(randomIndex);
    }
}
