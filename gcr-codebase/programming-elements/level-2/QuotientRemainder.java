import java.util.*;
public class QuotientRemainder{
	public static void main(String[] args){
	Scanner sc =new Scanner(System.in);
 	float n1 = sc.nextFloat();
	float n2 = sc.nextFloat();

        float quotient = n1/n2;
        float remainder = n1%n2;
        System.out.println("The Quotient is "+quotient+" and Reminder is "+remainder+" of two number"+n1+" and "+n2);
}
} 