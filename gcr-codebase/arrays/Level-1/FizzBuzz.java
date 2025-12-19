import java.util.*;
public class FizzBuzz{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		String [] arr = new String[number];
		
		for(int i =1;i<=number;i++){
			if(i%3==0&&i%5==0){
				arr[i-1]="FizzBuzz";
			}else if(i%3==0){
				arr[i-1]="Fizz";
			}else if(i%5==0){
				arr[i-1]="Buzz";
			}else{
				arr[i-1]=""+i;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}