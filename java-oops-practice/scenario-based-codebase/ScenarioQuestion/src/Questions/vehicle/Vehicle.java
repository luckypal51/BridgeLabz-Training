package Questions.vehicle;

public abstract class Vehicle {
       String rentalName;
       String vehicleno;
	   public Vehicle(String rentalName, String vehicleno) {
		this.rentalName = rentalName;
		this.vehicleno = vehicleno;
	   }
     public abstract void details();  
}
