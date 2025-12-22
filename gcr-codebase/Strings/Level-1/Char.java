import java.util.*;
public class Char{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println("The character extraction using built in method "+Arrays.toString(s.toCharArray()));
		extractChar(s);
	}
	public static void extractChar(String str){
		char [] arr = new char[str.length()];
		
		for(int i =0;i<str.length();i++){
			arr[i]= str.charAt(i);
		}
		System.out.println("The character extraction using manual method "+Arrays.toString(arr));
	}
}