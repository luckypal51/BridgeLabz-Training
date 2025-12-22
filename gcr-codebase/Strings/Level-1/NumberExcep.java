import java.util.*;
public class NumberExcep{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		try{
			generator(s);
		}catch(Exception e){
			System.out.println(e);
		}
	}
	public static void generator(String s){
		int a = Integer.parseInt(s);
	}
}