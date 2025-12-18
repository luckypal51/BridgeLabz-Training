import java.util.*;

public class Largest{
	public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	
	float a = sc.nextFloat();
	float b = sc.nextFloat();
	float c = sc.nextFloat();
	

	if(a>b&&a>c){
	 
	System.out.println("Is the first number the largest? Yes");
    System.out.println("Is the Second number the largest? NO");
    System.out.println("Is the Third number the largest? No");
	
	}else if(b>a&&b>c){
	
	System.out.println("Is the first number the largest? No");
    System.out.println("Is the Second number the largest? Yes");
    System.out.println("Is the Third number the largest? No");
	  
	}else{
	
	System.out.println("Is the first number the largest? No");
    System.out.println("Is the Second number the largest? NO");
    System.out.println("Is the Third number the largest? Yes");
	
	
	}
	}}