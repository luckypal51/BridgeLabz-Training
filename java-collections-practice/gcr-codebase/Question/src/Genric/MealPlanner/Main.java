package Genric.MealPlanner;

public class Main {
	public static void main(String[] args) {
		Meal<MealPlan> meal = new Meal();
		meal.addMeal(new Vegan("veg salad",150,15));
		meal.addMeal(new VegetarianMeal("Paneer",350,20));
		meal.detail();
	}
}
