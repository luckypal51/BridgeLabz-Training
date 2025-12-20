import java.util.*;
public class Natural{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int sum = naturalSum(n);
		
		System.out.println("The sum of natural numbers is "+ sum);
	}
	public static int naturalSum(int n){
		int sum =0;
		for(int i =0;i<=n;i++){
			sum+=i;
		}
		return sum;
	}
}