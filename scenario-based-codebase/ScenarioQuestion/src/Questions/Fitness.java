package Questions;
import java.util.*;
public class Fitness{
	static int[] push = new int[6];
	
	public static void input(Scanner sc){
		for(int i =0;i<push.length;i++){
			System.out.println("Enter the Push-up for "+(i+1)+"  Day:");
			push[i] = sc.nextInt();
		}
	}
	public static int sum(int[] arr){
		int sum=0;
		for(int a: arr){
			sum+= a;
		}
		return sum;
	}
	public static int average(int[] arr){
		int sum =0;
		for(int a: arr){
			sum+=a;
		}
		return sum/arr.length;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Push-Up Calculator Of Last 6 Days !");
		input(sc);
		System.out.println("The sum of the push-up in last 6 days is "+sum(push));
		System.out.println("The average of push-up in last 6 days is "+average(push));
	}
}