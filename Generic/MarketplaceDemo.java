package Generic;

// Generic Product class
class Product<T> {
    private String name;
    private double price;
    private T category;

    Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public void applyDiscount(double percentage) {
        price -= price * (percentage / 100);
    }

    public void displayProduct() {
        System.out.println("Product: " + name + ", Price: " + price + ", Category: " + category);
    }
}

// Categories
enum BookCategory { FICTION, SCIENCE, HISTORY }
enum ClothingCategory { MEN, WOMEN, KIDS }
enum GadgetCategory { MOBILE, LAPTOP, ACCESSORY }

// Generic Method
class Marketplace {
    public static <T> void applyDiscount(Product<T> product, double percentage) {
        product.applyDiscount(percentage);
    }
}

public class MarketplaceDemo {
    public static void main(String[] args) {
        Product<BookCategory> book = new Product<>("Java Book", 500, BookCategory.SCIENCE);
        Product<ClothingCategory> shirt = new Product<>("Shirt", 1000, ClothingCategory.MEN);

        Marketplace.applyDiscount(book, 10);
        Marketplace.applyDiscount(shirt, 20);

        book.displayProduct();
        shirt.displayProduct();
    }
}

