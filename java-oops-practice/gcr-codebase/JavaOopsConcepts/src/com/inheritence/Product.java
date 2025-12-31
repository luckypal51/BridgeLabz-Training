package com.inheritence;

import java.time.LocalDate;

public class Product {
	public static void main(String[] args) {
		DeliveredOrder dev = new DeliveredOrder(101l,  LocalDate.of(2025, 12, 5),1051l,  LocalDate.of(2025, 12, 10));
		ShippedOrder so = new ShippedOrder(101l,LocalDate.of(2025, 12, 5),1051l);
		Order o = new Order(101l,LocalDate.of(2025, 12, 5));
		o.orderDetail();
		so.orderDetail();
		dev.orderDetail();
	}
}
