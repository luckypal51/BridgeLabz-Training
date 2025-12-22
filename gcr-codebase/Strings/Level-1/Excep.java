import java.util.*;
public class Excep{
	public static void main(String[] args){
	 try{
			stringMethod();
			
		}catch(NullPointerException e){
			System.out.println(e.toString());
		}
		
	
	}
	public static void stringMethod() throws NullPointerException{
		String s=null;
		char[] arr = s.toCharArray();
		
	}

	
}