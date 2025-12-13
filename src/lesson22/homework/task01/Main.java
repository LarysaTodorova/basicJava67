package lesson22.homework.task01;

public class Main {
    public static void main(String[] args) {
        /*
        В классе Main создать объект человека.
        Изменить его е-мейл.
        Вывести все доступные характеристики человека в консоль.
         */

        Person person = new Person("Alexa", 18, "alex@test.com", "149751054955");

        person.setEmail("alexa@one.com");

        System.out.println("Person data: name: " + person.getName() + " , age: " + person.getAge() + " , email: " + person.getEmail());

    }
}
