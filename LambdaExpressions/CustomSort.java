package LambdaExpressions;

import java.util.*;

class Product {
    String name;
    double price;
    double rating;

    Product(String name, double price, double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return name + " | " + price + " | " + rating;
    }
}

public class CustomSort {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Laptop", 800, 4.5),
                new Product("Phone", 500, 4.8),
                new Product("Headphones", 50, 4.2)
        );

        // Sort by price using lambda
        products.sort((p1, p2) -> Double.compare(p1.price, p2.price));

        products.forEach(System.out::println);
    }
}

