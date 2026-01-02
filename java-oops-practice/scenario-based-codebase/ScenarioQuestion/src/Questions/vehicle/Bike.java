package Questions.vehicle;

public class Bike extends Vehicle{
    double rentDays;
	public Bike(String rentalName, String vehicleno,double rentDays) {
		super(rentalName, vehicleno);
		this.rentDays = rentDays;
	}
    public void details() {
    	System.out.println("  ");
    	System.out.println("--------Rent Detail(Bike)--------");
    	System.out.println("Vehicle No  : "+this.vehicleno);
    	System.out.println("Rental Name : "+this.rentalName);
    	System.out.println("Days        : "+this.rentDays);
    	System.out.println("Total amount: "+(this.rentDays*500));
    }
}
