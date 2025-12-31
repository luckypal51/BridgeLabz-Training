package Questions;
import java.util.*;

public class Currency {
    public static void main(String[] args) {
    	System.out.println("----Welcome to Currency Exchange Kiosk----");
    	Scanner sc = new Scanner(System.in);
    	do {
    		System.out.println(" ");
    		System.out.println("Enter 'U' to convert into US Dollar :");
    		System.out.println("Enter 'D' to convert into UAE Dirham:");
    		System.out.println("Enter 'R' to convert into rouble    :");
    		System.out.println("Enter 'E' to exit                   :");
    		char ch = sc.next().charAt(0);
    		switch(ch) {
    		case 'u':
    			System.out.println("Enter INR Amount :");
    			float n = sc.nextFloat();
    			usa(n);
    			break;
    		case 'd':
    			System.out.println("Enter INR Amount :");
    			float k = sc.nextFloat();
    			dirham(k);
    			break;
    		case 'r':
    			System.out.println("Enter INR Amount :");
    			float p = sc.nextFloat();
    			rouble(p);
    			break;
    		case 'e':
    			System.out.println("Thank you come again !");
    			System.exit(0);
    		}
    	}while(true);
    }
    public static void usa(float n) {
    	System.out.println("$"+n*0.011);
    }
    public static void dirham(float n) {
    	System.out.println("AED"+n*0.041);
    }
    public static void rouble(float n) {
    	System.out.println("₽"+n*0.90);
    }
    
}
