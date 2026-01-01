package com.encapsulation.VehicleRentalSystem;

public class Car extends Vehicle implements Insurable {

    private String insurancePolicyNumber; 

    public Car(String vehicleNumber, double rentalRate, String policyNumber) {
        super(vehicleNumber, "Car", rentalRate);
        this.insurancePolicyNumber = policyNumber;
    }

   
    private String getInsurancePolicyNumber() {
        return insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance(int days) {
        return 100 * days; 
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance | Policy: ****" +
                getInsurancePolicyNumber().substring(4);
    }
}
