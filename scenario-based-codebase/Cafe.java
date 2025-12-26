import java.util.*;
public class Cafe{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Cafe : ");
		while(true){
		System.out.println("Choose the drink : ");
		System.out.println("1. Press 'L' for coffee Latte       : ");
		System.out.println("2. Press 'C' for coffee Cappuccino  : ");
		System.out.println("3. Press 'M' for coffee Mocha       : ");
		System.out.println("4. Press 'E' for exit               : ");
		char ch = sc.next().charAt(0);
		if(ch=='E'){
		System.out.println("Thank you for visting ! ");	
			break;
		}
		System.out.println("Enter the quantity :");
		int n = sc.nextInt();
		double amount = pricing(ch);
		bill(amount,n);
		
		}
	}
	public static double pricing(char ch){
		ch = Character.toUpperCase(ch);
		if(ch=='L'){
			return 750.00;
		}
		if(ch=='C'){
			return 350.00;
		}
		if(ch=='M'){
			return 1150.00;
		}
		return 0;
	}
	public static void bill(double amount,int n){
		double gst = ((amount*n/100)*18);
		double total = (amount*n)+gst;
		
		System.out.println("The amount   : "+amount);
		System.out.println("The quantity : "+n);
		System.out.println("Total        : "+(amount*n));
		System.out.println("GST 18 %     : "+gst);
		System.out.println("Amount + GST : "+total);
	}
}