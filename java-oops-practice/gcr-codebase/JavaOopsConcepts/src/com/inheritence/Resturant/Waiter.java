package com.inheritence.Resturant;

public class Waiter extends Person implements Worker {

	public Waiter(String name, int id) {
		super(name, id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void performDuty() {
		System.out.println("-------Waiter Details---------");
		System.out.println("Name      : "+this.name);
		System.out.println("Id        : "+this.id);
		System.out.println("Duty      : Serving");
		
	}
  
}
