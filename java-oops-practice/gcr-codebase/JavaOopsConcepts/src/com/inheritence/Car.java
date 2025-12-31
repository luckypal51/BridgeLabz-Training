package com.inheritence;

public class Car extends Vehicle{
    int seatingCapacity;
	public Car(float maxSpeed, String flueType,int seatingCapacity) {
		super(maxSpeed, flueType);
		this.seatingCapacity = seatingCapacity;
	}
     @Override
    public void displayInfo() {
    	super.displayInfo();
    	System.out.println("Seats     : "+this.seatingCapacity);
    }
}
