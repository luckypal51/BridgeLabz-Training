import java.util.*;
public class Split3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
     	String[] manual= splitMethod(s);
		System.out.println(Arrays.toString(manual));
		System.out.println("The maximun size word is "+max(manual));
		System.out.println("The minimun size word is "+min(manual));
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
	public static String max(String[] arr){
		String s =arr[0];
		for(int i =0;i<arr.length;i++){
			if(s.length()<arr[i].length()){
				s= arr[i];
			}
		}
		return s;
	}
	public static String min(String[] arr){
		String s =arr[0];
		for(int i =0;i<arr.length;i++){
			if(s.length()>arr[i].length()){
				s= arr[i];
			}
		}
		return s;
	}
}