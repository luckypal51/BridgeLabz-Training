import java.util.*;
public class Salary{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		float salary = sc.nextFloat();
		float yearsOfExperience = sc.nextFloat();
	

	if(yearsOfExperience>5){
		 float bonus = (salary/100)*5;
		 System.out.println("Bonus amount is : "+bonus);
	 }else{
		 System.out.println("Bonus amount is : 0");
	 }
	}
}