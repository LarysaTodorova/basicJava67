package lesson25.classwork.task1;

public class Cat {

    private int age;

    public Cat(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void celebrateBirthday() {
        System.out.println("Hoora! It's a cat's birthday!");
        age++;
    }
}
