package com.encapsulation.VehicleRentalSystem;

class Bike extends Vehicle implements Insurable {

    private String insurancePolicyNumber;

    public Bike(String vehicleNumber, double rentalRate, String policyNumber) {
        super(vehicleNumber, "Bike", rentalRate);
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
        return 50 * days;
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance | Policy: ****" +
                getInsurancePolicyNumber().substring(4);
    }
}
