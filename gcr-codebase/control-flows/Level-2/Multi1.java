import java.util.*;
public class Multi1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
	    if(number<0&&number<100){
			System.out.println("not a valid number");
			System.exit(0);
		}
		int counter=number-1;
		while(counter!=1){
			if(number%counter==0){
				System.out.println(counter);
			}
			
		counter--;
		}
	}
}