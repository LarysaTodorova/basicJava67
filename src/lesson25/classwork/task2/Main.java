package lesson25.classwork.task2;

public class Main {
    public static void main(String[] args) {

        int x = 5;
        int y = 5;

        boolean result = x == y;
        System.out.println("If variables are equals? " + result);

        Elephant elephant1 = new Elephant("grey", 7);
        Elephant elephant2 = new Elephant("grey", 7);

        result = elephant1 == elephant2;
        System.out.println("If variables are equals? " + result);

        Integer number1 = 5;
        Integer number2 = 5;
        result = number1 == number2;
        System.out.println("If variables are equals? " + result);

        result= elephant1.equals(elephant2);
        System.out.println("If elephants are equals? " + result);
    }
}
