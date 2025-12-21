import java.util.*;
public class NumberCheck2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int size = count(n);
        int[] arr = store(n,size);
        System.out.println("The number of digit is "+size);
        System.out.println(Arrays.toString(arr));
		System.out.println("The sum of digit is "+sumDigit(arr));
        System.out.println("The sum of square of digit is "+square(arr));
        if(harshad(n,sumDigit(arr))){
			System.out.println("The number is Harshad number");
		}else{
				System.out.println("The number is not Harshad number");
		}	
		frequency(arr);
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
	public static int sumDigit(int [] arr){
		int sum =0;
		for(int a: arr){
			sum+=a;
		}
		return sum;
	}
	public static int square(int [] arr){
		int sum =0;
		for(int a:arr){
			sum+=Math.pow(a,2);
		}
		return sum;
	}
	
	public static boolean harshad(int n, int sum){
		return n%sum==0?true:false;
	}
	
	public static void frequency(int [] arr){
		int [] has = new int[10];
		for(int i =0;i<arr.length;i++){
			has[arr[i]]+=1;
		}
		int [][] ans = new int[arr.length][2];
		int idx =0;
		for(int i =0;i<10;i++){
             if(has[i]!=0){
			ans[idx][0] = i;
            ans[idx][1] = has[i];	
            idx++;			
			 }
		}
		for(int [] a: ans){
			System.out.println("The digit is "+a[0]+" Frequency is "+a[1]);
		}
	}
}