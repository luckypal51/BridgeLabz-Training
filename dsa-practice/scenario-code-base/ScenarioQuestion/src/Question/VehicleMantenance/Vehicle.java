package Question.VehicleMantenance;

public class Vehicle {
      public String vehicleNo;
      public int mileage;
      
      public Vehicle(String vehicleNo, int mileage) {
    	  this.vehicleNo = vehicleNo;
    	  this.mileage = mileage;
      }
      
      @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return "\nVehicle Number : "+this.vehicleNo+" | Mileage : "+this.mileage;
    }
}
