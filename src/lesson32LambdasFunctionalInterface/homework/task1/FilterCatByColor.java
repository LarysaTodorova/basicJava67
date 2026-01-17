package lesson32LambdasFunctionalInterface.homework.task1;

public class FilterCatByColor implements Filter {

    @Override
    public boolean test(Cat cat) {
        return cat.getColor().equals("Grey");
    }
}
