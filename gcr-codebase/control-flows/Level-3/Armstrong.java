import java.util.*;
public class Armstrong{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int len =0;
		int temp = n;
		while(temp!=0){
			len++;
			temp/=10;
		}
		int sum =0;
		temp=n;
		while(temp!=0){
			int rem = temp%10;
			sum +=Math.pow(rem,len);
			temp/=10;
		}
		if(n==sum){
			System.out.println("Number is an Armstrong number");
		}else{
			System.out.println("Number is not an Armstrong number");
		}
		
	}
}