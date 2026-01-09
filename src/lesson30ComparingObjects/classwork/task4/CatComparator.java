package lesson30ComparingObjects.classwork.task4;

import java.util.Comparator;

public class CatComparator implements Comparator<Cat> {

    @Override
    public int compare(Cat firstCt, Cat secondCat) {
        return firstCt.getColor().compareTo(secondCat.getColor());
    }
}
