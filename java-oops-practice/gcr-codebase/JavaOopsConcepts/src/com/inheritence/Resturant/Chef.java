package com.inheritence.Resturant;

public class Chef extends Person implements Worker{

	public Chef(String name, int id) {
		super(name, id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void performDuty() {
		System.out.println("-------Chef Details---------");
		System.out.println("Name      : "+this.name);
		System.out.println("Id        : "+this.id);
		System.out.println("Duty      : Cooking");
	}
   
}
