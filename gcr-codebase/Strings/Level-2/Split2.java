import java.util.*;
public class Split2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
	
     	String[][] manual= splitMethod(s);
		
		for(String[]a: manual){
			System.out.println(Arrays.toString(a));
		}
	}
	public static String[][] splitMethod(String s){
		int count =0;
		for(char a:s.toCharArray()){
			if(a==' '){
				count++;
			}
		}
		String[][] arr = new String[count+1][2];
		for(String[] a:arr){
			Arrays.fill(a,"");
		}
		int idx =0;
		int len = 0;
		for(char a:s.toCharArray()){
			if(a==' '){
				arr[idx][1]=Integer.toString(len);
				len=0;
				idx++;
			}else{
				arr[idx][0]+=""+a;
				len++;
			}
		}
		arr[idx][1]=Integer.toString(len);
		return arr;
		
	}
}