package com.inheritence;

public class Staff extends Person{

	public Staff(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
   
	@Override
	public void personDetail() {
		// TODO Auto-generated method stub
		super.personDetail();
		System.out.println("Role        : Staff");
	}
}
