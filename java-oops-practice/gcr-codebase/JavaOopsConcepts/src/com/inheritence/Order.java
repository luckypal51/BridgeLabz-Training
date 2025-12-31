package com.inheritence;

import java.time.LocalDate;

public class Order {
    long orderId;
    LocalDate date;
	public Order(long orderId, LocalDate date) {
		super();
		this.orderId = orderId;
		this.date = date;
	}
    public void orderDetail() {
    	System.out.println("--------Order Details---------");
    	System.out.println("Order-Id     : "+this.orderId);
    	System.out.println("Order Date   : "+this.date);
    }
}
