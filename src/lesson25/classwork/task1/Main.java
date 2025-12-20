package lesson25.classwork.task1;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat(5);
        System.out.println("Cat's age: " + cat.getAge());

        cat.celebrateBirthday();
        System.out.println("Cat's age: " + cat.getAge());

        double number = 5.7;

        MyNumber myNumber = new MyNumber(5.7);

        System.out.println(number);
        System.out.println(myNumber);

        myNumber.power(3);
        System.out.println(myNumber);

        myNumber.increment();
        System.out.println(myNumber);

        int number1 = 9;
        Integer number2 = 9;

        byte number3 = number2.byteValue();
        // byte number4 = number1.byteValue;

    }
}
