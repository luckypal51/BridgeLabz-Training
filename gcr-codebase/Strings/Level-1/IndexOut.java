import java.util.*;
public class IndexOut{
	public static void main(String[] args){
			try{
			stringMethod2();
		}catch(StringIndexOutOfBoundsException e){
			System.out.println(e.toString());
		}
	}
	public static void stringMethod2() throws StringIndexOutOfBoundsException{
		String s="lucky pal";
		int count =1;

		s = ""+s.charAt(s.length()+1);
		
	}
}