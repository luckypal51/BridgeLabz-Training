import java.util.*;
public class Height{
	public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float cm = input.nextFloat();
        double inches = cm/2.54;
        double foot = inches/12;
        System.out.println("Your Height in cm is "+cm+" while in feet is "+foot+" and inches is "+inches);
}
}