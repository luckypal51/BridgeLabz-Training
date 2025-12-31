package Questions;
import java.util.*;
public class BusRoute {
   static String[] place = {"Piplani","Pathani","Indrapuri","Anand nagar","MP nagar"};
   public static void main(String[]args) {
	   System.out.println("--Welcome to the Bus--");
	   Random r = new Random();
	   int rounds = 0;
	   Scanner sc = new Scanner(System.in);
	   do {
		 int idx = r.nextInt(4);
		 System.out.println("We have arivied at "+place[idx]);
		 rounds++;
		 System.out.println(" ");
		 System.out.println("Do you want to leave ?");
		 System.out.println("1.Yes");
		 System.out.println("2.No");
		 int n = sc.nextInt();
		 if(n==2) {
			
			 
		 }else if(n==1){
			 generateBill(rounds);
			 System.out.println("Thank you for travelling ");
			 break;
		 }
	   }while(true);
   }
   public static void generateBill(int n) {
	   System.out.println("You have travelled "+n+"KM");
	   System.out.println("Total amount is : "+(n*4));
   }
}
