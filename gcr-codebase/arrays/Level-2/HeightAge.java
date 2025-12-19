import java.util.*;
public class HeightAge{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int [] age = new int[3];
		int [] height = new int[3];
		
		for( int i =0;i<3;i++){
			age[i] = sc.nextInt();
		}
		for( int i =0;i<3;i++){
			height[i] = sc.nextInt();
		}
		
		int maxHeight =height[0];
		int youngest = age[0];
		int idxh= 0;
		int idxa =0;
		
		for(int i =0;i<age.length;i++){
			if(youngest>age[i]){
				youngest= age[i];
				idxa =i;
			}
		}
		for(int i =0;i<height.length;i++){
			if(maxHeight<height[i]){
				maxHeight= height[i];
				idxh = i;
			}
		}
		if(idxa==0){
			System.out.println("The youngest friend is amar with age "+youngest);
		}else if(idxa==1){
			System.out.println("The youngest friend is akbar with age "+youngest);
		}else{
			System.out.println("The youngest friend is anthony with age "+youngest);
		}
		if(idxh==0){
			System.out.println("The Tallest friend is amar with height "+maxHeight);
		}else if(idxh==1){
			System.out.println("The Tallest friend is akbar with height "+maxHeight);
		}else{
			System.out.println("The Tallest friend is anthony with height "+maxHeight);
		}
	}
}