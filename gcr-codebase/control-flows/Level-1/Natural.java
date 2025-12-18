import java.util.*;

public class Natural{
	public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	
	if(num>0){
	int sum = (num*(num+1))/2;
	
	System.out.println("The sum of "+sum+" natural numbers is"+num);
	
	}else{
	
	System.out.println("The number "+num+" is not a natural number");

	}
	}}