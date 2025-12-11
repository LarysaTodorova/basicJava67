package lesson21.classwork;

public class Task5 {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder("Hello, world!");
        char symbol = builder.charAt(4);
        System.out.println("Symbol by index 5: " + symbol);

        StringBuilder fruits = new StringBuilder("Apple, Peach, Lemon, Orange");
        System.out.println("String before delete: " + fruits);
        fruits.delete(7, 14);
        System.out.println("String after delete: " + fruits);

        StringBuilder builder1 = new StringBuilder("I study Jaava");
        builder1.deleteCharAt(9);
        System.out.println(builder1);

        int index = fruits.indexOf("Lemon");
        System.out.println("In string lemon is by index: " + index);

        fruits.insert(7, "Grape, ");
        System.out.println(fruits);

        fruits.replace(21, 27, "Banana");
        System.out.println(fruits);

        fruits.reverse();
        System.out.println(fruits);
        fruits.reverse();

        String banana = fruits.substring(21, 27);
        System.out.println(banana);
        System.out.println(fruits);

        String allFruits = fruits.toString();
        System.out.println(allFruits);
    }
}
