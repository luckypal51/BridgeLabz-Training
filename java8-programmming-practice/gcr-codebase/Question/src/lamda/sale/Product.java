package lamda.sale;

public class Product {
     public int id;
     public double price;
     public double discount;
	 
     public Product(int id, double price, double discount) {	
		this.id = id;
		this.price = price;
		this.discount = discount;
	 }

	 @Override
	 public String toString() {
		return "Product [id=" + id + ", price=" + price + ", discount=" + discount + "]";
	 }
     
     
}
