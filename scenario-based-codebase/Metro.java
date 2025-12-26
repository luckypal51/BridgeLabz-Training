import java.util.*;
public class Metro{
	String name;
	double balance;
	
	Metro(String name, double balance){
		this.name = name;
		this.balance = balance;
	}
	
	public void travel(float distance){
	     double amount = (distance*7);
		 if(this.balance>=amount){
			 this.balance-=amount;
			 System.out.println("The amount "+amount+" has been deducted for travelling "+distance+" KM");
		 }else{
			 System.out.println("Unsufficient balance");
		 }
	}
	public double cardBalance(){
		return this.balance;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name      :");
		String name = sc.nextLine();
		System.out.println("Enter the amount     :");
		double amount = sc.nextDouble();
		Metro m = new Metro(name,amount);
		
		while(true){
		System.out.println("Enter 'E' for exit   :");
		System.out.println("Enter 'T' for travel :");
		System.out.println("Enter 'V' for balance:");
		char c = sc.next().charAt(0);
		if(c=='e'||c=='E'){
			break;
		}else if(c=='v'||c=='V'){
		 System.out.println("Card balance is "+	m.cardBalance());
		}else{
		    System.out.println("Enter the distance   :");
		    float d = sc.nextFloat();
		    m.travel(d);}
		}
	}
}