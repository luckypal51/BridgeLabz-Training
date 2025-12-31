package com.inheritence;

public class ShowRoom {
	public static void main(String[] args) {
		Vehicle v = new Vehicle(150,"Diesel");
		Car car = new Car(210,"Diesel/Petrol",5);
		Truck truck = new Truck(180,"Diesel",3);
		MotorCycle mt = new MotorCycle(180,"Petrol",2);
		Vehicle[] arr = {car,v,truck,mt};
		
		for(Vehicle k:arr) {
			k.displayInfo();
		}
		
		
	}
}
