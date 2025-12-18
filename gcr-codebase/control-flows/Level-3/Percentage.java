import java.util.*;
public class Percentage{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int physics = sc.nextInt();
		int chemistry = sc.nextInt();
		int maths = sc.nextInt();
		
		int average = (physics+chemistry+maths)/3;
		if(average>=80){
			System.out.println("Level 4, above agency-normalized standars");
			System.out.println("The average marks is : "+average);
		}else if(average>=70&&average<=79){
			System.out.println("Level 3, at agency-normalized standars");
			System.out.println("The average marks is : "+average);
		}else if(average>=60&&average<=69){
			System.out.println("Level 2, below , but approaching agency-normalized standars");
			System.out.println("The average marks is : "+average);
		}else if(average>=50&&average<=59){
			System.out.println("Level 1,well below agency-normalized standars");
			System.out.println("The average marks is : "+average);
		}else if(average>=40&&average<=49){
			System.out.println("Level 1-,too below agency-normalized standars");
			System.out.println("The average marks is : "+average);
		}else{
			System.out.println("Remedial standars");
			System.out.println("The average marks is : "+average);
		}
	}
}