import java.util.*;
public class DoubleOpt{
 	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
 	double a = sc.nextDouble();
        double b = sc.nextDouble();
	double c = sc.nextDouble();;
        double sol1 =  a + b *c;
        double sol2 =  a * b + c;
        double sol3 =  c + a / b;
        double sol4 =  a % b + c;
       System.out.println("The results of Int Operations are "+sol1+", "+sol2+", "+sol3 +", and "+sol4);
}
}
