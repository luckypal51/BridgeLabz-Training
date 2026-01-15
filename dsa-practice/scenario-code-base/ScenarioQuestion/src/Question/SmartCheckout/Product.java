package Question.SmartCheckout;

public class Product {
    public String product;
    public double amount;
    public int quantity;
    
    public Product(String product,int quantity, double amount) {
    	this.product = product;
    	this.quantity = quantity;
    	this.amount = amount;
    }
}
