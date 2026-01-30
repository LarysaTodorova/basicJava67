package lesson36Exceptions.homework.task1;

import lesson22Encapsulation.homework.task01.Person;

public class Main {
    public static void main(String[] args) {
        /*
        В классе Main создать объект человека.
        Изменить его е-мейл.
        Вывести все доступные характеристики человека в консоль.
         */

        Person person = new Person("Alexa", 18, "alex@test.com", "149751054955");

        person.setEmail("alexa@one.com");

        System.out.println("Person data: name: " + person.getName() +
                " , age: " + person.getAge() +
                " , email: " + person.getEmail());

         /*
        Доработать домашнее задание из урока 22 таким образом, чтобы при попытке передачи в сеттер пустого е-мейла
        выбрасывалось встроенное исключение IllegalArgumentException с информативным поясняющим сообщением внутри.
         */

        try {
            person.setEmail("");
        } catch (IllegalArgumentException e) {
            System.out.println("Error! " + e.getMessage());
        }
    }
}
