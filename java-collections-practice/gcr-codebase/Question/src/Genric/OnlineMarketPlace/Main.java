package Genric.OnlineMarketPlace;

public class Main {
	public static void main(String[] args) {
		Catalog<Product> cat = new Catalog();
		Book book = new Book("Reality of Life",1000);
		Clothing cloth = new Clothing("Trousers",750);
		cat.addProduct(book);
		cat.addProduct(cloth);
		cat.displayCatalog();
		cat.discount(cloth, 15);
		cat.discount(book, 75);
		cat.displayCatalog();
	}
}
