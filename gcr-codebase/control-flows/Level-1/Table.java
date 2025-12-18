import java.util.*;
public class Table{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number between 6 to 9 :");
		int n = sc.nextInt();
		
		if(n>=6&&n<=9){
			for(int i =1;i<=10;i++){
				int mul = n*i;
				System.out.println(n+" x "+i+" = "+mul);
			}
		}else{
			System.out.println("Enter the vaild number");
		}
		
	}
}