package Questions.SwiftCart;

import java.util.Scanner;

public class Shop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("--------Welcome to SwitCart--------");
		System.out.println("\nEnter Your Name : ");
		String name = sc.nextLine();
		System.out.println("Enter Your Email  : ");
		String email = sc.nextLine();
		Customer customer = new Customer(name,email);
		GroceryStore store = new GroceryStore();
		store.addProduct(new Product(101,"SmartPhone",45000));
		store.addProduct(new Product(102,"TV",15000));
		store.addProduct(new Product(103,"Smartwatch",5000));
		do {System.out.println("_________________________________");
			System.out.println("\nEnter '1' to View Products       |");
			System.out.println("Enter '2' to Add Product         |");
			System.out.println("Enter '3' to View Cart Details   |");
			System.out.println("Enter '4' to Exit                |");
			System.out.println("----------------------------------");
			int n = sc.nextInt();
			if(n==1) {
				store.viewProduct();
			}else if(n==2) {
			   System.out.println("Enter Product Id :");
			   int id = sc.nextInt();
			   customer.addItem(id);
			}else if(n==3) {
				customer.viewCart();
			}else {
				System.out.println("Thank you come again !");
				break;
			}
		}while(true);
	}
}
