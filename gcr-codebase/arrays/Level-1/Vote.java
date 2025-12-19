import java.util.*;
public class Vote{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[10];
		System.out.println("Enter 10 students age :");
		
		for( int i =0;i<10;i++){
			arr[i] = sc.nextInt();
		}
		
		for(int i =0;i<arr.length;i++){
			if(arr[i]<0){
				System.out.println("Age is not valid");
				continue;
			}
			if(arr[i]>=18){
				System.out.println("The student can vote his Age is "+arr[i]);
			}else{
				System.out.println("The student can not vote his Age is "+arr[i]);
			
			}
		}
	}
}