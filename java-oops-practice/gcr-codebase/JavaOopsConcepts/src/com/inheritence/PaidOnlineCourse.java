package com.inheritence;

public class PaidOnlineCourse extends OnlineCourse{
	public float amount;
	public float discount;

	public PaidOnlineCourse(String name, int duration, String platfrom, boolean isRecorded,float amount,float discount) {
		super(name, duration, platfrom, isRecorded);
		this.amount = amount;
		this.discount = discount;
	}
 
	@Override
	public void courseDetail() {
		// TODO Auto-generated method stub
		super.courseDetail();
		System.out.println("Amount      : "+this.amount);
		System.out.println("Discount    : "+this.discount);
	}
}
