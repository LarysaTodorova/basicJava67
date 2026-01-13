package lesson31Map.classwork.task2;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<String, Double> products = new HashMap<>();
        products.put("Apple", 4.0);
        products.put("Orange", 6.0);
        products.put("Lemon", 7.0);
        products.put("Banana", 4.50);
        products.put("Kiwi", 7.50);
        products.put("Pineapple", 11.50);

        for (String productTitle : products.keySet()) {
            System.out.println(productTitle);
        }

        System.out.println();

        double sum = 0;

        for (Double productPrice : products.values()) {
            sum += productPrice;
        }
        System.out.println(sum);

        System.out.println();

        for (Map.Entry<String, Double> pair : products.entrySet()) {
            String productTitle = pair.getKey();
            Double productPrice = pair.getValue();
            System.out.println(productTitle + ": " + productPrice);
        }

    }
}
