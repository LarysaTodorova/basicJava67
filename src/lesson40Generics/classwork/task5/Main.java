package lesson40Generics.classwork.task5;

import lesson23Inheritance.classwork.task03.Airplane;
import lesson23Inheritance.classwork.task03.Elephant;

public class Main {
    public static void main(String[] args) {

          /*
        Задача: создать транспорт для перевозки животных.
        Транспорт должен перевозить животных и только животных.
         */

        Transport<Elephant> elephantTransport = new Transport<>();

        elephantTransport.addAnimal(new Elephant(5000, "Grey"));
        elephantTransport.addAnimal(new Elephant(5200, "Dark-grey"));
        elephantTransport.addAnimal(new Elephant(5100, "Light-Grey"));

        elephantTransport.deliver("Munich");

//        Transport<Airplane> airplaneTransport = new Transport<>();
//
//        airplaneTransport.addAnimal(new Airplane());
//        airplaneTransport.addAnimal(new Airplane());
//        airplaneTransport.addAnimal(new Airplane());
//
//        airplaneTransport.deliver("Paris");
    }
}
