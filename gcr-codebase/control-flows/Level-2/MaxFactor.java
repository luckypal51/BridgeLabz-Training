import java.util.*;
public class MaxFactor{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
	    if(n<0){
			System.out.println("not a valid number");
			System.exit(0);
		}
		int max = 1;
		for(int i = 1;i<n;i++){
			if(n%i==0){
			    max = Math.max(max,i);
			}
		}
		System.out.println(max);
	}
}