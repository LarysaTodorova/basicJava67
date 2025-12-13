package lesson22.classwork.task05;

public class Main {
    public static void main(String[] args) {

        Parrot parrot = new Parrot("Red", 30);

        System.out.println("Parrot color: " + parrot.getColor());
        parrot.setWords(45);
        parrot.setWords(-10);

    }
}
