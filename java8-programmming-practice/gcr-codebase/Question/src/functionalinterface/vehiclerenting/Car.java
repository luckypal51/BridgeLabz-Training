package functionalinterface.vehiclerenting;

public class Car {
      public int carNo;
      public String color;
      public Rent rent;
      public VehicleReturn vehiclereturn;
      
      public  Car() {
    	  rent = ()-> {return 400;};
    	  vehiclereturn = (x)->{System.out.println("Total rent is : "+(rent.rent()*x));};
      }
}
