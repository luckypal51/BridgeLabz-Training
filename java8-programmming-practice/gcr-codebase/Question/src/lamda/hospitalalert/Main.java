package lamda.hospitalalert;

import java.util.ArrayList;

public class Main {
      public static void main(String[] args) {
		ArrayList<Patient> patient = new ArrayList<>();
		patient.add(new Patient(101,"Lucky",AlertType.LOW));
		patient.add(new Patient(102,"Himesh",AlertType.HIGH));
		patient.add(new Patient(103,"Nageshwar",AlertType.MEDIUM));
		patient.add(new Patient(104,"Arvind",AlertType.HIGH));
		patient.add(new Patient(105,"Miraaz",AlertType.MEDIUM));
		
		System.out.println("Patient With LOW Alert    :");
		patient.stream().filter(x->x.alert==AlertType.LOW).forEach(System.out::println);
		
		System.out.println("\nPatient With MEDIUM Alert :");
		patient.stream().filter(x->x.alert==AlertType.MEDIUM).forEach(System.out::println);
		
		System.out.println("\nPatient With HIGH Alert   :");
		patient.stream().filter(x->x.alert==AlertType.HIGH).forEach(System.out::println);
		
		
	}
}
