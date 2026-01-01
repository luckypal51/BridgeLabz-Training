package com.inheritence.vehiclemanagement;

public class ChargingVehicle extends Vehicle implements Refuelable{

	public ChargingVehicle(float maxSpeed, String model) {
		super(maxSpeed, model);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void refuel() {
		System.out.println("Charging Completed");
	}

}
