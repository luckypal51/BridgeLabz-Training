import java.util.*;
public class Factors{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int number =sc.nextInt();
		
		int [] arr = new int[10];
	    int [] temp;
		int i =1;
		int idx=0;
		while(i<=number){
			if(number%i==0){
				arr[idx++]=i;
			}
			if(idx==arr.length-1){
				temp = arr;
				arr = new int[temp.length*2];
				for(int j =0;j<=idx;j++){
					arr[j] = temp[j];
				}
			}
			i++;
		}
		System.out.println("The factors of "+number);
		for(int a: arr){
			if(a==0){
				break;
			}
			System.out.println(a);
		}
	}
}