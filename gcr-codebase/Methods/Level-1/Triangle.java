import java.util.*;
public class Triangle{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		float first = sc.nextFloat();
		float second = sc.nextFloat();
		float third = sc.nextFloat();
		
		float rounds = needToRun(first,second,third);
		
		System.out.println("The athelet need to run around triangle "+rounds+" times");
		
	}
	public static float needToRun(float f, float s , float t){
		return 5000/(f+s+t);
	}
}