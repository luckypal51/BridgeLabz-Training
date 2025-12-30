package com.objectmodeling;

public class Ecommerce {
	
	    public static void main(String[] args) {

	        Customer2 c1 = new Customer2("Lucky"); 

	        Product p1 = new Product(101, "Laptop", 65000);
	        Product p2 = new Product(102, "Mouse", 800);
	        Product p3 = new Product(103, "Keyboard", 1500);

	        Order order1 = c1.placeOrder(1);

	        order1.addProduct(p1);
	        order1.addProduct(p2);
	        order1.addProduct(p3);

	        c1.viewOrders();
	}

}
