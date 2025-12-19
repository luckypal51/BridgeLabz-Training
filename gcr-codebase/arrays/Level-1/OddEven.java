import java.util.*;
public class OddEven{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		int [] odd = new int [(number/2)+1];
		int [] even = new int [(number/2)+1];
		int oddidx=0;
		int evenidx =0;
		for(int i =1;i<=number;i++){
			if(i%2==0){
				even[evenidx++] = i;
			}else{
				odd[oddidx++]=i;
			}
		}
		 
		for( int i =0;i<odd.length;i++){
			System.out.println(" the number is odd "+ odd[i]);
		}
		for( int i =0;i<even.length;i++){
			System.out.println(" the number is even  "+ even[i]);
		}
	}
}