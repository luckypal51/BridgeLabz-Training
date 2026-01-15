package Question.Traffic;

public class Main {
	  public static void main(String[] args) {

	        Roundabout roundabout = new Roundabout();
	        VehicleQueue waitingQueue = new VehicleQueue(3);

	        
	        waitingQueue.enqueue(new Vehicle("KA01"));
	        waitingQueue.enqueue(new Vehicle("KA02"));
	        waitingQueue.enqueue(new Vehicle("KA03"));
	        waitingQueue.enqueue(new Vehicle("KA04")); 

	       
	        roundabout.addVehicle(waitingQueue.dequeue());
	        roundabout.addVehicle(waitingQueue.dequeue());

	        roundabout.printRoundabout();

	       
	        roundabout.removeVehicle("KA01");
	        roundabout.printRoundabout();

	       
	        roundabout.addVehicle(waitingQueue.dequeue());
	        roundabout.printRoundabout();
	    }
}
