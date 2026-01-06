package Questions.SwiftCart;

import java.util.ArrayList;

public class GroceryStore {
   static ArrayList<Product> product = new ArrayList<>();
   
   public void addProduct(Product p) {
	   product.add(p);
   }
   public void viewProduct() {
	   for(Product p:product) {
		   p.details();
	   }
   }
}
