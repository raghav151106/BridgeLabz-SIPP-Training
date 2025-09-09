package Generic;

import java.util.*;

// Base class
abstract class WarehouseItem {
    String name;
    WarehouseItem(String name) { this.name = name; }
    abstract void displayInfo();
}

// Subclasses
class Electronics extends WarehouseItem {
    Electronics(String name) { super(name); }
    public void displayInfo() { System.out.println("Electronics: " + name); }
}
class Groceries extends WarehouseItem {
    Groceries(String name) { super(name); }
    public void displayInfo() { System.out.println("Groceries: " + name); }
}
class Furniture extends WarehouseItem {
    Furniture(String name) { super(name); }
    public void displayInfo() { System.out.println("Furniture: " + name); }
}

// Generic Storage
class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();
    public void addItem(T item) { items.add(item); }
    public List<T> getItems() { return items; }

    // Wildcard method
    public static void displayAll(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) item.displayInfo();
    }
}

public class WarehouseDemo {
    public static void main(String[] args) {
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop"));
        electronicsStorage.addItem(new Electronics("Phone"));

        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.addItem(new Groceries("Rice"));
        groceriesStorage.addItem(new Groceries("Milk"));

        System.out.println("Displaying Electronics:");
        Storage.displayAll(electronicsStorage.getItems());
        System.out.println("Displaying Groceries:");
        Storage.displayAll(groceriesStorage.getItems());
    }
}

