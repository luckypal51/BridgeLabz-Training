import java.util.*;
public class IntOperation{
 	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
 	int a = sc.nextInt();
        int b = sc.nextInt();
	int c = sc.nextInt();
        int sol1 =  a + b *c;
        int sol2 =  a * b + c;
        int sol3 =  c + a / b;
        int sol4 =  a % b + c;
       System.out.println("The results of Int Operations are "+sol1+", "+sol2+", "+sol3 +", and "+sol4);
}
}
