package com.encapsulation.Hospitalmanagement;

import java.util.*;

class HospitalService {

    public static void processPatients(List<Patient> patients) {

        for (Patient p : patients) {
            p.getPatientDetails();
            System.out.println("Total Bill: ₹" + p.calculateBill());
            System.out.println("----------------------------");
        }
    }
}
