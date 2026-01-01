package com.encapsulation.VehicleRentalSystem;

import java.util.ArrayList;

public class Main {
	  public static void main(String[] args) {

	        ArrayList<Vehicle> vehicles = new ArrayList<>();

	        vehicles.add(new Car("KA01AB1234", 2000, "CAR987654"));
	        vehicles.add(new Bike("KA02XY5678", 500, "BIK123456"));
	        vehicles.add(new Truck("KA03TR9999", 4000, "TRK456789"));

	        RentalService.calculateCosts(vehicles, 3);
	    }
}
