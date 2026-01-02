package Questions.vehicle;

public class Car extends Vehicle{
    double rentDays;
	public Car(String rentalName, String vehicleno,double rentDays) {
		super(rentalName, vehicleno);
		this.rentDays = rentDays;
	}
    public void details() {
    	System.out.println("  ");
    	System.out.println("--------Rent Detail(Car)--------");
    	System.out.println("Vehicle No  : "+this.vehicleno);
    	System.out.println("Rental Name : "+this.rentalName);
    	System.out.println("Days        : "+this.rentDays);
    	System.out.println("Total amount: "+(this.rentDays*800));
    }
}