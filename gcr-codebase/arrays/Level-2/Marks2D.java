import java.util.*;
public class Marks2D{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[][] marks = new double[n][3];
		double[] percentage = new double[n];
		String[] grade = new String[n];
		
		
		for(int i =0;i<n;i++){
			for(int j =0;j<3;j++){
				double m = sc.nextInt();
				if(m<0){
					System.out.println("Enter the valid marks");
					j--;
					continue;
				}
				marks[i][j] = m;
			}
		}
		for(int i =0;i<n;i++){
			percentage[i] = (marks[i][0]+marks[i][1]+marks[i][2])/3;
		}
		
		for(int i =0;i<n;i++){
			if(percentage[i]>=80){
				grade[i]= "A grade";
			}else if(percentage[i]>=70&&percentage[i]<=79){
				grade[i]= "B grade";
			}else if(percentage[i]>=60&&percentage[i]<=69){
				grade[i]= "C grade";
			}else if(percentage[i]>=50&&percentage[i]<=59){
				grade[i]= "D grade";
			}else if(percentage[i]>=40&&percentage[i]<=49){
				grade[i]= "E grade";
			}else{
				grade[i]= "R grade";
			}
		}
		for(int i =0;i<n;i++){
			System.out.println("The student has got "+percentage[i]+" and "+grade[i]+" The marks of physics is "+marks[i][0]+", chemistry is "+marks[i][1]+", maths is "+marks[i][2]);
		}
	}
} 