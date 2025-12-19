package lesson24.classwork.task4;

public class SolarSystemInfo {
    public static void main(String[] args) {

        for (Planet planet : Planet.values()) {
            System.out.println("Это планета: " + planet.getRussianName());
            System.out.println("Она " + (planet.ordinal() + 1) + "-я от Солнца");

            if (planet.isGasGiants()) {
                System.out.println("Планета является газовым гигантом");
            } else {
                System.out.println("Это планета земного типа");
            }

            System.out.println();
        }
    }
}
