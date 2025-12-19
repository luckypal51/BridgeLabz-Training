import java.util.*;
public class Number{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Five Numbers: ");
		
		int [] arr = new int[5];
		for(int i =0;i<5;i++){
			arr[i]= sc.nextInt();
		}
		
		for(int i =0;i<arr.length;i++){
			if(arr[i]>0){
				if(arr[i]%2==0){
					System.out.println("The number is positive and even "+arr[i]);
				}else{
					System.out.println("The number is positive and Odd "+arr[i]);
				}
			}else if(arr[i]==0){
				System.out.println("The number is Zero ");
			}else{
				System.out.println("The number is negative "+arr[i]);
			}
		}
		if(arr[0]==arr[arr.length-1]){
			System.out.println(arr[0]+" and "+arr[arr.length]+" are equal");
		}else if (arr[0]>arr[arr.length-1]){
			System.out.println("The first number is greater then last number");
		}else{
			System.out.println("The first number is Smaller then last number");
		}
	}
}