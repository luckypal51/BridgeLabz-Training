package Questions.SwiftCart;

public class Product {
	int productId;
	String productName;
	double productPrice;
	
	public Product(int productId, String productName, double productPrice) {
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	
	public void details() {
		System.out.println("\n---------"+this.productName+"----------");
		System.out.println("Product Id    : "+this.productId);
		System.out.println("Product Price : "+this.productPrice);
	}
}
