package com.encapsulation.VehicleRentalSystem;

import java.util.*;

class RentalService {

    public static void calculateCosts(List<Vehicle> vehicles, int days) {

        for (Vehicle v : vehicles) {
            double rentalCost = v.calculateRentalCost(days);
            double insuranceCost = 0;

            System.out.println("Vehicle Type: " + v.getType());
            System.out.println("Vehicle Number: " + v.getVehicleNumber());
            System.out.println("Rental Cost: ₹" + rentalCost);

            if (v instanceof Insurable) {
                Insurable ins = (Insurable) v;
                insuranceCost = ins.calculateInsurance(days);
                System.out.println(ins.getInsuranceDetails());
                System.out.println("Insurance Cost: ₹" + insuranceCost);
            }

            System.out.println("Total Cost: ₹" + (rentalCost + insuranceCost));
            System.out.println("----------------------------------");
        }
    }
}
