import java.util.*;
public class NumberCheck3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int size = count(n);
        int[] arr = store(n,size);
		int [] rev = reverse(arr);
        System.out.println("The number of digit is "+size);
        System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(rev));
		compare(arr,rev);
		if(duck(arr)){
			System.out.println("The number is duck number ");
		}else{
				System.out.println("The number is not duck number ");
		}
		if(palindrome(n)){
			System.out.println("The number is Palindromic number ");
		}else{
				System.out.println("The number is not Palindromic number ");
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
	public static boolean duck(int [] arr){
		for(int a:arr){
			if(a==0){
				return false;
			}
		}
		return true;
	}
	public static int[] reverse(int [] arr){
		int [] rev = new int[arr.length];
		int len = arr.length-1;
		for(int a:arr){
			rev[len--] = a;
		}
		return rev;
	}
	public static void compare(int [] arr, int[] rev){
		 System.out.println("arr equals to rev: " +Arrays.equals(arr, rev));
	}
	public static boolean palindrome(int n){
		int rev =0;
		int temp = n;
		while(temp!=0){
			rev=(rev*10)+(temp%10);
			temp/=10;
		}
		return n==rev?true:false;
	}
}