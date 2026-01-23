package Tree.ProductInventory;

public class Product {
     public int id;
     public String productName;
     public double price;
     public Product right;
     public Product left;
	 public Product(int id, String productName, double price) {
		super();
		this.id = id;
		this.productName = productName;
		this.price = price;
		this.right = null;
		this.left = null;
	 }
     
	 @Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\nProduct Id   : "+this.id+
			   "\nProduct Name : "+this.productName+
			   "\nPrice        : "+this.price;
	}
     
}
