import java.util.*;
public class BMI{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double []weight = new double[n];
		double []height = new double[n];
		double []bmi = new double[n];
		
		for(int i =0;i<n;i++){
			weight[i]= sc.nextInt();
		}
		for(int i =0;i<n;i++){
			double h = sc.nextInt();
			h/=100;
			height[i] = h;
		}
		
		for(int i =0;i<n;i++){
			bmi[i]= (weight[i])/(height[i]*height[i]);
		}
		
		for(int i =0;i<bmi.length;i++){
			if(bmi[i]<=18.4){
				System.out.println("Underweight bmi is "+bmi[i]);
			}
			else if(bmi[i]>=18.5&&bmi[i]<=24.9){
				System.out.println("Normal bmi is "+bmi[i]);
			}
			else if(bmi[i]>=25.0&&bmi[i]<=39.9){
				System.out.println("OverWeight bmi is "+bmi[i]);
			}else{
				System.out.println("Obese bmi is "+bmi[i]);
			}
		}
	}
}