import java.util.*;
public class Duplicate{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		System.out.println("The new String is "+duplicate(s));
	}
	public static String duplicate(String s){
		String ans ="";
		for(char a: s.toCharArray()){
			if(!ans.contains(""+a)){
				ans+=""+a;
			}
		}
		return ans;
	}
}