package functionalinterface.vehiclerenting;

public class Main {
       public static void main(String[] args) {
		Bike bike = new Bike();
		Bus bus = new Bus();
		Car car = new Car();
	    System.out.println("\nBike rent is : "+bike.rent.rent());
	    System.out.println("Car rent is  : "+car.rent.rent());
	    System.out.println("Bus rent is  : "+bus.rent.rent());
	    
	    System.out.println(" ");
	    bike.vehiclereturn.vehicleReturn(4);
	    car.vehiclereturn.vehicleReturn(2);
	    bus.vehiclereturn.vehicleReturn(10);
	}
}
