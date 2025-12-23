import java.util.*;
public class Calculator{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int first = sc.nextInt();
		int second = sc.nextInt();
		char op = sc.next().charAt(0);
		
		System.out.println("The answer is "+cal(first,second,op));
	}
	public static double cal(int f, int s,char op){
		switch(op){
			case '+':
			    return f+s;
			case '-':
			   return f-s;
			case '*':
			    return f*s;
			case '/':
			    return f/s;
			default:
			   return 0;
		}
	}
}