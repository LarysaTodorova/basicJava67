package lesson31Map.classwork.task1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        List<String> words = new ArrayList<>();

        Map<String, Double> products = new HashMap<>();
        products.put("Apple", 4.0);
        products.put("Orange", 6.0);
        products.put("Lemon", 7.0);
        products.put("Banana", 4.50);
        products.put("Kiwi", 7.50);
        products.put("Pineapple", 11.50);

        System.out.println(products);

        Double price = products.get("Lemon");
        System.out.println("Lemon price: " + price);

        price = products.get("Coconuts");
        System.out.println("Coconuts price: " + price);

        products.put("Cherry", 11.50);
        System.out.println(products);

        products.put("Orange", 5.50);
        System.out.println(products);

        products.putIfAbsent("Grape", 15.0);
        System.out.println(products);

        products.putIfAbsent("Banana", 6.10);
        System.out.println(products);

        int size = products.size();
        System.out.println("Size of products is: " + size);

        boolean key = products.containsKey("Melon");
        System.out.println("Contains map key Melon: " + key);
        System.out.println("Contains map key Pineapple: " + products.containsKey("Pineapple"));

        System.out.println("Contains map value 15: " + products.containsValue(15.0));
        System.out.println("Contains map value 50.5: " + products.containsValue(50.5));

        System.out.println("Is price for the Pineapple 11.50: " + products.get("Pineapple").equals(11.50));

        // будет NullPointerException
        // System.out.println("Is price for the Peach 15.50: " + products.get("Peach").equals(15.50));

        String productsTitle = "Kiwi";

        if (products.containsKey(productsTitle)) {
            System.out.println("Is price for the product 7.50: " + products.get(productsTitle).equals(7.50));
        } else {
            System.out.println("We have no the same product");
        }

        price = products.get(productsTitle);

        if (price != null) {
            System.out.println("Is price for the product 7.50: " + price.equals(7.50));
        } else {
            System.out.println("We have no the same product");
        }

        products.remove("Lemon");
        System.out.println(products);

    }
}
