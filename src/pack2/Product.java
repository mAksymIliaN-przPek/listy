package pack2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Product {
    private int id;
    private String name;

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + "]";
    }
}
 class Main {
    public static void main(String[] args) {
        Product[] productsArray = {
                new Product(1, "Product 1"),
                new Product(2, "Product 2"),
                new Product(3, "Product 3"),
                new Product(4, "Product 4"),
                new Product(5, "Product 5")
        };

        List<Product> productsList = new ArrayList<>(Arrays.asList(productsArray));
        System.out.println("Initial List: " + productsList);

        List<Product> subList = productsList.subList(1, 4);
        System.out.println("Sublist: " + subList);

        productsList.removeAll(subList);
        System.out.println("Modified List: " + productsList);
    }
}
