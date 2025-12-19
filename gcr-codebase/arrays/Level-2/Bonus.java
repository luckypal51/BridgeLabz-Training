import java.util.*;
public class Bonus{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double[] salary = new double[10];
		double[] year = new double[10];
		double[] bonus = new double[10];
		double[] newSalary = new double[10];
		
		
		for(int i =0;i<10;i++){
			salary[i] = sc.nextInt();
			year[i] = sc.nextInt();
		}
		
		for(int i =0;i<salary.length;i++){
			if(year[i]>5){
			 bonus[i] = (salary[i]/100)*5;
			}else{
			 bonus[i] = (salary[i]/100)*2;
			}
			newSalary[i] = salary[i]+bonus[i];
		}
		double sumbonus =0;
		for(double a:bonus){
			sumbonus+=a;
		}
		for(int i =0;i<10;i++){
			System.out.println("The old salary is "+salary[i]+" and the new salary is "+newSalary[i]);
		}
		System.out.println("the total amount paid in bonus "+sumbonus);
	}
}