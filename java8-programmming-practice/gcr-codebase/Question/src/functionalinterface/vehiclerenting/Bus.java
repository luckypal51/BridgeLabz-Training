package functionalinterface.vehiclerenting;

public class Bus {
	   public int busNo;
	      public String color;
	      public Rent rent;
	      public VehicleReturn vehiclereturn;
	      
	      public  Bus() {
	    	  rent = ()-> {return 800;};
	    	  vehiclereturn = (x)->{System.out.println("Total rent is : "+(rent.rent()*x));};
	      }
}
