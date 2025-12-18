import java.util.*;
public class MaxFactor2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
	    if(n<0){
			System.out.println("not a valid number");
			System.exit(0);
		}
		int i=n-1;
		int max =0;
		while(i!=0){
			if(n%i==0){
				max = Math.max(max,i);
			}
			i--;
		}
		System.out.println(max);
	}
}