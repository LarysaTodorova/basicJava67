package lesson36.classwork.task3;

public class Main {
    public static void main(String[] args) {

        ProductService service = new ProductService();

        service.addProduct(new Product("Banana", 5));
        service.addProduct(new Product("Apple", 3.4));
        service.addProduct(new Product("Lemon", 6.7));

        try {
            Product product = service.findByTitle("Lemon");
            System.out.println("Price for lemon is: " + product.getPrice());

            product = service.findByTitle("Orange");
            System.out.println("Price for orange is: " + product.getPrice());
        } catch (ProductNotFoundException e) {
            System.out.println("Error! " + e.getMessage());
        }
    }
}
