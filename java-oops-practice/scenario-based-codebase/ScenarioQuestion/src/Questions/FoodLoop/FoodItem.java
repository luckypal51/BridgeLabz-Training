package Questions.FoodLoop;

public class FoodItem {
       private String name;
       private String categorie;
       private boolean availability;
       private double price;
	   
	   
       public FoodItem(String name, String categorie, boolean availability, double price) {
		this.name = name;
		this.categorie = categorie;
		this.availability = availability;
		this.price = price;
	   }
        

	   public String getName() {
		   return name;
	   }

	   public void setName(String name) {
		   this.name = name;
	   }

	   public String getCategorie() {
		   return categorie;
	   }

	   public void setCategorie(String categorie) {
		   this.categorie = categorie;
	   }

	   public boolean isAvailability() {
		   return availability;
	   }

	   public void setAvailability(boolean availability) {
		   this.availability = availability;
	   }

	   public double getPrice() {
		   return price;
	   }

	   public void setPrice(double price) {
		   this.price = price;
	   }
     
	   public void details() {
		   System.out.println("\n-------Food Item Details---------");
		   System.out.println("Food Name    : "+getName());
		   System.out.println("categorie    : "+getCategorie());
		   System.out.println("Availability : "+isAvailability());
		   System.out.println("Price        : "+getPrice());
	   }
       
}
