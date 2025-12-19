import java.util.*;
public class Reverse{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		int temp = n;
		int rev =0;
		while(temp!=0){
			rev++;
			temp/=10;
		}
		int [] arr = new int [rev];
		int i =0;
		while(i<rev){
			arr[i] = n%10;
			n/=10;
			i++;
		}
		
		System.out.println(Arrays.toString(arr));
	}
}