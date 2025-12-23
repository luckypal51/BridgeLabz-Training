import java.util.*;
public class Longest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		System.out.println("The  longest string in the sentence is "+longest(s));
	}
	public static String longest(String s){
		String[] arr = s.split(" ");
		String str = arr[0];
		int max = arr[0].length();
		for(String a: arr){
			if(max<a.length()){
				max = a.length();
				str = a;
			}
		}
		return str;
	}
}