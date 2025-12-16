package lesson23.classwork.task03;

public class Main {

    public static void main(String[] args) {

        Fish fish = new Fish(0.3);
        Bird bird = new Bird(3.5, 2);
        Elephant elephant = new Elephant(7000, "Grey");

        System.out.println(fish.getWeight());

        fish.feed();
        bird.feed();
        elephant.feed();

        Cat[] cats = new Cat[5];

        cats[0] = new Cat(5, "white");


        Animal[] animals = new Animal[5];
        animals[0] = new Dog(15, "brown");
        animals[1] = new Fish(1.2);
        animals[2] = new Elephant(620, "beige");
        animals[3] = new Bird(620, 2);
        animals[4] = new Cat(3.9, "beige");

        System.out.println();
        System.out.println("Animal in loop: ");
        for (Animal currentAnimal : animals) {
            currentAnimal.feed();
        }

//
//        animals[0].feed();
//        animals[1].feed();
//        animals[2].feed();
//
//        Animal[] animals2 = {
//                new Bird(2.4, 2),
//                new Cat(3.8, "Black")
//        };

    }
}
