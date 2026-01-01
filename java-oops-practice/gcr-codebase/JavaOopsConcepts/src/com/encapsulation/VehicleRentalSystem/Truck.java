package com.encapsulation.VehicleRentalSystem;

class Truck extends Vehicle implements Insurable {

    private String insurancePolicyNumber;

    public Truck(String vehicleNumber, double rentalRate, String policyNumber) {
        super(vehicleNumber, "Truck", rentalRate);
        this.insurancePolicyNumber = policyNumber;
    }

    private String getInsurancePolicyNumber() {
        return insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days + 500; 
    }

    @Override
    public double calculateInsurance(int days) {
        return 200 * days; 
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance | Policy: ****" +
                getInsurancePolicyNumber().substring(4);
    }
}
