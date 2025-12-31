package com.inheritence;

public class Vehicle {
       float maxSpeed;
       String flueType;
	   public Vehicle(float maxSpeed, String flueType) {
		this.maxSpeed = maxSpeed;
		this.flueType = flueType;
	   }
       
	   public void displayInfo() {
		   System.out.println(" ");
		   System.out.println("-------Vehicle Information---------");
		   System.out.println("maxSpeed  : "+this.maxSpeed);
		   System.out.println("flueType  : "+this.flueType);
	   }
}
