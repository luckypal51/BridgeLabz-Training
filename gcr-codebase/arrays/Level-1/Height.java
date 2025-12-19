import java.util.*;
public class Height{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		double[] arr = new double[11];
		for(int i=0;i<11;i++){
			arr[i]= sc.nextDouble();
		}
		
		double sum =0;
		for(double a: arr){
			sum+=a;
		}
		
		sum = sum/arr.length;
		
		System.out.println("The mean height is football team is : "+sum);
		}
}