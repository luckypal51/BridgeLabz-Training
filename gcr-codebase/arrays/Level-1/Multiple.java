import java.util.*;
public class Multiple{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int [] arr = new int [10];
		for(int i =0;i<arr.length;i++){
			arr[i] = (i+1)*n;
		}
		int count =1;
		for(int a : arr){
			System.out.println(n+" X "+count+" = "+a);
			count++;
		}
	}
}