package Questions;
import java.util.*;
public class LuckyDraw {
      static String[] gift = {"IPhone 17Pro Max","LCD TV","Candy","Flight Ticket to Banglore"};
      
      public static void main(String[]args) {
    	  System.out.println("---Welcome To Lucky Draw---");
    	  Scanner sc = new Scanner(System.in);
    	  do {
    		  System.out.println(" ");
    		  System.out.println("Enter 'R' to View Rule   :");
    		  System.out.println("Enter 'S' to draw number :");
    		  System.out.println("Enter 'E' to exit        :");
    		  char ch = sc.next().charAt(0);
    		  ch = Character.toLowerCase(ch);
    		  if(ch=='r') {
    			  rule();
    		  }else if(ch=='s') {
    			  draw();
    		  }else if(ch=='e') {
    			  System.out.println("Hope you enjoyed!");
    			  break;
    		  }
    	  }while(true);
      }
      public static void rule() {
    	  System.out.println("-------------------------Rule--------------------------");
    	  System.out.println("1. Press 'S' to draw a number                         :");
    	  System.out.println("2. If the number is divisible by 3 and 5 both you win :");
    	  System.out.println("3. The gift is surprice                               :");
    	  System.out.println("-------------------------------------------------------");
      }
      public static void draw() {
    	  Random r = new Random();
    	  int n = r.nextInt(99);
    	  if(n%3==0&&n%5==0) {
    		  int p = r.nextInt(3);
    		  System.out.println("You win! \nYour gift is "+gift[p]);
    		  System.out.println("Your number is "+n);
    	  }else {
    		  System.out.println("Better luck next time !");
    		  System.out.println("Your number is "+n);
    	  }
      }
}
