package Genric.MealPlanner;

public class Vegan extends MealPlan {

	public Vegan(String name, int calories, double protein) {
		super(name, calories, protein,"Vegan");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void display() {
		    System.out.println("\n-----Vegan Meal--------");
		    System.out.println("Meal Name : "+this.getName());
		    System.out.println("Calories  : "+this.getCalories());
		    System.out.println("Protein   : "+this.getProtein());
		    System.out.println("Type      : "+this.getType());
	}

}
