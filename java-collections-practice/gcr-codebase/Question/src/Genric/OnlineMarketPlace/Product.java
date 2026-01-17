package Genric.OnlineMarketPlace;

public abstract class Product {
   public String name;
   public double value;
   
   public Product(String name , double value) {
	   this.name = name;
	   this.value = value;
   }
   public abstract void  display();
}
