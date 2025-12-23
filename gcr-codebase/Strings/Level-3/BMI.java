import java.util.*;
public class BMI{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[][] arr = new double[n][2];
		for(int i =0;i<n;i++){
			System.out.println("Enter the weight :");
			arr[i][0]= sc.nextInt();
			System.out.println("Enter the height :");
			arr[i][1]= sc.nextInt();
		}
		double[][] temp = bmiCalculation(arr);
		String[][] bmi = bmiStatus(temp);
		System.out.println(" Weight | Height | BMI | Status");
		for(String[]a: bmi){
			System.out.println(Arrays.toString(a));
		}
	}
	public static double[][] bmiCalculation(double [][] arr){
		double [][] bmical = new double[arr.length][3];
		for(int i =0;i<arr.length;i++){
			bmical[i][0]=arr[i][0];
            bmical[i][1]=arr[i][1];			
		}
		for(int i =0;i<arr.length;i++){
			arr[i][1]/=100;
			bmical[i][2]= arr[i][0]/(arr[i][1]*arr[i][1]);
		}
		return bmical;
	}
	public static String[][] bmiStatus(double[][]arr){
		String[][] bmi = new String[arr.length][4];
		for(int i =0;i<arr.length;i++){
			bmi[i][0]= Double.toString(arr[i][0]);
			bmi[i][1]= Double.toString(arr[i][1]);
			bmi[i][2]= Double.toString(arr[i][2]);
			bmi[i][3]= whatIs(arr[i][2]);
		}
		return bmi;
	}
	public static String whatIs(double n){
		if(n<=18.4){
			return "UnderWeight";
		}
		if(n>=18.5&&n<=24.9){
			return "Normal";
		}
		if(n>=25.0&&n<=39.9){
			return "Overweight";
		}
		return "Obese";
	}
}