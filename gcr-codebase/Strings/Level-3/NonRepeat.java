import java.util.*;
public class NonRepeat{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		System.out.println("The first non repeating character is "+nonRepeat(s));
	}
	public static char nonRepeat(String s){
		char ch=' ';
		for(int i =0;i<s.length();i++){
			int count =0;
			for(int j=i;j<s.length();j++){
				if(s.charAt(i)==s.charAt(j)){
					count++;
				}
			}
			if(count==1){
				ch=s.charAt(i);
				break;
			}
		}
		return ch;
	}
}