import java.util.*;
public class Length{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(s+" the length by manual method "+len(s));
		System.out.println(s+" the length by built in method "+s.length());
		
	}
	public static int len(String s){
		int count =0;
		try{
		while(true){
			s.charAt(count++);
		}}catch(Exception e){
			
		}finally{
		return count-1;
		}
	}
	
}