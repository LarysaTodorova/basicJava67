package lesson22.classwork.task03;

public class Main {

    public static void main(String[] args) {

        Dog dog =  new Dog();

        dog.breed = "Boston Terier";
        dog.age = 12;
        dog.weight = 12.8;

        System.out.println("Dog breed: " + dog.breed);

        Dog dog1 =  new Dog("Shpitz", 4, 3.2);

        Dog dog2 = new Dog("Hasky", 5);
        Dog dog3 = new Dog("Korgy", 7.5);

    }
}
