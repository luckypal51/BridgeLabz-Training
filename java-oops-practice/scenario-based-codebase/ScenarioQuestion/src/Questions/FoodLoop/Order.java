package Questions.FoodLoop;

import java.util.ArrayList;

public class Order {
  ArrayList<FoodItem> foodlist = new ArrayList<>();
  
  public Order() {
	  foodlist.add(new VegFood("Paneer Tikka Masala","Veg",true,150));
	  foodlist.add(new VegFood("Paneer Kolhapuri","Veg",true,350));
	  foodlist.add(new VegFood("Chole Bhatore","Veg",true,40));
	  foodlist.add(new NonVegFood("Chicken Tikka","Non-Veg",true,450));
	  foodlist.add(new NonVegFood("Chicken Biryani","Non-Veg",true,70));
	  foodlist.add(new VegFood("Gajar Ka Halwa","Veg",true,150));
  }
  public void order(User user,String name) {
	   for(FoodItem food: foodlist) {
		   if(food.getName().equalsIgnoreCase(name)) {
			   if(user.getWallet()>=food.getPrice()) {
				   if(food.isAvailability()) {
					    user.addItem(food);
					    food.setAvailability(false);
					    user.setWallet(user.getWallet()-food.getPrice());
					    return;
				   }else {
					   System.out.println("Food Not Available");
					   return;
					   }
				 
			   }else {
				   System.out.println("Not Enough Balance");
				   return;
			   }
		   }
	   }
	   System.out.println("Food Item Not Found");
  }
  
  
  public void cancel(User user,String name) {
	   for(FoodItem food: foodlist) {
		   if(food.getName().equalsIgnoreCase(name)) {
			      if(user.cancelItem(name)) {
			    	  food.setAvailability(true);
					    user.setWallet(user.getWallet()+food.getPrice());
					    return; 
			          }else {
			        	  return;
			          }
			   }
		   }
	   System.out.println("Food Item not Found ");
	   }
     
     
     public void details() {
    	  for(FoodItem list: foodlist) {
    		  list.details();
    	  }
      }
      
     public void bill(User user) {
    	 double sum = 0;
    	 
    	 for(FoodItem food: user.foodItem) {
    		 food.details();
    		 sum +=food.getPrice();
    	 }
    	 System.out.println("--------------------------");
    	 System.out.println("Total Amount : "+sum);
    	 System.out.println("Discount     : "+((sum/100)*15));
    	 System.out.println("Final Amount : "+(sum-((sum/100)*15)));
    	 System.out.println("---------------------------");
     }
}
