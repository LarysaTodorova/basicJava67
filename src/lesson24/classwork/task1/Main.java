package lesson24.classwork.task1;

public class Main {
    public static void main(String[] args) {

        // Color color = new Color(); так не работает

        Color color = Color.RED;
        System.out.println("Color in variable color: " + color);

        color = Color.GREEN;
        System.out.println("Color in variable color: " + color);

        Toy toy1 = new Toy("Car", 20, Color.RED);
        Toy toy2 = new Toy("Plane", 30, Color.BLUE);
        Toy toy3 = new Toy("Tractor", 15, Color.GREEN);
    }
}
