package Genric.OnlineMarketPlace;

public class Book extends Product{
   
	public Book(String name, double price) {
		super(name,price);
}

	@Override
	public void display() {
		System.out.println("\n-------Book Details-------");
		System.out.println("Book Name : "+this.name);
		System.out.println("Price     : "+this.value);
	}
	
	
}
