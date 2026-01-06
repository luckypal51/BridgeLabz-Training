package Questions.SwiftCart;

import java.util.ArrayList;

public class Cart {
	double totalAmount;
    ArrayList<Product> items = new ArrayList<>();
   
   public void addToCart(int productId) {
	   for(Product p:GroceryStore.product) {
		   if(p.productId==productId) {
			   items.add(p);
			   System.out.println("SuccessFully added "+p.productName);
			   totalAmount+=p.productPrice;
			   return;
		   }
	   }
	   System.out.println("Product Not Found");
   }
   
   public void viewCart() {
	   for(Product p: items) {
		   p.details();
	   }
	   System.out.println("Total Amount : "+this.totalAmount);
   }
}
