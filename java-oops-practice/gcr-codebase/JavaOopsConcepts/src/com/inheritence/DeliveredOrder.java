package com.inheritence;

import java.time.LocalDate;

public class DeliveredOrder extends ShippedOrder {
	 LocalDate deliveryDate;
     public DeliveredOrder(long orderId, LocalDate date, long trackingNo,LocalDate deliveryDate) {
		super(orderId, date, trackingNo);
		this.deliveryDate = deliveryDate;
	}

	@Override
	public void orderDetail() {
		// TODO Auto-generated method stub
		super.orderDetail();
		System.out.println("DeliveryDate : "+this.deliveryDate);
	}
}
