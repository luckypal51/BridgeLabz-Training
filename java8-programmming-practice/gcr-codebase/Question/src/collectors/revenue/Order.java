package collectors.revenue;

public class Order {
      public String customerName;
      public String productName;
      public double price;
      
	  public Order(String customerName, String productName, double price) {
		this.customerName = customerName;
		this.productName = productName;
		this.price = price;
	  }

	  @Override
	  public String toString() {
		return "Order [customerName=" + customerName + ", productName=" + productName + ", price=" + price + "]";
	  }
      
      
}
