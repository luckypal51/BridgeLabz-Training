import java.util.*;
public class Table{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number from 6 to 9 ");
		
		int n = sc.nextInt();
		if(n<6||n>9){
			System.out.println("Entered number is not valid");
			System.exit(0);
		}
		int [] arr = new int[10];
		
		for( int i =0;i<arr.length;i++){
			arr[i] = (i+1)*n;
		}
		
		int count =1;
		for(int a : arr){
			System.out.println(n+" x "+count+" = "+a);
		}
	}
}