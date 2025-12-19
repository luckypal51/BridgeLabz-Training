import java.util.*;
public class BMI2{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	double[][] personData = new double[n][3];
	String[] weightStatus = new String[n];
	
	for(int i =0;i<n;i++){
		for(int j=0;j<2;j++){
			personData [i][j] = sc.nextInt();
		}
	}
	for(int i =0;i<n;i++){
		personData[i][2]= (personData[i][0]/((personData[i][1]/100)*(personData[i][1]/100)));
	}
	for(int i =0;i<n;i++){
		double bmi = personData[i][2];
			if(bmi<=18.4){
				weightStatus[i]="Underweight ";
			}
			else if(bmi>=18.5&&bmi<=24.9){
			     weightStatus[i]="Normal ";
			}
			else if(bmi>=25.0&&bmi<=39.9){
				 weightStatus[i]="OverWeight ";
			}else{
				 weightStatus[i]="Obese ";
			}
	}
	System.out.println(Arrays.toString(weightStatus));
	}
}