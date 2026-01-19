package Question.FlashDealz;

public class Product {
      public int id;
      public String name;
      public double discount;
	  public Product(int id, String name, double discount) {
		
		this.id = id;
		this.name = name;
		this.discount = discount;
	  }
      @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return "\nProductId : "+this.id+" | Product Name : "+this.name+" | Product Discount : "+this.discount;
    }
      
}
