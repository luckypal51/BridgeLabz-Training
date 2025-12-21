import java.util.*;
public class NumberCheck{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int size =count(n);
		int [] arr = store(n,size);
		largestAndSecond(arr);
		smallestAndSecond(arr);
		
		System.out.println(Arrays.toString(arr));
		System.out.println("The number is digit is "+size);
		if(checkDuck(n)){
			System.out.println("The number is duck number ");
		}else{
				System.out.println("The number is not duck number ");
		}
			if(armstrong(n,size)){
			System.out.println("The number is Armstrong number ");
		}else{
				System.out.println("The number is not Armstrong number ");
		}
		
	}
	public static int count(int a){
		int len =0;
		while(a!=0){
			len++;
			a/=10;
		}
		return len;
	}
	public static int[] store(int a, int size){
		int [] arr = new int [size];
		while(a!=0){
			arr[size-1]=a%10;
			a/=10;
			size--;
		}
		return arr;
	}
	 public static boolean checkDuck(int a){
		 while(a!=0){
			 int n = a%10;
			 if(n==0){
				 return false;
			 }
			 a/=10;
		 }
		 return true;
	 }
	 
	 public static boolean armstrong(int a, int size){
		 int temp =a;
		 int sum =0;
		 while(temp!=0){
			 sum +=Math.pow((temp%10),size);
			 temp/=10;
		 }
		 return sum==a?true:false;
	 }
	 public static void largestAndSecond(int[] arr){
		 int [] ans = new int[2];
		 Arrays.fill(ans,Integer.MIN_VALUE);
		 for(int a: arr){
			 if(a>ans[0]){
				 ans[1] = ans[0];
				 ans[0] = a;
			 }else if(a>ans[1]&&a!=ans[0]){
				 ans[1] = a;
			 }
		 }
		 System.out.println("The largest digit is "+ans[0]);
		 System.out.println("The second largest digit is "+ans[1]);
	 }
	 public static void smallestAndSecond(int[] arr){
		  int [] ans = new int[2];
		 Arrays.fill(ans,Integer.MAX_VALUE);
		 for(int a: arr){
			 if(a<ans[0]){
				 ans[1] = ans[0];
				 ans[0] = a;
			 }else if(a<ans[1]&&a!=ans[0]){
				 ans[1] = a;
			 }
		 }
		 System.out.println("The smallest digit is "+ans[0]);
		 System.out.println("The second smallest digit is "+ans[1]);
	 }
}