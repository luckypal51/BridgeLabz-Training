package Question.BookSelf;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("----Welcome To Lucky Book Store-----");
		Scanner sc = new Scanner(System.in);
		Library lib = new Library(); 
		do {
			System.out.println("Enter '1' to view Book");
			System.out.println("Enter '2' to return book");
			System.out.println("Enter '3' to borrow book");
			System.out.println("Enter '4' to Exit ");
			int n = sc.nextInt();
			sc.nextLine();
			if(n==1) {
				lib.viewBook();
			}else if(n==2){
				System.out.println("Enter the type of Genre :");
				String genre = sc.nextLine();
                System.out.println("Enter the name of book  :");
                String name = sc.nextLine();
                System.out.println("Enter the author name   :");
                String author = sc.nextLine();
                System.out.println("Enter the price         :");
                double price = sc.nextDouble();
                lib.addBook(genre, name, author, price);
			}else if(n==3) {
				System.out.println("Enter the type of Genre :");
				String genre = sc.nextLine();
				System.out.println("Enter the name of book  :");
				String name = sc.nextLine();
				lib.borrow(genre, name);
			}else if(n==4) {
				System.out.println("Thanks for visiting ");
				break;
			}
		}while(true);
	}
}
