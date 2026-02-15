package lesson38InputOutput.classwork.task2;

public class Main {
    public static void main(String[] args) {

        int number1 = 10;
        int number2 = 0;

        if (number2 == 0) {
            System.err.println("Error, you can't divide by zero!");
        } else {
            int result = number1 / number2;
            System.out.println("Result: " + result);

        }
    }
}
