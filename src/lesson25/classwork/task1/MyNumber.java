package lesson25.classwork.task1;

public class MyNumber {

    private double value;

    public MyNumber(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void power(double pow) {
        value = Math.pow(value, pow);
    }
    public void increment() {
        value++;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
