import java.util.*;
public class Factors{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int [] arr = factors(n);
		System.out.println(Arrays.toString(arr));
		System.out.println("The greatest factors is "+ greatest(arr));
		System.out.println("The sum of the factors is "+sum(arr));
		System.out.println("The product of the factors is "+product(arr));
		System.out.println("The product of cube of factor is "+squareProduct(arr));
				
	}
	public static int[] factors(int n){
		int len =0;
		for(int i =1;i<n;i++){
			if(n%i==0){
				len++;
			}
		}
		int[] arr = new int[len];
		int count =0;
			for(int i =1;i<n;i++){
			if(n%i==0){
				arr[count++]= i;
			}
		}
		return arr;
	}
	public static int greatest(int[] arr){
		int max = 1;
		for(int i =0;i<arr.length;i++){
			max = Math.max(max,arr[i]);
		}
		return max;
	}
	public static int sum(int[] arr){
		int ans =0;
		for(int i: arr){
			ans+=i;
		}
		return ans;
	}
	public static int product(int [] arr){
		int sum =1;
		for(int i : arr){
			sum*=i;
		}
		return sum;
	}
	public static long squareProduct(int[] arr){
		long ans =1;
		for(int a: arr){
			ans*=Math.pow(a,3);
		}
		return ans;
	}
}