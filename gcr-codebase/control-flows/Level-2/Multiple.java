import java.util.*;
public class Multiple{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
	    if(n<0){
			System.out.println("not a Positive number");
			System.exit(0);
		}
		int i=100;
		
		while(i>0){
			if(i%n==0){
				System.out.println(i);
			}
			i++;
		}
	}
}