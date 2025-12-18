import java.util.*;
public class Factorial2{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	
	if(num>0){
	int dup = num;
	int fac =1;
	for(int i = num ;i>=1;i--){
	   fac*=i;   
	}
	System.out.println("the factorial of "+dup+" is "+fac);
	}
	else{
    System.out.println("the number is not natural ");		
	}
	
	}}