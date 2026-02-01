package functionalinterface.vehiclerenting;

public class Bike {
	   public int bikeNo;
	      public String color;
	      public Rent rent;
	      public VehicleReturn vehiclereturn;
	      
	      public  Bike() {
	    	  rent = ()-> {return 200;};
	    	  vehiclereturn = (x)->{System.out.println("Total rent is : "+(rent.rent()*x));};
	      }
}
