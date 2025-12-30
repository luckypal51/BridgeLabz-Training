package com.objectmodeling;
import java.util.ArrayList;

class Patient {
    private String name;
    private ArrayList<Doctor> doctors = new ArrayList<>();

    public Patient(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
        }
    }

    public void viewDoctors() {
        System.out.println("Patient: " + name + " consulted:");
        for (Doctor d : doctors) {
            System.out.println(" - Dr. " + d.getName());
        }
    }
}

