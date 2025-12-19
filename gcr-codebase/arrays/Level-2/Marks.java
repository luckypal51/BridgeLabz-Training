import java.util.*;
public class Marks{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[] physics = new double[n];
		double[] chemistry = new double[n];
		double[] maths = new double[n];
	    double[] percentage = new double[n];
		String[] grade = new String[n];
		
		for(int i =0;i<n;i++){
	       double p = sc.nextDouble();
			if(p<0){
				System.out.println("Eneter the valid marks");
				i--;
				continue;
			}
			physics[i]= p;
		}
		for(int i =0;i<n;i++){
	       double p = sc.nextDouble();
			if(p<0){
				System.out.println("Eneter the valid marks");
				i--;
				continue;
			}
			chemistry[i]= p;
		}
		for(int i =0;i<n;i++){
	       double p = sc.nextDouble();
			if(p<0){
				System.out.println("Eneter the valid marks");
				i--;
				continue;
			}
			physics[i]= p;
		}
		for(int i =0;i<n;i++){
	       double p = sc.nextDouble();
			if(p<0){
				System.out.println("Eneter the valid marks");
				i--;
			}
			maths[i]= p;
		}
		
		for(int i =0;i<n;i++){
			percentage[i]= ((physics[i]+chemistry[i]+maths[i])/3);
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
			System.out.println("The student has got "+percentage[i]+" and "+grade[i]+" The marks of physics is "+physics[i]+", chemistry is "+chemistry[i]+", maths is "+maths[i]);
		}
	}
}