import java.util.*;
public class Factors{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int len =0;
		int temp =n;
	    for(int i =1;i<=n;i++){
			if(n%i==0){
				len++;
			}
		}
		int[] arr = new int[len];
		int idx =0;
		for(int i =1;i<=n;i++){
			if(n%i==0){
				arr[idx++]= i;
			}
		}
		int sumFac = sum(arr);
		int proFac = product(arr);
		int squFac = square(arr);
		
		System.out.println("The factors of number are "+Arrays.toString(arr));
		System.out.println("The sum of the factors "+sumFac);
		System.out.println("The Square sum of the factors  "+ squFac);
		System.out.println("The product of the factors "+proFac);
	}
	public static int sum(int [] arr){
		int sum =0;
		for(int a: arr){
			sum+=a;
		}
		return sum;
	}
	public static int square(int [] arr){
		int sum =0;
		for(int a: arr){
			sum+= (int) Math.pow(a,2);
		}
		return sum;
	}
	public static int product(int [] arr){
		int sum =1;
		for(int a: arr){
			sum*=a;
		}
		return sum;
	}
}