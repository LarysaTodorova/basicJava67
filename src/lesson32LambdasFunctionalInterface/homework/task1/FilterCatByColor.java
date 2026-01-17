package lesson32LambdasFunctionalInterface.homework.task1;

public class FilterCatByColor implements Filter {

    private String color;

    public FilterCatByColor(String color) {
        this.color = color;
    }

    @Override
    public boolean test(Cat cat) {
        return cat.getColor().equals(color);
    }
}
