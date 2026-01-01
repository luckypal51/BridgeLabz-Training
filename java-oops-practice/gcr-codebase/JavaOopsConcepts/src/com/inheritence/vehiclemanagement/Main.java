package com.inheritence.vehiclemanagement;

public class Main {
      public static void main(String[] args) {
    	  PetrolVehicle pv = new PetrolVehicle(150f,"CT 100");
    	  ChargingVehicle cv = new ChargingVehicle(120f,"Ola");
    	  
    	  pv.refuel();
    	  cv.refuel();
      }
}
