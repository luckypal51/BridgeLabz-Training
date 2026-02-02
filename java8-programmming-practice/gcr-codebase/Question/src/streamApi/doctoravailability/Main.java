package streamApi.doctoravailability;

import java.util.ArrayList;

public class Main {
       public static void main(String[] args) {
		ArrayList<Doctor> doctor = new ArrayList<>();
		doctor.add(new Doctor("Lucky","physchatrist",true));
		doctor.add(new Doctor("Himesh","Gienologist",false));
		doctor.add(new Doctor("Nageshwar","cardiology",true));
		doctor.add(new Doctor("Arvind","physiologist",true));
		
		System.out.println("List By availability on weekend and sorted by speciality");
		doctor.stream().filter(x->x.availableOnWeekend==true).sorted((Doctor a, Doctor b)->a.speciality.compareTo(b.speciality)).forEach(System.out::println);;
	}
}
