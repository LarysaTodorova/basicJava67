package lesson23.classwork.task03;

public class Main1 {

    public static void main(String[] args) {

        Flyable flyable = new Airplane();
        flyable.fly();
        flyable = new Bird(0.6, 2);
        flyable.fly();

        Flyable[] flyables = {new Airplane(), new Bird(0.3, 2), new Airplane()};

        System.out.println();
        System.out.println("Flying objects in loop:");

        for (Flyable currentElement : flyables) {
            currentElement.takeOff();
            currentElement.fly();
            currentElement.land();
        }

    }
}
