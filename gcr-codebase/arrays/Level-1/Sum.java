import java.util.*;
public class Sum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int sum =0;
		int idx =0;
		int [] arr = new int[10];
		while(true){
		    int n = sc.nextInt();
			if(n<=0){
				break;
			}else{
				sum+=n;
				arr[idx] = n;
			}
			idx++;
			 if(idx == arr.length){
				break;
			}
		}
	
		for(int a : arr){
			if(a<=0){
				break;
			}
			System.out.println(a);
		}
		
		System.out.println("The sum of the elements is : "+ sum);
	}
}