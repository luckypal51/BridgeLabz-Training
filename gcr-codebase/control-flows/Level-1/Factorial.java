import java.util.*;
public class Factorial{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	
	if(num>0){
	int dup = num;
	int fac =1;
	while(num!=0){
	   fac*=num;
       num--;	   
	}
	System.out.println("the factorial of "+dup+" is "+fac);
	}
	else{
    System.out.println("the number is not Positive ");		
	}
	
	}}