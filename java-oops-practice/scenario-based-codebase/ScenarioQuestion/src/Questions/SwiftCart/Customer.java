package Questions.SwiftCart;

public class Customer {
       String name;
       String phoneNo;
       Cart cart;
	   public Customer(String name, String phoneNo) {
		this.name = name;
		this.phoneNo = phoneNo;
		cart = new Cart();
	   }
       public void addItem(int productId) {
    	   cart.addToCart(productId);
       }
       public void viewCart() {
    	   cart.viewCart();
       }
}
