package lesson22.classwork.task02;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat();

        cat.color = "Black";
        cat.age = 5;
        cat.weight = 4.25;

        printInfo(cat);
        cat.sayMeow();

        Cat cat1 = new Cat();

        cat1.color = "Ginger";
        cat1.age = 3;
        cat1.weight = 2.95;

        printInfo(cat1);
        cat1.sayMeow();
        cat1.play();

        cat1.printInfo1();
    }

    public static void printInfo(Cat cat) {
        System.out.println("Info about cat: ");
        System.out.println("Cat color - " + cat.color);
        System.out.println("Cat age - " + cat.age);
        System.out.println("Cat weight - " + cat.weight);
    }
}
