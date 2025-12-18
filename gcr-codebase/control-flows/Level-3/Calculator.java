import java.util.*;
public class Calculator{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double first =sc.nextFloat();
		double second = sc.nextFloat();
		String op = sc.next();
		
		switch(op){
			case "+":
				System.out.println(first+second);
				break;
			case "-":
				System.out.println(first-second);
				break;
			case "*":
				System.out.println(first*second);
				break;
			case "/":
				System.out.println(first/second);
				break;
			default:
				System.out.println("Invalid Operator");
				break;
		}
	}
}