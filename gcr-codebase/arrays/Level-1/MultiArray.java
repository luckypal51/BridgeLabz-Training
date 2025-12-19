import java.util.*;
public class MultiArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int [][] arr = new int[col][row];
		
		for(int i =0;i<arr.length;i++){
			for(int j =0;j<arr[0].length;j++){
				arr[i][j] = sc.nextInt();
			}
		}
		int[] array = new int[row * col];
		int idx =0;
		for(int i =0;i<arr.length;i++){
			for(int j =0;j<arr[0].length;j++){
				array[idx++]=arr[i][j];
			}
		} 
		
		
		System.out.println(Arrays.toString(array));
		
	}
}