import java.util.*;
public class Unique{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println("The unique charcters are "+Arrays.toString(check(s)));
	}
	public static char[] check(String s){
		int[] arr = new int[26];
		for(char a : s.toCharArray()){
			int n = (int)a;
			if(n>=65&&n<=91){
				arr[a-'A']+=1;
			}
			if(n>=97&&n<=123){
				arr[a-'a']+=1;
			}
		}
		return frequency(arr);
	}
	public static char[] frequency(int [] arr){
		int count =0;
		for(int i: arr){
			if(i==1){
				count++;
			}
		}
		int idx =0;
		char[] ch = new char[count];
		for(int i =0;i<arr.length;i++){
			if(arr[i]==1){
				ch[idx++]=(char)(i+65);
			}
		}
		return ch;
	}
}