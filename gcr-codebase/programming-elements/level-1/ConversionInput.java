import java.util.*;
public class ConversionInput{
 	public static void main(String[]args){
	Scanner input = new Scanner(System.in);
 	int km = input.nextInt();
	double miles = km*1.6; // to convert km into miles
        System.out.println("The total miles is "+miles+"mile for the given "+km+"km");
}
}