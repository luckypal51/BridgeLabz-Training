import java.util.*;
public class Illegal{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		try{
			illegal(s);
		}catch(IllegalArgumentException e){
			System.out.println(e);
		}
	}
	public static void illegal(String s){
		 subString(s.length()-2,0);
	}
	public static void subString(int start,int end){
		if(end<start){
			throw new IllegalArgumentException();
		}
	}
}