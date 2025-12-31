package Questions;
import java.util.*;
public class Temperature{
	static float[] temp = new float[7];
	
	public static void input(Scanner sc){
		for(int i =0;i<temp.length;i++){
			System.out.println("Enter the temperature of "+(i+1));
			temp[i] = sc.nextFloat();
		}
	}
	public static float max(float[] arr){
		float max = Float.MIN_VALUE;
		for(float a: arr){
			max = Math.max(a,max);
		}
		return max;
	}
	public static double average(float[] arr){
		double sum =0;
		for(float a: arr){
			sum+=a;
		}
		return sum/arr.length;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Temperature Calculator Of Last 7 Days !");
		input(sc);
		System.out.println("The max temperature in last 7 days is "+max(temp));
		System.out.println("The average temperature in last 7 days is "+average(temp));
	}
}