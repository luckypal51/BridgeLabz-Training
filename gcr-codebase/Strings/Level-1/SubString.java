import java.util.*;
public class SubString{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int start = sc.nextInt();
		int end = sc.nextInt();
		String sub = s.substring(start,end);
		System.out.println("The substring by manual method : "+sub);
		System.out.println("The substring by built-in method : "+subString(s,start,end));
	}
	public static String subString(String str, int s,int e){
		String ans ="";
		for(int i=s;i<e;i++){
			ans+=str.charAt(i);
		}
		return ans;
	}
}