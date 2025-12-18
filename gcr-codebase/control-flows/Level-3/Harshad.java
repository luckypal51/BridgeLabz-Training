import java.util.*;
public class Harshad{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		int temp = number;
		int sum =0;
		while(temp!=0){
			sum += temp%10;
			temp/=10;
		}
		
		if(number%sum==0){
			System.out.println("The number is Harshad Number "+ number);
		}else{
			System.out.println("The number is not Harshad Number "+ number);
		}
	}
}