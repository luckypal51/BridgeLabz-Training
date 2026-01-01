package com.inheritence.vehiclemanagement;

public class PetrolVehicle extends Vehicle implements Refuelable{

	public PetrolVehicle(float maxSpeed, String model) {
		super(maxSpeed, model);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void refuel() {
		System.out.println("Petrol full");
	}

}
