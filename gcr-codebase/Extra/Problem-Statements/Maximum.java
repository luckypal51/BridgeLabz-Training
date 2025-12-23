import java.util.*;
public class Maximum{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		input(sc);
	}
	public static void input(Scanner sc){
		int first = sc.nextInt();
		int second = sc.nextInt();
		int third = sc.nextInt();
		
		max(first,second,third);
	}
	public static void max(int f,int s, int t){
		if(f>s&&f>t){
			System.out.println("Maximum number is "+f);
			return;
		}
		if(s>f&&s>t){
			System.out.println("Maximum number is "+s);
			return;
		}
			System.out.println("Maximum number is "+t);
			return;
	}
}