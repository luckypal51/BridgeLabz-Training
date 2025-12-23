import java.util.*;
public class Hash{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		System.out.println(Arrays.toString(frequency(s)));
	}
	public static String[] frequency(String s){
		int[] arr = new int[256];
		for(char a:s.toCharArray()){
			arr[a]+=1;
		}
		return convert(arr);
	}
	public static String[] convert(int[] arr){
		int count =0;
		for(int a:arr){
			if(a!=0){
				count++;
			}
		}
	   String[] str = new String[count*2];
	   count =0;
	   for(int i =0;i<arr.length;i++){
		   
		   if(arr[i]!=0){
				char ch = (char)(i);
				str[count]= ""+ch;
				str[count+1]=Integer.toString(arr[i]);
				count+=2;
			}
	   }
	   return str;
	}
}