import java.util.*;
public class DigitCount{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		int count =0;
		int temp = number;
		while(temp!=0){
			count++;
			temp/=10;
		}
		
		System.out.println("The number "+number+" has "+count+" digits");
	}
}