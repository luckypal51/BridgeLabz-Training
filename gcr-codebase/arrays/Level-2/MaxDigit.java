import java.util.*;
public class MaxDigit{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long [] arr = new long[10];
		long [] dup;
		
		long temp = n;
		int idx =0;
		while(temp!=0){
			arr[idx]= temp%10;
			temp/=10;
			idx++;
			if(idx==arr.length-1){
				dup = arr;
				arr = new long[dup.length*2];
				for(int i =0;i<=idx;i++){
					arr[i] = dup[i];
				}
			}
		}
		long max = 0;
		long sec =0;
		for(int i =0;i<arr.length;i++){
			if(arr[i]>max){
				sec = max;
				max = arr[i];
			}
			else if(arr[i]>sec&&arr[i]!=max){
				sec = arr[i];
			}
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println("The Largest digit is "+max);
		System.out.println("The second Largest digit is "+sec);
		
	}
}