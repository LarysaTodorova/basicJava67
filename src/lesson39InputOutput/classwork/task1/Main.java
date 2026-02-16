package lesson39InputOutput.classwork.task1;

public class Main {
    public static void main(String[] args) {

        int x = 10;
        int y = 0;

        try {
            System.out.println("Start of try block");

            int result = x / y;
            System.out.println("Result: " + result);

            System.out.println("End of try block");
        } catch (ArithmeticException e) {
            System.out.println("Start of catch block");

            System.out.println("Error! " + e.getMessage());

            System.out.println("End of catch block");
        } finally {
            System.out.println("*** Block finally works ***");
        }

        System.out.println("Program ended");
    }
}
