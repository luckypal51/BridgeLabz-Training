package Tree.HospitalManagementSystem;

public class Main {
	  public static void main(String[] args) {
	        HospitalSystem hs = new HospitalSystem();

	        hs.registerPatient(101, "Lucky Pal");
	        hs.registerPatient(102, "Himesh Kurmi");
	        hs.registerPatient(103, "Nageshwar Patel");

	        hs.displayByArrival();

	        hs.dischargePatient(102);

	        hs.displayByArrival();
	    }
}
