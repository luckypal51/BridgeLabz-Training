import java.util.*;
public class Power2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int power = sc.nextInt();
		
		if(num<0){
			System.out.println("The number is not Positive");
			System.exit(0);
		}
		int ans =1;
		int counter =1;
		while(counter<=power){
			ans*=num;
			counter++;
		}
		System.out.println("answer is : "+ans);
	}
}