import java.util.*;
public class Quotient{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int first = sc.nextInt();
		int div = sc.nextInt();
		
		int [] arr = findRemainderAndQuotient(first,div);
		
		System.out.println("The quotient is "+arr[1]+" the remainder is "+arr[0]);
	}
	public static int[] findRemainderAndQuotient(int number, int divisor) {
		int [] ans = new int[2];
		ans[0] = number%divisor;
		ans[1] = number/divisor;
		
		return ans;
	}

}