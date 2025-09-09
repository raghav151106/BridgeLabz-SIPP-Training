package Keywords;

class Product {
    // Static variable (same discount for all products)
    static double discount = 10.0; // 10% discount for all products

    // Final variable (unique and unchangeable)
    final int productID;
    String productName;
    double price;
    int quantity;

    // Constructor using "this"
    Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // Static method to update discount
    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
        System.out.println("Updated Discount: " + discount + "%");
    }

    // Display details with instanceof check
    void displayProduct() {
        if (this instanceof Product) {
            System.out.println("Product ID: " + productID);
            System.out.println("Product Name: " + productName);
            System.out.println("Price: " + price);
            System.out.println("Quantity: " + quantity);
            double totalCost = (price * quantity) - ((discount / 100) * price * quantity);
            System.out.println("Total Cost after " + discount + "% discount: " + totalCost);
        }
    }

    public static void main(String[] args) {
        Product p1 = new Product(201, "Laptop", 60000, 1);
        Product p2 = new Product(202, "Mobile", 30000, 2);

        p1.displayProduct();
        System.out.println();
        p2.displayProduct();

        System.out.println();
        Product.updateDiscount(15); // update discount for all products

        System.out.println();
        p1.displayProduct();
        System.out.println();
        p2.displayProduct();
    }
}

