import java.util.*;
public class Vowels{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int [] arr = count(s);
		
		System.out.println("The number vowels are "+arr[0]);
		System.out.println("The number consonants are "+arr[1]);
		
	}
	public static int[] count(String s){
		String vowel ="aeiou";
		int [] arr = new int[2];
		for(char a : s.toCharArray()){
			if(Character.isAlphabetic(a)){
				if(vowel.contains(""+a)){
				arr[0]+=1;
			   }else{
				arr[1]+=1;
			   }  
			}
		}
		return arr;
	}
}