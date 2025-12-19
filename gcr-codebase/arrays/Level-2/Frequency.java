import java.util.*;
public class Frequency{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int [] arr = new int[10];
		int temp = n;
		while(temp!=0){
			arr[temp%10]+=1;
			temp/=10;
		}
		
		for(int i =0;i<arr.length;i++){
			if(arr[i]!=0){
				System.out.println("The frequency of "+i+" is :"+arr[i]);
			}
		}
	}
}