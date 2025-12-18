import java.util.*;

public class SumNum{
	public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	
	
	int formula = (num*(num+1))/2;
	
	int sum =0;
    if(num>0){
		
	
    while(num!=0){
	
	    sum+=num;
	    num--;
	}
	
	System.out.println("the computation from formula"+ formula);
	System.out.println("the computation from formula"+ sum);
	 
	 } 
	 
	else{
		
	System.out.println("It is not a natural number")
		
	}
	
	}
	}