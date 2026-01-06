package Questions.PetPal;

public class Main {
	 public static void main(String[] args) {

	        Pet dog = new Dog("sheru", 3);
	        Pet cat = new Cat("katty", 2);
	        Pet bird = new Bird("bird", 1);

	        Pet[] pets = { dog, cat, bird };

	        for (Pet pet : pets) {
	            pet.showStatus();
	            pet.makeSound();
	            pet.feed();
	            pet.play();
	            pet.sleep();
	            pet.showStatus();
	        }
	    }
}
