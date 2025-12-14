package lesson22.gptPractice.task1;


public class Main {
    public static void main(String[] args) {

        Person person = new Person("Jack", 25, "Jack@one.com", "+49726682497");

        boolean isChanged = person.setEmail("");
        System.out.println(isChanged);

        System.out.println("Person data: " + person.getName() + " " + person.getAge() + " " + person.getEmail());
    }
}
