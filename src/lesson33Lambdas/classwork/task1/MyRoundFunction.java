package lesson33Lambdas.classwork.task1;

public class MyRoundFunction implements MyFunction{

    @Override
    public long getResult(double value) {
        System.out.println("Passed value: " + value);
        return Math.round(value);
    }
}
