import java.util.*;
public class Reverse{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		System.out.println("The reverse string is : "+reverse(s));
	}
	public static String reverse(String s){
		StringBuilder str = new StringBuilder();
		for(int i =s.length()-1;i>=0;i--){
			str.append(s.charAt(i));
		}
		return str.toString();
	}
}