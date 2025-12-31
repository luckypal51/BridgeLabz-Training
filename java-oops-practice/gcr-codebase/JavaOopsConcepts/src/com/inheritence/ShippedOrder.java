package com.inheritence;

import java.time.LocalDate;

public class ShippedOrder extends Order{
    long trackingNo;
	public ShippedOrder(long orderId, LocalDate date,long trackingNo) {
		super(orderId, date);
		this.trackingNo = trackingNo;
	}
   @Override
    public void orderDetail() {
	// TODO Auto-generated method stub
	super.orderDetail();
	 System.out.println("TrackingNo   : "+this.trackingNo);
    }
}
