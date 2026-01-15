package Question.SmartCheckout;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	System.out.println("------Welcome To Lucky General Store------");
    	Scanner sc = new Scanner(System.in);
    	Node node = null;
    	Queue que = new Queue();
    	do {
    		System.out.println("\nEnter '1' to Create Customer");
    		System.out.println("Enter '2' to Add product");
    		System.out.println("Enter '3' to Add in Bill Queue");
    		System.out.println("Enter '4' to Checkout Customer");
    		System.out.println("Enter '5' to Close Store");
    		int n = sc.nextInt();
    		sc.nextLine();
    		if(n==1) {
    			System.out.println("\nEnter Customer Name : ");
    			String name = sc.nextLine();
    			node = new Node(name);
    		}else if(n==2) {
    			if(node==null) {
    				System.out.println("\nCreate Customer First !!");
 
    			}else {
    				System.out.println("\nEnter Product name : ");
    				String name = sc.nextLine();
    				System.out.println("Enter Quantity     : ");
    				int quan = sc.nextInt();
    				System.out.println("Enter Price        : ");
    				double amount = sc.nextDouble();
    				node.addProduct(name, quan, amount);
    			}
    		}else if(n==3) {
    			if(node==null) {
    				System.out.println("\nCreate Customer First !!");
 
    			}else {
    				que.addCustomer(node);
    				node = null;
    			}
    		}else if(n==4) {
    			que.checkoutCustomer();
    		}else if(n==5){
    			break;
    		}
    	}while(true);
    }
}
