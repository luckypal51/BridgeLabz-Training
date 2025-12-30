package com.objectmodeling;
import java.util.ArrayList;

class Customer2 {
    private String name;
    private ArrayList<Order> orders = new ArrayList<>();

    public Customer2(String name) {
        this.name = name;
    }

    // Communication
    public Order placeOrder(int orderId) {
        Order order = new Order(orderId);
        orders.add(order);
        System.out.println(name + " placed Order ID: " + orderId);
        return order;
    }

    public void viewOrders() {
        System.out.println("Customer: " + name + " Orders:");
        for (Order o : orders) {
            o.showOrderDetails();
        }
    }
}
