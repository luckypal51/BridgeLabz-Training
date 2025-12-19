import java.util.*;
public class Largest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		
		int len =10;
		
		long temp =n;
		long [] digit = new long[10];
		while(len>0){
			digit[len-1] = temp%10;
			temp/=10;
			len--;
		}
		long max = 0;
		long sec =0;
		for(int i =0;i<digit.length;i++){
			if(digit[i]>max){
				sec = max;
				max = digit[i];
			}
			else if(digit[i]>sec&&digit[i]!=max){
				sec = digit[i];
			}
		}
		System.out.println("The Largest digit is :"+max);
		System.out.println("The second Largest digit is :"+sec );
		
	}
}