import java.util.*;
public class Chocolate{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int [] arr = findRemainderAndQuotient(n,m);
		
		System.out.println("each student get "+arr[1]+" the remaining is "+arr[0]);
	}
	public static int[] findRemainderAndQuotient(int number, int divisor) {
		int [] ans = new int[2];
		ans[0] = number%divisor;
		ans[1] = number/divisor;
		
		return ans;
	}

}