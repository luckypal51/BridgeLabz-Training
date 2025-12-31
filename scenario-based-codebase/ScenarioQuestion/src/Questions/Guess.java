package Questions;
import java.util.*;
public class Guess{
	public static int attempt =5;
	
	public int computerGenerate(){
		Random r = new Random();
		return r.nextInt(99);
	}
	public static boolean computerWin(int c, int u){
		if(c==u){
			return true;
		}
		System.out.println("The computer guess is "+c);
		return false;
	}
	public static int nextGuess(int per, char ch){
		Random r = new Random();
		int n = r.nextInt(99);
		if(ch=='h'||ch=='H'){
			if(n>per){
				return n;
			}else{
				int rem = per - n;
				if(n+rem+10<100){
					return n+rem+10;
				}else{
					return n+rem;
				}
			}
		}else if (ch=='l'&&ch=='L'){
			if(n<per){
				return n;
			}else{
				int rem = n-per;
				if((n-rem-5)>0){
					return n-rem-10;
				}else{
					return n-rem;
				}
			}
		}
		return n;
	}
	public static void main(String[] args){
		int perv = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number between 1 to 100:");
		int n = sc.nextInt();
		if(n>100||n<1){
			System.out.println("Please enter valid number");
			System.exit(0);
		}
		do{      
		        System.out.println("--------------------------------------------------------");
         		System.out.println("Please provide hint guessed number by computer is "+perv);
				System.out.println("Enter h for higher ");
				System.out.println("Enter l for lower ");
				System.out.println("--------------------------------------------------------");
				char ch = sc.next().charAt(0);
				int c = nextGuess(perv,ch);
		        perv = c;
			if(computerWin(c,n)){
				System.out.println("Computer wins the number is "+c);
				break;
			}
			attempt--;
		}while(attempt>0);
	}
}