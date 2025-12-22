import java.util.*;
public class Lowercase{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(s+" converted to in manual way  "+toLower(s));
		System.out.println(s+" converted to in built in way  "+s.toLowerCase());
	}
	public static String toLower(String s){
		String str ="";
		for(int i =0;i<s.length();i++){
			if(s.charAt(i)==' '){
				str+=""+s.charAt(i);
			}else{
				int a = (int)s.charAt(i)-'A';
				char n = (char)(a+97);
				str+=""+n;
			}
		}
		return str;
	}
}