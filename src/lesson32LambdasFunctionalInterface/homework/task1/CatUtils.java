package lesson32LambdasFunctionalInterface.homework.task1;

import java.util.List;

public class CatUtils {

    public static void printFilteredCats(List<Cat> cats, Filter filter) {
        for (Cat cat : cats) {
            if (filter.test(cat)) {
                System.out.println(cat);
            }
        }
        System.out.println();
    }
}
