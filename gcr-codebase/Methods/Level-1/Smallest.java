import java.util.*;
public class Smallest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int first = sc.nextInt();
		int second = sc.nextInt();
		int third  = sc.nextInt();
		
		findSmallestAndLargest(first,second,third);
	}
	public static void findSmallestAndLargest(int f , int s , int t){
		if(f>s&&f>t){
			System.out.println("The largest number is "+f);
		}else if(s>f&&s>t){
			System.out.println("The largest number is "+s);
		}else{
			System.out.println("The largest number is "+t);
		}
		
		if(f<s&&f<t){
			System.out.println("The Smallest number is "+f);
		}else if(s<f&&s<t){
			System.out.println("The Smallest number is "+s);
		}else{
			System.out.println("The Smallest number is "+t);
		}
		
		
	}
}