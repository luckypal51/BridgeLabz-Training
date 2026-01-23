package Tree.ProductInventory;

public class Main {
	public static void main(String[] args) {
		Inventory ven = new Inventory();
		ven.insert(new Product(65101,"iPhone",1000000));
		ven.insert(new Product(65102,"Dal",150));
		ven.insert(new Product(54103,"Phone",1000000));
		ven.insert(new Product(54104,"xxxxx",150));
		ven.insert(new Product(45105,"qwisis",45000));
		ven.insert(new Product(21026,"ewids",45000));
		ven.insert(new Product(10445,"dfi",1000000));
		ven.insert(new Product(1031,"gffidi",150));
		ven.insert(new Product(1017,"ieid",45000));
		ven.delete(54103);
		ven.view();
	}
}
