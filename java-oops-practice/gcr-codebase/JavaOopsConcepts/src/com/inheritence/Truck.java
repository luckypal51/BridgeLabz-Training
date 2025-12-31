package com.inheritence;

public class Truck extends Vehicle{
    int seatingCapacity;
	public Truck(float maxSpeed, String flueType,int seatingCapacity) {
		super(maxSpeed, flueType);
		this.seatingCapacity = seatingCapacity;
		// TODO Auto-generated constructor stub
	}
  @Override
     public void displayInfo() {
	// TODO Auto-generated method stub
     	super.displayInfo();
     	System.out.println("Seats     : "+this.seatingCapacity);
    } 
}
