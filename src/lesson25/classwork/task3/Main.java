package lesson25.classwork.task3;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Dog dog1 = new Dog("Oscar", 10, 12);

        Dog dog2 = dog1;

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog1 == dog2);

        dog2.setAge(4);
        System.out.println("Age of the first dog: " + dog1.getAge());

        Dog dog3 = dog1.clone();
        System.out.println(dog1 == dog3);
        dog3.setName("Ares");
        System.out.println("Name of the first dog: " + dog1.getName());

        Dog dog4 = dog1.copy();
        System.out.println(dog1 == dog4);
        dog4.setWeight(9);
        System.out.println("Weight of the first dog: " + dog1.getWeight());
    }
}
