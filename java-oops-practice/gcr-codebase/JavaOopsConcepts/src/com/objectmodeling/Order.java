package com.objectmodeling;
import java.util.ArrayList;

class Order {
    private int orderId;
    private ArrayList<Product> products = new ArrayList<>();

    public Order(int orderId) {
        this.orderId = orderId;
    }

    // Communication
    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Product added: " + product.getName());
    }

    public void showOrderDetails() {
        double total = 0;
        System.out.println("Order ID: " + orderId);
        for (Product p : products) {
            System.out.println(" - " + p.getName() + " : ₹" + p.getPrice());
            total += p.getPrice();
        }
        System.out.println("Total Amount: ₹" + total);
    }
}
