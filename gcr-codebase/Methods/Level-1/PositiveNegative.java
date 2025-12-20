import java.util.*;
public class PositiveNegative{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		int status = check(number);
	    if(status==-1){
			System.out.println("The number is negative");
		}else if(status==1){
			System.out.println("The number is positive");
		}else{
			System.out.println("The number is zero");
		}
	}
	public static int check(int n){
		if(n==0){
			return 0;
		}
		if(n<0){
			return -1;
		}
		return 1;
	}
}