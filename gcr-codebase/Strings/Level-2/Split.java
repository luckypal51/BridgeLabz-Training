import java.util.*;
public class Split{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
	
     	String[] manual= splitMethod(s);
		String[] built = s.split(" ");
		System.out.println("The split method manual "+Arrays.toString(manual));
		System.out.println("The split method built-in "+Arrays.toString(built));
	}
	public static String[] splitMethod(String s){
		int count =0;
		for(char a:s.toCharArray()){
			if(a==' '){
				count++;
			}
		}
		String[] arr = new String[count+1];
		Arrays.fill(arr,"");
		int idx =0;
		for(char a:s.toCharArray()){
			if(a==' '){
				idx++;
			}else{
				arr[idx]+=""+a;
			}
		}
		return arr;
	}
}