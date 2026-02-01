package functionalinterface.cloneable;

public class Main {
	  public static void main(String[] args) {

	        try {
	            Product original = new Product(101, "Laptop");

	            Product copy = (Product) original.clone();

	            System.out.println(original.id + " " + original.name);
	            System.out.println(copy.id + " " + copy.name);

	            System.out.println(original == copy); 

	        } catch (CloneNotSupportedException e) {
	            e.printStackTrace();
	        }
	    }
}
