package lesson25.classwork.task1;

public class Main1 {
    public static void main(String[] args) {

        MyNumber myNumber = new MyNumber(2.3);

        Integer number = 7;

        Integer number1 = new Integer(7);

        System.out.println(number);
        System.out.println(number1);

        int primitiveInt = number;

        int number2 = 32;
        calculate(number2);

        Double number3 = 11.2;
        printInfo(number3);

    }

    public static void printInfo(double number) {
        if (number > 10) {
            System.out.println("Number is greater than 10");
        } else {
            System.out.println("Number is less than 10");
        }
    }

    public static void calculate(Integer number) {
        System.out.println(number + 10);
    }
}
