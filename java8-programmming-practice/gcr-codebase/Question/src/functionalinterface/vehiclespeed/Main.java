package functionalinterface.vehiclespeed;

public class Main {
	 public static void main(String[] args) {

	        Vehicle normalCar = new Car();
	        normalCar.displaySpeed();
	        normalCar.displayBatteryPercentage();

	        System.out.println();

	        Vehicle ev = new ElectricCar();
	        ev.displaySpeed();
	        ev.displayBatteryPercentage();
	    }
}
