package Tree.HospitalManagementSystem;

import java.util.*;

class HospitalSystem {
    Queue<Patient> queue = new LinkedList<>();
    TreeMap<Integer, Patient> patientMap = new TreeMap<>();

    public void registerPatient(int id, String name) {
        Patient p = new Patient(id, name);
        queue.add(p);
        patientMap.put(id, p);
        System.out.println("Registered: " + p);
    }
    public void dischargePatient(int id) {
        Patient p = patientMap.remove(id);

        if (p == null) {
            System.out.println("Patient not found!");
            return;
        }

        queue.remove(p);
        System.out.println("Discharged: " + p);
    }
  
    public void displayByArrival() {
        System.out.println("Patients by Arrival Time:");
        for (Patient p : queue) {
            System.out.println(p);
        }
    }
}
