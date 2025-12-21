import java.util.*;
public class Height{
	public static void main(String[] args){
		int [] height = new int[11];
		Random r = new Random();
		for(int i =0;i<11;i++){
			height[i]=r.nextInt(899)+100;
		}
		minHeight(height);
		maxHeight(height);
		mean(height);
	}
	public static void minHeight(int[] height){
		int min = height[0];
		for(int a: height){
			min = Math.min(min,a);
		}
		System.out.println("The shortest height is "+min);
	}
	public static void maxHeight(int[] height){
		int max = height[0];
		for(int a: height){
			max = Math.max(max,a);
		}
		System.out.println("The tallest height is "+max);
	}
	public static void mean(int[] height){
		int sum =0;
		for(int a: height){
			sum+=a;
		}
		System.out.println("The mean height is "+(sum/11));
	}
}