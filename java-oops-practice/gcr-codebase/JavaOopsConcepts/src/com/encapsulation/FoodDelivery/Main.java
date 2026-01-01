package com.encapsulation.FoodDelivery;

import java.util.ArrayList;

public class Main {
	 public static void main(String[] args) {

	        ArrayList<FoodItem> order = new ArrayList<>();

	        order.add(new VegItem("Paneer Butter Masala", 250, 2));
	        order.add(new NonVegItem("Chicken Biryani", 300, 1));

	        OrderService.processOrder(order);
	    }
}
