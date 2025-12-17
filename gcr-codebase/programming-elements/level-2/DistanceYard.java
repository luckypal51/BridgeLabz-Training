import java.util.*;
public class DistanceYard{
       public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
        float foot = sc.nextFloat();
        float yard = foot/3;
	float miles = yard/1760;
        System.out.println("Your distance in foot is "+foot+" while in yard is "+yard+" and miles is "+miles);
}
}
