package lesson24Enum.classwork.task4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Planet planet = Planet.EARTH;
        System.out.println("Planet name: " + planet);

        Planet[] solarSystem = Planet.values();
        System.out.println("All planets: " + Arrays.toString(solarSystem));

        Planet[] gasGiants = {Planet.NEPTUNE, Planet.URANUS, Planet.SATURN, Planet.JUPITER};
        System.out.println("All gas giants: " + Arrays.toString(gasGiants));

        System.out.println("Current planet: " + planet);
        System.out.println("And it's ordinal number: " + planet.ordinal());

        System.out.println("Jupiter in order from sun: " + getOrdinalNumberFromSun("Jupiter"));
        System.out.println("Eath in order from sun: " + getOrdinalNumberFromSun("Earth"));
    }

    public static int getOrdinalNumberFromSun(String planetName) {
        Planet planet = Planet.valueOf(planetName.toUpperCase());
        return planet.ordinal() + 1;
//        switch (planetName) {
//            case "Mercury":
//                return 1;
//            case "Venus":
//                return 2;
//            case "Earth":
//                return 3;
//        }
    }
}
