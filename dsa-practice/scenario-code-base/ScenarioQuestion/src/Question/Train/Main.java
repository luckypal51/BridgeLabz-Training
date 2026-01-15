package Question.Train;

public class Main {

	public static void main(String[] args) {
		 TrainCompanion train = new TrainCompanion();

	        train.addCompartment("Engine");
	        train.addCompartment("Sleeper");
	        train.addCompartment("Pantry");
	        train.addCompartment("AC");
	        train.addCompartment("General");

	        train.moveForward();
	        train.moveBackward();

	        train.showAdjacent("Pantry");

	        train.removeCompartment("Sleeper");

	        train.moveForward();
	}

}
