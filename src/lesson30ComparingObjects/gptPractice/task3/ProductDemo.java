package lesson30ComparingObjects.gptPractice.task3;

import java.util.Set;
import java.util.TreeSet;

public class ProductDemo {
    public static void main(String[] args) {

        Set<Product> products = new TreeSet<>(new ProductComparator());

        products.add(new Product("Fruits", "Apple", 6, true));
        products.add(new Product("Cars", "BMW", 59000, true));
        products.add(new Product("Fruits", "Banana", 7, false));
        products.add(new Product("Fruits", "Kiwi", 10, true));
        products.add(new Product("Fruits", "Orange", 7, true));
        products.add(new Product("Fruits", "Kiwi", 10, false));
        products.add(new Product("Cars", "Audi", 21000, false));
        products.add(new Product("Cars", "BMW", 22000, true));
        products.add(new Product("Cars", "Audi", 22000, true));

        for (Product product : products) {
            System.out.println(product);
        }

    }
}
